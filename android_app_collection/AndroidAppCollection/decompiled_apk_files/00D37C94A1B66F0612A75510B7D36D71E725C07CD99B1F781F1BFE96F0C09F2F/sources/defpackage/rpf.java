package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rpf  reason: default package */
/* loaded from: classes4.dex */
public abstract class rpf extends rpe {
    private boolean a;

    public rpf(rpn rpnVar) {
        super(rpnVar);
        this.j.m++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void V() {
        if (X()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean X() {
        return this.a;
    }

    protected abstract void b();

    public final void W() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        b();
        this.j.n++;
        this.a = true;
    }
}
