package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aqnc  reason: default package */
/* loaded from: classes2.dex */
public final class aqnc implements View.OnAttachStateChangeListener {
    final /* synthetic */ aqnd a;

    public aqnc(aqnd aqndVar) {
        this.a = aqndVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        final aqnd aqndVar = this.a;
        aqndVar.c = view;
        if (aqndVar.h().booleanValue() || aqndVar.i().booleanValue()) {
            aqndVar.t();
            aqndVar.s();
        } else if (aqndVar.c == null) {
        } else {
            if (aqndVar.f) {
                aqmd aqmdVar = aqndVar.b;
                if (aqmdVar != null) {
                    aqmdVar.o();
                }
            } else {
                if (aqndVar.e) {
                    aqndVar.e = false;
                    cqkx.p(aqndVar);
                }
                if (!aqndVar.d) {
                    aqndVar.a.h = new Runnable(aqndVar) { // from class: aqnb
                        private final aqnd a;

                        {
                            this.a = aqndVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            aqnd aqndVar2 = this.a;
                            aqndVar2.e = true;
                            cqkx.p(aqndVar2);
                        }
                    };
                    aqndVar.d = true;
                }
                aqni aqniVar = aqndVar.a;
                View view2 = aqndVar.c;
                dbsk.s(view2);
                aqniVar.o((cvbp) cqkx.e(view2, aqmm.b, cvbp.class));
                aqndVar.a.PD();
            }
            aqndVar.s();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        aqnd aqndVar = this.a;
        aqndVar.c = null;
        aqndVar.t();
    }
}
