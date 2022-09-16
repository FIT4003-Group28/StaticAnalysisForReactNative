package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: qks  reason: default package */
/* loaded from: classes7.dex */
public final class qks extends cqiw<qnc> {
    public static final int a = cqir.a();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, qnc qncVar, Context context, cqiv cqivVar) {
        boolean z;
        qnc qncVar2 = qncVar;
        if (!qncVar2.u().booleanValue()) {
            cqivVar.a(new qkp(), qncVar2);
        }
        if (qncVar2.h().booleanValue() || qncVar2.k() != null) {
            return;
        }
        cqivVar.f(new wmp(), qncVar2.l());
        cqivVar.a(new qkn(), qncVar2);
        zcv a2 = qncVar2.q().a();
        if (a2 != null) {
            cqivVar.a(new xiu(), a2);
        }
        if (qncVar2.o()) {
            loop0: while (true) {
                z = false;
                for (xia xiaVar : qncVar2.p()) {
                    if (xiaVar.a().a()) {
                        cqivVar.a(new xie(), xiaVar.a().b());
                    }
                    cqivVar.f(new wmp(), xiaVar.b());
                    if (z || !xiaVar.b().isEmpty()) {
                        z = true;
                    }
                }
            }
        } else {
            cqivVar.f(new wmp(), qncVar2.n());
            z = !qncVar2.n().isEmpty();
        }
        if (qncVar2.g().booleanValue()) {
            cqivVar.c(new qkr());
        } else if (!qncVar2.f().booleanValue() && !z) {
            cqivVar.a(new qkq(), qncVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<qnc> a() {
        return cqgr.fY(zvk.a(zuv.e(C(), cqqx.v(qkf.a), cqgr.aR(Integer.valueOf(a)), cqqx.q(qkg.a), zuv.b(qkh.a)), cqgr.fY(cqic.c(cqjv.x(qki.a), new cqmp[0]), cqgr.fP(new cjbp(), qkj.a, new cqmp[0])), cqgr.fR(new ico(), qkk.a, new cqmp[0])));
    }
}
