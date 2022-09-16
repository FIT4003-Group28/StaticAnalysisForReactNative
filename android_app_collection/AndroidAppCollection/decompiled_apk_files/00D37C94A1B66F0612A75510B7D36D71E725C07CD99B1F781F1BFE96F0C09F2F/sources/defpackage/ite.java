package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ite  reason: default package */
/* loaded from: classes3.dex */
public final class ite extends eyz {
    public afzf f;
    private final azqb g;
    private final etq h;
    private final aadd i;
    private final azqb j;
    private final azqb k;
    private final azqb l;
    private final Executor m;
    private final Executor n;
    private final ayor o;
    private final fbz p;
    private final axxh q;
    private final ScheduledExecutorService r;
    private boolean s;
    private final aacz t;
    private final jne u;

    public ite(azqb azqbVar, snc sncVar, etq etqVar, aacz aaczVar, aadd aaddVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, Executor executor, Executor executor2, ayor ayorVar, ScheduledExecutorService scheduledExecutorService, jne jneVar, fbz fbzVar, axxh axxhVar) {
        super(azqbVar, sncVar);
        this.g = azqbVar;
        etqVar.getClass();
        this.h = etqVar;
        this.t = aaczVar;
        this.i = aaddVar;
        azqbVar2.getClass();
        this.j = azqbVar2;
        this.k = azqbVar3;
        this.l = azqbVar4;
        this.m = executor;
        this.n = executor2;
        this.o = ayorVar;
        this.r = scheduledExecutorService;
        this.u = jneVar;
        this.p = fbzVar;
        this.q = axxhVar;
        aveq aveqVar = aaczVar.b().u;
        apgx apgxVar = (aveqVar == null ? aveq.a : aveqVar).g;
        this.s = (apgxVar == null ? apgx.a : apgxVar).i > ThreadLocalRandom.current().nextInt(0, 100);
    }

    public static void o(aatf aatfVar, azqb azqbVar, aadd aaddVar) {
        asxp asxpVar = aaddVar.a().e;
        if (asxpVar == null) {
            asxpVar = asxp.a;
        }
        if (!asxpVar.K) {
            return;
        }
        aopa createBuilder = aqmc.a.createBuilder();
        yrj yrjVar = (yrj) azqbVar.get();
        if (yrjVar != null) {
            long b = yrjVar.b();
            createBuilder.copyOnWrite();
            aqmc aqmcVar = (aqmc) createBuilder.instance;
            aqmcVar.b |= 2;
            aqmcVar.d = b;
            boolean k = yrjVar.k();
            createBuilder.copyOnWrite();
            aqmc aqmcVar2 = (aqmc) createBuilder.instance;
            aqmcVar2.b |= 1;
            aqmcVar2.c = k;
        }
        aqly a = aqmf.a();
        a.copyOnWrite();
        ((aqmf) a.instance).p((aqmc) createBuilder.mo39build());
        aqmf aqmfVar = (aqmf) a.mo39build();
        aqmfVar.getClass();
        aatfVar.y = aqmfVar;
    }

    public static ampr p(aatf aatfVar, apzg apzgVar, boolean z, zjb zjbVar, aacz aaczVar, azqb azqbVar, azqb azqbVar2, aadd aaddVar) {
        String c = aaji.c(apzgVar);
        byte[] bl = eog.bl(apzgVar);
        if (bl != null) {
            aatfVar.k(bl);
        } else {
            aatfVar.i();
        }
        if (apzgVar != null && apzgVar.qn(BrowseEndpointOuterClass.browseEndpoint)) {
            aopa mo52toBuilder = ((apnv) apzgVar.qm(BrowseEndpointOuterClass.browseEndpoint)).mo52toBuilder();
            aatfVar.t(c);
            aatfVar.v(((apnv) mo52toBuilder.instance).d);
            aatfVar.d = aatf.g(((apnv) mo52toBuilder.instance).e);
            if (z) {
                aatfVar.q(2);
            }
            if ((((apnv) mo52toBuilder.instance).b & 64) != 0) {
                aopa createBuilder = arln.a.createBuilder();
                apny apnyVar = ((apnv) mo52toBuilder.instance).h;
                if (apnyVar == null) {
                    apnyVar = apny.a;
                }
                createBuilder.af(apnyVar.d);
                aatfVar.t = (arln) createBuilder.mo39build();
                mo52toBuilder.copyOnWrite();
                apnv apnvVar = (apnv) mo52toBuilder.instance;
                apnvVar.h = null;
                apnvVar.b &= -65;
            }
            apnv apnvVar2 = (apnv) mo52toBuilder.instance;
            if ((apnvVar2.b & 128) != 0 && zjbVar != null) {
                aqkk aqkkVar = apnvVar2.i;
                if (aqkkVar == null) {
                    aqkkVar = aqkk.a;
                }
                Object b = zjbVar.b(Uri.parse(aqkkVar.b));
                if (b instanceof aqgi) {
                    aqgj aqgjVar = ((aqgi) b).b;
                    if (aqgjVar == null) {
                        aqgjVar = aqgj.a;
                    }
                    aatfVar.s = aqgjVar;
                }
            }
            aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
            aopcVar.e(BrowseEndpointOuterClass.browseEndpoint, (apnv) mo52toBuilder.mo39build());
            apzgVar = (apzg) aopcVar.mo39build();
            q(azqbVar, aatfVar, aaczVar);
        }
        o(aatfVar, azqbVar2, aaddVar);
        return ampr.a(aatfVar, apzgVar);
    }

    public static void q(azqb azqbVar, aatf aatfVar, aacz aaczVar) {
        apyy b;
        if (aaczVar == null || azqbVar == null || (b = aaczVar.b()) == null) {
            return;
        }
        aukh aukhVar = b.x;
        if (aukhVar == null) {
            aukhVar = aukh.a;
        }
        auki aukiVar = aukhVar.b;
        if (aukiVar == null) {
            aukiVar = auki.a;
        }
        if (!aukiVar.b) {
            return;
        }
        String str = (String) azqbVar.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        aatfVar.k = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    @Override // defpackage.eyz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ defpackage.ayoc c(defpackage.aapd r6, java.lang.Throwable r7) {
        /*
            r5 = this;
            jne r0 = r5.u
            aatf r6 = (defpackage.aatf) r6
            java.lang.String r6 = r6.c
            java.lang.String r1 = "FEwhat_to_watch"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto Ld0
            yrj r6 = r0.a
            boolean r6 = r6.p()
            if (r6 == 0) goto L1c
            j$.util.Optional r6 = j$.util.Optional.empty()
            goto Ld4
        L1c:
            fbz r6 = r0.b
            boolean r6 = r6.a()
            if (r6 != 0) goto L2a
            j$.util.Optional r6 = j$.util.Optional.empty()
            goto Ld4
        L2a:
            boolean r6 = r7 instanceof defpackage.cev
            if (r6 == 0) goto Lcb
            java.lang.Throwable r6 = r7.getCause()
            boolean r6 = r6 instanceof org.chromium.net.NetworkException
            if (r6 == 0) goto Lcb
            java.lang.Throwable r6 = r7.getCause()
            org.chromium.net.NetworkException r6 = (org.chromium.net.NetworkException) r6
            int r6 = r6.getErrorCode()
            azqb r7 = r0.d
            java.lang.Object r7 = r7.get()
            axxh r7 = (defpackage.axxh) r7
            aacz r1 = r7.b
            apyy r1 = r1.b()
            aqxe r1 = r1.C
            if (r1 != 0) goto L54
            aqxe r1 = defpackage.aqxe.a
        L54:
            r2 = 45356843(0x2b4172b, double:2.2409258E-316)
            boolean r4 = r1.a(r2)
            if (r4 == 0) goto Lb0
            aoqp r1 = r1.b     // Catch: defpackage.aopx -> L8a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: defpackage.aopx -> L8a
            boolean r3 = r1.containsKey(r2)     // Catch: defpackage.aopx -> L8a
            if (r3 == 0) goto L84
            java.lang.Object r1 = r1.get(r2)     // Catch: defpackage.aopx -> L8a
            aqxf r1 = (defpackage.aqxf) r1     // Catch: defpackage.aopx -> L8a
            int r2 = r1.b     // Catch: defpackage.aopx -> L8a
            r3 = 5
            if (r2 != r3) goto L79
            java.lang.Object r1 = r1.c     // Catch: defpackage.aopx -> L8a
            aoob r1 = (defpackage.aoob) r1     // Catch: defpackage.aopx -> L8a
            goto L7b
        L79:
            aoob r1 = defpackage.aoob.b     // Catch: defpackage.aopx -> L8a
        L7b:
            aotn r2 = defpackage.aotn.a     // Catch: defpackage.aopx -> L8a
            aopi r1 = defpackage.aopi.parseFrom(r2, r1)     // Catch: defpackage.aopx -> L8a
            aotn r1 = (defpackage.aotn) r1     // Catch: defpackage.aopx -> L8a
            goto Lb2
        L84:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: defpackage.aopx -> L8a
            r1.<init>()     // Catch: defpackage.aopx -> L8a
            throw r1     // Catch: defpackage.aopx -> L8a
        L8a:
            r1 = move-exception
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getSimpleName()
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Unable to parse proto typed experiment flag: "
            int r3 = r1.length()
            if (r3 == 0) goto La8
            java.lang.String r1 = r2.concat(r1)
            goto Lad
        La8:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
        Lad:
            android.util.Log.e(r7, r1)
        Lb0:
            aotn r1 = defpackage.aotn.a
        Lb2:
            aopq r7 = r1.b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto Lcb
            azqb r6 = r0.c
            java.lang.Object r6 = r6.get()
            ohn r6 = (defpackage.ohn) r6
            j$.util.Optional r6 = j$.util.Optional.of(r6)
            goto Ld4
        Lcb:
            j$.util.Optional r6 = j$.util.Optional.empty()
            goto Ld4
        Ld0:
            j$.util.Optional r6 = j$.util.Optional.empty()
        Ld4:
            boolean r7 = r6.isPresent()
            if (r7 == 0) goto Lf6
            java.lang.Object r6 = r6.get()
            ohn r6 = (defpackage.ohn) r6
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            java.lang.String r7 = "Not implemented yet"
            r6.<init>(r7)
            ayos r6 = defpackage.ayos.x(r6)
            ayoc r6 = r6.j()
            ayor r7 = r5.o
            ayoc r6 = r6.y(r7)
            goto Lfa
        Lf6:
            ayoc r6 = defpackage.ayoc.p()
        Lfa:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ite.c(aapd, java.lang.Throwable):ayoc");
    }

    @Override // defpackage.eyz
    protected final /* bridge */ /* synthetic */ ayoc d(aapd aapdVar) {
        return ((itb) this.j.get()).a((aatf) aapdVar).y(this.o);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eyz
    public final void f(cff cffVar) {
        etq etqVar = this.h;
        etqVar.b.f(10, cffVar);
        etqVar.a.d(new ewb());
        afzf afzfVar = this.f;
        if (afzfVar != null) {
            afzfVar.kV(cffVar);
            this.f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eyz
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        BrowseResponseModel browseResponseModel = (BrowseResponseModel) obj;
        etq etqVar = this.h;
        etqVar.b.e(10);
        etqVar.a.d(new evz());
        afzf afzfVar = this.f;
        if (afzfVar != null) {
            afzfVar.lG(browseResponseModel);
            this.f = null;
        }
    }

    @Override // defpackage.eyz
    protected final /* bridge */ /* synthetic */ void i(aars aarsVar, aapd aapdVar, afzf afzfVar) {
        ankt h;
        Long l;
        aath aathVar = (aath) aarsVar;
        aatf aatfVar = (aatf) aapdVar;
        etq etqVar = this.h;
        etqVar.b.g(10);
        etqVar.a.d(new ewa());
        Executor executor = this.s ? this.n : this.m;
        if (((yrj) this.l.get()).p() || !"FEwhat_to_watch".equals(aatfVar.c) || !this.p.a()) {
            h = aathVar.h(aatfVar, executor);
        } else {
            ankt h2 = aathVar.h(aatfVar, executor);
            aqxe aqxeVar = this.q.b.b().C;
            if (aqxeVar == null) {
                aqxeVar = aqxe.a;
            }
            long j = 0;
            if (aqxeVar.a(45356842L)) {
                aoqp aoqpVar = aqxeVar.b;
                if (!aoqpVar.containsKey(45356842L)) {
                    throw new IllegalArgumentException();
                }
                aqxf aqxfVar = (aqxf) aoqpVar.get(45356842L);
                if (aqxfVar.b == 2) {
                    j = ((Long) aqxfVar.c).longValue();
                }
                l = Long.valueOf(j);
            } else {
                l = 0L;
            }
            h = anlz.x(h2, l.longValue(), TimeUnit.MILLISECONDS, this.r);
        }
        ylx.k(h, this.s ? this.m : anjk.a, new itc(afzfVar), new itd(afzfVar));
        this.s = false;
    }

    public final void n() {
        aacz aaczVar = this.t;
        azqb azqbVar = this.k;
        azqb azqbVar2 = this.l;
        etq etqVar = this.h;
        e((aatf) p(((aath) this.g.get()).g(new etp(etqVar.a, etqVar.b)), aafr.a("FEwhat_to_watch"), false, null, aaczVar, azqbVar, azqbVar2, this.i).a);
    }
}
