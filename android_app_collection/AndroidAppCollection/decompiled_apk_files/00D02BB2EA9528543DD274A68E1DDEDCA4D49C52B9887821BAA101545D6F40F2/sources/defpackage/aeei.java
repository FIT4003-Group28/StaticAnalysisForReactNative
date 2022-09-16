package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aeei  reason: default package */
/* loaded from: classes2.dex */
public final class aeei implements bzml {
    public final dxio<bzmm> a;
    private final dxio<aedv> b;
    private final jlp c;
    private final dxio<cjqq> d;
    private final Activity e;
    private final bvjj f;
    private final dbty<dkuk> g;

    public aeei(dxio<aedv> dxioVar, jlp jlpVar, dxio<bzmm> dxioVar2, dxio<cjqq> dxioVar3, gga ggaVar, final btvo btvoVar, bvjj bvjjVar) {
        this.b = dxioVar;
        this.c = jlpVar;
        this.a = dxioVar2;
        this.d = dxioVar3;
        this.e = ggaVar;
        this.f = bvjjVar;
        this.g = dbud.a(new dbty(btvoVar) { // from class: aeeg
            private final btvo a;

            {
                this.a = btvoVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                for (dkuk dkukVar : this.a.getPassiveAssistParameters().a().ai) {
                    int a = dkuj.a(dkukVar.b);
                    if (a != 0 && a == 6) {
                        return dkukVar;
                    }
                }
                return dkuk.e;
            }
        });
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.HOME_SCREEN_TAB_BUTTON_TOOLTIP;
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
        dktk f = this.b.a().f();
        dkuk a = this.g.a();
        if (a.c <= 0) {
            return false;
        }
        dkuf dkufVar = a.d;
        if (dkufVar == null) {
            dkufVar = dkuf.d;
        }
        for (dkuh dkuhVar : dkufVar.b) {
            dktk b = dktk.b(dkuhVar.a);
            if (b == null) {
                b = dktk.UNKNOWN_ASSISTIVE_TAB_TYPE;
                continue;
            }
            if (b == f) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        if (this.g.a().c <= this.f.s(bvjk.gn, 0)) {
            return bzmk.NONE;
        }
        return bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        View findViewById;
        dkuk a = this.g.a();
        if (bzmkVar != bzmk.NONE) {
            dkuf dkufVar = a.d;
            if (dkufVar == null) {
                dkufVar = dkuf.d;
            }
            ddho d = cjth.d(dkufVar.c);
            cjta b = cjtd.b();
            b.d = d;
            if (bzmkVar != bzmk.REPRESSED) {
                dkuf dkufVar2 = a.d;
                if (dkufVar2 == null) {
                    dkufVar2 = dkuf.d;
                }
                String str = dkufVar2.a;
                if (dbsj.d(str)) {
                    return false;
                }
                dktk b2 = dktk.b(a.a);
                if (b2 == null) {
                    b2 = dktk.UNKNOWN_ASSISTIVE_TAB_TYPE;
                }
                int ordinal = b2.ordinal();
                if (ordinal == 1) {
                    findViewById = this.e.findViewById(R.id.explore_tab_strip_button);
                } else if (ordinal == 4) {
                    findViewById = this.e.findViewById(R.id.feed_tab_strip_button);
                } else {
                    findViewById = ordinal != 5 ? null : this.e.findViewById(R.id.commute_tab_strip_button);
                }
                if (findViewById == null) {
                    return false;
                }
                int a2 = jmj.a(this.e, -4);
                jlo a3 = this.c.a(str, findViewById);
                a3.i();
                a3.o(true);
                a3.e(new Runnable(this) { // from class: aeeh
                    private final aeei a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a.a().f(dqkc.HOME_SCREEN_TAB_BUTTON_TOOLTIP);
                    }
                }, dege.a);
                a3.p();
                a3.b(a2);
                a3.t(jln.GM2_BLUE);
                a3.a();
                this.d.a().g().d(b.a());
                this.f.W(bvjk.gn, a.c);
                return true;
            }
            cjqp g = this.d.a().g();
            b.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
            g.d(b.a());
            return true;
        }
        return false;
    }
}
