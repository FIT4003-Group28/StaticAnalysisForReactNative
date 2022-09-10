package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: chzu  reason: default package */
/* loaded from: classes4.dex */
public final class chzu {
    public static final dcqe a = dcqe.c("chzu");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static chza a(final View view) {
        final float G = od.G(view);
        od.F(view, -1.0f);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.SCALE_X, 0.9f), PropertyValuesHolder.ofFloat(View.SCALE_Y, 0.9f));
        ofPropertyValuesHolder.setDuration(150L);
        ofPropertyValuesHolder.setInterpolator(new aon());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f);
        ofFloat.setDuration(50L);
        ofFloat.setStartDelay(100L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofPropertyValuesHolder, ofFloat);
        return chza.g(150L, animatorSet, new Runnable(view, G) { // from class: chzq
            private final View a;
            private final float b;

            {
                this.a = view;
                this.b = G;
            }

            @Override // java.lang.Runnable
            public final void run() {
                View view2 = this.a;
                od.F(view2, this.b);
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                view2.setAlpha(1.0f);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public static chza b(chyv chyvVar, acl aclVar, acl aclVar2) {
        final View o = cqkx.o((cqkp) chyvVar);
        if (o == null) {
            return null;
        }
        View view = aclVar.a;
        if (!(view instanceof FrameLayout)) {
            return null;
        }
        final FrameLayout frameLayout = (FrameLayout) view;
        if (frameLayout.getChildCount() == 1 && !(frameLayout.getChildAt(0) instanceof FrameLayout)) {
            return null;
        }
        final FrameLayout frameLayout2 = (FrameLayout) aclVar2.a;
        final FrameLayout frameLayout3 = (FrameLayout) frameLayout.getChildAt(0);
        final LinearLayout linearLayout = (LinearLayout) frameLayout3.getChildAt(0);
        LinearLayout linearLayout2 = (LinearLayout) ((FrameLayout) frameLayout2.getChildAt(0)).getChildAt(0);
        ViewGroup viewGroup = (ViewGroup) o.getParent();
        final View childAt = viewGroup.getChildAt(viewGroup.indexOfChild(o) + 1);
        frameLayout2.setAlpha(0.0f);
        final float G = od.G(frameLayout);
        od.F(frameLayout, -1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o, View.TRANSLATION_Y, cqrp.d(-17.0d).NR(o.getContext()));
        ofFloat.setInterpolator(chyx.a);
        ofFloat.setDuration(500L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(o, View.ALPHA, 0.0f);
        ofFloat2.setDuration(150L);
        animatorSet2.playTogether(ofFloat, ofFloat2);
        if (childAt != null) {
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f);
            ofFloat3.setDuration(150L);
            animatorSet2.play(ofFloat3).with(ofFloat2);
        }
        final chza g = chza.g(500L, animatorSet2, new Runnable(o, childAt) { // from class: chzl
            private final View a;
            private final View b;

            {
                this.a = o;
                this.b = childAt;
            }

            @Override // java.lang.Runnable
            public final void run() {
                View view2 = this.a;
                View view3 = this.b;
                view2.setTranslationY(0.0f);
                view2.setAlpha(1.0f);
                if (view3 != null) {
                    view3.setAlpha(1.0f);
                }
            }
        });
        float height = frameLayout2.getHeight() / frameLayout.getHeight();
        final ViewGroupOverlay overlay = frameLayout.getOverlay();
        overlay.add(linearLayout);
        od.t(linearLayout, bvox.a(frameLayout) ? 1 : 0);
        GmmRecyclerView gmmRecyclerView = (GmmRecyclerView) aclVar.a.getParent();
        abg abgVar = gmmRecyclerView.k;
        dbsk.s(abgVar);
        int c = abgVar.c() - 1;
        aag aagVar = (aag) gmmRecyclerView.l;
        dbsk.s(aagVar);
        int af = aagVar.af();
        if (af == c) {
            frameLayout3.setPivotY(frameLayout3.getHeight());
            linearLayout.setPivotY(linearLayout.getHeight());
            frameLayout.setPivotY(frameLayout.getHeight());
        } else {
            frameLayout3.setPivotY(0.0f);
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(frameLayout3, View.SCALE_Y, height);
        ofFloat4.setInterpolator(chyx.a);
        ofFloat4.setDuration(750L);
        final chza g2 = chza.g(750L, ofFloat4, new Runnable(overlay, frameLayout3, linearLayout) { // from class: chzm
            private final ViewGroupOverlay a;
            private final FrameLayout b;
            private final LinearLayout c;

            {
                this.a = overlay;
                this.b = frameLayout3;
                this.c = linearLayout;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ViewGroupOverlay viewGroupOverlay = this.a;
                FrameLayout frameLayout4 = this.b;
                LinearLayout linearLayout3 = this.c;
                viewGroupOverlay.clear();
                frameLayout4.addView(linearLayout3);
                frameLayout4.setScaleY(1.0f);
            }
        });
        int height2 = o.getHeight();
        int indexOfChild = viewGroup.indexOfChild(o);
        final ArrayList arrayList = new ArrayList();
        AnimatorSet animatorSet3 = new AnimatorSet();
        boolean z = chyvVar.c() == chyw.PUBLISH_LIST || chyvVar.c() == chyw.ADD_LIST_DESCRIPTION || chyvVar.c() == chyw.ADD_LIST_ITEM_NOTE;
        int height3 = cqhu.a(viewGroup, cihe.b) == null ? 0 : viewGroup.getChildAt(1).getHeight();
        LinearLayout linearLayout3 = (LinearLayout) cqhu.a(linearLayout, cihe.a);
        LinearLayout linearLayout4 = (LinearLayout) cqhu.a(linearLayout2, cihe.a);
        int height4 = (!z || linearLayout3 == null || linearLayout4 == null) ? 0 : linearLayout4.getHeight() - linearLayout3.getHeight();
        if (af == c) {
            if (linearLayout3 != null && z) {
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(linearLayout3, View.TRANSLATION_Y, (height2 + height3) - height4);
                ofFloat5.setInterpolator(chyx.a);
                ofFloat5.setDuration(750L);
                arrayList.add(linearLayout3);
                animatorSet3.play(ofFloat5);
            }
            for (int i = 0; i < indexOfChild; i++) {
                View childAt2 = viewGroup.getChildAt(i);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(childAt2, View.TRANSLATION_Y, height2 + height3 + height4);
                ofFloat6.setInterpolator(chyx.a);
                ofFloat6.setDuration(750L);
                arrayList.add(childAt2);
                animatorSet3.play(ofFloat6);
            }
        } else {
            int i2 = 1;
            int i3 = indexOfChild + 1;
            while (i3 < viewGroup.getChildCount()) {
                View childAt3 = viewGroup.getChildAt(i3);
                Property property = View.TRANSLATION_Y;
                float[] fArr = new float[i2];
                fArr[0] = ((-height2) - height3) + height4;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(childAt3, property, fArr);
                ofFloat7.setInterpolator(chyx.a);
                ofFloat7.setDuration(750L);
                arrayList.add(childAt3);
                animatorSet3.play(ofFloat7);
                i3++;
                i2 = 1;
            }
        }
        final chza g3 = chza.g(750L, animatorSet3, new Runnable(arrayList) { // from class: chzo
            private final List a;

            {
                this.a = arrayList;
            }

            @Override // java.lang.Runnable
            public final void run() {
                for (View view2 : this.a) {
                    view2.setTranslationY(0.0f);
                }
            }
        });
        chzb chzbVar = (chzb) g;
        chzb chzbVar2 = (chzb) g2;
        chzb chzbVar3 = (chzb) g3;
        animatorSet.playTogether(chzbVar.b, chzbVar2.b, chzbVar3.b);
        return chza.f(decn.c(chzbVar.a, chzbVar2.a, chzbVar3.a), animatorSet, chzh.e(750L, 50L, chyx.a, aclVar2.d()), new Runnable(g, g2, g3, frameLayout, G, frameLayout2) { // from class: chzn
            private final chza a;
            private final chza b;
            private final chza c;
            private final FrameLayout d;
            private final float e;
            private final FrameLayout f;

            {
                this.a = g;
                this.b = g2;
                this.c = g3;
                this.d = frameLayout;
                this.e = G;
                this.f = frameLayout2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                chza chzaVar = this.a;
                chza chzaVar2 = this.b;
                chza chzaVar3 = this.c;
                FrameLayout frameLayout4 = this.d;
                float f = this.e;
                FrameLayout frameLayout5 = this.f;
                chzaVar.e();
                chzaVar2.e();
                chzaVar3.e();
                od.F(frameLayout4, f);
                frameLayout5.setAlpha(1.0f);
            }
        });
    }
}
