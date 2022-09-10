package defpackage;

import android.app.PendingIntent;
import com.google.android.apps.maps.R;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ahxx  reason: default package */
/* loaded from: classes2.dex */
public class ahxx implements ahxj {
    public static final dcqe a = dcqe.c("ahxx");
    public final dzsj<gga> b;
    public final akai c;
    public final akfc d;
    public final akfa e;
    public final Executor f;
    public final Executor g;
    public final ajmq h;
    public final ahzd i;
    public final ahzh j;
    public final Runnable k;
    public final cpv l;
    public final ajln m;
    public String n;
    public boolean o;
    public PendingIntent p;
    @dzsi
    public v<ajqc<btlu>> q = null;
    public int r;
    private final ajsa s;
    private final m t;

    public ahxx(dzsj<gga> dzsjVar, ajsa ajsaVar, akai akaiVar, akfc akfcVar, akfa akfaVar, cqhn cqhnVar, cqhu cqhuVar, Executor executor, Executor executor2, ajmq ajmqVar, ahzd ahzdVar, ahzh ahzhVar, cpv cpvVar, ajln ajlnVar, m mVar, String str, boolean z, PendingIntent pendingIntent, Runnable runnable) {
        this.b = dzsjVar;
        this.s = ajsaVar;
        this.c = akaiVar;
        this.d = akfcVar;
        this.e = akfaVar;
        this.f = executor;
        this.g = executor2;
        this.i = ahzdVar;
        this.j = ahzhVar;
        this.l = cpvVar;
        this.m = ajlnVar;
        this.t = mVar;
        this.h = ajmqVar;
        this.n = str;
        this.o = z;
        this.p = pendingIntent;
        this.k = runnable;
        btlu j = akfaVar.j();
        this.r = (j == null || j.f != btlt.GOOGLE) ? 1 : 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h(akah akahVar) {
        return Collections.disjoint(((ajzf) akahVar).b, dcep.G(akaf.LOCATION_PERMISSION_NOT_GRANTED, akaf.BACKGROUND_LOCATION_PERMISSION_NOT_GRANTED, akaf.ACTIVITY_DETECTION_PERMISSION_NOT_GRANTED, akaf.DEVICE_LOCATION_DISABLED, akaf.BATTERY_SAVER_ENABLED, akaf.REQUIRES_LOCATION_HISTORY_NOT_REQUIRED_ACKNOWLEDGEMENT, new akaf[0]));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean i(defpackage.akah r2) {
        /*
            ajzf r2 = (defpackage.ajzf) r2
            dcep<akaf> r2 = r2.b
            dcpd r2 = r2.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r2.next()
            akaf r0 = (defpackage.akaf) r0
            akaf r1 = defpackage.akaf.NOT_PRIMARY_REPORTING_DEVICE
            if (r0 == r1) goto L1c
            akaf r1 = defpackage.akaf.PRIMARY_BUT_NOT_REPORTING
            if (r0 != r1) goto L8
        L1c:
            r2 = 0
            return r2
        L1e:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahxx.i(akah):boolean");
    }

    @Override // defpackage.jbk
    public jib NC() {
        cjtd cjtdVar = cjtd.b;
        int i = this.r;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            cjtdVar = cjtd.a(dtxu.dS);
        } else if (i2 == 1) {
            cjtdVar = cjtd.a(dtxu.dP);
        } else if (i2 == 2) {
            cjtdVar = cjtd.a(dtxu.dN);
        } else if (i2 == 3 || i2 == 4) {
            cjtdVar = cjtd.a(dtxu.dO);
        }
        jhz e = jib.g(this.b.a(), "").e();
        e.x = false;
        e.q = ibm.a();
        e.d = ibm.a();
        e.o = cjtdVar;
        return e.b();
    }

    @Override // defpackage.ahxj
    public CharSequence b() {
        if (this.r == 3) {
            return this.b.a().getString(R.string.PERSONAL_SAFETY_FIXES_COMPLETE_TITLE);
        }
        return this.b.a().getString(R.string.PERSONAL_SAFETY_PENDING_FIXES_TITLE);
    }

    @Override // defpackage.ahxj
    public Integer c() {
        return Integer.valueOf(this.r == 3 ? R.string.PERSONAL_SAFETY_FIXES_COMPLETE_BODY_TEXT : R.string.PERSONAL_SAFETY_PENDING_FIXES_BODY_TEXT);
    }

    @Override // defpackage.ahxj
    public Boolean e() {
        int i = this.r;
        boolean z = true;
        if (i != 4 && i != 5) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final v<ajqc<btlu>> f(ajqc<btlu> ajqcVar) {
        int b = ajqcVar.b();
        int i = b - 1;
        if (b != 0) {
            if (i != 0) {
                if (i == 1) {
                    return new z(ajpz.b(ajqcVar.a()));
                }
                return new z(ajpz.b(new ahwp()));
            }
            ajsa ajsaVar = this.s;
            btlu c = ajqcVar.c();
            ajzf ajzfVar = (ajzf) ajsaVar.g.a(c);
            HashSet hashSet = new HashSet(ajzfVar.b);
            akai akaiVar = ajsaVar.g;
            dcen N = dcep.N();
            dbsg<aile> b2 = akaiVar.e.b(dbsg.i(c));
            if (b2.a()) {
                N.i(akaiVar.b(b2.b().j()));
            }
            hashSet.addAll(N.f());
            return ajsaVar.b(c, akah.j(ajzfVar.a, dcep.K(hashSet), ajzfVar.c, ajzfVar.d));
        }
        throw null;
    }

    public final void g(String str, boolean z, PendingIntent pendingIntent) {
        if (!this.n.equals(str) || this.o != z || !this.p.equals(pendingIntent) || this.q == null) {
            v<ajqc<btlu>> vVar = this.q;
            if (vVar != null) {
                vVar.e(this.t);
            }
            this.n = str;
            this.o = z;
            this.p = pendingIntent;
            int i = this.r;
            if (i == 1) {
                return;
            }
            if (i != 4 && i != 5) {
                this.r = 5;
                cqkx.p(this);
            }
            z zVar = new z();
            this.d.o(this.n, new ahxq(this, zVar));
            v<ajqc<btlu>> b = am.b(zVar, new ahp(this) { // from class: ahxk
                private final ahxx a;

                {
                    this.a = this;
                }

                @Override // defpackage.ahp
                public final Object a(Object obj) {
                    return this.a.f((ajqc) obj);
                }
            });
            this.q = b;
            if (this.o) {
                this.q = am.b(b, new ahp(this) { // from class: ahxl
                    private final ahxx a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.ahp
                    public final Object a(Object obj) {
                        ahxx ahxxVar = this.a;
                        ajqc ajqcVar = (ajqc) obj;
                        int b2 = ajqcVar.b();
                        int i2 = b2 - 1;
                        if (b2 != 0) {
                            if (i2 != 0) {
                                if (i2 == 1) {
                                    return new z(ajqcVar);
                                }
                                return new z(ajpz.b(new ahwp()));
                            }
                            final btlu btluVar = (btlu) ajqcVar.c();
                            final z zVar2 = new z();
                            bvqj.c(ahxxVar.h.b(btluVar, dcep.B(dqym.FIX_NOT_SHARING_FROM_THIS_DEVICE)), new bvqg(zVar2, btluVar) { // from class: ahxm
                                private final z a;
                                private final btlu b;

                                {
                                    this.a = zVar2;
                                    this.b = btluVar;
                                }

                                @Override // defpackage.bvqg
                                public final void NU(Object obj2) {
                                    z zVar3 = this.a;
                                    btlu btluVar2 = this.b;
                                    if (((ajne) obj2) == ajne.SUCCESS) {
                                        zVar3.f(ajpz.a(btluVar2));
                                    } else {
                                        zVar3.f(ajpz.b(new ahwp()));
                                    }
                                }
                            }, ahxxVar.f);
                            return zVar2;
                        }
                        throw null;
                    }
                });
            }
            this.q.b(this.t, new ahxo(this));
        }
    }

    @Override // defpackage.ahxj
    @dzsi
    public jad d() {
        int i = this.r;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                return new ahxs(this);
            }
            if (i2 == 1) {
                return new ahxt(this);
            }
            if (i2 == 2) {
                return new ahxw(this);
            }
            return null;
        }
        throw null;
    }
}
