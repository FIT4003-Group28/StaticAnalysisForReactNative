package defpackage;

import android.graphics.Matrix;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
/* renamed from: dkp  reason: default package */
/* loaded from: classes6.dex */
public final /* synthetic */ class dkp {
    private final ImageView.ScaleType a;
    private final LottieAnimationView b;

    public dkp(ImageView.ScaleType scaleType, LottieAnimationView lottieAnimationView) {
        this.a = scaleType;
        this.b = lottieAnimationView;
    }

    public final void a() {
        ImageView.ScaleType scaleType = this.a;
        final LottieAnimationView lottieAnimationView = this.b;
        dbtm dbtmVar = dku.a;
        if (scaleType == null) {
            Matrix matrix = new Matrix();
            float width = lottieAnimationView.getWidth() / lottieAnimationView.getDrawable().getIntrinsicWidth();
            matrix.setScale(width, width);
            lottieAnimationView.setImageMatrix(matrix);
            lottieAnimationView.setScaleType(ImageView.ScaleType.MATRIX);
        } else {
            lottieAnimationView.setScaleType(scaleType);
        }
        lottieAnimationView.getClass();
        lottieAnimationView.post(new Runnable(lottieAnimationView) { // from class: dkr
            private final LottieAnimationView a;

            {
                this.a = lottieAnimationView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        });
    }
}
