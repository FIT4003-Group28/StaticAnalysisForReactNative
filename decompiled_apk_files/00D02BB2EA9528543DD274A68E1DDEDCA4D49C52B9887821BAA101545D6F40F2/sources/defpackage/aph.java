package defpackage;
/* compiled from: PG */
/* renamed from: aph  reason: default package */
/* loaded from: classes2.dex */
public final class aph extends an {
    public static final aq a = new apg();
    public final ain<ape> d = new ain<>();
    public boolean e = false;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.an
    public final void a() {
        int f = this.d.f();
        for (int i = 0; i < f; i++) {
            this.d.h(i).o(true);
        }
        ain<ape> ainVar = this.d;
        int i2 = ainVar.e;
        Object[] objArr = ainVar.d;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        ainVar.e = 0;
        ainVar.b = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.e = false;
    }

    public final <D> ape<D> d(int i) {
        return this.d.b(i);
    }
}
