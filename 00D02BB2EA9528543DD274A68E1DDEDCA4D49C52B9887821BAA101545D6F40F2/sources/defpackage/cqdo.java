package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cqdo  reason: default package */
/* loaded from: classes5.dex */
public final class cqdo {
    public static final long a = TimeUnit.HOURS.toMillis(1);
    static final Map<cqdn, dehn<dgyb>> b = new HashMap();
    public final cqdi c;

    public cqdo() {
        cqdi cqdiVar = cqdk.c;
        this.c = cqdiVar;
        dbsk.t(cqdiVar, "Did you call ConsentFlow.setGrpcChannelFactory?");
    }

    public final dehn<dgyb> a(final Context context, final Account account, int i, String str) {
        final cqdd cqddVar = new cqdd(account.name, i, str);
        Map<cqdn, dehn<dgyb>> map = b;
        synchronized (map) {
            if (!map.containsKey(cqddVar)) {
                dgxy bZ = dgxz.e.bZ();
                dgyk bZ2 = dgyl.c.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dgyl dgylVar = (dgyl) bZ2.b;
                dgylVar.b = i - 1;
                dgylVar.a |= 1;
                dgyl bK = bZ2.bK();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dgxz dgxzVar = (dgxz) bZ.b;
                bK.getClass();
                dgxzVar.c = bK;
                dgxzVar.b = 1;
                str.getClass();
                dgxzVar.a |= 2;
                dgxzVar.d = str;
                final dgxz bK2 = bZ.bK();
                dehn<dgyb> h = deee.h(dehx.c(Executors.newSingleThreadExecutor()).c(new Callable(this, context, account, bK2) { // from class: cqdl
                    private final cqdo a;
                    private final Context b;
                    private final Account c;
                    private final dgxz d;

                    {
                        this.a = this;
                        this.b = context;
                        this.c = account;
                        this.d = bK2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        dyib<dgxz, dgyb> dyibVar;
                        cqdo cqdoVar = this.a;
                        Context context2 = this.b;
                        Account account2 = this.c;
                        dgxz dgxzVar2 = this.d;
                        dyhi a2 = cqdoVar.c.a(dyab.a.a().d(context2), (int) dyab.a.a().e(context2));
                        try {
                            try {
                                dgyf dgyfVar = (dgyf) ((dgyf) ((dgyf) dgyf.b(new dgye(), a2)).h(dyjp.a(dbma.d(new dblw(cmrh.f(context2, account2, "oauth2:https://www.googleapis.com/auth/user_data_controls"), new Date(System.currentTimeMillis() + cqdo.a)))))).f(dyab.a.a().c(context2), TimeUnit.MILLISECONDS);
                                dyeu dyeuVar = dgyfVar.a;
                                dyib<dgxz, dgyb> dyibVar2 = dgyg.a;
                                if (dyibVar2 == null) {
                                    synchronized (dgyg.class) {
                                        dyibVar = dgyg.a;
                                        if (dyibVar == null) {
                                            dyhx c = dyib.c();
                                            c.c = dyhz.UNARY;
                                            c.d = dyib.b("id.consent.flow.api.MobileTextsService", "GetConsentTexts");
                                            c.e = true;
                                            c.a = dyyq.b(dgxz.e);
                                            c.b = dyyq.b(dgyb.e);
                                            dyibVar = c.a();
                                            dgyg.a = dyibVar;
                                        }
                                    }
                                    dyibVar2 = dyibVar;
                                }
                                return (dgyb) dyzf.c(dyeuVar, dyibVar2, dgyfVar.b, dgxzVar2);
                            } catch (dyjd e) {
                                throw e;
                            }
                        } finally {
                            a2.g();
                        }
                    }
                }), Exception.class, new defg(cqddVar) { // from class: cqdm
                    private final cqdn a;

                    {
                        this.a = cqddVar;
                    }

                    @Override // defpackage.defg
                    public final dehn a(Object obj) {
                        cqdn cqdnVar = this.a;
                        Exception exc = (Exception) obj;
                        synchronized (cqdo.b) {
                            cqdo.b.remove(cqdnVar);
                        }
                        throw exc;
                    }
                }, dege.a);
                map.put(cqddVar, h);
                return h;
            }
            return map.get(cqddVar);
        }
    }
}
