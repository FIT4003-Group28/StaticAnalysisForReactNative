package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: aujm  reason: default package */
/* loaded from: classes.dex */
public final class aujm implements aujo {
    private final auju a;
    private final aujf b;
    private final aujl c;

    public aujm(aujl aujlVar, auju aujuVar, cqat cqatVar) {
        this.c = aujlVar;
        this.a = aujuVar;
        this.b = new aujf(cqatVar);
    }

    private final boolean e(ddos ddosVar) {
        aujw a = this.a.a(ddosVar);
        aujf aujfVar = this.b;
        dkpi h = this.c.a().h(ddosVar);
        if (a != null) {
            if (h == null) {
                return true;
            }
            int i = h.a;
            if ((i & 4) == 0) {
                bvoo.h("Client parameters for Notification Backoff is missing action weights.", new Object[0]);
                return true;
            } else if ((i & 8) == 0) {
                bvoo.h("Client parameters for Notification Backoff is missing action weight decay.", new Object[0]);
                return true;
            } else if ((i & 16) == 0) {
                bvoo.h("Client parameters for Notification Backoff is missing threshold.", new Object[0]);
                return true;
            } else {
                List<aukd> b = a.b();
                dkpg dkpgVar = h.d;
                if (dkpgVar == null) {
                    dkpgVar = dkpg.e;
                }
                if (aujfVar.a(b, dkpgVar, dbsg.i(Long.valueOf(h.e))) < h.f) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.aujo
    public final boolean a(ddos ddosVar) {
        aujn a = this.c.a();
        if (a.a()) {
            return true;
        }
        if (!a.f(ddosVar) || a.g(ddosVar)) {
            return false;
        }
        return e(ddosVar);
    }

    @Override // defpackage.aujo
    public final boolean b(ddos ddosVar, akqi akqiVar) {
        Iterable<aukd> emptyList;
        aujt b = this.a.b(ddosVar);
        aujw aujwVar = b != null ? b.b : null;
        if (aujwVar != null) {
            aujf aujfVar = this.b;
            dkpl d = this.c.a().d(ddosVar);
            if (d != null) {
                int i = d.a;
                if ((i & 2) == 0) {
                    bvoo.h("Client parameters for Feature ID Notification Backoff is missing action weights.", new Object[0]);
                } else if ((i & 4) != 0) {
                    aujp aujpVar = aujwVar.b;
                    if (aujpVar != null) {
                        emptyList = dcft.i(aujwVar.b(), new aujv(aujpVar.a(akqiVar)));
                    } else {
                        emptyList = Collections.emptyList();
                    }
                    dkpg dkpgVar = d.c;
                    if (dkpgVar == null) {
                        dkpgVar = dkpg.e;
                    }
                    return aujfVar.a(emptyList, dkpgVar, dbpy.a) < ((double) d.d);
                } else {
                    bvoo.h("Client parameters for Feature ID Notification Backoff is missing threshold.", new Object[0]);
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.aujo
    public final void c(ddos ddosVar) {
        aujw a = this.a.a(ddosVar);
        if (a == null) {
            return;
        }
        a.c();
    }

    @Override // defpackage.aujo
    @dzsi
    public final ddou d() {
        if (this.c.a().a()) {
            return null;
        }
        ddop bZ = ddou.b.bZ();
        dcdc<ddos> e = this.c.a().e();
        int size = e.size();
        for (int i = 0; i < size; i++) {
            ddos ddosVar = e.get(i);
            ddoq bZ2 = ddot.d.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddot ddotVar = (ddot) bZ2.b;
            ddotVar.b = ddosVar.s;
            ddotVar.a |= 1;
            boolean z = !e(ddosVar);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddot ddotVar2 = (ddot) bZ2.b;
            ddotVar2.a |= 2;
            ddotVar2.c = z;
            ddot bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddou ddouVar = (ddou) bZ.b;
            bK.getClass();
            dsrj<ddot> dsrjVar = ddouVar.a;
            if (!dsrjVar.a()) {
                ddouVar.a = dsqw.cl(dsrjVar);
            }
            ddouVar.a.add(bK);
        }
        return bZ.bK();
    }
}
