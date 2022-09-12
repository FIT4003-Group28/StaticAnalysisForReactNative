package defpackage;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
/* compiled from: PG */
/* renamed from: ciyz  reason: default package */
/* loaded from: classes4.dex */
final class ciyz implements View.OnAttachStateChangeListener {
    final /* synthetic */ cizb a;

    public ciyz(cizb cizbVar) {
        this.a = cizbVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        cizb cizbVar = this.a;
        if (cizbVar.b) {
            cizbVar.b = false;
            cizbVar.i();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View a = cqhu.a(view, ciyw.a);
        if (a instanceof LottieAnimationView) {
            try {
                ((LottieAnimationView) a).g();
            } catch (NullPointerException unused) {
            }
        }
    }
}
