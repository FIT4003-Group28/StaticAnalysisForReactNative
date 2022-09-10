package defpackage;

import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;
import com.google.commerce.tapandpay.android.seclient.GetSeCardBalanceRequest;
import com.google.commerce.tapandpay.android.seclient.GetSeCardBalanceResponse;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: xew  reason: default package */
/* loaded from: classes7.dex */
public final class xew implements xfc {
    public final Map<String, xfb> a = new HashMap();
    public final Map<dibx, xfb> b = new HashMap();
    public final crzo<xfc> c = new crzo<>();
    public final ckcw d;
    public final dxio<akfa> e;
    public final xeo f;
    @dzsi
    public CharSequence g;
    @dzsi
    public String h;
    @dzsi
    public dbos i;
    private final Application j;
    private final Executor k;
    private final xel l;
    private final btvo m;
    private final bupf n;

    public xew(Application application, btvo btvoVar, bupf bupfVar, Executor executor, ckcw ckcwVar, dxio dxioVar, xeo xeoVar) {
        this.j = application;
        this.n = bupfVar;
        this.k = executor;
        this.m = btvoVar;
        this.l = new xel(application);
        this.d = ckcwVar;
        this.e = dxioVar;
        this.f = xeoVar;
    }

    @dzsi
    private static dibx m(amve amveVar) {
        if (yyw.d(amveVar.a, dqtz.IC_FARE, null) != null) {
            return dibx.SUICA;
        }
        return null;
    }

    @dzsi
    private static final String n(amve amveVar) {
        for (dpgh dpghVar : vyb.w(amveVar)) {
            if (dpghVar.i) {
                return dpghVar.c;
            }
            String str = dpghVar.c;
        }
        return null;
    }

    private final dibv o() {
        int i;
        dibv bZ = diby.f.bZ();
        xel xelVar = this.l;
        if (!xelVar.c.a()) {
            try {
                xelVar.c = dbsg.i(Long.valueOf(cpke.g(xelVar.a.getContentResolver(), 0L)));
            } catch (SecurityException unused) {
                xelVar.c = dbsg.i(0L);
            }
        }
        long longValue = xelVar.c.b().longValue();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        diby dibyVar = (diby) bZ.b;
        dibyVar.a |= 4;
        dibyVar.d = longValue;
        diia bZ2 = diib.f.bZ();
        int i2 = Build.VERSION.SDK_INT;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        diib diibVar = (diib) bZ2.b;
        diibVar.a |= 4;
        diibVar.d = i2;
        boolean a = this.l.a();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        diib diibVar2 = (diib) bZ2.b;
        diibVar2.a |= 1;
        diibVar2.b = a;
        xel xelVar2 = this.l;
        if (!xelVar2.b.a()) {
            try {
                xelVar2.a.getPackageManager().getPackageInfo("com.felicanetworks.mfc", Build.VERSION.SDK_INT >= 24 ? 512 : 0);
                xelVar2.b = dbsg.i(true);
            } catch (PackageManager.NameNotFoundException unused2) {
                xelVar2.b = dbsg.i(false);
            }
        }
        boolean booleanValue = xelVar2.b.b().booleanValue();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        diib diibVar3 = (diib) bZ2.b;
        diibVar3.a |= 16;
        diibVar3.e = booleanValue;
        xel xelVar3 = this.l;
        if (!xelVar3.d.a()) {
            try {
                i = xelVar3.a.getPackageManager().getPackageInfo("com.google.android.apps.walletnfcrel", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused3) {
                i = 0;
            }
            xelVar3.d = dbsg.i(Integer.valueOf(i));
        }
        int intValue = xelVar3.d.b().intValue();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        diib diibVar4 = (diib) bZ2.b;
        diibVar4.a |= 2;
        diibVar4.c = intValue;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        diby dibyVar2 = (diby) bZ.b;
        diib bK = bZ2.bK();
        bK.getClass();
        dibyVar2.e = bK;
        dibyVar2.a |= 32;
        return bZ;
    }

    @Override // defpackage.xfc
    public final void a(amsy amsyVar) {
        amve[] amveVarArr;
        if (!this.m.getDirectionsPageParameters().o) {
            return;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (amve amveVar : amsyVar.d) {
            dibx m = m(amveVar);
            if (m == null || hashSet.contains(m)) {
                String n = n(amveVar);
                if (n != null && !hashSet2.contains(n)) {
                    hashSet2.add(n);
                    if (this.a.containsKey(n)) {
                        xfb xfbVar = this.a.get(n);
                        if (xfbVar.h() != 4) {
                            if (xfbVar.e()) {
                                b(xfbVar.b, n);
                            }
                        }
                    }
                    j(n, null);
                }
            } else {
                hashSet.add(m);
                if (!this.b.containsKey(m) || this.b.get(m).h() != 4) {
                    j(null, m);
                }
            }
        }
    }

    public final void b(final dice diceVar, final String str) {
        cpbq a = this.f.a();
        k(ckkm.j);
        if (a == null) {
            return;
        }
        a.a().i(new cnon(this, diceVar, str) { // from class: xep
            private final xew a;
            private final dice b;
            private final String c;

            {
                this.a = this;
                this.b = diceVar;
                this.c = str;
            }

            @Override // defpackage.cnon
            public final void Om(cnom cnomVar) {
                final xew xewVar = this.a;
                final dice diceVar2 = this.b;
                final String str2 = this.c;
                cpbi cpbiVar = (cpbi) cnomVar;
                final GetAllCardsResponse getAllCardsResponse = cpbiVar.b;
                if (!cpbiVar.a.d() || getAllCardsResponse == null) {
                    Status status = cpbiVar.a;
                    cpcq<AccountInfo> b = xewVar.f.a().b();
                    b.s(new cpcl(xewVar, getAllCardsResponse, diceVar2, str2) { // from class: xeq
                        private final xew a;
                        private final GetAllCardsResponse b;
                        private final dice c;
                        private final String d;

                        {
                            this.a = xewVar;
                            this.b = getAllCardsResponse;
                            this.c = diceVar2;
                            this.d = str2;
                        }

                        @Override // defpackage.cpcl
                        public final void c(Object obj) {
                            xew xewVar2 = this.a;
                            GetAllCardsResponse getAllCardsResponse2 = this.b;
                            dice diceVar3 = this.c;
                            String str3 = this.d;
                            if (((AccountInfo) obj) != null || getAllCardsResponse2 == null) {
                                xewVar2.k(ckkm.k);
                                return;
                            }
                            xfb xfbVar = new xfb(diceVar3);
                            xfbVar.c = getAllCardsResponse2;
                            xewVar2.a.put(str3, xfbVar);
                            xewVar2.g = null;
                            xewVar2.h = null;
                            xewVar2.c.a(xewVar2);
                        }
                    });
                    b.r(new cpci(xewVar) { // from class: xer
                        private final xew a;

                        {
                            this.a = xewVar;
                        }

                        @Override // defpackage.cpci
                        public final void d(Exception exc) {
                            this.a.k(ckkm.k);
                        }
                    });
                    return;
                }
                AccountInfo accountInfo = getAllCardsResponse.b;
                String str3 = null;
                xewVar.h = accountInfo == null ? null : accountInfo.a;
                if (!btlu.q(xewVar.e.a().j()).d.equals(xewVar.h)) {
                    xewVar.k(ckkm.l);
                    return;
                }
                xfb xfbVar = new xfb(diceVar2);
                xfbVar.c = getAllCardsResponse;
                xewVar.a.put(str2, xfbVar);
                String str4 = getAllCardsResponse.c;
                CardInfo[] cardInfoArr = getAllCardsResponse.a;
                if (str4 != null && cardInfoArr != null) {
                    int length = cardInfoArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        CardInfo cardInfo = cardInfoArr[i];
                        if (cardInfo.a.equals(str4)) {
                            str3 = cardInfo.d;
                            break;
                        }
                        i++;
                    }
                }
                xewVar.g = str3;
                xewVar.c.a(xewVar);
            }
        });
    }

    @Override // defpackage.xfc
    @dzsi
    public final CharSequence c() {
        return this.g;
    }

    @Override // defpackage.xfc
    @dzsi
    public final String d() {
        return this.h;
    }

    public final void e(final dice diceVar, @dzsi final String str) {
        GetSeCardBalanceResponse getSeCardBalanceResponse = new GetSeCardBalanceResponse(5, BigDecimal.ZERO);
        try {
            final ckcv e = this.d.e();
            if (this.i == null) {
                this.i = new dbos(this.j);
            }
            if (!this.i.a.a()) {
                k(ckkm.n);
                f(diceVar, getSeCardBalanceResponse, str);
                return;
            }
            btlu q = btlu.q(this.e.a().j());
            if (!q.l()) {
                k(ckkm.l);
                f(diceVar, getSeCardBalanceResponse, str);
                return;
            }
            String t = q.t();
            dbsk.s(t);
            final GetSeCardBalanceRequest getSeCardBalanceRequest = new GetSeCardBalanceRequest(t);
            dbos dbosVar = this.i;
            dbsk.s(dbosVar);
            final dbox dboxVar = dbosVar.b;
            if (dboxVar.d) {
                dboz dbozVar = new dboz(dboxVar.b);
                if (dbozVar.a()) {
                    PackageInfo b = dbozVar.b();
                    String str2 = b != null ? b.packageName : null;
                    Intent intent = new Intent();
                    intent.setPackage(str2);
                    intent.setClassName(str2, "com.google.commerce.tapandpay.android.secard.service.SecureElementService");
                    dboxVar.e = new CountDownLatch(1);
                    try {
                        if (dboxVar.b.bindService(intent, dboxVar, 1)) {
                            dboxVar.d = false;
                        }
                    } catch (SecurityException e2) {
                        dboxVar.c.set(new dbou("No permission to bind to service", e2));
                    } catch (Exception e3) {
                        dboxVar.c.set(new dbou("Error while binding to service", e3));
                    }
                    dboxVar.c.compareAndSet(null, new dbou("Service not found, or process cannot bind."));
                    dboxVar.e.countDown();
                } else {
                    throw new dbou("Not eligible for eMoney services!");
                }
            }
            cpcq f = cpda.c(dboxVar.a, new Callable(dboxVar) { // from class: dbov
                private final dbox a;

                {
                    this.a = dboxVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    dbox dboxVar2 = this.a;
                    dboxVar2.e.await();
                    dboxVar2.a();
                    return dboxVar2.f;
                }
            }).f(dbow.a);
            f.s(new cpcl(this, getSeCardBalanceRequest, diceVar, str, e) { // from class: xes
                private final xew a;
                private final GetSeCardBalanceRequest b;
                private final dice c;
                private final String d;
                private final ckcv e;

                {
                    this.a = this;
                    this.b = getSeCardBalanceRequest;
                    this.c = diceVar;
                    this.d = str;
                    this.e = e;
                }

                @Override // defpackage.cpcl
                public final void c(Object obj) {
                    xew xewVar = this.a;
                    GetSeCardBalanceRequest getSeCardBalanceRequest2 = this.b;
                    dice diceVar2 = this.c;
                    String str3 = this.d;
                    ckcv ckcvVar = this.e;
                    Void r10 = (Void) obj;
                    try {
                        dbos dbosVar2 = xewVar.i;
                        dbsk.s(dbosVar2);
                        xeu xeuVar = new xeu(xewVar, diceVar2, str3, ckcvVar);
                        dboz dbozVar2 = dbosVar2.a;
                        dboy dboyVar = dboy.GET_SE_CARD_BALANCE;
                        if (!dboz.a.containsKey(dboyVar)) {
                            String valueOf = String.valueOf(dboyVar);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
                            sb.append("Expected to find min version for API method: ");
                            sb.append(valueOf);
                            throw new IllegalStateException(sb.toString());
                        }
                        int intValue = dboz.a.get(dboyVar).intValue();
                        PackageInfo b2 = dbozVar2.b();
                        if (b2 == null) {
                            String valueOf2 = String.valueOf(dboyVar);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 71);
                            sb2.append("Unable to find GPay package while checking eligibility for API method: ");
                            sb2.append(valueOf2);
                            throw new IllegalStateException(sb2.toString());
                        } else if (b2.versionCode >= intValue) {
                            try {
                                dbox dboxVar2 = dbosVar2.b;
                                dboxVar2.a();
                                dboxVar2.f.e(getSeCardBalanceRequest2, xeuVar);
                            } catch (RemoteException e4) {
                                throw new IllegalStateException(e4);
                            }
                        } else {
                            throw new dbot(String.format("pkg version (%s) older than min supported version for API method: %s: %s", Integer.valueOf(b2.versionCode), dboyVar, Integer.valueOf(intValue)));
                        }
                    } catch (dbou unused) {
                        xewVar.l(diceVar2, str3);
                    }
                }
            });
            f.r(new cpci(this, diceVar, str) { // from class: xet
                private final xew a;
                private final dice b;
                private final String c;

                {
                    this.a = this;
                    this.b = diceVar;
                    this.c = str;
                }

                @Override // defpackage.cpci
                public final void d(Exception exc) {
                    this.a.l(this.b, this.c);
                }
            });
        } catch (Exception unused) {
            l(diceVar, str);
        }
    }

    public final void f(dice diceVar, GetSeCardBalanceResponse getSeCardBalanceResponse, @dzsi String str) {
        int i = getSeCardBalanceResponse.b;
        BigDecimal bigDecimal = getSeCardBalanceResponse.a;
        if (i == 2) {
            k(ckkm.l);
        }
        xfb xfbVar = new xfb(diceVar);
        xfbVar.d = getSeCardBalanceResponse;
        if (str != null) {
            this.a.put(str, xfbVar);
        } else {
            this.b.put(dibx.SUICA, xfbVar);
        }
        dbos dbosVar = this.i;
        if (dbosVar != null) {
            try {
                dbox dboxVar = dbosVar.b;
                if (!dboxVar.d) {
                    dboxVar.d = true;
                    dboxVar.b.unbindService(dboxVar);
                }
            } catch (Exception unused) {
                k(ckkm.o);
            }
        }
        this.c.a(this);
    }

    @Override // defpackage.xfc
    public final crzm<xfc> g() {
        return this.c.a;
    }

    @Override // defpackage.xfc
    public final xfb h(amsy amsyVar) {
        amve[] amveVarArr;
        xfb xfbVar = xfb.a;
        for (amve amveVar : amsyVar.d) {
            if (vyb.D(amveVar) && !amveVar.b().i) {
                xfb i = i(amveVar);
                if (xfbVar.b.equals(xfb.a.b)) {
                    xfbVar = i;
                } else if (!xfbVar.g(i)) {
                    return xfb.a;
                }
            }
        }
        return xfbVar;
    }

    @Override // defpackage.xfc
    public final xfb i(amve amveVar) {
        dibx m = m(amveVar);
        String n = n(amveVar);
        if (m == null || !this.b.containsKey(m)) {
            if (n == null || !this.a.containsKey(n)) {
                return xfb.a;
            }
            return this.a.get(n);
        }
        return this.b.get(m);
    }

    final void j(@dzsi String str, @dzsi dibx dibxVar) {
        diby dibyVar;
        if (str != null) {
            dibv o = o();
            if (o.c) {
                o.bF();
                o.c = false;
            }
            diby dibyVar2 = (diby) o.b;
            diby dibyVar3 = diby.f;
            str.getClass();
            dibyVar2.b = 3;
            dibyVar2.c = str;
            dibyVar = o.bK();
        } else if (dibxVar != null) {
            dibv o2 = o();
            if (o2.c) {
                o2.bF();
                o2.c = false;
            }
            diby dibyVar4 = (diby) o2.b;
            diby dibyVar5 = diby.f;
            dibyVar4.c = Integer.valueOf(dibxVar.c);
            dibyVar4.b = 5;
            dibyVar = o2.bK();
        } else {
            dibyVar = null;
        }
        if (dibyVar != null) {
            this.n.b(dibyVar, new xev(this, str, dibxVar), this.k);
        }
        ((ckco) this.d.a(ckkm.q)).a(0);
    }

    public final void k(ckgu ckguVar) {
        ((ckcn) this.d.a(ckguVar)).a();
    }

    public final void l(dice diceVar, @dzsi String str) {
        k(ckkm.o);
        f(diceVar, new GetSeCardBalanceResponse(5, BigDecimal.ZERO), str);
    }
}
