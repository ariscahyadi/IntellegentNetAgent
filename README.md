# IntellegentNetAgent (Intellegent Networking Agent)
by Aris C. Risdianto - [aris.risdianto@gmail.com] (mailto:aris.risdianto@gmail.com)

## Introduction

This tool is part of my project for solving current networking path selection which always based on the cost of the links or available bandwidth between nodes, without considering passive information or parameters such as logs or alarms from respective nodes. This tool will receive event from networking node, weighting/scoring the events, decide the node state, filtering the events based on the node state, and send the filtered events including node state and event weight/score for path selection.

## Design

In order to deign the intellegent networking agent, some solution approaches or methodologies have been identified. 

1. Event-driven Finite State Machine, for describing the node states and transition between the states based on the received event from network node
2. Event or Log Parsing and Classification, for searching the special “key” from event that may lead to the specific node state transitions

## Implementation

In order to implement the proposed solutions, the detail software or framework are selected :

1. Text-based log file for “trained” networking node events which used for current implementation testing and verification
2. [Apache Mina] (https://mina.apache.org/): Java-based State and Transition implementation is used to define and store the finite state machine information such as states, transition, and actions
3. String-based Parsing and Filtering for search special event from the event logs and decide the state transition of the network node.

## Verification

Intelligent networking agent will report to the agent manager by adding the agent ID and name, and the state of the network node. And also the agent will filter unnecessary event log, for example when the agent already in the “ADJ” state, ant event related with adjacency/neighbor problem will be dropped/ignored.

