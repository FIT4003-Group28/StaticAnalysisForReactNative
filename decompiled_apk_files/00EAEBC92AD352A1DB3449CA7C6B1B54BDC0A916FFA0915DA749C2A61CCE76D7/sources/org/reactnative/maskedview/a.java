package org.reactnative.maskedview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;
import com.facebook.react.views.view.f;
/* loaded from: classes.dex */
public class a extends f {

    /* renamed from: b  reason: collision with root package name */
    private Bitmap f10364b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f10365c;

    /* renamed from: d  reason: collision with root package name */
    private PorterDuffXfermode f10366d;

    public a(Context context) {
        super(context);
        this.f10364b = null;
        setLayerType(1, null);
        this.f10365c = new Paint(1);
        this.f10366d = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    public static Bitmap a(View view) {
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    private void a() {
        Bitmap bitmap = this.f10364b;
        if (bitmap != null) {
            bitmap.recycle();
        }
        View childAt = getChildAt(0);
        childAt.setVisibility(0);
        this.f10364b = a(childAt);
        childAt.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.f, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        a();
        if (this.f10364b != null) {
            this.f10365c.setXfermode(this.f10366d);
            canvas.drawBitmap(this.f10364b, 0.0f, 0.0f, this.f10365c);
            this.f10365c.setXfermode(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.f, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            a();
        }
    }
}
