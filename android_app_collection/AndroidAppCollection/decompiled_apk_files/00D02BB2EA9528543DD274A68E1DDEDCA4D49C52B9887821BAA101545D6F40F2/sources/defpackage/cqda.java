package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.udc.UdcCacheResponse;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.chromium.net.ExperimentalCronetEngine;
/* compiled from: PG */
/* renamed from: cqda  reason: default package */
/* loaded from: classes5.dex */
public final class cqda {
    public static final dcdn<dskf, dsnt> a;
    public static final dcdn<Integer, Boolean> b;
    public static final long c;
    static final Map<cqcx, cqcy> f;
    private static final long g;
    public final cxgo d;
    public dyhi e;
    private final bzpa h;

    static {
        dskf dskfVar = dskf.SUPPLEMENTAL_WEB_AND_APP_ACTIVITY;
        dsnt dsntVar = dsnt.SUPPL_WEB_AND_APP_DEVICE_LEVEL;
        dbzb.a(dskfVar, dsntVar);
        a = new dcmh(new Object[]{dskfVar, dsntVar}, 1);
        b = dcco.a(2, true, 3, false);
        g = TimeUnit.HOURS.toMillis(1L);
        c = TimeUnit.SECONDS.toMillis(10L);
        f = new HashMap();
    }

    public cqda() {
        bzpa bzpaVar = cqca.c;
        dbsk.t(bzpaVar, "Did you call ConsentFlow.setGrpcChannelFactory?");
        cxgo cxgoVar = cqca.a;
        this.e = null;
        this.h = bzpaVar;
        this.d = cxgoVar;
        if (dxyj.c() || dxyj.b()) {
            dbsk.t(cxgoVar, "Did you call ConsentFlow.setGmsCoreFacsCacheFactory?");
        }
    }

    public static dbma b(Context context, Account account) {
        return dbma.d(new dblw(AccountManager.get(context).blockingGetAuthToken(account, "oauth2:https://www.googleapis.com/auth/webhistory", true), new Date(System.currentTimeMillis() + g)));
    }

    public static final dsku c(Context context, dsmh dsmhVar) {
        try {
            String packageName = context.getApplicationContext().getPackageName();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            dskt bZ = dsku.f.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dsku dskuVar = (dsku) bZ.b;
            dskuVar.b = dsmhVar.aj;
            int i = dskuVar.a | 1;
            dskuVar.a = i;
            packageName.getClass();
            dskuVar.a = i | 2;
            dskuVar.c = packageName;
            int b2 = dekj.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dsku dskuVar2 = (dsku) bZ.b;
            dskuVar2.a |= 8;
            dskuVar2.e = b2;
            if (packageInfo.versionName != null) {
                String str = packageInfo.versionName;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dsku dskuVar3 = (dsku) bZ.b;
                str.getClass();
                dskuVar3.a |= 4;
                dskuVar3.d = str;
            }
            return bZ.bK();
        } catch (PackageManager.NameNotFoundException unused) {
            throw new AssertionError("Unable to get package name.");
        }
    }

    public final dehn<dslz> a(final Context context, final Account account, final dskf dskfVar, final String str, final dsmh dsmhVar, boolean z) {
        dehn c2;
        dehn h;
        final cqcx d = cqcx.d(account.name, dskfVar, str);
        Map<cqcx, cqcy> map = f;
        synchronized (map) {
            cqcy cqcyVar = map.get(d);
            if (cqcyVar != null && !z && SystemClock.elapsedRealtime() < cqcyVar.b + (dxyj.a.a().g() * 1000)) {
                return cqcyVar.a;
            }
            if (!dxyj.b()) {
                c2 = dehx.c(Executors.newSingleThreadExecutor()).c(new Callable(this, dskfVar, str, context, dsmhVar, account) { // from class: cqcr
                    private final cqda a;
                    private final dskf b;
                    private final String c;
                    private final Context d;
                    private final dsmh e;
                    private final Account f;

                    {
                        this.a = this;
                        this.b = dskfVar;
                        this.c = str;
                        this.d = context;
                        this.e = dsmhVar;
                        this.f = account;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        dbsg i;
                        cqda cqdaVar = this.a;
                        dskf dskfVar2 = this.b;
                        String str2 = this.c;
                        Context context2 = this.d;
                        dsmh dsmhVar2 = this.e;
                        Account account2 = this.f;
                        dyhi d2 = cqdaVar.d();
                        try {
                            try {
                                dslu bZ = dslv.f.bZ();
                                int i2 = dskfVar2.w;
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                dslv dslvVar = (dslv) bZ.b;
                                int i3 = dslvVar.a | 1;
                                dslvVar.a = i3;
                                dslvVar.b = i2;
                                str2.getClass();
                                dslvVar.a = i3 | 4;
                                dslvVar.d = str2;
                                dsku c3 = cqda.c(context2, dsmhVar2);
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                dslv dslvVar2 = (dslv) bZ.b;
                                c3.getClass();
                                dslvVar2.e = c3;
                                dslvVar2.a |= 8;
                                dsnt dsntVar = cqda.a.get(dskfVar2);
                                if (dsntVar != null) {
                                    cpcq<UdcCacheResponse> a2 = cqcz.a(context2, account2).a(new UdcCacheRequest(new int[]{dsntVar.l}));
                                    cpda.e(a2, cqda.c, TimeUnit.MILLISECONDS);
                                    if (!a2.b()) {
                                        int i4 = dsntVar.l;
                                        StringBuilder sb = new StringBuilder(44);
                                        sb.append("Could not load device level bit  ");
                                        sb.append(i4);
                                        throw new ExecutionException(sb.toString(), a2.e());
                                    }
                                    UdcCacheResponse d3 = a2.d();
                                    dbsk.w(d3, "UDC returned empty result for device level bit %s", dsntVar);
                                    for (UdcCacheResponse.UdcSetting udcSetting : d3.a) {
                                        if (udcSetting.a == dsntVar.l) {
                                            int i5 = udcSetting.b;
                                            dcdn<Integer, Boolean> dcdnVar = cqda.b;
                                            Integer valueOf = Integer.valueOf(i5);
                                            Boolean bool = dcdnVar.get(valueOf);
                                            if (bool == null) {
                                                throw new NullPointerException(dbtx.b("Invalid state of the device level bit %s", valueOf));
                                            }
                                            dskz bZ2 = dsla.d.bZ();
                                            if (dskfVar2.w == 3) {
                                                boolean booleanValue = bool.booleanValue();
                                                if (bZ2.c) {
                                                    bZ2.bF();
                                                    bZ2.c = false;
                                                }
                                                dsla dslaVar = (dsla) bZ2.b;
                                                dslaVar.a |= 1;
                                                dslaVar.b = booleanValue;
                                            }
                                            i = dbsg.i(bZ2.bK());
                                        }
                                    }
                                    int i6 = dsntVar.l;
                                    StringBuilder sb2 = new StringBuilder(56);
                                    sb2.append("Could not find in UDC cache device level bit ");
                                    sb2.append(i6);
                                    throw new IllegalStateException(sb2.toString());
                                }
                                i = dbpy.a;
                                if (i.a()) {
                                    dsla dslaVar2 = (dsla) i.b();
                                    if (bZ.c) {
                                        bZ.bF();
                                        bZ.c = false;
                                    }
                                    dslv dslvVar3 = (dslv) bZ.b;
                                    dslaVar2.getClass();
                                    dslvVar3.c = dslaVar2;
                                    dslvVar3.a |= 2;
                                }
                                bZ.bK();
                                dslj dsljVar = (dslj) ((dslj) dsll.c(d2).h(dyjp.a(cqda.b(context2, account2)))).f(dxyj.d(), TimeUnit.MILLISECONDS);
                                return (dslz) dyzf.c(dsljVar.a, dsll.b(), dsljVar.b, bZ.bK());
                            } catch (dyjd e) {
                                throw e;
                            }
                        } finally {
                            d2.g();
                        }
                    }
                });
            } else {
                this.e = null;
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                if (a.get(dskfVar) == null) {
                    h = deha.a(dbpy.a);
                } else {
                    final cxhb b2 = this.d.b(account);
                    b2.c();
                    final long e = b2.c.e();
                    h = deew.h(dbae.b(b2.d(b2.a.a(), 3008, e), new dbrn(b2, e) { // from class: cxha
                        private final cxhb a;
                        private final long b;

                        {
                            this.a = b2;
                            this.b = e;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj) {
                            cxhb cxhbVar = this.a;
                            long j = this.b;
                            cxhl cxhlVar = (cxhl) obj;
                            dsla dslaVar = cxhlVar.a().c;
                            if (dslaVar == null) {
                                dslaVar = dsla.d;
                            }
                            cxhbVar.b.c(3008, true, cxhbVar.c.e() - j, null, cxhlVar.b(), null, null);
                            return dslaVar;
                        }
                    }, dege.a), cqcu.a, dege.a);
                }
                c2 = deew.g(h, new defg(this, context, account, dskfVar, str, dsmhVar) { // from class: cqcq
                    private final cqda a;
                    private final Context b;
                    private final Account c;
                    private final dskf d;
                    private final String e;
                    private final dsmh f;

                    {
                        this.a = this;
                        this.b = context;
                        this.c = account;
                        this.d = dskfVar;
                        this.e = str;
                        this.f = dsmhVar;
                    }

                    @Override // defpackage.defg
                    public final dehn a(Object obj) {
                        return this.a.e(this.b, this.c, this.d, this.e, this.f, (dbsg) obj);
                    }
                }, newSingleThreadExecutor);
                deha.q(c2, new cqcw(this), newSingleThreadExecutor);
            }
            dehn<dslz> h2 = deee.h(c2, Exception.class, new defg(d) { // from class: cqcv
                private final cqcx a;

                {
                    this.a = d;
                }

                @Override // defpackage.defg
                public final dehn a(Object obj) {
                    cqcx cqcxVar = this.a;
                    Exception exc = (Exception) obj;
                    synchronized (cqda.f) {
                        cqda.f.remove(cqcxVar);
                    }
                    throw exc;
                }
            }, dege.a);
            map.put(d, new cqcy(h2, SystemClock.elapsedRealtime()));
            return h2;
        }
    }

    public final dyhi d() {
        bzpa bzpaVar = this.h;
        return dyjw.a(dxyj.a.a().e(), (int) dxyj.a.a().f(), new ExperimentalCronetEngine.Builder(bzpaVar.a).mo32build()).c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ dehn e(Context context, Account account, dskf dskfVar, String str, dsmh dsmhVar, dbsg dbsgVar) {
        try {
            dbma b2 = b(context, account);
            this.e = d();
            dslu bZ = dslv.f.bZ();
            int i = dskfVar.w;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dslv dslvVar = (dslv) bZ.b;
            int i2 = dslvVar.a | 1;
            dslvVar.a = i2;
            dslvVar.b = i;
            str.getClass();
            dslvVar.a = i2 | 4;
            dslvVar.d = str;
            dsku c2 = c(context, dsmhVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dslv dslvVar2 = (dslv) bZ.b;
            c2.getClass();
            dslvVar2.e = c2;
            dslvVar2.a |= 8;
            dslv bK = bZ.bK();
            if (dbsgVar.a()) {
                dsqp dsqpVar = (dsqp) bK.cu(5);
                dsqpVar.bC(bK);
                dslu dsluVar = (dslu) dsqpVar;
                dsla dslaVar = (dsla) dbsgVar.b();
                if (dsluVar.c) {
                    dsluVar.bF();
                    dsluVar.c = false;
                }
                dslv dslvVar3 = (dslv) dsluVar.b;
                dslaVar.getClass();
                dslvVar3.c = dslaVar;
                dslvVar3.a |= 2;
                bK = dsluVar.bK();
            }
            bK.toString();
            dslk dslkVar = (dslk) ((dslk) dsll.d(this.e).h(dyjp.a(b2))).f(dxyj.d(), TimeUnit.MILLISECONDS);
            return dyzf.d(dslkVar.a.a(dsll.b(), dslkVar.b), bK);
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            return deha.b(e);
        }
    }
}
