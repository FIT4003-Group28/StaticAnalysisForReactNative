package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mop  reason: default package */
/* loaded from: classes3.dex */
public final class mop implements yiw {
    final /* synthetic */ mor a;

    public mop(mor morVar) {
        this.a = morVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        this.a.h.post(new Runnable() { // from class: mon
            @Override // java.lang.Runnable
            public final void run() {
                mop mopVar = mop.this;
                mopVar.a.h.setImageResource(2131232143);
                mopVar.a.h.invalidate();
            }
        });
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        final Bitmap bitmap = (Bitmap) obj2;
        if (bitmap != null) {
            this.a.h.post(new Runnable() { // from class: moo
                @Override // java.lang.Runnable
                public final void run() {
                    mop mopVar = mop.this;
                    mopVar.a.h.setImageBitmap(bitmap);
                    mopVar.a.h.invalidate();
                }
            });
            final mor morVar = this.a;
            int min = Math.min(4, bitmap.getHeight());
            bin binVar = new bin(bitmap);
            binVar.c(0, bitmap.getWidth(), min);
            final int a = binVar.b().a(morVar.i);
            bin binVar2 = new bin(bitmap);
            binVar2.c(bitmap.getHeight() - min, bitmap.getWidth(), bitmap.getHeight());
            final int a2 = binVar2.b().a(morVar.i);
            morVar.g.post(new Runnable() { // from class: mom
                @Override // java.lang.Runnable
                public final void run() {
                    mor morVar2 = mor.this;
                    int i = a;
                    int i2 = a2;
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColors(new int[]{i, i2});
                    morVar2.g.setBackground(gradientDrawable);
                }
            });
        }
    }
}
