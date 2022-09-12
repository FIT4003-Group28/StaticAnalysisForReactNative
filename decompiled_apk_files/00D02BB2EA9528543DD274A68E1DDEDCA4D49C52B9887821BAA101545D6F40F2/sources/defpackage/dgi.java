package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dgi  reason: default package */
/* loaded from: classes6.dex */
public final class dgi {
    public final TextView a;
    public final Animator b;
    public final Animator c;
    public float g;
    public float h;
    public boolean i;
    public float j;
    private final Context m;
    private final dfy n;
    private final float o;
    public int l = 1;
    public final akse d = new akse();
    public final akse e = new akse();
    public float f = 1.0f;
    public boolean k = true;

    public dgi(Context context, TextView textView, View view, dfy dfyVar) {
        this.m = context;
        this.a = textView;
        this.o = context.getResources().getDimensionPixelSize(R.dimen.offscreen_indicator_hint_text_margin);
        this.n = dfyVar;
        Animator loadAnimator = AnimatorInflater.loadAnimator(textView.getContext(), R.animator.offscreen_indicator_hint_text_transition_in);
        this.b = loadAnimator;
        loadAnimator.setTarget(textView);
        Animator loadAnimator2 = AnimatorInflater.loadAnimator(textView.getContext(), R.animator.offscreen_indicator_hint_text_transition_in);
        this.c = loadAnimator2;
        loadAnimator2.addListener(new dgh(textView));
        loadAnimator2.setTarget(textView);
        a();
        dgn.a(textView, new dgp(this) { // from class: dgf
            private final dgi a;

            {
                this.a = this;
            }

            @Override // defpackage.dgp
            public final void a(View view2) {
                dgi dgiVar = this.a;
                dgiVar.g = dgiVar.a.getWidth() * 0.5f;
                dgiVar.h = dgiVar.a.getHeight() * 0.5f;
                dgiVar.b();
            }
        });
        dgn.a(view, new dgp(this) { // from class: dgg
            private final dgi a;

            {
                this.a = this;
            }

            @Override // defpackage.dgp
            public final void a(View view2) {
                dgi dgiVar = this.a;
                dgiVar.j = view2.getWidth() * 0.5f;
                dgiVar.b();
            }
        });
    }

    public final void a() {
        cqss x;
        cqss b;
        Drawable b2 = ks.b(this.m.getResources().getDrawable(R.drawable.offscreen_indicator_hint_text_background));
        if (this.n.d()) {
            x = this.k ? ibl.H() : ibl.b();
            b = this.k ? ibl.b() : ibl.H();
        } else {
            x = this.k ? ibm.x() : ibm.b();
            b = this.k ? ibm.b() : ibm.x();
        }
        b2.setTint(x.b(this.m));
        this.a.setBackground(b2);
        this.a.setTextColor(b.b(this.m));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.f = 0.0f;
        int i = this.l;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                this.e.r(this.j + this.o, -this.h);
                return;
            } else if (i2 == 2) {
                akse akseVar = this.e;
                float f = this.g;
                akseVar.r(-(f + f + this.j + this.o), -this.h);
                return;
            } else if (i2 == 3) {
                this.e.r(-this.g, this.j + this.o);
                return;
            } else if (i2 != 4) {
                return;
            } else {
                akse akseVar2 = this.e;
                float f2 = this.g;
                float f3 = this.j;
                akseVar2.r(-f2, -(f3 + f3 + this.o));
                return;
            }
        }
        throw null;
    }
}
