package defpackage;
/* compiled from: PG */
/* renamed from: bwc  reason: default package */
/* loaded from: classes2.dex */
final class bwc {
    static final bwc a;
    static final bwc b;
    final boolean c;
    final Throwable d;

    static {
        if (bwk.a) {
            b = null;
            a = null;
            return;
        }
        b = new bwc(false, null);
        a = new bwc(true, null);
    }

    public bwc(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}
