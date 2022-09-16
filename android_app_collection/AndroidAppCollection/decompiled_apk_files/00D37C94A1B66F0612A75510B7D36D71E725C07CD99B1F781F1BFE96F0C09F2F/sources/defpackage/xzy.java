package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xzy  reason: default package */
/* loaded from: classes4.dex */
public final class xzy implements aafo {
    private final HashSet a;
    private final aafo b;

    public xzy(aafo aafoVar) {
        this.a = new HashSet(1);
        this.b = aafoVar;
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void a(apzg apzgVar) {
        aafn.a(this, apzgVar);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void b(List list) {
        aafn.b(this, list);
    }

    @Override // defpackage.aafo
    public final void c(apzg apzgVar, Map map) {
        this.b.c(apzgVar, map);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((xzw) it.next()).a(apzgVar);
        }
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void d(List list, Map map) {
        aafn.c(this, list, map);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void e(List list, Object obj) {
        aafn.d(this, list, obj);
    }

    public final void f(xzw xzwVar) {
        this.a.add(xzwVar);
    }

    public xzy(aafo aafoVar, xzw xzwVar) {
        this(aafoVar);
        f(xzwVar);
    }
}
