import numpy as np
import gym

# Initialize the environment
env = gym.make('FrozenLake-v1')

# Initialize Q-table with zeros
Q = np.zeros([env.observation_space.n, env.action_space.n])

# Set learning parameters
lr = .8
y = .95
num_episodes = 2000

# List to keep track of total rewards
rList = []

for i in range(num_episodes):
    # Reset environment and get first new observation
    s = env.reset()[0]
    rAll = 0
    d = False
    j = 0
    # The Q-Table learning algorithm
    while j < 99:
        j += 1
        # Choose an action by greedily (with noise) picking from Q table
        a = np.argmax(Q[int(s),:] + np.random.randn(1,env.action_space.n)*(1./(i+1)))
        # Get new state and reward from environment
        s1,r,d,*info = env.step(a)
        if type(s1) is not int:
            s = s1[0]
        # Update Q-Table with new knowledge
        Q[s,a] = Q[s,a] + lr*(r + y*np.max(Q[s1,:]) - Q[s,a])
        rAll += r
        s = s1
        if d == True:
            break
    rList.append(rAll)

print("Score over time: " + str(sum(rList)/num_episodes))
print("Final Q-Table Values")
print(Q)
