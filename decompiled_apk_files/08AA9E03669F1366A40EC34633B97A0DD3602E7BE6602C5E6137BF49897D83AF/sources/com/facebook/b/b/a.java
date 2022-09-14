package com.facebook.b.b;

import android.os.Environment;
import com.facebook.b.a.a;
import com.facebook.b.b.d;
import com.facebook.common.c.c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: DefaultDiskStorage.java */
/* loaded from: classes.dex */
public class a implements com.facebook.b.b.d {

    /* renamed from: c  reason: collision with root package name */
    private final File f2180c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f2181d;
    private final File e;
    private final com.facebook.b.a.a f;
    private final com.facebook.common.time.a g;

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f2179b = a.class;

    /* renamed from: a  reason: collision with root package name */
    static final long f2178a = TimeUnit.MINUTES.toMillis(30);

    public a(File file, int i, com.facebook.b.a.a aVar) {
        com.facebook.common.d.i.a(file);
        this.f2180c = file;
        this.f2181d = a(file, aVar);
        this.e = new File(this.f2180c, a(i));
        this.f = aVar;
        g();
        this.g = com.facebook.common.time.b.b();
    }

    private static boolean a(File file, com.facebook.b.a.a aVar) {
        String str;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return false;
            }
            String file2 = externalStorageDirectory.toString();
            try {
                str = file.getCanonicalPath();
            } catch (IOException e2) {
                e = e2;
                str = null;
            }
            try {
                return str.contains(file2);
            } catch (IOException e3) {
                e = e3;
                a.EnumC0042a enumC0042a = a.EnumC0042a.OTHER;
                Class<?> cls = f2179b;
                aVar.a(enumC0042a, cls, "failed to read folder to check if external: " + str, e);
                return false;
            }
        } catch (Exception e4) {
            aVar.a(a.EnumC0042a.OTHER, f2179b, "failed to get the external storage directory!", e4);
            return false;
        }
    }

    static String a(int i) {
        return String.format(null, "%s.ols%d.%d", "v2", 100, Integer.valueOf(i));
    }

    @Override // com.facebook.b.b.d
    public boolean a() {
        return this.f2181d;
    }

    private void g() {
        boolean z = true;
        if (this.f2180c.exists()) {
            if (!this.e.exists()) {
                com.facebook.common.c.a.b(this.f2180c);
            } else {
                z = false;
            }
        }
        if (z) {
            try {
                com.facebook.common.c.c.a(this.e);
            } catch (c.a unused) {
                com.facebook.b.a.a aVar = this.f;
                a.EnumC0042a enumC0042a = a.EnumC0042a.WRITE_CREATE_DIR;
                Class<?> cls = f2179b;
                aVar.a(enumC0042a, cls, "version directory could not be created: " + this.e, null);
            }
        }
    }

    /* compiled from: DefaultDiskStorage.java */
    /* loaded from: classes.dex */
    private static class e extends IOException {

        /* renamed from: a  reason: collision with root package name */
        public final long f2194a;

        /* renamed from: b  reason: collision with root package name */
        public final long f2195b;

        public e(long j, long j2) {
            super("File was not written completely. Expected: " + j + ", found: " + j2);
            this.f2194a = j;
            this.f2195b = j2;
        }
    }

    File a(String str) {
        return new File(d(str));
    }

    private String b(String str) {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        return this.e + File.separator + valueOf;
    }

    private File c(String str) {
        return new File(b(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultDiskStorage.java */
    /* renamed from: com.facebook.b.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0043a implements com.facebook.common.c.b {

        /* renamed from: b  reason: collision with root package name */
        private final List<d.a> f2183b;

        @Override // com.facebook.common.c.b
        public void a(File file) {
        }

        @Override // com.facebook.common.c.b
        public void c(File file) {
        }

        private C0043a() {
            this.f2183b = new ArrayList();
        }

        @Override // com.facebook.common.c.b
        public void b(File file) {
            c b2 = a.this.b(file);
            if (b2 == null || b2.f2188a != d.CONTENT) {
                return;
            }
            this.f2183b.add(new b(b2.f2189b, file));
        }

        public List<d.a> a() {
            return Collections.unmodifiableList(this.f2183b);
        }
    }

    /* compiled from: DefaultDiskStorage.java */
    /* loaded from: classes.dex */
    private class g implements com.facebook.common.c.b {

        /* renamed from: b  reason: collision with root package name */
        private boolean f2200b;

        private g() {
        }

        @Override // com.facebook.common.c.b
        public void a(File file) {
            if (this.f2200b || !file.equals(a.this.e)) {
                return;
            }
            this.f2200b = true;
        }

        @Override // com.facebook.common.c.b
        public void b(File file) {
            if (!this.f2200b || !d(file)) {
                file.delete();
            }
        }

        @Override // com.facebook.common.c.b
        public void c(File file) {
            if (!a.this.f2180c.equals(file) && !this.f2200b) {
                file.delete();
            }
            if (!this.f2200b || !file.equals(a.this.e)) {
                return;
            }
            this.f2200b = false;
        }

        private boolean d(File file) {
            c b2 = a.this.b(file);
            boolean z = false;
            if (b2 == null) {
                return false;
            }
            if (b2.f2188a == d.TEMP) {
                return e(file);
            }
            if (b2.f2188a == d.CONTENT) {
                z = true;
            }
            com.facebook.common.d.i.b(z);
            return true;
        }

        private boolean e(File file) {
            return file.lastModified() > a.this.g.a() - a.f2178a;
        }
    }

    @Override // com.facebook.b.b.d
    public void b() {
        com.facebook.common.c.a.a(this.f2180c, new g());
    }

    private void a(File file, String str) {
        try {
            com.facebook.common.c.c.a(file);
        } catch (c.a e2) {
            this.f.a(a.EnumC0042a.WRITE_CREATE_DIR, f2179b, str, e2);
            throw e2;
        }
    }

    @Override // com.facebook.b.b.d
    public d.b a(String str, Object obj) {
        c cVar = new c(d.TEMP, str);
        File c2 = c(cVar.f2189b);
        if (!c2.exists()) {
            a(c2, "insert");
        }
        try {
            return new f(str, cVar.a(c2));
        } catch (IOException e2) {
            this.f.a(a.EnumC0042a.WRITE_CREATE_TEMPFILE, f2179b, "insert", e2);
            throw e2;
        }
    }

    @Override // com.facebook.b.b.d
    public com.facebook.a.a b(String str, Object obj) {
        File a2 = a(str);
        if (a2.exists()) {
            a2.setLastModified(this.g.a());
            return com.facebook.a.b.a(a2);
        }
        return null;
    }

    private String d(String str) {
        c cVar = new c(d.CONTENT, str);
        return cVar.a(b(cVar.f2189b));
    }

    @Override // com.facebook.b.b.d
    public boolean c(String str, Object obj) {
        return a(str, false);
    }

    private boolean a(String str, boolean z) {
        File a2 = a(str);
        boolean exists = a2.exists();
        if (z && exists) {
            a2.setLastModified(this.g.a());
        }
        return exists;
    }

    @Override // com.facebook.b.b.d
    public long a(d.a aVar) {
        return a(((b) aVar).c().c());
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

    @Override // com.facebook.b.b.d
    public void c() {
        com.facebook.common.c.a.a(this.f2180c);
    }

    @Override // com.facebook.b.b.d
    /* renamed from: d */
    public List<d.a> e() {
        C0043a c0043a = new C0043a();
        com.facebook.common.c.a.a(this.e, c0043a);
        return c0043a.a();
    }

    /* compiled from: DefaultDiskStorage.java */
    /* loaded from: classes.dex */
    static class b implements d.a {

        /* renamed from: a  reason: collision with root package name */
        private final String f2184a;

        /* renamed from: b  reason: collision with root package name */
        private final com.facebook.a.b f2185b;

        /* renamed from: c  reason: collision with root package name */
        private long f2186c;

        /* renamed from: d  reason: collision with root package name */
        private long f2187d;

        private b(String str, File file) {
            com.facebook.common.d.i.a(file);
            this.f2184a = (String) com.facebook.common.d.i.a(str);
            this.f2185b = com.facebook.a.b.a(file);
            this.f2186c = -1L;
            this.f2187d = -1L;
        }

        @Override // com.facebook.b.b.d.a
        public String a() {
            return this.f2184a;
        }

        @Override // com.facebook.b.b.d.a
        public long b() {
            if (this.f2187d < 0) {
                this.f2187d = this.f2185b.c().lastModified();
            }
            return this.f2187d;
        }

        public com.facebook.a.b c() {
            return this.f2185b;
        }

        @Override // com.facebook.b.b.d.a
        public long d() {
            if (this.f2186c < 0) {
                this.f2186c = this.f2185b.b();
            }
            return this.f2186c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c b(File file) {
        c b2 = c.b(file);
        if (b2 != null && c(b2.f2189b).equals(file.getParentFile())) {
            return b2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultDiskStorage.java */
    /* loaded from: classes.dex */
    public enum d {
        CONTENT(".cnt"),
        TEMP(".tmp");
        

        /* renamed from: c  reason: collision with root package name */
        public final String f2193c;

        d(String str) {
            this.f2193c = str;
        }

        public static d a(String str) {
            if (".cnt".equals(str)) {
                return CONTENT;
            }
            if (!".tmp".equals(str)) {
                return null;
            }
            return TEMP;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultDiskStorage.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final d f2188a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2189b;

        private c(d dVar, String str) {
            this.f2188a = dVar;
            this.f2189b = str;
        }

        public String toString() {
            return this.f2188a + "(" + this.f2189b + ")";
        }

        public String a(String str) {
            return str + File.separator + this.f2189b + this.f2188a.f2193c;
        }

        public File a(File file) {
            return File.createTempFile(this.f2189b + ".", ".tmp", file);
        }

        public static c b(File file) {
            d a2;
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf > 0 && (a2 = d.a(name.substring(lastIndexOf))) != null) {
                String substring = name.substring(0, lastIndexOf);
                if (a2.equals(d.TEMP)) {
                    int lastIndexOf2 = substring.lastIndexOf(46);
                    if (lastIndexOf2 <= 0) {
                        return null;
                    }
                    substring = substring.substring(0, lastIndexOf2);
                }
                return new c(a2, substring);
            }
            return null;
        }
    }

    /* compiled from: DefaultDiskStorage.java */
    /* loaded from: classes.dex */
    class f implements d.b {

        /* renamed from: a  reason: collision with root package name */
        final File f2196a;

        /* renamed from: c  reason: collision with root package name */
        private final String f2198c;

        public f(String str, File file) {
            this.f2198c = str;
            this.f2196a = file;
        }

        @Override // com.facebook.b.b.d.b
        public void a(com.facebook.b.a.j jVar, Object obj) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f2196a);
                try {
                    com.facebook.common.d.c cVar = new com.facebook.common.d.c(fileOutputStream);
                    jVar.a(cVar);
                    cVar.flush();
                    long a2 = cVar.a();
                    fileOutputStream.close();
                    if (this.f2196a.length() == a2) {
                        return;
                    }
                    throw new e(a2, this.f2196a.length());
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e) {
                a.this.f.a(a.EnumC0042a.WRITE_UPDATE_FILE_NOT_FOUND, a.f2179b, "updateResource", e);
                throw e;
            }
        }

        @Override // com.facebook.b.b.d.b
        public com.facebook.a.a a(Object obj) {
            a.EnumC0042a enumC0042a;
            File a2 = a.this.a(this.f2198c);
            try {
                com.facebook.common.c.c.a(this.f2196a, a2);
                if (a2.exists()) {
                    a2.setLastModified(a.this.g.a());
                }
                return com.facebook.a.b.a(a2);
            } catch (c.d e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    enumC0042a = a.EnumC0042a.WRITE_RENAME_FILE_OTHER;
                } else if (cause instanceof c.C0047c) {
                    enumC0042a = a.EnumC0042a.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
                } else if (cause instanceof FileNotFoundException) {
                    enumC0042a = a.EnumC0042a.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND;
                } else {
                    enumC0042a = a.EnumC0042a.WRITE_RENAME_FILE_OTHER;
                }
                a.this.f.a(enumC0042a, a.f2179b, "commit", e);
                throw e;
            }
        }

        @Override // com.facebook.b.b.d.b
        public boolean a() {
            return !this.f2196a.exists() || this.f2196a.delete();
        }
    }
}
