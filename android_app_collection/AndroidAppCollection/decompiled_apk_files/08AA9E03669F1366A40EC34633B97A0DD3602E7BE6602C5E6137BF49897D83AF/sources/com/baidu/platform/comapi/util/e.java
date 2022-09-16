package com.baidu.platform.comapi.util;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static volatile e f2129a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2130b = false;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2131c = true;

    /* renamed from: d  reason: collision with root package name */
    private final List<d> f2132d = new ArrayList();
    private d e = null;
    private String f;

    private e() {
    }

    public static e a() {
        if (f2129a == null) {
            synchronized (e.class) {
                if (f2129a == null) {
                    f2129a = new e();
                }
            }
        }
        return f2129a;
    }

    private boolean a(String str) {
        boolean z = false;
        try {
            File file = new File(str + "/test.0");
            if (file.exists()) {
                file.delete();
            }
            boolean createNewFile = file.createNewFile();
            try {
                if (!file.exists()) {
                    return createNewFile;
                }
                file.delete();
                return createNewFile;
            } catch (Exception e) {
                z = createNewFile;
                e = e;
                e.printStackTrace();
                return z;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    @SuppressLint({"NewApi"})
    @TargetApi(14)
    private void c(Context context) {
        boolean z;
        try {
            StorageManager storageManager = (StorageManager) context.getSystemService("storage");
            Method method = storageManager.getClass().getMethod("getVolumeList", new Class[0]);
            Method method2 = storageManager.getClass().getMethod("getVolumeState", String.class);
            Class<?> cls = Class.forName("android.os.storage.StorageVolume");
            Method method3 = cls.getMethod("isRemovable", new Class[0]);
            Method method4 = cls.getMethod("getPath", new Class[0]);
            Object[] objArr = (Object[]) method.invoke(storageManager, new Object[0]);
            if (objArr == null) {
                return;
            }
            for (Object obj : objArr) {
                String str = (String) method4.invoke(obj, new Object[0]);
                if (str != null && str.length() > 0 && "mounted".equals(method2.invoke(storageManager, str))) {
                    boolean z2 = !((Boolean) method3.invoke(obj, new Object[0])).booleanValue();
                    if (Build.VERSION.SDK_INT <= 19 && a(str)) {
                        this.f2132d.add(new d(str, !z2, z2 ? "内置存储卡" : "外置存储卡", context));
                    } else if (Build.VERSION.SDK_INT >= 19) {
                        if (new File(str + File.separator + "BaiduMapSDKNew").exists() && str.equals(context.getSharedPreferences("map_pref", 0).getString("PREFFERED_SD_CARD", ""))) {
                            this.f = str + File.separator + "BaiduMapSDKNew";
                        }
                    }
                }
            }
            if (Build.VERSION.SDK_INT < 19) {
                return;
            }
            File[] externalFilesDirs = context.getExternalFilesDirs(null);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f2132d);
            for (int i = 0; i < externalFilesDirs.length && externalFilesDirs[i] != null; i++) {
                String absolutePath = externalFilesDirs[i].getAbsolutePath();
                Iterator<d> it = this.f2132d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (absolutePath.startsWith(it.next().a())) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                String str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
                if (str2 != null && !z && absolutePath.indexOf(str2) != -1) {
                    arrayList.add(new d(absolutePath, true, "外置存储卡", context));
                }
            }
            this.f2132d.clear();
            this.f2132d.addAll(arrayList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void d(Context context) {
        Scanner scanner;
        String[] split;
        String[] split2;
        ArrayList<String> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Scanner scanner2 = null;
        try {
            try {
                File file = new File("/proc/mounts");
                if (file.exists()) {
                    scanner = new Scanner(file);
                    while (scanner.hasNext()) {
                        try {
                            String nextLine = scanner.nextLine();
                            if (nextLine.startsWith("/dev/block/vold/") && (split2 = nextLine.replace('\t', ' ').split(" ")) != null && split2.length > 0) {
                                arrayList.add(split2[1]);
                            }
                        } catch (Exception e) {
                            e = e;
                            scanner2 = scanner;
                            e.printStackTrace();
                            if (scanner2 == null) {
                                return;
                            }
                            scanner2.close();
                            return;
                        } catch (Throwable th) {
                            th = th;
                            scanner2 = scanner;
                            if (scanner2 != null) {
                                scanner2.close();
                            }
                            throw th;
                        }
                    }
                    scanner.close();
                }
                File file2 = new File("/system/etc/vold.fstab");
                if (file2.exists()) {
                    scanner = new Scanner(file2);
                    while (scanner.hasNext()) {
                        String nextLine2 = scanner.nextLine();
                        if (nextLine2.startsWith("dev_mount") && (split = nextLine2.replace('\t', ' ').split(" ")) != null && split.length > 0) {
                            String str = split[2];
                            if (str.contains(":")) {
                                str = str.substring(0, str.indexOf(":"));
                            }
                            arrayList2.add(str);
                        }
                    }
                    scanner.close();
                }
                String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
                this.f2132d.add(new d(absolutePath, false, "Auto", context));
                for (String str2 : arrayList) {
                    if (arrayList2.contains(str2) && !str2.equals(absolutePath)) {
                        File file3 = new File(str2);
                        if (file3.exists() && file3.isDirectory() && file3.canWrite()) {
                            this.f2132d.add(new d(str2, false, "Auto", context));
                        }
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void a(Context context) {
        if (this.f2130b) {
            return;
        }
        this.f2130b = true;
        try {
            if (Build.VERSION.SDK_INT >= 14) {
                c(context);
            } else {
                d(context);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (this.f2132d.size() > 0) {
                d dVar = null;
                int i = 0;
                for (d dVar2 : this.f2132d) {
                    if (new File(dVar2.b()).exists()) {
                        i++;
                        dVar = dVar2;
                    }
                }
                if (i == 0) {
                    this.e = b(context);
                    if (this.e == null) {
                        Iterator<d> it = this.f2132d.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            d next = it.next();
                            if (a(context, next)) {
                                this.e = next;
                                break;
                            }
                        }
                    }
                } else if (i != 1) {
                    this.e = b(context);
                } else if (a(context, dVar)) {
                    this.e = dVar;
                }
                if (this.e == null) {
                    this.e = this.f2132d.get(0);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            if (this.e == null || !a(this.e.a())) {
                this.f2131c = false;
                this.e = new d(context);
                this.f2132d.clear();
                this.f2132d.add(this.e);
                return;
            }
            File file = new File(this.e.b());
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(this.e.c());
            if (!file2.exists()) {
                file2.mkdirs();
            }
            File file3 = new File(file2, ".nomedia");
            if (file3.exists()) {
                return;
            }
            file3.createNewFile();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public boolean a(Context context, d dVar) {
        String a2 = dVar.a();
        if (!a(a2)) {
            return false;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("map_pref", 0).edit();
        edit.putString("PREFFERED_SD_CARD", a2);
        return edit.commit();
    }

    public d b() {
        return this.e;
    }

    public d b(Context context) {
        String string = context.getSharedPreferences("map_pref", 0).getString("PREFFERED_SD_CARD", "");
        if (string == null || string.length() <= 0) {
            return null;
        }
        for (d dVar : this.f2132d) {
            if (dVar.a().equals(string)) {
                return dVar;
            }
        }
        return null;
    }
}
