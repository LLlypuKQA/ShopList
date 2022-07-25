package com.example.shoplist.domain

interface ShopListRepository {

    fun addShopItem(ShopItem: ShopItem){

    }

    fun deleteShopItem(shopItem: ShopItem){

    }

    fun editShopItem(shopItem: ShopItem){

    }

    fun getShopItem(shopItemId: Int): ShopItem{
        TODO()
    }

    fun getShopList(): List<ShopItem>{
        TODO()
    }

}