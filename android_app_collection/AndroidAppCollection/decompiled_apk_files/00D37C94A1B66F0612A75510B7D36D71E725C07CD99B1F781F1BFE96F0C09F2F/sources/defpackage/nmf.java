package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nmf  reason: default package */
/* loaded from: classes3.dex */
public final class nmf implements zar {
    public final float a;

    public nmf(float f) {
        this.a = f;
    }

    @Override // defpackage.zar
    public final void a(View view, long j, zaq zaqVar) {
        View findViewById = view.findViewById(R.id.panel_header);
        View findViewById2 = view.findViewById(R.id.panel_subheader);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new nme(this, view, findViewById, findViewById2));
        ofFloat.addListener(zav.a(zaqVar));
        ofFloat.start();
    }

    @Override // defpackage.zar
    public final void b(View view, long j, zaq zaqVar) {
        View findViewById = view.findViewById(R.id.panel_header);
        View findViewById2 = view.findViewById(R.id.panel_subheader);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new nme(this, view, findViewById, findViewById2, 1));
        ofFloat.addListener(zav.a(zaqVar));
        ofFloat.start();
    }

    @Override // defpackage.zar
    public final void c(View view) {
        view.setAlpha(1.0f);
        view.findViewById(R.id.panel_header).setTranslationX(0.0f);
        view.findViewById(R.id.panel_subheader).setTranslationX(0.0f);
        lj.q(view).a();
    }
}
