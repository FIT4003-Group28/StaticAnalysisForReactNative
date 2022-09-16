package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
/* compiled from: PG */
/* renamed from: ehc  reason: default package */
/* loaded from: classes6.dex */
final class ehc {
    public static final ValueAnimator a(View view, int i) {
        int a = i - eib.a(view);
        view.setTranslationY(a);
        return eib.b(view, a, i, ehn.a);
    }

    public static final ValueAnimator b(View view, int i) {
        int a = eib.a(view);
        view.setTranslationY(i);
        return eib.b(view, i, a + i, ehn.a);
    }
}
