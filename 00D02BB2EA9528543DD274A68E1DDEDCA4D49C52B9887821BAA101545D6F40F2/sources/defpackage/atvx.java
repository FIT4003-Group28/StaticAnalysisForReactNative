package defpackage;

import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: atvx  reason: default package */
/* loaded from: classes2.dex */
final class atvx extends azu {
    final /* synthetic */ TextView b;
    final /* synthetic */ View c;
    final /* synthetic */ View d;
    final /* synthetic */ atvz e;

    public atvx(atvz atvzVar, TextView textView, View view, View view2) {
        this.e = atvzVar;
        this.b = textView;
        this.c = view;
        this.d = view2;
    }

    @Override // defpackage.azu
    public final void b() {
        if (this.e.d != null) {
            this.b.setAlpha(1.0f);
            this.d.setAlpha(1.0f);
            this.e.d.start();
        }
    }

    @Override // defpackage.azu
    public final void c() {
        this.b.setAlpha(0.0f);
        this.b.setTranslationX(0.0f);
        this.b.setTextColor(ibl.b().b(this.e.c));
        View a = cqhu.a((View) this.c.getParent(), atrf.a);
        if (a == null) {
            bvoo.h("ButtonView not found. Cannot perform animation.", new Object[0]);
        } else if (!(a.getBackground() instanceof TransitionDrawable)) {
            bvoo.h("ButtonView does not have TransitionDrawable.", new Object[0]);
        } else {
            ((TransitionDrawable) a.getBackground()).startTransition(350);
        }
    }
}
