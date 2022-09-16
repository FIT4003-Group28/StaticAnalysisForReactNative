package defpackage;
/* compiled from: PG */
/* renamed from: ayrw  reason: default package */
/* loaded from: classes2.dex */
public class ayrw extends ayrp {
    private static final long serialVersionUID = -5502432239815349361L;
    protected final ayom a;
    protected Object b;

    public ayrw(ayom ayomVar) {
        this.a = ayomVar;
    }

    @Override // defpackage.ayrn
    public final void d() {
        lazySet(32);
        this.b = null;
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return get() == 4;
    }

    public final void f(Object obj) {
        int i = get();
        if ((i & 54) != 0) {
            return;
        }
        ayom ayomVar = this.a;
        if (i == 8) {
            this.b = obj;
            lazySet(16);
            ayomVar.c(null);
        } else {
            lazySet(2);
            ayomVar.c(obj);
        }
        if (get() == 4) {
            return;
        }
        ayomVar.sm();
    }

    public final void g(Throwable th) {
        if ((get() & 54) != 0) {
            azqc.d(th);
            return;
        }
        lazySet(2);
        this.a.b(th);
    }

    @Override // defpackage.ayrn
    public final boolean j() {
        return get() != 16;
    }

    @Override // defpackage.aypg
    public void qr() {
        set(4);
        this.b = null;
    }

    @Override // defpackage.ayrj
    public final int sk(int i) {
        if ((i & 2) != 0) {
            lazySet(8);
            return 2;
        }
        return 0;
    }

    @Override // defpackage.ayrn
    public final Object sl() {
        if (get() == 16) {
            Object obj = this.b;
            this.b = null;
            lazySet(32);
            return obj;
        }
        return null;
    }
}
