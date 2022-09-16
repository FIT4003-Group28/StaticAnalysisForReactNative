package defpackage;

import android.support.v4.widget.NestedScrollView;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ccyk  reason: default package */
/* loaded from: classes4.dex */
public class ccyk implements View.OnLayoutChangeListener, ccxb {
    private final ff b;
    private ccwb c = ccyb.a;
    public String a = "";
    private String d = "";
    private int i = 1;
    @dzsi
    private dgfg e = null;
    private ccyh f = ccyd.a;
    private ccyi g = ccye.a;
    private ccyj h = ccyf.a;

    public ccyk(cqhn cqhnVar, ff ffVar, ccrh ccrhVar) {
        this.b = ffVar;
    }

    private final dgfb I() {
        if (!this.c.equals(ccyb.a)) {
            ccwb ccwbVar = this.c;
            dgfb b = dgfb.b(ccwbVar.b.get(ccwbVar.c).b);
            return b == null ? dgfb.UNKNOWN_OFFERING_TYPE : b;
        }
        return dgfb.UNKNOWN_OFFERING_TYPE;
    }

    public void A(ccyi ccyiVar) {
        this.g = ccyiVar;
    }

    public void B(ccyj ccyjVar) {
        this.h = ccyjVar;
    }

    public void C(ccwb ccwbVar) {
        this.c = ccwbVar;
        ccwk ccwkVar = ccwbVar.e;
        if (ccwkVar == null) {
            ccwkVar = ccwk.m;
        }
        this.a = ccwkVar.f;
        ccwk ccwkVar2 = ccwbVar.e;
        if (ccwkVar2 == null) {
            ccwkVar2 = ccwk.m;
        }
        dgfg dgfgVar = ccwkVar2.l;
        if (dgfgVar == null) {
            dgfgVar = dgfg.d;
        }
        this.e = dgfgVar;
        ccwk ccwkVar3 = ccwbVar.e;
        if (ccwkVar3 == null) {
            ccwkVar3 = ccwk.m;
        }
        int a = draz.a(ccwkVar3.h);
        if (a == 0) {
            a = 1;
        }
        this.i = a;
        ccwk ccwkVar4 = ccwbVar.e;
        if (ccwkVar4 == null) {
            ccwkVar4 = ccwk.m;
        }
        this.d = ccwkVar4.i;
    }

    public ccwk D(ccwk ccwkVar) {
        dsqp dsqpVar = (dsqp) ccwkVar.cu(5);
        dsqpVar.bC(ccwkVar);
        ccwj ccwjVar = (ccwj) dsqpVar;
        String str = this.a;
        if (ccwjVar.c) {
            ccwjVar.bF();
            ccwjVar.c = false;
        }
        ccwk ccwkVar2 = (ccwk) ccwjVar.b;
        ccwk ccwkVar3 = ccwk.m;
        str.getClass();
        int i = ccwkVar2.a | 4;
        ccwkVar2.a = i;
        ccwkVar2.f = str;
        int i2 = this.i;
        int i3 = i2 - 1;
        if (i2 != 0) {
            ccwkVar2.h = i3;
            int i4 = i | 16;
            ccwkVar2.a = i4;
            String str2 = this.d;
            str2.getClass();
            int i5 = i4 | 32;
            ccwkVar2.a = i5;
            ccwkVar2.i = str2;
            dgfg dgfgVar = this.e;
            if (dgfgVar != null) {
                dgfgVar.getClass();
                ccwkVar2.l = dgfgVar;
                ccwkVar2.a = i5 | 256;
            }
            int i6 = this.a.isEmpty() ? 2 : 3;
            if (ccwjVar.c) {
                ccwjVar.bF();
                ccwjVar.c = false;
            }
            ccwk ccwkVar4 = (ccwk) ccwjVar.b;
            ccwkVar4.k = i6 - 1;
            ccwkVar4.a |= 128;
            return ccwjVar.bK();
        }
        throw null;
    }

    public Boolean E() {
        return Boolean.valueOf(H() != ccvz.UNKNOWN);
    }

    public String F() {
        return this.d;
    }

    public void G(String str, dgfg dgfgVar) {
        if (a().booleanValue()) {
            this.a = str;
            this.e = dgfgVar;
            cqkx.p(this);
        }
    }

    public final ccvz H() {
        if (!this.c.equals(ccyb.a)) {
            ccwb ccwbVar = this.c;
            int i = ccwbVar.c;
            return ccwi.e.a(Integer.valueOf(ccwbVar.b.get(i).d.f(this.c.d)));
        }
        return ccvz.UNKNOWN;
    }

    @Override // defpackage.ccxb
    public Boolean a() {
        boolean z = true;
        if (H() != ccvz.OFFERING_NAME && H() != ccvz.OFFERING_NAME_WITH_SUGGEST) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ccxb
    public Boolean b() {
        return Boolean.valueOf(H() == ccvz.OFFERING_NAME_WITH_SUGGEST);
    }

    @Override // defpackage.ccxb
    public Boolean c() {
        return Boolean.valueOf(H() == ccvz.OFFERING_RECOMMENDATION);
    }

    @Override // defpackage.ccxb
    public Boolean d() {
        dgfb dgfbVar = dgfb.UNKNOWN_OFFERING_TYPE;
        ccvz ccvzVar = ccvz.UNKNOWN;
        int ordinal = H().ordinal();
        if (ordinal != 1) {
            if (ordinal == 3) {
                return Boolean.valueOf(F().isEmpty());
            }
            if (ordinal != 4) {
                return false;
            }
        }
        return Boolean.valueOf(k().isEmpty());
    }

    @Override // defpackage.ccxb
    public Boolean e() {
        dgfb dgfbVar = dgfb.UNKNOWN_OFFERING_TYPE;
        ccvz ccvzVar = ccvz.UNKNOWN;
        int ordinal = H().ordinal();
        if (ordinal != 1) {
            if (ordinal == 3) {
                return Boolean.valueOf(!F().isEmpty());
            }
            if (ordinal != 4) {
                return false;
            }
        }
        return Boolean.valueOf(!k().isEmpty());
    }

    @Override // defpackage.ccxb
    public Boolean f() {
        boolean z = false;
        if (H() == ccvz.OFFERING_NAME || H() == ccvz.OFFERING_NAME_WITH_SUGGEST) {
            return false;
        }
        if (E().booleanValue() && !k().isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ccxb
    public String g() {
        dgfb dgfbVar = dgfb.UNKNOWN_OFFERING_TYPE;
        ccvz ccvzVar = ccvz.UNKNOWN;
        int ordinal = H().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return this.b.getString(R.string.OFFERING_ANNOTATION_WOULD_YOU_RECOMMEND_IT);
            }
            if (ordinal == 3) {
                return this.b.getString(R.string.OFFERING_ANNOTATION_HOW_MUCH_WAS_IT);
            }
            if (ordinal != 4) {
                return "";
            }
        }
        int ordinal2 = I().ordinal();
        if (ordinal2 != 1) {
            if (ordinal2 == 2) {
                return this.b.getString(R.string.OFFERING_ANNOTATION_WHATS_IN_THIS_PHOTO_PRODUCT);
            }
            return ordinal2 != 3 ? "" : this.b.getString(R.string.OFFERING_ANNOTATION_WHATS_IN_THIS_PHOTO_ACTIVITY);
        }
        return this.b.getString(R.string.OFFERING_ANNOTATION_WHATS_IN_THIS_PHOTO_DISH);
    }

    @Override // defpackage.ccxb
    public Integer h() {
        if (!a().booleanValue()) {
            return c().booleanValue() ? 3 : 0;
        }
        dgfb dgfbVar = dgfb.UNKNOWN_OFFERING_TYPE;
        ccvz ccvzVar = ccvz.UNKNOWN;
        int ordinal = I().ordinal();
        if (ordinal == 1) {
            return 4;
        }
        if (ordinal == 2) {
            return 2;
        }
        return ordinal != 3 ? 0 : 1;
    }

    @Override // defpackage.ccxb
    public String i() {
        dgfb dgfbVar = dgfb.UNKNOWN_OFFERING_TYPE;
        ccvz ccvzVar = ccvz.UNKNOWN;
        int ordinal = H().ordinal();
        if (ordinal == 1 || ordinal == 4) {
            int ordinal2 = I().ordinal();
            if (ordinal2 == 1) {
                return this.b.getString(R.string.OFFERING_ANNOTATION_SKIP_DISH_BUTTON);
            }
            if (ordinal2 == 2) {
                return this.b.getString(R.string.OFFERING_ANNOTATION_SKIP_PRODUCT_BUTTON);
            }
            return ordinal2 != 3 ? "" : this.b.getString(R.string.OFFERING_ANNOTATION_SKIP_ACTIVITY_BUTTON);
        }
        return this.b.getString(R.string.OFFERING_ANNOTATION_SKIP_GENERIC_BUTTON);
    }

    @Override // defpackage.ccxb
    public String j() {
        return this.b.getString(R.string.OFFERING_ANNOTATION_DONE_BUTTON);
    }

    @Override // defpackage.ccxb
    public String k() {
        return this.a;
    }

    @Override // defpackage.ccxb
    public String l() {
        dgfb dgfbVar = dgfb.UNKNOWN_OFFERING_TYPE;
        ccvz ccvzVar = ccvz.UNKNOWN;
        int ordinal = I().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return this.b.getString(R.string.OFFERING_ANNOTATION_NAME_PRODUCT_HINT);
            }
            return ordinal != 3 ? "" : this.b.getString(R.string.OFFERING_ANNOTATION_NAME_ACTIVITY_HINT);
        }
        return this.b.getString(R.string.OFFERING_DISH_NAME_ENTRY_HINT);
    }

    @Override // defpackage.ccxb
    @dzsi
    public String m() {
        if (!e().booleanValue()) {
            return null;
        }
        dgfb dgfbVar = dgfb.UNKNOWN_OFFERING_TYPE;
        ccvz ccvzVar = ccvz.UNKNOWN;
        int ordinal = H().ordinal();
        if (ordinal != 1 && ordinal != 4) {
            return null;
        }
        return this.b.getString(R.string.POSTING_PUBLICLY);
    }

    @Override // defpackage.ccxb
    public String n() {
        return this.b.getString(R.string.OFFERING_ANNOTATION_YES_BUTTON);
    }

    @Override // defpackage.ccxb
    public String o() {
        return this.b.getString(R.string.OFFERING_ANNOTATION_NO_BUTTON);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View o = cqkx.o(this);
        if (o != null && jmw.c(this.b)) {
            NestedScrollView nestedScrollView = (NestedScrollView) cqkx.e(o, ccnk.a, NestedScrollView.class);
            nestedScrollView.scrollTo(0, nestedScrollView.getChildAt(0).getHeight() - nestedScrollView.getHeight());
        }
    }

    @Override // defpackage.ccxb
    public jic p() {
        String str;
        if (this.c.equals(ccyb.a)) {
            str = null;
        } else {
            ccwb ccwbVar = this.c;
            str = ccwbVar.b.get(ccwbVar.c).f;
        }
        return new jic(str, ckqc.FULLY_QUALIFIED, irg.f(), 0);
    }

    @Override // defpackage.ccxb
    public View.OnLayoutChangeListener q() {
        return this;
    }

    @Override // defpackage.ccxb
    public cqkl r() {
        if (d().booleanValue()) {
            this.h.a();
        }
        return cqkl.a;
    }

    @Override // defpackage.ccxb
    public cqkl s() {
        if (e().booleanValue()) {
            this.f.a();
        }
        return cqkl.a;
    }

    @Override // defpackage.ccxb
    public cqgl t() {
        return new cqgl(this) { // from class: ccyg
            private final ccyk a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                ccyk ccykVar = this.a;
                if (ccykVar.H() == ccvz.OFFERING_NAME) {
                    String str = ccykVar.a;
                    ccykVar.a = charSequence.toString();
                    if (!str.isEmpty() && charSequence.length() != 0) {
                        return;
                    }
                    cqkx.p(ccykVar);
                }
            }
        };
    }

    @Override // defpackage.ccxb
    public cqkl u() {
        String str;
        if (H() == ccvz.OFFERING_NAME_WITH_SUGGEST) {
            ccyi ccyiVar = this.g;
            dgfb I = I();
            String str2 = this.a;
            if (!this.c.equals(ccyb.a)) {
                ccwb ccwbVar = this.c;
                str = ccwbVar.b.get(ccwbVar.c).f;
            } else {
                str = null;
            }
            this.c.equals(ccyb.a);
            ccwb ccwbVar2 = this.c;
            ccxa ccxaVar = ccwbVar2.b.get(ccwbVar2.c).c;
            if (ccxaVar == null) {
                ccxaVar = ccxa.f;
            }
            ccyiVar.a(I, str2, str, ccxaVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.ccxb
    public cqkl v() {
        if (c().booleanValue()) {
            this.i = 2;
            this.f.a();
        }
        return cqkl.a;
    }

    @Override // defpackage.ccxb
    public cqkl w() {
        if (c().booleanValue()) {
            this.i = 3;
            this.f.a();
        }
        return cqkl.a;
    }

    @Override // defpackage.ccxb
    public cjtd x() {
        ccvz H = H();
        if (ccrh.a.containsKey(H)) {
            return ccrh.a.get(H);
        }
        return cjtd.b;
    }

    @Override // defpackage.ccxb
    public cjtd y() {
        ccvz H = H();
        dgfb I = I();
        ccvz ccvzVar = ccvz.UNKNOWN;
        int ordinal = H.ordinal();
        if (ordinal == 1 || ordinal == 4) {
            if (ccrh.c.containsKey(I)) {
                return ccrh.c.get(I);
            }
        } else if (ccrh.b.containsKey(H)) {
            return ccrh.b.get(H);
        }
        return cjtd.b;
    }

    public void z(ccyh ccyhVar) {
        this.f = ccyhVar;
    }
}
