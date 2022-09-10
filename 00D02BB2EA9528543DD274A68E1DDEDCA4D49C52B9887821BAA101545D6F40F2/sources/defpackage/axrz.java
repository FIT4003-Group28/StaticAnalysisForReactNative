package defpackage;

import android.app.Activity;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: axrz  reason: default package */
/* loaded from: classes3.dex */
public final class axrz implements awnl {
    private final transient bwqv a;
    private final transient cjqy b;
    private final azrv c;
    @dzsi
    private final anee d;
    private final azsg e;

    public axrz(bwqv bwqvVar, cjqy cjqyVar, azrv azrvVar, azsg azsgVar, @dzsi anee aneeVar) {
        this.a = bwqvVar;
        this.b = cjqyVar;
        this.c = azrvVar;
        this.e = azsgVar;
        this.d = aneeVar;
    }

    @Override // defpackage.awnl
    public final awnn a() {
        return awnn.ALIASING_HOME_OR_WORK_ENABLE_SEARCH_HISTORY;
    }

    @Override // defpackage.awnl
    public final void b(Activity activity, int i, Intent intent) {
        if (i != -1) {
            if (i != 0) {
                return;
            }
            cjqy cjqyVar = this.b;
            cjsx i2 = cjsy.i();
            i2.b(ddda.n);
            cjqyVar.k(i2.a());
            return;
        }
        cjqy cjqyVar2 = this.b;
        cjsx i3 = cjsy.i();
        i3.b(ddda.o);
        cjqyVar2.k(i3.a());
        gga L = gga.L(activity);
        this.c.m();
        if (this.d == null || !this.c.d()) {
            L.D(azsu.aR(this.c, L, this.a));
        } else {
            L.D(azsd.g(this.e, this.d));
        }
    }
}
