package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ygb  reason: default package */
/* loaded from: classes7.dex */
public final class ygb implements bbb {
    final /* synthetic */ ygh a;
    private boolean b = false;

    public ygb(ygh yghVar) {
        this.a = yghVar;
    }

    @Override // defpackage.bbb
    public final void b(int i) {
        bbb E;
        E = super/*acoi*/.E();
        E.b(i);
    }

    @Override // defpackage.bbb
    public final void c(int i) {
        bbb E;
        E = super/*acoi*/.E();
        E.c(i);
    }

    @Override // defpackage.bbb
    public final void a(int i, float f, int i2) {
        yfs A;
        bbb E;
        if (f == 0.0f) {
            this.b = false;
        } else if (!this.b && (A = this.a.A()) != null) {
            this.b = true;
            dcdc<yfs> dcdcVar = this.a.o;
            int size = dcdcVar.size();
            for (int i3 = 0; i3 < size; i3++) {
                dcdcVar.get(i3).j(A);
            }
        }
        E = super/*acoi*/.E();
        E.a(i, f, i2);
    }
}
