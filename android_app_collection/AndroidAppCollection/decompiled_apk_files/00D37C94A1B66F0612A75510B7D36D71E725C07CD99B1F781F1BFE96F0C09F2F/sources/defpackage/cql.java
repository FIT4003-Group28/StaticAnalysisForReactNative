package defpackage;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
/* compiled from: PG */
/* renamed from: cql  reason: default package */
/* loaded from: classes3.dex */
public final class cql implements cie {
    public static final cib a = cib.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new cqg(1));
    public static final cib b = cib.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new cqg());
    private final cqj c;
    private final cld d;

    public cql(cld cldVar, cqj cqjVar) {
        this.d = cldVar;
        this.c = cqjVar;
    }

    @Override // defpackage.cie
    public final cku a(Object obj, int i, int i2, cic cicVar) {
        long longValue = ((Long) cicVar.b(a)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) cicVar.b(b);
            if (num == null) {
                num = 2;
            }
            cpi cpiVar = (cpi) cicVar.b(cpi.f);
            if (cpiVar == null) {
                cpiVar = cpi.e;
            }
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                this.c.a(mediaMetadataRetriever, obj);
                int intValue = num.intValue();
                Bitmap bitmap = null;
                if (Build.VERSION.SDK_INT >= 27 && i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && cpiVar != cpi.d) {
                    try {
                        int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                        int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                        int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                        if (parseInt3 == 90 || parseInt3 == 270) {
                            parseInt2 = parseInt;
                            parseInt = parseInt2;
                        }
                        float a2 = cpiVar.a(parseInt, parseInt2, i, i2);
                        bitmap = mediaMetadataRetriever.getScaledFrameAtTime(longValue, intValue, Math.round(parseInt * a2), Math.round(a2 * parseInt2));
                    } catch (Throwable unused) {
                    }
                }
                if (bitmap == null) {
                    bitmap = mediaMetadataRetriever.getFrameAtTime(longValue, intValue);
                }
                if (bitmap == null) {
                    throw new cqk();
                }
                return coy.f(bitmap, this.d);
            } finally {
                if (Build.VERSION.SDK_INT >= 29) {
                    mediaMetadataRetriever.close();
                } else {
                    mediaMetadataRetriever.release();
                }
            }
        }
        StringBuilder sb = new StringBuilder(83);
        sb.append("Requested frame must be non-negative, or DEFAULT_FRAME, given: ");
        sb.append(longValue);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.cie
    public final boolean b(Object obj, cic cicVar) {
        return true;
    }
}
