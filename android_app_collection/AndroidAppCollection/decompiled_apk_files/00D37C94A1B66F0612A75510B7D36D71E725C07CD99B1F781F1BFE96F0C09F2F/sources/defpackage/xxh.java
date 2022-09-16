package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: xxh  reason: default package */
/* loaded from: classes4.dex */
final class xxh implements Runnable {
    final /* synthetic */ Drawable a;
    final /* synthetic */ Uri b;
    final /* synthetic */ xxi c;

    public xxh(xxi xxiVar, Drawable drawable, Uri uri) {
        this.c = xxiVar;
        this.a = drawable;
        this.b = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable drawable = this.a;
        if (drawable == null) {
            this.c.a.setImageDrawable(null);
            return;
        }
        this.c.a.setImageDrawable(drawable);
        if (this.c.c && Build.VERSION.SDK_INT >= 22) {
            Drawable drawable2 = this.a;
            if (drawable2 instanceof BitmapDrawable) {
                hm j = iy.j(this.c.a.getContext().getResources(), ((BitmapDrawable) drawable2).getBitmap());
                j.d();
                this.c.a.setImageDrawable(j);
            }
        }
        if (!this.b.equals(this.c.a.getTag(R.id.bitmap_source_tag))) {
            this.c.a.setTag(R.id.bitmap_source_tag, this.b);
            if (this.c.b.hasStarted() && !this.c.b.hasEnded()) {
                this.c.b.cancel();
                this.c.b.reset();
            }
            xxi xxiVar = this.c;
            xxiVar.a.startAnimation(xxiVar.b);
        }
        Drawable drawable3 = this.a;
        if (!(drawable3 instanceof Animatable)) {
            return;
        }
        Animatable animatable = (Animatable) drawable3;
        if (animatable.isRunning()) {
            return;
        }
        animatable.start();
    }
}
