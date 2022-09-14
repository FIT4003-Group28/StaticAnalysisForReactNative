package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ayr  reason: default package */
/* loaded from: classes3.dex */
public final class ayr {
    static final ArrayList<ViewGroup> a;
    private static final ThreadLocal<WeakReference<aif<ViewGroup, ArrayList<ayn>>>> b;

    static {
        new axc();
        b = new ThreadLocal<>();
        a = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aif<ViewGroup, ArrayList<ayn>> a() {
        aif<ViewGroup, ArrayList<ayn>> aifVar;
        ThreadLocal<WeakReference<aif<ViewGroup, ArrayList<ayn>>>> threadLocal = b;
        WeakReference<aif<ViewGroup, ArrayList<ayn>>> weakReference = threadLocal.get();
        if (weakReference == null || (aifVar = weakReference.get()) == null) {
            aif<ViewGroup, ArrayList<ayn>> aifVar2 = new aif<>();
            threadLocal.set(new WeakReference<>(aifVar2));
            return aifVar2;
        }
        return aifVar;
    }

    public static void b(ViewGroup viewGroup, ayn aynVar) {
        ArrayList<ViewGroup> arrayList = a;
        if (arrayList.contains(viewGroup) || !od.ae(viewGroup)) {
            return;
        }
        arrayList.add(viewGroup);
        ayn clone = aynVar.clone();
        ArrayList<ayn> arrayList2 = a().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                arrayList2.get(i).o(viewGroup);
            }
        }
        if (clone != null) {
            clone.k(viewGroup, true);
        }
        if (((axz) viewGroup.getTag(R.id.transition_current_scene)) != null) {
            throw null;
        }
        viewGroup.setTag(R.id.transition_current_scene, null);
        if (clone == null || viewGroup == null) {
            return;
        }
        ayq ayqVar = new ayq(clone, viewGroup);
        viewGroup.addOnAttachStateChangeListener(ayqVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(ayqVar);
    }
}
