package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.material.chip.Chip;
/* compiled from: PG */
/* renamed from: cxqj  reason: default package */
/* loaded from: classes5.dex */
final class cxqj implements chv<Drawable> {
    final /* synthetic */ Chip a;

    public cxqj(Chip chip) {
        this.a = chip;
    }

    @Override // defpackage.chv
    public final boolean Nl(bwx bwxVar) {
        return false;
    }

    @Override // defpackage.chv
    public final /* bridge */ /* synthetic */ boolean Nm(Drawable drawable, int i) {
        Drawable drawable2 = drawable;
        this.a.setChipIcon(new cxql(drawable2 instanceof BitmapDrawable ? ((BitmapDrawable) drawable2).getBitmap() : Bitmap.createBitmap(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888)));
        return true;
    }
}
