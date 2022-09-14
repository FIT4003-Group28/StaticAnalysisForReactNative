package defpackage;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: hj  reason: default package */
/* loaded from: classes6.dex */
final class hj implements Transition.TransitionListener {
    final /* synthetic */ View a;
    final /* synthetic */ ArrayList b;

    public hj(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.a.setVisibility(8);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.b.get(i)).setVisibility(0);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}
