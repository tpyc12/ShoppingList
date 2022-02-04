package com.myhome.android.shoppinglist.domain

class AddShopItemUseCase(private val repo: ShopListRepository) {

    fun addShopItem(shopItem: ShopItem) {
        repo.addShopItem(shopItem)
    }
}