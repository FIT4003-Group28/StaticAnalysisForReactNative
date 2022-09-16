package defpackage;

import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bno  reason: default package */
/* loaded from: classes2.dex */
public final class bno {
    private static final bnk b = new bnr(null);
    private static final ThreadLocal c = new ThreadLocal();
    static final ArrayList a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static afw a() {
        afw afwVar;
        ThreadLocal threadLocal = c;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference == null || (afwVar = (afw) weakReference.get()) == null) {
            afw afwVar2 = new afw();
            threadLocal.set(new WeakReference(afwVar2));
            return afwVar2;
        }
        return afwVar;
    }

    public static void b(ViewGroup viewGroup, bnk bnkVar) {
        ArrayList arrayList = a;
        if (arrayList.contains(viewGroup) || !lj.al(viewGroup)) {
            return;
        }
        arrayList.add(viewGroup);
        if (bnkVar == null) {
            bnkVar = b;
        }
        bnk clone = bnkVar.clone();
        ArrayList arrayList2 = (ArrayList) a().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((bnk) arrayList2.get(i)).r(viewGroup);
            }
        }
        if (clone != null) {
            clone.m(viewGroup, true);
        }
        if (((adi) viewGroup.getTag(R.id.transition_current_scene)) == null) {
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (clone == null || viewGroup == null) {
                return;
            }
            bnn bnnVar = new bnn(clone, viewGroup);
            viewGroup.addOnAttachStateChangeListener(bnnVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(bnnVar);
            return;
        }
        throw null;
    }

    public static void c(ViewGroup viewGroup) {
        a.remove(viewGroup);
        ArrayList arrayList = (ArrayList) a().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((bnk) arrayList2.get(size)).q(viewGroup);
        }
    }
}
