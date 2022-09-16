package defpackage;

import android.content.Context;
import android.net.wifi.WifiManager;
/* compiled from: PG */
/* renamed from: mwx  reason: default package */
/* loaded from: classes3.dex */
public final class mwx {
    public boolean a;

    public mwx() {
        this.a = false;
    }

    public mwx(Context context) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }
}
