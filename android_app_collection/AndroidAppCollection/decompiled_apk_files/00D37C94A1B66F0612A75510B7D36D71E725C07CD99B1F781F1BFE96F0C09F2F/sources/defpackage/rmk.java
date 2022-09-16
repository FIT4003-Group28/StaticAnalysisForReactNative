package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rmk  reason: default package */
/* loaded from: classes4.dex */
public abstract class rmk extends rmj {
    private boolean a;

    public rmk(rlx rlxVar) {
        super(rlxVar);
        this.w.t();
    }

    protected void aI() {
    }

    protected abstract boolean f();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j() {
        if (m()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m() {
        return this.a;
    }

    public final void k() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (f()) {
            return;
        }
        this.w.s();
        this.a = true;
    }

    public final void l() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        aI();
        this.w.s();
        this.a = true;
    }
}
