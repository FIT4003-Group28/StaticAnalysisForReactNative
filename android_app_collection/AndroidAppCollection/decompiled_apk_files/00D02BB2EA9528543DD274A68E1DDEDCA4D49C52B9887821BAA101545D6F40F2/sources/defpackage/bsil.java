package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bsil  reason: default package */
/* loaded from: classes4.dex */
final class bsil implements View.OnAttachStateChangeListener {
    final /* synthetic */ bsim a;

    public bsil(bsim bsimVar) {
        this.a = bsimVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(final View view) {
        bsim bsimVar = this.a;
        if (bsimVar.c != null) {
            return;
        }
        bsimVar.c = new cjqv(this, view) { // from class: bsik
            private final bsil a;
            private final View b;

            {
                this.a = this;
                this.b = view;
            }

            @Override // defpackage.cjqv
            public final void a(cjtd cjtdVar) {
                bsil bsilVar = this.a;
                View view2 = this.b;
                if (!cjtdVar.equals(bsilVar.a.l())) {
                    return;
                }
                cjqp f = bsilVar.a.f.f(view2);
                bsilVar.a.d = f.d(bsim.v());
                bsilVar.a.e = f.d(bsim.w());
            }
        };
        bsim bsimVar2 = this.a;
        bsimVar2.g.z(bsimVar2.c);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        bsim bsimVar = this.a;
        cjqv cjqvVar = bsimVar.c;
        if (cjqvVar != null) {
            bsimVar.g.A(cjqvVar);
            this.a.c = null;
        }
        bsim bsimVar2 = this.a;
        bsimVar2.d = null;
        bsimVar2.e = null;
    }
}
