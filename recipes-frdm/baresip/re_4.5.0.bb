
SUMMARY = "Libre - A portable and generic library for real-time communications"
HOMEPAGE = "https://github.com/baresip/re"
LICENSE = "CLOSED"

SRC_URI = "git://github.com/baresip/re.git;protocol=https;branch=main"
# v4.5.0 - 2026-02-27
SRCREV = "67bebeb7db6c575b098b82242c733c6f245ff64c"

S = "${WORKDIR}/git"

DEPENDS = "openssl alsa-lib zlib pipewire"

inherit cmake pkgconfig

EXTRA_OECMAKE = "-DCMAKE_BUILD_TYPE=Release"
