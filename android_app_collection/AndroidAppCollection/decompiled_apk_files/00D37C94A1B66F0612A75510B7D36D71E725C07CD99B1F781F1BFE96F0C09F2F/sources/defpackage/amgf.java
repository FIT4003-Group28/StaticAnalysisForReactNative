package defpackage;

import android.content.Context;
import android.net.wifi.WifiManager;
/* compiled from: PG */
/* renamed from: amgf  reason: default package */
/* loaded from: classes.dex */
public final class amgf implements axou {
    private final azqb a;

    public amgf(azqb azqbVar) {
        this.a = azqbVar;
    }

    public static WifiManager b(Context context) {
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        axzl.o(wifiManager);
        return wifiManager;
    }

    public static amgf c(azqb azqbVar) {
        return new amgf(azqbVar);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final WifiManager get() {
        return b((Context) ((axov) this.a).a);
    }
}
