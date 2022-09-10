package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: gkt  reason: default package */
/* loaded from: classes6.dex */
public final class gkt {
    public static final long a = TimeUnit.SECONDS.toMillis(30);
    public static final long b = TimeUnit.SECONDS.toMillis(8);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static gks a(btpc btpcVar, boolean z) {
        if (!btpcVar.i()) {
            return gks.NO_NETWORK;
        }
        if (!z) {
            if (btpcVar.e()) {
                return gks.WIFI;
            }
            if (btpcVar.g()) {
                return gks.MOBILE_4G;
            }
            if (btpcVar.f()) {
                return gks.MOBILE_3G;
            }
            return gks.MOBILE_2G;
        } else if (btpcVar.e()) {
            return gks.WIFI_RASTER;
        } else {
            if (btpcVar.g()) {
                return gks.MOBILE_4G_RASTER;
            }
            if (btpcVar.f()) {
                return gks.MOBILE_3G_RASTER;
            }
            return gks.MOBILE_2G_RASTER;
        }
    }
}
