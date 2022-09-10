package com.google.android.apps.gmm.base.views.fivestar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.gmm.base.views.fivestar.FiveStarView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class FiveStarView extends ViewGroup implements View.OnClickListener, View.OnTouchListener {
    public static final /* synthetic */ int i = 0;
    private static final cqtv j = cqrp.d(6.0d);
    Drawable a;
    Drawable b;
    Drawable c;
    final jei[] d;
    public final PopupWindow e;
    int f;
    int g;
    public float h;
    private int k;
    private float l;
    private float m;
    private boolean n;
    private boolean o;
    @dzsi
    private String p;
    private boolean q;
    @dzsi
    private jfp r;
    private boolean s;
    private float t;
    private float u;
    private float v;
    private boolean w;

    public FiveStarView(Context context) {
        this(context, jfo.d);
    }

    public static <T extends cqkp> cqmn<T> a() {
        return cqmn.a(ibq.q(), ibq.y(), cqgr.aZ(false), cqgr.bG(j));
    }

    public static <T extends cqkp> cqmn<T> b() {
        return cqmn.a(ibq.q(), ibq.y(), cqgr.aZ(false), cqgr.bR(j));
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> e(final cqlc<T, Float> cqlcVar, final cqlc<T, Integer> cqlcVar2, cqmp<T>... cqmpVarArr) {
        cqmj<T> gd = cqgr.gd(cqgr.bw(16), cqgr.gd(cqgr.aJ(16), cqgr.bp(-1), cqic.c(new cqlc(cqlcVar) { // from class: jfh
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar3 = this.a;
                boolean z = true;
                if (!Float.isNaN(((Float) cqlcVar3.a(cqkpVar)).floatValue()) && ((Float) cqlcVar3.a(cqkpVar)).floatValue() > 0.0f) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, new cqmp[0]), cqgr.gq(a(), cqgr.bG(cqrp.d(3.0d)), cqgr.eK(cqiq.c("%.1f", cqiq.h(cqlcVar))), cqgr.U(cqiq.e(Integer.valueOf((int) R.plurals.ACCESSIBILITY_DECIMAL_STARS), 5, cqiq.h(cqlcVar)))), cqgr.gc(cqgr.eE(jfo.d.i())), cqgr.gq(cqgr.aF(new cqlc(cqlcVar2) { // from class: jfi
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar3 = this.a;
                int i2 = FiveStarView.i;
                return Boolean.valueOf(((Integer) cqlcVar3.a(cqkpVar)).intValue() == 0);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), b(), cqgr.eK(cqiq.f(R.plurals.REVIEW_COUNT_SHORT, cqlcVar2, cqiq.h(cqlcVar2))), cqgr.U(cqiq.f(R.plurals.REVIEW_COUNT_ACCESSIBILITY, cqlcVar2, cqiq.h(cqlcVar2))))));
        gd.f(cqmpVarArr);
        return gd;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> f(final cqlc<T, Float> cqlcVar, final cqlc<T, Integer> cqlcVar2, cqmp<T>... cqmpVarArr) {
        final cqlc cqlcVar3 = new cqlc(cqlcVar) { // from class: jfj
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar4 = this.a;
                boolean z = true;
                if (!Float.isNaN(((Float) cqlcVar4.a(cqkpVar)).floatValue()) && ((Float) cqlcVar4.a(cqkpVar)).floatValue() > 0.0f) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
        cqmj<T> gd = cqgr.gd(cqgr.bw(16), cqgr.gd(cqic.c(cqlcVar3, new cqmp[0]), cqgr.gq(a(), cqgr.eK(cqiq.c("%.1f", cqiq.h(cqlcVar))), cqgr.aW(2)), g(cqlcVar, jfo.d)), cqgr.gq(cqic.c(new cqlc(cqlcVar2) { // from class: jfk
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar4 = this.a;
                int i2 = FiveStarView.i;
                return Boolean.valueOf(((Integer) cqlcVar4.a(cqkpVar)).intValue() == 0);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, new cqmp[0]), b(), cqjv.l(cqlcVar3, cqgr.eK(cqiq.f(R.plurals.REVIEW_COUNT_LONG, cqlcVar2, cqiq.h(cqlcVar2))), cqgr.eK(cqiq.f(R.plurals.REVIEW_COUNT_SHORT, cqlcVar2, cqiq.h(cqlcVar2)))), cqgr.U(cqiq.f(R.plurals.REVIEW_COUNT_ACCESSIBILITY, cqlcVar2, cqiq.h(cqlcVar2)))), cqgr.gq(cqic.c(new cqlc(cqlcVar2, cqlcVar3) { // from class: jfl
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar2;
                this.b = cqlcVar3;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar4 = this.a;
                cqlc cqlcVar5 = this.b;
                int i2 = FiveStarView.i;
                boolean z = true;
                if (((Integer) cqlcVar4.a(cqkpVar)).intValue() <= 0 && ((Boolean) cqlcVar5.a(cqkpVar)).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, new cqmp[0]), cqgr.bp(-2), cqgr.eL(Integer.valueOf((int) R.string.REVIEW_COUNT_ZERO)), irn.m(), cqgr.aZ(false), ibq.y()));
        gd.f(cqmpVarArr);
        return gd;
    }

    public static <T extends cqkp> cqmj<T> g(cqlc<T, Float> cqlcVar, jfo jfoVar) {
        cqmj gm = cqgr.gm(cqgr.ce(jfoVar.g()));
        cqnf q = itj.q();
        return cqgr.gd(cqgr.bw(17), cqgr.cd(-2), cqgr.U(cqiq.e(Integer.valueOf((int) R.plurals.ACCESSIBILITY_DECIMAL_STARS), 5, cqiq.h(cqlcVar))), cqgr.gc(q, s(jfoVar, cqlcVar, 0)), gm, cqgr.gc(q, s(jfoVar, cqlcVar, 1)), gm, cqgr.gc(q, s(jfoVar, cqlcVar, 2)), gm, cqgr.gc(q, s(jfoVar, cqlcVar, 3)), gm, cqgr.gc(q, s(jfoVar, cqlcVar, 4)));
    }

    private final void h(Context context) {
        this.f = ViewConfiguration.get(context).getScaledTouchSlop();
        this.g = ibn.a().e(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        int i2 = 0;
        while (i2 < 5) {
            jei jeiVar = new jei(context);
            this.d[i2] = jeiVar;
            jeiVar.setLayoutParams(layoutParams);
            jeiVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            i2++;
            jeiVar.setTag(Integer.valueOf(i2));
            addView(jeiVar);
        }
        i(this.n);
        k();
        j();
    }

    private final void i(boolean z) {
        this.n = z;
        setFocusable(z);
        l(z);
        for (int i2 = 0; i2 < 5; i2++) {
            this.d[i2].setPresentation(!z);
            jei jeiVar = this.d[i2];
            FiveStarView fiveStarView = true != z ? null : this;
            jeiVar.setOnClickListener(fiveStarView);
            this.d[i2].setOnTouchListener(fiveStarView);
            this.d[i2].setClickable(z);
            this.d[i2].setFocusable(z);
            this.d[i2].setMinimumHeight(z ? this.g : 0);
            this.d[i2].setMinimumWidth(z ? this.g : 0);
        }
    }

    private final void j() {
        int i2 = this.k;
        int i3 = i2 / 2;
        int i4 = i2 - i3;
        boolean a = bvox.a(this);
        for (int i5 = 0; i5 < 5; i5++) {
            int i6 = (!this.n || !a) ? i5 : 4 - i5;
            if (i6 == 0) {
                this.d[i5].setPadding(0, 0, i4, 0);
            } else if (i6 == 4) {
                this.d[i5].setPadding(i3, 0, 0, 0);
            } else {
                this.d[i5].setPadding(i3, 0, i4, 0);
            }
        }
    }

    private final void k() {
        int i2 = 0;
        while (true) {
            jei[] jeiVarArr = this.d;
            int length = jeiVarArr.length;
            if (i2 < 5) {
                jei jeiVar = jeiVarArr[i2];
                float f = i2;
                float f2 = this.m;
                jeiVar.setImageDrawable(f <= (-0.75f) + f2 ? this.a : (f > f2 + (-0.25f) || this.n) ? this.c : this.b);
                i2++;
            } else {
                return;
            }
        }
    }

    private final void l(boolean z) {
        String str = null;
        if (z) {
            int i2 = 0;
            while (i2 < 5) {
                int i3 = i2 + 1;
                String string = getResources().getString(R.string.ACCESSIBILITY_ADD_A_REVIEW_WITH_STARS, jex.b(getResources(), i3));
                bvsi bvsiVar = new bvsi(getResources());
                bvsiVar.c(this.p);
                bvsiVar.c(string);
                this.d[i2].setContentDescription(bvsiVar.toString());
                i2 = i3;
            }
        } else {
            jei[] jeiVarArr = this.d;
            int length = jeiVarArr.length;
            for (int i4 = 0; i4 < 5; i4++) {
                jeiVarArr[i4].setContentDescription(null);
            }
            str = jex.a(getResources(), this.l);
        }
        setContentDescription(str);
    }

    private final void m(float f) {
        this.m = f;
        k();
        invalidate();
    }

    @dzsi
    private final View n(View view, MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float rawY = this.u + (this.v - motionEvent.getRawY());
        int i2 = 0;
        if (!this.w) {
            if (Math.abs(rawY - this.u) > this.f) {
                o(false);
                return null;
            }
            this.w = Math.abs(x - this.t) > ((float) this.f);
        } else if (Math.abs(rawY - this.u) > this.g) {
            return null;
        }
        float left = view.getLeft() + x;
        if (!bvox.a(this)) {
            while (true) {
                jei[] jeiVarArr = this.d;
                int length = jeiVarArr.length;
                if (i2 >= 5) {
                    break;
                } else if (left < jeiVarArr[i2].getRight()) {
                    return this.d[i2];
                } else {
                    i2++;
                }
            }
        } else {
            while (true) {
                jei[] jeiVarArr2 = this.d;
                int length2 = jeiVarArr2.length;
                if (i2 >= 5) {
                    break;
                } else if (left >= jeiVarArr2[i2].getLeft()) {
                    return this.d[i2];
                } else {
                    i2++;
                }
            }
        }
        jei[] jeiVarArr3 = this.d;
        int length3 = jeiVarArr3.length;
        return jeiVarArr3[4];
    }

    private final void o(boolean z) {
        ViewParent parent;
        if (this.q || (parent = getParent()) == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(z);
    }

    private static PopupWindow p(Context context) {
        int e = irh.c().e(context);
        TextView textView = new TextView(context);
        textView.setBackgroundColor(context.getResources().getColor(R.color.qu_daynight_grey_700));
        textView.setAlpha(0.9f);
        textView.setTextAppearance(context, R.style.quantum_text_body_2_black);
        textView.setTypeface(cqgm.d);
        textView.setTextColor(context.getResources().getColor(R.color.qu_daynight_grey_white_1000));
        textView.setGravity(17);
        textView.setPadding(e, 0, e, 0);
        return new PopupWindow(textView, -2, jmj.a(context, 32));
    }

    private static int q(View view) {
        return ((view.getMeasuredWidth() + view.getPaddingLeft()) - view.getPaddingRight()) / 2;
    }

    private static int r(View view) {
        Object tag = view.getTag();
        dbsk.s(tag);
        return ((Integer) tag).intValue();
    }

    private static <T extends cqkp> cqnf<T> s(final jfo jfoVar, final cqlc<T, Float> cqlcVar, final int i2) {
        return cqgr.eG(new cqlc(cqlcVar, jfoVar, i2) { // from class: jfm
            private final cqlc a;
            private final jfo b;
            private final int c;

            {
                this.a = cqlcVar;
                this.b = jfoVar;
                this.c = i2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar2 = this.a;
                jfo jfoVar2 = this.b;
                int i3 = this.c;
                if (Float.isNaN(((Float) cqlcVar2.a(cqkpVar)).floatValue())) {
                    return jfoVar2.k();
                }
                float f = i3;
                if (((Float) cqlcVar2.a(cqkpVar)).floatValue() > 0.74999f + f) {
                    return jfoVar2.i();
                }
                if (((Float) cqlcVar2.a(cqkpVar)).floatValue() > f + 0.24999f) {
                    return jfoVar2.j();
                }
                return jfoVar2.k();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
    }

    final void c(int i2) {
        if (this.e.isShowing()) {
            if (i2 == 0) {
                this.e.dismiss();
                return;
            }
            new Handler().postDelayed(new Runnable(this) { // from class: jff
                private final FiveStarView a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FiveStarView fiveStarView = this.a;
                    if (fiveStarView.e.isShowing()) {
                        fiveStarView.e.dismiss();
                    }
                }
            }, i2);
        }
    }

    final void d(final View view) {
        c(0);
        int r = r(view);
        String str = null;
        if (r > 0 && r <= 5 && this.o) {
            str = getResources().getStringArray(R.array.REVIEW_RATING_STAR_TEXT_DESCRIPTIONS)[r - 1];
        }
        if (str != null) {
            View contentView = this.e.getContentView();
            if (contentView instanceof TextView) {
                TextView textView = (TextView) contentView;
                textView.setText(str);
                textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                if (textView.getLayoutParams() == null) {
                    textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                }
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                this.e.showAtLocation(view, 0, iArr[0] + (q(view) - (textView.getMeasuredWidth() / 2)), iArr[1] + (-jmj.a(getContext(), 56)));
            }
        }
        int r2 = r(view);
        if (r2 == 1 || r2 == 5) {
            view.setPivotX(q(view));
            view.setPivotY(view.getMeasuredHeight() / 2);
        }
        view.animate().setDuration(160L).scaleX(this.h * 1.2f).scaleY(1.2f).withEndAction(new Runnable(this, view) { // from class: jfg
            private final FiveStarView a;
            private final View b;

            {
                this.a = this;
                this.b = view;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.b.animate().setDuration(160L).scaleX(this.a.h).scaleY(1.0f).start();
            }
        }).start();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!this.n || equals(view)) {
            return;
        }
        int r = r(view);
        float f = r;
        setValue(f);
        cpv.a.f(this, getResources().getString(R.string.ACCESSIBILITY_STARS_SELECTED, jex.b(getResources(), r)));
        jfp jfpVar = this.r;
        if (jfpVar == null) {
            return;
        }
        jfpVar.a(f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (z) {
            int i6 = 0;
            for (int i7 = 0; i7 < 5; i7++) {
                i6 += this.d[i7].getMeasuredWidth();
            }
            int i8 = i4 - i2;
            int i9 = (i8 - i6) / 4;
            boolean a = bvox.a(this);
            if (!a) {
                i8 = 0;
            }
            for (int i10 = 0; i10 < 5; i10++) {
                int measuredWidth = this.d[i10].getMeasuredWidth();
                int measuredHeight = this.d[i10].getMeasuredHeight();
                int i11 = ((i5 - i3) - measuredHeight) / 2;
                if (a) {
                    this.d[i10].layout(i8 - measuredWidth, i11, i8, measuredHeight + i11);
                    i8 -= measuredWidth + i9;
                } else {
                    this.d[i10].layout(i8, i11, i8 + measuredWidth, measuredHeight + i11);
                    i8 += measuredWidth + i9;
                }
                float f = 1.0f;
                if (this.n) {
                    this.h = 1.0f;
                } else {
                    if (true == a) {
                        f = -1.0f;
                    }
                    this.h = f;
                    this.d[i10].setScaleX(f);
                }
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < 5; i6++) {
            this.d[i6].measure(getChildMeasureSpec(i2, 0, -2), getChildMeasureSpec(i3, 0, -1));
            i4 += this.d[i6].getMeasuredWidth();
            i5 = Math.max(i5, this.d[i6].getMeasuredHeight());
        }
        setMeasuredDimension(resolveSizeAndState(i4, i2, 0), resolveSizeAndState(i5, i3, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r5, android.view.MotionEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.n
            r1 = 0
            if (r0 == 0) goto L93
            int r0 = r6.getActionMasked()
            r2 = 1
            if (r0 != 0) goto L37
            float r0 = r6.getX()
            r4.t = r0
            float r0 = r6.getY()
            r4.u = r0
            float r0 = r6.getRawY()
            r4.v = r0
            android.view.View r5 = r4.n(r5, r6)
            if (r5 == 0) goto L2f
            int r6 = r(r5)
            float r6 = (float) r6
            r4.m(r6)
            r4.d(r5)
        L2f:
            r4.s = r2
            r4.w = r1
            r4.o(r2)
            goto L92
        L37:
            if (r0 != r2) goto L59
            boolean r0 = r4.s
            if (r0 == 0) goto L67
            r4.s = r1
            jei[] r5 = r4.d
            float r6 = r4.m
            double r0 = (double) r6
            double r0 = java.lang.Math.ceil(r0)
            int r6 = (int) r0
            int r6 = r6 + (-1)
            r5 = r5[r6]
            r5.performClick()
            r4.performClick()
            r5 = 300(0x12c, float:4.2E-43)
            r4.c(r5)
            goto L92
        L59:
            r3 = 3
            if (r0 != r3) goto L67
            float r5 = r4.l
            r4.m(r5)
            r4.s = r1
            r4.c(r1)
            goto L92
        L67:
            android.view.View r5 = r4.n(r5, r6)
            if (r5 != 0) goto L78
            float r5 = r4.l
            r4.m(r5)
            r4.s = r1
            r4.c(r1)
            goto L92
        L78:
            boolean r6 = r4.s
            if (r6 == 0) goto L92
            int r6 = r(r5)
            float r6 = (float) r6
            float r0 = r4.m
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L92
            int r6 = r(r5)
            float r6 = (float) r6
            r4.m(r6)
            r4.d(r5)
        L92:
            return r2
        L93:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gmm.base.views.fivestar.FiveStarView.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void setAccessibilityLabel(@dzsi String str) {
        if (dbsd.a(this.p, str)) {
            return;
        }
        this.p = str;
        l(this.n);
    }

    public void setAllowParentInterceptTouchEvent(boolean z) {
        this.q = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i2 = 0; i2 < 5; i2++) {
            this.d[i2].setEnabled(z);
        }
    }

    public void setListener(@dzsi jfp jfpVar) {
        this.r = jfpVar;
    }

    public void setProperties(jfo jfoVar) {
        i(jfoVar.a());
        this.o = jfoVar.b();
        Context context = getContext();
        this.c = jfoVar.k().a(context);
        this.b = jfoVar.j().a(context);
        this.a = jfoVar.i().a(context);
        k();
        invalidate();
        this.k = jfoVar.g().e(getContext());
        j();
    }

    public void setValue(float f) {
        if (this.l == f) {
            return;
        }
        if (f < 0.0f || f > 5.0f) {
            throw new IllegalArgumentException("Number of stars given out of range of widget.");
        }
        this.l = f;
        l(this.n);
        if (this.s) {
            return;
        }
        m(f);
    }

    public FiveStarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        jfo jfoVar;
        this.k = 0;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = false;
        this.o = false;
        this.q = false;
        this.d = new jei[5];
        this.s = false;
        this.w = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bdyt.a);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        this.n = z;
        if (z) {
            jfoVar = jfo.f;
        } else {
            jfoVar = jfo.d;
        }
        if (obtainStyledAttributes.hasValue(3)) {
            jfn h = jfoVar.h();
            h.h(cqrp.c(obtainStyledAttributes.getDimensionPixelSize(3, 0)));
            jfoVar = h.a();
        }
        this.c = jfoVar.k().a(context);
        this.b = jfoVar.j().a(context);
        this.a = jfoVar.i().a(context);
        this.o = obtainStyledAttributes.getBoolean(2, jfoVar.b());
        this.k = obtainStyledAttributes.getDimensionPixelSize(0, jfoVar.g().e(context));
        obtainStyledAttributes.recycle();
        this.e = p(context);
        h(context);
    }

    public FiveStarView(Context context, jfo jfoVar) {
        super(context);
        this.k = 0;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = false;
        this.o = false;
        this.q = false;
        this.d = new jei[5];
        this.s = false;
        this.w = false;
        this.n = jfoVar.a();
        this.o = jfoVar.b();
        this.c = jfoVar.k().a(context);
        this.b = jfoVar.j().a(context);
        this.a = jfoVar.i().a(context);
        this.k = jfoVar.g().e(context);
        this.e = p(context);
        h(context);
    }
}
