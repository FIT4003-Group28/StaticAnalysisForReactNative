package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: dgs  reason: default package */
/* loaded from: classes6.dex */
public final class dgs {
    final FrameLayout a;
    final ViewGroup b;
    public final dgl c;
    public final dbsg<dgr> d;
    public final dgi e;
    public final Animator f;
    final Animator g;
    public boolean h;
    public boolean i;
    public final akse j = new akse();
    public final akse k = new akse();
    public float l;
    private final Animator.AnimatorListener m;

    public dgs(ViewGroup viewGroup, dfy dfyVar, bvlo bvloVar) {
        dge dgeVar = new dge(this);
        this.m = dgeVar;
        this.b = viewGroup;
        Context context = viewGroup.getContext();
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.offscreen_indicator, (ViewGroup) null);
        this.a = frameLayout;
        ViewGroup viewGroup2 = (ViewGroup) frameLayout.findViewById(R.id.offscreen_indicator_container);
        ImageView imageView = (ImageView) frameLayout.findViewById(R.id.offscreen_indicator_background);
        ImageView imageView2 = (ImageView) frameLayout.findViewById(R.id.offscreen_indicator_icon);
        ImageView imageView3 = (ImageView) frameLayout.findViewById(R.id.offscreen_indicator_ripple);
        TextView textView = (TextView) frameLayout.findViewById(R.id.offscreen_indicator_hint_text);
        this.c = new dgl(context, viewGroup2, imageView, imageView2, dfyVar, bvloVar);
        if (dfyVar.b()) {
            this.d = dbsg.i(new dgr(context, imageView3, bvloVar));
        } else {
            this.d = dbpy.a;
        }
        this.e = new dgi(context, textView, viewGroup2, dfyVar);
        Animator loadAnimator = AnimatorInflater.loadAnimator(context, R.animator.offscreen_indicator_transition_in);
        this.f = loadAnimator;
        loadAnimator.setTarget(frameLayout);
        Animator loadAnimator2 = AnimatorInflater.loadAnimator(context, R.animator.offscreen_indicator_transition_out);
        this.g = loadAnimator2;
        loadAnimator2.setTarget(frameLayout);
        loadAnimator2.addListener(dgeVar);
    }

    public static float b(float f, float f2, float f3) {
        return f3 <= 0.0f ? f : f3 >= 1.0f ? f2 : (f * (1.0f - f3)) + (f2 * f3);
    }

    public final void a() {
        if (!this.h) {
            return;
        }
        this.h = false;
        this.i = false;
        dgi dgiVar = this.e;
        if (dgiVar.i) {
            dgiVar.i = false;
            dgiVar.b.cancel();
            if (dgiVar.c.isStarted()) {
                dgiVar.c.cancel();
            }
            dgiVar.a.setVisibility(4);
        }
        if (this.d.a()) {
            dgr b = this.d.b();
            b.c.end();
            b.a.setVisibility(4);
        }
        dgl dglVar = this.c;
        if (dglVar.c.a()) {
            dglVar.c.b().end();
        }
        this.f.cancel();
        this.g.cancel();
        this.b.removeView(this.a);
    }
}
