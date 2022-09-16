package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: fna  reason: default package */
/* loaded from: classes3.dex */
public final class fna {
    public final aafo a;
    public final acti b;
    public final snc c;
    public final SharedPreferences d;
    private final yrj e;
    private final akfg f;

    public fna(aafo aafoVar, acti actiVar, yrj yrjVar, snc sncVar, SharedPreferences sharedPreferences, akfg akfgVar) {
        this.a = aafoVar;
        this.b = actiVar;
        this.e = yrjVar;
        this.c = sncVar;
        this.d = sharedPreferences;
        this.f = akfgVar;
    }

    private static atoo b(awaj awajVar) {
        atoo atooVar;
        if (awajVar != null) {
            awak awakVar = awajVar.e;
            if (awakVar == null) {
                awakVar = awak.a;
            }
            if (awakVar.b == 96140188) {
                atooVar = (atoo) awakVar.c;
            } else {
                atooVar = atoo.a;
            }
            apok apokVar = atooVar.d;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            if ((apokVar.b & 1) == 0) {
                return null;
            }
            awak awakVar2 = awajVar.e;
            if (awakVar2 == null) {
                awakVar2 = awak.a;
            }
            return awakVar2.b == 96140188 ? (atoo) awakVar2.c : atoo.a;
        }
        return null;
    }

    private static final boolean c(awaj awajVar, awal awalVar) {
        if ((awajVar.b & 1) != 0) {
            awam awamVar = awajVar.c;
            if (awamVar == null) {
                awamVar = awam.b;
            }
            for (awal awalVar2 : new aops(awamVar.c, awam.a)) {
                if (awalVar == awalVar2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(awaj awajVar) {
        arag aragVar;
        arag aragVar2;
        ylr.c();
        atoo b = b(awajVar);
        if (b == null || (b.b & 1) == 0) {
            return;
        }
        apok apokVar = b.d;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        apoj apojVar = apokVar.c;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        if ((apojVar.b & 16384) == 0) {
            return;
        }
        apok apokVar2 = b.d;
        if (apokVar2 == null) {
            apokVar2 = apok.a;
        }
        apoj apojVar2 = apokVar2.c;
        if (apojVar2 == null) {
            apojVar2 = apoj.a;
        }
        arag aragVar3 = null;
        if ((apojVar2.b & 256) != 0) {
            apok apokVar3 = b.d;
            if (apokVar3 == null) {
                apokVar3 = apok.a;
            }
            apoj apojVar3 = apokVar3.c;
            if (apojVar3 == null) {
                apojVar3 = apoj.a;
            }
            aragVar = apojVar3.i;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        if (ajgl.b(aragVar) == null) {
            return;
        }
        awam awamVar = awajVar.c;
        if (awamVar == null) {
            awamVar = awam.b;
        }
        if (awamVar != null) {
            if (TimeUnit.MILLISECONDS.toSeconds(this.c.c() - this.d.getLong(ymf.VIDEO_QUALITY_PROMO_LAST_DISPLAYED, 0L)) < awamVar.g) {
                return;
            }
        }
        if ((!this.e.m() || !c(awajVar, awal.CELLULAR)) && (!this.e.r() || !c(awajVar, awal.WIFI))) {
            return;
        }
        final atoo b2 = b(awajVar);
        b2.getClass();
        fmz fmzVar = new fmz(this, awajVar, b2);
        akfg akfgVar = this.f;
        akfh l = akfgVar.l();
        if ((b2.b & 1) != 0) {
            aragVar2 = b2.c;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        l.k(ajgl.b(aragVar2));
        apok apokVar4 = b2.d;
        if (apokVar4 == null) {
            apokVar4 = apok.a;
        }
        apoj apojVar4 = apokVar4.c;
        if (apojVar4 == null) {
            apojVar4 = apoj.a;
        }
        if ((apojVar4.b & 256) != 0) {
            apok apokVar5 = b2.d;
            if (apokVar5 == null) {
                apokVar5 = apok.a;
            }
            apoj apojVar5 = apokVar5.c;
            if (apojVar5 == null) {
                apojVar5 = apoj.a;
            }
            aragVar3 = apojVar5.i;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        }
        l.m(ajgl.b(aragVar3).toString(), new View.OnClickListener() { // from class: fmy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fna fnaVar = fna.this;
                atoo atooVar = b2;
                if ((atooVar.b & 16) != 0) {
                    fnaVar.b.H(3, new acte(atooVar.e), null);
                }
                aafo aafoVar = fnaVar.a;
                apok apokVar6 = atooVar.d;
                if (apokVar6 == null) {
                    apokVar6 = apok.a;
                }
                apoj apojVar6 = apokVar6.c;
                if (apojVar6 == null) {
                    apojVar6 = apoj.a;
                }
                apzg apzgVar = apojVar6.o;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.c(apzgVar, null);
            }
        });
        l.l(fmzVar);
        l.j(false);
        akfgVar.n(l.b());
    }
}
