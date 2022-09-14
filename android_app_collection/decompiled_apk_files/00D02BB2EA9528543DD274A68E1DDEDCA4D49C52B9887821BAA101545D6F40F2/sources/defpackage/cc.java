package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cc  reason: default package */
/* loaded from: classes4.dex */
public final class cc {
    public final String a;
    public final String b;
    public final String c;
    public final List<String> d;
    public final List<String> e;

    public cc(String str, String str2, String str3, List<String> list, List<String> list2) {
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
        if (!(obj instanceof cc)) {
            return false;
        }
        cc ccVar = (cc) obj;
        if (!this.a.equals(ccVar.a) || !this.b.equals(ccVar.b) || !this.c.equals(ccVar.c) || !this.d.equals(ccVar.d)) {
            return false;
        }
        return this.e.equals(ccVar.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.a + "', onDelete='" + this.b + "', onUpdate='" + this.c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.e + '}';
    }
}
