package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: dnk  reason: default package */
/* loaded from: classes3.dex */
public final class dnk {
    public static final dnk a = new dnk(-1, -2);
    public static final dnk b = new dnk(320, 50);
    public static final dnk c = new dnk(300, 250);
    public static final dnk d = new dnk(468, 60);
    public static final dnk e = new dnk(728, 90);
    public static final dnk f = new dnk(160, 600);
    public final pzb g;

    private dnk(int i, int i2) {
        this(new pzb(i, i2));
    }

    public dnk(pzb pzbVar) {
        this.g = pzbVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dnk)) {
            return false;
        }
        return this.g.equals(((dnk) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return this.g.e;
    }
}
