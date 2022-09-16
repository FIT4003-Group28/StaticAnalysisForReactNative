package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: cpke  reason: default package */
/* loaded from: classes.dex */
public final class cpke {
    static HashMap<String, String> f;
    private static Object l;
    private static boolean m;
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    public static final AtomicBoolean e = new AtomicBoolean();
    static final HashMap<String, Boolean> g = new HashMap<>();
    static final HashMap<String, Integer> h = new HashMap<>();
    static final HashMap<String, Long> i = new HashMap<>();
    static final HashMap<String, Float> j = new HashMap<>();
    static final String[] k = new String[0];

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (cpke.class) {
            h(contentResolver);
            Object obj = l;
            if (f.containsKey(str)) {
                String str3 = f.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
                return str2;
            }
            int length = k.length;
            Cursor query = contentResolver.query(a, null, null, new String[]{str}, null);
            if (query == null) {
                return str2;
            }
            try {
                if (!query.moveToFirst()) {
                    i(obj, str, null);
                    return str2;
                }
                String string = query.getString(1);
                if (string != null && string.equals(str2)) {
                    string = str2;
                }
                i(obj, str, string);
                if (string != null) {
                    str2 = string;
                }
                return str2;
            } finally {
                query.close();
            }
        }
    }

    @Deprecated
    public static String b(ContentResolver contentResolver, String str) {
        return a(contentResolver, str, null);
    }

    public static int c(ContentResolver contentResolver, String str, int i2) {
        Object f2 = f(contentResolver);
        Integer num = (Integer) j(h, str, Integer.valueOf(i2));
        if (num != null) {
            return num.intValue();
        }
        String b2 = b(contentResolver, str);
        if (b2 != null) {
            try {
                int parseInt = Integer.parseInt(b2);
                num = Integer.valueOf(parseInt);
                i2 = parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        k(f2, h, str, num);
        return i2;
    }

    public static boolean d(ContentResolver contentResolver, String str, boolean z) {
        Object f2 = f(contentResolver);
        HashMap<String, Boolean> hashMap = g;
        Boolean bool = (Boolean) j(hashMap, str, Boolean.valueOf(z));
        if (bool != null) {
            return bool.booleanValue();
        }
        String b2 = b(contentResolver, str);
        if (b2 != null && !b2.equals("")) {
            if (c.matcher(b2).matches()) {
                bool = true;
                z = true;
            } else if (d.matcher(b2).matches()) {
                bool = false;
                z = false;
            } else {
                String str2 = "attempt to read gservices key " + str + " (value \"" + b2 + "\") as boolean";
            }
        }
        k(f2, hashMap, str, bool);
        return z;
    }

    public static Map<String, String> e(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(b, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    treeMap.put(query.getString(0), query.getString(1));
                } finally {
                    query.close();
                }
            }
            return treeMap;
        }
        return treeMap;
    }

    public static Object f(ContentResolver contentResolver) {
        Object obj;
        synchronized (cpke.class) {
            h(contentResolver);
            obj = l;
        }
        return obj;
    }

    public static long g(ContentResolver contentResolver, long j2) {
        Object f2 = f(contentResolver);
        Long l2 = (Long) j(i, "android_id", Long.valueOf(j2));
        if (l2 != null) {
            return l2.longValue();
        }
        String b2 = b(contentResolver, "android_id");
        if (b2 != null) {
            try {
                long parseLong = Long.parseLong(b2);
                l2 = Long.valueOf(parseLong);
                j2 = parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        k(f2, i, "android_id", l2);
        return j2;
    }

    private static void h(ContentResolver contentResolver) {
        if (f == null) {
            e.set(false);
            f = new HashMap<>();
            l = new Object();
            m = false;
            contentResolver.registerContentObserver(a, true, new cpkd());
        } else if (!e.getAndSet(false)) {
        } else {
            f.clear();
            g.clear();
            h.clear();
            i.clear();
            j.clear();
            l = new Object();
            m = false;
        }
    }

    private static void i(Object obj, String str, String str2) {
        synchronized (cpke.class) {
            if (obj == l) {
                f.put(str, str2);
            }
        }
    }

    private static <T> T j(HashMap<String, T> hashMap, String str, T t) {
        synchronized (cpke.class) {
            if (hashMap.containsKey(str)) {
                T t2 = hashMap.get(str);
                if (t2 != null) {
                    t = t2;
                }
                return t;
            }
            return null;
        }
    }

    private static <T> void k(Object obj, HashMap<String, T> hashMap, String str, T t) {
        synchronized (cpke.class) {
            if (obj == l) {
                hashMap.put(str, t);
                f.remove(str);
            }
        }
    }
}
