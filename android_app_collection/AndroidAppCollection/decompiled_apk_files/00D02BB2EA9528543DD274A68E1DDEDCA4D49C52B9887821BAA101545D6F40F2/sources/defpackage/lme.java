package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: lme  reason: default package */
/* loaded from: classes7.dex */
public final class lme implements lmb {
    public final noo a;
    private final Runnable b;
    private final boolean c;
    private final Context d;
    private final mpg e;
    private final mpf f;
    private final atmi g;
    private ldm h;

    public lme(ldm ldmVar, Runnable runnable, @dzsi Runnable runnable2, Runnable runnable3, boolean z, noo nooVar, cqat cqatVar, Context context, ksh kshVar, boolean z2, npo npoVar, atmi atmiVar, btvo btvoVar) {
        this.h = ldmVar;
        this.b = runnable;
        this.c = z;
        this.a = nooVar;
        this.d = context;
        mpn mpnVar = new mpn(kshVar, ldmVar, cjtd.a(dtxm.l));
        this.f = mpnVar;
        this.e = new mqf(context, cqatVar, ldmVar, kdk.NOTHING, npoVar, z2, mpnVar, null, null, runnable3);
        this.g = atmiVar;
        knz knzVar = kob.a;
        p(ldmVar);
    }

    @Override // defpackage.lmb
    public mpe a() {
        return this.e;
    }

    @Override // defpackage.lmb
    public mow b() {
        return this.f;
    }

    @Override // defpackage.lmb
    @dzsi
    public CharSequence c() {
        return this.g.d();
    }

    @Override // defpackage.lmb
    @dzsi
    public CharSequence d() {
        return this.g.am();
    }

    @Override // defpackage.lmb
    public Boolean e() {
        return Boolean.valueOf(npo.a(this.h));
    }

    @Override // defpackage.lmb
    public Boolean f() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.lmb
    public cqkl g() {
        this.b.run();
        return cqkl.a;
    }

    @Override // defpackage.lmb
    public View.OnClickListener h() {
        return new View.OnClickListener(this) { // from class: lmc
            private final lme a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.b();
            }
        };
    }

    @Override // defpackage.lmb
    public View.OnClickListener i() {
        return new View.OnClickListener(this) { // from class: lmd
            private final lme a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.a();
            }
        };
    }

    @Override // defpackage.lmb
    public CharSequence j() {
        return this.d.getResources().getString(R.string.REMOVE_STOP);
    }

    @Override // defpackage.lmb
    public Boolean k() {
        boolean z = false;
        if (!TextUtils.isEmpty(d()) && !TextUtils.isEmpty(c())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.lmb
    public Boolean l() {
        boolean z = false;
        if (k().booleanValue() && q().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.lmb
    public CharSequence m() {
        return this.d.getString(R.string.MENU_DESTINATION_INFO);
    }

    @Override // defpackage.lmb
    public cjtd n() {
        return cjtd.a(dtxm.k);
    }

    @Override // defpackage.lmb
    public cjtd o() {
        return cjtd.a(dtxm.m);
    }

    public void p(ldm ldmVar) {
        this.h = ldmVar;
        this.e.f(ldmVar);
        this.f.e(ldmVar);
        cqkx.p(this);
    }

    public Boolean q() {
        return false;
    }
}
