package defpackage;
/* compiled from: PG */
/* renamed from: albv  reason: default package */
/* loaded from: classes.dex */
public final class albv {
    public static final albv a = new albv(true, 0);
    public final boolean b;
    public final int c;

    private albv() {
        this(true, 0);
    }

    private albv(boolean z, int i) {
        this.b = z;
        this.c = i;
    }

    public static albv a(int i) {
        return new albv(false, i);
    }
}
