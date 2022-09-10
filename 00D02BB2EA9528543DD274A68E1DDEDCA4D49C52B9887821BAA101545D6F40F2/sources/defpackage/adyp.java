package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: adyp  reason: default package */
/* loaded from: classes2.dex */
public abstract class adyp extends aczs implements advs {
    public static final ddho g = dtxr.bC;
    private final View.OnAttachStateChangeListener a;
    private final abfa b;
    private final gga c;
    private final isd d;
    private final ania e;
    private final String f;
    public final cklf h;
    public final dxio<ache> i;
    public final dxio<bwft> j;
    public final dxio<bsvm> k;
    public final dehq l;
    public final dspd m;
    public final btlu n;
    public boolean o;
    public boolean p;
    private int q = -1;

    /* JADX INFO: Access modifiers changed from: protected */
    public adyp(adyo adyoVar, View.OnAttachStateChangeListener onAttachStateChangeListener, String str, dspd dspdVar, btlu btluVar) {
        this.o = false;
        this.p = false;
        cqhn cqhnVar = adyoVar.a;
        this.b = adyoVar.b;
        this.c = adyoVar.c;
        this.d = adyoVar.d;
        this.h = adyoVar.e;
        this.e = adyoVar.f;
        this.i = adyoVar.g;
        this.j = adyoVar.h;
        this.k = adyoVar.i;
        this.l = adyoVar.j;
        this.f = str;
        this.m = dspdVar;
        this.n = btlu.q(btluVar);
        this.a = onAttachStateChangeListener;
        this.o = adyoVar.b.x();
        this.p = adyoVar.b.x();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static cjta W(String str, int i) {
        cjta b = cjtd.b();
        b.g(str);
        b.i(i);
        return b;
    }

    public String A() {
        return this.f;
    }

    public jbj B() {
        return null;
    }

    @Override // defpackage.advs
    public View.OnAttachStateChangeListener C() {
        return this.a;
    }

    public void D() {
    }

    @Override // defpackage.advs
    public Boolean E() {
        return true;
    }

    @Override // defpackage.advs
    public String F() {
        return this.c.getResources().getString(R.string.YOUR_EXPLORE_ACCESSIBILITY_OVERFLOW_MENU_BUTTON, a());
    }

    @Override // defpackage.advs
    public cqkl G(View view) {
        isc a = this.d.a(view);
        ArrayList arrayList = new ArrayList();
        final dqhj Q = Q();
        if (Q != null) {
            jhm a2 = jhm.a();
            a2.a = this.c.getString(R.string.SHARE);
            a2.f = cjtd.a(dtxr.bC);
            a2.d(new View.OnClickListener(this, Q) { // from class: adyj
                private final adyp a;
                private final dqhj b;

                {
                    this.a = this;
                    this.b = Q;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    adyp adypVar = this.a;
                    adypVar.j.a().h(this.b, adyp.g);
                }
            });
            arrayList.add(a2.c());
        }
        if (this.n.l() && this.b.a.getPassiveAssistParameters().q().c && this.e.a()) {
            jhm a3 = jhm.a();
            a3.a = this.c.getString(R.string.EXPLORE_PREFERENCES_SETTINGS_LANDING_PAGE_ENTRY_POINT_TEXT);
            a3.f = cjtd.a(dtxr.bz);
            a3.d(new View.OnClickListener(this) { // from class: adyk
                private final adyp a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.a.k.a().t();
                }
            });
            arrayList.add(a3.c());
        }
        jhm a4 = jhm.a();
        a4.a = this.c.getString(R.string.SEND_FEEDBACK);
        a4.f = cjtd.b;
        a4.d(new View.OnClickListener(this) { // from class: adyl
            private final adyp a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte[] G;
                String sb;
                final adyp adypVar = this.a;
                ddxx c = cjrx.c(adypVar.e().d);
                dspd dspdVar = adypVar.m;
                if (dspdVar == null) {
                    sb = null;
                } else {
                    StringBuilder sb2 = new StringBuilder(dspdVar.c());
                    for (byte b : dspdVar.G()) {
                        if (b < 32 || b > 126) {
                            sb2.append(String.format("\\%03o", Byte.valueOf(b)));
                        } else {
                            sb2.append((char) b);
                        }
                    }
                    sb = sb2.toString();
                }
                acgz b2 = achb.b();
                b2.c("YourExploreItemType", (c == null || (c.a & 8) == 0) ? "<n/a>" : Integer.toString(c.d));
                if (sb == null) {
                    sb = "<n/a>";
                }
                b2.c("YourExploreItemId", sb);
                bvqj.e(deha.a(b2.b()), new bvqg(adypVar) { // from class: adyn
                    private final adyp a;

                    {
                        this.a = adypVar;
                    }

                    @Override // defpackage.bvqg
                    public final void NU(Object obj) {
                        this.a.i.a().k(false, true, achc.YOUR_EXPLORE_CARD, (achb) obj);
                    }
                }, adypVar.l);
            }
        });
        arrayList.add(a4.c());
        jhm a5 = jhm.a();
        a5.a = this.c.getString(R.string.LEARN_MORE);
        a5.f = cjtd.b;
        a5.d(new View.OnClickListener(this) { // from class: adym
            private final adyp a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.h.a("exploretab");
            }
        });
        arrayList.add(a5.c());
        arrayList.addAll(R());
        a.a(arrayList);
        a.show();
        return cqkl.a;
    }

    public cqkl H() {
        return cqkl.a;
    }

    public jad I() {
        return null;
    }

    public cqkl J() {
        return cqkl.a;
    }

    public cqkl K() {
        return cqkl.a;
    }

    @Override // defpackage.advs
    public void L(int i) {
        this.q = i;
    }

    @Override // defpackage.advs
    public String M() {
        String str = "";
        if (this.q == -1) {
            return str;
        }
        String valueOf = String.valueOf(this.c.getResources().getString(R.string.YOUR_EXPLORE_ACCESSIBILTIY_FEED_POST_NUMBER, Integer.valueOf(V().intValue() + 1)));
        if (!Pe().isEmpty()) {
            String valueOf2 = String.valueOf(Pe());
            str = valueOf2.length() != 0 ? ", ".concat(valueOf2) : new String(", ");
        }
        String valueOf3 = String.valueOf(str);
        return valueOf3.length() != 0 ? valueOf.concat(valueOf3) : new String(valueOf);
    }

    public cjtd N(ddho ddhoVar) {
        return cjtd.b;
    }

    protected jic O() {
        return null;
    }

    protected jic P() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String Pe() {
        return !A().isEmpty() ? this.c.getResources().getString(R.string.YOUR_EXPLORE_ACCESSIBILITY_POSTED_TIMESTAMP, A()) : "";
    }

    protected dqhj Q() {
        return null;
    }

    protected List<jho> R() {
        return dcdc.e();
    }

    public Integer V() {
        return Integer.valueOf(this.q);
    }

    public CharSequence a() {
        return "";
    }

    public CharSequence b() {
        return "";
    }

    public String c() {
        return "";
    }

    public cqkl f() {
        return cqkl.a;
    }

    public cjtd g() {
        return cjtd.b;
    }

    public cjtd h() {
        return cjtd.b;
    }

    public String j() {
        return this.c.getResources().getString(R.string.YOUR_EXPLORE_ACCESSIBILITY_CLICK_ACTION_VIEW_PROFILE);
    }

    @Override // defpackage.advs
    public final jic k() {
        if (!this.o) {
            return null;
        }
        return O();
    }

    @Override // defpackage.advs
    public cqfd l() {
        return new cqfd(this) { // from class: adyh
            private final adyp a;

            {
                this.a = this;
            }

            @Override // defpackage.cqfd
            public final boolean a(View view) {
                adyp adypVar = this.a;
                if (!adypVar.o) {
                    adypVar.o = true;
                    cqkx.p(adypVar);
                }
                return true;
            }
        };
    }

    public Boolean m() {
        return false;
    }

    public advr n() {
        return null;
    }

    public CharSequence o() {
        return "";
    }

    public CharSequence p() {
        return "";
    }

    @Override // defpackage.advs
    public final jic q() {
        if (!this.p) {
            return null;
        }
        return P();
    }

    public Boolean r() {
        return true;
    }

    public String s() {
        return "";
    }

    @Override // defpackage.advs
    public cqfd t() {
        return new cqfd(this) { // from class: adyi
            private final adyp a;

            {
                this.a = this;
            }

            @Override // defpackage.cqfd
            public final boolean a(View view) {
                adyp adypVar = this.a;
                if (!adypVar.p) {
                    adypVar.p = true;
                    cqkx.p(adypVar);
                }
                return true;
            }
        };
    }

    public int u() {
        return cpnx.a;
    }

    public cqkl v() {
        return cqkl.a;
    }

    public cjtd w() {
        return cjtd.b;
    }

    public cjtd x() {
        return cjtd.b;
    }

    @Override // defpackage.advs
    public String y() {
        return this.c.getResources().getString(R.string.YOUR_EXPLORE_ACCESSIBILITY_CLICK_ACTION_OPEN_POST);
    }

    public advi z() {
        return null;
    }
}
