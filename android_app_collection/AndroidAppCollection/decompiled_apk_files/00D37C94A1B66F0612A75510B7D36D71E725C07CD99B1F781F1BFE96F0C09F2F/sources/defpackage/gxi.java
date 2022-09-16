package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.media.ThumbnailUtils;
import android.os.AsyncTask;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gxi  reason: default package */
/* loaded from: classes3.dex */
public final class gxi extends AsyncTask {
    private final WeakReference a;

    public gxi(gxk gxkVar) {
        this.a = new WeakReference(gxkVar);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        DeviceLocalFile b;
        Bitmap extractThumbnail;
        Void[] voidArr = (Void[]) objArr;
        gxk gxkVar = (gxk) this.a.get();
        if (gxkVar == null || !hqs.i(gxkVar)) {
            return null;
        }
        Context rb = gxkVar.rb();
        zne zneVar = rb == null ? null : new zne(rb);
        if (zneVar == null || (b = zneVar.b()) == null) {
            return null;
        }
        try {
            Bitmap a = zvr.a(gxkVar.rb(), b, null);
            if (a == null) {
                extractThumbnail = null;
            } else {
                int dimensionPixelSize = gxkVar.rh().getDimensionPixelSize(R.dimen.shorts_camera_gallery_preview_icon_size);
                extractThumbnail = ThumbnailUtils.extractThumbnail(a, dimensionPixelSize, dimensionPixelSize, 2);
            }
            if (extractThumbnail == null) {
                return null;
            }
            int dimensionPixelSize2 = gxkVar.rh().getDimensionPixelSize(R.dimen.shorts_camera_gallery_waiting_icon_stroke_width);
            int color = gxkVar.rh().getColor(R.color.shorts_camera_gallery_waiting_icon_stroke_color);
            if (extractThumbnail.isRecycled()) {
                return null;
            }
            int i = dimensionPixelSize2 + dimensionPixelSize2;
            int width = extractThumbnail.getWidth() + i;
            int height = extractThumbnail.getHeight() + i;
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            BitmapShader bitmapShader = new BitmapShader(extractThumbnail, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setShader(null);
            paint.setColor(color);
            int dimensionPixelSize3 = gxkVar.rh().getDimensionPixelSize(R.dimen.shorts_camera_gallery_waiting_icon_border_corner_radius);
            int dimensionPixelSize4 = gxkVar.rh().getDimensionPixelSize(R.dimen.shorts_camera_gallery_waiting_icon_image_corner_radius);
            float f = dimensionPixelSize3;
            canvas.drawRoundRect(new RectF(0.0f, 0.0f, width, height), f, f, paint);
            paint.setShader(bitmapShader);
            float f2 = dimensionPixelSize2;
            float f3 = dimensionPixelSize4;
            canvas.drawRoundRect(new RectF(f2, f2, width - dimensionPixelSize2, height - dimensionPixelSize2), f3, f3, paint);
            return createBitmap;
        } catch (Exception unused) {
            zep.b("Failed getting video thumbnail as gallery button icon");
            return null;
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        gxk gxkVar = (gxk) this.a.get();
        if (gxkVar == null || !hqs.i(gxkVar)) {
            return;
        }
        if (bitmap != null) {
            gxkVar.aN.setImageBitmap(bitmap);
            return;
        }
        gxkVar.aN.setImageDrawable(po.b(gxkVar.rb(), R.drawable.shorts_gallery_button_waiting_icon));
    }
}
