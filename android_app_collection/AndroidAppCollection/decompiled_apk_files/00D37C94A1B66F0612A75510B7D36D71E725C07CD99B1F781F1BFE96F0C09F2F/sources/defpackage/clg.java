package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: clg  reason: default package */
/* loaded from: classes2.dex */
final class clg {
    private final clf a = new clf(null);
    private final Map b = new HashMap();

    private static void d(clf clfVar) {
        clf clfVar2 = clfVar.d;
        clfVar2.c = clfVar.c;
        clfVar.c.d = clfVar2;
    }

    private static void e(clf clfVar) {
        clfVar.c.d = clfVar;
        clfVar.d.c = clfVar;
    }

    public final Object a(cln clnVar) {
        clf clfVar = (clf) this.b.get(clnVar);
        if (clfVar == null) {
            clfVar = new clf(clnVar);
            this.b.put(clnVar, clfVar);
        } else {
            clnVar.a();
        }
        d(clfVar);
        clf clfVar2 = this.a;
        clfVar.d = clfVar2;
        clfVar.c = clfVar2.c;
        e(clfVar);
        return clfVar.b();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [cln, java.lang.Object] */
    public final Object b() {
        for (clf clfVar = this.a.d; !clfVar.equals(this.a); clfVar = clfVar.d) {
            Object b = clfVar.b();
            if (b != null) {
                return b;
            }
            d(clfVar);
            this.b.remove(clfVar.a);
            clfVar.a.a();
        }
        return null;
    }

    public final void c(cln clnVar, Object obj) {
        clf clfVar = (clf) this.b.get(clnVar);
        if (clfVar == null) {
            clfVar = new clf(clnVar);
            d(clfVar);
            clf clfVar2 = this.a;
            clfVar.d = clfVar2.d;
            clfVar.c = clfVar2;
            e(clfVar);
            this.b.put(clnVar, clfVar);
        } else {
            clnVar.a();
        }
        if (clfVar.b == null) {
            clfVar.b = new ArrayList();
        }
        clfVar.b.add(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        clf clfVar = this.a.c;
        boolean z = false;
        while (!clfVar.equals(this.a)) {
            sb.append('{');
            sb.append(clfVar.a);
            sb.append(':');
            sb.append(clfVar.a());
            sb.append("}, ");
            clfVar = clfVar.c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
