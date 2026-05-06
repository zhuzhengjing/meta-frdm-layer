FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://wireplumber.conf.d/50-alsa-multi-device.conf \
"

SYSTEMD_SERVICE:${PN} += " \
    wireplumber.service \
"

SYSTEMD_AUTO_ENABLE:${PN} = "enable"

do_install:append () {
    install -d ${D}${datadir}/wireplumber/wireplumber.conf.d
    install -m 0644 ${UNPACKDIR}/wireplumber.conf.d/50-alsa-multi-device.conf \
        ${D}${datadir}/wireplumber/wireplumber.conf.d/50-alsa-multi-device.conf
}

FILES:${PN} += "${datadir}/wireplumber/wireplumber.conf.d"
