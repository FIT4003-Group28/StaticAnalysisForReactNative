package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aotw  reason: default package */
/* loaded from: classes2.dex */
public class aotw {
    private static final dcqe l = dcqe.c("aotw");
    public final Activity a;
    public final aoub b;
    public final dzsj<akox> c;
    public final dzsj<gll> d;
    public final View h;
    public final View i;
    private final dzsj<hwe> m;
    private final View.OnLayoutChangeListener o = new aotq(this);
    public final List<aopw> g = new ArrayList();
    public final aots e = new aots(this);
    public final akzy f = new aotr(this);
    private final aotv n = new aotv(this);
    public boolean j = false;
    public dbsg<akqq> k = dbpy.a;

    public aotw(Activity activity, aoub aoubVar, dzsj<akox> dzsjVar, dzsj<hwe> dzsjVar2, dzsj<gll> dzsjVar3) {
        this.a = activity;
        this.b = aoubVar;
        this.c = dzsjVar;
        this.m = dzsjVar2;
        this.d = dzsjVar3;
        View inflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(R.layout.floating_pin_layout, (ViewGroup) null);
        this.h = inflate;
        this.i = inflate.findViewById(R.id.floating_pin_anchor);
    }

    public final boolean a(akqq akqqVar) {
        akqq aj;
        if (!this.k.a() || !akqq.v(this.k.b(), akqqVar, 1.0d)) {
            this.k = dbsg.i(akqqVar);
            for (aopw aopwVar : this.g) {
                aoqb aoqbVar = aopwVar.a;
                if (!aoqbVar.a.s().a() || (aj = aoqbVar.a.s().b().aj()) == null || !akqq.v(akqqVar, aj, 1.0d)) {
                    aoqbVar.d = dcdc.e();
                    aoqbVar.b.a(akqqVar, new aopx(aoqbVar));
                    cqkx.p(aoqbVar);
                }
            }
            return true;
        }
        return false;
    }

    public final void b() {
        this.h.addOnLayoutChangeListener(this.o);
        cjxu.o(this.h, true);
    }

    public final void c() {
        cjxu.o(this.h, false);
        this.h.removeOnLayoutChangeListener(this.o);
    }

    public final void d(boolean z) {
        if (!this.k.a()) {
            bvoo.h("showFixedPin called while location is absent", new Object[0]);
        } else {
            this.m.a().i(akpp.o(this.k.b()), z);
        }
    }

    public final void e() {
        this.m.a().h();
    }

    public final void f() {
        alad n;
        if (this.j && this.k.a()) {
            aoub aoubVar = this.b;
            if ((aoubVar.a.a().L() == jjn.FULLY_EXPANDED && !aoubVar.b()) || (n = this.c.a().n()) == null) {
                return;
            }
            akyc j = akyt.j(this.k.b(), n.k, this.d.a().b());
            j.b = 250;
            this.c.a().q(j, this.n);
        }
    }
}
