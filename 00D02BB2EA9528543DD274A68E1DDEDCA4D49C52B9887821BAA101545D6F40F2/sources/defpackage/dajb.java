package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* compiled from: PG */
/* renamed from: dajb  reason: default package */
/* loaded from: classes5.dex */
final class dajb implements dajd {
    final /* synthetic */ Set a;
    final /* synthetic */ dajl b;
    final /* synthetic */ ZipFile c;

    public dajb(Set set, dajl dajlVar, ZipFile zipFile) {
        this.a = set;
        this.b = dajlVar;
        this.c = zipFile;
    }

    @Override // defpackage.dajd
    public final void a(daje dajeVar, File file, boolean z) {
        this.a.add(file);
        if (!z) {
            this.b.b();
            String str = dajeVar.a;
            this.b.a().getAbsolutePath();
            dajeVar.b.getName();
            file.getAbsolutePath();
            ZipFile zipFile = this.c;
            ZipEntry zipEntry = dajeVar.b;
            int i = dajf.b;
            byte[] bArr = new byte[4096];
            InputStream inputStream = zipFile.getInputStream(zipEntry);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.close();
                if (inputStream == null) {
                    return;
                }
                inputStream.close();
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        deki.a(th, th2);
                    }
                }
                throw th;
            }
        }
    }
}
