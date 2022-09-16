package android.arch.lifecycle;

import java.util.List;
/* compiled from: PG */
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements j {
    private final Object a;
    private final c b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.a = obj;
        this.b = e.a.b(obj.getClass());
    }

    @Override // defpackage.j
    public final void a(apy apyVar, aps apsVar) {
        c cVar = this.b;
        Object obj = this.a;
        c.a((List) cVar.a.get(apsVar), apyVar, apsVar, obj);
        c.a((List) cVar.a.get(aps.ON_ANY), apyVar, apsVar, obj);
    }
}
