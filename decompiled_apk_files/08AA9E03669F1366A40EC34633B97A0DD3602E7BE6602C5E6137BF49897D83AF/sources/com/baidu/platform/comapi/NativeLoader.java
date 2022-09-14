package com.baidu.platform.comapi;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* loaded from: classes.dex */
public class NativeLoader {

    /* renamed from: a  reason: collision with root package name */
    private static Context f1971a;

    /* renamed from: d  reason: collision with root package name */
    private static NativeLoader f1974d;

    /* renamed from: b  reason: collision with root package name */
    private static final Set<String> f1972b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private static final Set<String> f1973c = new HashSet();
    private static a e = a.ARMEABI;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum a {
        ARMEABI("armeabi"),
        ARMV7("armeabi-v7a"),
        ARM64("arm64-v8a"),
        X86("x86"),
        X86_64("x86_64");
        
        private String f;

        a(String str) {
            this.f = str;
        }

        public String a() {
            return this.f;
        }
    }

    private NativeLoader() {
    }

    @TargetApi(21)
    private static a a() {
        String str = Build.VERSION.SDK_INT < 21 ? Build.CPU_ABI : Build.SUPPORTED_ABIS[0];
        if (str == null) {
            return a.ARMEABI;
        }
        if (str.contains("arm") && str.contains("v7")) {
            e = a.ARMV7;
        }
        if (str.contains("arm") && str.contains("64")) {
            e = a.ARM64;
        }
        if (str.contains("x86")) {
            e = str.contains("64") ? a.X86_64 : a.X86;
        }
        return e;
    }

    private String a(a aVar) {
        return "lib/" + aVar.a() + "/";
    }

    private void a(Throwable th) {
        Log.e(NativeLoader.class.getSimpleName(), "loadException", th);
        Iterator<String> it = f1973c.iterator();
        while (it.hasNext()) {
            String simpleName = NativeLoader.class.getSimpleName();
            Log.e(simpleName, it.next() + " Failed to load.");
        }
    }

    private boolean a(String str, String str2) {
        return !copyNativeLibrary(str2, a.ARMV7) ? b(str, str2) : f(str2, str);
    }

    private boolean b(String str, String str2) {
        if (copyNativeLibrary(str2, a.ARMEABI)) {
            return f(str2, str);
        }
        String simpleName = NativeLoader.class.getSimpleName();
        Log.e(simpleName, "found lib" + str + ".so error");
        return false;
    }

    private boolean c(String str, String str2) {
        return !copyNativeLibrary(str2, a.ARM64) ? a(str, str2) : f(str2, str);
    }

    private boolean d(String str, String str2) {
        return !copyNativeLibrary(str2, a.X86) ? a(str, str2) : f(str2, str);
    }

    private boolean e(String str, String str2) {
        return !copyNativeLibrary(str2, a.X86_64) ? d(str, str2) : f(str2, str);
    }

    private boolean f(String str, String str2) {
        try {
            System.load(new File(getCustomizeNativePath(), str).getAbsolutePath());
            synchronized (f1972b) {
                f1972b.add(str2);
            }
            return true;
        } catch (Throwable th) {
            synchronized (f1973c) {
                f1973c.add(str2);
                a(th);
                return false;
            }
        }
    }

    public static synchronized NativeLoader getInstance() {
        NativeLoader nativeLoader;
        synchronized (NativeLoader.class) {
            if (f1974d == null) {
                f1974d = new NativeLoader();
                e = a();
            }
            nativeLoader = f1974d;
        }
        return nativeLoader;
    }

    public static void setContext(Context context) {
        f1971a = context;
    }

    protected boolean copyNativeLibrary(String str, a aVar) {
        ZipFile zipFile;
        String str2 = a(aVar) + str;
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(getCodePath());
            } catch (Throwable th) {
                th = th;
                zipFile = null;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            File file = new File(getCustomizeNativePath(), str);
            ZipEntry entry = zipFile.getEntry(str2);
            if (entry == null) {
                if (zipFile != null) {
                    try {
                        zipFile.close();
                        return false;
                    } catch (IOException unused) {
                    }
                }
                return false;
            }
            copyStream(zipFile.getInputStream(entry), new FileOutputStream(file));
            if (zipFile == null) {
                return true;
            }
            try {
                zipFile.close();
                return true;
            } catch (IOException unused2) {
                return false;
            }
        } catch (Exception e3) {
            e = e3;
            zipFile2 = zipFile;
            Log.e(NativeLoader.class.getSimpleName(), "copyError", e);
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                    return false;
                } catch (IOException unused3) {
                    return false;
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException unused4) {
                    return false;
                }
            }
            throw th;
        }
    }

    protected final void copyStream(InputStream inputStream, FileOutputStream fileOutputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    fileOutputStream.flush();
                    try {
                        inputStream.close();
                        fileOutputStream.close();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
                fileOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                try {
                    inputStream.close();
                    fileOutputStream.close();
                    throw th;
                } catch (IOException unused2) {
                    return;
                }
            }
        }
    }

    @TargetApi(8)
    protected String getCodePath() {
        return 8 <= Build.VERSION.SDK_INT ? f1971a.getPackageCodePath() : "";
    }

    protected String getCustomizeNativePath() {
        File file = new File(f1971a.getFilesDir(), "libs");
        file.mkdirs();
        return file.getAbsolutePath();
    }

    protected boolean loadCustomizeNativeLibrary(String str) {
        String mapLibraryName = System.mapLibraryName(str);
        switch (e) {
            case ARM64:
                return c(str, mapLibraryName);
            case ARMV7:
                return a(str, mapLibraryName);
            case ARMEABI:
                return b(str, mapLibraryName);
            case X86_64:
                return e(str, mapLibraryName);
            case X86:
                return d(str, mapLibraryName);
            default:
                return false;
        }
    }

    public synchronized boolean loadLibrary(String str) {
        try {
            synchronized (f1972b) {
                if (f1972b.contains(str)) {
                    return true;
                }
                System.loadLibrary(str);
                synchronized (f1972b) {
                    f1972b.add(str);
                }
                return true;
            }
        } catch (Throwable unused) {
            return loadCustomizeNativeLibrary(str);
        }
    }
}
