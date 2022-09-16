package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import dalvik.system.DexClassLoader;
import j$.util.concurrent.ThreadLocalRandom;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: dtq  reason: default package */
/* loaded from: classes3.dex */
public final class dtq {
    public final Context a;
    public ExecutorService b;
    public DexClassLoader c;
    public byte[] d;
    public final boolean h;
    public dso k;
    public dtk o;
    private final Map p;
    public volatile qab e = null;
    public volatile boolean f = false;
    public Future g = null;
    public volatile dnw i = null;
    public Future j = null;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;

    public dtq(Context context) {
        boolean z = false;
        Context applicationContext = context.getApplicationContext();
        this.h = applicationContext != null ? true : z;
        context = applicationContext != null ? applicationContext : context;
        this.a = context;
        this.p = new HashMap();
        if (this.o != null) {
            return;
        }
        this.o = new dtk(context);
    }

    public static final void d(File file) {
        if (!file.exists()) {
            String.format("File %s not found. No need for deletion", file.getAbsolutePath());
        } else {
            file.delete();
        }
    }

    public static final void i(String str) {
        d(new File(str));
    }

    public final int a() {
        if (this.k != null) {
            try {
                return ThreadLocalRandom.current().nextInt();
            } catch (RuntimeException unused) {
                if (dso.c == null) {
                    synchronized (dso.class) {
                        if (dso.c == null) {
                            dso.c = new Random();
                        }
                    }
                }
                return dso.c.nextInt();
            }
        }
        return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    }

    public final qab b() {
        if (!this.f) {
            return null;
        }
        if (this.e != null) {
            return this.e;
        }
        Future future = this.g;
        if (future != null) {
            try {
                future.get(2000L, TimeUnit.MILLISECONDS);
                this.g = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.g.cancel(true);
            }
        }
        return this.e;
    }

    public final Method c(String str, String str2) {
        duw duwVar = (duw) this.p.get(new Pair(str, str2));
        if (duwVar == null) {
            return null;
        }
        if (duwVar.d != null) {
            return duwVar.d;
        }
        try {
            if (duwVar.f.await(2L, TimeUnit.SECONDS)) {
                return duwVar.d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i) {
        if (this.m) {
            Future<?> submit = this.b.submit(new dto(this, i));
            if (i != 0) {
                return;
            }
            this.j = submit;
        }
    }

    public final void f(File file) {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, "1628710143622"));
        if (!file2.exists()) {
            return;
        }
        File file3 = new File(String.format("%s/%s.dex", file, "1628710143622"));
        if (file3.exists()) {
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            long length = file2.length();
            if (length <= 0) {
                d(file2);
                return;
            }
            byte[] bArr = new byte[(int) length];
            FileInputStream fileInputStream2 = new FileInputStream(file2);
            try {
                try {
                    if (fileInputStream2.read(bArr) <= 0) {
                        d(file2);
                        try {
                            fileInputStream2.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    try {
                        try {
                            dny dnyVar = (dny) aopi.parseFrom(dny.a, bArr, aoos.a());
                            if ("1628710143622".equals(new String(dnyVar.e.I())) && Arrays.equals(dnyVar.d.I(), dru.c(dnyVar.c.I())) && Arrays.equals(dnyVar.f.I(), Build.VERSION.SDK.getBytes())) {
                                byte[] a = dtc.a(this.d, new String(dnyVar.c.I()));
                                file3.createNewFile();
                                fileOutputStream = new FileOutputStream(file3);
                                try {
                                    fileOutputStream.write(a, 0, a.length);
                                    try {
                                        fileInputStream2.close();
                                    } catch (IOException unused2) {
                                    }
                                    try {
                                        fileOutputStream.close();
                                        return;
                                    } catch (IOException unused3) {
                                        return;
                                    }
                                } catch (dtb | IOException | NoSuchAlgorithmException unused4) {
                                    fileInputStream = fileInputStream2;
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (IOException unused5) {
                                        }
                                    }
                                    if (fileOutputStream == null) {
                                        return;
                                    }
                                    try {
                                        fileOutputStream.close();
                                        return;
                                    } catch (IOException unused6) {
                                        return;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    fileInputStream = fileInputStream2;
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (IOException unused7) {
                                        }
                                    }
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (IOException unused8) {
                                        }
                                    }
                                    throw th;
                                }
                            }
                            d(file2);
                            try {
                                fileInputStream2.close();
                            } catch (IOException unused9) {
                            }
                        } catch (IOException unused10) {
                        }
                    } catch (NullPointerException unused11) {
                        fileInputStream2.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
            } catch (dtb | IOException | NoSuchAlgorithmException unused12) {
                fileOutputStream = null;
            }
        } catch (dtb | IOException | NoSuchAlgorithmException unused13) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public final void g(String str, String str2, Class... clsArr) {
        if (!this.p.containsKey(new Pair(str, str2))) {
            this.p.put(new Pair(str, str2), new duw(this, str, str2, clsArr));
        }
    }

    public final void h(File file) {
        Throwable th;
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, "1628710143622"));
        if (file2.exists()) {
            return;
        }
        File file3 = new File(String.format("%s/%s.dex", file, "1628710143622"));
        if (!file3.exists()) {
            return;
        }
        long length = file3.length();
        if (length <= 0) {
            return;
        }
        byte[] bArr = new byte[(int) length];
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file3);
            try {
                if (fileInputStream2.read(bArr) <= 0) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused) {
                    }
                    d(file3);
                    return;
                }
                System.out.print("test");
                System.out.print("test");
                System.out.print("test");
                aopa createBuilder = dny.a.createBuilder();
                aoob x = aoob.x(Build.VERSION.SDK.getBytes());
                createBuilder.copyOnWrite();
                dny dnyVar = (dny) createBuilder.instance;
                dnyVar.b |= 8;
                dnyVar.f = x;
                aoob x2 = aoob.x("1628710143622".getBytes());
                createBuilder.copyOnWrite();
                dny dnyVar2 = (dny) createBuilder.instance;
                dnyVar2.b |= 4;
                dnyVar2.e = x2;
                byte[] bytes = dtc.b(this.d, bArr).getBytes();
                aoob x3 = aoob.x(bytes);
                createBuilder.copyOnWrite();
                dny dnyVar3 = (dny) createBuilder.instance;
                dnyVar3.b = 1 | dnyVar3.b;
                dnyVar3.c = x3;
                aoob x4 = aoob.x(dru.c(bytes));
                createBuilder.copyOnWrite();
                dny dnyVar4 = (dny) createBuilder.instance;
                dnyVar4.b = 2 | dnyVar4.b;
                dnyVar4.d = x4;
                file2.createNewFile();
                fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] byteArray = ((dny) createBuilder.mo39build()).toByteArray();
                    fileOutputStream.write(byteArray, 0, byteArray.length);
                    fileOutputStream.close();
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused2) {
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                    }
                    d(file3);
                } catch (dtb | IOException | NoSuchAlgorithmException unused4) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused5) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    d(file3);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused7) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused8) {
                        }
                    }
                    d(file3);
                    throw th;
                }
            } catch (dtb | IOException | NoSuchAlgorithmException unused9) {
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (dtb | IOException | NoSuchAlgorithmException unused10) {
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }
}
