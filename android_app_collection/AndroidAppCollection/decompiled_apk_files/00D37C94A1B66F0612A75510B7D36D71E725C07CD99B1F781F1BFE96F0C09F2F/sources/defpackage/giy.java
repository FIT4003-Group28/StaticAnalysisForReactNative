package defpackage;
/* compiled from: PG */
/* renamed from: giy  reason: default package */
/* loaded from: classes3.dex */
final class giy implements afzf {
    final /* synthetic */ aavf a;
    final /* synthetic */ giz b;

    public giy(giz gizVar, aavf aavfVar) {
        this.b = gizVar;
        this.a = aavfVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        zep.d("Error creating post", cffVar);
        this.b.b.e(cffVar);
        aavf aavfVar = this.a;
        if (aavfVar != null) {
            aavfVar.e(cffVar);
        }
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        arnz arnzVar = (arnz) obj;
        if ((arnzVar.b & 4) != 0) {
            arnh arnhVar = arnzVar.f;
            if (arnhVar == null) {
                arnhVar = arnh.a;
            }
            if ((arnhVar.b & 32) != 0) {
                aafo aafoVar = this.b.a;
                apzg apzgVar = arnhVar.f;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.c(apzgVar, null);
            }
        }
        for (int i = 0; i < arnzVar.e.size(); i++) {
            this.b.a.c((apzg) arnzVar.e.get(i), null);
        }
        aavf aavfVar = this.a;
        if (aavfVar != null) {
            aavfVar.f(arnzVar);
        }
    }
}
