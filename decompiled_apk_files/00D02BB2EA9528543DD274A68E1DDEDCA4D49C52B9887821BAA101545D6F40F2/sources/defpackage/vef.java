package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vef  reason: default package */
/* loaded from: classes7.dex */
public final class vef extends cqiw<zbx> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, zbx zbxVar, Context context, cqiv cqivVar) {
        zdz d;
        vhs vhsVar;
        zbv e = zbxVar.e();
        if (e != null && e.e().booleanValue()) {
            zdv k = e.k();
            dbsk.s(k);
            d = k.d();
            if (d == null) {
                return;
            }
            vhsVar = new vhs();
        } else if (e == null || !e.f().booleanValue()) {
            return;
        } else {
            zcn l = e.l();
            dbsk.s(l);
            if (!l.d().booleanValue()) {
                return;
            }
            zcn l2 = e.l();
            dbsk.s(l2);
            d = l2.c().d();
            if (d == null) {
                return;
            }
            vhsVar = new vhs();
        }
        cqivVar.a(vhsVar, d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<zbx> a() {
        return vei.d(cqgr.ck(C()));
    }
}
