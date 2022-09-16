package defpackage;

import android.view.MenuItem;
/* compiled from: PG */
/* renamed from: xg  reason: default package */
/* loaded from: classes4.dex */
final class xg implements sd {
    final /* synthetic */ xj a;

    public xg(xj xjVar) {
        this.a = xjVar;
    }

    @Override // defpackage.sd
    public final void O(sf sfVar) {
    }

    @Override // defpackage.sd
    public final boolean Q(sf sfVar, MenuItem menuItem) {
        xi xiVar = this.a.d;
        if (xiVar != null) {
            return xiVar.a(menuItem);
        }
        return false;
    }
}
