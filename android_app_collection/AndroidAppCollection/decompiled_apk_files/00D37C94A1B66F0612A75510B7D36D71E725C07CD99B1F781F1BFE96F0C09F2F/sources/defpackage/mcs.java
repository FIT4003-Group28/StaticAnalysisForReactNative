package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: mcs  reason: default package */
/* loaded from: classes3.dex */
final class mcs extends ajmg {
    final /* synthetic */ awny a;
    final /* synthetic */ mbw b;
    final /* synthetic */ String c;

    public mcs(awny awnyVar, mbw mbwVar, String str) {
        this.a = awnyVar;
        this.b = mbwVar;
        this.c = str;
    }

    @Override // defpackage.ajmg, defpackage.ajmw
    public final void a(ImageView imageView) {
        this.b.a(this.c);
    }

    @Override // defpackage.ajmg, defpackage.ajmw
    public final void b(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            int i = 1;
            if ((this.a.b & 1) == 0) {
                this.b.b(this.c, bitmapDrawable.getBitmap());
                return;
            }
            mbw mbwVar = this.b;
            String str = this.c;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            int C = awwc.C(this.a.d);
            if (C != 0) {
                i = C;
            }
            mbwVar.c(str, bitmap, aolu.v(i));
            return;
        }
        this.b.a(this.c);
    }
}
