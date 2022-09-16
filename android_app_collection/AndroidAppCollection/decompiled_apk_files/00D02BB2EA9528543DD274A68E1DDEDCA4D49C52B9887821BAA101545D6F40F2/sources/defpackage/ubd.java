package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
/* compiled from: PG */
/* renamed from: ubd  reason: default package */
/* loaded from: classes7.dex */
public class ubd implements uai {
    private final tur a;
    private final Runnable b;
    private final twb c;
    private final twc d;
    private final tvz e;
    @dzsi
    private final suo f;
    @dzsi
    private final CharSequence g;
    @dzsi
    private final CharSequence h;
    private final wuv i;
    private final cjtd j;
    private final tlv k;
    private final amve l;

    public ubd(Activity activity, twn twnVar, twh twhVar, cwy cwyVar, tur turVar, final sux suxVar, suq suqVar, final tlv tlvVar, final amve amveVar, final wuv wuvVar) {
        CharSequence b;
        CharSequence b2;
        this.a = turVar;
        this.i = wuvVar;
        this.c = new twl(activity, amveVar);
        this.e = twh.a(wuvVar);
        Activity activity2 = (Activity) ((dxjd) twnVar.a).a;
        twn.b(activity2, 1);
        twn.b(wuvVar, 2);
        this.d = new twm(activity2, wuvVar);
        if (wuvVar.e()) {
            this.b = new Runnable(suxVar, tlvVar, amveVar) { // from class: ubb
                private final sux a;
                private final tlv b;
                private final amve c;

                {
                    this.a = suxVar;
                    this.b = tlvVar;
                    this.c = amveVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.aS(this.b, this.c);
                }
            };
            this.j = vyb.u(amveVar, dtxn.ck);
        } else {
            this.b = new Runnable(suxVar, tlvVar, wuvVar) { // from class: ubc
                private final sux a;
                private final tlv b;
                private final wuv c;

                {
                    this.a = suxVar;
                    this.b = tlvVar;
                    this.c = wuvVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.aT(this.b, this.c);
                }
            };
            this.j = vyb.u(amveVar, dtxn.dC);
        }
        this.f = tlvVar.d().j().a() ? suqVar.a(true) : null;
        zqx zqxVar = new zqx(activity, amveVar);
        dpej e = vyb.e(amveVar);
        if (wuvVar.e()) {
            b = vyb.k(activity, e);
        } else {
            b = stf.b(activity, wuvVar.A(activity.getResources()), vyb.k(activity, e));
        }
        this.g = b;
        if (wuvVar.e()) {
            b2 = stf.b(activity, zqxVar.d(), wuvVar.n());
        } else {
            Resources resources = activity.getResources();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            cwy.a(spannableStringBuilder, resources, false);
            b2 = stf.b(activity, spannableStringBuilder, wuvVar.n());
        }
        this.h = b2;
        this.k = tlvVar;
        this.l = amveVar;
    }

    @Override // defpackage.uai
    public twb a() {
        return this.c;
    }

    @Override // defpackage.uai
    public twc b() {
        return this.d;
    }

    @Override // defpackage.uai
    public tvz c() {
        return this.e;
    }

    @Override // defpackage.uai
    @dzsi
    public suo d() {
        return this.f;
    }

    @Override // defpackage.uai
    @dzsi
    public CharSequence e() {
        return this.g;
    }

    @Override // defpackage.uai
    @dzsi
    public CharSequence f() {
        return this.h;
    }

    @Override // defpackage.ual
    public Boolean k() {
        return Boolean.valueOf(this.f != null);
    }

    @Override // defpackage.ual
    public Boolean l() {
        return true;
    }

    @Override // defpackage.ual
    public Boolean m() {
        return Boolean.valueOf(this.i.i());
    }

    @Override // defpackage.ual
    public cqkl n() {
        this.b.run();
        return cqkl.a;
    }

    @Override // defpackage.ual
    public cjtd o() {
        return this.a.c(this.j, this.k, this.l);
    }
}
