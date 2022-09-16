package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: akyu  reason: default package */
/* loaded from: classes.dex */
public final class akyu implements algp, alal, ynl {
    public static final String a = aakj.d(avvc.b.a(), "com.google.android.libraries.youtube.upload.upload_status_entity");
    private static final amuk m = amuk.s(alcu.NORMAL_UPLOAD, alcu.SHORTS_UPLOAD);
    public final yni b;
    public final afvn c;
    public final aagi d;
    public final alak e;
    public final algq f;
    public String i;
    public avvb j;
    public final aacz l;
    private final snc n;
    private final akzp o;
    public final Map g = new HashMap();
    public final Object h = new Object();
    public volatile boolean k = false;

    public akyu(snc sncVar, aacz aaczVar, yni yniVar, afvn afvnVar, aagi aagiVar, akzp akzpVar, alak alakVar, algq algqVar) {
        this.n = sncVar;
        this.l = aaczVar;
        this.b = yniVar;
        this.c = afvnVar;
        this.d = aagiVar;
        this.o = akzpVar;
        this.e = alakVar;
        this.f = algqVar;
    }

    private final void u() {
        synchronized (this.h) {
            int size = this.g.size();
            float f = 0.0f;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (akyt akytVar : this.g.values()) {
                int i4 = akytVar.d;
                float f2 = 1.0f;
                if (i4 != 3 && i4 != 4) {
                    f2 = (akytVar.a * 0.12f) + (akytVar.b * 0.68f) + (akytVar.c * 0.2f);
                }
                f += f2 / size;
                int i5 = i4 - 1;
                if (i4 == 0) {
                    throw null;
                }
                if (i5 == 1) {
                    i3++;
                } else if (i5 == 2) {
                    i++;
                } else if (i5 == 3) {
                    i2++;
                }
            }
            aagh c = this.d.c();
            avuz f3 = avva.f(a);
            Float valueOf = Float.valueOf(f);
            aopa aopaVar = f3.a;
            float floatValue = valueOf.floatValue();
            aopaVar.copyOnWrite();
            avvc avvcVar = (avvc) aopaVar.instance;
            avvc avvcVar2 = avvc.a;
            avvcVar.c = 2 | avvcVar.c;
            avvcVar.e = floatValue;
            Integer valueOf2 = Integer.valueOf(i3);
            aopa aopaVar2 = f3.a;
            int intValue = valueOf2.intValue();
            aopaVar2.copyOnWrite();
            avvc avvcVar3 = (avvc) aopaVar2.instance;
            avvcVar3.c |= 4;
            avvcVar3.f = intValue;
            Integer valueOf3 = Integer.valueOf(i2);
            aopa aopaVar3 = f3.a;
            int intValue2 = valueOf3.intValue();
            aopaVar3.copyOnWrite();
            avvc avvcVar4 = (avvc) aopaVar3.instance;
            avvcVar4.c |= 8;
            avvcVar4.g = intValue2;
            Integer valueOf4 = Integer.valueOf(i);
            aopa aopaVar4 = f3.a;
            int intValue3 = valueOf4.intValue();
            aopaVar4.copyOnWrite();
            avvc avvcVar5 = (avvc) aopaVar4.instance;
            avvcVar5.c |= 16;
            avvcVar5.h = intValue3;
            avvb b = f3.b();
            avvb avvbVar = this.j;
            if (avvbVar == null || !b.equals(avvbVar)) {
                this.j = b;
                avuz e = b.e();
                Long valueOf5 = Long.valueOf(this.n.c());
                aopa aopaVar5 = e.a;
                long longValue = valueOf5.longValue();
                aopaVar5.copyOnWrite();
                avvc avvcVar6 = (avvc) aopaVar5.instance;
                avvcVar6.c |= 32;
                avvcVar6.i = longValue;
                avvb b2 = e.b();
                aahb c2 = ((aagu) c).c();
                c2.d(b2);
                c2.b();
                String.valueOf(String.valueOf(b2)).length();
            }
        }
    }

    @Override // defpackage.alal
    public final /* synthetic */ void a(String str, boolean z, boolean z2) {
    }

    @Override // defpackage.alal
    public final void b(String str, long j, long j2) {
        synchronized (this.h) {
            if (j2 != 0) {
                akyt akytVar = (akyt) this.g.get(str);
                if (akytVar != null) {
                    akytVar.a(((float) j) / ((float) j2));
                    u();
                }
            }
        }
    }

    @Override // defpackage.alal
    public final /* synthetic */ void c(String str, alda aldaVar) {
    }

    @Override // defpackage.alal
    public final void d(String str, augw augwVar) {
        synchronized (this.h) {
            akyt akytVar = (akyt) this.g.get(str);
            if (akytVar != null) {
                akytVar.b((float) augwVar.b);
                u();
            }
        }
    }

    @Override // defpackage.alal
    public final /* synthetic */ void e(String str, double d) {
    }

    @Override // defpackage.alal
    public final void f(String str, long j, long j2, double d) {
        synchronized (this.h) {
            if (j2 != 0) {
                akyt akytVar = (akyt) this.g.get(str);
                if (akytVar != null) {
                    akytVar.c(((float) j) / ((float) j2));
                    u();
                }
            }
        }
    }

    @Override // defpackage.alal
    public final /* synthetic */ void g(String str, alct alctVar) {
    }

    @Override // defpackage.alal
    public final /* synthetic */ void h(alcw alcwVar) {
    }

    @Override // defpackage.alal
    public final void i(String str, alcw alcwVar) {
        synchronized (this.h) {
            if (!this.g.containsKey(str)) {
                v(alcwVar, true);
            }
        }
    }

    @Override // defpackage.alal
    public final /* synthetic */ void j(String str) {
    }

    @Override // defpackage.alal
    public final /* synthetic */ void k(String str, boolean z) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwb afwbVar = (afwb) obj;
                synchronized (this.h) {
                    aagh c = this.d.c();
                    this.g.clear();
                    aahb c2 = ((aagu) c).c();
                    c2.d(avva.f(a).b());
                    c2.b();
                    this.j = null;
                    this.i = afwbVar.a().d();
                }
                return null;
            } else if (i == 1) {
                afwd afwdVar = (afwd) obj;
                synchronized (this.h) {
                    aagh c3 = this.d.c();
                    this.g.clear();
                    aahb c4 = ((aagu) c3).c();
                    c4.d(avva.f(a).b());
                    c4.b();
                    this.j = null;
                    this.i = null;
                }
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

    @Override // defpackage.alal
    public final /* synthetic */ void l(String str, avvd avvdVar) {
    }

    @Override // defpackage.alal
    public final /* synthetic */ void m(String str, String str2) {
    }

    @Override // defpackage.alal
    public final /* synthetic */ void n(String str, alcv alcvVar) {
    }

    @Override // defpackage.alal
    public final /* synthetic */ void o(String str, int i) {
    }

    @Override // defpackage.algp
    public final void p(String str) {
    }

    @Override // defpackage.algp
    public final void q(String str, alcw alcwVar) {
        synchronized (this.h) {
            v(alcwVar, true);
        }
    }

    @Override // defpackage.algp
    public final void r(String str) {
        alcw alcwVar;
        synchronized (this.h) {
            try {
                alcwVar = this.o.b(str);
            } catch (akzq e) {
                String valueOf = String.valueOf(str);
                zep.f("UploadIndicatorController", valueOf.length() != 0 ? "Error reading job ".concat(valueOf) : new String("Error reading job "), e);
                alcwVar = null;
            }
            if (alcwVar == null) {
                if (this.g.containsKey(str)) {
                    ((akyt) this.g.get(str)).d = 3;
                    u();
                }
            } else {
                v(alcwVar, false);
            }
        }
    }

    @Override // defpackage.algp
    public final void s(String str) {
    }

    @Override // defpackage.algp
    public final void t(String str) {
    }

    private final void v(alcw alcwVar, boolean z) {
        synchronized (this.h) {
            if (alcwVar.s && !alcwVar.t) {
                return;
            }
            amuk amukVar = m;
            alcu a2 = alcu.a(alcwVar.l);
            if (a2 == null) {
                a2 = alcu.UNKNOWN_UPLOAD;
            }
            if (!amukVar.contains(a2)) {
                return;
            }
            String str = this.i;
            if (str != null && str.equals(alcwVar.e)) {
                akyt akytVar = new akyt();
                if (alcwVar.ac) {
                    this.g.remove(alcwVar.k);
                } else {
                    if (!alcwVar.ad) {
                        amuk amukVar2 = akzk.a;
                        alcv a3 = alcv.a(alcwVar.X);
                        if (a3 == null) {
                            a3 = alcv.UNKNOWN;
                        }
                        if (!amukVar2.contains(a3)) {
                            akytVar.d = 2;
                            float f = 0.0f;
                            if (alcwVar.x) {
                                alct alctVar = alcwVar.y;
                                if (alctVar == null) {
                                    alctVar = alct.a;
                                }
                                akytVar.a(true != alht.k(alctVar) ? 0.0f : 1.0f);
                            } else {
                                akytVar.a(1.0f);
                            }
                            alct alctVar2 = alcwVar.H;
                            if (alctVar2 == null) {
                                alctVar2 = alct.a;
                            }
                            akytVar.c(true != alht.k(alctVar2) ? 0.0f : 1.0f);
                            alct alctVar3 = alcwVar.Y;
                            if (alctVar3 == null) {
                                alctVar3 = alct.a;
                            }
                            if (true == alht.k(alctVar3)) {
                                f = 1.0f;
                            }
                            akytVar.b(f);
                            if (z || this.g.containsKey(alcwVar.k)) {
                                this.g.put(alcwVar.k, akytVar);
                            }
                        }
                    }
                    akytVar.d = 4;
                    if (z || this.g.containsKey(alcwVar.k)) {
                        this.g.put(alcwVar.k, akytVar);
                    }
                }
                u();
            }
        }
    }
}
