package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cwlg  reason: default package */
/* loaded from: classes5.dex */
public final class cwlg implements View.OnAttachStateChangeListener {
    final /* synthetic */ cwlh a;
    private final View b;
    private final int c;
    private final cvxj d;
    private final cvzm e = new cvzm(this) { // from class: cwld
        private final cwlg a;

        {
            this.a = this;
        }

        @Override // defpackage.cvzm
        public final void a(boolean z) {
            cwlg cwlgVar = this.a;
            cwlgVar.a(cwlgVar.a.c.e());
        }
    };

    public cwlg(cwlh cwlhVar, View view, int i) {
        this.a = cwlhVar;
        this.b = view;
        this.c = i;
        this.d = new cwlf(this, view);
    }

    private final void b(cwko cwkoVar) {
        this.b.setTag(R.id.view_bound_account_tag, cwkoVar);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.c.i(this.d);
        cvzn cvznVar = this.a.a;
        if (cvznVar != null) {
            cvznVar.b(this.e);
        }
        cvzg cvzgVar = this.a.c;
        if (cvzgVar.a) {
            this.d.a(cvzgVar.e());
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.c.k(this.d);
        cvzn cvznVar = this.a.a;
        if (cvznVar != null) {
            cvznVar.c(this.e);
        }
    }

    public final void a(Object obj) {
        CharSequence b;
        cwko c;
        cvzn cvznVar = this.a.a;
        if (cvznVar != null && cvznVar.a) {
            c = new cwkp(4, null);
        } else if (obj != null) {
            cwfn.f(obj);
            b = ((cwfm) obj).b();
            if (b != null) {
                String charSequence = b.toString();
                if (charSequence.contains("@")) {
                    dbsk.s(charSequence);
                    c = new cwkp(1, charSequence);
                }
            }
            c = cwko.c();
        } else {
            c = cwko.c();
        }
        cwko cwkoVar = (cwko) this.b.getTag(R.id.view_bound_account_tag);
        if (cwkoVar == null) {
            this.a.b.a().b.a(this.c).b(c.b()).b(cwkq.a).d(this.b);
            b(c);
        } else if (cwkoVar.equals(c)) {
        } else {
            final cshj a = this.a.b.a();
            final View view = this.b;
            int i = this.c;
            csgt a2 = cshd.a(view);
            dbsk.t(a2, "No CVE to swap.");
            dbsk.b(a2.c.c(), "CVE is not a root node.");
            new cshi(a2.b.a()).a(a2);
            a2.c.d(cshh.a);
            czhz.b();
            csgt a3 = cshd.a(view);
            dbsk.s(a3);
            a3.f();
            csgo b2 = new csgo(csgs.a(i), new dbrn(a, view) { // from class: cshg
                private final cshj a;
                private final View b;

                {
                    this.a = a;
                    this.b = view;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj2) {
                    View view2 = this.b;
                    csgt csgtVar = (csgt) obj2;
                    csgt a4 = cshd.a(view2);
                    if (a4 != null) {
                        if (a4.d()) {
                            if (a4.e()) {
                                new IllegalStateException("CVE is already impressed and cannot be replaced.");
                                cshu.d();
                            } else {
                                new IllegalStateException("CVE is already attached and cannot be replaced.");
                                cshu.d();
                            }
                        } else {
                            a4.c(csgtVar);
                        }
                        return a4;
                    }
                    cshd cshdVar = new cshd(view2, csgtVar);
                    csgtVar.c = cshdVar;
                    cshdVar.e();
                    return csgtVar;
                }
            }, a.a).b(c.b()).b(cwkq.a);
            b2.a.a(b2.c());
            b(c);
        }
    }
}
