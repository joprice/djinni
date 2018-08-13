
cc_library(
    name = "common",
    hdrs = [
        "proxy_cache_impl.hpp",
        "proxy_cache_interface.hpp"
    ]
)

objc_library(
    name = "objc",
    hdrs = [
        "objc/DJICppWrapperCache+Private.h",
        "objc/DJIError.h",
        "objc/DJIMarshal+Private.h",
        "objc/DJIObjcWrapperCache+Private.h"
    ],
    srcs = [
      "objc/DJIError.mm",
      "objc/DJIProxyCaches.mm"
    ],
    visibility = [
      '//visibility:public',
    ],
    deps = ["common"]
)

