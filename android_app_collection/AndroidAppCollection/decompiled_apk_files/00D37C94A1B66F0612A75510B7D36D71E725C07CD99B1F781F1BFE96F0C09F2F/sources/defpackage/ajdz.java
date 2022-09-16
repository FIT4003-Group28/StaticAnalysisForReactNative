package defpackage;

import android.os.Handler;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: ajdz  reason: default package */
/* loaded from: classes.dex */
public final class ajdz extends ajfb {
    public static final long a = TimeUnit.SECONDS.toMillis(30);
    public final azqb b;
    public azpa c;
    public final Set d;
    public long e = a;
    public boolean f;
    public ajeo g;
    private final ScheduledExecutorService h;
    private final azqb i;
    private final Handler j;
    private final Executor k;
    private final aadd l;
    private final aiix m;
    private final SecureRandom n;
    private final aanz o;
    private final acrr p;
    private ajdy q;
    private ajdu r;
    private final AtomicInteger s;
    private final aisq t;

    public ajdz(azqb azqbVar, ScheduledExecutorService scheduledExecutorService, azqb azqbVar2, aisq aisqVar, Handler handler, Executor executor, aadd aaddVar, aiix aiixVar, SecureRandom secureRandom, aanz aanzVar, acrr acrrVar) {
        azqbVar.getClass();
        this.b = azqbVar;
        scheduledExecutorService.getClass();
        this.h = scheduledExecutorService;
        azqbVar2.getClass();
        this.i = azqbVar2;
        this.t = aisqVar;
        handler.getClass();
        this.j = handler;
        this.d = new HashSet();
        this.c = azpa.ar();
        this.k = executor;
        this.l = aaddVar;
        this.m = aiixVar;
        this.n = secureRandom;
        this.s = new AtomicInteger();
        this.o = aanzVar;
        this.p = acrrVar;
    }

    private final void H() {
        ajdu ajduVar = this.r;
        if (ajduVar != null) {
            ajduVar.b();
            this.r = null;
        }
        for (ajed ajedVar : this.d) {
            ajedVar.i();
        }
        this.d.clear();
        this.c.sm();
    }

    private final void I(final aikd aikdVar, asaa asaaVar, boolean z) {
        K();
        acrr acrrVar = this.p;
        aopa createBuilder = arfw.a.createBuilder();
        if (asaaVar != null) {
            aoob aoobVar = asaaVar.p;
            createBuilder.copyOnWrite();
            arfw arfwVar = (arfw) createBuilder.instance;
            aoobVar.getClass();
            arfwVar.b |= 1;
            arfwVar.c = aoobVar;
        }
        createBuilder.copyOnWrite();
        arfw arfwVar2 = (arfw) createBuilder.instance;
        arfwVar2.b |= 2;
        arfwVar2.d = z;
        arrf a2 = arrh.a();
        a2.copyOnWrite();
        ((arrh) a2.instance).cC((arfw) createBuilder.mo39build());
        acrrVar.c((arrh) a2.mo39build());
        if (this.g != null) {
            this.j.post(new Runnable() { // from class: ajdr
                @Override // java.lang.Runnable
                public final void run() {
                    ajdz ajdzVar = ajdz.this;
                    ajdzVar.g.e(aikdVar);
                }
            });
        }
    }

    private final synchronized void J(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ajed ajedVar = (ajed) it.next();
            ajedVar.i();
            this.d.remove(ajedVar);
        }
    }

    private final void K() {
        this.s.set(0);
    }

    private final void L() {
        arzs arzsVar;
        ArrayList arrayList = new ArrayList();
        ajdy ajdyVar = this.q;
        if (ajdyVar == null) {
            J(this.d);
            return;
        }
        asaa asaaVar = ajdyVar.c;
        arzt arztVar = ajdyVar.e;
        if (arztVar != null) {
            arzsVar = arztVar.j;
            if (arzsVar == null) {
                arzsVar = arzs.a;
            }
        } else {
            arzsVar = null;
        }
        ajdu ajduVar = new ajdu(this, ajdyVar);
        ajeb a2 = ajduVar.a();
        a2.c = asaaVar;
        a2.e = arzsVar;
        ajec a3 = a2.a();
        boolean z = false;
        boolean z2 = false;
        for (ajed ajedVar : this.d) {
            if (ajedVar.j(ajdyVar, null)) {
                ajea e = ajedVar.e();
                if (e != null) {
                    ajduVar.f.add(e);
                }
                int a4 = ajedVar.a(a3);
                if (a4 == 0) {
                    z2 = true;
                } else if (a4 == 4) {
                    aikd c = ajedVar.c(a3.a);
                    if (c != null) {
                        M(ajduVar, c);
                        z = true;
                    }
                } else if (a4 != 5) {
                    arrayList.add(ajedVar);
                }
            } else {
                arrayList.add(ajedVar);
            }
        }
        if (!z && z2) {
            O(ajduVar, this.e);
        }
        asaa asaaVar2 = a3.a;
        if (asaaVar2 != null) {
            this.c.c(asaaVar2);
        }
        J(arrayList);
    }

    private final synchronized void M(ajdu ajduVar, aikd aikdVar) {
        K();
        this.r = ajduVar;
        D(aikdVar);
    }

    private final synchronized void N(long j) {
        ajdu ajduVar = this.r;
        if (ajduVar != null) {
            C(ajduVar, j);
        }
    }

    private final synchronized void O(ajdu ajduVar, long j) {
        K();
        this.r = ajduVar;
        C(ajduVar, j);
    }

    private static boolean P(asaa asaaVar) {
        if (asaaVar == null || (asaaVar.b & 131072) == 0) {
            return false;
        }
        arzu arzuVar = asaaVar.n;
        if (arzuVar == null) {
            arzuVar = arzu.a;
        }
        if ((arzuVar.b & 1) == 0) {
            return false;
        }
        arzu arzuVar2 = asaaVar.n;
        if (arzuVar2 == null) {
            arzuVar2 = arzu.a;
        }
        asuv asuvVar = arzuVar2.c;
        if (asuvVar == null) {
            asuvVar = asuv.a;
        }
        if ((asuvVar.b & 32) == 0) {
            return false;
        }
        arzu arzuVar3 = asaaVar.n;
        if (arzuVar3 == null) {
            arzuVar3 = arzu.a;
        }
        asuv asuvVar2 = arzuVar3.c;
        if (asuvVar2 == null) {
            asuvVar2 = asuv.a;
        }
        return asuvVar2.f > 0;
    }

    public final void A(PlayerResponseModel playerResponseModel, String str) {
        byte[] bArr;
        asaa asaaVar;
        Boolean bool;
        boolean z;
        int cj;
        if (playerResponseModel != null) {
            ajdu ajduVar = this.r;
            if (ajduVar != null && ajduVar.c()) {
                return;
            }
            arzt s = playerResponseModel.s();
            if (!this.f) {
                if (aiix.h(this.l)) {
                    aanz aanzVar = this.o;
                    asaa t = playerResponseModel.t();
                    if (t != null && (t.b & 131072) != 0 && (cj = awwc.cj(t.c)) != 0 && cj == 7 && playerResponseModel.m(aanzVar) != null) {
                        z = true;
                        this.f = z;
                    }
                }
                z = false;
                this.f = z;
            }
            String B = playerResponseModel.B();
            byte[] J2 = playerResponseModel.J();
            asaa t2 = playerResponseModel.t();
            ajdx ajdxVar = new ajdx();
            ajdxVar.a(B);
            ajdxVar.c(J2);
            if (t2 != null) {
                ajdxVar.c = t2;
                ajdxVar.b(false);
                ajdxVar.d = playerResponseModel.c;
                ajdxVar.a(playerResponseModel.B());
                ajdxVar.e = s;
                ajdxVar.c(playerResponseModel.J());
                ajdxVar.g = playerResponseModel.v();
                ajdxVar.b(this.f);
                ajdxVar.i = str;
                if (s != null) {
                    ajdxVar.f = s.i;
                }
                String str2 = ajdxVar.a;
                if (str2 == null || (bArr = ajdxVar.b) == null || (asaaVar = ajdxVar.c) == null || (bool = ajdxVar.h) == null) {
                    StringBuilder sb = new StringBuilder();
                    if (ajdxVar.a == null) {
                        sb.append(" currentVideoId");
                    }
                    if (ajdxVar.b == null) {
                        sb.append(" trackingParams");
                    }
                    if (ajdxVar.c == null) {
                        sb.append(" initialPlayabilityStatus");
                    }
                    if (ajdxVar.h == null) {
                        sb.append(" enablePremiereTrailerCodepath");
                    }
                    String valueOf = String.valueOf(sb);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                    sb2.append("Missing required properties:");
                    sb2.append(valueOf);
                    throw new IllegalStateException(sb2.toString());
                }
                this.q = new ajdy(str2, bArr, asaaVar, ajdxVar.d, ajdxVar.e, ajdxVar.f, ajdxVar.g, bool.booleanValue(), ajdxVar.i);
                this.e = w(null);
                L();
                return;
            }
            throw new NullPointerException("Null initialPlayabilityStatus");
        }
    }

    public final void B() {
        this.q = null;
        this.e = a;
        H();
    }

    public final synchronized void C(ajdu ajduVar, long j) {
        ajduVar.a = this.h.schedule(ajduVar, j, TimeUnit.MILLISECONDS);
    }

    public final synchronized void D(aikd aikdVar) {
        ajdy ajdyVar;
        if (this.r != null && (ajdyVar = this.q) != null) {
            arzt arztVar = ajdyVar.e;
            boolean z = ajdyVar.h;
            int incrementAndGet = this.s.incrementAndGet();
            if ((!z && !this.m.r()) || arztVar == null) {
                K();
                N(this.e);
            } else if (incrementAndGet <= arztVar.e) {
                N((this.s.get() * 2000) + (this.n.nextInt(999) - 499));
            } else if (arztVar.g) {
                K();
                N(this.e);
            } else {
                I(aikdVar, null, true);
            }
        }
    }

    @Override // defpackage.ajfb
    public final void E(ajeo ajeoVar) {
        this.g = ajeoVar;
    }

    public final synchronized boolean F(final ajec ajecVar) {
        int cj;
        asaa asaaVar = ajecVar.a;
        ArrayList arrayList = new ArrayList();
        aikd aikdVar = null;
        boolean z = false;
        aikd aikdVar2 = null;
        boolean z2 = false;
        for (ajed ajedVar : this.d) {
            if (ajedVar.j(this.q, ajecVar)) {
                int b = ajedVar.b(ajecVar);
                if (b == 1) {
                    arrayList.add(ajedVar);
                } else if (b == 2) {
                    aikdVar = ajedVar.c(asaaVar);
                } else {
                    if (b != 0) {
                        if (b == 3) {
                            if (this.g != null && aijr.k(asaaVar)) {
                                this.k.execute(new Runnable() { // from class: ajds
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ajdz ajdzVar = ajdz.this;
                                        if (!ajecVar.a()) {
                                            ajao ajaoVar = (ajao) ajdzVar.g;
                                            ajaoVar.V();
                                            ajaoVar.i.f();
                                        }
                                    }
                                });
                            }
                        } else if (b == 4) {
                            aikdVar2 = ajedVar.c(asaaVar);
                        }
                    }
                    z2 = true;
                }
            }
        }
        if (asaaVar != null) {
            this.c.c(asaaVar);
        }
        J(arrayList);
        if (aikdVar != null) {
            I(aikdVar, asaaVar, false);
            this.t.b(aikdVar);
        } else if (aikdVar2 != null) {
            D(aikdVar2);
        } else {
            if (asaaVar != null && (cj = awwc.cj(asaaVar.c)) != 0 && cj == 3) {
                this.t.b(new aikd(3, 2, asaaVar.d));
            }
            if (this.d.isEmpty()) {
                return false;
            }
            z = z2;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r2.get() != false) goto L27;
     */
    @Override // defpackage.ajfb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void R(defpackage.ahhw r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            aika r0 = defpackage.aika.NEW     // Catch: java.lang.Throwable -> La1
            aika r0 = r5.c()     // Catch: java.lang.Throwable -> La1
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L86
            r1 = 1
            if (r0 == r1) goto L7f
            r1 = 2
            if (r0 == r1) goto L68
            r1 = 8
            if (r0 == r1) goto L5a
            r1 = 9
            if (r0 == r1) goto L1d
            goto L89
        L1d:
            boolean r0 = r4.f     // Catch: java.lang.Throwable -> La1
            if (r0 != 0) goto L4c
            aiix r0 = r4.m     // Catch: java.lang.Throwable -> La1
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> La1
            r2.<init>()     // Catch: java.lang.Throwable -> La1
            axxj r0 = r0.c     // Catch: java.lang.Throwable -> La1
            aadd r0 = r0.a     // Catch: java.lang.Throwable -> La1
            ayoi r0 = r0.a     // Catch: java.lang.Throwable -> La1
            axxd r3 = defpackage.axxd.j     // Catch: java.lang.Throwable -> La1
            ayoi r0 = r0.V(r3)     // Catch: java.lang.Throwable -> La1
            ayoi r0 = r0.B()     // Catch: java.lang.Throwable -> La1
            ldk r3 = new ldk     // Catch: java.lang.Throwable -> La1
            r3.<init>(r2, r1)     // Catch: java.lang.Throwable -> La1
            aypg r0 = r0.as(r3)     // Catch: java.lang.Throwable -> La1
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0     // Catch: java.lang.Throwable -> La1
            defpackage.ayqi.c(r0)     // Catch: java.lang.Throwable -> La1
            boolean r0 = r2.get()     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L89
        L4c:
            ajdu r0 = r4.r     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L56
            boolean r0 = r0.c()     // Catch: java.lang.Throwable -> La1
            if (r0 != 0) goto L89
        L56:
            r4.L()     // Catch: java.lang.Throwable -> La1
            goto L89
        L5a:
            ajdu r0 = r4.r     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L64
            boolean r0 = r0.c()     // Catch: java.lang.Throwable -> La1
            if (r0 != 0) goto L89
        L64:
            r4.L()     // Catch: java.lang.Throwable -> La1
            goto L89
        L68:
            java.lang.String r0 = r5.k()     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L73
            java.lang.String r0 = r5.k()     // Catch: java.lang.Throwable -> La1
            goto L77
        L73:
            java.lang.String r0 = r5.e()     // Catch: java.lang.Throwable -> La1
        L77:
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r1 = r5.b()     // Catch: java.lang.Throwable -> La1
            r4.A(r1, r0)     // Catch: java.lang.Throwable -> La1
            goto L89
        L7f:
            r4.B()     // Catch: java.lang.Throwable -> La1
            r4.y()     // Catch: java.lang.Throwable -> La1
            goto L89
        L86:
            r4.B()     // Catch: java.lang.Throwable -> La1
        L89:
            java.util.Set r0 = r4.d     // Catch: java.lang.Throwable -> La1
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> La1
        L8f:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> La1
            if (r1 == 0) goto L9f
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> La1
            ajed r1 = (defpackage.ajed) r1     // Catch: java.lang.Throwable -> La1
            r1.f(r5)     // Catch: java.lang.Throwable -> La1
            goto L8f
        L9f:
            monitor-exit(r4)
            return
        La1:
            r5 = move-exception
            monitor-exit(r4)
            goto La5
        La4:
            throw r5
        La5:
            goto La4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajdz.R(ahhw):void");
    }

    @Override // defpackage.ajfb
    public final void c(String str) {
        ajdu ajduVar = this.r;
        if (ajduVar != null) {
            ajduVar.b();
            this.r = null;
        }
    }

    @Override // defpackage.ajfb
    public final synchronized void e(ahhx ahhxVar) {
        for (ajed ajedVar : this.d) {
            ajedVar.g(ahhxVar);
        }
    }

    @Override // defpackage.ajfb
    public final void t() {
        H();
        y();
        L();
    }

    @Override // defpackage.ajfb
    public final void v(ahia ahiaVar) {
        ajdu ajduVar;
        asaa asaaVar;
        for (ajed ajedVar : this.d) {
            ajedVar.h(ahiaVar);
        }
        if (ahiaVar.a() != 5 || (ajduVar = this.r) == null || (asaaVar = ajduVar.b) == null) {
            return;
        }
        ajeb a2 = ajduVar.a();
        a2.c = asaaVar;
        a2.d = ajduVar.c;
        a2.e = ajduVar.d;
        F(a2.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long w(arzf arzfVar) {
        ajdy ajdyVar = this.q;
        if (ajdyVar == null || (!ajdyVar.h && !this.m.r())) {
            auaf e = aiix.e(this.l);
            if (e != null && e.E) {
                if (arzfVar != null) {
                    asaa asaaVar = arzfVar.d;
                    if (asaaVar == null) {
                        asaaVar = asaa.a;
                    }
                    if (P(asaaVar)) {
                        arzu arzuVar = asaaVar.n;
                        if (arzuVar == null) {
                            arzuVar = arzu.a;
                        }
                        asuv asuvVar = arzuVar.c;
                        if (asuvVar == null) {
                            asuvVar = asuv.a;
                        }
                        return asuvVar.f;
                    }
                } else if (ajdyVar != null) {
                    asaa asaaVar2 = ajdyVar.c;
                    if (P(asaaVar2)) {
                        arzu arzuVar2 = asaaVar2.n;
                        if (arzuVar2 == null) {
                            arzuVar2 = arzu.a;
                        }
                        asuv asuvVar2 = arzuVar2.c;
                        if (asuvVar2 == null) {
                            asuvVar2 = asuv.a;
                        }
                        return asuvVar2.f;
                    }
                }
            }
            return this.e;
        }
        if (arzfVar != null) {
            if ((arzfVar.b & 32) != 0) {
                long j = arzfVar.f;
                if (j > 0) {
                    return j;
                }
            }
            asaa asaaVar3 = arzfVar.d;
            if (asaaVar3 == null) {
                asaaVar3 = asaa.a;
            }
            if (P(asaaVar3)) {
                arzu arzuVar3 = asaaVar3.n;
                if (arzuVar3 == null) {
                    arzuVar3 = arzu.a;
                }
                asuv asuvVar3 = arzuVar3.c;
                if (asuvVar3 == null) {
                    asuvVar3 = asuv.a;
                }
                return asuvVar3.f;
            }
        }
        arzt arztVar = ajdyVar.e;
        if (arztVar != null && (arztVar.b & 2) != 0) {
            long j2 = arztVar.d;
            if (j2 > 0) {
                return j2;
            }
        }
        asaa asaaVar4 = ajdyVar.c;
        if (!P(asaaVar4)) {
            return a;
        }
        arzu arzuVar4 = asaaVar4.n;
        if (arzuVar4 == null) {
            arzuVar4 = arzu.a;
        }
        asuv asuvVar4 = arzuVar4.c;
        if (asuvVar4 == null) {
            asuvVar4 = asuv.a;
        }
        return asuvVar4.f;
    }

    public final void y() {
        this.d.addAll((Collection) this.i.get());
        this.c = azpa.ar();
    }

    public final void z(aynx aynxVar, aynx aynxVar2) {
        new aypf().g(aynxVar.Z(new ajdq(this)), aynxVar2.Z(new ajdq(this, 1)));
    }
}
