package defpackage;

import android.content.ActivityNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.maps.R;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;
import com.google.commerce.tapandpay.android.seclient.GetSeCardBalanceResponse;
/* compiled from: PG */
/* renamed from: xgw  reason: default package */
/* loaded from: classes7.dex */
public abstract class xgw implements xgv, crzp {
    protected final xfc a;
    protected final xfd b;
    protected final xgu c;
    protected xfb d;
    private final gga e;
    private final bvjj f;
    private final dxio<afha> g;
    private final dxio<xfa> h;
    private final xgx i;

    public xgw(dxio<xfa> dxioVar, gga ggaVar, cqhn cqhnVar, bvjj bvjjVar, dxio<afha> dxioVar2, xgu xguVar, xfc xfcVar, xfd xfdVar, btvo btvoVar, ckcw ckcwVar) {
        this.e = ggaVar;
        this.f = bvjjVar;
        this.g = dxioVar2;
        this.c = xguVar;
        this.a = xfcVar;
        this.b = xfdVar;
        this.h = dxioVar;
        this.i = new xgx(ckcwVar);
    }

    private final boolean A() {
        GetAllCardsResponse getAllCardsResponse = this.d.c;
        return (getAllCardsResponse == null || getAllCardsResponse.c == null) ? false : true;
    }

    private final void B() {
        CharSequence c = this.a.c();
        String d = this.a.d();
        xfa a = this.h.a();
        diyj diyjVar = this.d.b.h;
        if (diyjVar == null) {
            diyjVar = diyj.i;
        }
        gga ggaVar = a.a;
        xgz xgzVar = new xgz();
        Bundle bundle = new Bundle();
        xgz.g(bundle, diyjVar, c, d);
        xgzVar.B(bundle);
        gei.a(ggaVar, xgzVar);
    }

    private final Boolean C() {
        return Boolean.valueOf(this.b.b(q().toString()));
    }

    private final void D(String str) {
        try {
            this.g.a().f(this.e, this.i.a(str), 4);
        } catch (ActivityNotFoundException unused) {
        }
    }

    private final boolean v() {
        return this.d.d() && this.d.e();
    }

    private final boolean w() {
        return this.d.d() && !q().isEmpty();
    }

    private final boolean x() {
        return this.d.d() && q().isEmpty();
    }

    private final boolean y() {
        return this.d.c();
    }

    private final boolean z() {
        if (!p()) {
            if (w() && !C().booleanValue()) {
                return true;
            }
            if (v() && !r().booleanValue()) {
                return true;
            }
            if (x() && !r().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xgv
    public Boolean b() {
        boolean z = true;
        if (!p() && !z()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.xgv
    public Boolean c() {
        boolean z = false;
        if (z() && this.f.s(bvjk.cO, 0) >= 2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.xgv
    public Boolean d() {
        boolean z = false;
        if (this.d.d() && !b().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.xgv
    public Boolean e() {
        return true;
    }

    @Override // defpackage.xgv
    public CharSequence f() {
        GetSeCardBalanceResponse getSeCardBalanceResponse;
        if (!p()) {
            if (this.d.f() && (getSeCardBalanceResponse = this.d.d) != null) {
                int i = getSeCardBalanceResponse.b;
                if (i == 0) {
                    throw null;
                }
                if (i == 8) {
                    return this.e.getResources().getString(R.string.TRANSIT_PAYMENTS_PROMO_TITLE_VIEW_SUICA_BALANCE);
                }
            }
            if (!this.d.b.i.isEmpty()) {
                return this.d.b.i;
            }
            if (!v() || r().booleanValue()) {
                return this.e.getResources().getString(R.string.TRANSIT_PAYMENTS_PROMO_TITLE);
            }
            return this.e.getResources().getString(R.string.TRANSIT_PAYMENTS_PROMO_TITLE_OPEN_LOOP);
        } else if (y()) {
            return this.e.getResources().getQuantityString(R.plurals.TRANSIT_PAYMENTS_PASSES_AVAILABLE_BANNER_TITLE, this.d.b.k.size(), Integer.valueOf(this.d.b.k.size()));
        } else {
            if (!this.d.f() || this.d.b() == null) {
                diid diidVar = this.d.b.b;
                if (diidVar == null) {
                    diidVar = diid.e;
                }
                return diidVar.b;
            }
            Resources resources = this.e.getResources();
            String b = this.d.b();
            dbsk.s(b);
            return resources.getString(R.string.TRANSIT_PAYMENTS_BALANCE_WITH_VALUE, b);
        }
    }

    @Override // defpackage.xgv
    public CharSequence g() {
        if (p()) {
            if (y()) {
                return this.e.getResources().getString(R.string.TRANSIT_PAYMENTS_PASSES_AVAILABLE_BANNER_SUBTITLE);
            }
            diid diidVar = this.d.b.b;
            if (diidVar == null) {
                diidVar = diid.e;
            }
            String str = diidVar.c;
            return !str.isEmpty() ? str : this.e.getResources().getString(R.string.TRANSIT_PAYMENTS_BALANCE_CAPTION);
        } else if (!this.d.b.j.isEmpty()) {
            return this.d.b.j;
        } else {
            if (w() && !C().booleanValue()) {
                return this.e.getResources().getString(R.string.TRANSIT_PAYMENTS_PROMO_SUB_TITLE, q());
            }
            if (!v()) {
                return "";
            }
            if (A()) {
                return this.e.getResources().getString(R.string.TRANSIT_PAYMENTS_PROMO_SUB_TITLE_OPEN_LOOP_READY);
            }
            return this.e.getResources().getString(R.string.TRANSIT_PAYMENTS_PROMO_SUB_TITLE_OPEN_LOOP_SETUP);
        }
    }

    @Override // defpackage.xgv
    public CharSequence h() {
        return w() ? this.e.getResources().getString(R.string.TRANSIT_PAYMENTS_PROMO_SUB_TITLE, q()) : v() ? this.e.getResources().getString(R.string.TRANSIT_PAYMENTS_PROMO_LINK_HOW_TO_PAY) : this.d.b.i;
    }

    @Override // defpackage.xgv
    @dzsi
    public jic i() {
        String str;
        if (p()) {
            if (y()) {
                dihv dihvVar = this.d.b.k.get(0).a;
                if (dihvVar == null) {
                    dihvVar = dihv.b;
                }
                str = dihvVar.a;
            } else {
                diid diidVar = this.d.b.b;
                if (diidVar == null) {
                    diidVar = diid.e;
                }
                dihv dihvVar2 = diidVar.d;
                if (dihvVar2 == null) {
                    dihvVar2 = dihv.b;
                }
                str = dihvVar2.a;
            }
        } else if (w() && !C().booleanValue()) {
            dihv dihvVar3 = this.d.b.d;
            if (dihvVar3 == null) {
                dihvVar3 = dihv.b;
            }
            str = dihvVar3.a;
        } else if (v()) {
            diyj diyjVar = this.d.b.h;
            if (diyjVar == null) {
                diyjVar = diyj.i;
            }
            dihv dihvVar4 = diyjVar.c;
            if (dihvVar4 == null) {
                dihvVar4 = dihv.b;
            }
            str = dihvVar4.a;
        } else if (x()) {
            dihv dihvVar5 = this.d.b.d;
            if (dihvVar5 == null) {
                dihvVar5 = dihv.b;
            }
            str = dihvVar5.a;
        } else {
            str = "";
        }
        return new jic(str, ckqc.FIFE_MERGE, 0);
    }

    @Override // defpackage.xgv
    public cqkl j() {
        dice diceVar = this.d.b;
        if (w()) {
            String str = diceVar.c;
            int i = diceVar.l;
            D(str);
        } else if (v()) {
            B();
        } else if (x()) {
            String str2 = diceVar.c;
            int i2 = diceVar.l;
            D(str2);
        }
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.xgv
    public cqkl k() {
        if (y()) {
            dice diceVar = this.d.b;
            gga ggaVar = this.h.a().a;
            xhl xhlVar = new xhl();
            Bundle bundle = new Bundle();
            xhl.g(bundle, diceVar);
            xhlVar.B(bundle);
            gei.a(ggaVar, xhlVar);
            return cqkl.a;
        } else if (p()) {
            dice diceVar2 = this.d.b;
            diid diidVar = diceVar2.b;
            if (diidVar == null) {
                diidVar = diid.e;
            }
            String str = diidVar.a;
            int i = diceVar2.l;
            D(str);
            return cqkl.a;
        } else if (z()) {
            dice diceVar3 = this.d.b;
            this.f.ao(bvjk.cO);
            if (!w() || C().booleanValue()) {
                if (v()) {
                    B();
                } else if (x()) {
                    String str2 = diceVar3.c;
                    int i2 = diceVar3.l;
                    D(str2);
                }
            } else {
                String str3 = diceVar3.c;
                int i3 = diceVar3.l;
                D(str3);
            }
            cqkx.p(this);
            return cqkl.a;
        } else {
            return cqkl.a;
        }
    }

    @Override // defpackage.xgv
    public cqkl l() {
        if (!w() || C().booleanValue()) {
            if (v() || x()) {
                s();
            }
        } else {
            this.b.a(q().toString());
        }
        this.c.a();
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.xgv
    @dzsi
    public cjtd m() {
        if (p() || A()) {
            return t(dtyc.dP);
        }
        return t(dtyc.dQ);
    }

    @Override // defpackage.xgv
    public cjtd o() {
        if (p() || A()) {
            return t(dtyc.dO);
        }
        return t(dtyc.dR);
    }

    public boolean p() {
        xfb xfbVar = this.d;
        return (xfbVar.a() && (xfbVar.b.a & 2) != 0) || y();
    }

    public String q() {
        return this.d.b.f;
    }

    public abstract Boolean r();

    public abstract void s();

    /* JADX INFO: Access modifiers changed from: protected */
    public final cjtd t(ddho ddhoVar) {
        cjta b = cjtd.b();
        b.d = ddhoVar;
        ddes bZ = ddet.D.bZ();
        ddgr u = u();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        u.getClass();
        ddetVar.w = u;
        ddetVar.a |= 536870912;
        b.s(bZ.bK());
        return b.a();
    }

    public abstract ddgr u();
}
