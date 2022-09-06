package com.permissionx.yanlldemo

import androidx.fragment.app.FragmentActivity

object PermissionX {
    private const val TAG="InvisibleFragment"
    fun request(activity: FragmentActivity,vararg permissions:String,callback: PermissionCallback){
        val fragmentManager =activity.supportFragmentManager
        val exitedFragment=fragmentManager.findFragmentByTag(TAG)
        val fragment = if (exitedFragment!=null){
            exitedFragment as InvisibleFragment
        }else{
            val invisibleFragment=InvisibleFragment()
            fragmentManager.beginTransaction().add(invisibleFragment, TAG).commitNow()
            invisibleFragment
        }
        fragment.requestNow(callback,*permissions)
    }
}