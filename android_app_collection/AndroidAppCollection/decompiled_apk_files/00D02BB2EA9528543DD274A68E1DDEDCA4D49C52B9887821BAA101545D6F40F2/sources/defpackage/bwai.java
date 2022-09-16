package defpackage;
/* compiled from: PG */
/* renamed from: bwai  reason: default package */
/* loaded from: classes4.dex */
public final class bwai extends bvwn<dmgi> {
    private final dxio<begg> b;

    public bwai(dxio<begg> dxioVar) {
        super(dmgi.d);
        this.b = dxioVar;
    }

    @Override // defpackage.bvwn
    public final /* bridge */ /* synthetic */ void a(dmgi dmgiVar) {
        dmgi dmgiVar2 = dmgiVar;
        begg a = this.b.a();
        begj begjVar = new begj();
        drdg drdgVar = dmgiVar2.a;
        if (drdgVar == null) {
            drdgVar = drdg.q;
        }
        begjVar.b(bwam.a(drdgVar));
        begjVar.c = jjn.EXPANDED;
        begjVar.n = true;
        begjVar.F = dmgiVar2.b;
        a.o(begjVar, false, null);
    }
}
