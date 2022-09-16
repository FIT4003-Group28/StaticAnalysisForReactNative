package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mof  reason: default package */
/* loaded from: classes3.dex */
public final class mof implements yiw {
    final /* synthetic */ boolean a;
    final /* synthetic */ moh b;

    public mof(moh mohVar, boolean z) {
        this.b = mohVar;
        this.a = z;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        this.b.b.post(new Runnable() { // from class: mod
            @Override // java.lang.Runnable
            public final void run() {
                mof mofVar = mof.this;
                moh mohVar = mofVar.b;
                ajmu ajmuVar = mohVar.c;
                if (ajmuVar != null) {
                    mohVar.b.setImageResource(ajmuVar.e);
                } else {
                    mohVar.b.setImageDrawable(new ColorDrawable(zhn.j(mohVar.a, R.attr.ytIcon1).orElse(0)));
                }
                mofVar.b.b.invalidate();
            }
        });
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        int i;
        int i2;
        Uri uri = (Uri) obj;
        final Bitmap bitmap = (Bitmap) obj2;
        if (this.a) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            double d = width;
            double d2 = height;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            if (d3 < 0.5625d) {
                Double.isNaN(d);
                i2 = (int) Math.round((d / 0.5625d) - 1.0d);
                i = width;
            } else {
                if (d3 > 0.5625d) {
                    Double.isNaN(d2);
                    i = (int) Math.round((d2 * 0.5625d) - 1.0d);
                } else {
                    i = width;
                }
                i2 = height;
            }
            double d4 = width - i;
            Double.isNaN(d4);
            int round = (int) Math.round(d4 / 2.0d);
            double d5 = height - i2;
            Double.isNaN(d5);
            int round2 = (int) Math.round(d5 / 2.0d);
            if ((i != width || i2 != height) && i > 0 && i2 > 0) {
                bitmap = Bitmap.createBitmap(bitmap, round, round2, i, i2);
            }
        }
        this.b.b.post(new Runnable() { // from class: moe
            @Override // java.lang.Runnable
            public final void run() {
                mof mofVar = mof.this;
                mofVar.b.b.setImageBitmap(bitmap);
                mofVar.b.b.invalidate();
            }
        });
    }
}
