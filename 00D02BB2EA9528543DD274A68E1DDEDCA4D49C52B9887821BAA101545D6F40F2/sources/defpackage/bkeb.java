package defpackage;
/* compiled from: PG */
/* renamed from: bkeb  reason: default package */
/* loaded from: classes3.dex */
public final class bkeb implements bkdi {
    private final dcdc<bkdg> a;

    public bkeb(dgjg dgjgVar, bkdy bkdyVar) {
        dccx F = dcdc.F();
        for (dgjc dgjcVar : dgjgVar.c) {
            F.g(bkdyVar.a(dgjcVar, bkdf.CAROUSEL));
        }
        if ((dgjgVar.a & 1) != 0) {
            dgjc dgjcVar2 = dgjgVar.b;
            F.g(bkdyVar.a(dgjcVar2 == null ? dgjc.d : dgjcVar2, bkdf.GRID));
        }
        this.a = F.f();
    }

    @Override // defpackage.bkdi
    /* renamed from: b */
    public dcdc<bkdg> a() {
        return this.a;
    }
}
