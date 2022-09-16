package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: zew  reason: default package */
/* loaded from: classes4.dex */
public final class zew {
    public static int a;
    public static int b;
    public static volatile Boolean c;
    private static int d;
    private static String e;

    public static String A(Context context) {
        long j;
        if (e == null) {
            ContentResolver contentResolver = context.getContentResolver();
            try {
                j = rxn.h(contentResolver, 0L);
            } catch (SecurityException unused) {
                j = 0;
            }
            if (j != 0) {
                e = String.valueOf(j);
            } else {
                String string = Settings.Secure.getString(contentResolver, "android_id");
                if (string != null) {
                    e = string;
                } else {
                    e = String.valueOf(j);
                }
            }
        }
        return e;
    }

    public static Activity B(Context context) {
        for (int i = 0; i < 10000; i++) {
            context.getClass();
            if (!(context instanceof Service)) {
                if (!(context instanceof Application)) {
                    if (!(context instanceof Activity)) {
                        if (context instanceof ContextWrapper) {
                            context = ((ContextWrapper) context).getBaseContext();
                        } else {
                            String valueOf = String.valueOf(context.getClass().getSimpleName());
                            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown Context type: ".concat(valueOf) : new String("Unknown Context type: "));
                        }
                    } else {
                        return (Activity) context;
                    }
                } else {
                    throw new IllegalArgumentException("Cannot get a singular Activity from an Application");
                }
            } else {
                throw new IllegalArgumentException("Cannot get an Activity from a Service");
            }
        }
        throw new IllegalStateException("Possible Context wrapper loop - chain of wrappers larger than 10000");
    }

    public static Application C(Context context) {
        for (int i = 0; i < 10000; i++) {
            context.getClass();
            if (!(context instanceof Application)) {
                if (!(context instanceof Service)) {
                    if (!(context instanceof Activity)) {
                        if (context instanceof ContextWrapper) {
                            context = ((ContextWrapper) context).getBaseContext();
                        } else {
                            context = context.getApplicationContext();
                        }
                    } else {
                        return ((Activity) context).getApplication();
                    }
                } else {
                    return ((Service) context).getApplication();
                }
            } else {
                return (Application) context;
            }
        }
        throw new IllegalStateException("Possible Context wrapper loop - chain of wrappers larger than 10000");
    }

    public static ampq D(Context context) {
        for (int i = 0; i < 10000 && context != null && !(context instanceof Service) && !(context instanceof Application); i++) {
            if (!(context instanceof Activity)) {
                if (!(context instanceof ContextWrapper)) {
                    return amon.a;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return ampq.j((Activity) context);
            }
        }
        return amon.a;
    }

    public static Object E(Object obj, Class cls) {
        Object G = G(obj);
        if (G == null) {
            throw new IllegalArgumentException(String.format("%s does not extend %s or %s", obj.getClass().getCanonicalName(), dvp.class.getCanonicalName(), axon.class.getCanonicalName()));
        }
        return cls.cast(G);
    }

    public static Object F(Context context, Class cls) {
        return E(C(context), cls);
    }

    public static Object G(Object obj) {
        if (obj instanceof dvp) {
            return ((dvp) obj).a();
        }
        if (!(obj instanceof axon)) {
            return null;
        }
        return ((axon) obj).lI();
    }

    public static Object H(Map map, Object obj, Object obj2) {
        Object obj3 = map.get(obj);
        return (obj3 != null || map.containsKey(obj)) ? obj3 : obj2;
    }

    public static Object I(Map map, Object obj) {
        if (map == null) {
            return null;
        }
        return map.get(obj);
    }

    public static Object J(Map map, Object obj, Object obj2) {
        Object I = I(map, obj);
        return obj2.getClass().isInstance(I) ? I : obj2;
    }

    public static Object K(Map map, Object obj, Class cls) {
        Object I = I(map, obj);
        if (cls.isInstance(I)) {
            return cls.cast(I);
        }
        return null;
    }

    public static Set L(Map map, Object obj) {
        if (!map.containsKey(obj)) {
            return new HashSet();
        }
        return (Set) map.get(obj);
    }

    public static void M(Map map, Object obj, Object obj2) {
        Set set = (Set) map.get(obj);
        if (set == null) {
            set = new HashSet();
            map.put(obj, set);
        }
        set.add(obj2);
    }

    public static boolean N(Map map, Object obj, Object obj2) {
        if (!map.containsKey(obj) || !((Set) map.get(obj)).contains(obj2)) {
            return false;
        }
        ((Set) map.get(obj)).remove(obj2);
        return true;
    }

    public static Object[] O(Object[] objArr, Object... objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        return copyOf;
    }

    public static void P(Map map, Object obj) {
        if (!map.containsKey(obj)) {
            return;
        }
        Set set = (Set) map.get(obj);
        if (set != null && !set.isEmpty()) {
            return;
        }
        map.remove(obj);
    }

    public static long Q(long j) {
        return j / 1048576;
    }

    private static void R(File file) {
        if (file == null || file.isFile()) {
            return;
        }
        d(file.listFiles(zec.a));
    }

    private static void S(List list) {
        Runtime.getRuntime().exec((String[]) list.toArray(new String[list.size()])).waitFor();
    }

    private static int T(Context context) {
        return context.getResources().getConfiguration().smallestScreenWidthDp;
    }

    private static DisplayMetrics U(Context context) {
        context.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    public static List a(List list) {
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.add(null);
        arrayList.addAll(list);
        return arrayList;
    }

    public static zeu b(int i, Deque deque) {
        if (deque.size() == 1) {
            return (zeu) deque.getFirst();
        }
        amuf h = amuk.h(deque.size());
        Iterator it = deque.iterator();
        while (it.hasNext()) {
            h.h(((zet) it.next()).b);
        }
        return new zev(i, h.g());
    }

    public static void c(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        try {
            if (!file.isDirectory()) {
                d(file);
            } else {
                File file2 = new File(file.getParentFile(), "_cleanup_mv0");
                int i = 0;
                while (file2.exists()) {
                    File parentFile = file.getParentFile();
                    i++;
                    StringBuilder sb = new StringBuilder(22);
                    sb.append("_cleanup_mv");
                    sb.append(i);
                    file2 = new File(parentFile, sb.toString());
                }
                if (true != file2.mkdir()) {
                    file2 = null;
                }
                if (file2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (File file3 : file.listFiles()) {
                        arrayList.add(file3.getAbsolutePath());
                    }
                    try {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add("mv");
                        arrayList2.addAll(arrayList);
                        arrayList2.add(file2.getAbsolutePath());
                        S(arrayList2);
                    } catch (IOException | InterruptedException unused) {
                        zep.b("Could not move the root to the temp location");
                    }
                    R(file2.getParentFile());
                }
            }
        } finally {
            R(file.getParentFile());
        }
    }

    public static void d(File... fileArr) {
        int length;
        if (fileArr == null || (length = fileArr.length) == 0) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList(length + 2);
            arrayList.add("rm");
            arrayList.add("-r");
            for (File file : fileArr) {
                arrayList.add(file.getAbsolutePath());
            }
            S(arrayList);
        } catch (IOException | InterruptedException e2) {
            String valueOf = String.valueOf(fileArr[0]);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Unable to remove the files: ");
            sb.append(valueOf);
            zep.d(sb.toString(), e2);
        }
    }

    public static final long e(File file) {
        if (file != null && file.exists()) {
            try {
                StatFs statFs = new StatFs(file.getAbsolutePath());
                return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
            } catch (IllegalArgumentException unused) {
            }
        }
        return 0L;
    }

    public static final long f() {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return 0L;
        }
        return e(Environment.getExternalStorageDirectory());
    }

    public static float g(DisplayMetrics displayMetrics, float f) {
        displayMetrics.getClass();
        return f * displayMetrics.density;
    }

    public static float h(DisplayMetrics displayMetrics, float f) {
        displayMetrics.getClass();
        return (f / displayMetrics.density) + 0.5f;
    }

    public static int i(DisplayMetrics displayMetrics, int i) {
        displayMetrics.getClass();
        double d2 = i * displayMetrics.density;
        Double.isNaN(d2);
        return (int) (d2 + 0.5d);
    }

    public static int j(Context context) {
        context.getClass();
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int k(Context context) {
        context.getClass();
        return n(context.getResources().getDisplayMetrics(), l(context));
    }

    public static int l(Context context) {
        context.getClass();
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int m(Context context) {
        int T = T(context.getApplicationContext());
        if (T == 0) {
            return 0;
        }
        if (T < 480) {
            return 1;
        }
        if (T < 600) {
            return 2;
        }
        return T < 720 ? 3 : 4;
    }

    public static int n(DisplayMetrics displayMetrics, int i) {
        displayMetrics.getClass();
        return (int) ((i / displayMetrics.density) + 0.5f);
    }

    public static Bitmap o(Activity activity) {
        View rootView = activity.getWindow().getDecorView().getRootView();
        boolean isDrawingCacheEnabled = rootView.isDrawingCacheEnabled();
        rootView.setDrawingCacheEnabled(true);
        Bitmap drawingCache = rootView.getDrawingCache();
        if (drawingCache != null) {
            drawingCache = drawingCache.copy(Bitmap.Config.RGB_565, false);
        }
        if (!isDrawingCacheEnabled) {
            rootView.setDrawingCacheEnabled(false);
            rootView.destroyDrawingCache();
        }
        return drawingCache;
    }

    public static Pair p(Context context) {
        DisplayMetrics U = U(context);
        return Pair.create(Integer.valueOf(U.widthPixels), Integer.valueOf(U.heightPixels));
    }

    public static Pair q(Context context) {
        Pair r = r();
        return r == null ? p(context) : r;
    }

    public static Pair r() {
        String a2 = zgj.a("sys.display-size");
        if (a2 != null) {
            String[] split = a2.split("x");
            if (split.length != 2) {
                return null;
            }
            try {
                return Pair.create(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[1])));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public static void s(Context context) {
        DisplayMetrics U = U(context);
        d = Math.min(U.widthPixels, U.heightPixels);
        a = Math.max(U.widthPixels, U.heightPixels);
    }

    public static boolean t(Context context, int i) {
        if (d == 0) {
            s(context);
        }
        return d >= i;
    }

    public static boolean u(Context context) {
        context.getClass();
        return context.getResources().getConfiguration().touchscreen != 1;
    }

    @Deprecated
    public static boolean v(Context context) {
        int m = m(context);
        return m == 3 || m == 4;
    }

    public static boolean w(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static boolean x(Context context) {
        return T(context) >= 720;
    }

    public static boolean y(Context context) {
        return T(context) >= 600;
    }

    public static boolean z(int i) {
        Pair r = r();
        return (r == null ? 0 : Math.min(((Integer) r.first).intValue(), ((Integer) r.second).intValue())) >= i;
    }
}
