package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dgl  reason: default package */
/* loaded from: classes6.dex */
public final class dgl {
    public final ImageView a;
    public final ViewGroup b;
    public final dbsg<Animator> c;
    public final dgm d;
    public float e;
    public float f;
    public float g;

    public dgl(Context context, ViewGroup viewGroup, ImageView imageView, ImageView imageView2, dfy dfyVar, bvlo bvloVar) {
        dgm dgmVar = new dgm();
        this.d = dgmVar;
        this.b = viewGroup;
        this.a = imageView;
        imageView.setImageDrawable(bvloVar.b(context.getResources(), dfyVar.a().g, bvlw.a));
        Integer num = dfyVar.a().f;
        imageView2.setVisibility(num != null ? 0 : 8);
        if (num != null) {
            imageView2.setImageDrawable(bvloVar.b(context.getResources(), num.intValue(), bvlw.a));
        }
        if (dfyVar.b()) {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, R.animator.offscreen_indicator_pulse);
            loadAnimator.setTarget(imageView);
            loadAnimator.addListener(dgmVar);
            this.c = dbsg.i(loadAnimator);
        } else {
            this.c = dbpy.a;
        }
        viewGroup.setOutlineProvider(new dgk(viewGroup.getResources().getDimensionPixelSize(R.dimen.offscreen_indicator_shadow_outline_offset)));
        dgn.a(viewGroup, new dgp(this) { // from class: dgj
            private final dgl a;

            {
                this.a = this;
            }

            @Override // defpackage.dgp
            public final void a(View view) {
                dgl dglVar = this.a;
                dglVar.f = dglVar.b.getWidth() * 0.5f;
                dglVar.g = dglVar.b.getHeight() * 0.5f;
            }
        });
    }
}
