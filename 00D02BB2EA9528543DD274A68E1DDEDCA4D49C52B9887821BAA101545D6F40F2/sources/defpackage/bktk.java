package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: bktk  reason: default package */
/* loaded from: classes3.dex */
public class bktk implements bkse, bktq {
    public final blhs d;
    public final gga e;
    public final dxio<begg> f;
    public bksd g;
    @dzsi
    public isc h;
    private final btvo j;
    private final jkf k;
    private final boolean l;
    private final isd m;
    private bwrs<ilo> n;
    @dzsi
    private cqkp o;
    @dzsi
    private cqjg p;
    private bksc q;
    private final int r;
    private final bksf s;
    private Integer t;
    private boolean u = false;
    private boolean v = false;
    public boolean i = false;
    private final View.OnFocusChangeListener w = new bkti(this);
    private final jkh x = new bktj(this);

    public bktk(blhs blhsVar, gga ggaVar, btvo btvoVar, cqhn cqhnVar, cqhu cqhuVar, dxio<begg> dxioVar, jkf jkfVar, isd isdVar, bktp bktpVar) {
        this.d = blhsVar;
        this.e = ggaVar;
        this.j = btvoVar;
        this.f = dxioVar;
        this.k = jkfVar;
        this.m = isdVar;
        this.l = btvoVar.getUgcParameters().ak();
        this.r = jmj.a(ggaVar, 16);
        bkts a = bktpVar.a.a();
        bktp.a(a, 1);
        bktp.a(blhsVar, 2);
        bktp.a(this, 3);
        this.s = new bkto(a, blhsVar, this);
    }

    @dzsi
    private final RecyclerView B() {
        for (View view : cqkx.n(z())) {
            cqjg cqjgVar = this.p;
            if (cqjgVar == null) {
                return null;
            }
            RecyclerView recyclerView = (RecyclerView) cqhu.a(view, cqjgVar);
            if (recyclerView != null) {
                return recyclerView;
            }
        }
        return null;
    }

    @dzsi
    private final EditText C() {
        for (View view : cqkx.n(this)) {
            EditText editText = (EditText) cqhu.a(view, bkse.b);
            if (editText != null) {
                return editText;
            }
        }
        return null;
    }

    @Override // defpackage.bktq
    public void A(blif blifVar) {
        cqkx.p(this);
    }

    @Override // defpackage.bkse
    public cqgl a() {
        return new cqgl(this) { // from class: bktd
            private final bktk a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                bktk bktkVar = this.a;
                boolean booleanValue = bktkVar.f().booleanValue();
                String charSequence2 = charSequence.toString();
                bktkVar.d.h(charSequence2, null, null, null);
                if (bktkVar.g == null || booleanValue || charSequence2.isEmpty()) {
                    return;
                }
                ((bksn) bktkVar.g).a.o();
            }
        };
    }

    @Override // defpackage.bkse
    public View.OnFocusChangeListener b() {
        return this.w;
    }

    @Override // defpackage.bkse
    public TextView.OnEditorActionListener c() {
        return new TextView.OnEditorActionListener(this) { // from class: bkte
            private final bktk a;

            {
                this.a = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                bktk bktkVar = this.a;
                if (i == 6) {
                    bktkVar.l(false);
                }
                return false;
            }
        };
    }

    @Override // defpackage.bkse
    public cqtc d() {
        RecyclerView B = B();
        if (B == null) {
            return cqrp.c(dcyn.a);
        }
        int i = B.getContext().getResources().getDisplayMetrics().widthPixels;
        int i2 = this.r;
        return cqrp.c(Math.max(0, i - (i2 + i2)));
    }

    @Override // defpackage.bkse
    public CharSequence e() {
        return this.d.d();
    }

    @Override // defpackage.bkse
    public Boolean f() {
        return Boolean.valueOf(!e().toString().isEmpty());
    }

    @Override // defpackage.bkse
    public cqkl g() {
        if (this.d.d().isEmpty()) {
            return l(true);
        }
        a().a("");
        return k(true);
    }

    @Override // defpackage.bkse
    public jkh h() {
        return this.x;
    }

    @Override // defpackage.bkse
    public CharSequence i() {
        if (this.l) {
            bwrs<ilo> bwrsVar = this.n;
            String str = null;
            if (bwrsVar != null) {
                ilo c = bwrsVar.c();
                dbsk.s(c);
                Iterator<doft> it = c.bB().iterator();
                loop0: while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    doft next = it.next();
                    if ((next.a & 16) != 0) {
                        String str2 = next.e;
                        for (dofs dofsVar : next.f) {
                            int i = dofsVar.b;
                            int i2 = dofsVar.c;
                            if (i >= 0 && i2 <= str2.length()) {
                                str = next.e.substring(i, i2);
                                break loop0;
                            }
                        }
                        continue;
                    }
                }
            }
            if (str != null) {
                return this.e.getString(R.string.SEARCH_FOR_REVIEW_EXAMPLE, new Object[]{str});
            }
        }
        return this.e.getString(R.string.SEARCH_FOR_REVIEW);
    }

    @Override // defpackage.bkse
    public Boolean j() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.bkse
    public cqkl k(boolean z) {
        final int i;
        if (!this.u) {
            this.u = true;
            cqkx.p(z());
        }
        if (this.k.l().L() != jjn.FULLY_EXPANDED) {
            this.f.a().k(bege.REVIEWS);
        }
        if (!this.v) {
            this.v = true;
            cqkx.p(z());
        }
        RecyclerView B = B();
        if (B != null && z) {
            B.post(new Runnable(this) { // from class: bktf
                private final bktk a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.y();
                }
            });
        }
        bksc bkscVar = this.q;
        if (bkscVar != null) {
            final Integer num = this.t;
            blol blolVar = (blol) bkscVar;
            if (blolVar.a.h().booleanValue()) {
                bksv bksvVar = blolVar.b.c;
                dbsk.s(bksvVar);
                bksvVar.s();
                blolVar.a.o();
                bksv bksvVar2 = blolVar.b.c;
                dbsk.s(bksvVar2);
                bksvVar2.r();
                blolVar.a.e.y();
            } else {
                final RecyclerView p = blolVar.a.p();
                if (p != null && num != null) {
                    if (blolVar.a.h().booleanValue()) {
                        bksv bksvVar3 = blolVar.b.c;
                        dbsk.s(bksvVar3);
                        i = -bksvVar3.v();
                    } else {
                        i = 0;
                    }
                    final blon blonVar = blolVar.a;
                    p.post(new Runnable(blonVar, p, num, i) { // from class: blok
                        private final blon a;
                        private final RecyclerView b;
                        private final Integer c;
                        private final int d;

                        {
                            this.a = blonVar;
                            this.b = p;
                            this.c = num;
                            this.d = i;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            blon blonVar2 = this.a;
                            RecyclerView recyclerView = this.b;
                            Integer num2 = this.c;
                            blonVar2.g.b(recyclerView, num2.intValue(), this.d);
                            blonVar2.e.y();
                        }
                    });
                }
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.bkse
    public cqkl l(boolean z) {
        EditText C;
        if (this.v) {
            this.v = false;
            cqkx.p(z());
        }
        if (this.i && (C = C()) != null) {
            C.clearFocus();
        }
        if (z && this.u) {
            this.u = false;
            cqkx.p(z());
        }
        return cqkl.a;
    }

    @Override // defpackage.bkse
    public Boolean m() {
        boolean z = true;
        if (!this.u && this.d.d().isEmpty()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bkse
    public cqkl n() {
        View a;
        isc iscVar = this.h;
        if (iscVar != null) {
            iscVar.dismiss();
        }
        RecyclerView B = B();
        if (B != null && (a = cqhu.a(B, bkse.c)) != null) {
            isc a2 = this.m.a(a);
            ArrayList arrayList = new ArrayList();
            blif[] blifVarArr = blif.b;
            int length = blifVarArr.length;
            for (int i = 0; i < 4; i++) {
                final blif blifVar = blifVarArr[i];
                jhm jhmVar = new jhm();
                jhmVar.a = this.e.getString(blifVar.a());
                jhmVar.f = cjtd.a(blifVar.g());
                jhmVar.d(new View.OnClickListener(this, blifVar) { // from class: bktg
                    private final bktk a;
                    private final blif b;

                    {
                        this.a = this;
                        this.b = blifVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        bktk bktkVar = this.a;
                        bktkVar.d.h(null, this.b, null, null);
                        cqkx.p(bktkVar.z());
                    }
                });
                if (blifVar.equals(this.d.f())) {
                    jhmVar.c = cqrt.f(2131232559);
                }
                arrayList.add(jhmVar.c());
            }
            a2.a(arrayList);
            a2.setOnDismissListener(new PopupMenu.OnDismissListener(this) { // from class: bkth
                private final bktk a;

                {
                    this.a = this;
                }

                @Override // android.widget.PopupMenu.OnDismissListener
                public final void onDismiss(PopupMenu popupMenu) {
                    this.a.h = null;
                }
            });
            a2.show();
            this.h = a2;
            return cqkl.a;
        }
        return cqkl.a;
    }

    @Override // defpackage.bkse
    public void o(int i) {
        this.t = Integer.valueOf(i);
    }

    @Override // defpackage.bkse
    public CharSequence p() {
        return this.e.getResources().getString(R.string.SEARCH_FOR_REVIEW_SELECTED_STATE, this.e.getResources().getString(true != f().booleanValue() ? R.string.REVIEW_FILTER_NOT_SELECTED_STATE : R.string.REVIEW_FILTER_SELECTED_STATE));
    }

    @Override // defpackage.bkse
    public Boolean q() {
        return Boolean.valueOf(this.j.getUgcParameters().br() == 2);
    }

    @Override // defpackage.bkse
    public bksf r() {
        return this.s;
    }

    public void s(bwrs<ilo> bwrsVar) {
        this.n = bwrsVar;
    }

    public void t(cqkp cqkpVar, cqjg cqjgVar) {
        this.o = cqkpVar;
        this.p = cqjgVar;
    }

    public void u(bksc bkscVar) {
        this.q = bkscVar;
    }

    public void v(bksd bksdVar) {
        this.g = bksdVar;
    }

    public Integer w() {
        View a;
        RecyclerView B = B();
        if (B == null || (a = cqhu.a(B, bkse.a)) == null) {
            return 0;
        }
        int height = a.getHeight();
        if (a.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a.getLayoutParams();
            height = height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return Integer.valueOf(height);
    }

    public Boolean x() {
        return Boolean.valueOf(this.v);
    }

    public void y() {
        EditText C = C();
        if (C == null) {
            return;
        }
        C.requestFocus();
        C.sendAccessibilityEvent(8);
        ((InputMethodManager) this.e.getSystemService("input_method")).showSoftInput(C, 1);
    }

    public final cqkp z() {
        cqkp cqkpVar = this.o;
        return cqkpVar == null ? this : cqkpVar;
    }
}
