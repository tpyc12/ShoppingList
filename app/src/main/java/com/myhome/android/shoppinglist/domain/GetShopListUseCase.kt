package com.myhome.android.shoppinglist.domain

class GetShopListUseCase(private val repo: ShopListRepository) {

    fun getShopList(): List<ShopItem>{
        return repo.getShopList()
    }
}