package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;
/* loaded from: classes.dex */
class i {

    /* renamed from: a  reason: collision with root package name */
    private static Field f936a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f937b;

    /* renamed from: c  reason: collision with root package name */
    private static Class<?> f938c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f939d;

    /* renamed from: e  reason: collision with root package name */
    private static Field f940e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f941f;

    /* renamed from: g  reason: collision with root package name */
    private static Field f942g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f943h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        if (i >= 24) {
            d(resources);
        } else if (i >= 23) {
            c(resources);
        } else if (i < 21) {
        } else {
            b(resources);
        }
    }

    private static void a(Object obj) {
        LongSparseArray longSparseArray;
        if (!f939d) {
            try {
                f938c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f939d = true;
        }
        Class<?> cls = f938c;
        if (cls == null) {
            return;
        }
        if (!f941f) {
            try {
                f940e = cls.getDeclaredField("mUnthemedEntries");
                f940e.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            f941f = true;
        }
        Field field = f940e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
            longSparseArray = null;
        }
        if (longSparseArray == null) {
            return;
        }
        longSparseArray.clear();
    }

    private static void b(Resources resources) {
        Map map;
        if (!f937b) {
            try {
                f936a = Resources.class.getDeclaredField("mDrawableCache");
                f936a.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            f937b = true;
        }
        Field field = f936a;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
                map = null;
            }
            if (map == null) {
                return;
            }
            map.clear();
        }
    }

    private static void c(Resources resources) {
        if (!f937b) {
            try {
                f936a = Resources.class.getDeclaredField("mDrawableCache");
                f936a.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            f937b = true;
        }
        Object obj = null;
        Field field = f936a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
            }
        }
        if (obj == null) {
            return;
        }
        a(obj);
    }

    private static void d(Resources resources) {
        Object obj;
        if (!f943h) {
            try {
                f942g = Resources.class.getDeclaredField("mResourcesImpl");
                f942g.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
            }
            f943h = true;
        }
        Field field = f942g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f937b) {
            try {
                f936a = obj.getClass().getDeclaredField("mDrawableCache");
                f936a.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
            }
            f937b = true;
        }
        Field field2 = f936a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e5) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
            }
        }
        if (obj2 == null) {
            return;
        }
        a(obj2);
    }
}
