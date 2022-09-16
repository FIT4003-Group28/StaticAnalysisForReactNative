package defpackage;

import android.view.View;
/* renamed from: bbfq  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bbfq implements bbc {
    static final bbc a = new bbfq();

    private bbfq() {
    }

    @Override // defpackage.bbc
    public final void a(View view, float f) {
        int i;
        int i2;
        int width = view.getWidth();
        if (!view.canResolveLayoutDirection() || view.getLayoutDirection() != 1) {
            i = 0;
            i2 = 1;
        } else {
            f = -f;
            i = bbfu.a.e(view.getContext());
            i2 = -1;
        }
        if (f < -1.0f) {
            view.setAlpha(0.0f);
            od.H(view, 0.0f);
            view.setVisibility(4);
            view.setImportantForAccessibility(4);
        } else if (f <= 0.0f) {
            view.setVisibility(0);
            view.setImportantForAccessibility(1);
            float abs = Math.abs(f);
            float f2 = 1.0f - abs;
            view.setAlpha(f2);
            view.setTranslationX(i + (width * abs * i2));
            od.H(view, -1.0f);
            view.setClickable(false);
            float f3 = (f2 * 0.25f) + 0.75f;
            view.setScaleX(f3);
            view.setScaleY(f3);
        } else if (f <= 1.0f) {
            view.setAlpha(1.0f);
            view.setVisibility(0);
            view.setImportantForAccessibility(1);
            view.setTranslationX(0.0f);
            od.H(view, 0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setClickable(true);
        } else {
            view.setAlpha(1.0f);
            view.setVisibility(0);
            view.setImportantForAccessibility(4);
        }
    }
}
