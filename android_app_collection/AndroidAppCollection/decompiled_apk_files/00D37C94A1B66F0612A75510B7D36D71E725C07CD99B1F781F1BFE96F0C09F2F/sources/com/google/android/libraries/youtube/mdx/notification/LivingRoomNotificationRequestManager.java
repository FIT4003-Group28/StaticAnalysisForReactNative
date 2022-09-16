package com.google.android.libraries.youtube.mdx.notification;

import com.google.android.gms.cast.CastDevice;
import com.google.android.libraries.youtube.mdx.notification.LivingRoomNotificationRequestManager;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class LivingRoomNotificationRequestManager extends acwv implements f {
    public final acrr c;
    public boolean d;
    private final aczy f;
    private final advw g;
    private final snc h;
    private final adjg i;
    private final azqb j;
    private final azqb k;
    private final boolean l;
    private final agcp m;
    private final adoa n;
    private final acwu o;
    private final ankw p;
    private final Executor q;
    private final adgj r;
    private boolean s;
    private aypg t;
    private final int u;
    private final acwn v;
    private static final String e = zep.a("MDX.NotificationRequestManager");
    static final long a = TimeUnit.MINUTES.toMillis(60);
    static final long b = TimeUnit.MINUTES.toMillis(1440);

    public LivingRoomNotificationRequestManager(aczy aczyVar, advw advwVar, adjg adjgVar, snc sncVar, azqb azqbVar, azqb azqbVar2, agcp agcpVar, adoa adoaVar, acrr acrrVar, acwu acwuVar, ankw ankwVar, Executor executor, adgj adgjVar, boolean z, acwn acwnVar, acxu acxuVar) {
        super(acxuVar);
        this.f = aczyVar;
        this.g = advwVar;
        this.i = adjgVar;
        this.h = sncVar;
        this.j = azqbVar;
        this.k = azqbVar2;
        this.m = agcpVar;
        this.n = adoaVar;
        this.c = acrrVar;
        this.o = acwuVar;
        this.p = ankwVar;
        this.q = executor;
        this.u = acwuVar.u;
        this.s = false;
        this.r = adgjVar;
        this.l = z;
        this.v = acwnVar;
        this.t = l();
    }

    public static /* synthetic */ void i(Throwable th) {
        String str = e;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64);
        sb.append("Failed to get MDx user context for making notification request: ");
        sb.append(valueOf);
        zep.c(str, sb.toString());
    }

    public static /* synthetic */ void j(Throwable th) {
        String str = e;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 70);
        sb.append("Could not retrieve RouteInfo to CastDevice map on discovery complete: ");
        sb.append(valueOf);
        zep.c(str, sb.toString());
    }

    private final aypg l() {
        return this.v.k().as(new ayqb() { // from class: adje
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                LivingRoomNotificationRequestManager livingRoomNotificationRequestManager = LivingRoomNotificationRequestManager.this;
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() == livingRoomNotificationRequestManager.d) {
                    return;
                }
                livingRoomNotificationRequestManager.d = bool.booleanValue();
                livingRoomNotificationRequestManager.rl();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        if ((r8.h.c() - r4) < com.google.android.libraries.youtube.mdx.notification.LivingRoomNotificationRequestManager.b) goto L14;
     */
    @Override // defpackage.acxq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ankt a() {
        /*
            r8 = this;
            acxs r0 = defpackage.acxt.a()
            boolean r1 = r8.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L48
            snc r1 = r8.h
            java.util.Calendar r4 = java.util.Calendar.getInstance()
            long r5 = r1.c()
            r4.setTimeInMillis(r5)
            r1 = 11
            int r1 = r4.get(r1)
            if (r1 < 0) goto L23
            r4 = 7
            if (r1 >= r4) goto L23
            goto L48
        L23:
            agcp r1 = r8.m
            java.lang.String r4 = "MdxDisableLrNotifThrottleAfterPrevNotifShown"
            boolean r1 = r1.c(r4, r2)
            if (r1 == 0) goto L2f
        L2d:
            r2 = 1
            goto L48
        L2f:
            adjg r1 = r8.i
            long r4 = r1.b()
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L2d
            snc r1 = r8.h
            long r6 = r1.c()
            long r6 = r6 - r4
            long r4 = com.google.android.libraries.youtube.mdx.notification.LivingRoomNotificationRequestManager.b
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 >= 0) goto L2d
        L48:
            r0.b(r2)
            r1 = 8
            r0.c(r1)
            boolean r1 = r8.l
            r2 = 3600(0xe10, float:5.045E-42)
            r4 = 15
            if (r3 == r1) goto L5b
            r1 = 3600(0xe10, float:5.045E-42)
            goto L5d
        L5b:
            r1 = 15
        L5d:
            r0.d(r1)
            boolean r1 = r8.l
            if (r3 == r1) goto L65
            goto L67
        L65:
            r2 = 15
        L67:
            r0.e(r2)
            acxt r0 = r0.a()
            ankt r0 = defpackage.anlz.q(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.mdx.notification.LivingRoomNotificationRequestManager.a():ankt");
    }

    @Override // defpackage.acxq
    public final String b() {
        return "LivingRoomNotificationRequestManager";
    }

    @Override // defpackage.acxq
    public final void c(amuk amukVar) {
        if (!this.o.N) {
            ArrayList arrayList = new ArrayList();
            Iterator it = amukVar.iterator();
            while (it.hasNext()) {
                bhc bhcVar = (bhc) it.next();
                CastDevice a2 = CastDevice.a(bhcVar.q);
                if (a2 == null || a2.e()) {
                    arrayList.add(bhcVar);
                }
            }
            k(arrayList);
            return;
        }
        ylx.k(this.r.a(amuk.o(amukVar)), this.q, acsn.r, new ylw() { // from class: adjc
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                LivingRoomNotificationRequestManager livingRoomNotificationRequestManager = LivingRoomNotificationRequestManager.this;
                Map map = (Map) obj;
                ArrayList arrayList2 = new ArrayList();
                for (bhc bhcVar2 : map.keySet()) {
                    Optional optional = (Optional) map.get(bhcVar2);
                    if (optional == null || !optional.isPresent() || ((CastDevice) optional.get()).e()) {
                        arrayList2.add(bhcVar2);
                    }
                }
                livingRoomNotificationRequestManager.k(arrayList2);
            }
        });
    }

    @Override // defpackage.acxq
    public final void d() {
    }

    @Override // defpackage.acwv, defpackage.acxq
    public final void h() {
        aqxo.y(!this.s);
        ((agdb) this.j.get()).a.addFirst(new WeakReference((agcv) this.k.get()));
        this.s = true;
    }

    public final void k(List list) {
        final aopu aopuVar;
        int size;
        if (!list.isEmpty()) {
            long j = this.i.a.getLong("mdx.lr_notification_last_request_time_ms", 0L);
            if ((j != 0 && this.h.c() - j < a && !this.l) || this.n.e() != null) {
                return;
            }
            final String s = this.m.s();
            if (!s.isEmpty() && (size = (aopuVar = this.f.a(list).b).size()) > 0 && size <= this.u) {
                final adii a2 = adik.a();
                ylx.k(this.g.a(a2), this.p, acsn.q, new ylw() { // from class: adjd
                    @Override // defpackage.ylw, defpackage.zdt
                    public final void a(Object obj) {
                        LivingRoomNotificationRequestManager livingRoomNotificationRequestManager = LivingRoomNotificationRequestManager.this;
                        adii adiiVar = a2;
                        List<atcr> list2 = aopuVar;
                        String str = s;
                        Void r9 = (Void) obj;
                        int I = almu.I(adiiVar.a().r);
                        aopa createBuilder = aqmb.a.createBuilder();
                        for (atcr atcrVar : list2) {
                            aopa createBuilder2 = atcq.a.createBuilder();
                            createBuilder2.copyOnWrite();
                            atcq atcqVar = (atcq) createBuilder2.instance;
                            atcrVar.getClass();
                            atcqVar.c = atcrVar;
                            atcqVar.b = 1;
                            createBuilder.copyOnWrite();
                            aqmb aqmbVar = (aqmb) createBuilder.instance;
                            atcq atcqVar2 = (atcq) createBuilder2.mo39build();
                            atcqVar2.getClass();
                            aopu aopuVar2 = aqmbVar.c;
                            if (!aopuVar2.c()) {
                                aqmbVar.c = aopi.mutableCopy(aopuVar2);
                            }
                            aqmbVar.c.add(atcqVar2);
                        }
                        if (I != 0) {
                            createBuilder.copyOnWrite();
                            aqmb aqmbVar2 = (aqmb) createBuilder.instance;
                            aqmbVar2.d = I - 1;
                            aqmbVar2.b |= 1;
                        }
                        aopa createBuilder3 = aqmd.a.createBuilder();
                        aoob z = aoob.z(str);
                        createBuilder3.copyOnWrite();
                        aqmd aqmdVar = (aqmd) createBuilder3.instance;
                        aqmdVar.b |= 1;
                        aqmdVar.c = z;
                        aqly a3 = aqmf.a();
                        a3.copyOnWrite();
                        ((aqmf) a3.instance).o((aqmb) createBuilder.mo39build());
                        a3.copyOnWrite();
                        ((aqmf) a3.instance).q((aqmd) createBuilder3.mo39build());
                        arrf a4 = arrh.a();
                        a4.copyOnWrite();
                        ((arrh) a4.instance).cn((aqmf) a3.mo39build());
                        livingRoomNotificationRequestManager.c.c((arrh) a4.mo39build());
                    }
                });
            }
            this.i.a.edit().putLong("mdx.lr_notification_last_request_time_ms", this.h.c()).apply();
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        ayqi.c((AtomicReference) this.t);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        if (this.t.e()) {
            this.t = l();
        }
    }
}
