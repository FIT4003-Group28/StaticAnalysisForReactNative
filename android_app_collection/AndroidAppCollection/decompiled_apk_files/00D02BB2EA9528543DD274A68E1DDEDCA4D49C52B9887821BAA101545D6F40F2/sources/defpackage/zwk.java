package defpackage;

import android.content.Context;
import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: zwk  reason: default package */
/* loaded from: classes7.dex */
final class zwk implements cpve<zwg, Integer> {
    final /* synthetic */ Context a;

    public zwk(Context context) {
        this.a = context;
    }

    @Override // defpackage.cpve
    public final /* bridge */ /* synthetic */ Integer a(zwg zwgVar, int i, cpvi<zwg, ?> cpviVar) {
        Resources resources;
        dpej dpejVar;
        int f;
        boolean booleanValue = iva.a().booleanValue();
        int a = dpfl.a(zwgVar.b.c);
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 2) {
            resources = this.a.getResources();
            dpejVar = dpej.DELAY_HEAVY;
        } else if (i2 == 3) {
            resources = this.a.getResources();
            dpejVar = dpej.DELAY_MEDIUM;
        } else if (i2 != 4) {
            f = ibm.i().b(this.a);
            return Integer.valueOf(f);
        } else {
            resources = this.a.getResources();
            dpejVar = dpej.DELAY_LIGHT;
        }
        f = kc.f(vyb.h(resources, dpejVar, booleanValue), 153);
        return Integer.valueOf(f);
    }
}
