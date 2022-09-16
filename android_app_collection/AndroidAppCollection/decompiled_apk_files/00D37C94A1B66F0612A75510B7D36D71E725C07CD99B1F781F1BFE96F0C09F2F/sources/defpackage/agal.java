package defpackage;

import android.accounts.Account;
import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: agal  reason: default package */
/* loaded from: classes.dex */
public final class agal implements agak {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final aacz e;

    public agal(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, aacz aaczVar) {
        this.a = azqbVar2;
        this.b = azqbVar3;
        this.e = aaczVar;
        this.d = azqbVar;
        this.c = azqbVar4;
    }

    private final void b(int i) {
        ((acsf) this.c.get()).b(new acsd(i - 1, 10), aqzj.FLOW_TYPE_CHIME_REGISTRATION);
    }

    @Override // defpackage.agak
    public final void a() {
        ampq ampqVar;
        b(2);
        atpm atpmVar = this.e.b().w;
        if (atpmVar == null) {
            atpmVar = atpm.a;
        }
        if (atpmVar.d) {
            try {
                ampqVar = ampq.i(((vzc) this.a.get()).a(((afvn) this.b.get()).c()));
            } catch (RemoteException | qsc | qsd e) {
                afus.c(2, 7, "Get account failed", e);
                ampqVar = amon.a;
            }
            if (!ampqVar.h()) {
                return;
            }
            b(3);
            ((uiw) this.d.get()).a(amuk.r(((Account) ampqVar.c()).name));
            b(4);
        }
    }
}
