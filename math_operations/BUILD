load("@rules_java//java:defs.bzl", "java_binary", "java_test")

package(default_visibility = ["//visibility:public"])

java_binary(
    name = "MathOperations",
    srcs = glob(["src/main/java/com/example/*.java"]),
)

java_test(
    name = "MathOperationsTest",
    srcs = glob(["src/test/java/com/example/MathOperationsTest.java"]),
)
