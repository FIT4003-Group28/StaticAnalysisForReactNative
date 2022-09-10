package defpackage;
/* compiled from: PG */
/* renamed from: bdvm  reason: default package */
/* loaded from: classes3.dex */
public final class bdvm extends cknx {
    private final dweb a;
    private final boolean b;

    public bdvm(dweb dwebVar, boolean z) {
        this.a = dwebVar;
        this.b = z;
    }

    @Override // defpackage.cknx
    public final dwge a(akqi akqiVar, int i, String str, int i2, int i3) {
        dwfy bZ = dwge.m.bZ();
        dwfs d = d(false, true, this.b);
        p(d, this.a, i2, i3);
        h(bZ, akqiVar);
        j(d, 20, str);
        n(d, i2, i3);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwge dwgeVar = (dwge) bZ.b;
        dwfv bK = d.bK();
        bK.getClass();
        dwgeVar.h = bK;
        dwgeVar.a |= 128;
        return bZ.bK();
    }

    @Override // defpackage.cknx
    public final int b(@dzsi ilo iloVar) {
        int size = iloVar.aF(this.a).size();
        if (size == 0) {
            return 1;
        }
        return size;
    }
}
