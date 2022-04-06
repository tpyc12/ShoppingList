package com.myhome.android.shoppinglist.domain

class EditShopItemUseCase(private val repo: ShopListRepository) {

    suspend fun editShopItem(shopItem: ShopItem) {
        repo.editShopItem(shopItem)
    }
}