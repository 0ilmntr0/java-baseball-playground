/*
테스트 코드를 왜 쓰는가.
내가 작성한 메서드 검사하려고 System.out.pring(add(1,2));
이런거 하나하나 넣고 지우고 안해도 되도록
테스트 코드에 적으면 간편하게 검사할 수 있다.
-> 단위테스트 (Unit Test)라고 한다

==================================================
&&&StringTest의 replace() 실행시 결과&&&
==================================================
> Task :compileJava NO-SOURCE
> Task :processResources NO-SOURCE
> Task :classes UP-TO-DATE
> Task :compileTestJava
> Task :processTestResources NO-SOURCE
> Task :testClasses
> Task :test
1월 05, 2025 11:24:45 오후 org.junit.platform.launcher.core.EngineDiscoveryOrchestrator lambda$logTestDescriptorExclusionReasons$7
정보: 0 containers and 4 tests were Method or class mismatch
BUILD SUCCESSFUL in 7s
2 actionable tasks: 2 executed
오후 11:24:46: Execution finished ':test --tests "study.StringTest.splitTest"'.
==================================================




==================================================
&&&각 테스트 결과의 의미&&&
==================================================
> Task :compileJava NO-SOURCE
> Task :processResources NO-SOURCE
> Task :classes UP-TO-DATE
==================================================
compileJava NO-SOURCE

src/main/java 디렉토리에 소스 파일이 없어서 Java 컴파일 작업이 건너뛰어졌습니다.
이는 정상적인 상황입니다. 테스트 실행만 했으므로, 메인 소스 코드 컴파일은 필요하지 않았던 것입니다.
processResources NO-SOURCE

src/main/resources 디렉토리에 리소스 파일이 없어서 이 작업도 건너뛰어졌습니다.
classes UP-TO-DATE

Gradle이 확인한 결과, 컴파일된 클래스 파일이 변경되지 않았기 때문에 추가 작업 없이 재사용되었습니다.
==================================================


==================================================
> Task :compileTestJava
> Task :processTestResources NO-SOURCE
> Task :testClasses
> Task :test
==================================================
compileTestJava

src/test/java 디렉토리에 있는 테스트 소스 코드를 컴파일한 작업입니다.
테스트 코드를 정상적으로 컴파일했습니다.
processTestResources NO-SOURCE

src/test/resources 디렉토리에 리소스 파일이 없어서 이 작업이 건너뛰어졌습니다.
testClasses

테스트 컴파일 결과로 생성된 클래스 파일이 준비되었음을 나타냅니다.
test

실제 테스트를 실행한 작업입니다.
==================================================


==================================================
1월 05, 2025 11:24:45 오후 org.junit.platform.launcher.core.EngineDiscoveryOrchestrator lambda$logTestDescriptorExclusionReasons$7
정보: 0 containers and 4 tests were Method or class mismatch
==================================================
정보: 0 containers and 4 tests were Method or class mismatch
Gradle이 실행하려고 한 테스트 중 일부가 "Method or class mismatch"로 인해 실행되지 않았음을 나타냅니다.
원인: 명령어에서 특정 테스트 메서드(splitTest)만 실행하도록 지정했기 때문입니다. 다른 메서드(replace, substringTest 등)는 실행되지 않았습니다.
이 메시지는 단순한 정보이며, 문제가 발생한 것은 아닙니다.
==================================================


==================================================
BUILD SUCCESSFUL in 7s
==================================================
모든 작업(테스트 실행 포함)이 성공적으로 완료되었음을 나타냅니다.
실패한 테스트가 없었고, Gradle 작업도 문제없이 수행되었습니다.
==================================================


==================================================
2 actionable tasks: 2 executed
==================================================
Gradle 작업 중 실제로 실행된 작업은 2개입니다:
compileTestJava
test
==================================================


==================================================
Execution finished ':test --tests "study.StringTest.splitTest"'.
==================================================
Gradle이 study.StringTest.splitTest라는 특정 테스트 메서드만 실행하도록 명령을 받았음을 나타냅니다.
다른 테스트 메서드는 실행되지 않았습니다.
==================================================
*/