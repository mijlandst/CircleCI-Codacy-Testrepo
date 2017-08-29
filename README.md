# CircleCI-Codacy-Testrepo
Documentation of my experience in using CirleCI and Coveralls together

## CirleCI

Setup for CircleCI was very simple. I simply clicked through the registration process and was immediately able to look at the CircleCI dashboard it even automatically gave me access to private CI-registered repositories in organizations I'm part of. When I added tests CircleCI did not immediately recognize them.

I looked at [the CircleCI 1.0 documentation](https://circleci.com/docs/1.0/configuration/) to get a feel for configuring CircleCI. There was not a lot to be configured, but it's good for future reference.

## Codacy

Codacy is a bit more complicated in the way the coverage can be arranged. It is done by running a receiver program. The recommended report generation tool is [JaCoCo](http://www.eclemma.org/jacoco/index.html).

The problem is that they use their own program to upload coverage reports. That means integration is bad and that it's difficult to integrate with CircleCI.

For more info: https://github.com/codacy/codacy-coverage-reporter#setup

### JaCoCo

The POM has been updated and works with JaCoCo.
