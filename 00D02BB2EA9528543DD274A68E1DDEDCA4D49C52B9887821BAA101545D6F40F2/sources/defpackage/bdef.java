package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: bdef  reason: default package */
/* loaded from: classes3.dex */
class bdef implements bdat {
    final /* synthetic */ bdej a;

    public bdef(bdej bdejVar) {
        this.a = bdejVar;
    }

    @Override // defpackage.jbk
    public jib NC() {
        final bdad h;
        jhz jhzVar = new jhz();
        jhzVar.a = this.a.f();
        jhzVar.x = false;
        jhzVar.q = cqta.f();
        jhzVar.g = ibl.b();
        jhzVar.f(new View.OnClickListener(this) { // from class: bdee
            private final bdef a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.f.onBackPressed();
            }
        });
        if (this.a.i.q()) {
            jhzVar.z = 1;
        } else {
            jhzVar.z = 2;
        }
        int u = this.a.i.u();
        if (u != 0) {
            if (u == 2) {
                jhzVar.i = cqrt.g(2131231591, ibm.b());
                jhzVar.j = cqrt.l(R.string.PHOTO_ACCESSIBILITY_NAVIGATION_CLOSE_BUTTON_CONTENT_DESCRIPTION);
            }
            if (this.a.i.r().a() && (h = h()) != null && h.a().booleanValue()) {
                jhm jhmVar = new jhm();
                jhmVar.h = 2;
                jhmVar.c = cqrt.f(2131231861);
                jhmVar.a = h.e();
                jhmVar.b = h.e();
                jhmVar.f = h.o();
                jhmVar.d(new View.OnClickListener(h) { // from class: bdeb
                    private final bdad a;

                    {
                        this.a = h;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.i();
                    }
                });
                jhzVar.c(jhmVar.c());
            }
            bdej bdejVar = this.a;
            final dwfl e = bdejVar.h.e(bdejVar.e().intValue());
            if (e != null && this.a.i.i()) {
                dizh dizhVar = e.p;
                if (dizhVar == null) {
                    dizhVar = dizh.j;
                }
                if ((dizhVar.a & 1) != 0) {
                    final bdej bdejVar2 = this.a;
                    jhm jhmVar2 = new jhm();
                    jhmVar2.h = 1;
                    jhmVar2.c = cqrt.f(2131231625);
                    jhmVar2.a = bdejVar2.f.getString(R.string.REPORT_A_PROBLEM);
                    jhmVar2.b = bdejVar2.f.getString(R.string.REPORT_A_PROBLEM);
                    jhmVar2.f = cjtd.a(dtxy.fr);
                    jhmVar2.d(new View.OnClickListener(bdejVar2, e) { // from class: bdea
                        private final bdej a;
                        private final dwfl b;

                        {
                            this.a = bdejVar2;
                            this.b = e;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            bdej bdejVar3 = this.a;
                            bdejVar3.k.a(this.b);
                        }
                    });
                    jhzVar.c(jhmVar2.c());
                }
            }
            if (this.a.i.e()) {
                bdej bdejVar3 = this.a;
                jhm jhmVar3 = new jhm();
                jhmVar3.a = bdejVar3.f.getResources().getString(R.string.DONE);
                jhmVar3.h = 2;
                jhmVar3.b = bdejVar3.f.getResources().getString(R.string.DONE);
                jhmVar3.d(new bdeg(bdejVar3));
                jhmVar3.f = cjtd.a(dtxy.cr);
                jhzVar.c(jhmVar3.c());
            }
            if (this.a.i.d()) {
                bdej bdejVar4 = this.a;
                jhm jhmVar4 = new jhm();
                jhmVar4.c = cqrt.f(2131232600);
                jhmVar4.h = 2;
                jhmVar4.a = bdejVar4.f.getString(R.string.DELETE_BUTTON);
                jhmVar4.b = bdejVar4.f.getString(R.string.DELETE_BUTTON);
                jhmVar4.f = cjtd.a(dtxy.fo);
                jhmVar4.d(new bdeh(bdejVar4));
                jhzVar.c(jhmVar4.c());
            }
            if (this.a.i.f()) {
                bdej bdejVar5 = this.a;
                jhm jhmVar5 = new jhm();
                jhmVar5.h = 0;
                jhmVar5.a = bdejVar5.f.getResources().getString(R.string.HIDE_FROM_TIMELINE_MENU);
                jhmVar5.b = bdejVar5.f.getResources().getString(R.string.HIDE_FROM_TIMELINE_MENU);
                jhmVar5.d(new bdei(bdejVar5));
                jhzVar.c(jhmVar5.c());
            }
            if (this.a.i.g()) {
                final bdej bdejVar6 = this.a;
                jhm jhmVar6 = new jhm();
                jhmVar6.h = 0;
                jhmVar6.a = bdejVar6.f.getResources().getString(R.string.MARK_AS_NOT_A_RECEIPT_MENU);
                jhmVar6.b = bdejVar6.f.getResources().getString(R.string.MARK_AS_NOT_A_RECEIPT_MENU);
                jhmVar6.f = cjtd.a(dtyi.aB);
                jhmVar6.n = !bdejVar6.n;
                jhmVar6.d(new View.OnClickListener(bdejVar6) { // from class: bdec
                    private final bdej a;

                    {
                        this.a = bdejVar6;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        bdej bdejVar7 = this.a;
                        bdejVar7.n = true;
                        cqkx.p(bdejVar7);
                        bcrq bcrqVar = bdejVar7.j;
                        bcqr bcqrVar = (bcqr) bcrqVar;
                        dwfl e2 = bcqrVar.a.e(bdejVar7.e().intValue());
                        dbsk.s(e2);
                        bcqrVar.b.Qn(anhd.c(e2));
                    }
                });
                jhzVar.c(jhmVar6.c());
            }
            if (this.a.i.h() && e != null) {
                dizh dizhVar2 = e.p;
                if (dizhVar2 == null) {
                    dizhVar2 = dizh.j;
                }
                diis diisVar = dizhVar2.g;
                if (diisVar == null) {
                    diisVar = diis.h;
                }
                Iterator<T> it = new dsrh(diisVar.c, diis.d).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((diiu) it.next()) == diiu.MAYBE_RECEIPT) {
                            final bdej bdejVar7 = this.a;
                            jhm jhmVar7 = new jhm();
                            jhmVar7.h = 0;
                            jhmVar7.a = bdejVar7.f.getResources().getString(R.string.MARK_AS_A_RECEIPT_MENU);
                            jhmVar7.b = bdejVar7.f.getResources().getString(R.string.MARK_AS_A_RECEIPT_MENU);
                            jhmVar7.f = cjtd.a(dtyi.aC);
                            jhmVar7.n = !bdejVar7.n;
                            jhmVar7.d(new View.OnClickListener(bdejVar7) { // from class: bded
                                private final bdej a;

                                {
                                    this.a = bdejVar7;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    bdej bdejVar8 = this.a;
                                    bdejVar8.n = true;
                                    cqkx.p(bdejVar8);
                                    bcrq bcrqVar = bdejVar8.j;
                                    bcqr bcqrVar = (bcqr) bcrqVar;
                                    dwfl e2 = bcqrVar.a.e(bdejVar8.e().intValue());
                                    dbsk.s(e2);
                                    bcqrVar.c.a().s(e2, bcqrVar.b);
                                }
                            });
                            jhzVar.c(jhmVar7.c());
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            return jhzVar.b();
        }
        throw null;
    }

    @Override // defpackage.bdat
    public Boolean b() {
        return Boolean.valueOf(this.a.i.p());
    }

    @Override // defpackage.bdat
    public Boolean c() {
        bdej bdejVar = this.a;
        dwfl e = bdejVar.h.e(bdejVar.e().intValue());
        boolean z = false;
        if (e == null || (e.a & 4) == 0) {
            return false;
        }
        Boolean o = this.a.h.o(e.d);
        if (o != null && o.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bdat
    public String d() {
        bdej bdejVar = this.a;
        if (bdejVar.g != null) {
            return bdejVar.f.getString(true != c().booleanValue() ? R.string.TODO_PHOTO_ACCESSIBILITY_SELECT_PHOTO_WITH_PLACE : R.string.TODO_PHOTO_ACCESSIBILITY_UNSELECT_PHOTO_WITH_PLACE, new Object[]{Integer.valueOf(this.a.e().intValue() + 1), this.a.g.n()});
        }
        return bdejVar.f.getString(true != c().booleanValue() ? R.string.TODO_PHOTO_ACCESSIBILITY_SELECT_PHOTO : R.string.TODO_PHOTO_ACCESSIBILITY_UNSELECT_PHOTO, new Object[]{Integer.valueOf(this.a.e().intValue() + 1)});
    }

    @Override // defpackage.bdat
    public cjtd e() {
        cjta b = cjtd.b();
        b.d = dtxy.cH;
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = c().booleanValue() ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        bdej bdejVar = this.a;
        dwfl e = bdejVar.h.e(bdejVar.e().intValue());
        if (e != null) {
            b.b = e.b;
            b.g(e.c);
        }
        return b.a();
    }

    @Override // defpackage.bdat
    public cqkl f() {
        Boolean o;
        bdej bdejVar = this.a;
        dwfl e = bdejVar.h.e(bdejVar.e().intValue());
        if (e != null && (o = this.a.h.o(e.d)) != null) {
            this.a.h.n(e.d, !o.booleanValue());
            cqkx.p(this);
            return cqkl.a;
        }
        return cqkl.a;
    }

    @Override // defpackage.bdat
    @dzsi
    public bdax g() {
        int intValue = this.a.e().intValue();
        dwfl e = this.a.h.e(intValue);
        if (e != null) {
            dqjc dqjcVar = e.s;
            if (dqjcVar == null) {
                dqjcVar = dqjc.d;
            }
            if ((dqjcVar.a & 1) == 0) {
                return null;
            }
            return this.a.l.a(e, intValue);
        }
        return null;
    }

    @dzsi
    public bdad h() {
        bdej bdejVar = this.a;
        dwfl e = bdejVar.h.e(bdejVar.e().intValue());
        if (e == null) {
            return null;
        }
        bdej bdejVar2 = this.a;
        return bdejVar2.m.a(bdejVar2.i.r(), e, this.a.g);
    }
}
