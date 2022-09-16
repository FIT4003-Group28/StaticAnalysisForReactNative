package defpackage;

import com.google.protos.youtube.api.innertube.CardboardModeRendererOuterClass;
/* compiled from: PG */
/* renamed from: nit  reason: default package */
/* loaded from: classes3.dex */
public final class nit extends fdm implements ahku {
    public aumx a;
    private final aypf b;
    private final airw c;
    private final nis d;
    private boolean e;

    public nit(feh fehVar, airw airwVar, abeb abebVar, yni yniVar, yzj yzjVar, acti actiVar, ahrf ahrfVar) {
        super(fehVar);
        this.c = airwVar;
        this.b = new aypf();
        nis nisVar = new nis(abebVar, yniVar, yzjVar, actiVar);
        this.d = nisVar;
        nisVar.E = ahrfVar;
        this.e = false;
    }

    public final void e() {
        aumx aumxVar;
        if (this.e && (aumxVar = this.a) != null) {
            this.d.lr(ajna.g(aumxVar));
        }
    }

    @Override // defpackage.feg
    public final void kF() {
        this.b.c();
    }

    @Override // defpackage.feg
    public final void nr() {
        this.b.d(this.c.ao().h(aiwv.l(1)).aa(new ayqb() { // from class: nir
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                aube aubeVar;
                nit nitVar = nit.this;
                ahhm ahhmVar = (ahhm) obj;
                apqe apqeVar = null;
                if (ahhmVar.a() != null) {
                    asgf asgfVar = ahhmVar.a().a.f;
                    if (asgfVar == null) {
                        asgfVar = asgf.a;
                    }
                    if (asgfVar.b == 78882851) {
                        aubeVar = (aube) asgfVar.c;
                    } else {
                        aubeVar = aube.a;
                    }
                    aunb aunbVar = aubeVar.n;
                    if (aunbVar == null) {
                        aunbVar = aunb.a;
                    }
                    if (aunbVar.qn(CardboardModeRendererOuterClass.cardboardModeRenderer)) {
                        aunb aunbVar2 = ahhmVar.a().i.n;
                        if (aunbVar2 == null) {
                            aunbVar2 = aunb.a;
                        }
                        apqeVar = (apqe) aunbVar2.qm(CardboardModeRendererOuterClass.cardboardModeRenderer);
                    }
                }
                if (apqeVar != null) {
                    aopu aopuVar = apqeVar.b;
                    if (aopuVar.isEmpty()) {
                        return;
                    }
                    aumx aumxVar = ((apqf) aopuVar.get(0)).b;
                    if (aumxVar == null) {
                        aumxVar = aumx.a;
                    }
                    nitVar.a = aumxVar;
                    nitVar.e();
                }
            }
        }, kjt.s));
    }

    @Override // defpackage.ahku
    public final void qT(ahof ahofVar, ahob ahobVar) {
        this.e = true;
        e();
    }

    @Override // defpackage.ahku
    public final void qU() {
        this.e = false;
    }
}
