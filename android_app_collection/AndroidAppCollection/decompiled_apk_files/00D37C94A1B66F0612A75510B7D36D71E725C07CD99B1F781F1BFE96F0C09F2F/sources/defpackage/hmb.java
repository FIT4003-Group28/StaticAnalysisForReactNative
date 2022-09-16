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
import android.provider.MediaStore;
import com.google.android.libraries.youtube.edit.common.AutoValue_DeviceLocalFile;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hmb  reason: default package */
/* loaded from: classes3.dex */
public final class hmb extends AsyncTask {
    private final WeakReference a;

    public hmb(hmc hmcVar) {
        this.a = new WeakReference(hmcVar);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        hmc hmcVar = (hmc) this.a.get();
        if (hmcVar == null || !hqs.i(hmcVar)) {
            return null;
        }
        Context rb = hmcVar.rb();
        zne zneVar = rb == null ? null : new zne(rb);
        if (zneVar == null) {
            hmcVar.ai = true;
            return null;
        }
        DeviceLocalFile a = zneVar.a(zneVar.e(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, (String[]) zne.c.toArray(new String[0])), 1);
        DeviceLocalFile b = zneVar.b();
        if (a != null || b != null) {
            if (b != null) {
                if (a != null) {
                    try {
                        if (((AutoValue_DeviceLocalFile) a).d >= ((AutoValue_DeviceLocalFile) b).d) {
                        }
                    } catch (Exception unused) {
                        zep.b("Failed getting photo/video thumbnail as gallery button icon");
                        return null;
                    }
                }
                a = b;
            }
            Bitmap extractThumbnail = ThumbnailUtils.extractThumbnail(zvr.a(hmcVar.rb(), a, null), 96, 96, 2);
            if (extractThumbnail != null && !extractThumbnail.isRecycled()) {
                int width = extractThumbnail.getWidth() + 5;
                int height = extractThumbnail.getHeight() + 5;
                Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                BitmapShader bitmapShader = new BitmapShader(extractThumbnail, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setShader(null);
                paint.setColor(-1);
                int dimension = (int) (hmcVar.rh().getDimension(R.dimen.reels_camera_gallery_waiting_icon_stroke_width) / 1.2f);
                float dimension2 = (int) (hmcVar.rh().getDimension(R.dimen.reels_camera_gallery_waiting_icon_corner_radius) / 1.2f);
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, width, height), dimension2, dimension2, paint);
                paint.setShader(bitmapShader);
                float f = dimension;
                canvas.drawRoundRect(new RectF(f, f, width - dimension, height - dimension), dimension2, dimension2, paint);
                return createBitmap;
            }
            return null;
        }
        hmcVar.ai = true;
        return null;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        hmc hmcVar = (hmc) this.a.get();
        if (hmcVar == null || !hqs.i(hmcVar)) {
            return;
        }
        if (!hmcVar.ai) {
            hmcVar.ar.setEnabled(true);
            zag.o(hmcVar.ar, true ^ hmcVar.an.H());
            hmcVar.c.n(new acte(acuo.b(39304)));
            hmcVar.c.w(new acte(acuo.b(39304)), null);
            if (bitmap == null) {
                hmcVar.ar.setImageDrawable(hmcVar.rh().getDrawable(R.drawable.reel_gallery_button_waiting_icon_v2));
                return;
            } else {
                hmcVar.ar.setImageBitmap(bitmap);
                return;
            }
        }
        hmcVar.ar.setEnabled(false);
    }
}
