package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cysn  reason: default package */
/* loaded from: classes5.dex */
public final class cysn implements Comparable<cysn> {
    public long a;
    public final String b;
    public final double c;
    public final cysj d;

    public cysn(long j, String str, double d, cysj cysjVar) {
        this.a = j;
        this.b = str;
        this.c = d;
        this.d = cysjVar;
    }

    public static cysj a(String str) {
        if (str == null) {
            return null;
        }
        return cysj.a(str);
    }

    public static String b(cysj cysjVar) {
        if (cysjVar == null) {
            return null;
        }
        return cysjVar.name();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(cysn cysnVar) {
        cysn cysnVar2 = cysnVar;
        int compare = Double.compare(cysnVar2.c, this.c);
        if (compare == 0) {
            compare = (this.a > cysnVar2.a ? 1 : (this.a == cysnVar2.a ? 0 : -1));
        }
        return compare == 0 ? this.b.compareTo(cysnVar2.b) : compare;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cysn) {
            cysn cysnVar = (cysn) obj;
            if (this.a == cysnVar.a && dbsd.a(this.b, cysnVar.b) && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(cysnVar.c) && dbsd.a(this.d, cysnVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Double.valueOf(this.c), this.d});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.g("contactId", this.a);
        b.b("value", this.b);
        b.d("affinity", this.c);
        b.b("sourceType", this.d);
        return b.toString();
    }
}
