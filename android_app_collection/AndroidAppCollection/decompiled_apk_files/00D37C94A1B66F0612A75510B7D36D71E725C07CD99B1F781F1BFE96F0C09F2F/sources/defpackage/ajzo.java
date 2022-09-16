package defpackage;
/* compiled from: PG */
/* renamed from: ajzo  reason: default package */
/* loaded from: classes.dex */
final class ajzo implements ajql {
    public int a;
    private final ajqm b;

    public ajzo(ajqm ajqmVar) {
        this.b = ajqmVar;
    }

    private final void g(int i) {
        if (i < this.a) {
            this.a = i;
        }
    }

    @Override // defpackage.ymy
    public final void d(int i, int i2) {
        g(i);
    }

    @Override // defpackage.ymy
    public final void e(int i, int i2) {
        g(Math.min(i, i2));
    }

    public final void f() {
        this.a = this.b.a();
    }

    @Override // defpackage.ajql
    public final void pi() {
        f();
    }

    @Override // defpackage.ymy
    public final void pj(int i, int i2) {
        g(i);
    }

    @Override // defpackage.ymy
    public final void pk(int i, int i2) {
        g(i);
    }
}
