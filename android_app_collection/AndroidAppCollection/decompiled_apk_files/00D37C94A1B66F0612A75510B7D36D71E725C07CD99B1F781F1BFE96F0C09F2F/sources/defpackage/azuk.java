package defpackage;
/* compiled from: PG */
/* renamed from: azuk  reason: default package */
/* loaded from: classes2.dex */
public class azuk {
    public final Throwable b;
    public final aztr c;

    public azuk(Throwable th, boolean z) {
        this.b = th;
        this.c = ayme.d(z);
    }

    public final boolean a() {
        return this.c.b();
    }

    public final String toString() {
        return banl.j(this) + '[' + this.b + ']';
    }

    public /* synthetic */ azuk(Throwable th) {
        this(th, false);
    }
}
