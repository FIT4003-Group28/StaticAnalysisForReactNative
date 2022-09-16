package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: ble  reason: default package */
/* loaded from: classes2.dex */
public final class ble {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    public ble(String str, List list) {
        this(str, false, list, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ble)) {
            return false;
        }
        ble bleVar = (ble) obj;
        if (this.b != bleVar.b || !this.c.equals(bleVar.c) || !this.d.equals(bleVar.d)) {
            return false;
        }
        if (this.a.startsWith("index_")) {
            return bleVar.a.startsWith("index_");
        }
        return this.a.equals(bleVar.a);
    }

    public final int hashCode() {
        return ((((((this.a.startsWith("index_") ? -1184239155 : this.a.hashCode()) * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Index{name='" + this.a + "', unique=" + this.b + ", columns=" + this.c + ", orders=" + this.d + '}';
    }

    public ble(String str, boolean z, List list, List list2) {
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = (list2 == null || list2.size() == 0) ? Collections.nCopies(list.size(), "ASC") : list2;
    }
}
