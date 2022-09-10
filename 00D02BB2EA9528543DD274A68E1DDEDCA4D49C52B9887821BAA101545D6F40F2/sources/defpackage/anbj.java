package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: anbj  reason: default package */
/* loaded from: classes.dex */
public final class anbj extends itb {
    private final dxio<anbx> a;
    private final pfc b;
    private final anbh c;

    public anbj(anbh anbhVar, pfc pfcVar, dxio dxioVar) {
        this.c = anbhVar;
        this.b = pfcVar;
        this.a = dxioVar;
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        if (this.b.c()) {
            anbx a = this.a.a();
            if (!a.a.c() || !a.h.compareAndSet(false, true)) {
                return;
            }
            a.a();
            if (a.k == null) {
                WeakReference weakReference = new WeakReference(a.e.a());
                dkjo dkjoVar = a.b.getExploreMapParametersWithoutLogging().r;
                if (dkjoVar == null) {
                    dkjoVar = dkjo.h;
                }
                a.k = new anbw(a, weakReference, dkjoVar);
            }
            a.d.a().a(a.k);
            a.d.a().b(a.k);
        }
    }

    @Override // defpackage.itb
    public final void Po() {
        super.Po();
        if (this.b.c()) {
            anbx a = this.a.a();
            if (!a.a.c() || !a.h.compareAndSet(true, false)) {
                return;
            }
            if (a.k != null) {
                a.d.a().c(a.k);
            }
            a.c();
            pfd.c(a.g);
        }
    }

    public final anbh e() {
        return this.c;
    }
}
