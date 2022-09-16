package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import com.google.android.libraries.lens.sdk.intent.LensImage;
import com.google.lens.sdk.LensApi;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: afxv  reason: default package */
/* loaded from: classes2.dex */
public final class afxv {
    public static final dcqe a = dcqe.c("afxv");
    public afxf b;
    public final dxio<akfa> c;
    public final amfi d;
    public final bvrb e;
    public final afye f;
    public final afxn g;
    public final Context h;
    public final btvo i;
    public final ckcw j;
    public final gfq k;
    public final Map<String, String> l;
    public final AtomicBoolean m;
    public final AtomicBoolean n;
    public final AtomicBoolean o;
    public final AtomicBoolean p;
    public final AtomicBoolean q;
    final LensApi r;
    @dzsi
    public LensImage s;
    @dzsi
    public Runnable t;
    private final dxio<afha> u;

    public afxv(Context context, btvo btvoVar, bvrb bvrbVar, afye afyeVar, afxn afxnVar, amfi amfiVar, dxio<akfa> dxioVar, dxio<afha> dxioVar2, ckcw ckcwVar, gfq gfqVar) {
        LensApi lensApi = new LensApi(context);
        this.b = afxf.a;
        this.l = new HashMap();
        this.m = new AtomicBoolean();
        this.n = new AtomicBoolean();
        this.o = new AtomicBoolean();
        this.p = new AtomicBoolean();
        this.q = new AtomicBoolean();
        this.r = lensApi;
        this.f = afyeVar;
        this.g = afxnVar;
        this.h = context;
        this.i = btvoVar;
        this.e = bvrbVar;
        this.d = amfiVar;
        this.c = dxioVar;
        this.u = dxioVar2;
        this.j = ckcwVar;
        this.k = gfqVar;
    }

    public static boolean f(@dzsi ilo iloVar) {
        if (iloVar == null) {
            return false;
        }
        dcep<String> as = iloVar.as();
        if (!iloVar.as().isEmpty()) {
            return dcbg.b(as).r(afxq.a).a();
        }
        return iloVar.be() == iln.GEOCODE;
    }

    public static String g(afxd afxdVar) {
        return !afxdVar.b().a() ? "" : bkkc.c(afxdVar.b().b());
    }

    public static Location h(akqq akqqVar) {
        Location location = new Location("Placemark");
        location.setLatitude(akqqVar.a);
        location.setLongitude(akqqVar.b);
        location.getLatitude();
        location.getLongitude();
        return location;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(afxd afxdVar) {
        int f = afxdVar.f();
        int i = f - 1;
        if (f != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 4;
            }
            if (i == 3) {
                return 5;
            }
            return i != 4 ? 0 : 20;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static csfh l(afxd afxdVar, String str) {
        cses bZ = csfh.c.bZ();
        int e = afxdVar.e();
        int i = e - 1;
        if (e != 0) {
            if (i != 2) {
                if (i == 3) {
                    csfg csfgVar = csfg.a;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    csfh csfhVar = (csfh) bZ.b;
                    csfgVar.getClass();
                    csfhVar.b = csfgVar;
                    csfhVar.a = 2;
                    return bZ.bK();
                } else if (i != 4) {
                    return csfh.c;
                } else {
                    csfa csfaVar = csfa.a;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    csfh csfhVar2 = (csfh) bZ.b;
                    csfaVar.getClass();
                    csfhVar2.b = csfaVar;
                    csfhVar2.a = 6;
                    return bZ.bK();
                }
            }
            cset bZ2 = cseu.c.bZ();
            dhho bZ3 = dhhp.c.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dhhp dhhpVar = (dhhp) bZ3.b;
            str.getClass();
            dhhpVar.a |= 1;
            dhhpVar.b = str;
            dhhp bK = bZ3.bK();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            cseu cseuVar = (cseu) bZ2.b;
            bK.getClass();
            cseuVar.b = bK;
            cseuVar.a |= 1;
            cseu bK2 = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            csfh csfhVar3 = (csfh) bZ.b;
            bK2.getClass();
            csfhVar3.b = bK2;
            csfhVar3.a = 4;
            return bZ.bK();
        }
        throw null;
    }

    public final void a() {
        if (this.o.compareAndSet(true, false)) {
            this.m.set(false);
            this.r.onPause();
        }
        this.t = null;
        d();
    }

    public final boolean b() {
        if (!j()) {
            return false;
        }
        return this.b.b();
    }

    public final dbsg<afyd> c(final List<String> list) {
        dknp dknpVar;
        if (j() && this.b.a()) {
            afxn afxnVar = this.g;
            if (list.isEmpty()) {
                return dbpy.a;
            }
            final String language = Locale.getDefault().getLanguage();
            if (!list.isEmpty() && list.contains(language)) {
                return dbpy.a;
            }
            if (afxnVar.a()) {
                if (!dcbg.b(afxnVar.b).r(new dbsl(language) { // from class: afxk
                    private final String a;

                    {
                        this.a = language;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        return new Locale((String) obj).getLanguage().equals(this.a);
                    }
                }).a()) {
                    return dbpy.a;
                }
                dbsg r = dcbg.b(afxg.d).r(new dbsl(list) { // from class: afxl
                    private final List a;

                    {
                        this.a = list;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        List list2 = this.a;
                        dbsk.s(list2);
                        return list2.contains((String) obj);
                    }
                });
                return !r.a() ? dbpy.a : dbsg.i(afyd.c((String) r.b(), language));
            }
            dknq dknqVar = afxnVar.c.getLensParameters().c;
            if (dknqVar == null) {
                dknqVar = dknq.b;
            }
            dsrj<dknp> dsrjVar = dknqVar.a;
            if (!dsrjVar.isEmpty() && (dknpVar = (dknp) dcbg.b(dsrjVar).r(new dbsl(language) { // from class: afxi
                private final String a;

                {
                    this.a = language;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    return new Locale(((dknp) obj).a).getLanguage().equals(this.a);
                }
            }).f()) != null) {
                dbsg r2 = dcbg.b(dknpVar.b).r(new dbsl(list) { // from class: afxj
                    private final List a;

                    {
                        this.a = list;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        List list2 = this.a;
                        dbsk.s(list2);
                        return list2.contains((String) obj);
                    }
                });
                return !r2.a() ? dbpy.a : dbsg.i(afyd.c((String) r2.b(), language));
            }
            return dbpy.a;
        }
        return dbpy.a;
    }

    public final void d() {
        if (this.g.b()) {
            this.p.set(false);
        }
    }

    public final void e(Runnable runnable) {
        this.u.a().G(runnable);
    }

    public final boolean i(@dzsi dwfl dwflVar) {
        int a2;
        if (dwflVar != null) {
            afxn afxnVar = this.g;
            if (!afxnVar.c.getLensParameters().k) {
                return false;
            }
            afye afyeVar = afxnVar.d;
            dkmz dkmzVar = afyeVar.a.getLensParameters().b;
            if (dkmzVar == null) {
                dkmzVar = dkmz.e;
            }
            return afyeVar.a(dkmzVar.d) && !dwflVar.h.isEmpty() && (a2 = dwfk.a(dwflVar.i)) != 0 && a2 == 2;
        }
        return false;
    }

    public final boolean j() {
        return this.m.get();
    }

    public final void m(final Runnable runnable) {
        this.t = runnable;
        if (this.o.compareAndSet(false, true)) {
            this.r.checkPostCaptureAvailability(new LensApi.LensAvailabilityCallback(this, runnable) { // from class: afxs
                private final afxv a;
                private final Runnable b;

                {
                    this.a = this;
                    this.b = runnable;
                }

                @Override // com.google.lens.sdk.LensApi.LensAvailabilityCallback
                public final void onAvailabilityStatusFetched(int i) {
                    afxv afxvVar = this.a;
                    Runnable runnable2 = this.b;
                    boolean z = true;
                    boolean z2 = i == 0;
                    boolean andSet = afxvVar.m.getAndSet(z2);
                    if (afxvVar.j()) {
                        afxvVar.o.set(true);
                        afye afyeVar = afxvVar.f;
                        dkmz dkmzVar = afyeVar.a.getLensParameters().b;
                        if (dkmzVar == null) {
                            dkmzVar = dkmz.e;
                        }
                        boolean z3 = afyeVar.a(dkmzVar.b) && (afxvVar.r.a().a & 2) != 0;
                        afye afyeVar2 = afxvVar.f;
                        dkmz dkmzVar2 = afyeVar2.a.getLensParameters().b;
                        if (dkmzVar2 == null) {
                            dkmzVar2 = dkmz.e;
                        }
                        if (!afyeVar2.a(dkmzVar2.a) || (afxvVar.r.a().a & 8) == 0) {
                            z = false;
                        }
                        afxe c = afxf.c();
                        c.c(z3);
                        c.b(z);
                        afxvVar.b = c.a();
                    } else {
                        afxvVar.b = afxf.a;
                    }
                    if (andSet != z2) {
                        runnable2.run();
                    }
                }
            });
            LensApi lensApi = this.r;
            final LensApi.LensAvailabilityCallback lensAvailabilityCallback = new LensApi.LensAvailabilityCallback(this) { // from class: afxr
                private final afxv a;

                {
                    this.a = this;
                }

                @Override // com.google.lens.sdk.LensApi.LensAvailabilityCallback
                public final void onAvailabilityStatusFetched(int i) {
                    this.a.n.set(i == 0);
                }
            };
            if (!lensApi.c.isKeyguardLocked() || Build.VERSION.SDK_INT >= 26) {
                if (lensApi.g("11.22")) {
                    lensAvailabilityCallback.onAvailabilityStatusFetched(6);
                } else {
                    final cseg csegVar = lensApi.b;
                    final csef csefVar = new csef(lensAvailabilityCallback) { // from class: dhht
                        private final LensApi.LensAvailabilityCallback a;

                        {
                            this.a = lensAvailabilityCallback;
                        }

                        @Override // defpackage.csef
                        public final void a(int i) {
                            LensApi.LensAvailabilityCallback lensAvailabilityCallback2 = this.a;
                            int i2 = i - 2;
                            int i3 = LensApi.d;
                            if (i != 0) {
                                lensAvailabilityCallback2.onAvailabilityStatusFetched(i2);
                                return;
                            }
                            throw null;
                        }
                    };
                    cser.b();
                    csegVar.d(new csef(csegVar, csefVar) { // from class: csee
                        private final cseg a;
                        private final csef b;

                        {
                            this.a = csegVar;
                            this.b = csefVar;
                        }

                        @Override // defpackage.csef
                        public final void a(int i) {
                            int i2;
                            cseg csegVar2 = this.a;
                            csef csefVar2 = this.b;
                            cser.b();
                            cser.a(csegVar2.a.e(), "getDirectIntentAvailability() called when Lens is not ready.");
                            if (!csegVar2.a.e()) {
                                i2 = 1;
                            } else {
                                csei cseiVar = csegVar2.a;
                                cser.b();
                                cseq cseqVar = (cseq) cseiVar;
                                cser.a(cseqVar.i(), "Attempted to check direct intent availability before ready.");
                                i2 = cseqVar.i;
                            }
                            csefVar2.a(i2);
                        }
                    });
                }
            } else {
                lensAvailabilityCallback.onAvailabilityStatusFetched(5);
            }
            this.l.clear();
            this.s = null;
            this.r.onResume();
        }
        d();
    }
}
