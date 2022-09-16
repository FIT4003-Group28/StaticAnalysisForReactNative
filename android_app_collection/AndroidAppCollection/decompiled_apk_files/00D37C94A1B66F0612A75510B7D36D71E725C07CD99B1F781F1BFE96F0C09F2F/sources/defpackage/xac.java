package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xac  reason: default package */
/* loaded from: classes4.dex */
public final class xac {
    public static final xac a = b(new xal[0]);
    private final Map b = new HashMap();

    private xac(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xal xalVar = (xal) it.next();
            this.b.put(xalVar.getClass(), xalVar);
        }
    }

    public static xac a(List list) {
        return new xac(list);
    }

    public static xac b(xal... xalVarArr) {
        return new xac(Arrays.asList(xalVarArr));
    }

    public final Object c(Class cls) {
        xal xalVar = (xal) this.b.get(cls);
        if (xalVar != null) {
            return xalVar.a;
        }
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("Unable to retrieve getter for class: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean d(Class cls) {
        return this.b.containsKey(cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.xac
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            xac r6 = (defpackage.xac) r6
            java.util.Map r0 = r5.b
            int r0 = r0.size()
            java.util.Map r2 = r6.b
            int r2 = r2.size()
            if (r0 == r2) goto L17
            return r1
        L17:
            java.util.Map r0 = r5.b
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L51
            java.lang.Object r2 = r0.next()
            java.lang.Class r2 = (java.lang.Class) r2
            java.util.Map r3 = r6.b
            boolean r3 = r3.containsKey(r2)
            if (r3 != 0) goto L36
            return r1
        L36:
            java.util.Map r3 = r5.b
            java.lang.Object r3 = r3.get(r2)
            xal r3 = (defpackage.xal) r3
            java.util.Map r4 = r6.b
            java.lang.Object r2 = r4.get(r2)
            xal r2 = (defpackage.xal) r2
            java.lang.Object r3 = r3.a
            java.lang.Object r2 = r2.a
            boolean r2 = defpackage.akzj.f(r3, r2)
            if (r2 != 0) goto L21
            return r1
        L51:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xac.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientMetadata[");
        for (Class cls : this.b.keySet()) {
            sb.append(cls);
            sb.append("->");
            sb.append(this.b.get(cls));
            sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
