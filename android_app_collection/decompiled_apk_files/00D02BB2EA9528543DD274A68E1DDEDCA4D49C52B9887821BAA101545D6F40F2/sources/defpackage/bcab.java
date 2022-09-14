package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bcab  reason: default package */
/* loaded from: classes3.dex */
public final class bcab extends FrameLayout {
    public static final cqkv i = new bcac();
    public final Interpolator a;
    public final Interpolator b;
    public final Interpolator c;
    public final bcah d;
    public final bcah e;
    public final bcah f;
    @dzsi
    public Runnable g;
    public final Animator.AnimatorListener h;
    private final float j;
    private final ImageView k;
    private final ImageView l;
    private final bbzy m;

    public bcab(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new aoo();
        this.b = new bcaa();
        this.c = new aop();
        this.g = null;
        this.h = new bbzx(this);
        Resources resources = context.getResources();
        float f = resources.getDisplayMetrics().density;
        this.j = f;
        FrameLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.gravity = 17;
        int round = Math.round(f * 56.0f);
        generateDefaultLayoutParams.width = round;
        generateDefaultLayoutParams.height = round;
        ImageView imageView = new ImageView(context);
        this.k = imageView;
        imageView.setImageDrawable(resources.getDrawable(R.drawable.shutter_back));
        addView(imageView, generateDefaultLayoutParams);
        this.e = new bcah(imageView);
        ImageView imageView2 = new ImageView(context);
        this.l = imageView2;
        imageView2.setImageDrawable(resources.getDrawable(R.drawable.shutter_blue));
        addView(imageView2, generateDefaultLayoutParams);
        this.d = new bcah(imageView2);
        bbzy bbzyVar = new bbzy(context);
        this.m = bbzyVar;
        addView(bbzyVar, generateDefaultLayoutParams);
        this.f = new bcah(bbzyVar);
    }

    @Override // android.view.View
    public void setOnTouchListener(@dzsi View.OnTouchListener onTouchListener) {
        this.m.setOnTouchListener(onTouchListener);
    }
}
