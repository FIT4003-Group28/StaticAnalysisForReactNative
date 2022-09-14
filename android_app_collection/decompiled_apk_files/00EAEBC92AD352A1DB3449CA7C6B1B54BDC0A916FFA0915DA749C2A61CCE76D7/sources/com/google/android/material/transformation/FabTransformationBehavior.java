package com.google.android.material.transformation;

import a.g.m.v;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.e.a.c.f;
import c.e.a.c.l.h;
import c.e.a.c.l.i;
import c.e.a.c.l.j;
import c.e.a.c.p.d;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    private final Rect f8244c;

    /* renamed from: d  reason: collision with root package name */
    private final RectF f8245d;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f8246e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f8247f;

    /* renamed from: g  reason: collision with root package name */
    private float f8248g;

    /* renamed from: h  reason: collision with root package name */
    private float f8249h;

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f8250a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f8251b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f8252c;

        a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.f8250a = z;
            this.f8251b = view;
            this.f8252c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f8250a) {
                this.f8251b.setVisibility(4);
                this.f8252c.setAlpha(1.0f);
                this.f8252c.setVisibility(0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f8250a) {
                this.f8251b.setVisibility(0);
                this.f8252c.setAlpha(0.0f);
                this.f8252c.setVisibility(4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f8253a;

        b(FabTransformationBehavior fabTransformationBehavior, View view) {
            this.f8253a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f8253a.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.e.a.c.p.d f8254a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Drawable f8255b;

        c(FabTransformationBehavior fabTransformationBehavior, c.e.a.c.p.d dVar, Drawable drawable) {
            this.f8254a = dVar;
            this.f8255b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f8254a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f8254a.setCircularRevealOverlayDrawable(this.f8255b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.e.a.c.p.d f8256a;

        d(FabTransformationBehavior fabTransformationBehavior, c.e.a.c.p.d dVar) {
            this.f8256a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.e revealInfo = this.f8256a.getRevealInfo();
            revealInfo.f4771c = Float.MAX_VALUE;
            this.f8256a.setRevealInfo(revealInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public h f8257a;

        /* renamed from: b  reason: collision with root package name */
        public j f8258b;
    }

    public FabTransformationBehavior() {
        this.f8244c = new Rect();
        this.f8245d = new RectF();
        this.f8246e = new RectF();
        this.f8247f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8244c = new Rect();
        this.f8245d = new RectF();
        this.f8246e = new RectF();
        this.f8247f = new int[2];
    }

    private float a(View view, View view2, j jVar) {
        RectF rectF = this.f8245d;
        RectF rectF2 = this.f8246e;
        a(view, rectF);
        b(view2, rectF2);
        rectF2.offset(-c(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float a(e eVar, i iVar, float f2, float f3) {
        long a2 = iVar.a();
        long b2 = iVar.b();
        i a3 = eVar.f8257a.a("expansion");
        return c.e.a.c.l.a.a(f2, f3, iVar.c().getInterpolation(((float) (((a3.a() + a3.b()) + 17) - a2)) / ((float) b2)));
    }

    private Pair<i, i> a(float f2, float f3, boolean z, e eVar) {
        i a2;
        h hVar;
        String str;
        int i;
        if (f2 == 0.0f || f3 == 0.0f) {
            a2 = eVar.f8257a.a("translationXLinear");
            hVar = eVar.f8257a;
            str = "translationYLinear";
        } else if ((!z || f3 >= 0.0f) && (z || i <= 0)) {
            a2 = eVar.f8257a.a("translationXCurveDownwards");
            hVar = eVar.f8257a;
            str = "translationYCurveDownwards";
        } else {
            a2 = eVar.f8257a.a("translationXCurveUpwards");
            hVar = eVar.f8257a;
            str = "translationYCurveUpwards";
        }
        return new Pair<>(a2, hVar.a(str));
    }

    private ViewGroup a(View view) {
        View findViewById = view.findViewById(f.mtrl_child_content_container);
        return findViewById != null ? c(findViewById) : ((view instanceof com.google.android.material.transformation.b) || (view instanceof com.google.android.material.transformation.a)) ? c(((ViewGroup) view).getChildAt(0)) : c(view);
    }

    private void a(View view, long j, int i, int i2, float f2, List<Animator> list) {
        if (Build.VERSION.SDK_INT < 21 || j <= 0) {
            return;
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f2, f2);
        createCircularReveal.setStartDelay(0L);
        createCircularReveal.setDuration(j);
        list.add(createCircularReveal);
    }

    private void a(View view, long j, long j2, long j3, int i, int i2, float f2, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 >= j3) {
                return;
            }
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f2, f2);
            createCircularReveal.setStartDelay(j4);
            createCircularReveal.setDuration(j3 - j4);
            list.add(createCircularReveal);
        }
    }

    private void a(View view, RectF rectF) {
        b(view, rectF);
        rectF.offset(this.f8248g, this.f8249h);
    }

    private void a(View view, View view2, boolean z, e eVar, List<Animator> list) {
        float c2 = c(view, view2, eVar.f8258b);
        float d2 = d(view, view2, eVar.f8258b);
        Pair<i, i> a2 = a(c2, d2, z, eVar);
        i iVar = (i) a2.first;
        i iVar2 = (i) a2.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            c2 = this.f8248g;
        }
        fArr[0] = c2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            d2 = this.f8249h;
        }
        fArr2[0] = d2;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        iVar.a((Animator) ofFloat);
        iVar2.a((Animator) ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    private void a(View view, View view2, boolean z, boolean z2, e eVar, float f2, float f3, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (!(view2 instanceof c.e.a.c.p.d)) {
            return;
        }
        c.e.a.c.p.d dVar = (c.e.a.c.p.d) view2;
        float a2 = a(view, view2, eVar.f8258b);
        float b2 = b(view, view2, eVar.f8258b);
        ((FloatingActionButton) view).a(this.f8244c);
        float width = this.f8244c.width() / 2.0f;
        i a3 = eVar.f8257a.a("expansion");
        if (z) {
            if (!z2) {
                dVar.setRevealInfo(new d.e(a2, b2, width));
            }
            if (z2) {
                width = dVar.getRevealInfo().f4771c;
            }
            animator = c.e.a.c.p.a.a(dVar, a2, b2, c.e.a.c.v.a.a(a2, b2, 0.0f, 0.0f, f2, f3));
            animator.addListener(new d(this, dVar));
            a(view2, a3.a(), (int) a2, (int) b2, width, list);
        } else {
            float f4 = dVar.getRevealInfo().f4771c;
            Animator a4 = c.e.a.c.p.a.a(dVar, a2, b2, width);
            int i = (int) a2;
            int i2 = (int) b2;
            a(view2, a3.a(), i, i2, f4, list);
            a(view2, a3.a(), a3.b(), eVar.f8257a.a(), i, i2, width, list);
            animator = a4;
        }
        a3.a(animator);
        list.add(animator);
        list2.add(c.e.a.c.p.a.a(dVar));
    }

    private void a(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup a2;
        ObjectAnimator ofFloat;
        if (!(view2 instanceof ViewGroup)) {
            return;
        }
        if (((view2 instanceof c.e.a.c.p.d) && c.e.a.c.p.c.f4764a == 0) || (a2 = a(view2)) == null) {
            return;
        }
        if (z) {
            if (!z2) {
                c.e.a.c.l.d.f4739a.set(a2, Float.valueOf(0.0f));
            }
            ofFloat = ObjectAnimator.ofFloat(a2, c.e.a.c.l.d.f4739a, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(a2, c.e.a.c.l.d.f4739a, 0.0f);
        }
        eVar.f8257a.a("contentFade").a((Animator) ofFloat);
        list.add(ofFloat);
    }

    private void a(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float c2 = c(view, view2, eVar.f8258b);
        float d2 = d(view, view2, eVar.f8258b);
        Pair<i, i> a2 = a(c2, d2, z, eVar);
        i iVar = (i) a2.first;
        i iVar2 = (i) a2.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-c2);
                view2.setTranslationY(-d2);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            a(view2, eVar, iVar, iVar2, -c2, -d2, 0.0f, 0.0f, rectF);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -c2);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -d2);
        }
        iVar.a((Animator) ofFloat);
        iVar2.a((Animator) ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    private void a(View view, e eVar, i iVar, i iVar2, float f2, float f3, float f4, float f5, RectF rectF) {
        float a2 = a(eVar, iVar, f2, f4);
        float a3 = a(eVar, iVar2, f3, f5);
        Rect rect = this.f8244c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f8245d;
        rectF2.set(rect);
        RectF rectF3 = this.f8246e;
        b(view, rectF3);
        rectF3.offset(a2, a3);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private float b(View view, View view2, j jVar) {
        RectF rectF = this.f8245d;
        RectF rectF2 = this.f8246e;
        a(view, rectF);
        b(view2, rectF2);
        rectF2.offset(0.0f, -d(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    private int b(View view) {
        ColorStateList h2 = v.h(view);
        if (h2 != null) {
            return h2.getColorForState(view.getDrawableState(), h2.getDefaultColor());
        }
        return 0;
    }

    private void b(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f8247f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void b(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if (!(view2 instanceof c.e.a.c.p.d)) {
            return;
        }
        c.e.a.c.p.d dVar = (c.e.a.c.p.d) view2;
        int b2 = b(view);
        int i = 16777215 & b2;
        if (z) {
            if (!z2) {
                dVar.setCircularRevealScrimColor(b2);
            }
            ofInt = ObjectAnimator.ofInt(dVar, d.C0103d.f4768a, i);
        } else {
            ofInt = ObjectAnimator.ofInt(dVar, d.C0103d.f4768a, b2);
        }
        ofInt.setEvaluator(c.e.a.c.l.c.a());
        eVar.f8257a.a("color").a((Animator) ofInt);
        list.add(ofInt);
    }

    private float c(View view, View view2, j jVar) {
        float centerX;
        float centerX2;
        float f2;
        RectF rectF = this.f8245d;
        RectF rectF2 = this.f8246e;
        a(view, rectF);
        b(view2, rectF2);
        int i = jVar.f4753a & 7;
        if (i == 1) {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        } else if (i == 3) {
            centerX = rectF2.left;
            centerX2 = rectF.left;
        } else if (i != 5) {
            f2 = 0.0f;
            return f2 + jVar.f4754b;
        } else {
            centerX = rectF2.right;
            centerX2 = rectF.right;
        }
        f2 = centerX - centerX2;
        return f2 + jVar.f4754b;
    }

    private ViewGroup c(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @TargetApi(21)
    private void c(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        float l = v.l(view2) - v.l(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-l);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -l);
        }
        eVar.f8257a.a("elevation").a((Animator) ofFloat);
        list.add(ofFloat);
    }

    private float d(View view, View view2, j jVar) {
        float centerY;
        float centerY2;
        float f2;
        RectF rectF = this.f8245d;
        RectF rectF2 = this.f8246e;
        a(view, rectF);
        b(view2, rectF2);
        int i = jVar.f4753a & 112;
        if (i == 16) {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        } else if (i == 48) {
            centerY = rectF2.top;
            centerY2 = rectF.top;
        } else if (i != 80) {
            f2 = 0.0f;
            return f2 + jVar.f4755c;
        } else {
            centerY = rectF2.bottom;
            centerY2 = rectF.bottom;
        }
        f2 = centerY - centerY2;
        return f2 + jVar.f4755c;
    }

    private void d(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if (!(view2 instanceof c.e.a.c.p.d) || !(view instanceof ImageView)) {
            return;
        }
        c.e.a.c.p.d dVar = (c.e.a.c.p.d) view2;
        Drawable drawable = ((ImageView) view).getDrawable();
        if (drawable == null) {
            return;
        }
        drawable.mutate();
        if (z) {
            if (!z2) {
                drawable.setAlpha(255);
            }
            ofInt = ObjectAnimator.ofInt(drawable, c.e.a.c.l.e.f4740b, 0);
        } else {
            ofInt = ObjectAnimator.ofInt(drawable, c.e.a.c.l.e.f4740b, 255);
        }
        ofInt.addUpdateListener(new b(this, view2));
        eVar.f8257a.a("iconFade").a((Animator) ofInt);
        list.add(ofInt);
        list2.add(new c(this, dVar, drawable));
    }

    protected abstract e a(Context context, boolean z);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void a(CoordinatorLayout.f fVar) {
        if (fVar.f1468h == 0) {
            fVar.f1468h = 80;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            if (!(view2 instanceof FloatingActionButton)) {
                return false;
            }
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected AnimatorSet b(View view, View view2, boolean z, boolean z2) {
        e a2 = a(view2.getContext(), z);
        if (z) {
            this.f8248g = view.getTranslationX();
            this.f8249h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            c(view, view2, z, z2, a2, arrayList, arrayList2);
        }
        RectF rectF = this.f8245d;
        a(view, view2, z, z2, a2, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        a(view, view2, z, a2, arrayList);
        d(view, view2, z, z2, a2, arrayList, arrayList2);
        a(view, view2, z, z2, a2, width, height, arrayList, arrayList2);
        b(view, view2, z, z2, a2, arrayList, arrayList2);
        a(view, view2, z, z2, a2, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        c.e.a.c.l.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(this, z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener(arrayList2.get(i));
        }
        return animatorSet;
    }
}
