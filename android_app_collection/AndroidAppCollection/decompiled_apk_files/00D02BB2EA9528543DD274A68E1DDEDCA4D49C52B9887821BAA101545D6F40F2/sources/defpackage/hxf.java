package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.base.mod.components.appbar.ModAppBar;
/* compiled from: PG */
/* renamed from: hxf  reason: default package */
/* loaded from: classes6.dex */
public abstract class hxf extends ges {
    private static final dcqe b = dcqe.c("hxf");
    public jib a = null;

    public final void aJ() {
        Bundle bundle = (Bundle) dbsg.j(this.o).e(hxd.a);
        bundle.putBoolean("ModAppBarFragment_scrollable", false);
        B(bundle);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ae(Activity activity) {
        super.ae(activity);
        q(g());
    }

    @Override // defpackage.fd
    public View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        hxg hxgVar = new hxg(J(), ((Boolean) dbsg.j(this.o).h(hxe.a).c(true)).booleanValue());
        hxgVar.setToolbarProperties(this.a);
        hxgVar.setContentView(i(layoutInflater, bundle));
        return hxgVar;
    }

    protected abstract jib g();

    protected abstract View i(LayoutInflater layoutInflater, Bundle bundle);

    public final void q(jib jibVar) {
        this.a = jibVar;
        hxg hxgVar = (hxg) this.P;
        if (hxgVar != null) {
            hxgVar.setToolbarProperties(jibVar);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public void s() {
        super.s();
        dbsg<ModAppBar> w = w();
        if (w.a()) {
            ModAppBar b2 = w.b();
            if (!b2.m.a()) {
                return;
            }
            b2.n.a().g().d(b2.g, b2.o);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public void u() {
        super.u();
        dbsg<ModAppBar> w = w();
        if (w.a()) {
            ModAppBar b2 = w.b();
            if (!b2.m.a()) {
                return;
            }
            b2.n.a().g().c(b2.g);
        }
    }

    public final dbsg<ModAppBar> w() {
        View view = this.P;
        if (view == null) {
            bvoo.h("AppBar unavailable until after onCreateView (e.g. in onStart)", new Object[0]);
        }
        return view instanceof hxg ? dbsg.i(((hxg) view).a) : dbpy.a;
    }
}
