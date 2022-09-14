package defpackage;

import android.view.View;
import android.widget.PopupWindow;
/* compiled from: PG */
/* renamed from: rl  reason: default package */
/* loaded from: classes7.dex */
final class rl extends ok {
    final /* synthetic */ rm a;

    public rl(rm rmVar) {
        this.a = rmVar;
    }

    @Override // defpackage.ok, defpackage.oj
    public final void b() {
        this.a.a.n.setVisibility(8);
        rv rvVar = this.a.a;
        PopupWindow popupWindow = rvVar.o;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (rvVar.n.getParent() instanceof View) {
            od.L((View) this.a.a.n.getParent());
        }
        this.a.a.n.h();
        this.a.a.q.f(null);
        rv rvVar2 = this.a.a;
        rvVar2.q = null;
        od.L(rvVar2.s);
    }
}
