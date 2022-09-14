package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ce  reason: default package */
/* loaded from: classes4.dex */
public final class ce {
    public final String a;
    public final boolean b;
    public final List<String> c;

    public ce(String str, boolean z, List<String> list) {
        this.a = str;
        this.b = z;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce)) {
            return false;
        }
        ce ceVar = (ce) obj;
        if (this.b != ceVar.b || !this.c.equals(ceVar.c)) {
            return false;
        }
        if (this.a.startsWith("index_")) {
            return ceVar.a.startsWith("index_");
        }
        return this.a.equals(ceVar.a);
    }

    public final int hashCode() {
        return ((((this.a.startsWith("index_") ? -1184239155 : this.a.hashCode()) * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Index{name='" + this.a + "', unique=" + this.b + ", columns=" + this.c + '}';
    }
}
