package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aza  reason: default package */
/* loaded from: classes3.dex */
final class aza {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Animator a(View view, ayx ayxVar, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, ayn aynVar) {
        float f5;
        float f6;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) ayxVar.b.getTag(R.id.transition_position);
        if (iArr != null) {
            f5 = (iArr[0] - i) + translationX;
            f6 = (iArr[1] - i2) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = i + Math.round(f5 - translationX);
        int round2 = i2 + Math.round(f6 - translationY);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f5, f3), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f6, f4));
        ayz ayzVar = new ayz(view, ayxVar.b, round, round2, translationX, translationY);
        aynVar.A(ayzVar);
        ofPropertyValuesHolder.addListener(ayzVar);
        ofPropertyValuesHolder.addPauseListener(ayzVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
