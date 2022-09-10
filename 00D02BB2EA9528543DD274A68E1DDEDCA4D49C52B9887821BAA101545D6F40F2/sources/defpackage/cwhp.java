package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.maps.R;
import com.google.android.libraries.onegoogle.accountmanagement.SelectedAccountView;
import com.google.android.libraries.onegoogle.accountmenu.internal.MyAccountChip;
/* compiled from: PG */
/* renamed from: cwhp  reason: default package */
/* loaded from: classes5.dex */
public final class cwhp<AccountT> extends LinearLayout {
    private static final String o = String.valueOf(cwhp.class.getName()).concat(".superState");
    private static final String p = String.valueOf(cwhp.class.getName()).concat(".collapsed");
    public final MyAccountChip<AccountT> a;
    public final SelectedAccountView<AccountT> b;
    public final RecyclerView c;
    public boolean d;
    public cwla e;
    public cwfc<AccountT> f;
    public boolean g;
    public boolean h;
    public cwee i;
    public dbsg<cvwn<AccountT>> j;
    public dbsg<cwec> k;
    public cwii l;
    public cwiv<AccountT> m;
    public final cvxj<AccountT> n;
    private cvxk q;

    public cwhp(Context context) {
        super(context);
        this.n = new cwho(this);
        LayoutInflater.from(context).inflate(R.layout.has_selected_content, this);
        setOrientation(1);
        this.a = (MyAccountChip) findViewById(R.id.my_account_chip);
        this.b = (SelectedAccountView) findViewById(R.id.selected_account_view);
        this.c = (RecyclerView) findViewById(R.id.account_management);
    }

    public static <T extends acl> void c(RecyclerView recyclerView, abg<T> abgVar) {
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new aag());
        cwjc.a(recyclerView, abgVar);
    }

    public final void a(cvze<AccountT> cvzeVar, cvxw<AccountT> cvxwVar) {
        cvxk cvxkVar;
        View.OnClickListener onClickListener;
        czhz.b();
        dbsg<cwec> j = cvzeVar.c().j();
        if (j.a()) {
            if (j.b().c().a()) {
                cvxkVar = cvxk.CUSTOM;
            } else {
                cvxkVar = cvxk.NONE;
            }
        } else if (cvzeVar.c().e().a()) {
            if (cvxwVar.c() > 0) {
                cvxkVar = cvxk.CHEVRON;
            } else {
                cvxkVar = cvxk.NONE;
            }
        } else {
            cvxkVar = cvxk.NONE;
        }
        this.q = cvxkVar;
        this.b.setTrailingDrawable(cvxkVar);
        SelectedAccountView<AccountT> selectedAccountView = this.b;
        int ordinal = this.q.ordinal();
        boolean z = true;
        if (ordinal == 0) {
            onClickListener = new View.OnClickListener(this) { // from class: cwhg
                private final cwhp a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cwhp cwhpVar = this.a;
                    cwhpVar.e.d(csgw.a(), view);
                    cwhpVar.b(!cwhpVar.d);
                }
            };
        } else if (ordinal == 1) {
            dbsk.l(this.k.a());
            cwiw cwiwVar = new cwiw(new View.OnClickListener(this) { // from class: cwhh
                private final cwhp a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cwhp cwhpVar = this.a;
                    cwec b = cwhpVar.k.b();
                    dbsk.a(b.c().a());
                    Drawable a = cwiz.a(cwhpVar.getContext(), b.d(), cqfa.b(cwhpVar.getContext()));
                    czys czysVar = new czys(cwhpVar.getContext(), 2132018356);
                    czysVar.s(b.a());
                    czysVar.p(a);
                    czysVar.q(b.c().b());
                    czysVar.r(b.b());
                    czysVar.c();
                }
            });
            cwiwVar.c = this.l.a();
            cwiwVar.d = this.l.b();
            cwiwVar.b(this.m, 56);
            onClickListener = cwiwVar.a();
        } else if (ordinal != 2) {
            throw new IllegalStateException();
        } else {
            onClickListener = null;
        }
        selectedAccountView.setOnClickListener(onClickListener);
        SelectedAccountView<AccountT> selectedAccountView2 = this.b;
        if (this.q == cvxk.NONE) {
            z = false;
        }
        selectedAccountView2.setEnabled(z);
        d();
    }

    public final void b(boolean z) {
        czhz.b();
        this.d = z;
        this.c.setVisibility(true != z ? 0 : 8);
        SelectedAccountView<AccountT> selectedAccountView = this.b;
        boolean z2 = !z;
        if (z2 != selectedAccountView.f) {
            selectedAccountView.f = z2;
            if (z2) {
                selectedAccountView.d.start();
            } else {
                selectedAccountView.d.reverse();
            }
        }
        d();
    }

    public final void d() {
        czhz.b();
        if (this.b.c.j == null) {
            return;
        }
        String string = getContext().getString(R.string.og_signed_in_as_account, this.b.e.b());
        if (this.q == cvxk.CHEVRON) {
            String valueOf = String.valueOf(string);
            String string2 = getContext().getString(true != this.d ? R.string.og_collapse_account_menu_a11y : R.string.og_expand_account_menu_a11y);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(string2).length());
            sb.append(valueOf);
            sb.append("\n");
            sb.append(string2);
            string = sb.toString();
        } else if (this.q == cvxk.CUSTOM) {
            String valueOf2 = String.valueOf(string);
            String string3 = getContext().getString(this.k.b().a());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 1 + String.valueOf(string3).length());
            sb2.append(valueOf2);
            sb2.append("\n");
            sb2.append(string3);
            string = sb2.toString();
        }
        this.b.setContentDescription(string);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        this.a.setTextForParentWidth(View.MeasureSpec.getSize(i));
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        cwfc<AccountT> cwfcVar;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Parcelable parcelable2 = bundle.getParcelable(o);
            b(bundle.getBoolean(p));
            this.g = bundle.getBoolean("obakeEducationStarted");
            parcelable = parcelable2;
        }
        super.onRestoreInstanceState(parcelable);
        if (this.g && (cwfcVar = this.f) != null) {
            cwfcVar.a = true;
        }
        this.h = true;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(o, super.onSaveInstanceState());
        bundle.putBoolean(p, this.d);
        bundle.putBoolean("obakeEducationStarted", this.g);
        return bundle;
    }
}
