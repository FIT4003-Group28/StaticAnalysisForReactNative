package c.d.b.b;

import android.os.Environment;
import c.d.b.a.a;
import c.d.b.b.d;
import c.d.d.c.c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class a implements c.d.b.b.d {

    /* renamed from: f  reason: collision with root package name */
    private static final Class<?> f2736f = a.class;

    /* renamed from: g  reason: collision with root package name */
    static final long f2737g = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    private final File f2738a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f2739b;

    /* renamed from: c  reason: collision with root package name */
    private final File f2740c;

    /* renamed from: d  reason: collision with root package name */
    private final c.d.b.a.a f2741d;

    /* renamed from: e  reason: collision with root package name */
    private final com.facebook.common.time.a f2742e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements c.d.d.c.b {

        /* renamed from: a  reason: collision with root package name */
        private final List<d.a> f2743a;

        private b() {
            this.f2743a = new ArrayList();
        }

        public List<d.a> a() {
            return Collections.unmodifiableList(this.f2743a);
        }

        @Override // c.d.d.c.b
        public void a(File file) {
        }

        @Override // c.d.d.c.b
        public void b(File file) {
        }

        @Override // c.d.d.c.b
        public void c(File file) {
            d b2 = a.this.b(file);
            if (b2 == null || b2.f2749a != ".cnt") {
                return;
            }
            this.f2743a.add(new c(b2.f2750b, file));
        }
    }

    /* loaded from: classes.dex */
    static class c implements d.a {

        /* renamed from: a  reason: collision with root package name */
        private final String f2745a;

        /* renamed from: b  reason: collision with root package name */
        private final c.d.a.b f2746b;

        /* renamed from: c  reason: collision with root package name */
        private long f2747c;

        /* renamed from: d  reason: collision with root package name */
        private long f2748d;

        private c(String str, File file) {
            c.d.d.d.i.a(file);
            c.d.d.d.i.a(str);
            this.f2745a = str;
            this.f2746b = c.d.a.b.a(file);
            this.f2747c = -1L;
            this.f2748d = -1L;
        }

        @Override // c.d.b.b.d.a
        public String a() {
            return this.f2745a;
        }

        @Override // c.d.b.b.d.a
        public long b() {
            if (this.f2747c < 0) {
                this.f2747c = this.f2746b.size();
            }
            return this.f2747c;
        }

        @Override // c.d.b.b.d.a
        public long c() {
            if (this.f2748d < 0) {
                this.f2748d = this.f2746b.b().lastModified();
            }
            return this.f2748d;
        }

        public c.d.a.b d() {
            return this.f2746b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f2749a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2750b;

        private d(String str, String str2) {
            this.f2749a = str;
            this.f2750b = str2;
        }

        public static d b(File file) {
            String d2;
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf > 0 && (d2 = a.d(name.substring(lastIndexOf))) != null) {
                String substring = name.substring(0, lastIndexOf);
                if (d2.equals(".tmp")) {
                    int lastIndexOf2 = substring.lastIndexOf(46);
                    if (lastIndexOf2 <= 0) {
                        return null;
                    }
                    substring = substring.substring(0, lastIndexOf2);
                }
                return new d(d2, substring);
            }
            return null;
        }

        public File a(File file) {
            return File.createTempFile(this.f2750b + ".", ".tmp", file);
        }

        public String a(String str) {
            return str + File.separator + this.f2750b + this.f2749a;
        }

        public String toString() {
            return this.f2749a + "(" + this.f2750b + ")";
        }
    }

    /* loaded from: classes.dex */
    private static class e extends IOException {
        public e(long j, long j2) {
            super("File was not written completely. Expected: " + j + ", found: " + j2);
        }
    }

    /* loaded from: classes.dex */
    class f implements d.b {

        /* renamed from: a  reason: collision with root package name */
        private final String f2751a;

        /* renamed from: b  reason: collision with root package name */
        final File f2752b;

        public f(String str, File file) {
            this.f2751a = str;
            this.f2752b = file;
        }

        @Override // c.d.b.b.d.b
        public c.d.a.a a(Object obj) {
            a.EnumC0068a enumC0068a;
            File b2 = a.this.b(this.f2751a);
            try {
                c.d.d.c.c.a(this.f2752b, b2);
                if (b2.exists()) {
                    b2.setLastModified(a.this.f2742e.now());
                }
                return c.d.a.b.a(b2);
            } catch (c.d e2) {
                Throwable cause = e2.getCause();
                if (cause != null) {
                    if (cause instanceof c.C0070c) {
                        enumC0068a = a.EnumC0068a.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
                    } else if (cause instanceof FileNotFoundException) {
                        enumC0068a = a.EnumC0068a.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND;
                    }
                    a.this.f2741d.a(enumC0068a, a.f2736f, "commit", e2);
                    throw e2;
                }
                enumC0068a = a.EnumC0068a.WRITE_RENAME_FILE_OTHER;
                a.this.f2741d.a(enumC0068a, a.f2736f, "commit", e2);
                throw e2;
            }
        }

        @Override // c.d.b.b.d.b
        public void a(c.d.b.a.j jVar, Object obj) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f2752b);
                try {
                    c.d.d.d.c cVar = new c.d.d.d.c(fileOutputStream);
                    jVar.a(cVar);
                    cVar.flush();
                    long a2 = cVar.a();
                    fileOutputStream.close();
                    if (this.f2752b.length() != a2) {
                        throw new e(a2, this.f2752b.length());
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e2) {
                a.this.f2741d.a(a.EnumC0068a.WRITE_UPDATE_FILE_NOT_FOUND, a.f2736f, "updateResource", e2);
                throw e2;
            }
        }

        @Override // c.d.b.b.d.b
        public boolean x() {
            return !this.f2752b.exists() || this.f2752b.delete();
        }
    }

    /* loaded from: classes.dex */
    private class g implements c.d.d.c.b {

        /* renamed from: a  reason: collision with root package name */
        private boolean f2754a;

        private g() {
        }

        private boolean d(File file) {
            d b2 = a.this.b(file);
            boolean z = false;
            if (b2 == null) {
                return false;
            }
            String str = b2.f2749a;
            if (str == ".tmp") {
                return e(file);
            }
            if (str == ".cnt") {
                z = true;
            }
            c.d.d.d.i.b(z);
            return true;
        }

        private boolean e(File file) {
            return file.lastModified() > a.this.f2742e.now() - a.f2737g;
        }

        @Override // c.d.d.c.b
        public void a(File file) {
            if (this.f2754a || !file.equals(a.this.f2740c)) {
                return;
            }
            this.f2754a = true;
        }

        @Override // c.d.d.c.b
        public void b(File file) {
            if (!a.this.f2738a.equals(file) && !this.f2754a) {
                file.delete();
            }
            if (!this.f2754a || !file.equals(a.this.f2740c)) {
                return;
            }
            this.f2754a = false;
        }

        @Override // c.d.d.c.b
        public void c(File file) {
            if (!this.f2754a || !d(file)) {
                file.delete();
            }
        }
    }

    public a(File file, int i, c.d.b.a.a aVar) {
        c.d.d.d.i.a(file);
        this.f2738a = file;
        this.f2739b = a(file, aVar);
        this.f2740c = new File(this.f2738a, a(i));
        this.f2741d = aVar;
        f();
        this.f2742e = com.facebook.common.time.c.a();
    }

    private long a(File file) {
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (!file.delete()) {
            return -1L;
        }
        return length;
    }

    static String a(int i) {
        return String.format(null, "%s.ols%d.%d", "v2", 100, Integer.valueOf(i));
    }

    private void a(File file, String str) {
        try {
            c.d.d.c.c.a(file);
        } catch (c.a e2) {
            this.f2741d.a(a.EnumC0068a.WRITE_CREATE_DIR, f2736f, str, e2);
            throw e2;
        }
    }

    private static boolean a(File file, c.d.b.a.a aVar) {
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return false;
            }
            try {
            } catch (IOException e2) {
                e = e2;
            }
            try {
                return file.getCanonicalPath().contains(externalStorageDirectory.toString());
            } catch (IOException e3) {
                e = e3;
                a.EnumC0068a enumC0068a = a.EnumC0068a.OTHER;
                Class<?> cls = f2736f;
                aVar.a(enumC0068a, cls, "failed to read folder to check if external: " + ((String) null), e);
                return false;
            }
        } catch (Exception e4) {
            aVar.a(a.EnumC0068a.OTHER, f2736f, "failed to get the external storage directory!", e4);
            return false;
        }
    }

    private boolean a(String str, boolean z) {
        File b2 = b(str);
        boolean exists = b2.exists();
        if (z && exists) {
            b2.setLastModified(this.f2742e.now());
        }
        return exists;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d b(File file) {
        d b2 = d.b(file);
        if (b2 != null && f(b2.f2750b).equals(file.getParentFile())) {
            return b2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str) {
        if (".cnt".equals(str)) {
            return ".cnt";
        }
        if (!".tmp".equals(str)) {
            return null;
        }
        return ".tmp";
    }

    private String e(String str) {
        d dVar = new d(".cnt", str);
        return dVar.a(g(dVar.f2750b));
    }

    private File f(String str) {
        return new File(g(str));
    }

    private void f() {
        boolean z = true;
        if (this.f2738a.exists()) {
            if (!this.f2740c.exists()) {
                c.d.d.c.a.b(this.f2738a);
            } else {
                z = false;
            }
        }
        if (z) {
            try {
                c.d.d.c.c.a(this.f2740c);
            } catch (c.a unused) {
                c.d.b.a.a aVar = this.f2741d;
                a.EnumC0068a enumC0068a = a.EnumC0068a.WRITE_CREATE_DIR;
                Class<?> cls = f2736f;
                aVar.a(enumC0068a, cls, "version directory could not be created: " + this.f2740c, null);
            }
        }
    }

    private String g(String str) {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        return this.f2740c + File.separator + valueOf;
    }

    @Override // c.d.b.b.d
    public long a(d.a aVar) {
        return a(((c) aVar).d().b());
    }

    @Override // c.d.b.b.d
    public long a(String str) {
        return a(b(str));
    }

    @Override // c.d.b.b.d
    public d.b a(String str, Object obj) {
        d dVar = new d(".tmp", str);
        File f2 = f(dVar.f2750b);
        if (!f2.exists()) {
            a(f2, "insert");
        }
        try {
            return new f(str, dVar.a(f2));
        } catch (IOException e2) {
            this.f2741d.a(a.EnumC0068a.WRITE_CREATE_TEMPFILE, f2736f, "insert", e2);
            throw e2;
        }
    }

    @Override // c.d.b.b.d
    public void a() {
        c.d.d.c.a.a(this.f2738a);
    }

    File b(String str) {
        return new File(e(str));
    }

    @Override // c.d.b.b.d
    /* renamed from: b  reason: collision with other method in class */
    public List<d.a> mo115b() {
        b bVar = new b();
        c.d.d.c.a.a(this.f2740c, bVar);
        return bVar.a();
    }

    @Override // c.d.b.b.d
    public boolean b(String str, Object obj) {
        return a(str, false);
    }

    @Override // c.d.b.b.d
    public c.d.a.a c(String str, Object obj) {
        File b2 = b(str);
        if (b2.exists()) {
            b2.setLastModified(this.f2742e.now());
            return c.d.a.b.a(b2);
        }
        return null;
    }

    @Override // c.d.b.b.d
    public boolean c() {
        return this.f2739b;
    }

    @Override // c.d.b.b.d
    public void d() {
        c.d.d.c.a.a(this.f2738a, new g());
    }
}
