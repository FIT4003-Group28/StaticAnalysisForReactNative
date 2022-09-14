package vi.com.gdi.bgl.android.java;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.SparseArray;
/* loaded from: classes2.dex */
public class EnvDrawText {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5695a = "EnvDrawText";
    public static boolean bBmpChange = false;
    public static Bitmap bmp;
    public static int[] buffer;
    public static Canvas canvasTemp;
    public static SparseArray<a> fontCache;
    public static int iWordHightMax;
    public static int iWordWidthMax;
    public static Paint pt;

    /* JADX WARN: Removed duplicated region for block: B:106:0x0361 A[Catch: all -> 0x037c, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x0011, B:8:0x001e, B:10:0x0025, B:15:0x0033, B:16:0x0036, B:20:0x004e, B:18:0x0041, B:21:0x0055, B:23:0x0061, B:25:0x0065, B:27:0x006f, B:28:0x0076, B:30:0x0089, B:32:0x00d7, B:35:0x00e1, B:37:0x00ee, B:39:0x00f2, B:41:0x00fa, B:42:0x00ff, B:44:0x010f, B:45:0x0116, B:47:0x0124, B:49:0x0129, B:50:0x012e, B:54:0x0138, B:55:0x0163, B:56:0x0177, B:104:0x0356, B:106:0x0361, B:107:0x0365, B:51:0x0132, B:46:0x011e, B:34:0x00db, B:57:0x017c, B:58:0x018b, B:60:0x0191, B:63:0x019f, B:64:0x01a4, B:66:0x01aa, B:69:0x01bc, B:71:0x0208, B:74:0x0212, B:76:0x021f, B:78:0x0223, B:80:0x022b, B:81:0x0230, B:83:0x0240, B:84:0x0247, B:86:0x0255, B:88:0x025a, B:91:0x026c, B:93:0x0272, B:95:0x0281, B:97:0x02c0, B:98:0x02ea, B:100:0x02f2, B:102:0x0303, B:103:0x0337, B:89:0x0263, B:85:0x024f, B:73:0x020c, B:17:0x0039, B:19:0x0045, B:7:0x0019), top: B:114:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized int[] drawText(java.lang.String r21, int r22, int r23, int[] r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vi.com.gdi.bgl.android.java.EnvDrawText.drawText(java.lang.String, int, int, int[], int, int, int, int):int[]");
    }

    public static short[] getTextSize(String str, int i, int i2) {
        Typeface typeface;
        Typeface create;
        int length = str.length();
        if (length == 0) {
            return null;
        }
        Paint paint = new Paint();
        int i3 = 1;
        paint.setSubpixelText(true);
        paint.setAntiAlias(true);
        paint.setTextSize(i);
        switch (i2) {
            case 1:
                typeface = Typeface.DEFAULT;
                create = Typeface.create(typeface, i3);
                break;
            case 2:
                typeface = Typeface.DEFAULT;
                i3 = 2;
                create = Typeface.create(typeface, i3);
                break;
            default:
                create = Typeface.create(Typeface.DEFAULT, 0);
                break;
        }
        paint.setTypeface(create);
        short[] sArr = new short[length];
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 + 1;
            sArr[i4] = (short) paint.measureText(str.substring(0, i5));
            i4 = i5;
        }
        return sArr;
    }

    public static synchronized void registFontCache(int i, Typeface typeface) {
        synchronized (EnvDrawText.class) {
            if (i == 0 || typeface == null) {
                return;
            }
            if (fontCache == null) {
                fontCache = new SparseArray<>();
            }
            a aVar = fontCache.get(i);
            if (aVar == null) {
                a aVar2 = new a();
                aVar2.f5696a = typeface;
                aVar2.f5697b++;
                fontCache.put(i, aVar2);
            } else {
                aVar.f5697b++;
            }
        }
    }

    public static synchronized void removeFontCache(int i) {
        synchronized (EnvDrawText.class) {
            a aVar = fontCache.get(i);
            if (aVar == null) {
                return;
            }
            aVar.f5697b--;
            if (aVar.f5697b == 0) {
                fontCache.remove(i);
            }
        }
    }
}
