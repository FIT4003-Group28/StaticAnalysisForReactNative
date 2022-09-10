package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: dsz  reason: default package */
/* loaded from: classes6.dex */
final class dsz implements bzml {
    public final dxio<bzmm> a;
    public final dqkc b;
    private final jlp c;
    private final Activity d;
    private final cpv e;

    public dsz(jlp jlpVar, dxio<bzmm> dxioVar, gga ggaVar, cpv cpvVar, dqkc dqkcVar) {
        this.c = jlpVar;
        this.a = dxioVar;
        this.d = ggaVar;
        this.e = cpvVar;
        this.b = dqkcVar;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return this.b;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.LOW;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        return !this.e.e(this.d);
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        if (this.a.a().d(this.b) < 2) {
            return bzmk.VISIBLE;
        }
        return bzmk.NONE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        final View findViewById;
        if (bzmkVar == bzmk.VISIBLE && (findViewById = this.d.findViewById(R.id.ar_view_action_button_container)) != null) {
            jlo a = this.c.a(this.d.getString(R.string.AR_LIGHTHOUSE_FAB_TOOLTIP_TEXT), findViewById);
            a.i();
            a.o(true);
            a.e(new Runnable(this) { // from class: dsx
                private final dsz a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dsz dszVar = this.a;
                    dszVar.a.a().f(dszVar.b);
                }
            }, dege.a);
            a.c(new dbty(findViewById) { // from class: dsy
                private final View a;

                {
                    this.a = findViewById;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    return Boolean.valueOf(this.a.getAlpha() == 1.0f);
                }
            });
            a.p();
            a.x();
            a.t(jln.GM2_BLUE);
            a.a();
            return true;
        }
        return false;
    }
}
