package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: mv  reason: default package */
/* loaded from: classes.dex */
public final class mv {
    public final File a;
    public final File b;
    public final File c;

    public mv(File file) {
        this.a = file;
        this.b = new File(file.getPath() + ".new");
        this.c = new File(file.getPath() + ".bak");
    }

    public static void a(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            String str = "Failed to delete file which is a directory " + file2;
        }
        if (!file.renameTo(file2)) {
            String str2 = "Failed to rename " + file + " to " + file2;
        }
    }

    public static void b(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException unused) {
        }
    }
}
