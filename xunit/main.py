#!/usr/bin/python3
from TestCaseTest import TestCaseTest
from TestSuite import TestSuite
from TestResult import TestResult

if __name__ == "__main__":
    suite=TestSuite()
    suite.add(TestCaseTest("testTemplateMethod"))
    suite.add(TestCaseTest("testResult"))
    suite.add(TestCaseTest("testFailedResult"))
    suite.add(TestCaseTest("testFailedResultFormatting"))
    suite.add(TestCaseTest("testSuite"))
    result = TestResult()
    suite.run(result)
    print(result.summary())
