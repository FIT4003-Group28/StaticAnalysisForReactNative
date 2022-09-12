package defpackage;

import android.view.MenuItem;
/* compiled from: PG */
/* renamed from: uw  reason: default package */
/* loaded from: classes7.dex */
final class uw implements Runnable {
    final /* synthetic */ uy a;
    final /* synthetic */ MenuItem b;
    final /* synthetic */ vf c;
    final /* synthetic */ ux d;

    public uw(ux uxVar, uy uyVar, MenuItem menuItem, vf vfVar) {
        this.d = uxVar;
        this.a = uyVar;
        this.b = menuItem;
        this.c = vfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uy uyVar = this.a;
        if (uyVar != null) {
            this.d.a.f = true;
            uyVar.b.q(false);
            this.d.a.f = false;
        }
        if (!this.b.isEnabled() || !this.b.hasSubMenu()) {
            return;
        }
        this.c.o(this.b, 4);
    }
}
