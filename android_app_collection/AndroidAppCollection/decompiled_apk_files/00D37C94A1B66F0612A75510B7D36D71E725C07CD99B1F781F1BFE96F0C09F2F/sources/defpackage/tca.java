package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: tca  reason: default package */
/* loaded from: classes4.dex */
public final class tca extends ctr {
    private final ImageView.ScaleType a;
    private final teb b;
    private final svb d;
    private final aodt e;

    public tca(aodt aodtVar, svb svbVar, int i, int i2, ImageView.ScaleType scaleType, teb tebVar) {
        super(i, i2);
        this.e = aodtVar;
        this.d = svbVar;
        this.a = scaleType;
        this.b = tebVar;
    }

    @Override // defpackage.ctz
    public final void a(Drawable drawable) {
        if (drawable != null) {
            this.d.b(drawable);
        }
    }

    @Override // defpackage.ctz
    public final /* bridge */ /* synthetic */ void b(Object obj, cug cugVar) {
        Drawable drawable = (Drawable) obj;
        if (drawable instanceof BitmapDrawable) {
            ImageView.ScaleType scaleType = this.a;
            if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            drawable = new srn(((BitmapDrawable) drawable).getBitmap(), scaleType, this.b);
        }
        tfo.p(drawable, this.e);
        this.d.b(drawable);
    }

    @Override // defpackage.ctr, defpackage.ctz
    public final void e(Drawable drawable) {
        if (drawable != null) {
            this.d.b(drawable);
        }
    }
}
