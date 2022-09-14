package defpackage;
/* compiled from: PG */
/* renamed from: w  reason: default package */
/* loaded from: classes7.dex */
final class w<V> implements aa<V> {
    final v<V> a;
    final aa<? super V> b;
    int c = -1;

    public w(v<V> vVar, aa<? super V> aaVar) {
        this.a = vVar;
        this.b = aaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.a.c(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.a.d(this);
    }

    @Override // defpackage.aa
    public final void m(V v) {
        int i = this.c;
        int i2 = this.a.f;
        if (i != i2) {
            this.c = i2;
            this.b.m(v);
        }
    }
}
