package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: fui  reason: default package */
/* loaded from: classes3.dex */
public final class fui extends bnk {
    private static final void e(bnt bntVar) {
        bntVar.a.put("hatsSurveyView:HEIGHT", Integer.valueOf(bntVar.b.getHeight()));
    }

    @Override // defpackage.bnk
    public final Animator a(ViewGroup viewGroup, bnt bntVar, bnt bntVar2) {
        if (bntVar == null || bntVar2 == null) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, "translationY", ((Integer) bntVar2.a.get("hatsSurveyView:HEIGHT")).intValue() - ((Integer) bntVar.a.get("hatsSurveyView:HEIGHT")).intValue(), 0.0f);
        ofFloat.setInterpolator(new app());
        return ofFloat;
    }

    @Override // defpackage.bnk
    public final void b(bnt bntVar) {
        e(bntVar);
    }

    @Override // defpackage.bnk
    public final void c(bnt bntVar) {
        e(bntVar);
    }
}
