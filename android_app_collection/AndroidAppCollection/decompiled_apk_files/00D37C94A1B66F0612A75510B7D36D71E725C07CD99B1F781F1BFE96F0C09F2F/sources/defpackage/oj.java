package defpackage;

import android.view.View;
import android.widget.PopupWindow;
/* compiled from: PG */
/* renamed from: oj  reason: default package */
/* loaded from: classes3.dex */
final class oj extends lp {
    final /* synthetic */ ok a;

    public oj(ok okVar) {
        this.a = okVar;
    }

    @Override // defpackage.lp, defpackage.lo
    public final void a(View view) {
        this.a.a.k.setVisibility(8);
        ot otVar = this.a.a;
        PopupWindow popupWindow = otVar.l;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (otVar.k.getParent() instanceof View) {
            lj.K((View) this.a.a.k.getParent());
        }
        this.a.a.k.i();
        this.a.a.n.f(null);
        ot otVar2 = this.a.a;
        otVar2.n = null;
        lj.K(otVar2.p);
    }
}
