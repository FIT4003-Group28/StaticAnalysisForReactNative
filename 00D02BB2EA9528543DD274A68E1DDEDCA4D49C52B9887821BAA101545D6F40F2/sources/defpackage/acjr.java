package defpackage;
/* compiled from: PG */
/* renamed from: acjr  reason: default package */
/* loaded from: classes2.dex */
public final class acjr {
    public static final acjw a(acjz acjzVar) {
        acke ackeVar;
        dzvx.c(acjzVar, "$this$toGmmGeofence");
        acjv bZ = acjw.m.bZ();
        dpum dpumVar = acjzVar.d;
        if (dpumVar == null) {
            dpumVar = dpum.d;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        acjw acjwVar = (acjw) bZ.b;
        dpumVar.getClass();
        acjwVar.d = dpumVar;
        int i = 1;
        int i2 = acjwVar.a | 1;
        acjwVar.a = i2;
        float f = acjzVar.e;
        int i3 = i2 | 2;
        acjwVar.a = i3;
        acjwVar.e = f;
        long j = acjzVar.h;
        int i4 = i3 | 4;
        acjwVar.a = i4;
        acjwVar.h = j;
        int i5 = acjzVar.i;
        int i6 = i4 | 8;
        acjwVar.a = i6;
        acjwVar.i = i5;
        int i7 = acjzVar.j;
        acjwVar.a = i6 | 16;
        acjwVar.j = i7;
        int a = acjt.a(acjzVar.k);
        if (a == 0) {
            a = 1;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        acjw acjwVar2 = (acjw) bZ.b;
        acjwVar2.k = a - 1;
        int i8 = acjwVar2.a | 32;
        acjwVar2.a = i8;
        String str = acjzVar.l;
        str.getClass();
        acjwVar2.a = i8 | 128;
        acjwVar2.l = str;
        bZ.a(new dsrh(acjzVar.f, acjz.g));
        int i9 = acjzVar.b;
        if (i9 == 0) {
            i = 2;
        } else if (i9 != 9) {
            i = 0;
        }
        if (i != 0) {
            if (i - 1 == 0) {
                if (i9 == 9) {
                    ackeVar = (acke) acjzVar.c;
                } else {
                    ackeVar = acke.c;
                }
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                acjw acjwVar3 = (acjw) bZ.b;
                ackeVar.getClass();
                acjwVar3.c = ackeVar;
                acjwVar3.b = 8;
            } else {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                acjw acjwVar4 = (acjw) bZ.b;
                acjwVar4.b = 0;
                acjwVar4.c = null;
            }
        }
        acjw bK = bZ.bK();
        dzvx.b(bK, "builder.build()");
        return bK;
    }
}
