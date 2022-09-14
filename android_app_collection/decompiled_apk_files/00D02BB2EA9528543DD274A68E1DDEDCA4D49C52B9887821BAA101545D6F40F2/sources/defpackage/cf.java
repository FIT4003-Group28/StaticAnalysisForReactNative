package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cf  reason: default package */
/* loaded from: classes4.dex */
public final class cf {
    public final String a;
    public final Map<String, cb> b;
    public final Set<cc> c;
    public final Set<ce> d;

    public cf(String str, Map<String, cb> map, Set<cc> set, Set<ce> set2) {
        this.a = str;
        this.b = Collections.unmodifiableMap(map);
        this.c = Collections.unmodifiableSet(set);
        this.d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0252 A[Catch: all -> 0x0272, TryCatch #4 {all -> 0x0272, blocks: (B:34:0x0196, B:39:0x01af, B:40:0x01b4, B:42:0x01ba, B:44:0x01c6, B:48:0x01d4, B:61:0x0245, B:65:0x0252, B:62:0x0249, B:49:0x01ec, B:54:0x0205, B:55:0x020a, B:57:0x0210, B:59:0x0216, B:60:0x022e), top: B:87:0x0196 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.cf a(defpackage.avu r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cf.a(avu, java.lang.String):cf");
    }

    public final boolean equals(Object obj) {
        Set<ce> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf)) {
            return false;
        }
        cf cfVar = (cf) obj;
        if (!this.a.equals(cfVar.a)) {
            return false;
        }
        Map<String, cb> map = this.b;
        if (map == null ? cfVar.b != null : !map.equals(cfVar.b)) {
            return false;
        }
        Set<cc> set2 = this.c;
        if (set2 == null ? cfVar.c != null : !set2.equals(cfVar.c)) {
            return false;
        }
        Set<ce> set3 = this.d;
        if (set3 != null && (set = cfVar.d) != null) {
            return set3.equals(set);
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map<String, cb> map = this.b;
        int i = 0;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<cc> set = this.c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}
