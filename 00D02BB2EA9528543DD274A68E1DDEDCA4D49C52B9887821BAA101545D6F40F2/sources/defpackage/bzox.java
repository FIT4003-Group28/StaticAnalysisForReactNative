package defpackage;

import android.accounts.Account;
import android.os.Bundle;
/* renamed from: bzox  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class bzox {
    private final bzpb a;
    private final Account b;
    private final dskf c;
    private final dsmh d;

    public bzox(bzpb bzpbVar, Account account, dskf dskfVar, dsmh dsmhVar) {
        this.a = bzpbVar;
        this.b = account;
        this.c = dskfVar;
        this.d = dsmhVar;
    }

    public final void a(cqdb cqdbVar) {
        final bzpb bzpbVar = this.a;
        Account account = this.b;
        dskf dskfVar = this.c;
        dsmh dsmhVar = this.d;
        cqdb cqdbVar2 = cqdb.ALREADY_CONSENTED;
        int ordinal = cqdbVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    final bzpo bzpoVar = bzpbVar.e;
                    if (bzpoVar != null) {
                        bzpbVar.c.runOnUiThread(new Runnable(bzpoVar) { // from class: bzoy
                            private final bzpo a;

                            {
                                this.a = bzpoVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.a.a();
                            }
                        });
                        return;
                    }
                    final bzqd bzqdVar = new bzqd();
                    dbsk.t(account, "No account provided.");
                    dbsk.t(dskfVar, "No setting provided.");
                    dbsk.t(dsmhVar, "No uiFlowId provided.");
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("Account", account);
                    bundle.putSerializable("SettingId", dskfVar);
                    bundle.putSerializable("FlowId", dsmhVar);
                    bzqdVar.B(bundle);
                    bzqdVar.ad = bzpbVar;
                    bzpbVar.c.runOnUiThread(new Runnable(bzpbVar, bzqdVar) { // from class: bzoz
                        private final bzpb a;
                        private final bzqd b;

                        {
                            this.a = bzpbVar;
                            this.b = bzqdVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            bzpb bzpbVar2 = this.a;
                            bzpbVar2.a.C(this.b, gfu.ACTIVITY_FRAGMENT, new gfs[0]);
                        }
                    });
                    bzpbVar.f();
                    return;
                } else if (ordinal != 3) {
                    return;
                }
            }
            bzpbVar.c();
            return;
        }
        bzpbVar.b();
    }
}
