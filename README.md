# PermissionX
一个权限申请的工具类，只是单独的申请权限，没有其他的判断逻辑，返回的参数只有同意全部权限或则通过一个集合返回未同意的权限
```
PermissionX.request(this, Manifest.permission.CALL_PHONE) { allGranted, deniedList ->
                if (allGranted) {
                    call()
                } else {
                    Toast.makeText(this, "you denied $deniedList", Toast.LENGTH_SHORT).show()
                }
            }
```
