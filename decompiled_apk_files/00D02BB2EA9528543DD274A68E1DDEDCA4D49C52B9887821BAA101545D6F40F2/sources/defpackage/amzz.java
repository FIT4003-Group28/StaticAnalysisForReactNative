package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: amzz  reason: default package */
/* loaded from: classes.dex */
public final class amzz implements Comparable<amzz>, Serializable {
    public static final amzz a = new amzz(-1);
    public static final amzz b = a(new long[0]);
    private final long c;

    private amzz(long j) {
        this.c = j;
    }

    public static amzz a(long... jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j |= 1 << ((int) j2);
        }
        return new amzz(j);
    }

    public final boolean b(long j) {
        return ((1 << ((int) j)) & this.c) != 0;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(amzz amzzVar) {
        return decu.b(this.c, amzzVar.c);
    }

    public final boolean equals(@dzsi Object obj) {
        return (obj instanceof amzz) && ((amzz) obj).c == this.c;
    }

    public final int hashCode() {
        long j = this.c;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        boolean z = true;
        for (long j = 0; j <= 63; j++) {
            if (b(j)) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(j);
                z = false;
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
