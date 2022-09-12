package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
/* compiled from: PG */
/* renamed from: bvog  reason: default package */
/* loaded from: classes.dex */
public final class bvog {
    public static FutureTask<Void> a;

    public static boolean a() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static File b(Context context, boolean z) {
        File file = null;
        if (!z && a()) {
            file = c(p(context));
        }
        return file == null ? context.getDir("", 0) : file;
    }

    @dzsi
    public static File c(File file) {
        return (file == null || !file.getName().equals("files")) ? file : file.getParentFile();
    }

    public static long d(Context context) {
        return f(context.getFilesDir());
    }

    public static long e(File file) {
        long j;
        long length;
        try {
            File[] listFiles = file.listFiles();
            int i = 0;
            if (listFiles != null) {
                int length2 = listFiles.length;
                int i2 = 0;
                while (i < length2) {
                    File file2 = listFiles[i];
                    if (file2.isDirectory()) {
                        j = i2;
                        length = e(file2);
                    } else if (file2.isFile()) {
                        j = i2;
                        length = file2.length();
                    } else {
                        i++;
                    }
                    i2 = (int) (j + length);
                    i++;
                }
                i = i2;
            }
            return i;
        } catch (SecurityException e) {
            e.getMessage();
            return 0L;
        }
    }

    static long f(@dzsi File file) {
        if (file == null) {
            return 0L;
        }
        try {
            return new StatFs(file.getPath()).getAvailableBytes();
        } catch (IllegalArgumentException unused) {
            return 0L;
        }
    }

    public static boolean g(Context context) {
        File[] q;
        try {
            if (!Environment.isExternalStorageEmulated()) {
                return true;
            }
            if (Build.VERSION.SDK_INT < 22) {
                return q(context).length > 1;
            }
            for (File file : q(context)) {
                if (file == null) {
                    return true;
                }
                if (!Environment.isExternalStorageEmulated(file)) {
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new bvof(e);
        }
    }

    @dzsi
    public static File h(Context context) {
        try {
            if (g(context)) {
                if (Build.VERSION.SDK_INT >= 22) {
                    return j(context);
                }
                return i(context);
            }
        } catch (bvof unused) {
        }
        return null;
    }

    @dzsi
    static File i(Context context) {
        if (!Environment.isExternalStorageEmulated()) {
            return p(context);
        }
        File[] q = q(context);
        int length = q.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            File file = q[i];
            if (!z && file != null) {
                return file;
            }
            i++;
            z = false;
        }
        return null;
    }

    @dzsi
    static File j(Context context) {
        File[] q;
        for (File file : q(context)) {
            if (file != null) {
                try {
                    if (!Environment.isExternalStorageEmulated(file)) {
                        return file;
                    }
                } catch (IllegalArgumentException unused) {
                    continue;
                }
            }
        }
        return null;
    }

    public static boolean k(Context context) {
        if (!g(context)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 22) {
            File i = i(context);
            if (i != null) {
                return "mounted".equals(Environment.getStorageState(i));
            }
            return false;
        }
        File j = j(context);
        if (j != null) {
            return "mounted".equals(Environment.getExternalStorageState(j));
        }
        return false;
    }

    public static long l(Context context) {
        try {
            if (k(context)) {
                return f(h(context));
            }
            return 0L;
        } catch (bvof unused) {
            return 0L;
        }
    }

    public static void m(File file) {
        File[] listFiles;
        if (!file.exists()) {
            return;
        }
        if (file.isDirectory() && file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                m(file2);
            }
        }
        file.delete();
    }

    public static File n(Context context, boolean z, String str, boolean z2) {
        if (z2) {
            try {
                a.get();
            } catch (InterruptedException | ExecutionException e) {
                deki.b(e);
            }
        }
        return new File(b(context, z), str);
    }

    @dzsi
    private static File p(Context context) {
        try {
            return context.getExternalFilesDir(null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static File[] q(Context context) {
        try {
            File[] externalFilesDirs = context.getExternalFilesDirs(null);
            if (externalFilesDirs != null) {
                return externalFilesDirs;
            }
        } catch (Exception unused) {
        }
        return new File[0];
    }
}
