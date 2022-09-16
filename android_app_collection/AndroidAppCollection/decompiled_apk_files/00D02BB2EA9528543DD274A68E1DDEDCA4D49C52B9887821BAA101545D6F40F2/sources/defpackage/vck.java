package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vck  reason: default package */
/* loaded from: classes7.dex */
public final class vck extends cqiw<zbx> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, zbx zbxVar, Context context, cqiv cqivVar) {
        Object g;
        cqiw unjVar;
        zbv e = zbxVar.e();
        if (e == null) {
            return;
        }
        if (e.d().booleanValue()) {
            zfm j = e.j();
            dbsk.s(j);
            g = j.g();
            if (g == null) {
                return;
            }
            unjVar = new unj();
        } else if (e.e().booleanValue()) {
            zdv k = e.k();
            dbsk.s(k);
            g = k.d();
            if (g == null) {
                return;
            }
            unjVar = new vgx();
        } else {
            if (e.f().booleanValue()) {
                zcn l = e.l();
                dbsk.s(l);
                if (l.d().booleanValue()) {
                    zcn l2 = e.l();
                    dbsk.s(l2);
                    g = l2.c().d();
                    if (g == null) {
                        return;
                    }
                    unjVar = new vgx();
                }
            }
            if (!e.g().booleanValue()) {
                return;
            }
            zcm m = e.m();
            dbsk.s(m);
            g = m.d().g();
            if (g == null) {
                return;
            }
            unjVar = new unj();
        }
        cqivVar.a(unjVar, g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<zbx> a() {
        return vei.d(cqgr.ck(C()));
    }
}
