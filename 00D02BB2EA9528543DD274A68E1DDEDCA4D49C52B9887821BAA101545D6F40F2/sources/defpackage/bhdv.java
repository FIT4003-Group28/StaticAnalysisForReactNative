package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bhdv  reason: default package */
/* loaded from: classes3.dex */
public final class bhdv implements bzml {
    public final dxio<bzmm> a;
    @dzsi
    public ilo b;
    @dzsi
    public View c;
    @dzsi
    public String d;
    private final jlp e;
    private final bvjj f;
    private final Activity g;
    private final bhat h;

    public bhdv(gga ggaVar, jlp jlpVar, dxio<bzmm> dxioVar, bvjj bvjjVar, bhat bhatVar) {
        this.g = ggaVar;
        this.e = jlpVar;
        this.a = dxioVar;
        this.f = bvjjVar;
        this.h = bhatVar;
    }

    static final bvjk g(String str) {
        String valueOf = String.valueOf(str);
        return new bvjk(valueOf.length() != 0 ? "merchant_panel_promo_shown_for_listing".concat(valueOf) : new String("merchant_panel_promo_shown_for_listing"), bvjk.b);
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.MERCHANT_PANEL_PROMO_TOOLTIP;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.CRITICAL;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        return this.c != null && this.h.c(btpf.c(this.g), this.b);
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        if (TextUtils.isEmpty(this.d)) {
            return bzmk.NONE;
        }
        if (this.f.m(g(this.d), false)) {
            return bzmk.NONE;
        }
        return bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        if (bzmkVar != bzmk.VISIBLE || this.c == null || TextUtils.isEmpty(this.d)) {
            return false;
        }
        jlp jlpVar = this.e;
        String string = this.g.getString(R.string.MERCHANT_PANEL_PROMO_TOOLTIP_TEXT);
        View view = this.c;
        dbsk.s(view);
        jlo a = jlpVar.a(string, view);
        a.t(jln.GM2_BLUE);
        a.j();
        a.g();
        a.l(jmj.a(this.g, -12));
        a.o(true);
        a.e(new Runnable(this) { // from class: bhdu
            private final bhdv a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bhdv bhdvVar = this.a;
                bhdvVar.a.a().f(dqkc.MERCHANT_PANEL_PROMO_TOOLTIP);
                bhdvVar.b = null;
                bhdvVar.c = null;
                bhdvVar.d = null;
            }
        }, dege.a);
        a.p();
        a.a();
        bvjj bvjjVar = this.f;
        String str = this.d;
        dbsk.s(str);
        bvjjVar.S(g(str), true);
        return true;
    }
}
