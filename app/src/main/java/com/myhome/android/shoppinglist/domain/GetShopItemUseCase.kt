package com.myhome.android.shoppinglist.domain

class GetShopItemUseCase(private val repo: ShopListRepository) {

    fun getShopItem(shopItemId: Int): ShopItem {
        return repo.getShopItem(shopItemId)
    }
}