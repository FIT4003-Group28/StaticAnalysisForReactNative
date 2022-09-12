package defpackage;

import android.view.View;
/* renamed from: agsz  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class agsz implements bbc {
    static final bbc a = new agsz();

    private agsz() {
    }

    @Override // defpackage.bbc
    public final void a(View view, float f) {
        int width = view.getWidth();
        float abs = Math.abs(f);
        if (abs > 1.0f) {
            view.setAlpha(0.0f);
            return;
        }
        view.setAlpha(1.0f - abs);
        view.setTranslationX((-f) * width);
    }
}
