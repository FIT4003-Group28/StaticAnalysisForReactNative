package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
/* compiled from: PG */
/* renamed from: cwpt  reason: default package */
/* loaded from: classes5.dex */
final class cwpt {
    public static final Property<ExpandableDialogView, Float> d = new cwps(Float.class);
    public final ViewTreeObserver.OnScrollChangedListener a = new ViewTreeObserver.OnScrollChangedListener(this) { // from class: cwpq
        private final cwpt a;

        {
            this.a = this;
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            this.a.a();
        }
    };
    public final ViewTreeObserver.OnGlobalLayoutListener b = new ViewTreeObserver.OnGlobalLayoutListener(this) { // from class: cwpr
        private final cwpt a;

        {
            this.a = this;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            this.a.a();
        }
    };
    public final View c;
    private final ObjectAnimator e;
    private boolean f;

    public cwpt(ExpandableDialogView expandableDialogView, Property<ExpandableDialogView, Float> property, View view) {
        this.f = true;
        this.c = view;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(expandableDialogView, property, 0.0f, 1.0f);
        this.e = ofFloat;
        ofFloat.setDuration(115L);
        ofFloat.setInterpolator(new LinearInterpolator());
        b();
        if (!view.canScrollVertically(-1)) {
            this.f = false;
        }
    }

    public final void a() {
        if (this.f == this.c.canScrollVertically(-1)) {
            return;
        }
        this.f = !this.f;
        this.e.cancel();
        ObjectAnimator objectAnimator = this.e;
        float[] fArr = new float[2];
        fArr[0] = ((Float) objectAnimator.getAnimatedValue()).floatValue();
        fArr[1] = true != this.f ? 0.0f : 1.0f;
        objectAnimator.setFloatValues(fArr);
        this.e.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.c.getViewTreeObserver().addOnScrollChangedListener(this.a);
        this.c.getViewTreeObserver().addOnGlobalLayoutListener(this.b);
    }
}
