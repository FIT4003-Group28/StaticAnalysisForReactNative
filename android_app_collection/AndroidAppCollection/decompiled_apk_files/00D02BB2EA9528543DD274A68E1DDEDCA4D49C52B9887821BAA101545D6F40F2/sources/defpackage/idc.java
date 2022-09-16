package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
@Deprecated
/* renamed from: idc  reason: default package */
/* loaded from: classes6.dex */
public class idc extends LinearLayout implements jcp {
    static final cqkv a = new ide();
    protected static final jbk b = new icz();
    private boolean A;
    private final LinearLayout B;
    public final ImageView c;
    public final FrameLayout d;
    @dzsi
    public isc e;
    public boolean f;
    public cqkj g;
    public cjqy h;
    public isd i;
    public ite j;
    private final Context k;
    private final LinearLayout l;
    private final TextView m;
    private final TextView n;
    private final WebImageView o;
    private final FrameLayout p;
    private final View q;
    @dzsi
    private final View r;
    private final FrameLayout s;
    private final LinearLayout t;
    private final ImageView u;
    private final View v;
    private final View w;
    private ViewPropertyAnimator x;
    private ViewPropertyAnimator y;
    private ViewPropertyAnimator z;

    public idc(Context context, @dzsi AttributeSet attributeSet) {
        this(context, attributeSet, new icu(), b);
    }

    @SafeVarargs
    @Deprecated
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(idc.class, cqmpVarArr);
    }

    @Deprecated
    public static <T extends cqkp> cqnf<T> b(cqlc<T, jib> cqlcVar) {
        return cqjv.g(iug.TOOLBAR_PROPERTIES, cqlcVar, a);
    }

    private static boolean e(CharSequence charSequence, int i, TextView textView) {
        if (charSequence == null || charSequence.length() <= 0) {
            textView.setVisibility(8);
            return false;
        }
        textView.setText(charSequence);
        textView.setVisibility(0);
        textView.setImportantForAccessibility(i);
        return true;
    }

    public final void c(boolean z, boolean z2) {
        this.f = true;
        if (z != this.A) {
            this.A = z;
            float f = true != z ? 0.0f : 1.0f;
            if (z2) {
                this.x = this.m.animate().alpha(f);
                this.y = this.n.animate().alpha(f);
                this.z = this.p.animate().alpha(f);
                this.x.start();
                this.y.start();
                this.z.start();
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.x;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            ViewPropertyAnimator viewPropertyAnimator2 = this.y;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
            }
            ViewPropertyAnimator viewPropertyAnimator3 = this.z;
            if (viewPropertyAnimator3 != null) {
                viewPropertyAnimator3.cancel();
            }
            this.m.setAlpha(f);
            this.n.setAlpha(f);
            this.p.setAlpha(f);
        }
    }

    public final cjqm d(View view, @dzsi cjtd cjtdVar) {
        cjql e;
        if (cjtdVar == null || (e = cjqg.e(view)) == null) {
            return cjqm.a;
        }
        return this.h.j(e, cjtdVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jcp
    public void setProperties(jib jibVar) {
        boolean z;
        dcdc dcdcVar;
        int i;
        int i2;
        jib jibVar2;
        CharSequence charSequence;
        cjtd cjtdVar;
        cqss cqssVar;
        Button button;
        int c;
        jib jibVar3 = jibVar;
        dbsk.t(jibVar3.n, "ActionMenuItems are null");
        if (this.f) {
            jhz e = jibVar.e();
            e.s = true != this.A ? 0 : 255;
            jibVar3 = e.b();
        }
        this.l.setClickable(jibVar3.h);
        this.l.setBackgroundColor(jibVar3.c(getContext()));
        this.A = jibVar3.x != 0;
        boolean e2 = e(jibVar3.u, jibVar3.I, this.m);
        boolean e3 = e(jibVar3.b, jibVar3.J, this.n);
        jic jicVar = jibVar3.c;
        WebImageView webImageView = this.o;
        if (jicVar != null) {
            jicVar.a(webImageView);
            webImageView.setVisibility(0);
            z = true;
        } else {
            webImageView.setVisibility(8);
            z = false;
        }
        float f = jibVar3.x / 255.0f;
        this.m.setAlpha(true != e2 ? 0.0f : f);
        this.n.setAlpha(true != e3 ? 0.0f : f);
        FrameLayout frameLayout = this.p;
        if (true != z) {
            f = 0.0f;
        }
        frameLayout.setAlpha(f);
        this.q.setOnClickListener(jibVar3.D);
        View view = this.r;
        if (view != null) {
            View.OnClickListener onClickListener = jibVar3.E;
            view.setOnClickListener(null);
        }
        Integer num = jibVar3.v;
        if (num != null) {
            this.m.setTextSize(num.intValue());
        }
        cqss cqssVar2 = jibVar3.w;
        if (cqssVar2 != null) {
            this.m.setTextColor(cqssVar2.b(this.k));
        }
        this.m.setMinLines(jibVar3.o.intValue());
        this.m.setMaxLines(jibVar3.p.intValue());
        if (jibVar3.p.intValue() == 1) {
            this.m.setSingleLine();
        }
        CharSequence charSequence2 = jibVar3.F;
        if (charSequence2 != null) {
            this.m.setContentDescription(charSequence2);
        }
        this.n.setMaxLines(jibVar3.q.intValue());
        cqss cqssVar3 = jibVar3.z;
        if (cqssVar3 != null) {
            this.n.setTextColor(cqssVar3.b(this.k));
        } else if (cqssVar2 != null) {
            this.n.setTextColor(cqssVar2.b(this.k));
        }
        if (jibVar3.q.intValue() == 1) {
            this.n.setSingleLine();
        }
        if (jibVar3.D != null) {
            this.q.setBackground(((gdh) irm.l).b(this.k));
        } else {
            this.q.setClickable(false);
        }
        View view2 = this.r;
        if (view2 != null) {
            View.OnClickListener onClickListener2 = jibVar3.E;
            view2.setClickable(false);
        }
        cqtd cqtdVar = jibVar3.i;
        cqtd cqtdVar2 = jibVar3.d;
        cqtd cqtdVar3 = jibVar3.e;
        cqsn cqsnVar = jibVar3.j;
        final jia jiaVar = jibVar3.A;
        final cjtd cjtdVar2 = jibVar3.k;
        cqss cqssVar4 = jibVar3.g;
        if (cqtdVar == null || cqsnVar == null || jiaVar == null) {
            dbsk.b(cqtdVar == null, "icon should be null");
            dbsk.b(cqsnVar == null, "contentDescription should be null");
            dbsk.b(jiaVar == null, "clickListener should be null");
            this.s.setVisibility(8);
            this.c.setVisibility(8);
        } else {
            if (cqssVar4 != null) {
                this.c.setImageDrawable(cqrt.i(cqtdVar, cqssVar4).a(this.k));
            } else {
                this.c.setImageDrawable(cqtdVar.a(this.k));
            }
            this.c.setBackground(cqtdVar3 != null ? cqtdVar3.a(this.k) : null);
            this.s.setBackground(cqtdVar2.a(this.k));
            this.s.setContentDescription(cqsnVar.a(this.k).toString());
            this.s.setOnClickListener(new View.OnClickListener(this, cjtdVar2, jiaVar) { // from class: icx
                private final idc a;
                private final cjtd b;
                private final jia c;

                {
                    this.a = this;
                    this.b = cjtdVar2;
                    this.c = jiaVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    idc idcVar = this.a;
                    cjtd cjtdVar3 = this.b;
                    jia jiaVar2 = this.c;
                    idcVar.d(idcVar.c, cjtdVar3);
                    jiaVar2.a(view3);
                }
            });
            this.s.setVisibility(0);
            this.c.setVisibility(0);
            if (cjtdVar2 != null) {
                cjqg.h(this.c, cjtdVar2);
                this.j.c(this.c);
            }
        }
        List<jho> list = jibVar3.n;
        cqtd cqtdVar4 = jibVar3.d;
        cqtd cqtdVar5 = jibVar3.e;
        int a2 = jibVar3.a(this.k);
        int i3 = jibVar3.s;
        View.OnClickListener onClickListener3 = jibVar3.G;
        CharSequence charSequence3 = jibVar3.H;
        cjtd cjtdVar3 = jibVar3.l;
        cqss cqssVar5 = jibVar3.g;
        dbsk.s(list);
        dbsk.a(true);
        dccx F = dcdc.F();
        dccx F2 = dcdc.F();
        int i4 = 0;
        boolean z2 = false;
        for (jho jhoVar : list) {
            if (z2) {
                F2.g(jhoVar);
            } else if (i4 >= i3 || jhoVar.e().intValue() == 0) {
                F2.g(jhoVar);
                z2 = true;
            } else {
                F.g(jhoVar);
                i4++;
            }
        }
        Pair create = Pair.create(F.f(), F2.f());
        this.t.removeAllViews();
        dcdc dcdcVar2 = (dcdc) create.first;
        int size = dcdcVar2.size();
        int i5 = 0;
        while (i5 < size) {
            final jho jhoVar2 = (jho) dcdcVar2.get(i5);
            dbsk.a((jhoVar2.b == null && jhoVar2.a(this.k) == null) ? false : true);
            cqtd cqtdVar6 = jhoVar2.b;
            if (cqtdVar6 != null) {
                dcdcVar = dcdcVar2;
                i = size;
                i2 = a2;
                int b2 = cqssVar5 != null ? cqssVar5.b(this.k) : jhoVar2.b(this.k);
                boolean z3 = jhoVar2.g;
                FrameLayout frameLayout2 = new FrameLayout(this.k);
                frameLayout2.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                ImageView imageView = new ImageView(this.k);
                jibVar2 = jibVar3;
                charSequence = charSequence3;
                cjtdVar = cjtdVar3;
                imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(jmj.a(this.k, 48), jmj.a(this.k, 48)));
                cqssVar = cqssVar5;
                imageView.setPadding(jmj.a(this.k, 12), jmj.a(this.k, 12), jmj.a(this.k, 12), jmj.a(this.k, 12));
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(b2);
                imageView.setImageDrawable(cqtdVar6.a(this.k));
                imageView.setAlpha(true != z3 ? 0.54f : 1.0f);
                imageView.setBackground(cqtdVar5 != null ? cqtdVar5.a(this.k) : null);
                frameLayout2.addView(imageView);
                button = frameLayout2;
            } else {
                CharSequence a3 = jhoVar2.a(this.k);
                if (jhoVar2.g) {
                    c = jhoVar2.b(this.k);
                } else {
                    c = jhoVar2.c(this.k);
                }
                Integer num2 = jhoVar2.h;
                dcdcVar = dcdcVar2;
                boolean z4 = jhoVar2.i;
                i = size;
                i2 = a2;
                button = new Button(this.k);
                button.setText(a3);
                button.setTextAppearance(this.k, R.style.QuButton);
                button.setAllCaps(z4);
                button.setTypeface(cqgm.d);
                button.setTextColor(c);
                if (num2 != null) {
                    button.setTextSize(num2.intValue());
                }
                jibVar2 = jibVar3;
                charSequence = charSequence3;
                cjtdVar = cjtdVar3;
                cqssVar = cqssVar5;
            }
            button.setAlpha(true != jhoVar2.g ? 0.54f : 1.0f);
            button.setContentDescription(jhoVar2.a);
            button.setEnabled(jhoVar2.g);
            if (!jhoVar2.g) {
                button.setImportantForAccessibility(4);
            }
            final cjtd cjtdVar4 = jhoVar2.c;
            if (cjtdVar4 != null) {
                cjqg.h(button, cjtdVar4);
                this.j.c(button);
            }
            button.setOnClickListener(new View.OnClickListener(this, cjtdVar4, jhoVar2) { // from class: icy
                private final idc a;
                private final cjtd b;
                private final jho c;

                {
                    this.a = this;
                    this.b = cjtdVar4;
                    this.c = jhoVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.c.d(view3, this.a.d(view3, this.b));
                }
            });
            button.setBackground(cqtdVar4.a(this.k));
            this.t.addView(button);
            i5++;
            dcdcVar2 = dcdcVar;
            size = i;
            a2 = i2;
            jibVar3 = jibVar2;
            charSequence3 = charSequence;
            cjtdVar3 = cjtdVar;
            cqssVar5 = cqssVar;
        }
        jib jibVar4 = jibVar3;
        int i6 = a2;
        CharSequence charSequence4 = charSequence3;
        cjtd cjtdVar5 = cjtdVar3;
        cqss cqssVar6 = cqssVar5;
        if (((dcdc) create.second).isEmpty()) {
            this.d.setVisibility(8);
            this.u.setVisibility(8);
            isc iscVar = this.e;
            if (iscVar != null) {
                iscVar.dismiss();
            }
        } else {
            this.d.setOnClickListener(new idb(this, (dcdc) create.second));
            this.u.setColorFilter(cqssVar6 != null ? cqssVar6.b(this.k) : i6, PorterDuff.Mode.SRC_ATOP);
            this.d.setBackground(cqtdVar4.a(this.k));
            this.u.setBackground(cqtdVar5 != null ? cqtdVar5.a(this.k) : null);
            cjqg.h(this.d, cjtdVar5);
            this.j.c(this.d);
            this.d.setVisibility(0);
            this.u.setVisibility(0);
            if (charSequence4 != null) {
                this.d.setContentDescription(charSequence4);
            }
        }
        int i7 = this.c.getVisibility() == 8 ? 0 : 1;
        int childCount = this.t.getChildCount() + (this.u.getVisibility() == 8 ? 0 : 1);
        int a4 = jmj.a(this.k, Math.abs(childCount - i7) * 48);
        if (i7 == childCount) {
            cjxu.a(this.q, 0);
            cjxu.b(this.q, 0);
        } else if (i7 < childCount) {
            cjxu.a(this.q, a4);
            cjxu.b(this.q, 0);
        } else {
            cjxu.a(this.q, 0);
            cjxu.b(this.q, a4);
        }
        this.w.setVisibility(true != jibVar4.b().booleanValue() ? 8 : 0);
        this.B.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.v.setAlpha(jibVar4.d() / 255.0f);
        this.v.setVisibility(true != jibVar4.C ? 8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public <T extends jbk> idc(Context context, @dzsi AttributeSet attributeSet, cqiw<T> cqiwVar, T t) {
        super(context, attributeSet);
        ((idd) bttc.a(idd.class, this)).wv(this);
        setId(R.id.toolbar_view);
        this.k = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.B = linearLayout;
        setOrientation(1);
        addView(linearLayout);
        this.g.a(cqiwVar, linearLayout).e(t);
        this.l = (LinearLayout) cqkx.e(linearLayout, icu.m, LinearLayout.class);
        this.s = (FrameLayout) cqkx.e(linearLayout, icu.a, FrameLayout.class);
        this.c = (ImageView) cqkx.e(linearLayout, icu.b, ImageView.class);
        this.m = (TextView) cqkx.e(linearLayout, icu.c, TextView.class);
        this.n = (TextView) cqkx.e(linearLayout, icu.f, TextView.class);
        this.o = (WebImageView) cqkx.e(linearLayout, icu.d, WebImageView.class);
        this.p = (FrameLayout) cqkx.e(linearLayout, icu.e, FrameLayout.class);
        this.q = cqkx.d(linearLayout, icu.g);
        this.r = cqkx.d(linearLayout, icu.h);
        this.t = (LinearLayout) cqkx.e(linearLayout, icu.i, LinearLayout.class);
        this.d = (FrameLayout) cqkx.e(linearLayout, icu.j, FrameLayout.class);
        this.u = (ImageView) cqkx.e(linearLayout, icu.k, ImageView.class);
        this.w = cqkx.d(linearLayout, icu.l);
        this.v = cqkx.d(linearLayout, ise.a);
    }
}
