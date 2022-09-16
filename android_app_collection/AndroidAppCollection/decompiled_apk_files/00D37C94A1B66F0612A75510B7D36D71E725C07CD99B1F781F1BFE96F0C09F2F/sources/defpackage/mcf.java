package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: mcf  reason: default package */
/* loaded from: classes3.dex */
public final class mcf extends fyo implements mdf {
    public final aadd d;
    public final azqb e;
    public volatile int f;
    private final axxi h;
    private final aacz j;
    private boolean i = true;
    private final Handler g = new mce(this, Looper.getMainLooper());

    public mcf(aadd aaddVar, aacz aaczVar, azqb azqbVar, ayor ayorVar, axxi axxiVar) {
        this.d = aaddVar;
        this.j = aaczVar;
        this.e = azqbVar;
        this.f = eog.j(aaddVar);
        asxp asxpVar = aaddVar.a().e;
        asxpVar = asxpVar == null ? asxp.a : asxpVar;
        if (hxb.l(asxpVar)) {
            this.f = hxb.k(asxpVar).c;
            ((akpu) azqbVar.get()).c().G(ayorVar).Z(new ayqb() { // from class: mcd
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    mcf mcfVar = mcf.this;
                    akpw akpwVar = (akpw) obj;
                    asxp asxpVar2 = mcfVar.d.a().e;
                    if (asxpVar2 == null) {
                        asxpVar2 = asxp.a;
                    }
                    if (!hxb.l(asxpVar2)) {
                        return;
                    }
                    ampq a = ((akpu) mcfVar.e.get()).a(hxb.k(asxpVar2), akpwVar);
                    if (!a.h()) {
                        return;
                    }
                    mcfVar.f = ((Integer) a.c()).intValue();
                }
            });
        }
        this.h = axxiVar;
    }

    private final void b() {
        this.g.removeMessages(23998);
    }

    @Override // defpackage.mdf
    public final void a(boolean z) {
        this.i = z;
    }

    @Override // defpackage.fyo, defpackage.fzf
    public final void h(fyp fypVar) {
        b();
    }

    @Override // defpackage.fyo
    protected final boolean j(fyp fypVar, int i) {
        if (!eog.ay(this.j) || fypVar.b.a().d != arjy.INLINE_PLAYBACK_TRIGGER_STYLE_USER) {
            int intValue = ((Long) this.h.a.a.V(axxd.i).B().aw()).intValue();
            asxp asxpVar = this.d.a().e;
            if (asxpVar == null) {
                asxpVar = asxp.a;
            }
            if (hxb.l(asxpVar) && this.f > 0) {
                intValue = this.f;
            } else if (this.i || intValue <= 0) {
                intValue = eog.j(this.d);
            }
            if (i != 2 || intValue <= 0 || !fypVar.b.j()) {
                b();
                return true;
            }
            b();
            this.g.sendEmptyMessageDelayed(23998, intValue);
            return false;
        }
        return true;
    }
}
