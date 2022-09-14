package defpackage;

import android.content.Context;
import com.google.android.filament.R;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: daix  reason: default package */
/* loaded from: classes5.dex */
public final class daix {
    private final long a;
    private final Context b;
    private File c;

    public daix(Context context) {
        this.b = context;
        this.a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    public static File h(File file, String str) {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    public static String j(String str) {
        return String.valueOf(str).concat(".apk");
    }

    public static void l(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                l(file2);
            }
        }
        if (!file.exists() || file.delete()) {
            return;
        }
        throw new IOException(String.format("Failed to delete '%s'", file.getAbsolutePath()));
    }

    public static void m(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IllegalArgumentException("File input must be directory when it exists.");
            }
            return;
        }
        file.mkdirs();
        if (file.isDirectory()) {
            return;
        }
        String valueOf = String.valueOf(file.getAbsolutePath());
        throw new IOException(valueOf.length() != 0 ? "Unable to create directory: ".concat(valueOf) : new String("Unable to create directory: "));
    }

    public final void a() {
        File n = n();
        String[] list = n.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.a))) {
                    File file = new File(n, str);
                    String valueOf = String.valueOf(file);
                    long j = this.a;
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + R.styleable.AppCompatTheme_windowActionBarOverlay);
                    sb.append("FileStorage: removing directory for different version code (directory = ");
                    sb.append(valueOf);
                    sb.append(", current version code = ");
                    sb.append(j);
                    sb.append(")");
                    sb.toString();
                    l(file);
                }
            }
        }
    }

    public final File b(String str) {
        return h(d(), j(str));
    }

    public final File c() {
        File file = new File(e(), "unverified-splits");
        m(file);
        return file;
    }

    public final File d() {
        File file = new File(e(), "verified-splits");
        m(file);
        return file;
    }

    public final File e() {
        File file = new File(n(), Long.toString(this.a));
        m(file);
        return file;
    }

    public final File f() {
        File file = new File(e(), "native-libraries");
        m(file);
        return file;
    }

    public final File g(String str) {
        File h = h(f(), str);
        m(h);
        return h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<dajl> i() {
        String name;
        File d = d();
        HashSet hashSet = new HashSet();
        File[] listFiles = d.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile() && file.getName().endsWith(".apk")) {
                    hashSet.add(new daiu(file, file.getName().substring(0, name.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(String str) {
        l(b(str));
    }

    private final File n() {
        if (this.c == null) {
            Context context = this.b;
            if (context == null) {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
            this.c = context.getFilesDir();
        }
        File file = new File(this.c, "splitcompat");
        m(file);
        return file;
    }
}
