package defpackage;

import android.view.View;
/* renamed from: dgn  reason: default package */
/* loaded from: classes6.dex */
public final /* synthetic */ class dgn {
    public static void a(View view, final dgp dgpVar) {
        if (view.getWidth() > 0 || view.getHeight() > 0) {
            dgpVar.a(view);
        }
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener(dgpVar) { // from class: dgo
            private final dgp a;

            {
                this.a = dgpVar;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.a.a(view2);
            }
        });
    }
}
