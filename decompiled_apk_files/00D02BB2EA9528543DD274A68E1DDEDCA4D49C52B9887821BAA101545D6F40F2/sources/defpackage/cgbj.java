package defpackage;
/* renamed from: cgbj  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cgbj implements dbrn {
    static final dbrn a = new cgbj();

    private cgbj() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        btlu btluVar = (btlu) obj;
        dqkm bZ = dqkn.e.bZ();
        String e = dbsj.e(btluVar.j());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqkn dqknVar = (dqkn) bZ.b;
        e.getClass();
        dqknVar.a |= 4;
        dqknVar.d = e;
        String e2 = dbsj.e(btluVar.v());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqkn dqknVar2 = (dqkn) bZ.b;
        e2.getClass();
        dqknVar2.a |= 1;
        dqknVar2.b = e2;
        String e3 = dbsj.e(btluVar.i);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqkn dqknVar3 = (dqkn) bZ.b;
        e3.getClass();
        dqknVar3.a |= 2;
        dqknVar3.c = e3;
        return bZ.bK();
    }
}
