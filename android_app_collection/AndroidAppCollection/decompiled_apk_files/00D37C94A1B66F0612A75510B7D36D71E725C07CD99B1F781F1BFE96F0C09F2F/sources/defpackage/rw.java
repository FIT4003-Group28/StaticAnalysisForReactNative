package defpackage;

import android.view.MenuItem;
/* compiled from: PG */
/* renamed from: rw  reason: default package */
/* loaded from: classes4.dex */
public final class rw implements Runnable {
    final /* synthetic */ ry a;
    final /* synthetic */ MenuItem b;
    final /* synthetic */ sf c;
    final /* synthetic */ rx d;

    public rw(rx rxVar, ry ryVar, MenuItem menuItem, sf sfVar) {
        this.d = rxVar;
        this.a = ryVar;
        this.b = menuItem;
        this.c = sfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ry ryVar = this.a;
        if (ryVar != null) {
            this.d.a.f = true;
            ryVar.b.i(false);
            this.d.a.f = false;
        }
        if (!this.b.isEnabled() || !this.b.hasSubMenu()) {
            return;
        }
        this.c.z(this.b, 4);
    }
}
