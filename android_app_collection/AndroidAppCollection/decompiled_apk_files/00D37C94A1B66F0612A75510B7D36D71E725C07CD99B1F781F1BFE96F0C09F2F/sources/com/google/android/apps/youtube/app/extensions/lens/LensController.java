package com.google.android.apps.youtube.app.extensions.lens;

import java.util.Iterator;
import java.util.LinkedHashMap;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class LensController implements f, ynl {
    public final azqb a;
    public final boolean b;
    public final aafo c;
    public final azqb d;
    public byte[] f;
    private final yni h;
    public final LinkedHashMap e = new gry();
    public final amzp g = amzp.a();

    public LensController(yni yniVar, azqb azqbVar, aacz aaczVar, aafo aafoVar, azqb azqbVar2) {
        this.h = yniVar;
        this.a = azqbVar;
        this.b = eog.aG(aaczVar);
        this.c = aafoVar;
        this.d = azqbVar2;
    }

    public final void g() {
        apzg apzgVar = (apzg) this.e.get(((airr) this.a.get()).q());
        if (apzgVar != null) {
            this.c.c(apzgVar, null);
        }
    }

    @Override // defpackage.f, defpackage.g
    public final void kG(apy apyVar) {
        if (this.b) {
            this.h.g(this);
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        asgl asglVar;
        auqh auqhVar;
        asgl asglVar2;
        auqh auqhVar2;
        if (i != -1) {
            if (i != 0) {
                if (i == 1) {
                    ahhw ahhwVar = (ahhw) obj;
                    if (!this.b || ahhwVar.c() != aika.NEW) {
                        return null;
                    }
                    g();
                    this.g.d();
                    return null;
                } else if (i == 2) {
                    ahia ahiaVar = (ahia) obj;
                    airr airrVar = (airr) this.a.get();
                    if (!this.b || airrVar.R()) {
                        return null;
                    }
                    if (ahiaVar.a() == 3) {
                        g();
                        ajbf o = airrVar.o();
                        if (o == null) {
                            return null;
                        }
                        long b = o.b();
                        amzp amzpVar = this.g;
                        Long valueOf = Long.valueOf(b);
                        apzg apzgVar = (apzg) amzpVar.b(valueOf);
                        if (apzgVar == null) {
                            return null;
                        }
                        this.c.c(apzgVar, amup.k("player_timestamp_ms", valueOf));
                        return null;
                    } else if (ahiaVar.a() != 2) {
                        return null;
                    } else {
                        g();
                        return null;
                    }
                } else {
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("unsupported op code: ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }
            }
            ahhm ahhmVar = (ahhm) obj;
            if (!this.b || ahhmVar.a() == null) {
                return null;
            }
            asgt asgtVar = ahhmVar.a().a;
            asgu asguVar = asgtVar.d;
            if (asguVar == null) {
                asguVar = asgu.a;
            }
            if (asguVar.b == 51779735) {
                asglVar = (asgl) asguVar.c;
            } else {
                asglVar = asgl.a;
            }
            asgk asgkVar = asglVar.c;
            if (asgkVar == null) {
                asgkVar = asgk.a;
            }
            if (asgkVar.b == 49399797) {
                auqhVar = (auqh) asgkVar.c;
            } else {
                auqhVar = auqh.a;
            }
            Iterator it = auqhVar.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                auxn auxnVar = ((auqk) it.next()).bk;
                if (auxnVar == null) {
                    auxnVar = auxn.a;
                }
                if ((auxnVar.b & 16) != 0) {
                    this.f = auxnVar.g.I();
                    break;
                }
            }
            asgu asguVar2 = asgtVar.d;
            if (asguVar2 == null) {
                asguVar2 = asgu.a;
            }
            if (asguVar2.b == 51779735) {
                asglVar2 = (asgl) asguVar2.c;
            } else {
                asglVar2 = asgl.a;
            }
            asgk asgkVar2 = asglVar2.c;
            if (asgkVar2 == null) {
                asgkVar2 = asgk.a;
            }
            if (asgkVar2.b == 49399797) {
                auqhVar2 = (auqh) asgkVar2.c;
            } else {
                auqhVar2 = auqh.a;
            }
            for (auqk auqkVar : auqhVar2.d) {
                if ((auqkVar.e & 8388608) != 0) {
                    asol asolVar = auqkVar.bu;
                    if (asolVar == null) {
                        asolVar = asol.a;
                    }
                    for (asok asokVar : asolVar.b) {
                        apzg apzgVar2 = asokVar.d;
                        if (apzgVar2 == null) {
                            apzgVar2 = apzg.a;
                        }
                        this.g.e(amxt.e(Long.valueOf(asokVar.b), Long.valueOf(asokVar.c)), apzgVar2);
                    }
                    return null;
                }
            }
            return null;
        }
        return new Class[]{ahhm.class, ahhw.class, ahia.class};
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        g();
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nv(apy apyVar) {
        if (this.b) {
            this.h.m(this);
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
