package defpackage;

import android.content.Context;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: gey  reason: default package */
/* loaded from: classes.dex */
public final class gey extends dxiz {
    public dxio<eeu> a;
    public dxio<bvkx> b;
    public dxio<efx> c;

    @Override // defpackage.dxiz, defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    public final void d() {
        efx a = this.c.a();
        if (a.c()) {
            a.a.a().N();
            return;
        }
        a.b(this).r();
        bvmn bvmnVar = bvmo.a;
    }

    @Override // defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (this.a.a().g()) {
            boolean z = false;
            if (bundle == null && !this.a.a().i()) {
                z = true;
            }
            dbsk.l(z);
            this.b.a().j(new Runnable(this) { // from class: gex
                private final gey a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    gey geyVar = this.a;
                    ff J = geyVar.J();
                    if (J == null) {
                        return;
                    }
                    gn g = J.g();
                    fd H = g.H(gfu.ACTIVITY_FRAGMENT.c);
                    if (g.j() != 0 || H == null || !H.equals(geyVar)) {
                        return;
                    }
                    geyVar.d();
                }
            }, bvrj.UI_THREAD, bvkw.ON_STARTUP_FULLY_COMPLETE);
        }
    }

    @Override // defpackage.fd
    public final void s() {
        super.s();
        if (!this.a.a().f() || J().isFinishing()) {
            return;
        }
        if (this.a.a().g() && !this.a.a().i()) {
            return;
        }
        d();
    }
}
