package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: arly  reason: default package */
/* loaded from: classes2.dex */
public final class arly implements bzml {
    public final dxio<bzmm> a;
    @dzsi
    public View b;
    @dzsi
    public View c;
    @dzsi
    public jmb d;
    private final jlp e;
    private final Activity f;
    private final dbsg<arkb> g;

    public arly(jlp jlpVar, dxio<bzmm> dxioVar, gga ggaVar, dbsg<arkb> dbsgVar) {
        this.e = jlpVar;
        this.a = dxioVar;
        this.f = ggaVar;
        this.g = dbsgVar;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.ARWN_ONE_DIRECTION_START_BUTTON_PROMO;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.HIGH;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        View view = this.c;
        if (view == null) {
            return false;
        }
        return this.d == null || view != this.b;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        dbsk.l(this.g.a());
        int d = this.a.a().d(dqkc.ARWN_ONE_DIRECTION_START_BUTTON_PROMO);
        if (d < 4 && (!this.g.b().b().a().c || d < 2)) {
            return bzmk.VISIBLE;
        }
        return bzmk.NONE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        if (bzmkVar != bzmk.VISIBLE) {
            return false;
        }
        jmb jmbVar = this.d;
        if (jmbVar != null) {
            jmbVar.a();
        }
        int a = jmj.a(this.f, -4);
        jlp jlpVar = this.e;
        String string = this.f.getString(R.string.ARWN_ONE_DIRECTION_START_BUTTON_PROMO_TEXT);
        View view = this.c;
        dbsk.s(view);
        jlo a2 = jlpVar.a(string, view);
        a2.i();
        a2.o(true);
        a2.e(new Runnable(this) { // from class: arlx
            private final arly a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                arly arlyVar = this.a;
                arlyVar.d = null;
                arlyVar.b = null;
                arlyVar.a.a().f(dqkc.ARWN_ONE_DIRECTION_START_BUTTON_PROMO);
            }
        }, dege.a);
        a2.p();
        a2.b(a);
        a2.r();
        a2.t(jln.GM2_BLUE);
        this.d = a2.a();
        this.b = this.c;
        return true;
    }
}
