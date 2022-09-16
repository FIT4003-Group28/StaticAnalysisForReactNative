package defpackage;
/* compiled from: PG */
/* renamed from: ehk  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ehk implements ayqb {
    public final /* synthetic */ ehn a;
    private final /* synthetic */ int b;

    public /* synthetic */ ehk(ehn ehnVar, int i) {
        this.b = i;
        this.a = ehnVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b != 0) {
            ehn ehnVar = this.a;
            egw egwVar = (egw) obj;
            if (!ehnVar.j() || !egwVar.c) {
                ehnVar.k(egm.DISABLED);
                return;
            } else {
                ehnVar.h();
                return;
            }
        }
        ehn ehnVar2 = this.a;
        eik eikVar = (eik) obj;
        if (ehnVar2.c == eikVar) {
            return;
        }
        ehnVar2.c = eikVar;
        ehnVar2.h();
    }
}
