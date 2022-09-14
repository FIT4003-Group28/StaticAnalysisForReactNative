package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: cqkr  reason: default package */
/* loaded from: classes.dex */
public final class cqkr {
    final cqqe<cqkp, List<WeakReference<cqiy<?>>>> a = new cqqe<>();

    public cqkr() {
        Collections.newSetFromMap(new IdentityHashMap());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <V extends cqkp> List<WeakReference<cqiy<V>>> a(V v, boolean z) {
        ArrayList arrayList = (List<WeakReference<cqiy<V>>>) this.a.c(v);
        if (arrayList == null && z) {
            arrayList = new ArrayList();
            this.a.b(v, arrayList);
        }
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (arrayList.get(size).isEnqueued()) {
                    arrayList.remove(size);
                }
            }
        }
        return arrayList;
    }

    public final void b() {
        Collection<List<WeakReference<cqiy<?>>>> values;
        cqiy<?> cqiyVar;
        View rootView;
        HashSet<View> hashSet = new HashSet();
        cqqe<cqkp, List<WeakReference<cqiy<?>>>> cqqeVar = this.a;
        synchronized (cqqeVar.b) {
            values = cqqeVar.b.values();
        }
        for (List<WeakReference<cqiy<?>>> list : values) {
            if (list != null) {
                for (WeakReference<cqiy<?>> weakReference : list) {
                    if (weakReference != null && (cqiyVar = weakReference.get()) != null && (rootView = cqiyVar.c.getRootView()) != null) {
                        hashSet.add(rootView);
                    }
                }
            }
        }
        for (View view : hashSet) {
            cqkx.a(view);
        }
    }
}
