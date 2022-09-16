package defpackage;
/* compiled from: PG */
/* renamed from: eph  reason: default package */
/* loaded from: classes3.dex */
final class eph implements afzf {
    final /* synthetic */ akpf a;
    final /* synthetic */ epi b;

    public eph(epi epiVar, akpf akpfVar) {
        this.b = epiVar;
        this.a = akpfVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.b.a.e(cffVar);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        atep atepVar;
        arop aropVar = (arop) obj;
        ates atesVar = aropVar.c;
        if (atesVar == null) {
            atesVar = ates.a;
        }
        if ((atesVar.b & 1) != 0) {
            ates atesVar2 = aropVar.c;
            if (atesVar2 == null) {
                atesVar2 = ates.a;
            }
            atepVar = atesVar2.c;
            if (atepVar == null) {
                atepVar = atep.a;
            }
        } else {
            atepVar = null;
        }
        if (atepVar != null) {
            akmx akmxVar = (akmx) this.a;
            akmxVar.ah.g(atepVar, akmxVar.ak);
        }
    }
}
