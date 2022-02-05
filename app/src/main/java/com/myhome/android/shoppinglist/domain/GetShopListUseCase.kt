package com.myhome.android.shoppinglist.domain

import androidx.lifecycle.LiveData

class GetShopListUseCase(private val repo: ShopListRepository) {

    fun getShopList(): LiveData<List<ShopItem>> {
        return repo.getShopList()
    }
}