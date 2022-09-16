package defpackage;
/* compiled from: PG */
/* renamed from: agxc  reason: default package */
/* loaded from: classes2.dex */
public class agxc implements agxb {
    private static final cqtv a = cqrp.c(dcyn.a);
    private cqtv b;
    private cqtv c;

    public agxc() {
        cqtv cqtvVar = a;
        this.b = cqtvVar;
        this.c = cqtvVar;
    }

    @Override // defpackage.agxb
    public cqtv d() {
        return this.b;
    }

    @Override // defpackage.agxb
    public void e(cqtv cqtvVar) {
        this.b = cqtvVar;
    }

    @Override // defpackage.agxb
    public cqtv f() {
        return this.c;
    }

    @Override // defpackage.agxb
    public void g(cqtv cqtvVar) {
        this.c = cqtvVar;
    }
}
