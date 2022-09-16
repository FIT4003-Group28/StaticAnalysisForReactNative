package c.d.j.o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.nativecode.Bitmaps;
/* loaded from: classes.dex */
public abstract class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final Bitmap.Config f3631a = Bitmap.Config.ARGB_8888;

    private static void b(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap.getConfig() == bitmap2.getConfig()) {
            Bitmaps.a(bitmap, bitmap2);
        } else {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // c.d.j.o.e
    public c.d.b.a.d a() {
        return null;
    }

    @Override // c.d.j.o.e
    public c.d.d.h.a<Bitmap> a(Bitmap bitmap, c.d.j.c.f fVar) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = f3631a;
        }
        c.d.d.h.a<Bitmap> b2 = fVar.b(width, height, config);
        try {
            a(b2.b(), bitmap);
            return c.d.d.h.a.a((c.d.d.h.a) b2);
        } finally {
            c.d.d.h.a.b(b2);
        }
    }

    public void a(Bitmap bitmap) {
    }

    public void a(Bitmap bitmap, Bitmap bitmap2) {
        b(bitmap, bitmap2);
        a(bitmap);
    }

    @Override // c.d.j.o.e
    public String getName() {
        return "Unknown postprocessor";
    }
}
