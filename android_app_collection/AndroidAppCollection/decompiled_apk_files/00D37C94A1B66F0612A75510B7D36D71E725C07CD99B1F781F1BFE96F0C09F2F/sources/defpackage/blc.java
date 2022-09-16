package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: blc  reason: default package */
/* loaded from: classes2.dex */
public final class blc {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public blc(String str, String str2, String str3, List list, List list2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = Collections.unmodifiableList(list);
        this.e = Collections.unmodifiableList(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blc)) {
            return false;
        }
        blc blcVar = (blc) obj;
        if (!this.a.equals(blcVar.a) || !this.b.equals(blcVar.b) || !this.c.equals(blcVar.c) || !this.d.equals(blcVar.d)) {
            return false;
        }
        return this.e.equals(blcVar.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.a + "', onDelete='" + this.b + "', onUpdate='" + this.c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.e + '}';
    }
}
