package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: byjq  reason: default package */
/* loaded from: classes4.dex */
public class byjq implements byii {
    @dzsi
    private final byjp a;
    private final Context b;
    private final dxio<akfa> c;
    private final dxio<axwy> d;
    private final bvjj e;
    private final cqat f;
    @dzsi
    private azva g;
    @dzsi
    private azva h;
    private final boolean i;

    public byjq(Activity activity, cqhn cqhnVar, dxio<akfa> dxioVar, dxio<axwq> dxioVar2, dxio<axwy> dxioVar3, bvjj bvjjVar, cqat cqatVar, @dzsi byjp byjpVar) {
        this.a = byjpVar;
        this.b = activity;
        this.c = dxioVar;
        this.d = dxioVar3;
        this.e = bvjjVar;
        this.f = cqatVar;
        if (!k() || dxioVar2.a().d()) {
            this.i = true;
            dcdc<azva> n = dxioVar2.a().n();
            int size = n.size();
            for (int i = 0; i < size; i++) {
                azva azvaVar = n.get(i);
                if (azvaVar.a.equals(dndr.HOME)) {
                    this.g = azvaVar;
                } else if (azvaVar.a.equals(dndr.WORK)) {
                    this.h = azvaVar;
                }
            }
            return;
        }
        this.i = false;
    }

    private final boolean k() {
        return this.c.a().j().l();
    }

    @Override // defpackage.byii
    public byih a() {
        if (this.c.a().d()) {
            return byih.INVISIBLE;
        }
        if (this.e.w(bvjk.dd, -1L) == -1 && (f().booleanValue() || g().booleanValue())) {
            if (this.e.w(bvjk.de, -1L) == -1) {
                this.e.Z(bvjk.de, this.e.w(bvjk.db, 0L));
            }
            if (this.e.w(bvjk.db, 0L) - this.e.w(bvjk.de, 0L) >= 4 || this.b.getResources().getConfiguration().orientation == 2) {
                return byih.VISIBLE_MIDDLE;
            }
            return byih.VISIBLE_TOP;
        }
        return byih.INVISIBLE;
    }

    @Override // defpackage.byii
    public String b() {
        if (!f().booleanValue() || !g().booleanValue()) {
            if (f().booleanValue()) {
                return this.b.getResources().getString(R.string.TRAFFIC_HUB_ADD_HOME_WORK_PROMO_HOME_TITLE);
            }
            return this.b.getResources().getString(R.string.TRAFFIC_HUB_ADD_HOME_WORK_PROMO_WORK_TITLE);
        }
        return this.b.getResources().getString(R.string.TRAFFIC_HUB_ADD_HOME_WORK_PROMO_HOME_AND_WORK_TITLE);
    }

    @Override // defpackage.byii
    public String c() {
        int i = 1;
        if (f().booleanValue() && g().booleanValue()) {
            i = 2;
        }
        return this.b.getResources().getQuantityString(R.plurals.TRAFFIC_HUB_ADD_HOME_WORK_PROMO_SUBTITLE, i);
    }

    @Override // defpackage.byii
    public String d() {
        return this.b.getResources().getString(R.string.TRAFFIC_HUB_ADD_HOME_WORK_PROMO_ADD_HOME);
    }

    @Override // defpackage.byii
    public String e() {
        return this.b.getResources().getString(R.string.TRAFFIC_HUB_ADD_HOME_WORK_PROMO_ADD_WORK);
    }

    @Override // defpackage.byii
    public Boolean f() {
        boolean z = false;
        if (this.i && this.g == null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.byii
    public Boolean g() {
        boolean z = false;
        if (this.i && this.h == null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.byii
    public cqkl h() {
        this.e.Z(bvjk.dd, this.f.b());
        cqkx.p(this);
        cqkx.p(((byki) this.a).a);
        return cqkl.a;
    }

    @Override // defpackage.byii
    public cqkl i(dndr dndrVar) {
        if (k()) {
            axwv n = axww.n();
            n.b(dndrVar);
            ((axvv) n).d = new byjo(this);
            this.d.a().L(n.h());
        } else {
            this.d.a().o();
        }
        return cqkl.a;
    }

    public void j(azva azvaVar) {
        if (azvaVar.a.equals(dndr.HOME)) {
            this.g = azvaVar;
        } else if (azvaVar.a.equals(dndr.WORK)) {
            this.h = azvaVar;
        }
        cqkx.p(this);
    }
}
