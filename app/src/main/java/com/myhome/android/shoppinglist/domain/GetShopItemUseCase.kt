package com.myhome.android.shoppinglist.domain

class GetShopItemUseCase(private val repo: ShopListRepository) {

    suspend fun getShopItem(shopItemId: Int): ShopItem {
        return repo.getShopItem(shopItemId)
    }
}