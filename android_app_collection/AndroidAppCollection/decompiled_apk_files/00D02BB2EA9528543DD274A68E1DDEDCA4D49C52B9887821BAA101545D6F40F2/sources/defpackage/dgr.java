package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dgr  reason: default package */
/* loaded from: classes6.dex */
public final class dgr {
    public final ImageView a;
    public final akse b = new akse();
    public final Animator c;
    public final dgm d;

    public dgr(Context context, ImageView imageView, bvlo bvloVar) {
        dgm dgmVar = new dgm();
        this.d = dgmVar;
        this.a = imageView;
        imageView.setImageDrawable(bvloVar.b(context.getResources(), R.raw.offscreen_indicator_ripple, bvlw.a));
        Animator loadAnimator = AnimatorInflater.loadAnimator(context, R.animator.offscreen_indicator_ripple);
        this.c = loadAnimator;
        loadAnimator.setTarget(imageView);
        loadAnimator.addListener(dgmVar);
        dgn.a(imageView, new dgp(this) { // from class: dgq
            private final dgr a;

            {
                this.a = this;
            }

            @Override // defpackage.dgp
            public final void a(View view) {
                dgr dgrVar = this.a;
                dgrVar.b.b = dgrVar.a.getWidth() * 0.5f;
                dgrVar.b.c = dgrVar.a.getHeight() * 0.5f;
            }
        });
    }
}
