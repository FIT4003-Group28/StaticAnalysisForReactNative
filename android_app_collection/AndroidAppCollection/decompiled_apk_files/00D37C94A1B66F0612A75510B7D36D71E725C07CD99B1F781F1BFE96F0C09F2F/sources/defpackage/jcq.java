package defpackage;

import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: jcq  reason: default package */
/* loaded from: classes3.dex */
public final class jcq implements ynl {
    public static final amvn a = amvn.s(agoa.class, agnn.class);
    public final azqb b;
    public final azqb c;
    public final Executor d;
    public final azqb e;
    public final azqb f;
    public final azpb g;
    public boolean h;
    private final azqb i;
    private final azqb j;
    private final azqb k;
    private final azqb l;
    private final azqb m;

    public jcq(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, Executor executor, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10) {
        ayor ayorVar;
        this.i = azqbVar2;
        this.b = azqbVar3;
        this.c = azqbVar4;
        this.d = anlz.g(executor);
        this.e = azqbVar5;
        this.j = azqbVar6;
        this.k = azqbVar7;
        this.l = azqbVar8;
        this.f = azqbVar9;
        this.m = azqbVar10;
        azpd ar = azpd.ar();
        this.g = ar;
        aynx H = ar.ax().H();
        if (((fbt) azqbVar9.get()).a()) {
            ayorVar = (ayor) azqbVar10.get();
        } else {
            ayorVar = (ayor) azqbVar.get();
        }
        H.G(ayorVar).z(iyw.e).ag(iyw.g).ag(iyw.f).Z(new ick(7));
    }

    public final void a(final jbg jbgVar) {
        Set<jap> set = (Set) this.j.get();
        Set<jau> set2 = (Set) this.k.get();
        Set<jat> set3 = (Set) this.l.get();
        if (((fbt) this.f.get()).a()) {
            final CountDownLatch countDownLatch = new CountDownLatch(set.size() + set2.size() + set3.size());
            for (final jap japVar : set) {
                ((ayor) this.m.get()).f(new Runnable() { // from class: jbx
                    @Override // java.lang.Runnable
                    public final void run() {
                        jbg jbgVar2 = jbg.this;
                        jap japVar2 = japVar;
                        CountDownLatch countDownLatch2 = countDownLatch;
                        amvn amvnVar = jcq.a;
                        try {
                            jbgVar2.a(japVar2);
                        } catch (RuntimeException e) {
                            afus.c(2, 28, String.valueOf(japVar2.getClass().getSimpleName()).concat(" initialization."), e);
                        } finally {
                            countDownLatch2.countDown();
                        }
                    }
                });
            }
            for (final jau jauVar : set2) {
                ((ayor) this.m.get()).f(new Runnable() { // from class: jca
                    @Override // java.lang.Runnable
                    public final void run() {
                        jbg jbgVar2 = jbg.this;
                        jau jauVar2 = jauVar;
                        CountDownLatch countDownLatch2 = countDownLatch;
                        amvn amvnVar = jcq.a;
                        try {
                            jbgVar2.a(jauVar2);
                        } catch (RuntimeException e) {
                            afus.c(2, 28, String.valueOf(jauVar2.getClass().getSimpleName()).concat(" initialization."), e);
                        } finally {
                            countDownLatch2.countDown();
                        }
                    }
                });
            }
            for (final jat jatVar : set3) {
                ((ayor) this.m.get()).f(new Runnable() { // from class: jbz
                    @Override // java.lang.Runnable
                    public final void run() {
                        jbg jbgVar2 = jbg.this;
                        jat jatVar2 = jatVar;
                        CountDownLatch countDownLatch2 = countDownLatch;
                        amvn amvnVar = jcq.a;
                        try {
                            jbgVar2.a(jatVar2);
                        } catch (RuntimeException e) {
                            afus.c(2, 28, String.valueOf(jatVar2.getClass().getSimpleName()).concat(" initialization."), e);
                        } finally {
                            countDownLatch2.countDown();
                        }
                    }
                });
            }
            try {
                countDownLatch.await(10000L, TimeUnit.MILLISECONDS);
                return;
            } catch (InterruptedException e) {
                throw new IllegalStateException("Initialization projections are incomplete.", e);
            }
        }
        for (jap japVar2 : set) {
            jbgVar.a(japVar2);
        }
        for (jau jauVar2 : set2) {
            jbgVar.a(jauVar2);
        }
        for (jat jatVar2 : set3) {
            jbgVar.a(jatVar2);
        }
    }

    public final void b(ampg ampgVar, String str) {
        aahb c = ((aagu) ((aagi) this.c.get()).c()).c();
        jbg jbgVar = (jbg) ampgVar.apply(c);
        for (jap japVar : (Set) this.j.get()) {
            jbgVar.a(japVar);
        }
        for (jat jatVar : (Set) this.l.get()) {
            jbgVar.a(jatVar);
        }
        jjd.l(c, str);
    }

    public final void c(ampg ampgVar, String str) {
        aahb c = ((aagu) ((aagi) this.c.get()).c()).c();
        jbg jbgVar = (jbg) ampgVar.apply(c);
        for (jap japVar : (Set) this.j.get()) {
            jbgVar.a(japVar);
        }
        for (jau jauVar : (Set) this.k.get()) {
            jbgVar.a(jauVar);
        }
        jjd.l(c, str);
    }

    public final void d() {
        ((yni) this.i.get()).g(this);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        switch (i) {
            case -1:
                return new Class[]{afwb.class, agnk.class, agnn.class, agnp.class, agnr.class, agnt.class, agnz.class, agoa.class, agoe.class, agof.class, agog.class};
            case 0:
                afwb afwbVar = (afwb) obj;
                this.h = false;
                this.d.execute(new jcb(this));
                return null;
            case 1:
                agnk agnkVar = (agnk) obj;
                agqh e = ((agrf) this.b.get()).a().i().e(agnkVar.a);
                if (e == null) {
                    return null;
                }
                this.g.c(jbj.a(agnkVar.a, agnk.class, new jck(this, e, 1)));
                return null;
            case 2:
                final agnn agnnVar = (agnn) obj;
                this.g.c(jbj.a(agnnVar.a, agnn.class, new Runnable() { // from class: jcc
                    @Override // java.lang.Runnable
                    public final void run() {
                        jcq jcqVar = jcq.this;
                        final agnn agnnVar2 = agnnVar;
                        jcqVar.b(new ampg() { // from class: jbn
                            @Override // defpackage.ampg
                            public final Object apply(Object obj2) {
                                final agnn agnnVar3 = agnn.this;
                                final aajs aajsVar = (aajs) obj2;
                                return new jbg() { // from class: jbk
                                    @Override // defpackage.jbg
                                    public final void a(Object obj3) {
                                        aajs aajsVar2 = aajs.this;
                                        agnn agnnVar4 = agnnVar3;
                                        amvn amvnVar = jcq.a;
                                        ((jcu) obj3).i(aajsVar2, agnnVar4.a);
                                    }
                                };
                            }
                        }, "Error updating entities for OfflinePlaylistDeleteEvent.");
                    }
                }));
                return null;
            case 3:
                final agnp agnpVar = (agnp) obj;
                final agqh e2 = ((agrf) this.b.get()).a().i().e(agnpVar.a.d());
                if (e2 == null) {
                    return null;
                }
                this.g.c(jbj.a(agnpVar.a.d(), agnp.class, new Runnable() { // from class: jcl
                    @Override // java.lang.Runnable
                    public final void run() {
                        jcq jcqVar = jcq.this;
                        final agqh agqhVar = e2;
                        final agnp agnpVar2 = agnpVar;
                        jcqVar.b(new ampg() { // from class: jbt
                            @Override // defpackage.ampg
                            public final Object apply(Object obj2) {
                                final agqh agqhVar2 = agqh.this;
                                final agnp agnpVar3 = agnpVar2;
                                final aajs aajsVar = (aajs) obj2;
                                return new jbg() { // from class: jco
                                    @Override // defpackage.jbg
                                    public final void a(Object obj3) {
                                        aajs aajsVar2 = aajs.this;
                                        agqh agqhVar3 = agqhVar2;
                                        agnp agnpVar4 = agnpVar3;
                                        amvn amvnVar = jcq.a;
                                        ((jcu) obj3).j(aajsVar2, agqhVar3, agnpVar4.a);
                                    }
                                };
                            }
                        }, "Error updating entities for OfflinePlaylistProgressedEvent.");
                    }
                }));
                return null;
            case 4:
                String d = ((agnr) obj).a.d();
                agqh e3 = ((agrf) this.b.get()).a().i().e(d);
                if (e3 == null) {
                    return null;
                }
                this.g.c(jbj.a(d, agnn.class, new jck(this, e3)));
                return null;
            case 5:
                final agnt agntVar = (agnt) obj;
                this.g.c(jbj.b(agntVar.a.m(), agnt.class, new Runnable() { // from class: jcd
                    @Override // java.lang.Runnable
                    public final void run() {
                        jcq jcqVar = jcq.this;
                        final agnt agntVar2 = agntVar;
                        jcqVar.c(new ampg() { // from class: jbo
                            @Override // defpackage.ampg
                            public final Object apply(Object obj2) {
                                final agnt agntVar3 = agnt.this;
                                final aajs aajsVar = (aajs) obj2;
                                return new jbg() { // from class: jbu
                                    @Override // defpackage.jbg
                                    public final void a(Object obj3) {
                                        aajs aajsVar2 = aajs.this;
                                        agnt agntVar4 = agntVar3;
                                        amvn amvnVar = jcq.a;
                                        ((jcw) obj3).l(aajsVar2, agntVar4.a);
                                    }
                                };
                            }
                        }, "Error updating entities for OfflineSingleVideoAddEvent.");
                    }
                }));
                return null;
            case 6:
                final agnz agnzVar = (agnz) obj;
                this.g.c(jbj.b(agnzVar.a.m(), agnz.class, new Runnable() { // from class: jce
                    @Override // java.lang.Runnable
                    public final void run() {
                        jcq jcqVar = jcq.this;
                        final agnz agnzVar2 = agnzVar;
                        jcqVar.c(new ampg() { // from class: jbp
                            @Override // defpackage.ampg
                            public final Object apply(Object obj2) {
                                final agnz agnzVar3 = agnz.this;
                                final aajs aajsVar = (aajs) obj2;
                                return new jbg() { // from class: jby
                                    @Override // defpackage.jbg
                                    public final void a(Object obj3) {
                                        aajs aajsVar2 = aajs.this;
                                        agnz agnzVar4 = agnzVar3;
                                        amvn amvnVar = jcq.a;
                                        ((jcw) obj3).m(aajsVar2, agnzVar4.a);
                                    }
                                };
                            }
                        }, "Error updating entities for OfflineVideoCompleteEvent.");
                    }
                }));
                return null;
            case 7:
                final agoa agoaVar = (agoa) obj;
                this.g.c(jbj.b(agoaVar.a, agoa.class, new Runnable() { // from class: jcf
                    @Override // java.lang.Runnable
                    public final void run() {
                        jcq jcqVar = jcq.this;
                        final agoa agoaVar2 = agoaVar;
                        jcqVar.c(new ampg() { // from class: jbq
                            @Override // defpackage.ampg
                            public final Object apply(Object obj2) {
                                final agoa agoaVar3 = agoa.this;
                                final aajs aajsVar = (aajs) obj2;
                                return new jbg() { // from class: jcj
                                    @Override // defpackage.jbg
                                    public final void a(Object obj3) {
                                        aajs aajsVar2 = aajs.this;
                                        agoa agoaVar4 = agoaVar3;
                                        amvn amvnVar = jcq.a;
                                        ((jcw) obj3).n(aajsVar2, agoaVar4.a);
                                    }
                                };
                            }
                        }, "Error updating entities for OfflineVideoDeleteEvent.");
                    }
                }));
                return null;
            case 8:
                final agoe agoeVar = (agoe) obj;
                this.g.c(jbj.b(agoeVar.a, agoe.class, new Runnable() { // from class: jcg
                    @Override // java.lang.Runnable
                    public final void run() {
                        jcq jcqVar = jcq.this;
                        agqv e4 = ((agrf) jcqVar.b.get()).a().m().e(agoeVar.a);
                        if (e4 != null) {
                            jcqVar.c(new jbv(e4, 1), "Error updating entities for OfflineVideoPlaybackPositionChangedEvent.");
                        }
                    }
                }));
                return null;
            case 9:
                final agof agofVar = (agof) obj;
                this.g.c(jbj.b(agofVar.a, agof.class, new Runnable() { // from class: jch
                    @Override // java.lang.Runnable
                    public final void run() {
                        jcq jcqVar = jcq.this;
                        agqv e4 = ((agrf) jcqVar.b.get()).a().m().e(agofVar.a);
                        if (e4 != null) {
                            jcqVar.c(new jbv(e4), "Error updating entities for OfflineVideoRefreshEvent.");
                        }
                    }
                }));
                return null;
            case 10:
                final agog agogVar = (agog) obj;
                this.g.c(jbj.b(agogVar.a.m(), agog.class, new Runnable() { // from class: jci
                    @Override // java.lang.Runnable
                    public final void run() {
                        jcq jcqVar = jcq.this;
                        final agog agogVar2 = agogVar;
                        jcqVar.c(new ampg() { // from class: jbr
                            @Override // defpackage.ampg
                            public final Object apply(Object obj2) {
                                final agog agogVar3 = agog.this;
                                final aajs aajsVar = (aajs) obj2;
                                return new jbg() { // from class: jcm
                                    @Override // defpackage.jbg
                                    public final void a(Object obj3) {
                                        aajs aajsVar2 = aajs.this;
                                        agog agogVar4 = agogVar3;
                                        amvn amvnVar = jcq.a;
                                        ((jcw) obj3).q(aajsVar2, agogVar4.a);
                                    }
                                };
                            }
                        }, "Error updating entities for OfflineVideoStatusUpdateEvent.");
                    }
                }));
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
