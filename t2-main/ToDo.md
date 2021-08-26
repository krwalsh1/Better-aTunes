# Need to Do:
## General
- [ ] Get cloned and running on everyone's machines
- [ ] Get Randoop, a control flow graph generator plugin, and plugin for mutation coverage downloaded on all machines


## Unit Testing
- [ ] Decide on goal level for testing coverage
- [ ] Get framework (files and plugins installed) to write tests for the java files
- [ ] For Each File of Core Functionality:
- [ ]   Symbolic Execution to find Control Flow paths of file
- [ ]   Control Flow Graph Generated from tool
- [ ]   Verify Control Flow Graph with Symbolic Execution paths (Should be the same, discuss if not)
- [ ]   Prime Path Coverage List for each graph (Use textbook website to generate)
- [ ]   Test file 4 Unit Test Suite for this file
- [ ]   Input Space Partitioning for this file
- [ ]   Tests Written to achieve prime path coverage
- [ ]   OR, explanation of why some / all of these are not necessary / appropriate in the scheme of this project


## Performance Testing
- [ ] Still no idea for what we can do with this, maybe think of something?

## System Testing
- [ ] Use cases and test cases for test suite to run entire repo on to test these? 
- [ ] Decide on plugin for Eclipse and IntelliJ to use to test mutation kill level
- [ ] Get framework for that setup 
- [ ] 80% goal for mutation kill coverage
- [ ] Create more tests to kill mutations if they are not found
