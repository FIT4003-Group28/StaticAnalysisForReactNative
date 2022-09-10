package defpackage;

import android.graphics.Point;
/* compiled from: PG */
/* renamed from: bgei  reason: default package */
/* loaded from: classes3.dex */
public final class bgei {
    public final dhjx a;
    public final int b;
    public final Point c;

    public bgei(dhjx dhjxVar, int i, Point point) {
        this.a = dhjxVar;
        this.b = i;
        this.c = point;
    }

    public static bgei a(akox akoxVar, dhjx dhjxVar) {
        bvrj.UI_THREAD.c();
        akzh k = akoxVar.k();
        int i = 12;
        if (k != null && dhjxVar != null) {
            dhjz dhjzVar = dhjxVar.b;
            if (dhjzVar == null) {
                dhjzVar = dhjz.e;
            }
            i = Math.round(akyx.b(k, (float) dhjzVar.d));
        }
        return new bgei(dhjxVar, i, akoxVar.o);
    }
}
