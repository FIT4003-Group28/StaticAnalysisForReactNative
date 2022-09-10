package defpackage;
/* compiled from: PG */
/* renamed from: cayr  reason: default package */
/* loaded from: classes4.dex */
public class cayr implements cbqj {
    private final cbqi a;
    private final dcdc<cbqi> b;

    public cayr(dupx dupxVar, @dzsi dprz dprzVar, cayw caywVar, cayv cayvVar) {
        drlr drlrVar = dupxVar.a;
        dprz b = dprz.b((drlrVar == null ? drlr.d : drlrVar).a);
        boolean z = (b == null ? dprz.EXPERIENCE_CATEGORY_UNKNOWN : b) == dprzVar;
        drlr drlrVar2 = dupxVar.a;
        this.a = caywVar.a(drlrVar2 == null ? drlr.d : drlrVar2, z, cayvVar);
        dccx F = dcdc.F();
        for (drlr drlrVar3 : dupxVar.b) {
            dprz b2 = dprz.b(drlrVar3.a);
            F.g(caywVar.a(drlrVar3, (b2 == null ? dprz.EXPERIENCE_CATEGORY_UNKNOWN : b2) == dprzVar, cayvVar));
        }
        this.b = F.f();
    }

    @Override // defpackage.cbqj
    public cbqi a() {
        return this.a;
    }

    @Override // defpackage.cbqj
    public dcdc<cbqi> b() {
        return this.b;
    }
}
