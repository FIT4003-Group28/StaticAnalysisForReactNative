package com.facebook.soloader;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.facebook.soloader.i;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
/* loaded from: classes.dex */
public final class SysUtil {

    @d
    @TargetApi(21)
    /* loaded from: classes.dex */
    private static final class LollipopSysdeps {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static class a implements Comparator<String> {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ArrayList f6451b;

            a(ArrayList arrayList) {
                this.f6451b = arrayList;
            }

            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(String str, String str2) {
                if (this.f6451b.contains(str)) {
                    return -1;
                }
                return this.f6451b.contains(str2) ? 1 : 0;
            }
        }

        private LollipopSysdeps() {
        }

        @d
        public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j) {
            try {
                Os.posix_fallocate(fileDescriptor, 0L, j);
            } catch (ErrnoException e2) {
                int i = e2.errno;
                if (i != OsConstants.EOPNOTSUPP && i != OsConstants.ENOSYS && i != OsConstants.EINVAL) {
                    throw new IOException(e2.toString(), e2);
                }
            }
        }

        @d
        public static String[] getSupportedAbis() {
            String bVar;
            String[] strArr = Build.SUPPORTED_ABIS;
            ArrayList arrayList = new ArrayList();
            try {
                if (Os.readlink("/proc/self/exe").contains("64")) {
                    arrayList.add(i.b.AARCH64.toString());
                    bVar = i.b.X86_64.toString();
                } else {
                    arrayList.add(i.b.ARM.toString());
                    bVar = i.b.X86.toString();
                }
                arrayList.add(bVar);
                Arrays.sort(strArr, new a(arrayList));
                return strArr;
            } catch (ErrnoException e2) {
                Log.e("SysUtil", "Could not read /proc/self/exe. Falling back to default ABI list.", e2);
                return Build.SUPPORTED_ABIS;
            }
        }
    }

    public static int a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                return packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(RandomAccessFile randomAccessFile, InputStream inputStream, int i, byte[] bArr) {
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, 0, Math.min(bArr.length, i - i2));
            if (read == -1) {
                break;
            }
            randomAccessFile.write(bArr, 0, read);
            i2 += read;
        }
        return i2;
    }

    public static int a(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null && str.equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    public static void a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file2 : listFiles) {
                a(file2);
            }
        }
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("could not delete: " + file);
    }

    public static void a(FileDescriptor fileDescriptor, long j) {
        if (Build.VERSION.SDK_INT >= 21) {
            LollipopSysdeps.fallocateIfSupported(fileDescriptor, j);
        }
    }

    public static String[] a() {
        return Build.VERSION.SDK_INT < 21 ? new String[]{Build.CPU_ABI, Build.CPU_ABI2} : LollipopSysdeps.getSupportedAbis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                throw new IOException("cannot list directory " + file);
            }
            for (File file2 : listFiles) {
                b(file2);
            }
        } else if (!file.getPath().endsWith("_lock")) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(File file) {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        throw new IOException("cannot mkdir: " + file);
    }
}
