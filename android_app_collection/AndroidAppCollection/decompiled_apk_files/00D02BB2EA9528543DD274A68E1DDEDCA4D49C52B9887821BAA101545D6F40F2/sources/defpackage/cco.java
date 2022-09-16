package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: cco  reason: default package */
/* loaded from: classes.dex */
public final class cco implements bud<Bitmap> {
    public static final btz<Integer> a = btz.b("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    public static final btz<Bitmap.CompressFormat> b = btz.a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    private final bxl c;

    @Deprecated
    public cco() {
        this.c = null;
    }

    public cco(bxl bxlVar) {
        this.c = bxlVar;
    }

    @Override // defpackage.btl
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, bua buaVar) {
        FileOutputStream fileOutputStream;
        Bitmap bitmap = (Bitmap) ((bxd) obj).b();
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) buaVar.c(b);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        SystemClock.elapsedRealtimeNanos();
        int intValue = ((Integer) buaVar.c(a)).intValue();
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            bxl bxlVar = this.c;
            fileOutputStream2 = bxlVar != null ? new buh(fileOutputStream, bxlVar) : fileOutputStream;
            bitmap.compress(compressFormat, intValue, fileOutputStream2);
            fileOutputStream2.close();
            try {
                fileOutputStream2.close();
                return true;
            } catch (IOException unused2) {
                return true;
            }
        } catch (IOException unused3) {
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused4) {
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.bud
    public final int b() {
        return 2;
    }
}
