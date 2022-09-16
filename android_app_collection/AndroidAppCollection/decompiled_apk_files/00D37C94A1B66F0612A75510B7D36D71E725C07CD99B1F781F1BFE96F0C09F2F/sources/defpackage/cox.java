package defpackage;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: cox  reason: default package */
/* loaded from: classes3.dex */
public final class cox implements cif {
    public static final cib a = cib.c("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    public static final cib b = cib.b("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    private final clb c;

    @Deprecated
    public cox() {
        this.c = null;
    }

    public cox(clb clbVar) {
        this.c = clbVar;
    }

    @Override // defpackage.chn
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, cic cicVar) {
        Bitmap bitmap = (Bitmap) ((cku) obj).c();
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) cicVar.b(b);
        if (compressFormat == null) {
            if (bitmap.hasAlpha()) {
                compressFormat = Bitmap.CompressFormat.PNG;
            } else {
                compressFormat = Bitmap.CompressFormat.JPEG;
            }
        }
        bitmap.getWidth();
        bitmap.getHeight();
        cuy.b();
        int intValue = ((Integer) cicVar.b(a)).intValue();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                clb clbVar = this.c;
                fileOutputStream = clbVar != null ? new cij(fileOutputStream2, clbVar) : fileOutputStream2;
                bitmap.compress(compressFormat, intValue, fileOutputStream);
                fileOutputStream.close();
                try {
                    fileOutputStream.close();
                    return true;
                } catch (IOException unused) {
                    return true;
                }
            } catch (IOException unused2) {
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.cif
    public final int b() {
        return 2;
    }
}
