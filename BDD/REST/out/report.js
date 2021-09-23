$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("fruit_list.feature");
formatter.feature({
  "line": 1,
  "name": "Fruit list",
  "description": "\nTo make a great smoothie, I need some fruit",
  "id": "fruit-list",
  "keyword": "Feature"
});
formatter.before({
  "duration": 345791,
  "status": "passed"
});
formatter.before({
  "duration": 398870684,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "List fruit",
  "description": "",
  "id": "fruit-list;list-fruit",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "the system knows about the following fruit:",
  "rows": [
    {
      "cells": [
        "name",
        "color"
      ],
      "line": 7
    },
    {
      "cells": [
        "banana",
        "yellow"
      ],
      "line": 8
    },
    {
      "cells": [
        "strawberry",
        "red"
      ],
      "line": 9
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "the client requests GET /fruits",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the response should be JSON:",
  "keyword": "Then ",
  "doc_string": {
    "content_type": "",
    "line": 12,
    "value": "[\n  {\"name\": \"banana\", \"color\": \"yellow\"},\n  {\"name\": \"strawberry\", \"color\": \"red\"}\n]"
  }
});
formatter.match({
  "location": "FruitSteps.theSystemKnowsAboutTheFollowingFruit(Fruit\u003e)"
});
formatter.result({
  "duration": 332428034,
  "status": "passed"
});
formatter.match({
  "location": "RestSteps.theClientRequestsGETFruits()"
});
formatter.result({
  "duration": 1242698436,
  "status": "passed"
});
formatter.match({
  "location": "RestSteps.theResponseShouldBeJSON(String)"
});
formatter.result({
  "duration": 5124178,
  "status": "passed"
});
formatter.after({
  "duration": 10080870,
  "status": "passed"
});
});