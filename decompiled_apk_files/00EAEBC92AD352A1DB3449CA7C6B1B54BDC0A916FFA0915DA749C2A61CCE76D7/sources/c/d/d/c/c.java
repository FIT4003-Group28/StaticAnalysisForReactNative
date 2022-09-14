package c.d.d.c;

import c.d.d.d.i;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
/* loaded from: classes.dex */
public class c {

    /* loaded from: classes.dex */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends IOException {
        public b(String str) {
            super(str);
        }
    }

    /* renamed from: c.d.d.c.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0070c extends FileNotFoundException {
        public C0070c(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends IOException {
        public d(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    public static void a(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            if (!file.delete()) {
                throw new a(file.getAbsolutePath(), new b(file.getAbsolutePath()));
            }
        }
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        throw new a(file.getAbsolutePath());
    }

    public static void a(File file, File file2) {
        i.a(file);
        i.a(file2);
        file2.delete();
        if (file.renameTo(file2)) {
            return;
        }
        Throwable th = null;
        if (file2.exists()) {
            th = new b(file2.getAbsolutePath());
        } else if (!file.getParentFile().exists()) {
            th = new C0070c(file.getAbsolutePath());
        } else if (!file.exists()) {
            th = new FileNotFoundException(file.getAbsolutePath());
        }
        throw new d("Unknown error renaming " + file.getAbsolutePath() + " to " + file2.getAbsolutePath(), th);
    }
}
