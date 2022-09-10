package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bkdc  reason: default package */
/* loaded from: classes3.dex */
public class bkdc {
    private final Activity a;
    private final dxio<afha> b;
    private final begg c;
    private final bvvw d;

    public bkdc(Activity activity, dxio<afha> dxioVar, begg beggVar, bvvw bvvwVar) {
        this.a = activity;
        this.b = dxioVar;
        this.c = beggVar;
        this.d = bvvwVar;
    }

    public static boolean a(dgis dgisVar) {
        int a = dgir.a(dgisVar.b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1 || i == 2) {
            return dgisVar.c.startsWith("http");
        }
        return false;
    }

    public final void b(dgis dgisVar) {
        int a = dgir.a(dgisVar.b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i != 1) {
            if (i == 2) {
                this.b.a().k(this.a, dgisVar.c, 1);
                return;
            } else if (i == 3) {
                this.c.k(bege.PRODUCTS);
                return;
            } else {
                throw new AssertionError("Unsupported link action type");
            }
        }
        String str = dgisVar.c;
        bvxn bZ = bvxu.A.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar = (bvxu) bZ.b;
        str.getClass();
        int i2 = bvxuVar.a | 1;
        bvxuVar.a = i2;
        bvxuVar.b = str;
        bvxuVar.a = i2 | 64;
        bvxuVar.h = "aGMM.ProductCatalog";
        bvxp f = bvoa.f(ibm.b(), this.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar2 = (bvxu) bZ.b;
        f.getClass();
        bvxuVar2.x = f;
        bvxuVar2.a |= 4194304;
        dkyw bZ2 = dkyx.f.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dkyx.b((dkyx) bZ2.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar3 = (bvxu) bZ.b;
        dkyx bK = bZ2.bK();
        bK.getClass();
        bvxuVar3.j = bK;
        bvxuVar3.a |= 256;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar4 = (bvxu) bZ.b;
        bvxuVar4.a |= 8;
        bvxuVar4.e = true;
        bvxu.d(bvxuVar4);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar5 = (bvxu) bZ.b;
        int i3 = bvxuVar5.a | 2048;
        bvxuVar5.a = i3;
        bvxuVar5.m = true;
        int i4 = i3 | 16;
        bvxuVar5.a = i4;
        bvxuVar5.f = 1;
        bvxuVar5.a = i4 | 512;
        bvxuVar5.k = true;
        this.d.k(bZ.bK(), null, dtxy.lv);
    }
}
