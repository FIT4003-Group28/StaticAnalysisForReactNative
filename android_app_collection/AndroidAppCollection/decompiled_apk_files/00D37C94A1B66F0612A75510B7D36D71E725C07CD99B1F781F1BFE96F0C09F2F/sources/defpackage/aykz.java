package defpackage;
/* compiled from: PG */
/* renamed from: aykz  reason: default package */
/* loaded from: classes2.dex */
final class aykz implements ayle {
    final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public aykz(int i) {
        this.a = i;
    }

    public aykz(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.ayle
    public final void a(aylt ayltVar) {
        int i = this.b;
        if (i == 0) {
            ayltVar.a.l(this.a);
        } else if (i == 1) {
            ayltVar.a.k(this.a);
        } else {
            ayltVar.a.g(this.a);
        }
    }
}
