package defpackage;

import android.animation.Animator;
import android.view.View;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: eiu  reason: default package */
/* loaded from: classes6.dex */
public final class eiu extends cqfb {
    @dzsi
    private static eij c(View view) {
        if (!(view instanceof LottieAnimationView)) {
            return null;
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) view;
        Object tag = lottieAnimationView.getTag(R.id.lottie_animation_controller);
        if (tag instanceof eij) {
            return (eij) tag;
        }
        eij eijVar = new eij(lottieAnimationView);
        lottieAnimationView.addOnAttachStateChangeListener(eijVar);
        lottieAnimationView.setTag(R.id.lottie_animation_controller, eijVar);
        return eijVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.cqfb, defpackage.cqkv
    public final boolean a(cqku cqkuVar, @dzsi Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof eis) {
            eis eisVar = eis.AUTO_PLAY;
            switch (((eis) cqkuVar).ordinal()) {
                case 0:
                    eij c = c(view);
                    if (c != null && (obj instanceof Boolean)) {
                        c.a = ((Boolean) obj).booleanValue();
                        return true;
                    }
                    break;
                case 1:
                    if (view instanceof LottieAnimationView) {
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) view;
                        if (obj instanceof Boolean) {
                            lottieAnimationView.b(((Boolean) obj).booleanValue());
                            return true;
                        }
                    }
                    return false;
                case 2:
                    if (view instanceof LottieAnimationView) {
                        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) view;
                        if (obj instanceof ImageView.ScaleType) {
                            lottieAnimationView2.setScaleType((ImageView.ScaleType) obj);
                            return true;
                        }
                    }
                    return false;
                case 3:
                    eij c2 = c(view);
                    if (c2 == null) {
                        return false;
                    }
                    if (obj == null) {
                        c2.b = null;
                        c2.c();
                        return true;
                    } else if (!(obj instanceof eik)) {
                        return false;
                    } else {
                        c2.a((eik) obj);
                        return true;
                    }
                case 4:
                    if (view instanceof LottieAnimationView) {
                        LottieAnimationView lottieAnimationView3 = (LottieAnimationView) view;
                        if (obj instanceof eim) {
                            lottieAnimationView3.setTextDelegate(((eim) obj).a(lottieAnimationView3));
                            return true;
                        }
                    }
                    return false;
                case 5:
                    if (view instanceof LottieAnimationView) {
                        LottieAnimationView lottieAnimationView4 = (LottieAnimationView) view;
                        if (obj instanceof bik) {
                            lottieAnimationView4.setFontAssetDelegate((bik) obj);
                            return true;
                        }
                    }
                    return false;
                case 6:
                    if (view instanceof LottieAnimationView) {
                        LottieAnimationView lottieAnimationView5 = (LottieAnimationView) view;
                        if (obj instanceof bil) {
                            lottieAnimationView5.setImageAssetDelegate((bil) obj);
                            return true;
                        }
                    }
                    return false;
                case 7:
                    if (view instanceof LottieAnimationView) {
                        LottieAnimationView lottieAnimationView6 = (LottieAnimationView) view;
                        if (obj instanceof Animator.AnimatorListener) {
                            lottieAnimationView6.d.b.addListener((Animator.AnimatorListener) obj);
                            return true;
                        }
                    }
                    return false;
            }
        }
        return false;
    }
}
