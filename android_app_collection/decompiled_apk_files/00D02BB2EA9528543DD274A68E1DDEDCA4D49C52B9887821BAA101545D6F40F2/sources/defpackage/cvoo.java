package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: cvoo  reason: default package */
/* loaded from: classes5.dex */
public abstract class cvoo {
    public abstract String a();

    public abstract String b();

    public abstract int c();

    public final drtv d() {
        drtt bZ = drtv.e.bZ();
        String a = a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drtv drtvVar = (drtv) bZ.b;
        a.getClass();
        int i = 1;
        drtvVar.a |= 1;
        drtvVar.b = a;
        int c = c();
        int i2 = c - 1;
        if (c == 0) {
            throw null;
        }
        if (i2 == 1) {
            i = 3;
        } else if (i2 == 2) {
            i = 4;
        } else if (i2 == 3) {
            i = 5;
        } else if (i2 == 4) {
            i = 2;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drtv drtvVar2 = (drtv) bZ.b;
        drtvVar2.d = i - 1;
        drtvVar2.a |= 4;
        if (!TextUtils.isEmpty(b())) {
            String b = b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            drtv drtvVar3 = (drtv) bZ.b;
            b.getClass();
            drtvVar3.a |= 2;
            drtvVar3.c = b;
        }
        return bZ.bK();
    }
}
