package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ukh  reason: default package */
/* loaded from: classes4.dex */
public final class ukh {
    public final WeakReference a;
    public final Object b;
    public final uop c;
    public boolean d;
    private final Executor e;

    public ukh(Object obj, uop uopVar, ImageView imageView, Executor executor) {
        imageView.getClass();
        this.a = new WeakReference(imageView);
        this.c = uopVar;
        this.b = obj;
        this.e = executor;
    }

    public final Bitmap a(Bitmap bitmap) {
        int width;
        int height;
        if (bitmap == null) {
            return null;
        }
        amuk amukVar = this.c.c;
        if (amukVar != null && !amukVar.isEmpty()) {
            int i = ((amxx) amukVar).c;
            for (int i2 = 0; i2 < i; i2++) {
                uoo uooVar = uoo.a;
                if (((uoo) amukVar.get(i2)).ordinal() == 0) {
                    Map map = uki.a;
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
        return bitmap;
    }

    public final void b() {
        uwp.f();
        ImageView imageView = (ImageView) this.a.get();
        if (this.d || imageView == null) {
            return;
        }
        uki.a(imageView, null);
    }

    public final void c(Runnable runnable) {
        if (uwp.j()) {
            this.e.execute(runnable);
        } else {
            runnable.run();
        }
    }

    public final void d(Drawable drawable, boolean z) {
        final ImageView imageView = (ImageView) this.a.get();
        if (this.d || imageView == null) {
            return;
        }
        final ukg ukgVar = new ukg(this, drawable, z);
        imageView.addOnAttachStateChangeListener(ukgVar);
        if (!lj.aj(imageView)) {
            return;
        }
        imageView.post(new Runnable() { // from class: ukc
            @Override // java.lang.Runnable
            public final void run() {
                ukgVar.onViewAttachedToWindow(imageView);
            }
        });
    }
}
