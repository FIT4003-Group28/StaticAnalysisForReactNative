package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cvvf  reason: default package */
/* loaded from: classes5.dex */
public final class cvvf<AccountT> {
    public final WeakReference<ImageView> a;
    public final AccountT b;
    public final cwjq<AccountT> c;
    public boolean d;
    private final Executor e;
    private final cwfn f;

    /* JADX WARN: Multi-variable type inference failed */
    public cvvf(Object obj, cwjq cwjqVar, ImageView imageView, Executor executor, cwfn cwfnVar) {
        dbsk.s(imageView);
        this.a = new WeakReference<>(imageView);
        this.c = cwjqVar;
        this.b = obj;
        this.e = executor;
        this.f = cwfnVar;
    }

    public final void a(Runnable runnable) {
        if (czhz.a()) {
            this.e.execute(runnable);
        } else {
            runnable.run();
        }
    }

    public final void c(Drawable drawable, boolean z) {
        final ImageView imageView = this.a.get();
        if (this.d || imageView == null) {
            return;
        }
        final cvve cvveVar = new cvve(this, drawable, z);
        imageView.addOnAttachStateChangeListener(cvveVar);
        if (!od.ak(imageView)) {
            return;
        }
        imageView.post(new Runnable(cvveVar, imageView) { // from class: cvuz
            private final View.OnAttachStateChangeListener a;
            private final ImageView b;

            {
                this.a = cvveVar;
                this.b = imageView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.onViewAttachedToWindow(this.b);
            }
        });
    }

    public final void d() {
        czhz.b();
        ImageView imageView = this.a.get();
        if (this.d || imageView == null) {
            return;
        }
        cvvg.b(imageView, null);
    }

    public final void b(Bitmap bitmap, boolean z) {
        int width;
        int height;
        if (bitmap == null) {
            bitmap = null;
        } else {
            dcdc<cwjp> c = this.c.c();
            if (c != null && !c.isEmpty()) {
                int size = c.size();
                for (int i = 0; i < size; i++) {
                    cwjp cwjpVar = cwjp.a;
                    if (c.get(i).ordinal() == 0) {
                        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
                        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        float f = min / 2;
                        canvas.drawCircle(f, f, f, paint);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        canvas.drawBitmap(bitmap, (min - width) / 2, (min - height) / 2, paint);
                        bitmap = createBitmap;
                    }
                }
            }
        }
        c(new BitmapDrawable(bitmap), z);
    }
}
