package defpackage;

import android.animation.Animator;
import android.view.View;
/* compiled from: PG */
/* renamed from: egm  reason: default package */
/* loaded from: classes6.dex */
final class egm implements egr {
    @Override // defpackage.egr
    public final Animator a(View view) {
        return eib.b(view, -eib.a(view), 0, ehn.a);
    }

    @Override // defpackage.egr
    public final Animator b(View view) {
        return eib.b(view, 0, eib.a(view), ehn.a);
    }

    @Override // defpackage.egr
    public final void c(View view) {
        view.setTranslationY(0.0f);
    }
}
