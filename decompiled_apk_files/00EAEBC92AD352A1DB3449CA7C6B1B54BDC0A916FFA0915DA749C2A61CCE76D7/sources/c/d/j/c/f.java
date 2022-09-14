package c.d.j.c;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public abstract class f {
    public c.d.d.h.a<Bitmap> a(int i, int i2) {
        return a(i, i2, Bitmap.Config.ARGB_8888);
    }

    public c.d.d.h.a<Bitmap> a(int i, int i2, Bitmap.Config config) {
        return a(i, i2, config, null);
    }

    public c.d.d.h.a<Bitmap> a(int i, int i2, Bitmap.Config config, Object obj) {
        return b(i, i2, config);
    }

    public abstract c.d.d.h.a<Bitmap> b(int i, int i2, Bitmap.Config config);
}
