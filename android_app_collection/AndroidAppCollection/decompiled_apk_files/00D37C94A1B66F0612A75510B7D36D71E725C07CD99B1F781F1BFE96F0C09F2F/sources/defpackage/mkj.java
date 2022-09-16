package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mkj  reason: default package */
/* loaded from: classes3.dex */
public final class mkj extends ajmg {
    final /* synthetic */ mbw a;
    final /* synthetic */ mkk b;

    public mkj(mkk mkkVar, mbw mbwVar) {
        this.b = mkkVar;
        this.a = mbwVar;
    }

    @Override // defpackage.ajmg, defpackage.ajmw
    public final void a(ImageView imageView) {
        this.a.a(this.b.C);
    }

    @Override // defpackage.ajmg, defpackage.ajmw
    public final void b(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof BitmapDrawable) {
            this.b.E = ((BitmapDrawable) drawable).getBitmap();
            mbw mbwVar = this.a;
            mkk mkkVar = this.b;
            mbwVar.b(mkkVar.C, mkkVar.E);
            return;
        }
        this.a.a(this.b.C);
    }
}
