package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: flo  reason: default package */
/* loaded from: classes6.dex */
final class flo<T> implements dzsj<T> {
    final /* synthetic */ flp a;
    private final int b;

    public flo(flp flpVar, int i) {
        this.a = flpVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return (T) new anqv(this.a.a.eW.ok());
            }
            if (i == 2) {
                Application a = this.a.a.eW.a.a();
                dxjg.e(a);
                return (T) new anqx(a);
            } else if (i != 3) {
                return (T) new anru();
            } else {
                flp flpVar = this.a;
                burt burtVar = flpVar.b;
                if (burtVar == null) {
                    dxio c = dxjc.c(flpVar.a.eW.h());
                    bvrb tn = flpVar.a.eW.a.tn();
                    dxjg.e(tn);
                    burtVar = new burt(new burs(c, tn));
                    flpVar.b = burtVar;
                }
                return (T) new ansb(burtVar);
            }
        }
        return (T) this.a.b();
    }
}
