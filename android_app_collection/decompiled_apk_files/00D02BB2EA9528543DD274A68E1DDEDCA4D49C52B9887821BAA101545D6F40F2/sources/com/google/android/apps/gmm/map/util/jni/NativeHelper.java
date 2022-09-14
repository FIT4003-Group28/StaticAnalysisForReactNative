package com.google.android.apps.gmm.map.util.jni;

import android.content.Context;
import android.os.Build;
import com.google.android.filament.R;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* compiled from: PG */
/* loaded from: classes.dex */
public class NativeHelper {
    public static final Object a = new Object();
    public static int b = -1;
    @dzsi
    public static Context c;
    @dzsi
    private static CountDownLatch d;

    public static void a() {
        CountDownLatch countDownLatch;
        Thread.currentThread().getName();
        try {
            synchronized (a) {
                countDownLatch = d;
                if (countDownLatch == null) {
                    countDownLatch = new CountDownLatch(1);
                    d = countDownLatch;
                    Thread.currentThread().getName();
                    b(c);
                    nativeInitClass();
                    nativeRegisterExceptionClass(anam.class);
                    countDownLatch.countDown();
                }
            }
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void b(@dzsi Context context) {
        try {
            System.loadLibrary("gmm-jni");
            b = 0;
        } catch (UnsatisfiedLinkError e) {
            if (context != null) {
                try {
                    long c2 = bvoc.c(context);
                    StringBuilder sb = new StringBuilder(34);
                    sb.append("lib");
                    sb.append("gmm-jni");
                    sb.append("_");
                    sb.append(c2);
                    sb.append(".so");
                    String sb2 = sb.toString();
                    String valueOf = String.valueOf(context.getFilesDir());
                    String str = File.separator;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(str).length() + String.valueOf(sb2).length());
                    sb3.append(valueOf);
                    sb3.append(str);
                    sb3.append(sb2);
                    String sb4 = sb3.toString();
                    if (!new File(sb4).exists()) {
                        String str2 = context.getApplicationInfo().sourceDir;
                        String str3 = Build.CPU_ABI;
                        StringBuilder sb5 = new StringBuilder(String.valueOf(str3).length() + 18);
                        sb5.append("lib/");
                        sb5.append(str3);
                        sb5.append("/lib");
                        sb5.append("gmm-jni");
                        sb5.append(".so");
                        String sb6 = sb5.toString();
                        ZipFile zipFile = new ZipFile(str2);
                        ZipEntry entry = zipFile.getEntry(sb6);
                        if (entry == null) {
                            zipFile.close();
                            StringBuilder sb7 = new StringBuilder(String.valueOf(sb6).length() + 32 + String.valueOf(str2).length());
                            sb7.append("Zip entry '");
                            sb7.append(sb6);
                            sb7.append("' not found in APK '");
                            sb7.append(str2);
                            sb7.append("'");
                            anal analVar = new anal(sb7.toString());
                            analVar.initCause(e);
                            throw analVar;
                        }
                        InputStream inputStream = zipFile.getInputStream(entry);
                        dbsk.s(inputStream);
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                        ddaf b2 = ddau.b(new File(sb4), new ddar[0]);
                        ddaq a2 = ddaq.a();
                        try {
                            FileOutputStream a3 = ((ddas) b2).a();
                            a2.c(a3);
                            ddak.a(bufferedInputStream, a3);
                            a3.flush();
                            bufferedInputStream.close();
                            zipFile.close();
                        } finally {
                        }
                    }
                    System.load(sb4);
                    b = 1;
                    return;
                } catch (Throwable th) {
                    anal analVar2 = new anal("Exception while extracting native library.");
                    analVar2.initCause(th);
                    throw analVar2;
                }
            }
            anal analVar3 = new anal();
            analVar3.initCause(e);
            throw analVar3;
        }
    }

    private static native boolean nativeInitClass();

    static native void nativeRegisterExceptionClass(Class<? extends Throwable> cls);

    private static void onNotInitialized(Object obj) {
        String valueOf = String.valueOf(obj.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + R.styleable.AppCompatTheme_viewInflaterClass);
        sb.append("Tried to call native code on object of type ");
        sb.append(valueOf);
        sb.append(", whose native object has not been initialized or was already finalized.");
        throw new NullPointerException(sb.toString());
    }

    private static void onRegistrationError(Class<?> cls) {
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 94);
        sb.append("Error registering native methods for class ");
        sb.append(valueOf);
        sb.append(". Check the logcat output for errors from dalvikvm.");
        throw new NoSuchMethodError(sb.toString());
    }
}
