package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import com.google.android.apps.maps.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.features.obake.HighlightCircleDrawable;
/* compiled from: PG */
/* renamed from: cwfb  reason: default package */
/* loaded from: classes5.dex */
public final class cwfb implements View.OnAttachStateChangeListener {
    final /* synthetic */ AccountParticleDisc a;
    final /* synthetic */ cweg b;
    final /* synthetic */ Object c;
    final /* synthetic */ cwfc d;
    final /* synthetic */ cvzg e;
    final /* synthetic */ cwiv f;
    final /* synthetic */ cwev g;
    final /* synthetic */ Runnable h;
    final /* synthetic */ cwfn i;

    public cwfb(AccountParticleDisc accountParticleDisc, cweg cwegVar, Object obj, cwfc cwfcVar, cvzg cvzgVar, cwiv cwivVar, cwev cwevVar, cwfn cwfnVar, Runnable runnable) {
        this.a = accountParticleDisc;
        this.b = cwegVar;
        this.c = obj;
        this.d = cwfcVar;
        this.e = cvzgVar;
        this.f = cwivVar;
        this.g = cwevVar;
        this.i = cwfnVar;
        this.h = runnable;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (!this.b.e() || this.d.a || !this.b.d()) {
            this.g.a();
            return;
        }
        this.d.b = new cwfa<>(this.e, this.f, this.b, this.a, this.g, this.h);
        final cwfa<AccountT> cwfaVar = this.d.b;
        final Object obj = this.c;
        final cvvy cvvyVar = new cvvy(cwfaVar) { // from class: cwew
            private final cwfa a;

            {
                this.a = cwfaVar;
            }

            @Override // defpackage.cvvy
            public final Drawable a(int i, int i2) {
                cwfa cwfaVar2 = this.a;
                cwez cwezVar = new cwez(cwfaVar2);
                Context context = cwfaVar2.b.getContext();
                int c = cwfaVar2.a.c();
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(cqfa.a(context, R.attr.colorSurface));
                HighlightCircleDrawable highlightCircleDrawable = new HighlightCircleDrawable(context, new LayerDrawable(new Drawable[]{shapeDrawable, cwiz.a(context, c, cqfa.b(context))}), i - (i2 * 4));
                int i3 = i2 + i2;
                AnimatorSet a = cweq.a(highlightCircleDrawable, "firstPulseSize", i3);
                AnimatorSet a2 = cweq.a(highlightCircleDrawable, "secondPulseSize", i3);
                a2.setStartDelay(500L);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(a, a2);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(a, a2);
                animatorSet2.setStartDelay(700L);
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.play(animatorSet2).after(animatorSet);
                animatorSet3.addListener(new cwey(cwfaVar2, highlightCircleDrawable, cwezVar));
                cwfaVar2.d.i(cwezVar);
                animatorSet3.start();
                return highlightCircleDrawable;
            }
        };
        cwfaVar.b.setRingRetriever(new cvvn(obj, cvvyVar) { // from class: cwex
            private final Object a;
            private final cvvy b;

            {
                this.a = obj;
                this.b = cvvyVar;
            }

            @Override // defpackage.cvvn
            public final cvvm a(Object obj2) {
                CharSequence b;
                CharSequence b2;
                Object obj3 = this.a;
                cvvy cvvyVar2 = this.b;
                b = ((cwfm) obj2).b();
                b2 = ((cwfm) obj3).b();
                if (czhw.a(b, b2)) {
                    return new cvvm(cvvx.c(cvvyVar2, null));
                }
                return null;
            }
        });
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.removeOnAttachStateChangeListener(this);
    }
}
