package defpackage;
/* compiled from: PG */
/* renamed from: afle  reason: default package */
/* loaded from: classes2.dex */
final class afle implements Runnable {
    final /* synthetic */ qbs a;
    final /* synthetic */ amvh b;
    final /* synthetic */ duqc c;
    final /* synthetic */ aflf d;

    public afle(aflf aflfVar, qbs qbsVar, amvh amvhVar, duqc duqcVar) {
        this.d = aflfVar;
        this.a = qbsVar;
        this.b = amvhVar;
        this.c = duqcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dqvj a = this.d.b.a().e().a();
        qcw x = qcx.x();
        x.s(a);
        x.k(this.a);
        x.r(amvh.i(this.d.a));
        x.u(this.b);
        x.t(this.c);
        x.w(this.d.c.a().c(a, 3, vul.DIRECTIONS_UI));
        x.v(cjsb.c(ddda.c));
        this.d.b.a().m(x.a());
    }
}
