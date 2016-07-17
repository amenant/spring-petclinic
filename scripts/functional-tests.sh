#!/bin/bash

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

export PATH=$DIR/../node_modules/grunt-cli/bin:$DIR/../node:$DIR/../node_modules/protractor/bin:$PATH

# grunt --gruntfile="$DIR/../Gruntfile.js" functional-test
protractor "$DIR/../src/test/resources/protractor.conf.js"
