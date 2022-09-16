package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: abfn  reason: default package */
/* loaded from: classes2.dex */
public final class abfn implements bzml {
    public final dxio<bzmm> a;
    @dzsi
    public View b;
    @dzsi
    public bwrs<ilo> c;
    private final Activity d;
    private final jlp e;
    private final dxio<cjqq> f;
    private final dxio<abfa> g;

    public abfn(Activity activity, jlp jlpVar, dxio<bzmm> dxioVar, dxio<cjqq> dxioVar2, dxio<abfa> dxioVar3) {
        this.d = activity;
        this.e = jlpVar;
        this.a = dxioVar;
        this.f = dxioVar2;
        this.g = dxioVar3;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.AREA_EXPLORE_TOOLTIP;
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
        if (this.b != null && this.c != null && this.g.a().a()) {
            bwrs<ilo> bwrsVar = this.c;
            dbsk.s(bwrsVar);
            ilo c = bwrsVar.c();
            if (c != null && c.o) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        if (this.a.a().d(dqkc.AREA_EXPLORE_TOOLTIP) == 0) {
            return bzmk.VISIBLE;
        }
        return bzmk.NONE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        if (this.b == null || this.c == null) {
            return false;
        }
        cjta b = cjtd.b();
        b.d = dtxj.dc;
        cjqp g = this.f.a().g();
        if (bzmkVar == bzmk.VISIBLE) {
            jlp jlpVar = this.e;
            String string = this.d.getString(R.string.AREA_EXPLORE_TUTORIAL_TOOLTIP);
            View view = this.b;
            dbsk.s(view);
            jlo a = jlpVar.a(string, view);
            a.t(jln.GM2_BLUE);
            a.s(0.65f);
            a.j();
            a.z();
            a.v();
            a.o(true);
            a.e(new Runnable(this) { // from class: abfm
                private final abfn a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    abfn abfnVar = this.a;
                    abfnVar.a.a().f(dqkc.AREA_EXPLORE_TOOLTIP);
                    abfnVar.c = null;
                    abfnVar.b = null;
                }
            }, dege.a);
            a.p();
            a.a();
            g.d(b.a());
        } else if (bzmkVar == bzmk.REPRESSED) {
            b.w(ddhj.f);
            g.d(b.a());
        }
        return true;
    }
}
