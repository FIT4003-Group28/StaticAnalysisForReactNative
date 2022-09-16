package defpackage;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
/* compiled from: PG */
/* renamed from: beon  reason: default package */
/* loaded from: classes3.dex */
final class beon implements cqfc {
    final /* synthetic */ beoq a;

    public beon(beoq beoqVar) {
        this.a = beoqVar;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        bgym bgymVar = this.a.e;
        cqss m = ibl.m();
        if (!(view instanceof LottieAnimationView) || !bgymVar.b.a().h()) {
            return;
        }
        bgymVar.a((LottieAnimationView) view, m);
    }
}
