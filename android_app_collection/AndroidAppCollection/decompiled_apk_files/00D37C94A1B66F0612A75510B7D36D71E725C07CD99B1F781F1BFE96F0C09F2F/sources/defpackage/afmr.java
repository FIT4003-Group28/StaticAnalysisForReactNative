package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
/* compiled from: PG */
/* renamed from: afmr  reason: default package */
/* loaded from: classes.dex */
public final class afmr {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    static {
        new afmr(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
    }

    public afmr(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static boolean a(FormatStreamModel formatStreamModel, afmr afmrVar) {
        int d = formatStreamModel.d();
        int i = formatStreamModel.i();
        int i2 = afmrVar.a;
        return i2 <= d && d <= afmrVar.b && i2 <= i && i <= afmrVar.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof afmr)) {
            return false;
        }
        afmr afmrVar = (afmr) obj;
        return this.a == afmrVar.a && this.b == afmrVar.b && this.c == afmrVar.c && this.d == afmrVar.d;
    }

    public final int hashCode() {
        return (((((((this.a * 101) + 5363) * 31) + (this.b * 103)) * 31) + (this.c * 107)) * 31) + (this.d * 109);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        StringBuilder sb = new StringBuilder(67);
        sb.append("minh.");
        sb.append(i);
        sb.append(";maxh.");
        sb.append(i2);
        sb.append(";minw.");
        sb.append(i3);
        sb.append(";maxw.");
        sb.append(i4);
        return sb.toString();
    }
}
