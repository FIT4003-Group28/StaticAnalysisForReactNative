package defpackage;

import java.util.Collection;
/* compiled from: PG */
/* renamed from: ccve  reason: default package */
/* loaded from: classes4.dex */
public final class ccve implements bbup {
    final /* synthetic */ String a;
    final /* synthetic */ cknz b;
    final /* synthetic */ ccvf c;

    public ccve(ccvf ccvfVar, String str, cknz cknzVar) {
        this.c = ccvfVar;
        this.a = str;
        this.b = cknzVar;
    }

    @Override // defpackage.bbup
    public final void c() {
    }

    @Override // defpackage.bbup
    public final void j() {
        ccvf ccvfVar = this.c;
        String str = this.a;
        cknz cknzVar = this.b;
        Collection<ccvb> a = ccvfVar.a(str);
        if (a.isEmpty()) {
            return;
        }
        dcdc<dwfl> b = ccvf.b(cknzVar);
        for (ccvb ccvbVar : a) {
            ccvbVar.q(b);
        }
    }

    @Override // defpackage.bbup
    public final void k(dbsg<bttq> dbsgVar) {
        for (ccvb ccvbVar : this.c.a(this.a)) {
            dbsgVar.c(bttq.HTTP_UNKNOWN_STATUS_CODE);
            ccvbVar.w();
        }
    }
}
