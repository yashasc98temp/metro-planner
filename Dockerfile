FROM openjdk:17
EXPOSE 12001
ADD target/metro-planner-1.0.jarmetro-planner-1.0.jar
ENTRYPOINT ["java", "-jar", "/metro-planner-1.0.jar"]