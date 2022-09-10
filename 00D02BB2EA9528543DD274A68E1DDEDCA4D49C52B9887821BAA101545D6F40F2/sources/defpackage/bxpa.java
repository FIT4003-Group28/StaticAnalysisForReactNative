package defpackage;

import android.app.Activity;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bxpa  reason: default package */
/* loaded from: classes4.dex */
public class bxpa implements bxof {
    public final Executor c;
    private final avij d;
    private final CharSequence e;
    private final CharSequence f;
    private final Activity j;
    private final akpm k;
    private final ahjq l;
    private final cztz m;
    private final avzp n;
    @dzsi
    private dltm i = null;
    public Boolean a = false;
    public boolean b = false;
    private final cqtd g = cqrt.g(2131232281, iva.b(ibl.H(), ibl.af()));
    private final cjtd h = cjtd.a(dtxx.bL);

    public bxpa(cqhn cqhnVar, avij avijVar, akpm akpmVar, ahjq ahjqVar, avzp avzpVar, Activity activity, Executor executor, cztz cztzVar) {
        this.d = avijVar;
        this.j = activity;
        this.c = executor;
        this.k = akpmVar;
        this.l = ahjqVar;
        this.m = cztzVar;
        this.n = avzpVar;
        this.e = activity.getString(R.string.OFFLINE_ONBOARDING_SEARCH_SUGGEST_PROMO_TITLE);
        this.f = activity.getString(R.string.OFFLINE_ONBOARDING_SEARCH_SUGGEST_PROMO_BUTTON_TEXT);
    }

    @Override // defpackage.bxof
    public CharSequence a() {
        return this.e;
    }

    @Override // defpackage.bxof
    public CharSequence b() {
        dltm dltmVar = this.i;
        return dltmVar != null ? this.j.getString(R.string.OFFLINE_ONBOARDING_SEARCH_SUGGEST_PROMO_TEXT, new Object[]{dltmVar.a}) : "";
    }

    @Override // defpackage.bxof
    public CharSequence c() {
        return this.f;
    }

    @Override // defpackage.bxof
    public cqtd d() {
        return this.g;
    }

    @Override // defpackage.bxof
    public CharSequence e() {
        long j;
        dltm dltmVar = this.i;
        if (dltmVar != null) {
            avzp avzpVar = this.n;
            long j2 = dltmVar.i;
            dlug dlugVar = dltmVar.c;
            if (dlugVar == null) {
                dlugVar = dlug.c;
            }
            j = avzpVar.e(j2, dlugVar);
        } else {
            j = 0;
        }
        return this.j.getString(R.string.OFFLINE_ONBOARDING_SEARCH_SUGGEST_PROMO_SUBTEXT, new Object[]{Long.valueOf(j)});
    }

    @Override // defpackage.bxof
    public cqkl f(cjqm cjqmVar) {
        cztq a = cztt.a(this.m);
        a.d(cztr.LONG);
        a.c = this.j.getString(R.string.OFFLINE_ONBOARDING_SEARCH_SUGGEST_YOU_WILL_BE_NOTIFIED);
        a.c();
        dltm dltmVar = this.i;
        if (dltmVar != null) {
            this.d.n(dltmVar.b, new avif(this) { // from class: bxoy
                private final bxpa a;

                {
                    this.a = this;
                }

                @Override // defpackage.avif
                public final void a() {
                    final bxpa bxpaVar = this.a;
                    bxpaVar.c.execute(new Runnable(bxpaVar) { // from class: bxoz
                        private final bxpa a;

                        {
                            this.a = bxpaVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            bxpa bxpaVar2 = this.a;
                            bxpaVar2.a = true;
                            cqkx.p(bxpaVar2);
                        }
                    });
                }
            });
        }
        return cqkl.a;
    }

    @Override // defpackage.bxof
    public cjtd g() {
        return this.h;
    }

    public final void h() {
        akqq S = this.k.n().j.S();
        amvs amvsVar = new amvs();
        amvsVar.v(S.a, S.b);
        GmmLocation d = amvsVar.d();
        GmmLocation a = this.l.a();
        if (a != null) {
            this.d.m(dcdc.g(d, a), new avig(this) { // from class: bxow
                private final bxpa a;

                {
                    this.a = this;
                }

                @Override // defpackage.avig
                public final void a(dltm dltmVar) {
                    bxpa bxpaVar = this.a;
                    if (dltmVar != null) {
                        bxpaVar.j(dltmVar);
                        cqkx.p(bxpaVar);
                    }
                }
            });
            final crzm<avkr> C = this.d.C();
            C.j().Pk(new Runnable(this, C) { // from class: bxox
                private final bxpa a;
                private final crzm b;

                {
                    this.a = this;
                    this.b = C;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bxpa bxpaVar = this.a;
                    avkr avkrVar = (avkr) this.b.l();
                    if (avkrVar != null) {
                        dcpd<dltm> it = avkrVar.c().values().iterator();
                        while (it.hasNext()) {
                            if (it.next().r) {
                                bxpaVar.b = true;
                                return;
                            }
                        }
                    }
                }
            }, this.c);
        }
    }

    public Boolean i() {
        boolean z = false;
        if (this.i != null && !this.a.booleanValue() && !this.b) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public void j(dltm dltmVar) {
        this.i = dltmVar;
    }
}
