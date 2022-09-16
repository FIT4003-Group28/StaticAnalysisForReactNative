package defpackage;
/* compiled from: PG */
/* renamed from: ypv  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class ypv implements ayqe {
    public final /* synthetic */ ypx a;
    private final /* synthetic */ int b;

    public /* synthetic */ ypv(ypx ypxVar, int i) {
        this.b = i;
        this.a = ypxVar;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            ypx ypxVar = this.a;
            if (((Boolean) obj).booleanValue()) {
                return aynx.e(ypxVar.a().C(yps.d).n(), ypxVar.g.a(), nti.k).I().n();
            }
            return aynx.e(ypxVar.e, ypxVar.g.a(), nti.j).I().n();
        } else if (i == 1) {
            ypx ypxVar2 = this.a;
            if (((Boolean) obj).booleanValue()) {
                return ypxVar2.a().C(yps.a).n();
            }
            return ypxVar2.b.I().A().n();
        } else {
            ypx ypxVar3 = this.a;
            if (((Boolean) obj).booleanValue()) {
                return ypxVar3.a().C(yps.c).n();
            }
            return ypxVar3.c.I().A().n();
        }
    }
}
