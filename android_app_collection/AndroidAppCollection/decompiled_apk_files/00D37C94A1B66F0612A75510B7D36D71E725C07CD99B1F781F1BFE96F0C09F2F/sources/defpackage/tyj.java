package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;
/* compiled from: PG */
/* renamed from: tyj  reason: default package */
/* loaded from: classes4.dex */
public final class tyj implements vja {
    private final Uri a;

    public tyj(Uri uri) {
        this.a = uri;
    }

    @Override // defpackage.vja
    public final /* bridge */ /* synthetic */ Object a(viz vizVar) {
        vjb vjbVar = vizVar.a;
        try {
            vkk b = vkk.b();
            b.a = true;
            ZipInputStream zipInputStream = new ZipInputStream(b.a(vizVar));
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    String name = nextEntry.getName();
                    if (name.contains("..")) {
                        for (File file = new File(name); file != null; file = file.getParentFile()) {
                            if (file.getName().equals("..")) {
                                String valueOf = String.valueOf(name);
                                throw new ZipException(valueOf.length() != 0 ? "Illegal name: ".concat(valueOf) : new String("Illegal name: "));
                            }
                        }
                    }
                    Uri build = this.a.buildUpon().appendPath(name).build();
                    if (nextEntry.isDirectory()) {
                        vjbVar.d(build);
                    } else {
                        OutputStream outputStream = (OutputStream) vjbVar.c(build, vkl.b());
                        try {
                            anek.g(zipInputStream, outputStream);
                            if (outputStream != null) {
                                outputStream.close();
                            }
                        } catch (Throwable th) {
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (Throwable unused) {
                                }
                            }
                            throw th;
                        }
                    }
                } else {
                    zipInputStream.close();
                    return null;
                }
            }
        } catch (IOException e) {
            vjbVar.j(this.a);
            throw e;
        }
    }
}
