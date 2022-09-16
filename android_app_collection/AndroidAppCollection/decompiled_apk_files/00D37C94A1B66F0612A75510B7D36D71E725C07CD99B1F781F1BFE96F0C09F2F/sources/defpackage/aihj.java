package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: aihj  reason: default package */
/* loaded from: classes.dex */
public class aihj extends FrameLayout {
    public ImageView a;
    public TextView b;
    public ObjectAnimator c;
    public boolean d;

    public aihj(Context context) {
        super(context);
        new Rect();
        this.d = false;
        c(context, null, 0, 0);
    }

    private final void b() {
        int integer = getResources().getInteger(R.integer.fade_duration_fast);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        this.c = ofFloat;
        ofFloat.setDuration(integer);
        this.c.addListener(new aihi(this));
    }

    private final void c(Context context, AttributeSet attributeSet, int i, int i2) {
        LayoutInflater.from(context).inflate(a(), this);
        this.a = (ImageView) findViewById(R.id.thumbnail);
        this.b = (TextView) findViewById(R.id.timestamp);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aihg.a, i, i2);
            try {
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, zew.i(context.getResources().getDisplayMetrics(), 90));
                zgd.t(this.a, zgd.s(Math.round(dimensionPixelSize * obtainStyledAttributes.getFloat(0, 1.778f)), dimensionPixelSize), ViewGroup.LayoutParams.class);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        b();
        zag.o(this, false);
    }

    protected int a() {
        return R.layout.scrubbed_preview;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    public aihj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        this.d = false;
        c(context, attributeSet, 0, R.style.ScrubbedPreview);
    }

    public aihj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new Rect();
        this.d = false;
        c(context, attributeSet, i, 0);
    }

    public aihj(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        new Rect();
        this.d = false;
        c(context, attributeSet, i, i2);
    }
}
