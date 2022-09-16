package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: qnm  reason: default package */
/* loaded from: classes4.dex */
public final class qnm {
    public static final String a(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public static Object b(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null reference");
    }

    public static void c(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void d(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void e(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static void f(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 36 + String.valueOf(name).length());
            sb.append("Must be called on ");
            sb.append(name2);
            sb.append(" thread, but got ");
            sb.append(name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void g(String str) {
        if (tzc.x()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static void h() {
        i("Must not be called on the main application thread");
    }

    public static void i(String str) {
        if (!tzc.x()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static void j(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void k(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    public static void l(String str) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static void m(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException((String) obj);
    }

    public static void n(Object obj, Object obj2) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Context o(Context context) {
        return context.getApplicationContext() != null ? context.getApplicationContext() : context;
    }

    public static final void p(Runnable runnable) {
        Thread thread = new Thread(runnable, "PsdCollector");
        thread.setPriority(4);
        thread.start();
    }

    public static File q(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(r(str, file), str2);
    }

    public static File r(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        u(file2, false);
        return file2;
    }

    public static boolean s(File file) {
        boolean z;
        if (!file.exists()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            z = true;
            for (int i = 0; i < length; i++) {
                File file2 = listFiles[i];
                z = file2 != null && s(file2) && z;
            }
        } else {
            z = true;
        }
        return file.delete() && z;
    }

    public static boolean t(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                qyj.a(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                qyj.a(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                qyj.a(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void u(File file, boolean z) {
        if (z && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public static boolean v(int i) {
        int i2 = i - 1;
        return i2 == 2 || i2 == 4 || i2 == 5 || i2 == 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int w(android.content.Context r12, defpackage.rcd r13) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qnm.w(android.content.Context, rcd):int");
    }

    private static final String x(rcd rcdVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String a = amqg.OS_ARCH.a();
        if (TextUtils.isEmpty(a) || !hashSet.contains(a)) {
            try {
                String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                if (strArr != null && strArr.length > 0) {
                    return strArr[0];
                }
            } catch (IllegalAccessException e) {
                rcdVar.c(2024, 0L, e);
            } catch (NoSuchFieldException e2) {
                rcdVar.c(2024, 0L, e2);
            }
            return Build.CPU_ABI != null ? Build.CPU_ABI : Build.CPU_ABI2;
        }
        return a;
    }

    private static final void y(byte[] bArr, String str, rcd rcdVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("os.arch:");
        sb.append(amqg.OS_ARCH.a());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        rcdVar.b(4007, sb.toString());
    }
}
