package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import com.google.android.apps.maps.R;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: PG */
/* renamed from: bzrq  reason: default package */
/* loaded from: classes4.dex */
public final class bzrq {
    private static final dcqe a = dcqe.c("bzrq");
    private final amfi b;
    private final ckcw c;
    private final Resources d;
    private final crzb e;

    public bzrq(amfi amfiVar, ckcw ckcwVar, Resources resources, crzb crzbVar) {
        this.b = amfiVar;
        this.c = ckcwVar;
        this.d = resources;
        this.e = crzbVar;
    }

    private final Paint c() {
        Paint paint = new Paint();
        paint.setColor(-16777216);
        paint.setStrokeWidth(this.d.getDimensionPixelSize(R.dimen.ptn_big_picture_divider_line_width));
        return paint;
    }

    @dzsi
    private final Bitmap d(Iterator<Uri> it, ckql ckqlVar) {
        Bitmap bitmap = null;
        while (bitmap == null && it.hasNext()) {
            bitmap = b(it.next(), ckqlVar);
            if (bitmap == null) {
                it.remove();
            }
        }
        return bitmap;
    }

    private final void e(int i) {
        ((ckco) this.c.a(ckdz.k)).a(i - 1);
    }

    @dzsi
    public final Bitmap a(LinkedList<Uri> linkedList, int i, int i2) {
        if (linkedList.isEmpty()) {
            return null;
        }
        ckql ckqlVar = new ckql();
        ckqlVar.f = true;
        int size = linkedList.size();
        Iterator<Uri> it = linkedList.iterator();
        if (size == 1) {
            ckqlVar.c = i;
            ckqlVar.d = i2;
            Bitmap b = b(it.next(), ckqlVar);
            if (b == null) {
                it.remove();
            }
            return b;
        } else if (size == 2) {
            int i3 = i / 2;
            ckqlVar.c = i3;
            ckqlVar.d = i2;
            Bitmap b2 = b(it.next(), ckqlVar);
            if (b2 == null) {
                it.remove();
                return a(linkedList, i, i2);
            }
            Bitmap b3 = b(it.next(), ckqlVar);
            if (b3 == null) {
                it.remove();
                return a(linkedList, i, i2);
            }
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint c = c();
            canvas.drawBitmap(b2, 0.0f, 0.0f, c);
            float f = i3;
            canvas.drawBitmap(b3, f, 0.0f, c);
            canvas.drawLine(f, 0.0f, f, i2, c);
            return createBitmap;
        } else if (size < 3) {
            return null;
        } else {
            int i4 = i / 3;
            int i5 = i2 / 2;
            int i6 = i - i4;
            ckqlVar.c = i6;
            ckqlVar.d = i2;
            Bitmap b4 = b(it.next(), ckqlVar);
            if (b4 == null) {
                it.remove();
                return a(linkedList, i, i2);
            }
            ckqlVar.c = i4;
            ckqlVar.d = i5;
            Bitmap d = d(it, ckqlVar);
            if (d == null) {
                return a(linkedList, i, i2);
            }
            Bitmap d2 = d(it, ckqlVar);
            if (d2 == null) {
                return a(linkedList, i, i2);
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            Paint c2 = c();
            canvas2.drawBitmap(b4, 0.0f, 0.0f, c2);
            float f2 = i6;
            canvas2.drawBitmap(d, f2, 0.0f, c2);
            float f3 = i5;
            canvas2.drawBitmap(d2, f2, f3, c2);
            canvas2.drawLine(f2, 0.0f, f2, i2, c2);
            canvas2.drawLine(f2, f3, i, f3, c2);
            return createBitmap2;
        }
    }

    @dzsi
    public final Bitmap b(Uri uri, @dzsi ckql ckqlVar) {
        Bitmap bitmap;
        Bitmap bitmap2 = null;
        if (this.e.c()) {
            bvoo.h("LoadPhoto should not be called on main thread.", new Object[0]);
            return null;
        }
        try {
            bitmap = (Bitmap) deha.s(this.b.d(uri.toString(), new bzrp(), ckqlVar));
        } catch (Exception unused) {
        }
        try {
            e(1);
            return bitmap;
        } catch (Exception unused2) {
            bitmap2 = bitmap;
            e(2);
            return bitmap2;
        }
    }
}
