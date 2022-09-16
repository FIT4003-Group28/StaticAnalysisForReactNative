package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
@Deprecated
/* renamed from: jlg  reason: default package */
/* loaded from: classes7.dex */
public class jlg extends LinearLayout implements jcp {
    static final cqkv a = new jli();
    private static final jbk h = new jld();
    public final ImageButton b;
    public boolean c;
    public cqkj d;
    public cjqy e;
    public isd f;
    public ite g;
    private final Context i;
    private final LinearLayout j;
    private final TextView k;
    private final TextView l;
    private final View m;
    @dzsi
    private final View n;
    private final ImageButton o;
    private final LinearLayout p;
    private final View q;
    private final View r;
    private ViewPropertyAnimator s;
    private boolean t;
    private final LinearLayout u;

    public jlg(Context context, @dzsi AttributeSet attributeSet) {
        this(context, attributeSet, new isf(), h);
    }

    @SafeVarargs
    @Deprecated
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(jlg.class, cqmpVarArr);
    }

    @Deprecated
    public static <T extends cqkp> cqnf<T> b(cqlc<T, jib> cqlcVar) {
        return cqjv.g(iug.TOOLBAR_PROPERTIES, cqlcVar, a);
    }

    private static void e(CharSequence charSequence, int i, TextView textView) {
        if (charSequence == null || charSequence.length() <= 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(charSequence);
            textView.setVisibility(0);
        }
        if (charSequence == null || charSequence.length() == 0 || i == 0) {
            textView.setAlpha(0.0f);
        } else {
            textView.setAlpha(i / 255.0f);
        }
    }

    public final void c(boolean z, boolean z2) {
        this.c = true;
        if (z != this.t) {
            this.t = z;
            float f = true != z ? 0.0f : 1.0f;
            if (z2) {
                ViewPropertyAnimator alpha = this.k.animate().alpha(f);
                this.s = alpha;
                alpha.start();
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.s;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            this.k.setAlpha(f);
        }
    }

    public final cjqm d(View view, @dzsi cjtd cjtdVar) {
        cjql e;
        if (cjtdVar == null || (e = cjqg.e(view)) == null) {
            return cjqm.a;
        }
        return this.e.j(e, cjtdVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jcp
    public void setProperties(jib jibVar) {
        int i;
        dcdc dcdcVar;
        int i2;
        int i3;
        jib jibVar2;
        ImageButton imageButton;
        jib jibVar3 = jibVar;
        dbsk.t(jibVar3.n, "ActionMenuItems are null");
        if (this.c) {
            jhz e = jibVar.e();
            e.s = true != this.t ? 0 : 255;
            jibVar3 = e.b();
        }
        this.j.setClickable(jibVar3.h);
        this.j.setBackgroundColor(jibVar3.c(getContext()));
        int i4 = jibVar3.x;
        this.t = i4 != 0;
        e(jibVar3.u, i4, this.k);
        e(jibVar3.b, jibVar3.x, this.l);
        this.m.setOnClickListener(jibVar3.D);
        View view = this.n;
        if (view != null) {
            View.OnClickListener onClickListener = jibVar3.E;
            view.setOnClickListener(null);
        }
        Integer num = jibVar3.v;
        if (num != null) {
            this.k.setTextSize(num.intValue());
        }
        cqss cqssVar = jibVar3.w;
        if (cqssVar != null) {
            this.k.setTextColor(cqssVar.b(this.i));
        }
        this.k.setMinLines(jibVar3.o.intValue());
        this.k.setMaxLines(jibVar3.p.intValue());
        if (jibVar3.p.intValue() == 1) {
            this.k.setSingleLine();
        }
        CharSequence charSequence = jibVar3.F;
        if (charSequence != null) {
            this.k.setContentDescription(charSequence);
        }
        this.l.setMaxLines(jibVar3.q.intValue());
        cqss cqssVar2 = jibVar3.z;
        if (cqssVar2 != null) {
            this.l.setTextColor(cqssVar2.b(this.i));
        } else if (cqssVar != null) {
            this.l.setTextColor(cqssVar.b(this.i));
        }
        if (jibVar3.q.intValue() == 1) {
            this.l.setSingleLine();
        }
        if (jibVar3.D != null) {
            this.m.setBackground(((gdh) irm.h).b(this.i));
        } else {
            this.m.setClickable(false);
        }
        View view2 = this.n;
        if (view2 != null) {
            View.OnClickListener onClickListener2 = jibVar3.E;
            view2.setClickable(false);
        }
        cqtd cqtdVar = jibVar3.i;
        cqtd cqtdVar2 = jibVar3.d;
        cqsn cqsnVar = jibVar3.j;
        final jia jiaVar = jibVar3.A;
        final cjtd cjtdVar = jibVar3.k;
        cqss cqssVar3 = jibVar3.g;
        if (cqtdVar == null || cqsnVar == null || jiaVar == null) {
            dbsk.b(cqtdVar == null, "icon should be null");
            dbsk.b(cqsnVar == null, "contentDescription should be null");
            dbsk.b(jiaVar == null, "clickListener should be null");
            this.o.setVisibility(8);
        } else {
            if (cqssVar3 != null) {
                this.o.setImageDrawable(cqrt.i(cqtdVar, cqssVar3).a(this.i));
            } else {
                this.o.setImageDrawable(cqtdVar.a(this.i));
            }
            if (cjtdVar != null) {
                cjqg.h(this.o, cjtdVar);
                this.g.c(this.o);
            }
            this.o.setBackground(cqtdVar2.a(this.i));
            this.o.setContentDescription(cqsnVar.a(this.i).toString());
            this.o.setVisibility(0);
            this.o.setOnClickListener(new View.OnClickListener(this, cjtdVar, jiaVar) { // from class: jlc
                private final jlg a;
                private final cjtd b;
                private final jia c;

                {
                    this.a = this;
                    this.b = cjtdVar;
                    this.c = jiaVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    jlg jlgVar = this.a;
                    cjtd cjtdVar2 = this.b;
                    jia jiaVar2 = this.c;
                    jlgVar.d(view3, cjtdVar2);
                    jiaVar2.a(view3);
                }
            });
        }
        List<jho> list = jibVar3.n;
        cqtd cqtdVar3 = jibVar3.d;
        int a2 = jibVar3.a(this.i);
        int i5 = jibVar3.s;
        View.OnClickListener onClickListener3 = jibVar3.G;
        CharSequence charSequence2 = jibVar3.H;
        cjtd cjtdVar2 = jibVar3.l;
        cqss cqssVar4 = jibVar3.g;
        dbsk.s(list);
        dbsk.a(true);
        dccx F = dcdc.F();
        dccx F2 = dcdc.F();
        boolean z = false;
        int i6 = 0;
        for (jho jhoVar : list) {
            if (z) {
                F2.g(jhoVar);
            } else if (i6 >= i5 || jhoVar.e().intValue() == 0) {
                F2.g(jhoVar);
                z = true;
            } else {
                F.g(jhoVar);
                i6++;
            }
        }
        Pair create = Pair.create(F.f(), F2.f());
        this.p.removeAllViews();
        dcdc dcdcVar2 = (dcdc) create.first;
        int size = dcdcVar2.size();
        int i7 = 0;
        while (i7 < size) {
            jho jhoVar2 = (jho) dcdcVar2.get(i7);
            dbsk.a((jhoVar2.b == null && jhoVar2.a(this.i) == null) ? false : true);
            cqtd cqtdVar4 = jhoVar2.b;
            if (cqtdVar4 != null) {
                dcdcVar = dcdcVar2;
                int b = cqssVar4 != null ? cqssVar4.b(this.i) : jhoVar2.b(this.i);
                ImageButton imageButton2 = new ImageButton(this.i);
                i2 = a2;
                i3 = size;
                imageButton2.setLayoutParams(new ViewGroup.MarginLayoutParams(jmj.a(this.i, 48), jmj.a(this.i, 48)));
                jibVar2 = jibVar3;
                imageButton2.setPadding(jmj.a(this.i, 12), jmj.a(this.i, 12), jmj.a(this.i, 12), jmj.a(this.i, 12));
                imageButton2.setScaleType(ImageView.ScaleType.CENTER);
                imageButton2.setColorFilter(b);
                imageButton2.setImageDrawable(cqtdVar4.a(this.i));
                imageButton = imageButton2;
            } else {
                CharSequence a3 = jhoVar2.a(this.i);
                int b2 = cqssVar4 != null ? cqssVar4.b(this.i) : jhoVar2.b(this.i);
                Integer num2 = jhoVar2.h;
                dcdcVar = dcdcVar2;
                Button button = new Button(this.i);
                button.setText(a3);
                button.setTextAppearance(this.i, R.style.QuButton);
                button.setTypeface(cqgm.d);
                button.setTextColor(b2);
                if (num2 != null) {
                    button.setTextSize(num2.intValue());
                }
                jibVar2 = jibVar3;
                i2 = a2;
                i3 = size;
                imageButton = button;
            }
            imageButton.setAlpha(true != jhoVar2.g ? 0.54f : 1.0f);
            imageButton.setContentDescription(jhoVar2.a);
            imageButton.setEnabled(jhoVar2.g);
            cjtd cjtdVar3 = jhoVar2.c;
            if (cjtdVar3 != null) {
                cjqg.h(imageButton, cjtdVar3);
                this.g.c(imageButton);
            }
            imageButton.setOnClickListener(new jle(this, cjtdVar3, jhoVar2));
            imageButton.setBackground(cqtdVar3.a(this.i));
            this.p.addView(imageButton);
            i7++;
            dcdcVar2 = dcdcVar;
            a2 = i2;
            size = i3;
            jibVar3 = jibVar2;
        }
        jib jibVar4 = jibVar3;
        int i8 = a2;
        if (((dcdc) create.second).isEmpty()) {
            i = 8;
            this.b.setVisibility(8);
        } else {
            i = 8;
            this.b.setOnClickListener(new jlf(this, cjtdVar2, (dcdc) create.second));
            this.b.setColorFilter(cqssVar4 != null ? cqssVar4.b(this.i) : i8, PorterDuff.Mode.SRC_ATOP);
            this.b.setBackground(cqtdVar3.a(this.i));
            cjqg.h(this.b, cjtdVar2);
            this.g.c(this.b);
            this.b.setVisibility(0);
            if (charSequence2 != null) {
                this.b.setContentDescription(charSequence2);
            }
        }
        this.r.setVisibility(true != jibVar4.b().booleanValue() ? 8 : 0);
        this.u.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.q.setAlpha(jibVar4.d() / 255.0f);
        View view3 = this.q;
        if (true == jibVar4.C) {
            i = 0;
        }
        view3.setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public <T extends jbk> jlg(Context context, @dzsi AttributeSet attributeSet, cqiw<T> cqiwVar, T t) {
        super(context, attributeSet);
        ((jlh) bttc.a(jlh.class, this)).wA(this);
        setId(R.id.toolbar_view);
        this.i = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.u = linearLayout;
        setOrientation(1);
        addView(linearLayout);
        this.d.a(cqiwVar, linearLayout).e(t);
        this.j = (LinearLayout) cqkx.e(linearLayout, isf.i, LinearLayout.class);
        this.o = (ImageButton) cqkx.e(linearLayout, isf.a, ImageButton.class);
        this.k = (TextView) cqkx.e(linearLayout, isf.b, TextView.class);
        this.l = (TextView) cqkx.e(linearLayout, isf.c, TextView.class);
        this.m = cqkx.d(linearLayout, isf.d);
        this.n = cqkx.d(linearLayout, isf.e);
        this.p = (LinearLayout) cqkx.e(linearLayout, isf.f, LinearLayout.class);
        this.b = (ImageButton) cqkx.e(linearLayout, isf.g, ImageButton.class);
        this.r = cqkx.d(linearLayout, isf.h);
        this.q = cqkx.d(linearLayout, ise.a);
    }
}
