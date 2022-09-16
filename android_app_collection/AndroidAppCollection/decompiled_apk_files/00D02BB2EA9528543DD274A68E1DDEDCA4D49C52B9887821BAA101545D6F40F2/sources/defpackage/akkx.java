package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
/* compiled from: PG */
/* renamed from: akkx  reason: default package */
/* loaded from: classes2.dex */
public final class akkx extends LottieAnimationView {
    public static final cqkv g = new akkw();
    private dqiz h;

    public akkx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = dqiz.UNKNOWN_SCALE_TYPE;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            dqiz dqizVar = dqiz.UNKNOWN_SCALE_TYPE;
            int ordinal = this.h.ordinal();
            if (ordinal == 1) {
                int size = View.MeasureSpec.getSize(i);
                setMeasuredDimension(size, (drawable.getIntrinsicHeight() * size) / drawable.getIntrinsicWidth());
                return;
            } else if (ordinal == 2) {
                int size2 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension((drawable.getIntrinsicWidth() * size2) / drawable.getIntrinsicHeight(), size2);
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setScaleType(dqiz dqizVar) {
        ImageView.ScaleType scaleType;
        this.h = dqizVar;
        if (dqizVar == dqiz.UNKNOWN_SCALE_TYPE || dqizVar == dqiz.SCALE) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        super.setScaleType(scaleType);
    }
}
