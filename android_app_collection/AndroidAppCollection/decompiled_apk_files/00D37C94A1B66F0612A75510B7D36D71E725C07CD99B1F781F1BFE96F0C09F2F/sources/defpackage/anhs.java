package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anhs  reason: default package */
/* loaded from: classes.dex */
public final class anhs {
    static final anhs a;
    static final anhs b;
    final boolean c;
    final Throwable d;

    static {
        if (anie.g) {
            b = null;
            a = null;
            return;
        }
        b = new anhs(false, null);
        a = new anhs(true, null);
    }

    public anhs(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}
