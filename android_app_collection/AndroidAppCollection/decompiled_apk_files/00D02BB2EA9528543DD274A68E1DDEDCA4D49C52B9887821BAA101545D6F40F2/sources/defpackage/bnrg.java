package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.TypedValue;
/* compiled from: PG */
/* renamed from: bnrg  reason: default package */
/* loaded from: classes.dex */
final class bnrg implements bnrd {
    private final int a;
    private final Resources b;
    @dzsi
    private Bitmap c;

    public bnrg(Resources resources, int i) {
        this.b = resources;
        this.a = i;
    }

    @Override // defpackage.bnrd
    @dzsi
    public final Bitmap a() {
        Bitmap bitmap = this.c;
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(this.b, this.a);
        this.c = decodeResource;
        return decodeResource;
    }

    @Override // defpackage.bnrd
    public final bnuw b() {
        int i;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(this.b, this.a, options);
        int i2 = this.b.getDisplayMetrics().densityDpi;
        TypedValue typedValue = new TypedValue();
        this.b.getValue(this.a, typedValue, true);
        if (typedValue.density == 65535) {
            i = i2;
        } else {
            i = typedValue.density == 0 ? 160 : typedValue.density;
        }
        float f = i2 / i;
        return bnuw.c((int) ((options.outWidth * f) + 0.5f), (int) ((options.outHeight * f) + 0.5f));
    }

    @Override // defpackage.bnrd
    public final void c() {
        this.c = null;
    }

    @Override // defpackage.bnrv
    public final boolean d() {
        return true;
    }
}
