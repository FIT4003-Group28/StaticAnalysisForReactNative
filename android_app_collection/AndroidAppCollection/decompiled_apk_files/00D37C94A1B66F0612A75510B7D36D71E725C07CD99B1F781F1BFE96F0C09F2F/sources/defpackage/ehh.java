package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ehh  reason: default package */
/* loaded from: classes3.dex */
public final class ehh implements ynl {
    public final axnm a;
    public final afvn b;
    public final aadd c;
    public eik d = eik.UNKNOWN;
    public final aacz e;
    private final axnm f;
    private final azpx g;
    private final whp h;
    private final Executor i;
    private final boolean j;

    public ehh(axnm axnmVar, axnm axnmVar2, final axnm axnmVar3, aadd aaddVar, aacz aaczVar, afvn afvnVar, Executor executor, final ayor ayorVar, final yni yniVar, axxi axxiVar, whp whpVar) {
        Boolean bool;
        this.a = axnmVar;
        this.f = axnmVar2;
        this.c = aaddVar;
        this.e = aaczVar;
        this.b = afvnVar;
        this.h = whpVar;
        this.i = executor;
        this.g = azpm.aI(afvnVar.c().b()).aO();
        aqxe aqxeVar = axxiVar.b.b().C;
        aqxeVar = aqxeVar == null ? aqxe.a : aqxeVar;
        boolean z = false;
        if (aqxeVar.a(45357308L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45357308L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45357308L);
            bool = Boolean.valueOf(aqxfVar.b == 1 ? ((Boolean) aqxfVar.c).booleanValue() : z);
        } else {
            bool = false;
        }
        this.j = bool.booleanValue();
        if (eog.av(aaczVar)) {
            executor.execute(new Runnable() { // from class: ehb
                @Override // java.lang.Runnable
                public final void run() {
                    ehh.this.h(axnmVar3, ayorVar, yniVar);
                }
            });
        } else {
            axnmVar.get();
            axnmVar2.get();
            h(axnmVar3, ayorVar, yniVar);
        }
        o();
    }

    public static boolean k(arhd arhdVar, boolean z) {
        asxp asxpVar = arhdVar.e;
        if (asxpVar == null) {
            asxpVar = asxp.a;
        }
        return asxpVar.ab && !z;
    }

    private final void o() {
        if (!this.j) {
            return;
        }
        final egw b = b();
        ylx.i(vwr.b(this.b.c(), this.h, this.i), new ylw() { // from class: ehc
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                ehh ehhVar = ehh.this;
                egw egwVar = b;
                if (!((Boolean) obj).booleanValue() || egwVar.i) {
                    return;
                }
                ehhVar.d(true).Q();
            }
        });
    }

    public final egw a(egw egwVar) {
        if (egwVar == null || egwVar.i || !vwr.d(this.b.c())) {
            return egwVar;
        }
        aopa mo52toBuilder = egwVar.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        egw egwVar2 = (egw) mo52toBuilder.instance;
        egwVar2.b |= 1;
        egwVar2.c = true;
        return (egw) mo52toBuilder.mo39build();
    }

    public final egw b() {
        egw egwVar = (egw) ((yve) this.a.get()).c();
        String b = this.b.c().b();
        Map unmodifiableMap = Collections.unmodifiableMap(((egy) ((yve) this.f.get()).c()).b);
        if (unmodifiableMap.containsKey(b) && unmodifiableMap.get(b) != null) {
            egwVar = (egw) unmodifiableMap.get(b);
        }
        return a(egwVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ankt c(final ampg ampgVar) {
        return ((yve) this.f.get()).b(new ampg() { // from class: ehd
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                egw egwVar;
                ehh ehhVar = ehh.this;
                ampg ampgVar2 = ampgVar;
                egy egyVar = (egy) obj;
                String b = ehhVar.b.c().b();
                Map unmodifiableMap = Collections.unmodifiableMap(egyVar.b);
                if (!unmodifiableMap.containsKey(b) || unmodifiableMap.get(b) == null) {
                    egwVar = (egw) ((yve) ehhVar.a.get()).c();
                } else {
                    egwVar = (egw) unmodifiableMap.get(b);
                }
                aopa mo52toBuilder = egyVar.mo52toBuilder();
                String b2 = ehhVar.b.c().b();
                aopa mo52toBuilder2 = egwVar.mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                egw egwVar2 = (egw) mo52toBuilder2.instance;
                egwVar2.b |= 64;
                egwVar2.i = true;
                egw egwVar3 = (egw) ampgVar2.apply((egw) mo52toBuilder2.mo39build());
                egwVar3.getClass();
                mo52toBuilder.copyOnWrite();
                egy egyVar2 = (egy) mo52toBuilder.instance;
                aoqp aoqpVar = egyVar2.b;
                if (!aoqpVar.b) {
                    egyVar2.b = aoqpVar.a();
                }
                egyVar2.b.put(b2, egwVar3);
                return (egy) mo52toBuilder.mo39build();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aynr d(boolean z) {
        ankt c = c(new ehf(z, 1));
        aynr C = zhn.c(c).q(dzq.d).C();
        ylx.m(c, new dzl(6));
        return C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aynr e(final boolean z, final long j) {
        ankt c = c(new ampg() { // from class: ehe
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                boolean z2 = z;
                long j2 = j;
                aopa mo52toBuilder = ((egw) obj).mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                egw egwVar = (egw) mo52toBuilder.instance;
                egwVar.b |= 32;
                egwVar.h = z2;
                mo52toBuilder.copyOnWrite();
                egw egwVar2 = (egw) mo52toBuilder.instance;
                egwVar2.b |= 16;
                egwVar2.g = j2;
                return (egw) mo52toBuilder.mo39build();
            }
        });
        aynr D = zhn.c(c).D(efx.d);
        ylx.m(c, new dzl(6));
        return D;
    }

    public final ayoi g() {
        return ayoi.o(((yve) this.a.get()).d().W(), ((yve) this.f.get()).d().W(), this.g, new ayqc() { // from class: eha
            @Override // defpackage.ayqc
            public final Object a(Object obj, Object obj2, Object obj3) {
                ehh ehhVar = ehh.this;
                egw egwVar = (egw) obj;
                String str = (String) obj3;
                Map unmodifiableMap = Collections.unmodifiableMap(((egy) obj2).b);
                if (!unmodifiableMap.containsKey(str) || unmodifiableMap.get(str) == null) {
                    return ehhVar.a(egwVar);
                }
                return ehhVar.a((egw) unmodifiableMap.get(str));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(axnm axnmVar, ayor ayorVar, yni yniVar) {
        yniVar.g(this);
        if (eog.aw(this.e)) {
            ((eil) axnmVar.get()).a().X(ayorVar).as(new ayqb() { // from class: egz
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    ehh ehhVar = ehh.this;
                    eik eikVar = (eik) obj;
                    if (ehhVar.d == eikVar || eikVar == eik.UNKNOWN || !eog.aw(ehhVar.e)) {
                        return;
                    }
                    if (eikVar.f || !ehhVar.l()) {
                        if (eikVar.f && !ehhVar.l()) {
                            ehhVar.n(ehhVar.m());
                        }
                    } else {
                        ehhVar.d(false).Q();
                    }
                    ehhVar.d = eikVar;
                }
            });
        }
        if (eog.av(this.e)) {
            j();
        }
    }

    public final boolean i() {
        return k(this.c.a(), this.b.c().g());
    }

    public final boolean j() {
        return i() && b().c;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwb afwbVar = (afwb) obj;
                this.g.c(this.b.c().b());
                o();
                return null;
            } else if (i == 1) {
                afwd afwdVar = (afwd) obj;
                this.g.c(this.b.c().b());
                o();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{afwb.class, afwd.class};
    }

    public final boolean l() {
        return j() && eog.aw(this.e) && b().j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m() {
        return b().f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(boolean z) {
        ylx.m(c(new ehf(z)), new dzl(6));
    }
}
