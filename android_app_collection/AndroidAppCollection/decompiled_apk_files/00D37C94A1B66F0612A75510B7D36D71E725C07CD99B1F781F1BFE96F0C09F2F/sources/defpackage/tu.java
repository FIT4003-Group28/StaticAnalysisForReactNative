package defpackage;

import android.support.v7.widget.ActionMenuView;
import android.view.MenuItem;
/* compiled from: PG */
/* renamed from: tu  reason: default package */
/* loaded from: classes4.dex */
public final class tu implements sd {
    final /* synthetic */ ActionMenuView a;

    public tu(ActionMenuView actionMenuView) {
        this.a = actionMenuView;
    }

    @Override // defpackage.sd
    public final void O(sf sfVar) {
        sd sdVar = this.a.d;
        if (sdVar != null) {
            sdVar.O(sfVar);
        }
    }

    @Override // defpackage.sd
    public final boolean Q(sf sfVar, MenuItem menuItem) {
        aaj aajVar;
        aae aaeVar = this.a.e;
        return (aaeVar == null || (aajVar = aaeVar.a.q) == null || !aajVar.a(menuItem)) ? false : true;
    }
}
