package defpackage;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: cep  reason: default package */
/* loaded from: classes.dex */
public final class cep<T> implements buc<T, Bitmap> {
    public static final btz<Long> a = btz.c("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new ceh());
    public static final btz<Integer> b = btz.c("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new cei());
    private static final cem c = new cem();
    private final cen<T> d;
    private final bxn e;

    public cep(bxn bxnVar, cen<T> cenVar) {
        this.e = bxnVar;
        this.d = cenVar;
    }

    @Override // defpackage.buc
    public final boolean a(T t, bua buaVar) {
        return true;
    }

    @Override // defpackage.buc
    public final bxd<Bitmap> b(T t, int i, int i2, bua buaVar) {
        long longValue = ((Long) buaVar.c(a)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) buaVar.c(b);
            if (num == null) {
                num = 2;
            }
            cdi cdiVar = (cdi) buaVar.c(cdi.g);
            if (cdiVar == null) {
                cdiVar = cdi.f;
            }
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    this.d.a(mediaMetadataRetriever, t);
                    int intValue = num.intValue();
                    Bitmap bitmap = null;
                    if (Build.VERSION.SDK_INT >= 27 && i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && cdiVar != cdi.e) {
                        try {
                            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                            if (parseInt3 == 90 || parseInt3 == 270) {
                                parseInt2 = parseInt;
                                parseInt = parseInt2;
                            }
                            float a2 = cdiVar.a(parseInt, parseInt2, i, i2);
                            bitmap = mediaMetadataRetriever.getScaledFrameAtTime(longValue, intValue, Math.round(parseInt * a2), Math.round(a2 * parseInt2));
                        } catch (Throwable unused) {
                        }
                    }
                    if (bitmap == null) {
                        bitmap = mediaMetadataRetriever.getFrameAtTime(longValue, intValue);
                    }
                    mediaMetadataRetriever.release();
                    return ccq.f(bitmap, this.e);
                } catch (RuntimeException e) {
                    throw new IOException(e);
                }
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
        }
        StringBuilder sb = new StringBuilder(83);
        sb.append("Requested frame must be non-negative, or DEFAULT_FRAME, given: ");
        sb.append(longValue);
        throw new IllegalArgumentException(sb.toString());
    }
}
