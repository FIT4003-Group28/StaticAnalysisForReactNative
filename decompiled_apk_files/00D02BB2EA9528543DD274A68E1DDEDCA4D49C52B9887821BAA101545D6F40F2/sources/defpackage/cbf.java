package defpackage;

import com.google.ar.core.ImageMetadata;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: cbf  reason: default package */
/* loaded from: classes.dex */
public final class cbf implements btl<InputStream> {
    private final bxl a;

    public cbf(bxl bxlVar) {
        this.a = bxlVar;
    }

    @Override // defpackage.btl
    public final /* bridge */ /* synthetic */ boolean a(InputStream inputStream, File file, bua buaVar) {
        InputStream inputStream2 = inputStream;
        byte[] bArr = (byte[]) this.a.b(ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            while (true) {
                try {
                    int read = inputStream2.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, read);
                } catch (IOException unused) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.a.a(bArr);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    this.a.a(bArr);
                    throw th;
                }
            }
            fileOutputStream2.close();
            try {
                fileOutputStream2.close();
            } catch (IOException unused4) {
            }
            this.a.a(bArr);
            return true;
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
