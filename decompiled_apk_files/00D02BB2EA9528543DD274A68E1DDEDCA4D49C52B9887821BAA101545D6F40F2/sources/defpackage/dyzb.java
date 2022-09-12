package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyzb  reason: default package */
/* loaded from: classes6.dex */
public final class dyzb<ReqT, RespT> extends dyza<RespT> {
    private final dyzk<RespT> a;
    private final dyyy<ReqT> b;

    public dyzb(dyzk<RespT> dyzkVar, dyyy<ReqT> dyyyVar) {
        this.a = dyzkVar;
        this.b = dyyyVar;
        if (dyzkVar instanceof dyzg) {
            ((dyzg) dyzkVar).d(dyyyVar);
        }
    }

    @Override // defpackage.dyew
    public final void a(dyhw dyhwVar) {
    }

    @Override // defpackage.dyew
    public final void b(dyjb dyjbVar, dyhw dyhwVar) {
        if (dyjbVar.i()) {
            this.a.b();
        } else {
            this.a.a(dyjbVar.k(dyhwVar));
        }
    }

    @Override // defpackage.dyew
    public final void c(RespT respt) {
        this.a.c(respt);
        this.b.d();
    }

    @Override // defpackage.dyza
    public final void e() {
        this.b.d();
    }

    @Override // defpackage.dyew
    public final void i() {
    }
}
