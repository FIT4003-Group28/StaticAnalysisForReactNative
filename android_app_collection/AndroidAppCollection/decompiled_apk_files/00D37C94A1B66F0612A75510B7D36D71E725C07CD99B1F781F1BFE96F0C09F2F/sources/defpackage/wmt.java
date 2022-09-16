package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: wmt  reason: default package */
/* loaded from: classes4.dex */
public final class wmt {
    public aafo a = null;
    private final aafo b;

    public wmt(aafo aafoVar) {
        this.b = aafoVar;
    }

    private static final void d(aafo aafoVar, apzg apzgVar, Map map) {
        if (aafoVar == null) {
            wwf.a(null, "Unable to resolve endpoint because commandRouter inaccessible");
        } else {
            aafoVar.c(apzgVar, map);
        }
    }

    public final void a(List list, Map map) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d(this.a, (apzg) it.next(), map);
        }
    }

    public final void b(apzg apzgVar, Map map) {
        d(this.b, apzgVar, map);
    }

    public final void c(apzg apzgVar, Map map) {
        d(this.a, apzgVar, map);
    }
}
