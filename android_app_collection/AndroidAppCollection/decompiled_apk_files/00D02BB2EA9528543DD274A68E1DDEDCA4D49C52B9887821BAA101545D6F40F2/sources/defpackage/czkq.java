package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: czkq  reason: default package */
/* loaded from: classes5.dex */
public final class czkq {
    private final Map<Uri, czkm<?>> a = new HashMap();
    private final Map<Uri, czko<?>> b = new HashMap();
    private final Executor c;
    private final czif d;
    private final defg<Uri, String> e;
    private final Map<String, czmn> f;
    private final czmt g;

    public czkq(Executor executor, czif czifVar, czmt czmtVar, Map map) {
        dbsk.s(executor);
        this.c = executor;
        dbsk.s(czifVar);
        this.d = czifVar;
        this.g = czmtVar;
        this.f = map;
        dbsk.a(!map.isEmpty());
        this.e = czkp.a;
    }

    public final synchronized <T extends dssj> czkm<T> a(czko<T> czkoVar) {
        czkm<T> czkmVar;
        Uri a = czkoVar.a();
        czkmVar = (czkm<T>) this.a.get(a);
        if (czkmVar == null) {
            Uri a2 = czkoVar.a();
            dbsk.g(a2.isHierarchical(), "Uri must be hierarchical: %s", a2);
            String e = dbsj.e(a2.getLastPathSegment());
            int lastIndexOf = e.lastIndexOf(46);
            boolean z = true;
            dbsk.g((lastIndexOf == -1 ? "" : e.substring(lastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", a2);
            dbsk.b(czkoVar.b() != null, "Proto schema cannot be null");
            dbsk.b(czkoVar.c() != null, "Handler cannot be null");
            String b = czkoVar.e().b();
            czmn czmnVar = this.f.get(b);
            if (czmnVar == null) {
                z = false;
            }
            dbsk.g(z, "No XDataStoreVariantFactory registered for ID %s", b);
            String e2 = dbsj.e(czkoVar.a().getLastPathSegment());
            int lastIndexOf2 = e2.lastIndexOf(46);
            if (lastIndexOf2 != -1) {
                e2 = e2.substring(0, lastIndexOf2);
            }
            czkmVar = new czkm<>(czmnVar.b(czkoVar, e2, this.c, this.d, czjw.a), this.g, deew.g(deha.a(czkoVar.a()), this.e, dege.a), czkoVar.g(), czkoVar.h());
            dcdc<czkg<T>> d = czkoVar.d();
            if (!d.isEmpty()) {
                czkmVar.a(new czkl(d, this.c));
            }
            this.a.put(a, czkmVar);
            this.b.put(a, czkoVar);
        } else {
            dbsk.g(czkoVar.equals(this.b.get(a)), "Arguments must match previous call for Uri: %s", a);
        }
        return czkmVar;
    }
}
