package defpackage;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: vlj  reason: default package */
/* loaded from: classes7.dex */
public final class vlj {
    public static final Interpolator a = new DecelerateInterpolator(2.0f);
    public final List<vli> b = new ArrayList();

    private static vli b(View view, View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        TranslateAnimation translateAnimation = new TranslateAnimation(0, iArr[0] - iArr2[0], 1, 0.0f, 0, iArr[1] - iArr2[1], 1, 0.0f);
        translateAnimation.setDuration(200L);
        translateAnimation.setInterpolator(a);
        return new vli(view, translateAnimation);
    }

    public final void a(View view, View view2) {
        this.b.add(b(view, view2));
        this.b.add(b(view2, view));
    }
}
