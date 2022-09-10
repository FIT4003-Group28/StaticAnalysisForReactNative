package defpackage;
/* compiled from: PG */
/* renamed from: bnpd  reason: default package */
/* loaded from: classes3.dex */
public final class bnpd<T> extends btrh<T> {
    public bnpd(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        bnpb bnpbVar = (bnpb) this.a;
        alho alhoVar = (alho) obj;
        alaq alaqVar = alhoVar.a;
        if (alaqVar instanceof alap) {
            alap alapVar = (alap) alaqVar;
            if (!alapVar.l) {
                return;
            }
            akqi akqiVar = alapVar.g;
            dbsk.s(akqiVar);
            String o = akqiVar.o();
            for (dpca dpcaVar : bnpbVar.c) {
                dpjx dpjxVar = dpcaVar.c;
                if (dpjxVar == null) {
                    dpjxVar = dpjx.n;
                }
                if (dpjxVar.c.equals(o)) {
                    cjqm cjqmVar = cjqm.a;
                    if (bnpbVar.al.a().booleanValue()) {
                        if (alhoVar.a.g().a()) {
                            cjqmVar = alhoVar.a.g().b();
                        }
                    } else {
                        cjtd cjtdVar = alhoVar.b;
                        if (cjtdVar != null) {
                            cjqmVar = bnpbVar.ak.i(cjtdVar);
                        }
                    }
                    dpjx dpjxVar2 = bnpbVar.b.b;
                    if (dpjxVar2 == null) {
                        dpjxVar2 = dpjx.n;
                    }
                    dpjx dpjxVar3 = dpcaVar.c;
                    if (dpjxVar3 == null) {
                        dpjxVar3 = dpjx.n;
                    }
                    bnpbVar.g(dpjxVar2, dpjxVar3, cjqmVar, false);
                    return;
                }
            }
        }
    }
}
