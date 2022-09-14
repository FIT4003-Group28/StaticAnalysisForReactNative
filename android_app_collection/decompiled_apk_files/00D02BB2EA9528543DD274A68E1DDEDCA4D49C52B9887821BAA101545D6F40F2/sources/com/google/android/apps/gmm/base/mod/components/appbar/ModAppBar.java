package com.google.android.apps.gmm.base.mod.components.appbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.apps.gmm.base.mod.components.appbar.ModAppBar;
import com.google.android.apps.maps.R;
import com.google.android.material.appbar.AppBarLayout;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ModAppBar extends AppBarLayout implements gci {
    private final LinearLayout A;
    private final View B;
    private final LinearLayout C;
    private final View D;
    private final ImageView E;
    private final Space F;
    private final Space G;
    private int H;
    private boolean I;
    @dzsi
    private Integer J;
    private final int K;
    private int L;
    private final cqtd M;
    @dzsi
    private cqtd N;
    @dzsi
    private hxb O;
    private int P;
    private boolean Q;
    public final LinearLayout b;
    @dzsi
    public View.OnClickListener c;
    public isc d;
    @dzsi
    public jib e;
    @dzsi
    List<jho> f;
    public final crzp<Boolean> g;
    public cjqy h;
    public isd i;
    public ite j;
    public cjmt k;
    public eff l;
    public gcg m;
    public dxio<gce> n;
    public Executor o;
    private final View u;
    private final View v;
    private final ImageView w;
    private final FrameLayout x;
    private final TextView y;
    private final TextView z;
    private static final dcqe t = dcqe.c("com.google.android.apps.gmm.base.mod.components.appbar.ModAppBar");
    static final ne a = new hxa();

    public ModAppBar(Context context) {
        this(context, null);
    }

    private static boolean A(TextView textView) {
        Layout layout = textView.getLayout();
        if (layout != null) {
            int lineCount = layout.getLineCount();
            for (int i = 0; i < lineCount; i++) {
                if (layout.getEllipsisCount(i) > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void r(@dzsi final Object obj) {
        if (obj == null) {
            this.v.setOnClickListener(null);
            return;
        }
        if (!(obj instanceof jia) && !(obj instanceof View.OnClickListener)) {
            bvoo.h("Navigation button click listener must be of type ToolbarProperties.OnClickListener or View.OnClickListener", new Object[0]);
        }
        this.v.setOnClickListener(new View.OnClickListener(this, obj) { // from class: hwy
            private final ModAppBar a;
            private final Object b;

            {
                this.a = this;
                this.b = obj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ModAppBar modAppBar = this.a;
                Object obj2 = this.b;
                hxn.b(modAppBar.h, view);
                if (obj2 instanceof jia) {
                    ((jia) obj2).a(view);
                } else if (!(obj2 instanceof View.OnClickListener)) {
                } else {
                    ((View.OnClickListener) obj2).onClick(view);
                }
            }
        });
    }

    private final void s() {
        int childCount = this.C.getChildCount();
        int i = 0;
        int i2 = this.D.getVisibility() == 0 ? 1 : 0;
        View view = this.B;
        if (childCount + i2 != 1) {
            i = 8;
        }
        view.setVisibility(i);
    }

    private final void t(@dzsi CharSequence charSequence, TextView textView) {
        if (charSequence == null || charSequence.length() <= 0) {
            textView.setText("");
            textView.setVisibility(8);
        } else {
            textView.setText(charSequence);
            textView.setVisibility(0);
        }
        int a2 = jmj.a(getContext(), this.z.getVisibility() == 8 ? 56 : 76);
        if (this.u.getMinimumHeight() != a2) {
            this.u.setMinimumHeight(a2);
        }
    }

    private final void v() {
        this.v.setBackground(w(this.M));
        this.w.setBackground(w(this.N));
        this.D.setBackground(w(this.M));
        this.E.setBackground(w(this.N));
        for (int i = 0; i < this.C.getChildCount(); i++) {
            View childAt = this.C.getChildAt(i);
            if (childAt instanceof FrameLayout) {
                childAt.setBackground(w(this.M));
                ImageView imageView = (ImageView) childAt.findViewById(R.id.mod_app_bar_button_icon);
                if (imageView != null) {
                    imageView.setBackground(w(this.N));
                }
            }
        }
    }

    @dzsi
    private final Drawable w(@dzsi cqtd cqtdVar) {
        if (cqtdVar != null) {
            return cqtdVar.a(getContext());
        }
        return null;
    }

    private final void x(boolean z) {
        if (this.I == z) {
            return;
        }
        this.I = z;
        int i = true != z ? 5 : 4;
        this.y.setTextAlignment(i);
        this.z.setTextAlignment(i);
        int i2 = true != z ? 8388627 : 17;
        this.b.setGravity(i2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.b.getLayoutParams());
        layoutParams.gravity = i2;
        this.b.setLayoutParams(layoutParams);
        y();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r0 > r2) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean y() {
        /*
            r4 = this;
            boolean r0 = r4.I
            r1 = 0
            if (r0 == 0) goto L1e
            android.widget.FrameLayout r0 = r4.x
            int r0 = r0.getMeasuredWidth()
            android.widget.LinearLayout r2 = r4.A
            int r2 = r2.getMeasuredWidth()
            int r3 = r0 - r2
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r2) goto L1b
            r1 = r3
            goto L1e
        L1b:
            if (r0 <= r2) goto L1e
            goto L1f
        L1e:
            r3 = 0
        L1f:
            android.widget.Space r0 = r4.F
            boolean r0 = z(r0, r1)
            android.widget.Space r1 = r4.G
            boolean r1 = z(r1, r3)
            if (r1 == 0) goto L2e
            r0 = 1
        L2e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gmm.base.mod.components.appbar.ModAppBar.y():boolean");
    }

    private static boolean z(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width != i) {
            layoutParams.width = i;
            return true;
        }
        return false;
    }

    @Override // defpackage.gci
    public final void NN() {
        setToolbarProperties(this.e);
    }

    public final void b() {
        if (Build.VERSION.SDK_INT == 21) {
            setOutlineProvider(null);
        } else {
            setTargetElevation(0.0f);
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth = this.x.getMeasuredWidth();
        int measuredWidth2 = this.A.getMeasuredWidth();
        super.onMeasure(i, i2);
        int e = this.l.a ? 0 : this.k.e();
        if (e != this.P && this.Q) {
            setPadding(getPaddingLeft(), e, getPaddingRight(), getPaddingBottom());
            this.P = e;
            super.onMeasure(i, i2);
        }
        if ((measuredWidth != this.x.getMeasuredWidth() || measuredWidth2 != this.A.getMeasuredWidth()) && y()) {
            super.onMeasure(i, i2);
        }
        if (this.H != 2 || !this.I) {
            return;
        }
        if (!A(this.y) && !A(this.z)) {
            return;
        }
        x(false);
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.widget.Button] */
    public void setActionMenuItems(@dzsi List<jho> list) {
        ?? inflate;
        if (dbsd.a(list, this.f)) {
            return;
        }
        this.f = list;
        this.C.removeAllViews();
        if (list == null || list.isEmpty()) {
            this.C.setVisibility(8);
            return;
        }
        this.C.setVisibility(0);
        Context context = getContext();
        final cjqy cjqyVar = this.h;
        ite iteVar = this.j;
        dccx F = dcdc.F();
        for (final jho jhoVar : list) {
            CharSequence a2 = jhoVar.a(context);
            cqtd cqtdVar = jhoVar.b;
            boolean z = jhoVar.g;
            if (cqtdVar == null) {
                int b = z ? jhoVar.b(context) : jhoVar.c(context);
                inflate = (Button) LayoutInflater.from(context).inflate(R.layout.button_text_internal, (ViewGroup) null);
                inflate.setText(a2);
                inflate.setTextColor(b);
            } else {
                Drawable a3 = cqtdVar.a(context);
                inflate = LayoutInflater.from(context).inflate(R.layout.mod_app_bar_button_internal, (ViewGroup) null);
                ImageView imageView = (ImageView) inflate.findViewById(R.id.mod_app_bar_button_icon);
                if (imageView != null) {
                    imageView.setImageDrawable(a3);
                }
                od.c(inflate, a);
            }
            inflate.setContentDescription(jhoVar.a);
            hxn.a(inflate, jhoVar.c, iteVar);
            inflate.setOnClickListener(new View.OnClickListener(cjqyVar, jhoVar) { // from class: hxl
                private final cjqy a;
                private final jho b;

                {
                    this.a = cjqyVar;
                    this.b = jhoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.b.d(view, hxn.b(this.a, view));
                }
            });
            inflate.setEnabled(z);
            F.g(inflate);
        }
        for (View view : F.f()) {
            this.C.addView(view);
        }
        s();
        v();
        u();
    }

    public void setCoverStatusBar(boolean z) {
        this.Q = z;
    }

    public void setIconButtonsBackground(@dzsi cqtd cqtdVar) {
        this.N = cqtdVar;
        v();
    }

    public void setIconColor(@dzsi Integer num) {
        if (!dbsd.a(this.J, num)) {
            this.J = num;
            u();
        }
    }

    public void setNavButtonClickListener(@dzsi View.OnClickListener onClickListener) {
        r(onClickListener);
    }

    public void setNavButtonContentDescription(@dzsi CharSequence charSequence) {
        this.v.setContentDescription(charSequence);
    }

    public void setNavButtonUe3Params(@dzsi cjtd cjtdVar) {
        hxn.a(this.v, cjtdVar, this.j);
    }

    public void setNavButtonVisible(boolean z) {
        this.x.setVisibility(true != z ? 8 : 0);
    }

    public void setNavIcon(@dzsi Drawable drawable) {
        setNavButtonVisible(drawable != null);
        this.w.setImageDrawable(drawable);
    }

    public void setOnToolbarPropertiesUpdatedListener(@dzsi hxb hxbVar) {
        this.O = hxbVar;
    }

    public void setOverflowButtonClickListener(@dzsi View.OnClickListener onClickListener) {
        this.c = onClickListener;
    }

    public void setOverflowButtonContentDescription(@dzsi CharSequence charSequence) {
        if (charSequence != null) {
            this.D.setContentDescription(charSequence);
        }
    }

    public void setOverflowButtonUe3Params(@dzsi cjtd cjtdVar) {
        hxn.a(this.D, cjtdVar, this.j);
    }

    public void setOverflowButtonVisible(boolean z) {
        this.D.setVisibility(true != z ? 8 : 0);
        s();
    }

    public void setOverflowIcon(@dzsi Drawable drawable) {
        this.E.setImageDrawable(drawable);
    }

    public void setOverflowIconColor(int i) {
        if (this.L != i) {
            this.L = i;
            u();
        }
    }

    public void setOverflowMenuItems(@dzsi final List<jho> list) {
        if (list == null || list.isEmpty()) {
            this.D.setOnClickListener(null);
            setOverflowButtonVisible(false);
            return;
        }
        setOverflowButtonVisible(true);
        if (this.d == null) {
            this.d = this.i.a(this.D);
        }
        this.D.setOnClickListener(new View.OnClickListener(this, list) { // from class: hwz
            private final ModAppBar a;
            private final List b;

            {
                this.a = this;
                this.b = list;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ModAppBar modAppBar = this.a;
                List<jho> list2 = this.b;
                hxn.b(modAppBar.h, view);
                View.OnClickListener onClickListener = modAppBar.c;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                modAppBar.d.a(list2);
                modAppBar.d.show();
            }
        });
    }

    public void setSubtitle(@dzsi CharSequence charSequence) {
        t(charSequence, this.z);
    }

    public void setSubtitleFontColor(int i) {
        this.z.setTextColor(i);
    }

    public void setTitle(@dzsi CharSequence charSequence) {
        t(charSequence, this.y);
        boolean z = true;
        if (this.H == 1) {
            z = false;
        }
        x(z);
    }

    public void setTitleAlignment(int i) {
        if (this.H == i) {
            return;
        }
        this.H = i;
        boolean z = true;
        if (i == 1) {
            z = false;
        }
        x(z);
    }

    public void setTitleAlpha(float f) {
        this.b.setAlpha(f);
    }

    public void setTitleClickListener(@dzsi View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
        this.b.setClickable(onClickListener != null);
        this.b.setBackground(onClickListener != null ? ((gdh) this.M).b(getContext()) : null);
    }

    public void setTitleContentDescription(@dzsi CharSequence charSequence) {
        this.y.setContentDescription(charSequence);
    }

    public void setTitleDropDownIconMode(int i) {
        Drawable drawable;
        if (i != 1) {
            drawable = i != 2 ? null : getContext().getResources().getDrawable(2131232150);
        } else {
            drawable = getContext().getResources().getDrawable(2131232149);
        }
        Drawable[] compoundDrawablesRelative = this.y.getCompoundDrawablesRelative();
        compoundDrawablesRelative[2] = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), compoundDrawablesRelative[2].getIntrinsicHeight());
        }
        this.y.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
        invalidate();
    }

    public void setTitleFontColor(int i) {
        this.y.setTextColor(i);
    }

    public void setToolbarProperties(@dzsi jib jibVar) {
        this.e = jibVar;
        if (jibVar == null) {
            return;
        }
        Context context = getContext();
        setTitleAlpha(jibVar.x / 255.0f);
        setTitle(jibVar.u);
        setTitleContentDescription(jibVar.F);
        cqss cqssVar = jibVar.w;
        if (cqssVar != null) {
            setTitleFontColor(cqssVar.b(context));
        }
        setSubtitle(jibVar.b);
        cqss cqssVar2 = jibVar.z;
        if (cqssVar2 != null) {
            setSubtitleFontColor(cqssVar2.b(context));
        }
        setTitleClickListener(jibVar.D);
        boolean z = false;
        setTitleDropDownIconMode(0);
        setTitleAlignment(jibVar.r);
        setNavIcon(w(jibVar.i));
        setNavButtonClickListener(jibVar.A);
        setNavButtonUe3Params(jibVar.k);
        cqsn cqsnVar = jibVar.j;
        setNavButtonContentDescription(cqsnVar != null ? cqsnVar.a(context).toString() : null);
        setBackgroundColor(jibVar.c(context));
        cqss cqssVar3 = jibVar.g;
        setIconColor(cqssVar3 != null ? Integer.valueOf(cqssVar3.b(context)) : null);
        setOverflowIconColor(jibVar.a(context));
        List<jho> list = jibVar.n;
        int i = jibVar.s;
        dccx F = dcdc.F();
        dccx F2 = dcdc.F();
        int i2 = 0;
        for (jho jhoVar : list) {
            if (z) {
                F2.g(jhoVar);
            } else if (i2 >= i || jhoVar.e().intValue() == 0) {
                F2.g(jhoVar);
                z = true;
            } else {
                F.g(jhoVar);
                i2++;
            }
        }
        hww hwwVar = new hww(F.f(), F2.f());
        setActionMenuItems(hwwVar.a);
        setOverflowMenuItems(hwwVar.b);
        setOverflowButtonContentDescription(jibVar.H);
        setOverflowButtonClickListener(null);
        setOverflowButtonUe3Params(jibVar.l);
        setIconButtonsBackground(jibVar.e);
        if (!jibVar.B) {
            l(jibVar.C);
        }
        hxb hxbVar = this.O;
        if (hxbVar == null) {
            return;
        }
        hxbVar.a(jibVar);
    }

    public ModAppBar(Context context, @dzsi AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setNavButtonClickListener(@dzsi jia jiaVar) {
        r(jiaVar);
    }

    public ModAppBar(Context context, @dzsi AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.H = 0;
        this.I = true;
        this.P = 0;
        this.Q = true;
        this.e = null;
        this.f = null;
        if (getId() == -1) {
            setId(R.id.mod_app_bar);
        }
        ((hxh) bttc.a(hxh.class, this)).wt(this);
        LayoutInflater.from(context).inflate(R.layout.mod_app_bar_internal, this);
        this.u = findViewById(R.id.toolbar);
        View findViewById = findViewById(R.id.nav_button);
        this.v = findViewById;
        this.x = (FrameLayout) findViewById(R.id.start_section);
        ImageView imageView = (ImageView) findViewById.findViewById(R.id.mod_app_bar_button_icon);
        this.w = imageView;
        this.b = (LinearLayout) findViewById(R.id.title_section);
        TextView textView = (TextView) findViewById(R.id.title);
        this.y = textView;
        TextView textView2 = (TextView) findViewById(R.id.subtitle);
        this.z = textView2;
        this.A = (LinearLayout) findViewById(R.id.end_section);
        View findViewById2 = findViewById(R.id.overflow_button);
        this.D = findViewById2;
        ImageView imageView2 = (ImageView) findViewById2.findViewById(R.id.mod_app_bar_button_icon);
        this.E = imageView2;
        this.B = findViewById(R.id.end_button_start_space);
        this.C = (LinearLayout) findViewById(R.id.action_buttons);
        this.F = (Space) findViewById(R.id.title_start_space);
        this.G = (Space) findViewById(R.id.title_end_space);
        q(true);
        setBackgroundColor(ibm.b().b(context));
        int b = ibm.p().b(context);
        this.L = b;
        this.K = b;
        this.M = ibo.b();
        imageView.setImageDrawable(context.getResources().getDrawable(2131231588));
        imageView2.setImageDrawable(context.getResources().getDrawable(2131231593));
        findViewById2.setContentDescription(context.getString(R.string.ACCESSIBILITY_OVERFLOW_MENU));
        findViewById2.setVisibility(8);
        textView.setTextColor(ibm.t().b(context));
        textView.setVisibility(8);
        textView2.setTextColor(ibm.n().b(context));
        textView2.setVisibility(8);
        u();
        v();
        this.g = new crzp(this) { // from class: hwx
            private final ModAppBar a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                ModAppBar modAppBar = this.a;
                modAppBar.setToolbarProperties(modAppBar.e);
            }
        };
        ne neVar = a;
        od.c(findViewById, neVar);
        od.c(findViewById2, neVar);
    }

    private final void u() {
        ImageView imageView = this.E;
        Integer num = this.J;
        imageView.setColorFilter(num != null ? num.intValue() : this.L);
        Integer num2 = this.J;
        int intValue = num2 != null ? num2.intValue() : this.K;
        this.w.setColorFilter(intValue);
        for (int i = 0; i < this.C.getChildCount(); i++) {
            ImageView imageView2 = (ImageView) this.C.getChildAt(i).findViewById(R.id.mod_app_bar_button_icon);
            if (imageView2 != null) {
                imageView2.setColorFilter(intValue);
            }
        }
    }
}
