package defpackage;
/* compiled from: PG */
/* renamed from: ccag  reason: default package */
/* loaded from: classes4.dex */
public final class ccag {
    public static final ccag a = new ccag(false, false);
    public static final ccag b;
    public final boolean c;
    public final boolean d;

    static {
        new ccag(true, false);
        b = new ccag(true, true);
        new ccag(false, false);
        new ccag(true, false);
    }

    public ccag() {
        this.c = false;
        this.d = false;
    }

    private ccag(boolean z, boolean z2) {
        this.c = z;
        this.d = z2;
    }
}
