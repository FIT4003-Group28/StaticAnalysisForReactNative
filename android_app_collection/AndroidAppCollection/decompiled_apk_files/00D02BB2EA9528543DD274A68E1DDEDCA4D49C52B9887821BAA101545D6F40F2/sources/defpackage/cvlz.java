package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: cvlz  reason: default package */
/* loaded from: classes5.dex */
public final class cvlz implements cvly {
    public Context a;

    static final Rect c(Bitmap bitmap, float f) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f2 = width;
        float f3 = height;
        float f4 = f2 / f3;
        if (f4 == f) {
            return new Rect(0, 0, width, height);
        }
        if (f4 > f) {
            int i = (int) (f * f3);
            int i2 = (width - i) / 2;
            return new Rect(i2, 0, i + i2, height);
        }
        int i3 = (height - ((int) (f2 * f))) / 2;
        return new Rect(0, i3, width, i3 + width);
    }

    static final Rect d(Bitmap bitmap) {
        return c(bitmap, 1.0f);
    }

    private final void e(Canvas canvas, List<Bitmap> list) {
        Paint paint = new Paint();
        int width = canvas.getWidth();
        int i = width / 2;
        int size = list.size();
        if (size == 0) {
            cvlw.d("ChimeImageProcessorImpl", "Got empty list of avatars to merge.", new Object[0]);
        } else if (size == 1) {
            canvas.drawBitmap(list.get(0), d(list.get(0)), new Rect(0, 0, width, width), paint);
        } else if (size == 2) {
            canvas.drawBitmap(list.get(0), c(list.get(0), 0.5f), new Rect(0, 0, i, width), paint);
            canvas.drawBitmap(list.get(1), c(list.get(1), 0.5f), new Rect(i, 0, width, width), paint);
        } else if (size == 3) {
            canvas.drawBitmap(list.get(0), c(list.get(0), 0.5f), new Rect(0, 0, i, width), paint);
            canvas.drawBitmap(list.get(1), d(list.get(1)), new Rect(i, 0, width, i), paint);
            canvas.drawBitmap(list.get(2), d(list.get(2)), new Rect(i, i, width, width), paint);
        } else {
            canvas.drawBitmap(list.get(0), d(list.get(0)), new Rect(0, 0, i, i), paint);
            canvas.drawBitmap(list.get(1), d(list.get(1)), new Rect(i, 0, width, i), paint);
            canvas.drawBitmap(list.get(2), d(list.get(2)), new Rect(0, i, i, width), paint);
            canvas.drawBitmap(list.get(3), d(list.get(3)), new Rect(i, i, width, width), paint);
        }
    }

    @Override // defpackage.cvly
    @dzsi
    public final Bitmap a(int i, List<Bitmap> list) {
        int i2;
        if (list.isEmpty()) {
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            e(canvas, list);
            Paint paint = new Paint();
            int width = canvas.getWidth();
            int i3 = width / 2;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(width / 4);
            paint.setColor(-16777216);
            paint.setAntiAlias(true);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            float f = i3;
            canvas.drawCircle(f, f, i3 + (i2 / 2), paint);
            return createBitmap;
        } catch (Exception unused) {
            cvlw.e("ChimeImageProcessorImpl", "Failed to create circular avatar.", new Object[0]);
            return null;
        } catch (OutOfMemoryError unused2) {
            cvlw.e("ChimeImageProcessorImpl", "Failed to allocate memory.", new Object[0]);
            return null;
        }
    }

    @Override // defpackage.cvly
    @dzsi
    public final Bitmap b(int i, List<Bitmap> list) {
        if (list.isEmpty()) {
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.notifications_avatar_separator_stroke_width);
            e(canvas, list);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(dimensionPixelSize);
            paint.setColor(-16777216);
            int width = canvas.getWidth();
            int i2 = width / 2;
            int size = list.size();
            if (size == 0) {
                cvlw.d("ChimeImageProcessorImpl", "Got empty list of images to draw seprator on.", new Object[0]);
            } else if (size == 1) {
                cvlw.a("ChimeImageProcessorImpl", "Not adding any separators since there is only one image.", new Object[0]);
            } else if (size == 2) {
                float f = i2;
                canvas.drawLine(f, 0.0f, f, width, paint);
            } else if (size == 3) {
                float f2 = i2;
                float f3 = width;
                canvas.drawLine(f2, 0.0f, f2, f3, paint);
                canvas.drawLine(f2, f2, f3, f2, paint);
            } else {
                float f4 = i2;
                float f5 = width;
                canvas.drawLine(f4, 0.0f, f4, f5, paint);
                canvas.drawLine(0.0f, f4, f5, f4, paint);
            }
            return createBitmap;
        } catch (Exception unused) {
            cvlw.e("ChimeImageProcessorImpl", "Failed to create square avatar.", new Object[0]);
            return null;
        } catch (OutOfMemoryError unused2) {
            cvlw.e("ChimeImageProcessorImpl", "Failed to allocate memory.", new Object[0]);
            return null;
        }
    }
}
