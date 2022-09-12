package defpackage;
/* compiled from: PG */
/* renamed from: ccae  reason: default package */
/* loaded from: classes4.dex */
public final class ccae {
    public static final ccae a = new ccae(true, true, true);
    public static final ccae b;
    public static final ccae c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    static {
        new ccae(true, false, true);
        b = new ccae(false, false, false);
        c = new ccae(true, false, false);
    }

    public ccae() {
        this.d = true;
        this.e = true;
        this.f = true;
    }

    private ccae(boolean z, boolean z2, boolean z3) {
        this.d = z;
        this.e = z2;
        this.f = z3;
    }
}
