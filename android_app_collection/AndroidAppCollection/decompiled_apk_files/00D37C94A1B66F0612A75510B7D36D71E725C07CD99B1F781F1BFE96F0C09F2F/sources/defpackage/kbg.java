package defpackage;
/* compiled from: PG */
/* renamed from: kbg  reason: default package */
/* loaded from: classes3.dex */
public abstract class kbg {
    protected boolean a;

    private final void b(boolean z, boolean z2) {
        this.a = z2;
        if (w(z2)) {
            t(z);
        } else {
            a(z);
        }
    }

    protected abstract void a(boolean z);

    public final void c(boolean z) {
        b(z, false);
    }

    public final void s(boolean z) {
        b(z, true);
    }

    protected abstract void t(boolean z);

    public final void u() {
        v(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v(boolean z) {
        if (this.a) {
            s(z);
        } else {
            c(z);
        }
    }

    protected abstract boolean w(boolean z);
}
