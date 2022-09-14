package c.d.h.e;

import android.annotation.SuppressLint;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private int f3029a = -1;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3030b = false;

    /* renamed from: c  reason: collision with root package name */
    private ColorFilter f3031c = null;

    /* renamed from: d  reason: collision with root package name */
    private int f3032d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f3033e = -1;

    public void a(int i) {
        this.f3029a = i;
    }

    public void a(ColorFilter colorFilter) {
        this.f3031c = colorFilter;
        this.f3030b = true;
    }

    @SuppressLint({"Range"})
    public void a(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        int i = this.f3029a;
        if (i != -1) {
            drawable.setAlpha(i);
        }
        if (this.f3030b) {
            drawable.setColorFilter(this.f3031c);
        }
        int i2 = this.f3032d;
        boolean z = true;
        if (i2 != -1) {
            drawable.setDither(i2 != 0);
        }
        int i3 = this.f3033e;
        if (i3 == -1) {
            return;
        }
        if (i3 == 0) {
            z = false;
        }
        drawable.setFilterBitmap(z);
    }

    public void a(boolean z) {
        this.f3032d = z ? 1 : 0;
    }

    public void b(boolean z) {
        this.f3033e = z ? 1 : 0;
    }
}
