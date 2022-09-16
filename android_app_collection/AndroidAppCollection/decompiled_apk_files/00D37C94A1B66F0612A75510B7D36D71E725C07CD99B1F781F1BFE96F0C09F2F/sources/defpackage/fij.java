package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: fij  reason: default package */
/* loaded from: classes3.dex */
final class fij implements geq {
    private final fii a;
    private final axnm b;
    private final awmt c;
    private final awmt d;

    public fij(WeakReference weakReference, axnm axnmVar, awmt awmtVar, awmt awmtVar2, fio fioVar, AtomicBoolean atomicBoolean) {
        this.b = axnmVar;
        this.c = awmtVar;
        this.d = awmtVar2;
        this.a = new fii(fioVar, weakReference, atomicBoolean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(WeakReference weakReference) {
        this.a.a = weakReference;
    }

    @Override // defpackage.geq
    public final boolean oJ(geq geqVar) {
        return (geqVar instanceof fij) && this.d == ((fij) geqVar).d;
    }

    @Override // defpackage.geq
    public final aynr oI(int i) {
        fif fifVar = new fif();
        fifVar.a = false;
        fifVar.b = this.a;
        if (i == 1) {
            if (this.d != null) {
                return ((tcu) this.b.get()).b(this.d, fifVar.a());
            }
            i = 1;
        }
        if (i == 2) {
            if (this.d != null) {
                awmt awmtVar = this.d;
                fifVar.a = true;
                return ((tcu) this.b.get()).b(awmtVar, fifVar.a());
            }
        } else if (i == 0 && this.c != null) {
            return ((tcu) this.b.get()).b(this.c, fifVar.a());
        }
        return aynr.f();
    }
}
