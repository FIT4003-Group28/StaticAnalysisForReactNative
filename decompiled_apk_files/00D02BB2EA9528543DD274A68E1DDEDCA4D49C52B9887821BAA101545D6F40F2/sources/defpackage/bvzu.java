package defpackage;
/* compiled from: PG */
/* renamed from: bvzu  reason: default package */
/* loaded from: classes4.dex */
public final class bvzu extends bvwl<dmfc, dmfe> {
    private final dxio<akfa> c;
    private final dxio<cjnx> d;

    public bvzu(dxio<akfa> dxioVar, dxio<cjnx> dxioVar2) {
        super(dmfc.b, dmfe.f);
        this.c = dxioVar;
        this.d = dxioVar2;
    }

    @Override // defpackage.bvwl
    public final /* bridge */ /* synthetic */ dehn<dmfe> a(dmfc dmfcVar) {
        btlu j = this.c.a().j();
        if (j == null) {
            bvwi c = bvwj.c();
            c.b(drtc.FAILED_PRECONDITION);
            c.c("GmmAccount is 'null'. Can not fetch Reporting State from ULR");
            return deha.b(c.a());
        }
        return deew.h(degp.q(this.d.a().i(j)), bvzt.a, dege.a);
    }

    @Override // defpackage.bvwl
    public final /* bridge */ /* synthetic */ dmfe g(dmfc dmfcVar) {
        throw new AssertionError();
    }
}
