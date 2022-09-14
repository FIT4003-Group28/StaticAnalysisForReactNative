package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* compiled from: PG */
/* renamed from: dajk  reason: default package */
/* loaded from: classes5.dex */
public final class dajk {
    public static final AtomicReference<dajk> a = new AtomicReference<>(null);
    public final daix b;
    public final dait c;
    private final Set<String> d = new HashSet();

    private dajk(Context context) {
        try {
            daix daixVar = new daix(context);
            this.b = daixVar;
            this.c = new dait(daixVar);
        } catch (PackageManager.NameNotFoundException e) {
            throw new daki(e);
        }
    }

    public static boolean b(Context context, boolean z) {
        AtomicReference<dajk> atomicReference = a;
        boolean compareAndSet = atomicReference.compareAndSet(null, new dajk(context));
        dajk dajkVar = atomicReference.get();
        if (compareAndSet) {
            daky dakyVar = daky.a;
            daky.b.set(new dajn(context, daiw.a(), new dajo(context, dajkVar.b), dajkVar.b));
            dala.a.compareAndSet(null, new dajg(dajkVar));
            daiw.a().execute(new dajh(context));
        }
        try {
            dajkVar.e(context, z);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean c() {
        return a.get() != null;
    }

    public static void d(Context context) {
        b(context, false);
    }

    private final synchronized void e(Context context, boolean z) {
        List<String> asList;
        dajp dajuVar;
        IOException iOException;
        ZipFile zipFile;
        if (z) {
            this.b.a();
        } else {
            daiw.a().execute(new daji(this));
        }
        String packageName = context.getPackageName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo.splitNames == null) {
                asList = new ArrayList();
            } else {
                asList = Arrays.asList(packageInfo.splitNames);
            }
            Set<dajl> i = this.b.i();
            HashSet hashSet = new HashSet();
            Iterator<dajl> it = i.iterator();
            while (it.hasNext()) {
                String b = it.next().b();
                if (asList.contains(b)) {
                    if (z) {
                        this.b.k(b);
                    } else {
                        hashSet.add(b);
                    }
                    it.remove();
                }
            }
            if (!hashSet.isEmpty()) {
                daiw.a().execute(new dajj(this, hashSet));
            }
            HashSet hashSet2 = new HashSet();
            for (dajl dajlVar : i) {
                String b2 = dajlVar.b();
                if (!dalc.e(b2)) {
                    hashSet2.add(b2);
                }
            }
            for (String str : asList) {
                if (!dalc.e(str)) {
                    hashSet2.add(str);
                }
            }
            HashSet<dajl> hashSet3 = new HashSet(i.size());
            for (dajl dajlVar2 : i) {
                if (!dalc.d(dajlVar2.b())) {
                    String b3 = dajlVar2.b();
                    if (hashSet2.contains(dalc.d(b3) ? "" : b3.split("\\.config\\.", 2)[0])) {
                    }
                }
                hashSet3.add(dajlVar2);
            }
            dajf dajfVar = new dajf(this.b);
            switch (Build.VERSION.SDK_INT) {
                case 21:
                    dajuVar = new daju();
                    break;
                case 22:
                    dajuVar = new dajv();
                    break;
                case 23:
                    dajuVar = new dajz();
                    break;
                case 24:
                    dajuVar = new daka();
                    break;
                case 25:
                    dajuVar = new dakb();
                    break;
                case 26:
                    dajuVar = new dake();
                    break;
                case 27:
                    if (Build.VERSION.PREVIEW_SDK_INT == 0) {
                        dajuVar = new dakf();
                        break;
                    }
                    dajuVar = new dakh();
                    break;
                default:
                    dajuVar = new dakh();
                    break;
            }
            ClassLoader classLoader = context.getClassLoader();
            if (z) {
                Set<dajl> i2 = dajfVar.a.i();
                daix daixVar = dajfVar.a;
                ArrayList<String> arrayList = new ArrayList();
                File[] listFiles = daixVar.f().listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        if (file.isDirectory()) {
                            arrayList.add(file.getName());
                        }
                    }
                }
                for (String str2 : arrayList) {
                    Iterator<dajl> it2 = i2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (it2.next().b().equals(str2)) {
                                break;
                            }
                        } else {
                            daix.l(dajfVar.a.g(str2));
                        }
                    }
                }
                Set<File> hashSet4 = new HashSet<>();
                for (dajl dajlVar3 : i2) {
                    HashSet hashSet5 = new HashSet();
                    dajf.a(dajlVar3, new daja(dajfVar, hashSet5, dajlVar3));
                    daix daixVar2 = dajfVar.a;
                    String b4 = dajlVar3.b();
                    HashSet<File> hashSet6 = new HashSet();
                    File[] listFiles2 = daixVar2.g(b4).listFiles();
                    if (listFiles2 != null) {
                        for (File file2 : listFiles2) {
                            if (file2.isFile()) {
                                hashSet6.add(file2);
                            }
                        }
                    }
                    for (File file3 : hashSet6) {
                        if (!hashSet5.contains(file3)) {
                            file3.getAbsolutePath();
                            dajlVar3.b();
                            dajlVar3.a().getAbsolutePath();
                            dano.a(file3.getParentFile().getParentFile().equals(dajfVar.a.f()), "File to remove is not a native library");
                            daix.l(file3);
                        }
                    }
                    hashSet4.addAll(hashSet5);
                }
                dajuVar.a(classLoader, hashSet4);
            } else {
                Iterator it3 = hashSet3.iterator();
                while (it3.hasNext()) {
                    dajl dajlVar4 = (dajl) it3.next();
                    AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                    Set<File> hashSet7 = new HashSet<>();
                    dajf.a(dajlVar4, new daiz(dajfVar, dajlVar4, hashSet7, atomicBoolean));
                    if (true != atomicBoolean.get()) {
                        hashSet7 = null;
                    }
                    if (hashSet7 == null) {
                        it3.remove();
                    } else {
                        dajuVar.a(classLoader, hashSet7);
                    }
                }
            }
            HashSet hashSet8 = new HashSet();
            for (dajl dajlVar5 : hashSet3) {
                try {
                    zipFile = new ZipFile(dajlVar5.a());
                } catch (IOException e) {
                    iOException = e;
                    zipFile = null;
                }
                try {
                    ZipEntry entry = zipFile.getEntry("classes.dex");
                    zipFile.close();
                    if (entry != null) {
                        daix daixVar3 = this.b;
                        String b5 = dajlVar5.b();
                        File file4 = new File(daixVar3.e(), "dex");
                        daix.m(file4);
                        File h = daix.h(file4, b5);
                        daix.m(h);
                        if (!dajuVar.b(classLoader, h, dajlVar5.a(), z)) {
                            String valueOf = String.valueOf(dajlVar5.a());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                            sb.append("split was not installed ");
                            sb.append(valueOf);
                            sb.toString();
                        }
                    }
                    hashSet8.add(dajlVar5.a());
                } catch (IOException e2) {
                    iOException = e2;
                    if (zipFile != null) {
                        try {
                            zipFile.close();
                        } catch (IOException e3) {
                            deki.a(iOException, e3);
                        }
                    }
                    throw iOException;
                }
            }
            this.c.a(context, hashSet8);
            HashSet hashSet9 = new HashSet();
            for (dajl dajlVar6 : hashSet3) {
                if (hashSet8.contains(dajlVar6.a())) {
                    String b6 = dajlVar6.b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(b6).length() + 30);
                    sb2.append("Split '");
                    sb2.append(b6);
                    sb2.append("' installation emulated");
                    sb2.toString();
                    hashSet9.add(dajlVar6.b());
                } else {
                    String b7 = dajlVar6.b();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(b7).length() + 35);
                    sb3.append("Split '");
                    sb3.append(b7);
                    sb3.append("' installation not emulated.");
                    sb3.toString();
                }
            }
            synchronized (this.d) {
                this.d.addAll(hashSet9);
            }
        } catch (PackageManager.NameNotFoundException e4) {
            throw new IOException(String.format("Cannot load data for application '%s'", packageName), e4);
        }
    }

    public final Set<String> a() {
        HashSet hashSet;
        synchronized (this.d) {
            hashSet = new HashSet(this.d);
        }
        return hashSet;
    }
}
