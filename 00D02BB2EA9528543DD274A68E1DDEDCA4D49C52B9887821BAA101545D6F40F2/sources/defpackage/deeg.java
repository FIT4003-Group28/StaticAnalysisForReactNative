package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: deeg  reason: default package */
/* loaded from: classes.dex */
public final class deeg {
    static final deeg a;
    static final deeg b;
    final boolean c;
    final Throwable d;

    static {
        if (dees.j) {
            b = null;
            a = null;
            return;
        }
        b = new deeg(false, null);
        a = new deeg(true, null);
    }

    public deeg(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}
