package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.text.Normalizer;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: cuuv  reason: default package */
/* loaded from: classes5.dex */
public final class cuuv {
    private static final double a = 2.0d - Math.sqrt(2.0d);
    private static cuuv b = null;

    public static cuuv a() {
        if (b == null) {
            b = new cuuv();
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bitmap b(int i, Drawable drawable, int i2, int i3) {
        Bitmap createBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        float f = i3 / 2.0f;
        canvas.drawCircle(f, f, f, paint);
        drawable.setBounds(new Rect(0, 0, i3, i3));
        Drawable b2 = ks.b(drawable);
        b2.setTint(i2);
        b2.draw(canvas);
        return createBitmap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bitmap c(List<Bitmap> list, int i) {
        RectF[] rectFArr;
        Bitmap bitmap;
        if (list.size() > 4) {
            cstl.a("AvatarUtils");
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        int size = list.size();
        float width = createBitmap.getWidth();
        float height = createBitmap.getHeight();
        if (size <= 0) {
            throw new IllegalArgumentException();
        }
        float f = width / 2.0f;
        float f2 = height / 2.0f;
        if (size == 1) {
            rectFArr = new RectF[]{new RectF(0.0f, 0.0f, width, height)};
        } else if (size == 2) {
            float f3 = ((float) a) * width;
            rectFArr = new RectF[]{new RectF(0.0f, 0.0f, f3, f3), new RectF(width - f3, height - f3, width, height)};
        } else if (size != 3) {
            rectFArr = new RectF[]{new RectF(0.0f, 0.0f, f, f2), new RectF(f, 0.0f, width, f2), new RectF(0.0f, f2, f, height), new RectF(f, f2, width, height)};
        } else {
            float f4 = width / 4.0f;
            float f5 = height / 4.0f;
            double d = f5;
            double sqrt = Math.sqrt(3.0d);
            Double.isNaN(d);
            float f6 = (height - f5) - ((float) (d * sqrt));
            rectFArr = new RectF[]{new RectF(f4, f6 - f5, f4 * 3.0f, f6 + f5), new RectF(0.0f, f2, f, height), new RectF(f, f2, width, height)};
        }
        for (int i2 = 0; i2 < rectFArr.length; i2++) {
            RectF rectF = rectFArr[i2];
            BitmapShader bitmapShader = new BitmapShader(list.get(i2), Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            Matrix matrix = new Matrix();
            matrix.setRectToRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), rectF, Matrix.ScaleToFit.FILL);
            bitmapShader.setLocalMatrix(matrix);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setShader(bitmapShader);
            canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint);
        }
        return createBitmap;
    }

    public final Bitmap d(cufj cufjVar, int i, int[] iArr, int i2, dbsg<Bitmap> dbsgVar, Drawable drawable) {
        String str;
        Rect rect;
        if (cufjVar.e().a()) {
            return c(Arrays.asList(cufjVar.e().b()), i);
        }
        int hashCode = cufjVar.a().a().hashCode();
        if (cufjVar.b().a() && !TextUtils.isEmpty(cufjVar.b().b())) {
            hashCode = cufjVar.b().b().hashCode();
        }
        int abs = Math.abs(hashCode % iArr.length);
        if (cufjVar.b().a() && !cufjVar.a().c().equals(ContactId.ContactType.DEVICE_ID)) {
            char[] charArray = Normalizer.normalize(cufjVar.b().b(), Normalizer.Form.NFKC).toCharArray();
            int length = charArray.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    str = null;
                    break;
                }
                char c = charArray[i3];
                if (Character.isLetter(c)) {
                    str = Character.toString(Character.toUpperCase(c));
                    break;
                }
                i3++;
            }
            if (!TextUtils.isEmpty(str)) {
                int i4 = iArr[abs];
                Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setColor(i4);
                float f = i;
                float f2 = f / 2.0f;
                canvas.drawCircle(f2, f2, f2, paint);
                Paint paint2 = new Paint();
                paint2.setTextAlign(Paint.Align.CENTER);
                paint2.setColor(i2);
                paint2.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
                paint2.setTextSize(f * 0.6f);
                paint2.setAntiAlias(true);
                paint2.getTextBounds(str, 0, 1, new Rect());
                canvas.drawText(str, i / 2, ((i + rect.bottom) - rect.top) / 2, paint2);
                return createBitmap;
            }
        }
        if (dbsgVar.a()) {
            return dbsgVar.b();
        }
        return b(iArr[abs], drawable, i2, i);
    }

    public final Bitmap e(Drawable drawable, int i) {
        int i2;
        int i3;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        float f = i / 2.0f;
        canvas.drawCircle(f, f, f, paint);
        double d = i;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d);
        int ceil = (int) Math.ceil(d / sqrt);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int i4 = (i - ceil) / 2;
        if (intrinsicWidth >= intrinsicHeight) {
            i3 = (((intrinsicWidth - intrinsicHeight) * ceil) / (intrinsicWidth + intrinsicWidth)) + i4;
            i2 = (intrinsicHeight / intrinsicWidth) * ceil;
        } else {
            int i5 = (((intrinsicHeight - intrinsicWidth) * ceil) / (intrinsicHeight + intrinsicHeight)) + i4;
            i2 = ceil;
            ceil = (intrinsicWidth / intrinsicHeight) * ceil;
            i3 = i4;
            i4 = i5;
        }
        drawable.setBounds(new Rect(i4, i3, ceil + i4, i2 + i3));
        drawable.draw(canvas);
        return createBitmap;
    }
}
