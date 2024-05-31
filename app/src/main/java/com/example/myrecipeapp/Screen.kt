package com.example.myrecipeapp

sealed class Screen(val route : String) {
    // sealed class는 런타임이 아니라 컴파일할 때 일치하는 잘형으로 제한하여 자료형의 안전성을 보장
    // 클래스 계층 구조에서 특정 클래스의 하위 클래스들을 미리 제한하고 명시할 수 있어,
    // 코드의 가독성 및 안정성을 높이는 데 도움이 됩니다. sealed class는 특히 상태를 나타내는 객체들을 관리하거나, 복잡한 조건문을 대체하는 데 유용합니다.

    object RecipeScreen : Screen("recipescreen")
    object DetailScreen : Screen("detailscreen")

}