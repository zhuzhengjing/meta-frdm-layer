SUMMARY = "i.MX93 FRDM Python Application Service"
DESCRIPTION = "FRDM Python application that runs as a systemd service."
LICENSE = "CLOSED"

SRC_URI = "git://git@github.com/zhuzhengjing/frdm-app.git;protocol=ssh;branch=main \
           file://frdm-app.service \
           file://my-echo-cancel.conf \
        "
SRCREV = "5b0c255515b1122264a384b1682272d4cdb51cf9"

S = "${WORKDIR}/git"

RDEPENDS:${PN} = " python3-pygobject"

do_install() {
    # delete unnecessary files and folders
    rm -rf ${S}/docs ${S}/script

    # /usr/share/frdm-app
    install -d ${D}${datadir}/${PN}
    cp -r ${S}/* ${D}${datadir}/${PN}/

    # systemd service
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${UNPACKDIR}/${PN}.service ${D}${systemd_system_unitdir}/${PN}.service

    # my-echo-cancel.conf
    install -d ${D}${sysconfdir}/pipewire/pipewire.conf.d
    install -m 0644 ${UNPACKDIR}/my-echo-cancel.conf ${D}${sysconfdir}/pipewire/pipewire.conf.d
}

inherit systemd

SYSTEMD_SERVICE:${PN} = "${PN}.service"
SYSTEMD_AUTO_ENABLE:${PN} = "enable"
