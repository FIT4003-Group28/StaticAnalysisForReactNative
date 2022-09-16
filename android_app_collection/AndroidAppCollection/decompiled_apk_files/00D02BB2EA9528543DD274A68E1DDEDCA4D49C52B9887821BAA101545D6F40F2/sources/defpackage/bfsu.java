package defpackage;
/* compiled from: PG */
/* renamed from: bfsu  reason: default package */
/* loaded from: classes3.dex */
public class bfsu implements izv {
    private final bfst a;
    private final aeqr b;

    public bfsu(aeqs aeqsVar, bfst bfstVar, dcdc<Integer> dcdcVar, Integer num) {
        this.a = bfstVar;
        this.b = aeqsVar.a(dcdcVar, num);
    }

    @Override // defpackage.izv
    public cqkl a(cjqm cjqmVar) {
        bfst bfstVar = this.a;
        Integer a = this.b.a();
        bfsr bfsrVar = (bfsr) bfstVar;
        bfsrVar.b();
        dqxc dqxcVar = bfsrVar.f;
        if (dqxcVar == null || dqxcVar.b != a.intValue()) {
            dqxb bZ = dqxc.c.bZ();
            int intValue = a.intValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dqxc dqxcVar2 = (dqxc) bZ.b;
            dqxcVar2.a |= 1;
            dqxcVar2.b = intValue;
            bfsrVar.f = bZ.bK();
            bfsq bfsqVar = bfsrVar.e;
            dqxc dqxcVar3 = bfsrVar.f;
            dbsk.s(dqxcVar3);
            bfsqVar.a(dqxcVar3);
        }
        return cqkl.a;
    }

    @Override // defpackage.izv
    public cqkl b() {
        ((bfsr) this.a).b();
        return cqkl.a;
    }

    @Override // defpackage.izv
    public void c(cqiv cqivVar) {
        cqivVar.a(new bsgq(), this.b);
    }

    @Override // defpackage.izv
    public Boolean d() {
        return true;
    }

    @Override // defpackage.izv
    public jib e() {
        return null;
    }
}
