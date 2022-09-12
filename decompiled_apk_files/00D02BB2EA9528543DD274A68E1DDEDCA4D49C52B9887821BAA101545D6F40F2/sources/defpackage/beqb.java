package defpackage;
/* compiled from: PG */
/* renamed from: beqb  reason: default package */
/* loaded from: classes3.dex */
public final class beqb extends itb {
    private final dxio<bvvw> a;

    public beqb(dxio<bvvw> dxioVar) {
        this.a = dxioVar;
    }

    public final void e(String str) {
        bvvw a = this.a.a();
        bvxn bZ = bvxu.A.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar = (bvxu) bZ.b;
        str.getClass();
        int i = bvxuVar.a | 1;
        bvxuVar.a = i;
        bvxuVar.b = str;
        int i2 = i | 4;
        bvxuVar.a = i2;
        bvxuVar.d = false;
        bvxuVar.a = i2 | 32;
        bvxuVar.g = false;
        bvxu.b(bvxuVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar2 = (bvxu) bZ.b;
        int i3 = bvxuVar2.a | 8;
        bvxuVar2.a = i3;
        bvxuVar2.e = true;
        int i4 = i3 | 2048;
        bvxuVar2.a = i4;
        bvxuVar2.m = true;
        bvxuVar2.a = i4 | 512;
        bvxuVar2.k = true;
        bvxu.c(bvxuVar2);
        dkyw bZ2 = dkyx.f.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dkyx.b((dkyx) bZ2.b);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dkyx.c((dkyx) bZ2.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar3 = (bvxu) bZ.b;
        dkyx bK = bZ2.bK();
        bK.getClass();
        bvxuVar3.j = bK;
        bvxuVar3.a |= 256;
        a.k(bZ.bK(), null, dtxl.Y);
    }
}
