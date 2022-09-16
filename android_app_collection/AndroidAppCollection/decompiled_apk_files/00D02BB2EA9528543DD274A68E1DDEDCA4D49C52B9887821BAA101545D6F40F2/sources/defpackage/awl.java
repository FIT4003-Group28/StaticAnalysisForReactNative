package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: awl  reason: default package */
/* loaded from: classes3.dex */
final class awl extends ImageView {
    private Animation.AnimationListener a;
    private int b;

    public awl(Context context) {
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(awk.a);
        this.b = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        od.F(this, f * 4.0f);
        shapeDrawable.getPaint().setColor(this.b);
        od.U(this, shapeDrawable);
    }

    @Override // android.view.View
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    public void setAnimationListener(Animation.AnimationListener animationListener) {
        this.a = animationListener;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.b = i;
        }
    }
}
