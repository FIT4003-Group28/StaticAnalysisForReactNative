package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: mxh  reason: default package */
/* loaded from: classes3.dex */
final class mxh extends ajmg {
    final /* synthetic */ mbw a;
    final /* synthetic */ mxi b;

    public mxh(mxi mxiVar, mbw mbwVar) {
        this.b = mxiVar;
        this.a = mbwVar;
    }

    @Override // defpackage.ajmg, defpackage.ajmw
    public final void a(ImageView imageView) {
        this.a.a(this.b.E);
    }

    @Override // defpackage.ajmg, defpackage.ajmw
    public final void b(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof BitmapDrawable) {
            this.b.D = ((BitmapDrawable) drawable).getBitmap();
            mbw mbwVar = this.a;
            mxi mxiVar = this.b;
            mbwVar.b(mxiVar.E, mxiVar.D);
            return;
        }
        this.a.a(this.b.E);
    }
}
