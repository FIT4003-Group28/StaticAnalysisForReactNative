package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aeef  reason: default package */
/* loaded from: classes2.dex */
public final class aeef implements bzml {
    public final dxio<bzmm> a;
    private final dxio<aedv> b;
    private final cjnf c;
    private final dxio<cjqq> d;
    private final Activity e;
    private final dbty<Boolean> f;

    public aeef(dxio<aedv> dxioVar, cjnf cjnfVar, dxio<bzmm> dxioVar2, dxio<cjqq> dxioVar3, gga ggaVar, final acyr acyrVar, final btvo btvoVar) {
        this.b = dxioVar;
        this.c = cjnfVar;
        this.a = dxioVar2;
        this.d = dxioVar3;
        this.e = ggaVar;
        this.f = dbud.a(new dbty(acyrVar, btvoVar) { // from class: aeed
            private final acyr a;
            private final btvo b;

            {
                this.a = acyrVar;
                this.b = btvoVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                acyr acyrVar2 = this.a;
                btvo btvoVar2 = this.b;
                boolean z = false;
                if (acyrVar2.f()) {
                    dktt dkttVar = btvoVar2.getPassiveAssistParameters().a().am;
                    if (dkttVar == null) {
                        dkttVar = dktt.z;
                    }
                    if (dkttVar.d) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.COMMUTE_TAB_TOOLTIP;
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
        return this.f.a().booleanValue() && this.b.a().f() == dktk.EXPLORE;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        if (this.a.a().d(dqkc.COMMUTE_TAB_TOOLTIP) == 0) {
            return bzmk.VISIBLE;
        }
        return bzmk.NONE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        cjta b = cjtd.b();
        b.d = dtxl.aZ;
        if (bzmkVar != bzmk.VISIBLE) {
            if (bzmkVar != bzmk.REPRESSED) {
                return false;
            }
            cjqp g = this.d.a().g();
            b.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
            g.d(b.a());
            return true;
        }
        View findViewById = this.e.findViewById(R.id.commute_tab_strip_button);
        if (findViewById == null) {
            return false;
        }
        cjnf cjnfVar = this.c;
        cjnd i = cjne.i();
        i.d(findViewById);
        i.c(R.string.COMMUTE_TAB_TOOLTIP_PROMO_TEXT);
        ((cjnb) i).c = new Runnable(this) { // from class: aeee
            private final aeef a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.a().f(dqkc.COMMUTE_TAB_TOOLTIP);
            }
        };
        i.b(true);
        cjnfVar.a(i.a());
        this.d.a().g().d(b.a());
        return true;
    }
}
