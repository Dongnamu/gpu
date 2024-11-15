
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderOrderManager from "./components/listers/OrderOrderCards"
import OrderOrderDetail from "./components/listers/OrderOrderDetail"

import AllocateAllocateManager from "./components/listers/AllocateAllocateCards"
import AllocateAllocateDetail from "./components/listers/AllocateAllocateDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders/orders',
                name: 'OrderOrderManager',
                component: OrderOrderManager
            },
            {
                path: '/orders/orders/:id',
                name: 'OrderOrderDetail',
                component: OrderOrderDetail
            },

            {
                path: '/allocates/allocates',
                name: 'AllocateAllocateManager',
                component: AllocateAllocateManager
            },
            {
                path: '/allocates/allocates/:id',
                name: 'AllocateAllocateDetail',
                component: AllocateAllocateDetail
            },



    ]
})
