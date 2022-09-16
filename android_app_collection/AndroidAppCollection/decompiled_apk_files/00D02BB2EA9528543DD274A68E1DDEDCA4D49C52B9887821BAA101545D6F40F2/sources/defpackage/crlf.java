package defpackage;
/* compiled from: PG */
/* renamed from: crlf  reason: default package */
/* loaded from: classes5.dex */
public final class crlf extends crjq<crrd> implements btzi<dwnn, dwnp> {
    private final crrd a;
    private final bvgl b;

    public crlf(btrm btrmVar, bvgl bvglVar, crfl crflVar, crlb crlbVar, amwb amwbVar) {
        super(crlbVar, btrmVar);
        this.b = bvglVar;
        boolean z = false;
        if (crflVar != null && crflVar.g(amwbVar)) {
            z = true;
        }
        this.a = new crrd(amwbVar, z);
    }

    private final void d(@dzsi dwnp dwnpVar, @dzsi bttq bttqVar) {
        if (dwnpVar == null || bttqVar != null) {
            f();
        } else if (!dwnpVar.a.isEmpty()) {
            amwa B = amwb.D(dwnpVar.a.get(0)).B();
            B.d(false);
            this.a.a = B.a();
            e();
        } else {
            this.a.c = true;
            e();
        }
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwnn> btzrVar, btzy btzyVar) {
        d(null, btzyVar.p);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwnn> btzrVar, dwnp dwnpVar) {
        d(dwnpVar, null);
    }

    @Override // defpackage.crjq
    protected final void a() {
        dwnm bZ = dwnn.b.bZ();
        bZ.a(this.a.a.a());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwnn.c((dwnn) bZ.b);
        this.b.a(bZ.bK(), this, bvrj.UI_THREAD);
    }

    @Override // defpackage.crjq
    protected final /* bridge */ /* synthetic */ crrd b() {
        return this.a;
    }
}
