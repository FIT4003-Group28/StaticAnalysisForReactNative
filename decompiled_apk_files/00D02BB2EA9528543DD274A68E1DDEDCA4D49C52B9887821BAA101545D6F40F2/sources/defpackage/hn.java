package defpackage;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hn  reason: default package */
/* loaded from: classes.dex */
public final class hn extends hr {
    private static boolean v(Transition transition) {
        return !t(transition.getTargetIds()) || !t(transition.getTargetNames()) || !t(transition.getTargetTypes());
    }

    @Override // defpackage.hr
    public final boolean a(Object obj) {
        return obj instanceof Transition;
    }

    @Override // defpackage.hr
    public final Object b(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // defpackage.hr
    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // defpackage.hr
    public final void d(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            s(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        f(transitionSet, arrayList);
    }

    @Override // defpackage.hr
    public final void e(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            u(view, rect);
            ((Transition) obj).setEpicenterCallback(new hi(rect));
        }
    }

    @Override // defpackage.hr
    public final void f(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                f(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
        } else if (v(transition) || !t(transition.getTargets())) {
        } else {
            int size = arrayList.size();
            while (i < size) {
                transition.addTarget(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // defpackage.hr
    public final Object g(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // defpackage.hr
    public final void h(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new hj(view, arrayList));
    }

    @Override // defpackage.hr
    public final void i(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // defpackage.hr
    public final void j(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new hk(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // defpackage.hr
    public final void k(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            l(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // defpackage.hr
    public final void l(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                l(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (v(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
        } else {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            int size2 = arrayList.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return;
                }
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    @Override // defpackage.hr
    public final void m(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // defpackage.hr
    public final void n(Object obj, View view) {
        ((Transition) obj).removeTarget(view);
    }

    @Override // defpackage.hr
    public final void o(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new hm(rect));
        }
    }

    @Override // defpackage.hr
    public final void p(Object obj, akq akqVar, Runnable runnable) {
        ((Transition) obj).addListener(new hl(runnable));
    }
}
