package com.myhome.android.shoppinglist.domain

class DeleteShopItemUseCase(private val repo: ShopListRepository) {

    suspend fun deleteShopItem(shopItem: ShopItem) {
        repo.deleteShopItem(shopItem)
    }
}