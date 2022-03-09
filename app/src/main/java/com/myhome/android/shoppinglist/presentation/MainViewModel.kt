package com.myhome.android.shoppinglist.presentation

import androidx.lifecycle.ViewModel
import com.myhome.android.shoppinglist.data.ShopListRepositoryImpl
import com.myhome.android.shoppinglist.domain.DeleteShopItemUseCase
import com.myhome.android.shoppinglist.domain.EditShopItemUseCase
import com.myhome.android.shoppinglist.domain.GetShopListUseCase
import com.myhome.android.shoppinglist.domain.ShopItem

class MainViewModel : ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun editShopItem(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}