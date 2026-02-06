# FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# # 覆盖默认的 lv_conf.h
# SRC_URI += "file://lv_conf.h"

# DEPENDS:append = " libdrm"
# LDFLAGS:append = " -ldrm"

# do_compile:prepend() {
#     if [ -f "${UNPACKDIR}/lv_conf.h" ]; then
#         cp -f ${UNPACKDIR}/lv_conf.h ${S}/lv_conf.h
#         bbnote "Copied custom lv_conf.h from UNPACKDIR"
#     elif [ -f "${WORKDIR}/lv_conf.h" ]; then
#         cp -f ${WORKDIR}/lv_conf.h ${S}/lv_conf.h
#         bbnote "Copied custom lv_conf.h from WORKDIR"
#     else
#         bbfatal "lv_conf.h not found"
#     fi
# }
