package defpackage;
/* compiled from: PG */
/* renamed from: riw  reason: default package */
/* loaded from: classes4.dex */
public abstract class riw extends riv {
    public boolean a;

    public riw(rlx rlxVar) {
        super(rlxVar);
        this.w.t();
    }

    public final void a() {
        if (c()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void b() {
        if (!this.a) {
            if (d()) {
                return;
            }
            this.w.s();
            this.a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return this.a;
    }

    protected abstract boolean d();
}
