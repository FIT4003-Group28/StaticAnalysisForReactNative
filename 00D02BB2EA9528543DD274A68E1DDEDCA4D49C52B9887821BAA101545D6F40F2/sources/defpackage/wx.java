package defpackage;

import android.support.v7.widget.ActionMenuView;
import android.view.MenuItem;
/* compiled from: PG */
/* renamed from: wx  reason: default package */
/* loaded from: classes7.dex */
public final class wx implements vd {
    final /* synthetic */ ActionMenuView a;

    public wx(ActionMenuView actionMenuView) {
        this.a = actionMenuView;
    }

    @Override // defpackage.vd
    public final boolean x(vf vfVar, MenuItem menuItem) {
        wy wyVar = this.a.e;
        return wyVar != null && wyVar.a(menuItem);
    }

    @Override // defpackage.vd
    public final void y(vf vfVar) {
        vd vdVar = this.a.d;
        if (vdVar != null) {
            vdVar.y(vfVar);
        }
    }
}
