package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: zua  reason: default package */
/* loaded from: classes7.dex */
public final class zua implements dbty<Bitmap> {
    private static final dcqe a = dcqe.c("zua");
    private final Context b;
    private final dcdc<dpce> c;
    private final int d;
    private final Rect e;
    private final int f;
    @dzsi
    private Bitmap g = null;
    private final zxb h;

    public zua(Context context, dcdc<dpce> dcdcVar, int i, Rect rect, int i2) {
        this.b = context;
        this.c = dcdcVar;
        this.d = i;
        this.e = rect;
        this.f = i2;
        zxb zxbVar = new zxb(context);
        this.h = zxbVar;
        zxbVar.setDirectionsIconSize(Integer.valueOf(i));
        zxbVar.setEllipsizeStrategy(zwz.SINGLE_LINE_SQUEEZE_LINE_NAMES);
        zxbVar.setPadding(bvox.c(context.getResources()) ? rect.right : rect.left, rect.top, bvox.c(context.getResources()) ? rect.left : rect.right, rect.bottom);
        zvd.a(new zvb(dcdcVar), zxbVar);
    }

    @Override // defpackage.dbty
    /* renamed from: b */
    public final Bitmap a() {
        Bitmap bitmap = this.g;
        if (bitmap != null) {
            return bitmap;
        }
        zxc zxcVar = new zxc(this.b);
        zxcVar.addView(this.h);
        zxcVar.measure(View.MeasureSpec.makeMeasureSpec(this.f, Integer.MIN_VALUE), -2);
        zxcVar.layout(0, 0, zxcVar.getMeasuredWidth(), zxcVar.getMeasuredHeight());
        if (zxcVar.getMeasuredWidth() <= 0 || zxcVar.getMeasuredHeight() <= 0) {
            bvoo.h("Invalid line renderables to create a bitmap from %d renderable components: %s", Integer.valueOf(this.c.size()), this.c);
        }
        Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, zxcVar.getMeasuredWidth()), Math.max(1, zxcVar.getMeasuredHeight()), Bitmap.Config.ARGB_8888);
        zxcVar.draw(new Canvas(createBitmap));
        this.g = createBitmap;
        return createBitmap;
    }

    public final String c() {
        return this.h.getContentDescription().toString();
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zua)) {
            return false;
        }
        zua zuaVar = (zua) obj;
        return this.d == zuaVar.d && dbsd.a(this.e, zuaVar.e) && this.f == zuaVar.f && dbsd.a(this.c, zuaVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d), this.e, Integer.valueOf(this.f), this.c});
    }
}
