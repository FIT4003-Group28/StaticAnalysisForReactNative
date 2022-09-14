package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: afov  reason: default package */
/* loaded from: classes2.dex */
public final class afov implements bzml {
    public final dxio<bzmm> a;
    public View b;
    private final cjnf c;
    private final btvo d;
    private final bvjj e;

    public afov(cjnf cjnfVar, dxio<bzmm> dxioVar, btvo btvoVar, bvjj bvjjVar) {
        this.c = cjnfVar;
        this.a = dxioVar;
        this.d = btvoVar;
        this.e = bvjjVar;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.COVID19_LAYER_TOOLTIP;
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
        return this.d.getMapLayersParameters().d && this.b != null;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        if (this.a.a().d(dqkc.COVID19_LAYER_TOOLTIP) >= 5 || this.e.m(bvjk.gl, false) || this.e.m(bvjk.gm, false)) {
            return bzmk.NONE;
        }
        return bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        View view;
        View a;
        if (bzmkVar != bzmk.VISIBLE || (view = this.b) == null || (a = cqhu.a(view, gwu.b)) == null) {
            return false;
        }
        cjnf cjnfVar = this.c;
        cjnd i = cjne.i();
        i.d(a);
        i.c(R.string.COVID19_LAYER_TOOLTIP_PROMO);
        cjnb cjnbVar = (cjnb) i;
        cjnbVar.b = cjtd.a(dtxu.o);
        cjnbVar.c = new Runnable(this) { // from class: afou
            private final afov a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.a().f(dqkc.COVID19_LAYER_TOOLTIP);
            }
        };
        i.b(true);
        cjnfVar.a(i.a());
        return true;
    }
}
