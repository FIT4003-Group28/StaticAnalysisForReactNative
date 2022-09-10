package defpackage;

import android.view.View;
import android.widget.PopupWindow;
/* compiled from: PG */
/* renamed from: afrn  reason: default package */
/* loaded from: classes.dex */
final class afrn implements View.OnLayoutChangeListener {
    final /* synthetic */ afrp a;

    public afrn(afrp afrpVar) {
        this.a = afrpVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        afpb afpbVar = this.a.b;
        if (afpbVar != null) {
            PopupWindow g = afpbVar.g();
            if (g != null && g.isShowing()) {
                g.dismiss();
                this.a.b.h();
            }
            if (g != null && g.isShowing()) {
                return;
            }
            afov afovVar = this.a.a;
            afovVar.b = view;
            afovVar.a.a().a(afovVar);
        }
    }
}
