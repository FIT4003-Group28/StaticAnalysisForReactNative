package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ajqa  reason: default package */
/* loaded from: classes.dex */
public final class ajqa implements ynl {
    static final long a = TimeUnit.SECONDS.toMillis(10);
    static final Uri b = new Uri.Builder().scheme("yt").authority("reactr").build();
    private final Map c = new HashMap();
    private final WeakHashMap d = new WeakHashMap();
    private final LruCache e = new LruCache(1000);
    private final snc f;
    private long g;

    public ajqa(snc sncVar, yni yniVar) {
        sncVar.getClass();
        this.f = sncVar;
        this.g = Long.MAX_VALUE;
        yniVar.g(this);
    }

    static Uri a(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null || pathSegments.isEmpty()) {
            return null;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.path("");
        for (int i = 0; i < pathSegments.size() - 1; i++) {
            buildUpon.appendPath(pathSegments.get(i));
        }
        return buildUpon.build();
    }

    public static Uri g(int i, String... strArr) {
        aqxo.p(true);
        aqxo.p(true);
        aqxo.p(true);
        aqxo.p(!TextUtils.isEmpty(strArr[0]));
        Uri.Builder buildUpon = b.buildUpon();
        buildUpon.authority(i != 1 ? i != 2 ? i != 3 ? "SUBSCRIPTIONS" : "SOCIAL" : "NOTIFICATIONS" : "COMMENTS");
        for (String str : strArr) {
            zgh.m(str);
            buildUpon.appendPath(str);
        }
        return buildUpon.build();
    }

    private final List i(Uri uri, boolean z) {
        ylr.c();
        List list = (List) this.c.get(uri);
        if (list != null || !z) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.c.put(uri, arrayList);
        return arrayList;
    }

    private final boolean j(Uri uri) {
        List i = i(uri, false);
        if (i != null) {
            Iterator it = i.iterator();
            while (it.hasNext()) {
                if (((WeakReference) it.next()).get() == null) {
                    it.remove();
                }
            }
        }
        return i != null && !i.isEmpty();
    }

    public final ajpy b(Uri uri) {
        ylr.c();
        return (ajpy) this.e.get(uri);
    }

    public final ajpy c(Uri uri, ajpy ajpyVar) {
        ajpyVar.getClass();
        ajpy ajpyVar2 = (ajpy) this.e.get(uri);
        if (ajpyVar2 == null || (ajpyVar = ajpyVar2.e(ajpyVar)) != null) {
            d(uri, ajpyVar);
            return ajpyVar;
        }
        throw new IllegalStateException();
    }

    public final void d(Uri uri, ajpy ajpyVar) {
        ylr.c();
        this.e.put(uri, ajpyVar);
        ylr.c();
        for (Uri uri2 = uri; uri2 != null; uri2 = a(uri2)) {
            List i = i(uri2, false);
            if (i != null) {
                i = new ArrayList(i);
            }
            if (i != null) {
                Iterator it = i.iterator();
                while (it.hasNext()) {
                    ajpz ajpzVar = (ajpz) ((WeakReference) it.next()).get();
                    if (ajpzVar == null) {
                        it.remove();
                    } else {
                        ajpzVar.kA(uri2, uri);
                    }
                }
            }
        }
    }

    public final void e(ajpz ajpzVar) {
        ajpzVar.getClass();
        Set<Uri> set = (Set) this.d.remove(ajpzVar);
        if (set == null) {
            return;
        }
        for (Uri uri : set) {
            List i = i(uri, false);
            if (i != null) {
                Iterator it = i.iterator();
                while (it.hasNext()) {
                    ajpz ajpzVar2 = (ajpz) ((WeakReference) it.next()).get();
                    if (ajpzVar2 == null) {
                        it.remove();
                    } else if (ajpzVar2 == ajpzVar) {
                        it.remove();
                    }
                }
            }
        }
    }

    public final void h(Uri uri, ajpz ajpzVar) {
        uri.getClass();
        ajpzVar.getClass();
        ylr.c();
        Set set = (Set) this.d.get(ajpzVar);
        if (set == null) {
            set = new HashSet();
            this.d.put(ajpzVar, set);
        }
        if (set.add(uri)) {
            i(uri, true).add(new WeakReference(ajpzVar));
        }
        long d = this.f.d();
        long j = this.g;
        if (j == -1 || d - j >= a) {
            HashMap hashMap = new HashMap();
            hashMap.put(uri, true);
            for (Uri uri2 : this.c.keySet()) {
                if (!hashMap.containsKey(uri2)) {
                    Uri a2 = a(uri2);
                    Boolean bool = (Boolean) hashMap.get(a2);
                    if (bool == null) {
                        bool = Boolean.valueOf(j(a2));
                        hashMap.put(a2, bool);
                    }
                    boolean z = j(uri2) || bool.booleanValue();
                    if (!z) {
                        this.e.remove(uri2);
                    }
                    hashMap.put(uri2, Boolean.valueOf(z));
                }
            }
            this.g = d;
        }
        ajpy ajpyVar = (ajpy) this.e.get(uri);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwd afwdVar = (afwd) obj;
                this.e.evictAll();
                this.c.clear();
                this.d.clear();
                this.g = this.f.d();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{afwd.class};
    }
}
