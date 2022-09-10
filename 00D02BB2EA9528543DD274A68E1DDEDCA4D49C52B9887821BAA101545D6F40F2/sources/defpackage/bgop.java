package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bgop  reason: default package */
/* loaded from: classes3.dex */
public class bgop implements bgno {
    public final ilo a;
    public final bgng b;
    public final dxio<apup> c;
    private final Activity d;
    @dzsi
    private final dipk e;
    private final cjtd f;
    private final cjtd g;
    private final jic h;
    private final bhhf i;
    @dzsi
    private final dxio<bwft> j;
    private final dxio<apuq> k;
    private int l;
    private final bwfs m = bgok.a;

    public bgop(Activity activity, bgng bgngVar, bhhf bhhfVar, dxio<apup> dxioVar, dxio<apuq> dxioVar2, dxio<bwft> dxioVar3, @dzsi dipk dipkVar, ilo iloVar, int i, bgnk bgnkVar) {
        cjtd a;
        this.d = activity;
        this.b = bgngVar;
        this.i = bhhfVar;
        this.c = dxioVar;
        this.k = dxioVar2;
        this.j = dxioVar3;
        this.e = dipkVar;
        this.a = iloVar;
        this.l = i;
        this.h = new jic(iloVar.cP(), ckqc.FIFE, 2131232060);
        cjta c = cjtd.c(iloVar.bZ());
        c.d = dtxy.mX;
        if (dipkVar != null) {
            c.g(dipkVar.q);
        }
        this.f = c.a();
        ddho ddhoVar = dtxy.jC;
        ddho ddhoVar2 = dtxu.aE;
        ddho ddhoVar3 = dtxu.ba;
        int ordinal = bgnkVar.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                ddhoVar = ddhoVar2;
            } else if (ordinal != 3) {
                a = cjtd.b;
                this.g = a;
            } else {
                ddhoVar = ddhoVar3;
            }
        }
        cjta cjtaVar = new cjta();
        cjtaVar.d = ddhoVar;
        if (dipkVar != null) {
            cjtaVar.g(dipkVar.q);
            bgnf.a(cjtaVar, dipkVar);
            a = cjtaVar.a();
        } else {
            a = cjtaVar.a();
        }
        this.g = a;
    }

    private final jho l(int i, View.OnClickListener onClickListener, ddho ddhoVar) {
        return m(i, onClickListener, this.i.e(this.a, ddhoVar));
    }

    private final jho m(int i, View.OnClickListener onClickListener, cjtd cjtdVar) {
        jhm jhmVar = new jhm();
        jhmVar.l = i;
        jhmVar.a = this.d.getText(i);
        jhmVar.d(onClickListener);
        jhmVar.f = cjtdVar;
        return jhmVar.c();
    }

    @Override // defpackage.bgno
    public String a() {
        return this.a.n();
    }

    @Override // defpackage.bgno
    @dzsi
    public String b() {
        return this.a.cP();
    }

    @Override // defpackage.bgno
    @dzsi
    public CharSequence c() {
        dipk dipkVar = this.e;
        if (dipkVar != null) {
            return dipkVar.j;
        }
        return null;
    }

    @Override // defpackage.bgno
    public jic d() {
        return this.h;
    }

    @Override // defpackage.bgno
    public jht e() {
        int a;
        int a2;
        jhu h = jhv.h();
        final dipk dipkVar = this.e;
        if (dipkVar != null) {
            boolean z = false;
            jhi jhiVar = (jhi) h;
            jhiVar.e = this.d.getString(R.string.OPTIONS_FOR_POST, new Object[]{Integer.valueOf(this.l + 1)});
            int a3 = dgce.a(dipkVar.f);
            if (a3 != 0 && a3 != 1 && ((a2 = dgce.a(dipkVar.f)) == 0 || a2 != 7)) {
                z = true;
            }
            if (!this.i.h(bwrs.a(this.a)) || !z || ((a = dgby.a(dipkVar.t)) != 0 && a == 2)) {
                if (this.i.g(bwrs.a(this.a))) {
                    h.d(l(R.string.DELETE_POST, new View.OnClickListener(this, dipkVar) { // from class: bgon
                        private final bgop a;
                        private final dipk b;

                        {
                            this.a = this;
                            this.b = dipkVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            bgop bgopVar = this.a;
                            bgopVar.k(bgopVar.a, this.b);
                        }
                    }, dtxv.cF));
                } else {
                    dioz diozVar = dipkVar.n;
                    if (diozVar == null) {
                        diozVar = dioz.d;
                    }
                    if ((diozVar.a & 1) != 0) {
                        h.d(m(R.string.REPORT_POST, new View.OnClickListener(this, dipkVar) { // from class: bgoo
                            private final bgop a;
                            private final dipk b;

                            {
                                this.a = this;
                                this.b = dipkVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                bgop bgopVar = this.a;
                                bgopVar.b.a(this.b);
                            }
                        }, this.f));
                    }
                }
            } else {
                h.e(dcdc.g(l(R.string.EDIT_POST, new View.OnClickListener(this, dipkVar) { // from class: bgol
                    private final bgop a;
                    private final dipk b;

                    {
                        this.a = this;
                        this.b = dipkVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        bgop bgopVar = this.a;
                        dipk dipkVar2 = this.b;
                        bgopVar.c.a().f(bwrs.a(bgopVar.a), dipkVar2);
                    }
                }, dtxv.cG), l(R.string.DELETE_POST, new View.OnClickListener(this, dipkVar) { // from class: bgom
                    private final bgop a;
                    private final dipk b;

                    {
                        this.a = this;
                        this.b = dipkVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        bgop bgopVar = this.a;
                        bgopVar.k(bgopVar.a, this.b);
                    }
                }, dtxv.cF)));
            }
            return jhiVar.b();
        }
        return ((jhi) h).b();
    }

    @Override // defpackage.bgno
    public void f(int i) {
        this.l = i;
    }

    @Override // defpackage.bgno
    public CharSequence g() {
        return this.d.getText(R.string.LOCAL_POSTS_CAROUSEL_COVID_HEADER);
    }

    @Override // defpackage.bgno
    public cqkl h() {
        dxio<bwft> dxioVar = this.j;
        if (this.e != null) {
            dxioVar.a().f(a(), this.e, this.g.g, this.m);
        }
        return cqkl.a;
    }

    @Override // defpackage.bgno
    public cjtd i() {
        return this.g;
    }

    @Override // defpackage.bgno
    public String j() {
        int i = this.l;
        if (i == -1) {
            return this.d.getString(R.string.SHARE_POST_CONTENT_DESCRIPTION);
        }
        return this.d.getString(R.string.SHARE_CONTENT_DESCRIPTION, new Object[]{Integer.valueOf(i + 1)});
    }

    public final void k(ilo iloVar, dipk dipkVar) {
        this.k.a().e(iloVar, dipkVar);
    }
}
