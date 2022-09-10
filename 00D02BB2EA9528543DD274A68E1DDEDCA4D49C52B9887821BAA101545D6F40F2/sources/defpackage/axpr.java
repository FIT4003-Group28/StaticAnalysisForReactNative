package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: axpr  reason: default package */
/* loaded from: classes3.dex */
public class axpr implements axoo {
    public final dzsj<gga> a;
    public final Executor b;
    public final bvjj c;
    public final akfa d;
    public final axhs e;
    public final boolean f;
    public final axgi h;
    public final axqa i;
    private final axpf k;
    private final boolean l;
    private final axpq m;
    public final List<axos> g = new ArrayList();
    public boolean j = false;

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0072, code lost:
        if (r3.a() == defpackage.axgg.SUBSEQUENT_LOAD_ERROR) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public axpr(defpackage.axpf r1, defpackage.axpp r2, defpackage.dzsj<defpackage.gga> r3, java.util.concurrent.Executor r4, defpackage.bvjj r5, defpackage.akfa r6, defpackage.axhs r7, final defpackage.axgi r8, boolean r9) {
        /*
            r0 = this;
            r0.<init>()
            r0.k = r1
            r0.a = r3
            r0.b = r4
            r0.c = r5
            r0.d = r6
            r0.e = r7
            boolean r1 = r8.b()
            r0.f = r1
            r0.l = r9
            r0.h = r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.g = r1
            r1 = 0
            r0.j = r1
            java.lang.String r3 = r8.i
            axfm r3 = r7.i(r3)
            z<axfk> r3 = r3.f
            axpq r4 = new axpq
            dzsj<gga> r5 = r2.a
            dzsj<axjh> r6 = r2.b
            java.lang.Object r6 = r6.a()
            axjh r6 = (defpackage.axjh) r6
            defpackage.dbsk.s(r6)
            dzsj<cqhn> r2 = r2.c
            r4.<init>(r5, r6, r2, r3)
            v<axfk> r2 = r4.b
            axpn r3 = new axpn
            r3.<init>(r4)
            r2.c(r3)
            r0.m = r4
            axqa r2 = new axqa
            z<axgh> r3 = r8.c
            java.lang.Object r3 = r3.h()
            axgh r3 = (defpackage.axgh) r3
            defpackage.dbsk.s(r3)
            axgg r3 = r3.a()
            axgg r4 = defpackage.axgg.PARTIALLY_LOADED
            r5 = 1
            if (r3 == r4) goto L74
            z<axgh> r3 = r8.c
            java.lang.Object r3 = r3.h()
            axgh r3 = (defpackage.axgh) r3
            defpackage.dbsk.s(r3)
            axgg r3 = r3.a()
            axgg r4 = defpackage.axgg.SUBSEQUENT_LOAD_ERROR
            if (r3 != r4) goto L75
        L74:
            r1 = 1
        L75:
            axpg r3 = new axpg
            r3.<init>(r8)
            r2.<init>(r1, r3)
            r0.i = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axpr.<init>(axpf, axpp, dzsj, java.util.concurrent.Executor, bvjj, akfa, axhs, axgi, boolean):void");
    }

    @Override // defpackage.axoo
    public dfqc a() {
        if (this.f) {
            return dfqc.SELF_FOLLOWER_LIST;
        }
        return dfqc.OTHERS_FOLLOWER_LIST;
    }

    @Override // defpackage.axot
    public List<axos> b() {
        return this.g;
    }

    @Override // defpackage.axot
    public Boolean c() {
        boolean z = false;
        if (this.g.isEmpty() && !this.j) {
            axgh h = this.h.c.h();
            dbsk.s(h);
            if (h.a() == axgg.LOADED) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.axot
    public String d() {
        int t = this.c.t(bvjk.hM, this.d.j(), 0);
        if (!this.f || t != 0) {
            return this.a.a().getString(R.string.ZERO_STATE_TITLE_NO_FOLLOWERS);
        }
        return this.a.a().getString(R.string.ZERO_STATE_TITLE_NO_FOLLOWERS_INELIGIBLE);
    }

    @Override // defpackage.axot
    @dzsi
    public axor e() {
        if (this.j) {
            return this.m;
        }
        return null;
    }

    @Override // defpackage.axot
    public cqqw f() {
        return this.i;
    }

    @Override // defpackage.axot
    public Boolean g() {
        axgh h = this.h.c.h();
        dbsk.s(h);
        return Boolean.valueOf(h.a() == axgg.SUBSEQUENT_LOAD_IN_PROGRESS);
    }

    @Override // defpackage.axot
    @dzsi
    public jht h(final axos axosVar) {
        if (!this.f || !this.l) {
            return null;
        }
        cjtd a = cjtd.a(dtxy.t);
        jhu h = jhv.h();
        jhm jhmVar = new jhm();
        jhmVar.a = this.a.a().getString(R.string.REMOVE_FOLLOWER_ACTION);
        jhmVar.b = this.a.a().getString(R.string.REMOVE_FOLLOWER_ACTION);
        jhmVar.f = a;
        jhmVar.d(new View.OnClickListener(this, axosVar) { // from class: axpj
            private final axpr a;
            private final axos b;

            {
                this.a = this;
                this.b = axosVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                axpr axprVar = this.a;
                deha.q(axprVar.e.h(this.b.k().d), new axpl(axprVar), axprVar.b);
            }
        });
        h.d(jhmVar.c());
        h.c(cjtd.a(dtxy.s));
        ((jhi) h).e = this.a.a().getString(R.string.PROFILE_OVERFLOW_MENU_A11Y_DESCRIPTION, new Object[]{axosVar.k().b});
        return h.b();
    }

    @Override // defpackage.axot
    public cjtd i() {
        return cjtd.a(dtxy.u);
    }

    public axpe j(dqae dqaeVar) {
        return this.k.a(dqaeVar, this);
    }
}
