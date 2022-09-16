package defpackage;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: wfn */
/* loaded from: classes4.dex */
public final class wfn implements afvt {
    public static final /* synthetic */ int c = 0;
    private static final long e = TimeUnit.MINUTES.toSeconds(90);
    public final wea a;
    public final acrq b;
    private final boolean f;
    private final axnm g;
    private final axnm h;
    private final yni i;
    private final Set j = new HashSet();
    private final SharedPreferences k;
    private final abfh l;
    private final snc m;

    public wfn(axnm axnmVar, axnm axnmVar2, yni yniVar, SharedPreferences sharedPreferences, wea weaVar, abfh abfhVar, snc sncVar, acrq acrqVar, aacz aaczVar) {
        this.g = axnmVar;
        this.h = axnmVar2;
        this.i = yniVar;
        this.k = sharedPreferences;
        this.a = weaVar;
        this.l = abfhVar;
        this.m = sncVar;
        this.b = acrqVar;
        this.f = vzx.a(aaczVar);
    }

    private final synchronized void k(afve afveVar, apzg apzgVar, boolean z) {
        if (this.f) {
            aopa createBuilder = aowt.a.createBuilder();
            createBuilder.copyOnWrite();
            aowt aowtVar = (aowt) createBuilder.instance;
            aowtVar.c = 7;
            aowtVar.b |= 1;
            if (z) {
                createBuilder.copyOnWrite();
                aowt aowtVar2 = (aowt) createBuilder.instance;
                aowtVar2.d = 8;
                aowtVar2.b |= 2;
            }
            arrf a = arrh.a();
            a.copyOnWrite();
            ((arrh) a.instance).bU((aowt) createBuilder.mo39build());
            this.b.a((arrh) a.mo39build());
        }
        this.i.d(new wgh(wgg.STARTED, false));
        ((wac) this.g.get()).k();
        this.k.edit().putLong("incognito_LACT", 0L).apply();
        this.i.d(new wgh(wgg.FINISHED, true, apzgVar));
        this.i.f(new afwb(((wac) this.g.get()).c()));
        if (afveVar != null) {
            afveVar.a();
        }
        for (afvu afvuVar : this.j) {
            afvuVar.k();
        }
        if (!this.f) {
            return;
        }
        final aopa createBuilder2 = aows.a.createBuilder();
        createBuilder2.copyOnWrite();
        aows aowsVar = (aows) createBuilder2.instance;
        aowsVar.c = 7;
        aowsVar.b |= 1;
        if (z) {
            createBuilder2.copyOnWrite();
            aows aowsVar2 = (aows) createBuilder2.instance;
            aowsVar2.d = 8;
            aowsVar2.b |= 2;
        }
        abfg a2 = this.l.a();
        ((abfl) a2).b = new ampg() { // from class: wfl
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                wfn wfnVar = wfn.this;
                aopa aopaVar = createBuilder2;
                apij apijVar = (apij) obj;
                if (!apij.a.equals(apijVar)) {
                    aopaVar.copyOnWrite();
                    aows aowsVar3 = (aows) aopaVar.instance;
                    aows aowsVar4 = aows.a;
                    apijVar.getClass();
                    aowsVar3.e = apijVar;
                    aowsVar3.b |= 8;
                }
                arrf a3 = arrh.a();
                a3.copyOnWrite();
                ((arrh) a3.instance).bT((aows) aopaVar.mo39build());
                wfnVar.b.b((arrh) a3.mo39build(), wfnVar.a());
                return apij.a;
            }
        };
        ylx.m(a2.a(), ngc.g);
    }

    public final long a() {
        return TimeUnit.HOURS.toMillis(TimeUnit.MILLISECONDS.toHours(this.m.c()));
    }

    @Override // defpackage.afvt
    public final ankt b() {
        ankt q;
        wea weaVar = this.a;
        final String str = weaVar.b;
        if (str == null) {
            return anlz.q(false);
        }
        if (!wea.e(weaVar.c)) {
            q = anlz.q(Boolean.valueOf(((SharedPreferences) weaVar.a.get()).getBoolean(str.length() != 0 ? "incognito_promotion_already_shown".concat(str) : new String("incognito_promotion_already_shown"), false)));
        } else {
            q = anii.h(weaVar.d.a(), new wdx(str), anjk.a);
        }
        return anii.h(q, new ampg() { // from class: wfm
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                ankt anktVar;
                wfn wfnVar = wfn.this;
                String str2 = str;
                if (((Boolean) obj).booleanValue()) {
                    return false;
                }
                wea weaVar2 = wfnVar.a;
                if (!wea.e(weaVar2.c)) {
                    ((SharedPreferences) weaVar2.a.get()).edit().putBoolean(str2.length() != 0 ? "incognito_promotion_already_shown".concat(str2) : new String("incognito_promotion_already_shown"), true).apply();
                    anktVar = ankq.a;
                } else {
                    anktVar = weaVar2.d.b(new wdx(str2, 4), anjk.a);
                }
                ylx.i(anktVar, lgj.j);
                return true;
            }
        }, anjk.a);
    }

    @Override // defpackage.afvt
    public final synchronized void c() {
        long j = this.k.getLong("incognito_LACT", 0L);
        if (j != 0 && TimeUnit.MILLISECONDS.toSeconds(this.m.d() - j) <= e && this.m.d() - j >= 0) {
            h();
            return;
        }
        k(null, null, true);
        for (afvu afvuVar : this.j) {
            afvuVar.l();
        }
    }

    @Override // defpackage.afvt
    public final synchronized void d(String str) {
        if (this.f) {
            aopa createBuilder = aows.a.createBuilder();
            createBuilder.copyOnWrite();
            aows aowsVar = (aows) createBuilder.instance;
            aowsVar.c = 6;
            aowsVar.b |= 1;
            arrf a = arrh.a();
            a.copyOnWrite();
            ((arrh) a.instance).bT((aows) createBuilder.mo39build());
            this.b.b((arrh) a.mo39build(), a());
        }
        ((wac) this.g.get()).p(str);
        ((wal) this.h.get()).i();
        this.i.f(new afwd());
        this.i.d(new wgh(wgg.FINISHED, true));
        for (afvu afvuVar : this.j) {
            afvuVar.j();
        }
        if (!this.f) {
            return;
        }
        aopa createBuilder2 = aowt.a.createBuilder();
        createBuilder2.copyOnWrite();
        aowt aowtVar = (aowt) createBuilder2.instance;
        aowtVar.c = 6;
        aowtVar.b |= 1;
        arrf a2 = arrh.a();
        a2.copyOnWrite();
        ((arrh) a2.instance).bU((aowt) createBuilder2.mo39build());
        this.b.a((arrh) a2.mo39build());
    }

    @Override // defpackage.afvt
    public final synchronized void e(afve afveVar) {
        k(afveVar, null, false);
    }

    @Override // defpackage.afvt
    public final void f(afve afveVar, apzg apzgVar) {
        k(afveVar, apzgVar, false);
    }

    @Override // defpackage.afvt
    public final synchronized void h() {
        this.k.edit().putLong("incognito_LACT", this.m.d()).apply();
    }

    @Override // defpackage.afvt
    public final void i(afvu afvuVar) {
        this.j.add(afvuVar);
    }

    @Override // defpackage.afvt
    public final void j(afvu afvuVar) {
        this.j.remove(afvuVar);
    }
}
