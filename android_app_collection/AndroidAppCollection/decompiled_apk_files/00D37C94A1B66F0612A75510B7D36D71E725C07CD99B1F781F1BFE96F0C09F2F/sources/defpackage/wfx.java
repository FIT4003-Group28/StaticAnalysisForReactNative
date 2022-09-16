package defpackage;
/* compiled from: PG */
/* renamed from: wfx  reason: default package */
/* loaded from: classes4.dex */
final class wfx implements afzf {
    final /* synthetic */ afvn a;
    final /* synthetic */ wge b;
    final /* synthetic */ aafo c;
    final /* synthetic */ dt d;

    public wfx(afvn afvnVar, wge wgeVar, aafo aafoVar, dt dtVar) {
        this.a = afvnVar;
        this.b = wgeVar;
        this.c = aafoVar;
        this.d = dtVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        if (!this.a.t()) {
            zep.b("Failed to fetch kids onboarding status, finishing the App.");
            this.d.finishAffinity();
        }
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        vzi vziVar = (vzi) obj;
        for (aase aaseVar : vziVar.a) {
            for (aarw aarwVar : aaseVar.c()) {
                if (aarwVar.f != null) {
                    if (this.a.t()) {
                        this.b.k("Kids account deboarded");
                    }
                    this.c.a(aarwVar.d());
                    return;
                }
            }
            if (!this.a.t()) {
                for (aarw aarwVar2 : aaseVar.c()) {
                    if (aarwVar2.p() || aarwVar2.m()) {
                        if (aarwVar2.d != null) {
                            this.c.a(aarwVar2.d());
                            return;
                        }
                    }
                }
                continue;
            }
        }
        if (!this.a.t()) {
            for (aary aaryVar : vziVar.b.c()) {
                if (aaryVar.a) {
                    zep.b("Failed to fetch kids onboarding status, finishing the App.");
                    this.d.finishAffinity();
                    return;
                }
            }
        }
    }
}
