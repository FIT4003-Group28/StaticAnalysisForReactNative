package com.google.android.libraries.onegoogle.expresssignin;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.libraries.onegoogle.accountmanagement.SelectedAccountView;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ExpressSignInLayout extends FrameLayout implements upw {
    public static final String a = "ExpressSignInLayout";
    private static final Property s = Property.of(View.class, Float.class, "alpha");
    private static final Interpolator t = kt.o(0.54f, 0.01f, 0.61f, 0.99f);
    private final int A;
    private final int B;
    private final ViewGroup C;
    private final View D;
    private final View E;
    private final almx F;
    private final almx G;
    private final ulu H;
    private final abq I;

    /* renamed from: J  reason: collision with root package name */
    private final FrameLayout f160J;
    private final TextView K;
    private ulu L;
    private umo M;
    public boolean b;
    public boolean c;
    public boolean d;
    public uoc e;
    public final View f;
    public final RecyclerView g;
    public final SelectedAccountView h;
    public final Button i;
    public final Button j;
    public final Button k;
    public final ViewGroup l;
    public final View m;
    public final ViewGroup n;
    public umo o;
    public Runnable p;
    public AnimatorSet q;
    public final uuo r;
    private boolean u;
    private boolean v;
    private final int w;
    private final float x;
    private final float y;
    private final int z;

    public ExpressSignInLayout(Context context) {
        this(context, null);
    }

    public static aoul c() {
        aouk a2 = aoul.a();
        aouo aouoVar = aouo.EXPRESS_SIGN_IN_COMPONENT;
        a2.copyOnWrite();
        ((aoul) a2.instance).k(aouoVar);
        aoun aounVar = aoun.BOTTOM_SHEET_COMPONENT_APPEARANCE;
        a2.copyOnWrite();
        ((aoul) a2.instance).l(aounVar);
        aoup aoupVar = aoup.GM_COMPONENT_STYLE;
        a2.copyOnWrite();
        ((aoul) a2.instance).m(aoupVar);
        return (aoul) a2.mo39build();
    }

    private final int n() {
        this.l.measure(0, 0);
        w(this.m, this.l.getMeasuredHeight());
        this.C.measure(0, 0);
        return this.C.getMeasuredHeight();
    }

    private static AnimatorSet o(Animator.AnimatorListener animatorListener) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.addListener(animatorListener);
        return animatorSet;
    }

    private static ObjectAnimator p(View view) {
        return ObjectAnimator.ofFloat(view, s, 0.0f, 1.0f);
    }

    private static ObjectAnimator q(View view) {
        return ObjectAnimator.ofFloat(view, s, 1.0f, 0.0f);
    }

    private final almx r() {
        almx h = almx.h(getContext(), 0.0f);
        h.t();
        h.o(this.B);
        return h;
    }

    private final alnc s() {
        float dimension = getResources().getDimension(R.dimen.og_express_sign_in_corner_size);
        alnb a2 = alnc.a();
        a2.f(almu.B(0));
        a2.d(dimension);
        a2.g(almu.B(0));
        a2.e(dimension);
        return a2.a();
    }

    private final void t() {
        this.h.setVisibility(8);
        this.i.setVisibility(0);
        this.j.setVisibility(8);
        this.K.setVisibility(8);
        j(false);
    }

    private final void u() {
        int i = 0;
        this.h.setVisibility(0);
        this.i.setVisibility(8);
        this.j.setVisibility(0);
        TextView textView = this.K;
        if (true != umn.a(getContext())) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    private final void v(boolean z) {
        if (this.v == z) {
            return;
        }
        this.v = z;
        this.C.getLayoutParams().height = true != z ? -2 : -1;
        this.D.setVisibility(true != z ? 0 : 8);
        if (z && this.L == null) {
            this.L = new ulu(this.g, 0);
        }
        this.g.ax();
        this.g.aC(z ? this.L : this.H);
        l();
    }

    private static void w(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    private final void x() {
        if (this.h.getVisibility() == 0) {
            t();
        } else {
            u();
        }
    }

    private static void y(View view, int i) {
        view.getLayoutParams().height = i;
        view.requestLayout();
    }

    @Override // defpackage.upw
    public final void a(upq upqVar) {
        upqVar.a(this.h, 90572);
        upqVar.a(this.f, 90573);
        upqVar.a(this.g, 90574);
        upqVar.a(this.j, 90570);
        upqVar.a(this.i, 90771);
        upqVar.a(this.k, 90571);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int childCount = getChildCount();
        boolean z = true;
        if (childCount == 0) {
            if (view.getId() != R.id.express_sign_in_internal_view) {
                z = false;
            }
            aqxo.z(z, "express_sign_in_internal_view must be added first");
            super.addView(view, -1, layoutParams);
            return;
        }
        if (childCount != 1) {
            z = false;
        }
        aqxo.z(z, "ExpressSignInLayout must contain a single content view.");
        this.f160J.addView(view, 0, layoutParams);
        FrameLayout frameLayout = this.f160J;
        super.addView(frameLayout, 0, frameLayout.getLayoutParams());
    }

    @Override // defpackage.upw
    public final void b(upq upqVar) {
        upqVar.c(this.h);
        upqVar.c(this.f);
        upqVar.c(this.g);
        upqVar.c(this.j);
        upqVar.c(this.i);
        upqVar.c(this.k);
    }

    public final void d() {
        Runnable runnable = this.p;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void e(int i) {
        boolean z = i > 0 && this.d;
        this.u = z;
        SelectedAccountView selectedAccountView = this.h;
        char c = z ? (char) 1 : (char) 3;
        int i2 = 8;
        selectedAccountView.k.setVisibility(8);
        selectedAccountView.j.setVisibility(c == 1 ? 0 : 8);
        FrameLayout frameLayout = selectedAccountView.l;
        if (c != 3) {
            i2 = 0;
        }
        frameLayout.setVisibility(i2);
        selectedAccountView.i();
        this.h.setOnClickListener(z ? new View.OnClickListener() { // from class: unb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aouq aouqVar;
                ExpressSignInLayout expressSignInLayout = ExpressSignInLayout.this;
                expressSignInLayout.e.f.d(tmd.a(), view);
                if (expressSignInLayout.b) {
                    aouqVar = aouq.DID_TAP_EXPANDED_ACCOUT_MENU_HEADER;
                } else {
                    aouqVar = aouq.DID_TAP_COLLAPSED_ACCOUT_MENU_HEADER;
                }
                expressSignInLayout.h(aouqVar);
                expressSignInLayout.j(!expressSignInLayout.b);
            }
        } : null);
        this.h.setClickable(z);
        m();
        if (!z) {
            j(false);
        }
    }

    public final void f(uoe uoeVar, Object obj) {
        aouq aouqVar;
        ankt q;
        uwp.f();
        if (obj == null) {
            aouqVar = aouq.DID_CONTINUE_WITHOUT_ACCOUNT_EVENT;
        } else {
            aouqVar = aouq.DID_CONTINUE_WITH_ACCOUNT_EVENT;
        }
        h(aouqVar);
        h(aouq.DISMISSED_COMPONENT_EVENT);
        adtz adtzVar = uoeVar.b;
        ampq i = ampq.i(obj);
        adui aduiVar = adtzVar.a;
        aduiVar.d.H(3, new acte(acuo.b(36381)), null);
        if (!i.h() || aduiVar.a.g() == null || TextUtils.isEmpty(((ulx) i.c()).c)) {
            zep.l("Chosen account or current sign in request is null. Cancelling TV sign in flow.");
            aduiVar.b(aduiVar.j.d != 1);
            q = anlz.q(false);
        } else {
            String str = ((ulx) i.c()).c;
            advb g = aduiVar.a.g();
            if (g.d == 1) {
                if (g.b() == null) {
                    zep.m("MDX.tvsignin.ExpressTvSignInDrawerController", "When going to getch the Passive auth code, current sign in request has changed to an invalid one.");
                    q = anlz.q(true);
                } else {
                    aduiVar.b.a(g.b, "passive_accepted");
                    aduiVar.d.d(acuo.a(50663), null, null);
                    aduiVar.d.n(new acte(acuo.b(50662)));
                    aduiVar.l = true;
                    adup adupVar = aduiVar.c;
                    aduo aduoVar = new aduo(g.b(), new aduh(aduiVar, g, str));
                    if (TextUtils.isEmpty(aduoVar.a)) {
                        adupVar.b(aduoVar);
                        q = anlz.q(false);
                    } else {
                        adupVar.c.set(false);
                        adupVar.d.set(adupVar.b.c());
                        q = adupVar.a(aduoVar, 0L);
                    }
                }
            } else {
                aduiVar.a.l(g, str);
                aduiVar.b(false);
                q = anlz.q(true);
            }
        }
        uwp.f();
        AnimatorSet o = o(new uns(this));
        o.playTogether(p(this.n), q(this.m), q(this.l));
        this.q = o;
        o.start();
        anlz.A(q, new unz(this), anjk.a);
    }

    public final void g(boolean z) {
        uwp.f();
        unx unxVar = new unx(this);
        if (z) {
            AnimatorSet o = o(unxVar);
            o.playTogether(q(this.n), p(this.m), p(this.l));
            o.start();
            return;
        }
        unxVar.onAnimationStart(null);
        unxVar.onAnimationEnd(null);
    }

    public final void h(aouq aouqVar) {
        aouk aoukVar = (aouk) c().mo52toBuilder();
        aoukVar.copyOnWrite();
        ((aoul) aoukVar.instance).n(aouqVar);
        uoc uocVar = this.e;
        uocVar.e.a(uocVar.b.a(), (aoul) aoukVar.mo39build());
    }

    public final void i(View view) {
        h(aouq.WILL_OPEN_USE_ANOTHER_ACCOUNT_EVENT);
        View.OnClickListener onClickListener = this.e.g.b;
        umr.a(view);
    }

    public final void j(boolean z) {
        ObjectAnimator duration;
        if (this.b == z) {
            return;
        }
        this.b = z;
        int i = 8;
        this.g.setVisibility(true != z ? 8 : 0);
        SelectedAccountView selectedAccountView = this.h;
        if (z != selectedAccountView.o) {
            selectedAccountView.o = z;
            if (z) {
                selectedAccountView.m.start();
            } else {
                selectedAccountView.m.reverse();
            }
        }
        ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin = z ? this.w : 0;
        this.h.requestLayout();
        ViewGroup viewGroup = this.l;
        viewGroup.setPadding(viewGroup.getPaddingLeft(), z ? this.A : 0, viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
        if (!this.c) {
            if (z) {
                duration = p(this.f).setDuration(150L);
                duration.addListener(new uny(this));
            } else {
                duration = q(this.f).setDuration(150L);
                duration.addListener(new unm(this));
            }
            duration.start();
        }
        if (umn.a(getContext())) {
            v(z);
            this.f160J.setVisibility(true != z ? 0 : 4);
            TextView textView = this.K;
            if (true != z) {
                i = 0;
            }
            textView.setVisibility(i);
        }
        Activity h = uuo.h(getContext());
        if (h == null) {
            throw new IllegalArgumentException("Could not extract activity from context");
        }
        aqxo.q(h instanceof abp, "Activity has to be a ComponentActivity");
        abp abpVar = (abp) h;
        if (z) {
            abpVar.getOnBackPressedDispatcher().b(abpVar, this.I);
        } else {
            this.I.c();
            v(false);
            this.g.ab(0);
        }
        m();
    }

    public final void k(amuk amukVar, Object obj) {
        String str;
        if (amukVar.isEmpty()) {
            t();
        } else if (obj == null) {
        } else {
            SelectedAccountView selectedAccountView = this.h;
            aqxo.z(selectedAccountView.n != null, "Initialize must be called before setting an account.");
            selectedAccountView.n.a(obj);
            u();
            amuf amufVar = new amuf();
            zgd zgdVar = this.e.g.c;
            str = ((ulx) obj).d;
            if (!amps.d(str).trim().isEmpty()) {
                amufVar.h(getResources().getString(R.string.og_continue_as, str));
            }
            amufVar.h(getResources().getString(R.string.og_continue));
            this.M = new umo(amufVar.g());
            this.j.requestLayout();
            m();
        }
    }

    public final void l() {
        float f = 0.0f;
        float min = this.g.getVisibility() == 0 ? this.x * Math.min(1.0f, this.g.computeVerticalScrollOffset() / this.z) : 0.0f;
        lj.S(this.E, min);
        this.F.k(min);
        if (this.g.getVisibility() == 0) {
            float computeVerticalScrollOffset = this.g.computeVerticalScrollOffset();
            float computeVerticalScrollRange = this.g.computeVerticalScrollRange() - this.g.computeVerticalScrollExtent();
            if (computeVerticalScrollOffset < computeVerticalScrollRange) {
                f = this.x * Math.min((computeVerticalScrollRange - computeVerticalScrollOffset) / this.z, 1.0f);
            }
        }
        lj.S(this.l, f);
        this.G.k(f);
    }

    public final void m() {
        String string;
        uwp.f();
        Object obj = this.h.i.g;
        if (obj == null) {
            return;
        }
        Resources resources = getResources();
        zgd zgdVar = this.e.g.c;
        String string2 = resources.getString(R.string.og_selected_account_a11y, usg.d(obj));
        String b = this.h.i.b();
        if (!b.isEmpty()) {
            String valueOf = String.valueOf(string2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + b.length());
            sb.append(valueOf);
            sb.append(" ");
            sb.append(b);
            string2 = sb.toString();
        }
        if (this.u) {
            String valueOf2 = String.valueOf(string2);
            if (this.b) {
                string = getResources().getString(R.string.og_collapse_account_list_a11y);
            } else {
                string = getResources().getString(R.string.og_expand_account_list_a11y);
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 1 + String.valueOf(string).length());
            sb2.append(valueOf2);
            sb2.append(" ");
            sb2.append(string);
            string2 = sb2.toString();
        }
        this.h.setContentDescription(string2);
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f160J.getLayoutParams().height = 0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        umo umoVar = this.o;
        if (umoVar != null) {
            umoVar.a(this.k, this.l.getMeasuredWidth());
        }
        umo umoVar2 = this.M;
        if (umoVar2 != null) {
            umoVar2.a(this.j, this.l.getMeasuredWidth());
        }
        int measuredHeight = this.l.getMeasuredHeight();
        if (this.m.getPaddingBottom() != measuredHeight) {
            w(this.m, measuredHeight);
            super.onMeasure(i, i2);
        }
        if (this.C.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) this.C.getLayoutParams()).topMargin + ((ViewGroup.MarginLayoutParams) this.C.getLayoutParams()).bottomMargin >= getHeight() && getHeight() > 0 && this.D.getVisibility() == 0) {
            v(true);
            super.onMeasure(i, i2);
        }
        if (!lj.aj(this.f160J)) {
            return;
        }
        int i3 = this.f160J.getLayoutParams().height;
        int measuredHeight2 = getMeasuredHeight() - this.C.getMeasuredHeight();
        if (i3 != 0) {
            if (this.b || i3 <= measuredHeight2) {
                return;
            }
            y(this.f160J, measuredHeight2);
            return;
        }
        x();
        int n = n();
        x();
        y(this.f160J, getMeasuredHeight() - Math.max(n, n()));
    }

    public ExpressSignInLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpressSignInLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.I = new unn(this);
        this.r = new unw(this);
        if (!umn.d(context)) {
            throw new IllegalStateException("ExpressSignInLayout has to be used with a Google Material theme");
        }
        LayoutInflater.from(context).inflate(R.layout.express_sign_in_layout, this);
        boolean b = wpn.b(context);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.B = getResources().getColor(b ? R.color.og_elevation_shadow_color_light : R.color.og_elevation_shadow_color_dark);
        this.w = umn.c(displayMetrics, 8);
        this.x = umn.b(displayMetrics, true != b ? 5 : 8);
        float b2 = umn.b(displayMetrics, true != b ? 3 : 8);
        this.y = b2;
        this.z = umn.c(displayMetrics, 20);
        this.A = umn.c(displayMetrics, 8);
        this.f = findViewById(R.id.scrim_view);
        SelectedAccountView selectedAccountView = (SelectedAccountView) findViewById(R.id.selected_account);
        this.h = selectedAccountView;
        selectedAccountView.m.setDuration(150L);
        Interpolator interpolator = t;
        selectedAccountView.m.setInterpolator(interpolator);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.account_management_list);
        this.g = recyclerView;
        Resources resources = getContext().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_padding_start);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_icon_margin);
        ulu uluVar = new ulu(recyclerView, dimensionPixelSize + dimensionPixelSize2 + dimensionPixelSize2 + resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_icon_size) + resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_title_margin_start) + getResources().getDimensionPixelSize(R.dimen.og_express_sign_in_account_management_extra_horizontal_padding));
        this.H = uluVar;
        recyclerView.aC(uluVar);
        recyclerView.ag(new LinearLayoutManager());
        this.i = (Button) findViewById(R.id.sign_in_button);
        this.j = (Button) findViewById(R.id.continue_as_button);
        this.k = (Button) findViewById(R.id.secondary_action_button);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content_container);
        this.C = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.footer_container);
        this.l = viewGroup2;
        this.D = findViewById(R.id.header_container);
        View findViewById = findViewById(R.id.selected_account_container);
        this.E = findViewById;
        this.m = findViewById(R.id.accounts_content_container);
        this.n = (ViewGroup) findViewById(R.id.progress_container);
        this.K = (TextView) findViewById(R.id.choose_an_account_a11y);
        almx r = r();
        r.k(b2);
        r.u();
        r.b(s());
        viewGroup.setBackgroundDrawable(r);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.setInterpolator(2, interpolator);
        layoutTransition.setInterpolator(3, interpolator);
        layoutTransition.setInterpolator(1, interpolator);
        layoutTransition.setInterpolator(0, interpolator);
        viewGroup.setLayoutTransition(layoutTransition);
        LayoutTransition layoutTransition2 = new LayoutTransition();
        layoutTransition2.setDuration(150L);
        layoutTransition2.setInterpolator(1, interpolator);
        layoutTransition2.setInterpolator(0, interpolator);
        layoutTransition2.setAnimator(2, null);
        layoutTransition2.setAnimator(3, ValueAnimator.ofInt(0));
        ((ViewGroup) findViewById(R.id.account_management_list_container)).setLayoutTransition(layoutTransition2);
        almx r2 = r();
        this.F = r2;
        r2.b(s());
        findViewById.setBackgroundDrawable(r2);
        almx r3 = r();
        this.G = r3;
        r3.u();
        viewGroup2.setBackgroundDrawable(r3);
        r2.n(b2);
        r3.n(b2);
        recyclerView.aE(new uno(this));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f160J = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
    }
}
