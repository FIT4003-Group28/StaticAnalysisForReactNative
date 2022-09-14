package defpackage;
/* compiled from: PG */
/* renamed from: bnvo  reason: default package */
/* loaded from: classes.dex */
public final class bnvo {
    public static final bnvo e = new bnvo(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public bnvo(int i, int i2, int i3) {
        this(i, i2, 0, i3);
    }

    public bnvo(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final bnvo a(int i) {
        return new bnvo(this.a, this.b, i, this.d);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.d;
        int i4 = this.c;
        StringBuilder sb = new StringBuilder(47);
        sb.append(i);
        sb.append(",");
        sb.append(i2);
        sb.append(",");
        sb.append(i3);
        sb.append(",");
        sb.append(i4);
        return sb.toString();
    }
}
