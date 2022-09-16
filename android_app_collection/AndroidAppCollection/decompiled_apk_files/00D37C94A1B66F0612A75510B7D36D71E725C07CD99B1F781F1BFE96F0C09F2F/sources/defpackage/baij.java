package defpackage;
/* compiled from: PG */
/* renamed from: baij  reason: default package */
/* loaded from: classes2.dex */
public abstract class baij implements baif {
    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long d = d();
        long d2 = ((baif) obj).d();
        if (d < d2) {
            return -1;
        }
        return d > d2 ? 1 : 0;
    }

    public final baid e() {
        return new baid(d());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof baif) && d() == ((baif) obj).d();
    }

    public final int hashCode() {
        long d = d();
        return (int) (d ^ (d >>> 32));
    }

    public final String toString() {
        long d = d();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PT");
        balf.f(stringBuffer, d);
        while (true) {
            if (stringBuffer.length() >= (d < 0 ? 7 : 6)) {
                break;
            }
            stringBuffer.insert(d < 0 ? 3 : 2, "0");
        }
        if ((d / 1000) * 1000 == d) {
            stringBuffer.setLength(stringBuffer.length() - 3);
        } else {
            stringBuffer.insert(stringBuffer.length() - 3, ".");
        }
        stringBuffer.append('S');
        return stringBuffer.toString();
    }
}
