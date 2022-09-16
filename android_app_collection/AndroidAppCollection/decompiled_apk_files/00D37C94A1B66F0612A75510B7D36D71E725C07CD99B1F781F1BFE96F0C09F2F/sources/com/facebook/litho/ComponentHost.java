package com.facebook.litho;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ComponentHost extends dmr implements dba {
    private cyt A;
    private boolean B;
    private dah C;
    public age a;
    public age b;
    public age c;
    public age d;
    public age e;
    public age f;
    public ArrayList g;
    public Object h;
    public SparseArray i;
    public boolean j;
    public cyu k;
    public czc l;
    public cyw m;
    public czd n;
    public ddt o;
    public boolean p;
    public boolean q;
    private CharSequence r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private final cyx x;
    private int[] y;
    private boolean z;

    public ComponentHost(cyv cyvVar) {
        super(cyvVar.b);
        this.x = new cyx(this);
        this.y = new int[0];
        this.B = false;
        this.p = false;
        this.q = false;
        setWillNotDraw(false);
        setChildrenDrawingOrderEnabled(true);
        p(cyf.b(cyvVar.b));
        this.a = new age();
        this.c = new age();
        this.e = new age();
        this.g = new ArrayList();
    }

    private final boolean z() {
        dms c = c();
        return c != null && dbn.a(c).b.ae();
    }

    public final int a() {
        age ageVar = this.a;
        if (ageVar == null) {
            return 0;
        }
        return ageVar.c();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void addView(View view) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    protected final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    protected final void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Override // defpackage.dba
    public final dah b() {
        return this.C;
    }

    public final dms c() {
        for (int i = 0; i < a(); i++) {
            dms d = d(i);
            if (d != null && dbn.a(d).d()) {
                return d;
            }
        }
        return null;
    }

    public final dms d(int i) {
        return (dms) this.a.g(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View view;
        cyx cyxVar = this.x;
        cyxVar.a = canvas;
        cyxVar.b = 0;
        age ageVar = cyxVar.d.a;
        cyxVar.c = ageVar == null ? 0 : ageVar.c();
        super.dispatchDraw(canvas);
        if (this.x.b()) {
            this.x.a();
        }
        this.x.a = null;
        ArrayList arrayList = this.g;
        int size = arrayList == null ? 0 : arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((dms) this.g.get(i)).a;
            if (obj instanceof Drawable) {
                ((Drawable) obj).draw(canvas);
            }
        }
        if (dfz.b) {
            if (czu.g == null) {
                czu.g = new Paint();
                czu.g.setColor(1724029951);
            }
            if (czu.h == null) {
                czu.h = new Paint();
                czu.h.setColor(1154744270);
            }
            if (czu.p(this)) {
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), czu.g);
            }
            for (int a = a() - 1; a >= 0; a--) {
                dms d = d(a);
                cyr cyrVar = dbn.a(d).b;
                if (cyr.z(cyrVar) && !cyr.v(cyrVar)) {
                    if (czu.p((View) d.a)) {
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), czu.h);
                    }
                }
            }
            ddt ddtVar = this.o;
            if (ddtVar != null) {
                Paint paint = czu.h;
                int c = ddtVar.b.c();
                while (true) {
                    c--;
                    if (c < 0) {
                        break;
                    }
                    canvas.drawRect(((dds) ddtVar.b.g(c)).e, paint);
                }
            }
        }
        if (dfz.d) {
            Resources resources = getResources();
            if (czu.i == null) {
                czu.i = new Rect();
            }
            if (czu.j == null) {
                czu.j = new Paint();
                czu.j.setStyle(Paint.Style.STROKE);
                czu.j.setStrokeWidth(czu.n(resources, 1));
            }
            if (czu.k == null) {
                czu.k = new Paint();
                czu.k.setStyle(Paint.Style.FILL);
                czu.k.setStrokeWidth(czu.n(resources, 2));
            }
            for (int a2 = a() - 1; a2 >= 0; a2--) {
                dms d2 = d(a2);
                cyr cyrVar2 = dbn.a(d2).b;
                Object obj2 = d2.a;
                if (!(cyrVar2 instanceof daj)) {
                    if (obj2 instanceof View) {
                        View view2 = (View) obj2;
                        czu.i.left = view2.getLeft();
                        czu.i.top = view2.getTop();
                        czu.i.right = view2.getRight();
                        czu.i.bottom = view2.getBottom();
                    } else if (obj2 instanceof Drawable) {
                        czu.i.set(((Drawable) obj2).getBounds());
                    }
                    czu.j.setColor(true != cyr.v(cyrVar2) ? -1711341568 : -1711341313);
                    Paint paint2 = czu.j;
                    Rect rect = czu.i;
                    int strokeWidth = ((int) paint2.getStrokeWidth()) / 2;
                    canvas.drawRect(rect.left + strokeWidth, rect.top + strokeWidth, rect.right - strokeWidth, rect.bottom - strokeWidth, paint2);
                    czu.k.setColor(true != cyr.v(cyrVar2) ? -16776961 : -16711681);
                    Paint paint3 = czu.k;
                    Rect rect2 = czu.i;
                    int strokeWidth2 = (int) czu.k.getStrokeWidth();
                    int min = Math.min(Math.min(czu.i.width(), czu.i.height()) / 3, czu.n(resources, 12));
                    czu.o(canvas, paint3, rect2.left, rect2.top, strokeWidth2, strokeWidth2, min);
                    int i2 = -strokeWidth2;
                    czu.o(canvas, paint3, rect2.left, rect2.bottom, strokeWidth2, i2, min);
                    czu.o(canvas, paint3, rect2.right, rect2.top, i2, strokeWidth2, min);
                    czu.o(canvas, paint3, rect2.right, rect2.bottom, i2, i2, min);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return (this.A != null && z() && this.A.t(motionEvent)) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        dah dahVar = this.C;
        if (dahVar != null) {
            dahVar.a(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        age ageVar = this.e;
        int c = ageVar == null ? 0 : ageVar.c();
        for (int i = 0; i < c; i++) {
            dms dmsVar = (dms) this.e.g(i);
            dbn a = dbn.a(dmsVar);
            hz.s(this, (Drawable) dmsVar.a, a.d, a.l);
        }
    }

    public final List e() {
        CharSequence charSequence;
        ArrayList arrayList = new ArrayList();
        age ageVar = this.e;
        int c = ageVar == null ? 0 : ageVar.c();
        for (int i = 0; i < c; i++) {
            dab dabVar = dbn.a((dms) this.e.g(i)).l;
            if (dabVar != null && (charSequence = dabVar.a) != null) {
                arrayList.add(charSequence);
            }
        }
        CharSequence charSequence2 = this.r;
        if (charSequence2 != null) {
            arrayList.add(charSequence2);
        }
        return arrayList;
    }

    public final List f() {
        age ageVar = this.e;
        int c = ageVar == null ? 0 : ageVar.c();
        ArrayList arrayList = null;
        for (int i = 0; i < c; i++) {
            dms dmsVar = (dms) this.e.g(i);
            if ((dbn.a(dmsVar).d & 4) != 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((Drawable) dmsVar.a);
            }
        }
        return arrayList;
    }

    public final void g() {
        if (this.g == null) {
            this.g = new ArrayList();
        }
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        if (this.j) {
            int childCount = getChildCount();
            if (this.y.length < childCount) {
                this.y = new int[childCount + 5];
            }
            age ageVar = this.c;
            int c = ageVar == null ? 0 : ageVar.c();
            int i3 = 0;
            int i4 = 0;
            while (i3 < c) {
                this.y[i4] = indexOfChild((View) ((dms) this.c.g(i3)).a);
                i3++;
                i4++;
            }
            ArrayList arrayList = this.g;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = ((dms) this.g.get(i5)).a;
                if (obj instanceof View) {
                    this.y[i4] = indexOfChild((View) obj);
                    i4++;
                }
            }
            this.j = false;
        }
        if (this.x.b()) {
            this.x.a();
        }
        return this.y[i2];
    }

    @Override // android.view.View
    public final CharSequence getContentDescription() {
        return this.r;
    }

    @Override // android.view.View
    public Object getTag() {
        Object obj = this.h;
        return obj != null ? obj : super.getTag();
    }

    public TextContent getTextContent() {
        List list;
        i();
        age ageVar = this.a;
        int c = ageVar.c();
        if (c == 1) {
            list = Collections.singletonList(((dms) ageVar.g(0)).a);
        } else {
            ArrayList arrayList = new ArrayList(c);
            for (int i = 0; i < c; i++) {
                arrayList.add(((dms) ageVar.g(i)).a);
            }
            list = arrayList;
        }
        return hz.m(list);
    }

    public final void h() {
        if (this.e == null) {
            this.e = new age();
        }
    }

    public final void i() {
        if (this.a == null) {
            this.a = new age();
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.v) {
            this.s = true;
        } else {
            super.invalidate();
        }
    }

    public final void j() {
        if (this.c == null) {
            this.c = new age();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        age ageVar = this.e;
        int c = ageVar == null ? 0 : ageVar.c();
        for (int i = 0; i < c; i++) {
            ((Drawable) ((dms) this.e.g(i)).a).jumpToCurrentState();
        }
    }

    public final void k() {
        if (!this.B) {
            return;
        }
        if (this.v) {
            this.t = true;
        } else if (this.A == null || !z()) {
        } else {
            this.A.n();
        }
    }

    public final void l(int i, dms dmsVar) {
        Rect a;
        deq deqVar = dbn.a(dmsVar).a;
        if (deqVar == null || (a = deqVar.a()) == null || equals(dmsVar.a)) {
            return;
        }
        if (this.o == null) {
            ddt ddtVar = new ddt(this);
            this.o = ddtVar;
            setTouchDelegate(ddtVar);
        }
        ddt ddtVar2 = this.o;
        View view = (View) dmsVar.a;
        age ageVar = ddtVar2.b;
        dds ddsVar = (dds) dds.a.a();
        if (ddsVar == null) {
            ddsVar = new dds();
        }
        ddsVar.b = view;
        ddsVar.d = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        ddsVar.e.set(a);
        ddsVar.f.set(a);
        Rect rect = ddsVar.f;
        int i2 = -ddsVar.d;
        rect.inset(i2, i2);
        ageVar.k(i, ddsVar);
    }

    public final void m(int i, dms dmsVar) {
        int a;
        deq deqVar = dbn.a(dmsVar).a;
        if (deqVar == null || this.o == null || deqVar.a() == null || equals(dmsVar.a)) {
            return;
        }
        ddt ddtVar = this.o;
        age ageVar = ddtVar.c;
        if (ageVar == null || (a = ageVar.a(i)) < 0) {
            int a2 = ddtVar.b.a(i);
            ddtVar.b.m(a2);
            ((dds) ddtVar.b.g(a2)).a();
            return;
        }
        ddtVar.c.m(a);
        ((dds) ddtVar.c.g(a)).a();
    }

    public final void n(int i, dms dmsVar, Rect rect) {
        Object obj = dmsVar.a;
        boolean z = true;
        if (obj instanceof Drawable) {
            h();
            this.e.k(i, dmsVar);
            Drawable drawable = (Drawable) dmsVar.a;
            dbn a = dbn.a(dmsVar);
            int i2 = a.d;
            dab dabVar = a.l;
            if (getVisibility() != 0) {
                z = false;
            }
            drawable.setVisible(z, false);
            drawable.setCallback(this);
            hz.s(this, drawable, i2, dabVar);
            invalidate(rect);
        } else if (obj instanceof View) {
            j();
            this.c.k(i, dmsVar);
            View view = (View) obj;
            view.setDuplicateParentStateEnabled(dbn.e(dbn.a(dmsVar).d));
            this.j = true;
            if (!(view instanceof ComponentHost) || view.getParent() != this) {
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(generateDefaultLayoutParams());
                }
                if (this.z) {
                    super.addViewInLayout(view, -1, view.getLayoutParams(), true);
                } else {
                    super.addView(view, -1, view.getLayoutParams());
                }
            } else {
                lj.z(view);
                view.setVisibility(0);
            }
            l(i, dmsVar);
        }
        i();
        this.a.k(i, dmsVar);
        hz.n(dmsVar);
    }

    @Override // defpackage.dmr
    public final void o(dms dmsVar, int i, int i2) {
        ddt ddtVar;
        deq deqVar = dbn.a(dmsVar).a;
        if (deqVar != null && deqVar.a() != null && (ddtVar = this.o) != null) {
            if (ddtVar.b.e(i2) != null) {
                if (ddtVar.c == null) {
                    age ageVar = (age) ddt.a.a();
                    if (ageVar == null) {
                        ageVar = new age(4);
                    }
                    ddtVar.c = ageVar;
                }
                hz.q(i2, ddtVar.b, ddtVar.c);
            }
            hz.o(i, i2, ddtVar.b, ddtVar.c);
            age ageVar2 = ddtVar.c;
            if (ageVar2 != null && ageVar2.c() == 0) {
                ddt.a.b(ddtVar.c);
                ddtVar.c = null;
            }
        }
        Object obj = dmsVar.a;
        j();
        if (obj instanceof Drawable) {
            h();
            if (this.e.e(i2) != null) {
                if (this.f == null) {
                    this.f = new age(4);
                }
                hz.q(i2, this.e, this.f);
            }
            hz.o(i, i2, this.e, this.f);
            invalidate();
            q();
        } else if (obj instanceof View) {
            this.j = true;
            if (!this.w) {
                View view = (View) obj;
                view.cancelPendingInputEvents();
                lj.A(view);
            }
            if (this.c.e(i2) != null) {
                if (this.d == null) {
                    this.d = new age(4);
                }
                hz.q(i2, this.c, this.d);
            }
            hz.o(i, i2, this.c, this.d);
        }
        i();
        if (this.a.e(i2) != null) {
            if (this.b == null) {
                this.b = new age(4);
            }
            hz.q(i2, this.a, this.b);
        }
        hz.o(i, i2, this.a, this.b);
        q();
        if (this.w || !(obj instanceof View)) {
            return;
        }
        lj.z((View) obj);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            this.w = false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.z = true;
        y(i, i2, i3, i4);
        this.z = false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            age ageVar = this.e;
            int c = ageVar == null ? 0 : ageVar.c();
            while (true) {
                c--;
                if (c < 0) {
                    break;
                }
                dms dmsVar = (dms) this.e.g(c);
                if ((dmsVar.a instanceof ddu) && (dbn.a(dmsVar).d & 2) != 2) {
                    ddu dduVar = (ddu) dmsVar.a;
                    if (dduVar.d(motionEvent) && dduVar.c(motionEvent, this)) {
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(boolean z) {
        if (z == this.B) {
            return;
        }
        cyt cytVar = null;
        if (z && this.A == null) {
            this.A = new cyt(this, null, isFocusable(), lj.c(this));
        }
        if (z) {
            cytVar = this.A;
        }
        lj.M(this, cytVar);
        this.B = z;
        if (!z) {
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ComponentHost) {
                ((ComponentHost) childAt).p(true);
            } else {
                dab dabVar = (dab) childAt.getTag(R.id.component_node_info);
                if (dabVar != null) {
                    lj.M(childAt, new cyt(childAt, dabVar, childAt.isFocusable(), lj.c(childAt)));
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        CharSequence join;
        if (i != 512) {
            if (i == 256) {
                i = 256;
            }
            return super.performAccessibilityAction(i, bundle);
        }
        if (!TextUtils.isEmpty(this.r)) {
            join = this.r;
        } else if (!e().isEmpty()) {
            join = TextUtils.join(", ", e());
        } else {
            join = !getTextContent().getTextItems().isEmpty() ? TextUtils.join(", ", getTextContent().getTextItems()) : null;
        }
        if (join == null) {
            return false;
        }
        this.r = join;
        super.setContentDescription(join);
        return super.performAccessibilityAction(i, bundle);
    }

    public final void q() {
        age ageVar = this.b;
        if (ageVar != null && ageVar.c() == 0) {
            this.b = null;
        }
        age ageVar2 = this.d;
        if (ageVar2 == null || ageVar2.c() != 0) {
            return;
        }
        this.d = null;
    }

    @Override // defpackage.dba
    public final void r(dah dahVar) {
        this.C = dahVar;
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void removeAllViewsInLayout() {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    protected final void removeDetachedView(View view, boolean z) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    @Deprecated
    public final void removeView(View view) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void removeViewAt(int i) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void removeViewInLayout(View view) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void removeViews(int i, int i2) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void removeViewsInLayout(int i, int i2) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.w = z;
    }

    @Override // defpackage.dmr, android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (i == 130) {
            if (rect == null && this.v) {
                this.u = true;
                return false;
            }
            i = 130;
        }
        return super.requestFocus(i, rect);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        for (ViewParent viewParent = this; viewParent instanceof ComponentHost; viewParent = viewParent.getParent()) {
            if (!((ComponentHost) viewParent).x()) {
                return;
            }
        }
        super.requestLayout();
    }

    public final void s(boolean z) {
        boolean z2 = dfz.a;
        if (this.v == z) {
            return;
        }
        this.v = z;
        if (z) {
            return;
        }
        if (this.s) {
            invalidate();
            this.s = false;
        }
        if (this.t) {
            k();
            this.t = false;
        }
        if (!this.u) {
            return;
        }
        View rootView = getRootView();
        if (rootView != null) {
            rootView.requestFocus();
        }
        this.u = false;
    }

    @Override // android.view.View
    public final void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        super.setAccessibilityDelegate(accessibilityDelegate);
        this.B = false;
    }

    @Override // android.view.ViewGroup
    public final void setClipChildren(boolean z) {
        if (this.p) {
            this.q = z;
        } else {
            super.setClipChildren(z);
        }
    }

    @Override // android.view.View
    public final void setContentDescription(CharSequence charSequence) {
        this.r = charSequence;
        if (!TextUtils.isEmpty(charSequence) && lj.c(this) == 0) {
            lj.V(this, 1);
        }
        k();
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (i != R.id.component_node_info || obj == null) {
            return;
        }
        p(cyf.b(getContext()));
        cyt cytVar = this.A;
        if (cytVar == null) {
            return;
        }
        cytVar.f = (dab) obj;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        age ageVar = this.e;
        int c = ageVar == null ? 0 : ageVar.c();
        for (int i2 = 0; i2 < c; i2++) {
            ((Drawable) ((dms) this.e.g(i2)).a).setVisible(i == 0, false);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // defpackage.dmr
    public final void t(int i, dms dmsVar) {
        Object obj = dmsVar.a;
        if (obj instanceof Drawable) {
            h();
            u(dmsVar);
            hz.p(i, this.e, this.f);
        } else if (obj instanceof View) {
            v((View) obj);
            j();
            hz.p(i, this.c, this.d);
            this.j = true;
            m(i, dmsVar);
        }
        i();
        hz.p(i, this.a, this.b);
        q();
        hz.n(dmsVar);
    }

    public final void u(dms dmsVar) {
        Drawable drawable = (Drawable) dmsVar.a;
        drawable.setCallback(null);
        invalidate(drawable.getBounds());
        q();
    }

    public final void v(View view) {
        this.j = true;
        if (this.z) {
            super.removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public final boolean w() {
        ArrayList arrayList = this.g;
        return arrayList != null && !arrayList.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean x() {
        return !this.z;
    }

    public void y(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void addView(View view, int i) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Override // android.view.View
    public final Object getTag(int i) {
        Object obj;
        SparseArray sparseArray = this.i;
        return (sparseArray == null || (obj = sparseArray.get(i)) == null) ? super.getTag(i) : obj;
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (this.v) {
            this.s = true;
        } else {
            super.invalidate(i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        if (this.v) {
            this.s = true;
        } else {
            super.invalidate(rect);
        }
    }
}
