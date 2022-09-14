package c.e.a.b.d.g;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class v1 {

    /* renamed from: f  reason: collision with root package name */
    private static HashMap<String, String> f4471f;
    private static Object k;
    private static boolean l;

    /* renamed from: a  reason: collision with root package name */
    public static final Uri f4466a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b  reason: collision with root package name */
    private static final Uri f4467b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f4468c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f4469d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicBoolean f4470e = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    private static final HashMap<String, Boolean> f4472g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private static final HashMap<String, Integer> f4473h = new HashMap<>();
    private static final HashMap<String, Long> i = new HashMap<>();
    private static final HashMap<String, Float> j = new HashMap<>();
    private static String[] m = new String[0];

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (v1.class) {
            if (f4471f == null) {
                f4470e.set(false);
                f4471f = new HashMap<>();
                k = new Object();
                l = false;
                contentResolver.registerContentObserver(f4466a, true, new u1(null));
            } else if (f4470e.getAndSet(false)) {
                f4471f.clear();
                f4472g.clear();
                f4473h.clear();
                i.clear();
                j.clear();
                k = new Object();
                l = false;
            }
            Object obj = k;
            if (f4471f.containsKey(str)) {
                String str3 = f4471f.get(str);
                if (str3 == null) {
                    str3 = null;
                }
                return str3;
            }
            for (String str4 : m) {
                if (str.startsWith(str4)) {
                    if (!l || f4471f.isEmpty()) {
                        f4471f.putAll(a(contentResolver, m));
                        l = true;
                        if (f4471f.containsKey(str)) {
                            String str5 = f4471f.get(str);
                            if (str5 == null) {
                                str5 = null;
                            }
                            return str5;
                        }
                    }
                    return null;
                }
            }
            Cursor query = contentResolver.query(f4466a, null, null, new String[]{str}, null);
            if (query == null) {
                return null;
            }
            try {
                if (!query.moveToFirst()) {
                    a(obj, str, (String) null);
                    if (query != null) {
                        query.close();
                    }
                    return null;
                }
                String string = query.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                a(obj, str, string);
                if (string == null) {
                    string = null;
                }
                if (query != null) {
                    query.close();
                }
                return string;
            } finally {
                if (query != null) {
                    query.close();
                }
            }
        }
    }

    private static Map<String, String> a(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f4467b, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }

    private static void a(Object obj, String str, String str2) {
        synchronized (v1.class) {
            if (obj == k) {
                f4471f.put(str, str2);
            }
        }
    }
}
