package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: blf  reason: default package */
/* loaded from: classes2.dex */
public final class blf {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public blf(String str, Map map, Set set, Set set2) {
        this.a = str;
        this.b = Collections.unmodifiableMap(map);
        this.c = Collections.unmodifiableSet(set);
        this.d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0291 A[Catch: all -> 0x02bb, TryCatch #3 {all -> 0x02bb, blocks: (B:34:0x0196, B:39:0x01af, B:40:0x01b4, B:42:0x01ba, B:44:0x01c6, B:48:0x01d4, B:67:0x0282, B:71:0x0291, B:68:0x0286, B:49:0x01ec, B:55:0x0211, B:56:0x021b, B:58:0x0221, B:60:0x0227, B:65:0x0248, B:66:0x0259), top: B:94:0x0196 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.blf a(defpackage.blv r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blf.a(blv, java.lang.String):blf");
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blf)) {
            return false;
        }
        blf blfVar = (blf) obj;
        if (!this.a.equals(blfVar.a)) {
            return false;
        }
        Map map = this.b;
        if (map == null ? blfVar.b != null : !map.equals(blfVar.b)) {
            return false;
        }
        Set set2 = this.c;
        if (set2 == null ? blfVar.c != null : !set2.equals(blfVar.c)) {
            return false;
        }
        Set set3 = this.d;
        if (set3 != null && (set = blfVar.d) != null) {
            return set3.equals(set);
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map map = this.b;
        int i = 0;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}
