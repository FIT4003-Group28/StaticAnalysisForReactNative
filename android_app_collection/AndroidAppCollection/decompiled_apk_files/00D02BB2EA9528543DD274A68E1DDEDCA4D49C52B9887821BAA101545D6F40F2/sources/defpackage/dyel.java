package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dyel  reason: default package */
/* loaded from: classes6.dex */
public final class dyel {
    public static final dyel b = new dyel(Collections.emptyMap());
    public final Map<dyek<?>, Object> a;

    public dyel(Map<dyek<?>, Object> map) {
        this.a = map;
    }

    public static dyej b() {
        return new dyej(b);
    }

    @dzsi
    public final <T> T a(dyek<T> dyekVar) {
        return (T) this.a.get(dyekVar);
    }

    public final dyej c() {
        return new dyej(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L5c
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L12
            goto L5c
        L12:
            dyel r7 = (defpackage.dyel) r7
            java.util.Map<dyek<?>, java.lang.Object> r2 = r6.a
            int r2 = r2.size()
            java.util.Map<dyek<?>, java.lang.Object> r3 = r7.a
            int r3 = r3.size()
            if (r2 == r3) goto L23
            return r1
        L23:
            java.util.Map<dyek<?>, java.lang.Object> r2 = r6.a
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L2d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5b
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.util.Map<dyek<?>, java.lang.Object> r4 = r7.a
            java.lang.Object r5 = r3.getKey()
            boolean r4 = r4.containsKey(r5)
            if (r4 != 0) goto L46
            return r1
        L46:
            java.lang.Object r4 = r3.getValue()
            java.util.Map<dyek<?>, java.lang.Object> r5 = r7.a
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r5.get(r3)
            boolean r3 = defpackage.dbsd.a(r4, r3)
            if (r3 != 0) goto L2d
            return r1
        L5b:
            return r0
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyel.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry<dyek<?>, Object> entry : this.a.entrySet()) {
            i += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return i;
    }

    public final String toString() {
        return this.a.toString();
    }
}
