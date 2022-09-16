package defpackage;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: jh  reason: default package */
/* loaded from: classes3.dex */
public final class jh {
    public final File a;
    public final File b;
    public final File c;

    public jh(File file) {
        this.a = file;
        this.b = new File(file.getPath() + ".new");
        this.c = new File(file.getPath() + ".bak");
    }

    public static void a(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    public static boolean b(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
