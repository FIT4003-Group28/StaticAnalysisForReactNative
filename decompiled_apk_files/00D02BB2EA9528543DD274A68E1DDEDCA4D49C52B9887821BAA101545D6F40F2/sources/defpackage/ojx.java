package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ojx  reason: default package */
/* loaded from: classes7.dex */
public final class ojx implements cqfc {
    public static final ojx a = new ojx();

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        view.setAlpha(0.0f);
        view.setTranslationX(true != cjxu.d(view) ? 100.0f : -100.0f);
        view.animate().alpha(1.0f).translationX(0.0f).setStartDelay(250L).setDuration(250L).setInterpolator(irf.b);
    }
}
