package defpackage;

import android.view.MenuItem;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pb  reason: default package */
/* loaded from: classes4.dex */
public final class pb implements sd {
    final /* synthetic */ pd a;

    public pb(pd pdVar) {
        this.a = pdVar;
    }

    @Override // defpackage.sd
    public final void O(sf sfVar) {
        pd pdVar = this.a;
        if (pdVar.c != null) {
            if (pdVar.a.y()) {
                this.a.c.onPanelClosed(108, sfVar);
            } else if (!this.a.c.onPreparePanel(0, null, sfVar)) {
            } else {
                this.a.c.onMenuOpened(108, sfVar);
            }
        }
    }

    @Override // defpackage.sd
    public final boolean Q(sf sfVar, MenuItem menuItem) {
        return false;
    }
}
