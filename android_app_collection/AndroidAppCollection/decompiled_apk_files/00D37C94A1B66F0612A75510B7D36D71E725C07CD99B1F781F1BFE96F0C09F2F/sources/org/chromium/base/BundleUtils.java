package org.chromium.base;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import dalvik.system.BaseDexClassLoader;
import java.lang.reflect.Field;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class BundleUtils {
    private static final Object a = new Object();
    private static final agd b = new agd();

    public static Context a(Context context, String str) {
        Context d;
        int i;
        if (Build.VERSION.SDK_INT >= 26) {
            Context context2 = context;
            while (true) {
                try {
                    if (context2 instanceof ContextWrapper) {
                        if (!(context2 instanceof Application)) {
                            context2 = ((ContextWrapper) context2).getBaseContext();
                        } else {
                            d = babj.d(context, str);
                            break;
                        }
                    } else {
                        synchronized (a) {
                            d = babj.d(context, str);
                            break;
                        }
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
            d.getClassLoader().getParent();
            agd agdVar = b;
            synchronized (agdVar) {
                ClassLoader classLoader = (ClassLoader) agdVar.get(str);
                i = 0;
                if (classLoader != null) {
                    if (!classLoader.equals(d.getClassLoader())) {
                        b(d, classLoader);
                        i = 1;
                    }
                } else {
                    agdVar.put(str, d.getClassLoader());
                }
            }
            String str2 = "Android.IsolatedSplits.ClassLoaderReplaced." + str;
            baco bacoVar = bacp.a;
            bacoVar.a.readLock().lock();
            bacn bacnVar = (bacn) bacoVar.b.get(str2);
            if (bacnVar == null) {
                bacoVar.a.readLock().unlock();
                bacoVar.a.writeLock().lock();
                bacn bacnVar2 = (bacn) bacoVar.b.get(str2);
                if (bacnVar2 == null) {
                    if (bacoVar.b.size() < 256) {
                        bacnVar2 = new bacn();
                        bacoVar.b.put(str2, bacnVar2);
                    } else {
                        bacoVar.c.incrementAndGet();
                        bacoVar.a.writeLock().unlock();
                    }
                }
                if (!bacnVar2.a(i)) {
                    bacoVar.c.incrementAndGet();
                }
                bacoVar.a.writeLock().unlock();
            } else {
                if (!bacnVar.a(i)) {
                    bacoVar.c.incrementAndGet();
                }
                bacoVar.a.readLock().unlock();
            }
            return d;
        }
        return context;
    }

    public static void b(Context context, ClassLoader classLoader) {
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        try {
            Field declaredField = context.getClass().getDeclaredField("mClassLoader");
            declaredField.setAccessible(true);
            declaredField.set(context, classLoader);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Error setting ClassLoader.", e);
        }
    }

    public static boolean c(Context context, String str) {
        String[] strArr;
        return Build.VERSION.SDK_INT >= 26 && (strArr = context.getApplicationInfo().splitNames) != null && Arrays.asList(strArr).contains(str);
    }

    private static String d(String str, String str2) {
        ApplicationInfo applicationInfo;
        String[] strArr;
        int binarySearch;
        if (Build.VERSION.SDK_INT >= 26 && (strArr = (applicationInfo = babj.c.getApplicationInfo()).splitNames) != null && (binarySearch = Arrays.binarySearch(strArr, str2)) >= 0) {
            try {
                return applicationInfo.splitSourceDirs[binarySearch] + "!/lib/" + ((String) applicationInfo.getClass().getField("primaryCpuAbi").get(applicationInfo)) + "/" + System.mapLibraryName(str);
            } catch (ReflectiveOperationException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

    public static String getNativeLibraryPath(String str, String str2) {
        bach a2 = bach.a();
        try {
            String findLibrary = ((BaseDexClassLoader) BundleUtils.class.getClassLoader()).findLibrary(str);
            if (findLibrary == null) {
                ClassLoader classLoader = babj.c.getClassLoader();
                if (classLoader instanceof BaseDexClassLoader) {
                    findLibrary = ((BaseDexClassLoader) classLoader).findLibrary(str);
                } else if (classLoader instanceof bacm) {
                    bacm bacmVar = (bacm) classLoader;
                    throw null;
                }
                if (findLibrary != null) {
                    return findLibrary;
                }
                String d = d(str, str2);
                a2.close();
                return d;
            }
            a2.close();
            return findLibrary;
        } finally {
            try {
                a2.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean isBundleForNative() {
        return false;
    }
}
