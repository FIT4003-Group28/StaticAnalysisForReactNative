package defpackage;
/* compiled from: PG */
/* renamed from: ocf  reason: default package */
/* loaded from: classes3.dex */
final class ocf extends ajqd implements ajql {
    final /* synthetic */ ocg a;
    private final ajrj b;

    public ocf(ocg ocgVar, ajrj ajrjVar) {
        this.a = ocgVar;
        this.b = ajrjVar;
        ajrjVar.lT(this);
    }

    private final void h(int i, int i2) {
        int j = this.b.j(this.a.a.lA());
        int i3 = (i + i2) - 1;
        for (int max = j == -1 ? Integer.MAX_VALUE : Math.max(i, j + this.a.a.lA().a()); max <= i3; max++) {
            this.a.b.add(this.b.c(max));
        }
    }

    @Override // defpackage.ajqm
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.ajqm
    public final long b(int i) {
        return this.b.b(i);
    }

    @Override // defpackage.ajqm
    public final Object c(int i) {
        return this.b.c(i);
    }

    @Override // defpackage.ajqm
    public final boolean contains(Object obj) {
        throw null;
    }

    @Override // defpackage.ymy
    public final void d(int i, int i2) {
        z(i, i2);
    }

    @Override // defpackage.ymy
    public final void e(int i, int i2) {
        A(i, i2);
    }

    @Override // defpackage.ajqm
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // defpackage.ajqd, defpackage.ajqm
    public final void mG(ajrt ajrtVar) {
        this.b.mG(ajrtVar);
    }

    @Override // defpackage.ajqd, defpackage.ajqm
    public final void mH(ajrs ajrsVar, int i) {
        this.b.mH(ajrsVar, i);
    }

    @Override // defpackage.ajql
    public final void pi() {
        h(0, this.b.a());
        v();
    }

    @Override // defpackage.ymy
    public final void pj(int i, int i2) {
        h(i, i2);
        x(i, i2);
    }

    @Override // defpackage.ymy
    public final void pk(int i, int i2) {
        h(i, i2);
        y(i, i2);
    }
}
