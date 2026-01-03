
SUMMARY = "ADMT4000 Linux Application"
DESCRIPTION = "building admt4000-linux-app"
HOMEPAGE = "https://gitee.com/bigstep/admt4000-linux-app"
LICENSE = "CLOSED"

SRC_URI = "git://gitee.com/bigstep/admt4000-linux-app.git;protocol=ssh;user=git;branch=master"
SRCREV = "3aec93b27faf08bd846c7e9a1749584916d0ba87"

S = "${WORKDIR}/git"

inherit cmake
