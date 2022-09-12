package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aip  reason: default package */
/* loaded from: classes2.dex */
public final class aip {
    static final aip a;
    static final aip b;
    final boolean c;
    final Throwable d;

    static {
        if (aix.a) {
            b = null;
            a = null;
            return;
        }
        b = new aip(false, null);
        a = new aip(true, null);
    }

    public aip(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}
