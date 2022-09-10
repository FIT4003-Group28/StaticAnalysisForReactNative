package defpackage;
/* compiled from: PG */
/* renamed from: crjj  reason: default package */
/* loaded from: classes5.dex */
public final class crjj<T> extends btrh<T> {
    private final int d;

    public crjj(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            crji crjiVar = (crji) this.a;
            crii criiVar = (crii) obj;
            vul vulVar = criiVar.a;
            int i2 = criiVar.c;
            if (vulVar == vul.FREE_NAV) {
                crji.e(crjiVar.j, vulVar, criiVar.b, i2, false);
            } else if (vulVar != vul.OVERVIEW_SUGGESTIONS) {
            } else {
                crji.e(crjiVar.k, vulVar, criiVar.b, i2, true);
            }
        } else if (i == 1) {
            crji crjiVar2 = (crji) this.a;
            crjiVar2.c.d = ((ahju) obj).a;
            if (!crjiVar2.j()) {
                return;
            }
            crjiVar2.k();
        } else if (i == 2) {
            crhz crhzVar = (crhz) obj;
            ((crji) this.a).g(dcdc.f(crhzVar.a), crhzVar.b, crhzVar.c, crhzVar.d);
        } else if (i != 3) {
            ((crji) this.a).e.e(((criq) obj).a);
        } else {
            crji crjiVar3 = (crji) this.a;
            cric cricVar = (cric) obj;
            if (((mwo) crjiVar3.f).a) {
                return;
            }
            crjiVar3.g.a(crjiVar3.e, cricVar.a).c();
        }
    }
}
