package defpackage;
/* compiled from: PG */
/* renamed from: byjl  reason: default package */
/* loaded from: classes4.dex */
public class byjl implements byig {
    @dzsi
    public cqtd a;
    private final String b;
    private final String c;
    private final cjtd d;
    private final vtk e;

    public byjl(vtn vtnVar, dozz dozzVar) {
        doyu doyuVar;
        dozs dozsVar;
        byjk byjkVar = new byjk(this);
        this.e = byjkVar;
        this.b = alca.p(dozzVar);
        this.c = dbqm.a.i(alca.r(dozzVar), (char) 160).replace('-', (char) 8209);
        douj doujVar = dozzVar.v;
        dbsi<String, String> n = alca.n(doujVar == null ? douj.h : doujVar);
        this.a = yzw.a(n.a, n.b, vtnVar, byjkVar);
        cjta b = cjtd.b();
        dozy b2 = dozy.b(dozzVar.f);
        String str = null;
        if ((b2 == null ? dozy.UNKNOWN : b2) == dozy.TRAFFIC_PROBLEM) {
            if (dozzVar.b == 22) {
                dozsVar = (dozs) dozzVar.c;
            } else {
                dozsVar = dozs.q;
            }
            int i = dozsVar.a;
            b.b = (i & 1) != 0 ? dozsVar.b : null;
            b.g((i & 2) != 0 ? dozsVar.c : str);
        } else {
            dozy b3 = dozy.b(dozzVar.f);
            if ((b3 == null ? dozy.UNKNOWN : b3) == dozy.EVENT) {
                if (dozzVar.b == 27) {
                    doyuVar = (doyu) dozzVar.c;
                } else {
                    doyuVar = doyu.e;
                }
                int i2 = doyuVar.a;
                b.b = (i2 & 1) != 0 ? doyuVar.b : null;
                b.g((i2 & 2) != 0 ? doyuVar.c : str);
            }
        }
        b.d = dtyc.bc;
        this.d = b.d();
    }

    @Override // defpackage.byig
    public CharSequence b() {
        return this.b;
    }

    @Override // defpackage.byig
    public CharSequence c() {
        return this.c;
    }

    @Override // defpackage.byig
    @dzsi
    public cqtd d() {
        return this.a;
    }

    @Override // defpackage.byig
    public cjtd e() {
        return this.d;
    }
}
