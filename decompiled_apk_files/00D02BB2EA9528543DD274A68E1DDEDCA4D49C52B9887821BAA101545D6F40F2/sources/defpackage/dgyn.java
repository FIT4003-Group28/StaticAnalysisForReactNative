package defpackage;
/* compiled from: PG */
/* renamed from: dgyn  reason: default package */
/* loaded from: classes6.dex */
public final class dgyn {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public dgyn(int i, int i2, int i3, int i4, int i5) {
        if (i5 != 0 && i5 != 1) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("qualityAlgorithm = ");
            sb.append(i5);
            throw new IllegalArgumentException(sb.toString());
        }
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }
}
