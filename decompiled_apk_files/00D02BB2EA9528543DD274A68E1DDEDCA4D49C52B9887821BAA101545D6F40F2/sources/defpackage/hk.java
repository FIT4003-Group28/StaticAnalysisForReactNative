package defpackage;

import android.transition.Transition;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: hk  reason: default package */
/* loaded from: classes6.dex */
final class hk implements Transition.TransitionListener {
    final /* synthetic */ Object a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ Object c;
    final /* synthetic */ ArrayList d;
    final /* synthetic */ Object e;
    final /* synthetic */ ArrayList f;
    final /* synthetic */ hn g;

    public hk(hn hnVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.g = hnVar;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
        this.e = obj3;
        this.f = arrayList3;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        Object obj = this.a;
        if (obj != null) {
            this.g.l(obj, this.b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            this.g.l(obj2, this.d, null);
        }
        Object obj3 = this.e;
        if (obj3 != null) {
            this.g.l(obj3, this.f, null);
        }
    }
}
