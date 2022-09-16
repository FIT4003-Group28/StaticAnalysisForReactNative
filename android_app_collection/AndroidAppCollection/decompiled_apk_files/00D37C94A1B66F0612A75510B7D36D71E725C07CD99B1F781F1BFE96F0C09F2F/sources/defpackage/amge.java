package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
/* compiled from: PG */
/* renamed from: amge  reason: default package */
/* loaded from: classes.dex */
public final class amge implements axou {
    private final azqb a;

    public amge(azqb azqbVar) {
        this.a = azqbVar;
    }

    public static TelephonyManager b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        axzl.o(telephonyManager);
        return telephonyManager;
    }

    public static amge c(azqb azqbVar) {
        return new amge(azqbVar);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final TelephonyManager get() {
        return b((Context) ((axov) this.a).a);
    }
}
