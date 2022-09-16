package defpackage;
/* compiled from: PG */
/* renamed from: lqp  reason: default package */
/* loaded from: classes3.dex */
final class lqp implements ajql {
    final /* synthetic */ lrj a;

    public lqp(lrj lrjVar) {
        this.a = lrjVar;
    }

    private final void f() {
        if (!this.a.h.isEmpty()) {
            lrj lrjVar = this.a;
            lrjVar.f.q(lrjVar.g);
            return;
        }
        lrj lrjVar2 = this.a;
        if (lrjVar2.f.i(lrjVar2.g) != -1) {
            return;
        }
        lrj lrjVar3 = this.a;
        lrjVar3.f.n(1, lrjVar3.g);
    }

    @Override // defpackage.ymy
    public final void d(int i, int i2) {
        f();
    }

    @Override // defpackage.ymy
    public final void e(int i, int i2) {
        f();
    }

    @Override // defpackage.ajql
    public final void pi() {
        f();
    }

    @Override // defpackage.ymy
    public final void pj(int i, int i2) {
        f();
    }

    @Override // defpackage.ymy
    public final void pk(int i, int i2) {
        f();
    }
}
