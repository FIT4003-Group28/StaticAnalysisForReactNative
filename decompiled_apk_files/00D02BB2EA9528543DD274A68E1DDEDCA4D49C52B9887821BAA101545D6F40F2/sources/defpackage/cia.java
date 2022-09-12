package defpackage;

import android.graphics.Bitmap;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: cia  reason: default package */
/* loaded from: classes4.dex */
public final class cia extends cig<Bitmap> {
    public cia(ImageView imageView) {
        super(imageView);
    }

    @Override // defpackage.cig
    protected final /* bridge */ /* synthetic */ void l(Bitmap bitmap) {
        ((ImageView) this.a).setImageBitmap(bitmap);
    }
}
