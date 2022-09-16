package c.a.a.w;

import android.content.Context;
import androidx.core.util.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
/* loaded from: classes.dex */
class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2614a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2615b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, String str) {
        this.f2614a = context.getApplicationContext();
        this.f2615b = str;
    }

    private File a(String str) {
        File file = new File(this.f2614a.getCacheDir(), a(str, a.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(this.f2614a.getCacheDir(), a(str, a.ZIP, false));
        if (!file2.exists()) {
            return null;
        }
        return file2;
    }

    private static String a(String str, a aVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? aVar.a() : aVar.f2613b);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d<a, InputStream> a() {
        try {
            File a2 = a(this.f2615b);
            if (a2 == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(a2);
            a aVar = a2.getAbsolutePath().endsWith(".zip") ? a.ZIP : a.JSON;
            c.a.a.y.d.a("Cache hit for " + this.f2615b + " at " + a2.getAbsolutePath());
            return new d<>(aVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File a(InputStream inputStream, a aVar) {
        File file = new File(this.f2614a.getCacheDir(), a(this.f2615b, aVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } finally {
            inputStream.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(a aVar) {
        File file = new File(this.f2614a.getCacheDir(), a(this.f2615b, aVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        c.a.a.y.d.a("Copying temp file to real file (" + file2 + ")");
        if (!renameTo) {
            c.a.a.y.d.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
        }
    }
}
