package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: astx  reason: default package */
/* loaded from: classes2.dex */
public class astx implements asus {
    @dzsi
    private final asub a;
    @dzsi
    private final astu b;
    @dzsi
    private final asuh c;
    @dzsi
    private final jar d;
    @dzsi
    private final asuk e;
    @dzsi
    private final akfa f;
    private final btvo g;
    @dzsi
    private View i;
    @dzsi
    private egk j;
    @dzsi
    private dqvj k;
    @dzsi
    private asld l;
    private boolean h = false;
    private boolean m = false;
    private boolean n = false;

    public astx(@dzsi asub asubVar, @dzsi astu astuVar, @dzsi asuh asuhVar, @dzsi jar jarVar, @dzsi asuk asukVar, @dzsi dqvj dqvjVar, @dzsi asld asldVar, @dzsi akfa akfaVar, btvo btvoVar, cqhn cqhnVar, boolean z) {
        this.a = asubVar;
        this.b = astuVar;
        this.c = asuhVar;
        this.d = jarVar;
        this.e = asukVar;
        this.k = dqvjVar;
        this.l = asldVar;
        this.f = akfaVar;
        this.g = btvoVar;
    }

    @Override // defpackage.asus
    @dzsi
    /* renamed from: a */
    public astu v() {
        return this.b;
    }

    @Override // defpackage.asus
    @dzsi
    /* renamed from: b */
    public asuk u() {
        return this.e;
    }

    @Override // defpackage.asus
    @dzsi
    /* renamed from: c */
    public asuh t() {
        return this.c;
    }

    @Override // defpackage.asus
    @dzsi
    public jar d() {
        return this.d;
    }

    @Override // defpackage.asus
    public Boolean e() {
        return Boolean.valueOf(this.b != null);
    }

    @Override // defpackage.asus
    public Boolean f() {
        boolean z = false;
        if (this.e != null && !k().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.asus
    public Boolean g() {
        return false;
    }

    @Override // defpackage.asus
    public Boolean h() {
        boolean z = false;
        if (this.c != null && !auej.c(this.g).isEmpty() && auej.e(this.f) && this.k != dqvj.WALK && !k().booleanValue() && this.l != asld.OVERVIEW) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public void i(asld asldVar) {
        asld asldVar2 = this.l;
        this.l = asldVar;
        if (asldVar != asldVar2) {
            cqkx.p(this);
        }
    }

    @Override // defpackage.asus
    public Boolean j() {
        boolean z = false;
        if (this.d != null && !k().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public Boolean k() {
        return Boolean.valueOf(this.n);
    }

    @Override // defpackage.asus
    public Boolean l() {
        astu astuVar = this.b;
        boolean z = false;
        if (astuVar != null && astuVar.k().i().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public void m(astb astbVar) {
        this.n = astbVar != astb.NO_SEARCH;
    }

    public void n(boolean z) {
        if (this.h != z) {
            this.h = z;
            asub asubVar = this.a;
            if (asubVar != null) {
                asubVar.g(z);
            }
            astu astuVar = this.b;
            if (astuVar != null) {
                astuVar.O(z);
            }
            asuk asukVar = this.e;
            if (asukVar != null) {
                asukVar.g(z);
            }
            jar jarVar = this.d;
            if (jarVar instanceof arxt) {
                ((arxt) jarVar).l(z);
            }
            asuh asuhVar = this.c;
            if (asuhVar == null) {
                return;
            }
            asuhVar.g(z);
        }
    }

    public void o(@dzsi egk egkVar, Context context) {
        egk egkVar2 = this.j;
        if (egkVar2 != null) {
            egkVar2.a(null);
        }
        this.j = egkVar;
        egkVar.a(this.i);
        egkVar.c = context.getResources().getDimensionPixelSize(R.dimen.nav_compass_end_padding);
    }

    public void p(dqvj dqvjVar) {
        if (this.k == dqvjVar) {
            return;
        }
        this.k = dqvjVar;
        astu astuVar = this.b;
        if (astuVar != null) {
            astuVar.j(dqvjVar);
        }
        cqkx.p(this);
    }

    @Override // defpackage.asus
    public void q(@dzsi View view) {
        this.i = view;
        egk egkVar = this.j;
        if (egkVar != null) {
            egkVar.a(view);
        }
    }

    @Override // defpackage.asus
    public void r(boolean z) {
        this.m = z;
    }

    @Override // defpackage.asus
    public Boolean s() {
        return Boolean.valueOf(this.m);
    }
}
