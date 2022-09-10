package defpackage;
/* compiled from: PG */
/* renamed from: ccvg  reason: default package */
/* loaded from: classes4.dex */
public final class ccvg extends cknx {
    @Override // defpackage.cknx
    public final dwge a(akqi akqiVar, int i, String str, int i2, int i3) {
        dwfy bZ = dwge.m.bZ();
        dwfs bZ2 = dwfv.m.bZ();
        dwev bZ3 = dwew.e.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dwew dwewVar = (dwew) bZ3.b;
        int i4 = dwewVar.a | 1;
        dwewVar.a = i4;
        dwewVar.c = false;
        dwewVar.a = i4 | 2;
        dwewVar.d = false;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dwfv dwfvVar = (dwfv) bZ2.b;
        dwew bK = bZ3.bK();
        bK.getClass();
        dwfvVar.b = bK;
        dwfvVar.a |= 1;
        h(bZ, akqiVar);
        j(bZ2, 20, str);
        n(bZ2, i2, i3);
        p(bZ2, dweb.MENU, i2, i3);
        f(bZ2, false);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwge dwgeVar = (dwge) bZ.b;
        dwfv bK2 = bZ2.bK();
        bK2.getClass();
        dwgeVar.h = bK2;
        dwgeVar.a |= 128;
        return bZ.bK();
    }

    @Override // defpackage.cknx
    public final int b(ilo iloVar) {
        return 1;
    }
}
