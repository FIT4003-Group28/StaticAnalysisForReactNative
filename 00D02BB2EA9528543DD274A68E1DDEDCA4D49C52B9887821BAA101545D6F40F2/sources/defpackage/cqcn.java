package defpackage;

import android.accounts.Account;
import android.app.Application;
/* compiled from: PG */
/* renamed from: cqcn  reason: default package */
/* loaded from: classes5.dex */
final class cqcn extends as {
    private final Application a;
    private final Account b;
    private final dsmh c;
    private final dskf d;

    public cqcn(Application application, Account account, dskf dskfVar, dsmh dsmhVar) {
        this.a = application;
        this.b = account;
        this.d = dskfVar;
        this.c = dsmhVar;
    }

    @Override // defpackage.as, defpackage.aq
    public final <T extends an> T b(Class<T> cls) {
        cqbr cqbrVar = new cqbr();
        cqda cqdaVar = new cqda();
        dbsk.a(cls.isAssignableFrom(cqcp.class));
        cqcp cqcpVar = new cqcp(this.a, this.b, this.d, this.c, cqbrVar, cqdaVar);
        cqbw cqbwVar = cqcpVar.g;
        dskg bZ = dsks.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsks dsksVar = (dsks) bZ.b;
        dsksVar.b = 3;
        dsksVar.a |= 1;
        dskj bZ2 = dskk.d.bZ();
        int b = dekj.b();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dskk dskkVar = (dskk) bZ2.b;
        int i = dskkVar.a | 4;
        dskkVar.a = i;
        dskkVar.c = b;
        dskkVar.b = cqcpVar.l.aj;
        dskkVar.a = i | 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsks dsksVar2 = (dsks) bZ.b;
        dskk bK = bZ2.bK();
        bK.getClass();
        dsksVar2.c = bK;
        dsksVar2.a |= 2;
        cqbwVar.a(bZ.bK());
        cqcpVar.c(cqcm.CONSENT_DATA_LOADING);
        return cqcpVar;
    }
}
