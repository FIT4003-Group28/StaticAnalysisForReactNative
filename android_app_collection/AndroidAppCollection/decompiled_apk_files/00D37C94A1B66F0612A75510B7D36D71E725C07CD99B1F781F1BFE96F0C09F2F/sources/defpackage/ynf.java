package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ynf  reason: default package */
/* loaded from: classes4.dex */
public final class ynf implements Runnable {
    private final yni a;
    private final Object b;
    private final Object c;

    public ynf(yni yniVar, Object obj, Object obj2) {
        this.a = yniVar;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Collection<ynk> collection;
        Object obj = this.c;
        obj.getClass();
        yni yniVar = this.a;
        yniVar.d.readLock().lock();
        ArrayList arrayList = null;
        try {
            Map map = yniVar.b;
            Class<?> cls = obj.getClass();
            if (!map.containsKey(cls)) {
                collection = amyg.a;
            } else {
                Set set = (Set) map.get(cls);
                if (set != null && !set.isEmpty()) {
                    collection = amvn.p(set);
                }
                collection = amyg.a;
            }
            yniVar.d.readLock().unlock();
        } catch (Exception e) {
            zep.d("exception ", e);
            yniVar.d.readLock().unlock();
            collection = null;
        }
        if (collection != null && !collection.isEmpty()) {
            for (ynk ynkVar : collection) {
                if (ynkVar.a() == null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(ynkVar);
                } else {
                    int i = ynkVar.c;
                    if (i == this.b.hashCode() || i == yni.a.hashCode()) {
                        ynkVar.b.a(this.c);
                    }
                }
            }
            if (arrayList == null) {
                return;
            }
            this.a.k(arrayList);
        }
    }
}
