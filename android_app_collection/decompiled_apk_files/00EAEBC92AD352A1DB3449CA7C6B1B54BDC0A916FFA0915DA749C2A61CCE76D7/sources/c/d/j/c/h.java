package c.d.j.c;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public class h implements c.d.d.h.c<Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private static h f3182a;

    private h() {
    }

    public static h a() {
        if (f3182a == null) {
            f3182a = new h();
        }
        return f3182a;
    }

    @Override // c.d.d.h.c
    public void a(Bitmap bitmap) {
        bitmap.recycle();
    }
}
