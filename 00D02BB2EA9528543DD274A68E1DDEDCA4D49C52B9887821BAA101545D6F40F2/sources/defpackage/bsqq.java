package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bsqq  reason: default package */
/* loaded from: classes4.dex */
public class bsqq implements bssj {
    public final ilo a;
    private final Resources b;
    private final dpns c;
    private final Runnable d;
    private final cjtd e;
    private final cjtd f;

    public bsqq(gga ggaVar, final bjhc bjhcVar, final bjbu bjbuVar, dpns dpnsVar) {
        this.b = ggaVar.getResources();
        this.c = dpnsVar;
        djah bZ = djai.g.bZ();
        bZ.a(dpnsVar.b);
        dqcr bZ2 = dqcu.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dqcu dqcuVar = (dqcu) bZ2.b;
        dqcuVar.b = 2;
        dqcuVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djai djaiVar = (djai) bZ.b;
        dqcu bK = bZ2.bK();
        bK.getClass();
        djaiVar.f = bK;
        djaiVar.a |= 16;
        djai bK2 = bZ.bK();
        ily ilyVar = new ily();
        drdg drdgVar = dpnsVar.a;
        ilyVar.w(drdgVar == null ? drdg.q : drdgVar);
        ilw ilwVar = ilyVar.b;
        ilwVar.B = true;
        ilwVar.i = bK2;
        ilo d = ilyVar.d();
        this.a = d;
        this.d = new Runnable(this, bjhcVar, bjbuVar) { // from class: bsqo
            private final bsqq a;
            private final bjhc b;
            private final bjbu c;

            {
                this.a = this;
                this.b = bjhcVar;
                this.c = bjbuVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final bsqq bsqqVar = this.a;
                bjhc bjhcVar2 = this.b;
                final bjbu bjbuVar2 = this.c;
                bjhcVar2.c(new Runnable(bsqqVar, bjbuVar2) { // from class: bsqp
                    private final bsqq a;
                    private final bjbu b;

                    {
                        this.a = bsqqVar;
                        this.b = bjbuVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.b.b(this.a.a);
                    }
                });
            }
        };
        this.e = g(d, dtxl.S);
        this.f = g(d, dtxl.R);
    }

    private static cjtd g(ilo iloVar, ddho ddhoVar) {
        cjta c = cjtd.c(iloVar.bZ());
        c.d = ddhoVar;
        return c.a();
    }

    @Override // defpackage.bssj
    public String a() {
        return this.c.d;
    }

    @Override // defpackage.bssj
    public String b() {
        return this.c.e;
    }

    @Override // defpackage.bssj
    public String c() {
        return this.b.getString(R.string.CITY_QA_PROMO_ASK_A_QUESTION_BUTTON);
    }

    @Override // defpackage.bssj
    public cqkl d() {
        this.d.run();
        return cqkl.a;
    }

    @Override // defpackage.bssj
    public cjtd e() {
        return this.e;
    }

    @Override // defpackage.bssj
    public cjtd f() {
        return this.f;
    }
}
