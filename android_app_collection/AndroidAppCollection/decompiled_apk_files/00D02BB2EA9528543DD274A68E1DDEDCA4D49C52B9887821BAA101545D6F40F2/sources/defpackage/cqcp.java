package defpackage;

import android.accounts.Account;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.udc.UdcWriteLocalSettingsRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cqcp  reason: default package */
/* loaded from: classes5.dex */
final class cqcp extends a {
    public final z<cqcm> d;
    public final z<String> e;
    public final z<Bitmap> f;
    public final cqbw g;
    public dslz h;
    public final int i;
    final Account j;
    final dskf k;
    final dsmh l;
    private final cqbr m;
    private final cqda n;

    public cqcp(Application application, Account account, dskf dskfVar, dsmh dsmhVar, cqbr cqbrVar, cqda cqdaVar) {
        super(application);
        this.d = new z<>();
        this.e = new z<>();
        this.f = new z<>();
        this.j = account;
        this.k = dskfVar;
        this.l = dsmhVar;
        this.m = cqbrVar;
        this.n = cqdaVar;
        int nextInt = dbsy.a.nextInt();
        this.i = nextInt;
        this.g = cqbv.a(application, Integer.valueOf(nextInt), dsmhVar, account, dskfVar);
    }

    public final void c(cqcm cqcmVar) {
        dehn c;
        dehn e;
        cqcm h = this.d.h();
        this.d.g(cqcmVar);
        cqdb cqdbVar = cqdb.ALREADY_CONSENTED;
        cqcm cqcmVar2 = cqcm.CONSENT_DATA_LOADING;
        boolean z = false;
        switch (cqcmVar.ordinal()) {
            case 0:
                if (h == null || h == cqcm.CONSENT_DATA_LOADING_FAILED) {
                    z = true;
                }
                dbsk.l(z);
                cqbr cqbrVar = this.m;
                Application application = this.a;
                Account account = this.j;
                final z<String> zVar = this.e;
                zVar.getClass();
                cqbrVar.a(application, account, new cqbq(zVar) { // from class: cqci
                    private final z a;

                    {
                        this.a = zVar;
                    }

                    @Override // defpackage.cqbq
                    public final void a(Object obj) {
                        this.a.f((String) obj);
                    }
                });
                this.f.f(this.m.c(this.a));
                cqbr cqbrVar2 = this.m;
                Application application2 = this.a;
                Account account2 = this.j;
                final z<Bitmap> zVar2 = this.f;
                zVar2.getClass();
                cqbrVar2.b(application2, account2, new cqbq(zVar2) { // from class: cqcj
                    private final z a;

                    {
                        this.a = zVar2;
                    }

                    @Override // defpackage.cqbq
                    public final void a(Object obj) {
                        this.a.f((Bitmap) obj);
                    }
                });
                cqda cqdaVar = this.n;
                Application application3 = this.a;
                deha.q(cqdaVar.a(application3, this.j, this.k, cqbs.a(application3), this.l, false), new cqcl(this), new cqco());
                return;
            case 1:
                dbsk.l(h == cqcm.CONSENT_DATA_LOADING || h == cqcm.CONSENT_WRITE_IN_PROGRESS);
                if (h != cqcm.CONSENT_DATA_LOADING) {
                    this.g.b(8);
                    return;
                } else if ((this.h.a & 8) == 0) {
                    return;
                } else {
                    cqbw cqbwVar = this.g;
                    dskg bZ = dsks.g.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dsks dsksVar = (dsks) bZ.b;
                    dsksVar.b = 7;
                    dsksVar.a |= 1;
                    dskl bZ2 = dskm.c.bZ();
                    int i = this.h.f;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dskm dskmVar = (dskm) bZ2.b;
                    dskmVar.a |= 1;
                    dskmVar.b = i;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dsks dsksVar2 = (dsks) bZ.b;
                    dskm bK = bZ2.bK();
                    bK.getClass();
                    dsksVar2.d = bK;
                    dsksVar2.a |= 4;
                    cqbwVar.a(bZ.bK());
                    return;
                }
            case 2:
                dbsk.l(h == cqcm.WAITING_FOR_USER_DECISION);
                dbsk.s(this.h);
                final Application application4 = this.a;
                Account account3 = this.j;
                dskf dskfVar = this.k;
                String a = cqbs.a(application4);
                synchronized (cqda.f) {
                    cqda.f.remove(cqcx.d(account3.name, dskfVar, a));
                }
                final cqda cqdaVar2 = this.n;
                final Account account4 = this.j;
                final dskf dskfVar2 = this.k;
                final dcdc r = dcdc.r(this.h.d);
                final dsmh dsmhVar = this.l;
                final dspd dspdVar = this.h.e;
                if (dxyj.c()) {
                    dsmi bZ3 = dsml.g.bZ();
                    dsku c2 = cqda.c(application4, dsmhVar);
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dsml dsmlVar = (dsml) bZ3.b;
                    c2.getClass();
                    dsmlVar.c = c2;
                    int i2 = dsmlVar.a | 1;
                    dsmlVar.a = i2;
                    dspdVar.getClass();
                    dsmlVar.a = 2 | i2;
                    dsmlVar.d = dspdVar;
                    Iterator it = r.iterator();
                    while (it.hasNext()) {
                        dsmj bZ4 = dsmk.c.bZ();
                        int intValue = ((Integer) it.next()).intValue();
                        if (bZ4.c) {
                            bZ4.bF();
                            bZ4.c = false;
                        }
                        dsmk dsmkVar = (dsmk) bZ4.b;
                        dsmkVar.a |= 1;
                        dsmkVar.b = intValue;
                        dsmk.b(dsmkVar);
                        bZ3.a(bZ4);
                    }
                    if (dskfVar2.w == 3) {
                        dskz bZ5 = dsla.d.bZ();
                        if (bZ5.c) {
                            bZ5.bF();
                            bZ5.c = false;
                        }
                        dsla dslaVar = (dsla) bZ5.b;
                        dslaVar.a |= 1;
                        dslaVar.b = true;
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        dsml dsmlVar2 = (dsml) bZ3.b;
                        dsla bK2 = bZ5.bK();
                        bK2.getClass();
                        dsmlVar2.f = bK2;
                        dsmlVar2.a |= 8;
                    }
                    final cxhb b = cqdaVar2.d.b(account4);
                    dsml bK3 = bZ3.bK();
                    b.c();
                    final long e2 = b.c.e();
                    cxhm cxhmVar = b.a;
                    dsqp dsqpVar = (dsqp) bK3.cu(5);
                    dsqpVar.bC(bK3);
                    dsmi dsmiVar = (dsmi) dsqpVar;
                    if (dsmiVar.c) {
                        dsmiVar.bF();
                        dsmiVar.c = false;
                    }
                    dsml dsmlVar3 = (dsml) dsmiVar.b;
                    dsmlVar3.e = null;
                    dsmlVar3.a &= -5;
                    final dsml bK4 = dsmiVar.bK();
                    synchronized (((cxid) cxhmVar).a) {
                        final cxid cxidVar = (cxid) cxhmVar;
                        e = ((cxid) cxhmVar).e(new deff(cxidVar, bK4) { // from class: cxhw
                            private final cxid a;
                            private final dsml b;

                            {
                                this.a = cxidVar;
                                this.b = bK4;
                            }

                            @Override // defpackage.deff
                            public final dehn a() {
                                cxid cxidVar2 = this.a;
                                return dbae.a(cxidVar2.c.b(this.b), new defg(cxidVar2) { // from class: cxhp
                                    private final cxid a;

                                    {
                                        this.a = cxidVar2;
                                    }

                                    @Override // defpackage.defg
                                    public final dehn a(Object obj) {
                                        final cxid cxidVar3 = this.a;
                                        final dsmn dsmnVar = (dsmn) obj;
                                        if (dsmnVar.a == null) {
                                            dslt dsltVar = dslt.d;
                                        }
                                        return dbae.b(cxie.a(), new dbrn(cxidVar3, dsmnVar) { // from class: cxhq
                                            private final cxid a;
                                            private final dsmn b;

                                            {
                                                this.a = cxidVar3;
                                                this.b = dsmnVar;
                                            }

                                            @Override // defpackage.dbrn
                                            public final Object a(Object obj2) {
                                                cxid cxidVar4 = this.a;
                                                dsmn dsmnVar2 = this.b;
                                                Void r4 = (Void) obj2;
                                                dslt dsltVar2 = dsmnVar2.a;
                                                if (dsltVar2 == null) {
                                                    dsltVar2 = dslt.d;
                                                }
                                                cxidVar4.b = cxic.c(dsltVar2, cxidVar4.d);
                                                return dsmnVar2;
                                            }
                                        }, dege.a);
                                    }
                                }, dege.a);
                            }
                        });
                    }
                    c = deew.h(dbae.b(b.d(e, 3007, e2), new dbrn(b, e2) { // from class: cxgx
                        private final cxgz a;
                        private final long b;

                        {
                            this.a = b;
                            this.b = e2;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj) {
                            cxgz cxgzVar = this.a;
                            dsmn dsmnVar = (dsmn) obj;
                            cxgzVar.b.c(3007, true, cxgzVar.c.e() - this.b, null, null, null, null);
                            return dsmnVar;
                        }
                    }, dege.a), cqct.a, dege.a);
                } else {
                    c = dehx.c(Executors.newSingleThreadExecutor()).c(new Callable(cqdaVar2, r, application4, account4, dsmhVar, dspdVar, dskfVar2) { // from class: cqcs
                        private final cqda a;
                        private final dccr b;
                        private final Context c;
                        private final Account d;
                        private final dsmh e;
                        private final dspd f;
                        private final dskf g;

                        {
                            this.a = cqdaVar2;
                            this.b = r;
                            this.c = application4;
                            this.d = account4;
                            this.e = dsmhVar;
                            this.f = dspdVar;
                            this.g = dskfVar2;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            cqda cqdaVar3 = this.a;
                            dccr<Integer> dccrVar = this.b;
                            Context context = this.c;
                            Account account5 = this.d;
                            dsmh dsmhVar2 = this.e;
                            dspd dspdVar2 = this.f;
                            dskf dskfVar3 = this.g;
                            if (!dccrVar.isEmpty() || dxyj.a.a().c()) {
                                dsmi bZ6 = dsml.g.bZ();
                                dsku c3 = cqda.c(context, dsmhVar2);
                                if (bZ6.c) {
                                    bZ6.bF();
                                    bZ6.c = false;
                                }
                                dsml dsmlVar4 = (dsml) bZ6.b;
                                c3.getClass();
                                dsmlVar4.c = c3;
                                int i3 = dsmlVar4.a | 1;
                                dsmlVar4.a = i3;
                                dspdVar2.getClass();
                                dsmlVar4.a = i3 | 2;
                                dsmlVar4.d = dspdVar2;
                                for (Integer num : dccrVar) {
                                    dsmj bZ7 = dsmk.c.bZ();
                                    int intValue2 = num.intValue();
                                    if (bZ7.c) {
                                        bZ7.bF();
                                        bZ7.c = false;
                                    }
                                    dsmk dsmkVar2 = (dsmk) bZ7.b;
                                    dsmkVar2.a |= 1;
                                    dsmkVar2.b = intValue2;
                                    dsmk.b(dsmkVar2);
                                    bZ6.a(bZ7);
                                }
                                bZ6.bK();
                                dyhi d = cqdaVar3.d();
                                try {
                                    try {
                                        dslj dsljVar = (dslj) ((dslj) dsll.c(d).h(dyjp.a(cqda.b(context, account5)))).f(dxyj.d(), TimeUnit.MILLISECONDS);
                                        dsmn dsmnVar = (dsmn) dyzf.c(dsljVar.a, dsll.a(), dsljVar.b, bZ6.bK());
                                    } catch (dyjd e3) {
                                        throw e3;
                                    }
                                } finally {
                                    d.g();
                                }
                            }
                            if (cqda.a.containsKey(dskfVar3)) {
                                cpdv a2 = cqcz.a(context, account5);
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(new UdcWriteLocalSettingsRequest.SettingChange(cqda.a.get(dskfVar3).l, true));
                                UdcWriteLocalSettingsRequest udcWriteLocalSettingsRequest = new UdcWriteLocalSettingsRequest((UdcWriteLocalSettingsRequest.SettingChange[]) arrayList.toArray(new UdcWriteLocalSettingsRequest.SettingChange[0]));
                                GoogleApiClient googleApiClient = a2.i;
                                cpeh cpehVar = new cpeh(googleApiClient, udcWriteLocalSettingsRequest);
                                googleApiClient.enqueue(cpehVar);
                                cpda.e(cnwb.c(cpehVar), cqda.c, TimeUnit.MILLISECONDS);
                                return null;
                            }
                            return null;
                        }
                    });
                }
                deha.q(c, new cqck(this, application4), new cqco());
                return;
            case 3:
                if (h == cqcm.CONSENT_WRITE_IN_PROGRESS) {
                    z = true;
                }
                dbsk.l(z);
                this.g.b(13);
                return;
            case 4:
                if (h == cqcm.CONSENT_DATA_LOADING) {
                    z = true;
                }
                dbsk.l(z);
                this.g.c(3);
                return;
            case 5:
                if (h == cqcm.CONSENT_DATA_LOADING) {
                    z = true;
                }
                dbsk.l(z);
                this.g.c(2);
                return;
            case 6:
                if (h == cqcm.CONSENT_DATA_LOADING) {
                    z = true;
                }
                dbsk.l(z);
                this.g.b(5);
                return;
            default:
                return;
        }
    }
}
