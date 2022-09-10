package defpackage;
/* compiled from: PG */
/* renamed from: blkj  reason: default package */
/* loaded from: classes3.dex */
public class blkj {
    public final btvo a;
    private final bhhf b;

    public blkj(btvo btvoVar, bhhf bhhfVar) {
        this.a = btvoVar;
        this.b = bhhfVar;
    }

    public static boolean a(@dzsi bwrs<ilo> bwrsVar) {
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        return iloVar != null && iloVar.cB() && !iloVar.j();
    }

    public final boolean b(@dzsi bwrs<ilo> bwrsVar) {
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null || !iloVar.f || !a(bwrsVar) || iloVar.bo().h || this.b.b(bwrsVar)) {
            return false;
        }
        return this.a.getEnableFeatureParameters().o;
    }

    public final boolean c(ilo iloVar) {
        return this.a.getEnableFeatureParameters().S && (iloVar.h().c & 536870912) != 0;
    }

    public final boolean d() {
        int e = e() - 1;
        return e == 5 || e == 7;
    }

    public final int e() {
        int a = dkxm.a(this.a.getUgcParameters().ap().e);
        if (a == 0) {
            a = 2;
        }
        int i = a - 1;
        if (i == 5 || i == 7) {
            return a;
        }
        return 2;
    }
}
