package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: adth  reason: default package */
/* loaded from: classes.dex */
public final class adth implements adst {
    public volatile adss a;
    final adts b;
    private final adst c;
    private final adst d;
    private final AtomicInteger e = new AtomicInteger(0);
    private final adss f;
    private final adta g;

    public adth(adst adstVar, adst adstVar2, adtt adttVar, acrr acrrVar) {
        adss adssVar = new adss() { // from class: adtf
            @Override // defpackage.adss
            public final void b(adtd adtdVar) {
                adss adssVar2 = adth.this.a;
                if (adssVar2 != null) {
                    adssVar2.b(adtdVar);
                }
            }
        };
        this.f = adssVar;
        adts adtgVar = new adtg(this);
        this.b = adtgVar;
        this.c = adstVar;
        this.d = adstVar2;
        adta adtaVar = new adta(adssVar, acrrVar);
        this.g = adtaVar;
        adttVar.d(adtaVar);
        adttVar.c(adtgVar);
    }

    @Override // defpackage.adst
    public final int a() {
        return this.c.a();
    }

    @Override // defpackage.adst
    public final void b(adss adssVar) {
        this.a = adssVar;
        this.c.b(this.g);
        this.d.b(this.g);
    }

    @Override // defpackage.adst
    public final void d() {
    }

    @Override // defpackage.adst
    public final void e(adil adilVar, adip adipVar) {
        adip adipVar2 = new adip(adipVar.b);
        adipVar2.a("senderMsn", Integer.toString(this.e.getAndIncrement()));
        if (!adil.aj.contains(adilVar) || this.d.a() != 2) {
            if (adil.ak.contains(adilVar)) {
                return;
            }
            this.c.e(adilVar, adipVar2);
            return;
        }
        this.d.e(adilVar, adipVar2);
    }

    @Override // defpackage.adst
    public final void g() {
        this.c.g();
    }

    @Override // defpackage.adst
    public final void j(boolean z) {
        this.e.set(0);
        this.c.j(z);
        this.d.j(z);
        this.g.d();
    }

    @Override // defpackage.adst
    public final /* synthetic */ void m(adsr adsrVar) {
    }

    @Override // defpackage.adst
    public final void n(adsw adswVar) {
        ((acyi) this.c).j = adswVar;
    }
}
