package defpackage;

import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: bcnt  reason: default package */
/* loaded from: classes3.dex */
final class bcnt implements ckqd {
    private final float a;

    public bcnt(float f) {
        this.a = f;
    }

    @Override // defpackage.ckqd
    public final String a(String str, int i, int i2, @dzsi ImageView.ScaleType scaleType) {
        float f;
        if (scaleType == ImageView.ScaleType.CENTER_CROP && this.a > 0.0f) {
            float f2 = i;
            float f3 = i2;
            ImageView.ScaleType scaleType2 = ImageView.ScaleType.MATRIX;
            if (f2 / f3 > this.a) {
                i2 = (int) Math.floor(f2 / f);
            } else {
                i = (int) Math.floor(f3 * f);
            }
            scaleType = scaleType2;
        }
        return ckqc.FIFE.a(str, i, i2, scaleType);
    }
}
