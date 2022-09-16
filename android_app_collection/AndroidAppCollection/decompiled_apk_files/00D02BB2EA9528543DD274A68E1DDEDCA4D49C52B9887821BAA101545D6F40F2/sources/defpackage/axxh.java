package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: axxh  reason: default package */
/* loaded from: classes.dex */
public final class axxh implements axxi {
    private final gga a;
    private final bvjj b;
    private final dxio<akfa> c;
    private final dxio<cqkj> d;
    private final dxio<ania> e;
    private final dxio<axwq> f;

    public axxh(gga ggaVar, bvjj bvjjVar, dxio<akfa> dxioVar, dxio<cqkj> dxioVar2, dxio<ania> dxioVar3, dxio<axwq> dxioVar4) {
        this.c = dxioVar;
        this.d = dxioVar2;
        this.a = ggaVar;
        this.b = bvjjVar;
        this.e = dxioVar3;
        this.f = dxioVar4;
    }

    @dzsi
    private final izs k() {
        View a;
        View findViewById = this.a.findViewById(R.id.search_omnibox_container);
        if (findViewById == null || (a = cqhu.a(findViewById, izs.d)) == null) {
            return null;
        }
        this.d.a();
        cqjz<?> g = cqjz.g(a);
        if (g != null) {
            V v = g.j;
            if (v instanceof izs) {
                return (izs) v;
            }
        }
        return null;
    }

    private final void l(boolean z) {
        this.b.T(bvjk.cd, this.c.a().j(), z);
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.HOME_WORK_SIDE_MENU_ATTENTION;
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
        return this.e.a().a();
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        if (!this.b.o(bvjk.cc, this.c.a().j(), false) && this.f.a().d()) {
            dcdc<azva> n = this.f.a().n();
            int size = n.size();
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < size; i++) {
                azva azvaVar = n.get(i);
                if (azvaVar.a.equals(dndr.HOME)) {
                    z2 = true;
                } else if (azvaVar.a.equals(dndr.WORK)) {
                    z = true;
                }
                if (!z2 || !z) {
                }
            }
            return bzmk.VISIBLE;
        }
        return bzmk.NONE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        if (bzmkVar != bzmk.REPRESSED && !j()) {
            izs k = k();
            if (k != null) {
                l(true);
                cqkx.p(k);
            }
            return j();
        }
        return false;
    }

    public final void g() {
        if (j()) {
            this.b.T(bvjk.cc, this.c.a().j(), true);
        }
    }

    @Override // defpackage.axxi
    public final void h() {
        izs k = k();
        if (k != null) {
            cqkx.p(k);
        }
    }

    @Override // defpackage.axxi
    public final boolean i() {
        return j();
    }

    public final boolean j() {
        boolean z = this.b.o(bvjk.cd, this.c.a().j(), false) && d() && e() == bzmk.VISIBLE;
        if (!z) {
            l(false);
        }
        return z;
    }
}
