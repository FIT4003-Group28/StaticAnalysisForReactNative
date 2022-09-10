package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cklq  reason: default package */
/* loaded from: classes4.dex */
public class cklq {
    public final ckmm a;
    public final Executor b;
    @dzsi
    public ckls c;
    @dzsi
    public cxdh d;
    @dzsi
    public cxdh e;

    public cklq(ckmm ckmmVar, Executor executor) {
        this.a = ckmmVar;
        this.b = executor;
    }

    public final void a(ckls cklsVar) {
        this.c = cklsVar;
        this.d = this.a.a().h();
        this.e = null;
    }

    public final void b() {
        this.e = this.a.a().h();
    }

    public final void c(cklt ckltVar) {
        d(ckltVar, dcdc.e());
    }

    public final void d(cklt ckltVar, dcdc<cklr> dcdcVar) {
        this.b.execute(new cklp(this.a, cklo.END_TO_END, ckltVar, dcdcVar, this.c, this.d, this.e));
        e();
    }

    public final void e() {
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
