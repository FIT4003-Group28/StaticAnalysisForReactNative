package defpackage;

import com.google.protos.youtube.api.innertube.HomeAdsPanelRendererOuterClass;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: mas  reason: default package */
/* loaded from: classes3.dex */
public final class mas {
    public final Map a = new HashMap();
    public final Map b = new WeakHashMap();
    public final ArrayDeque c = new ArrayDeque();
    public final airr d;
    private final azqb e;
    private maq f;

    public mas(azqb azqbVar, airr airrVar) {
        this.e = azqbVar;
        this.d = airrVar;
    }

    public final maq a() {
        maq maqVar = this.f;
        if (maqVar == null) {
            maq maqVar2 = (maq) this.e.get();
            this.f = maqVar2;
            maqVar2.a.ai = this;
            return maqVar2;
        }
        return maqVar;
    }

    public final void b(List list, auqh auqhVar) {
        Map map = this.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aunb aunbVar = (aunb) it.next();
            if (aunbVar.qn(HomeAdsPanelRendererOuterClass.homeAdsPanelRenderer)) {
                arrayList.add((argn) aunbVar.qm(HomeAdsPanelRendererOuterClass.homeAdsPanelRenderer));
            }
        }
        map.put(auqhVar, arrayList);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            aunb aunbVar2 = (aunb) it2.next();
            if (aunbVar2.qn(HomeAdsPanelRendererOuterClass.homeAdsPanelRenderer)) {
                argn argnVar = (argn) aunbVar2.qm(HomeAdsPanelRendererOuterClass.homeAdsPanelRenderer);
                this.a.put(argnVar.c, argnVar);
            }
        }
    }

    public final void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            argn argnVar = (argn) it.next();
            this.a.put(argnVar.c, argnVar);
        }
    }
}
