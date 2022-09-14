package defpackage;
/* compiled from: PG */
/* renamed from: bht  reason: default package */
/* loaded from: classes3.dex */
final class bht {
    static final bht a;
    static final bht b;
    final boolean c;
    final Throwable d;

    static {
        if (bib.a) {
            b = null;
            a = null;
            return;
        }
        b = new bht(false, null);
        a = new bht(true, null);
    }

    public bht(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}
