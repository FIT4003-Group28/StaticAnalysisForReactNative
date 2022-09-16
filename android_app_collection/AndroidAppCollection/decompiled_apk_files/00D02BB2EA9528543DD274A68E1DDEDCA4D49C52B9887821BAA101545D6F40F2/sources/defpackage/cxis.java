package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cxis  reason: default package */
/* loaded from: classes.dex */
public final class cxis implements cxiw {
    public final ContentResolver a;
    public final Uri b;
    private final ContentObserver e;
    private final Object f;
    private volatile Map<String, String> g;
    private final List<cxit> h;
    private static final Map<Uri, cxis> d = new aif();
    public static final String[] c = {"key", "value"};

    private cxis(ContentResolver contentResolver, Uri uri) {
        cxir cxirVar = new cxir(this);
        this.e = cxirVar;
        this.f = new Object();
        this.h = new ArrayList();
        dbsk.s(contentResolver);
        dbsk.s(uri);
        this.a = contentResolver;
        this.b = uri;
        contentResolver.registerContentObserver(uri, false, cxirVar);
    }

    public static cxis a(ContentResolver contentResolver, Uri uri) {
        cxis cxisVar;
        synchronized (cxis.class) {
            Map<Uri, cxis> map = d;
            cxisVar = map.get(uri);
            if (cxisVar == null) {
                try {
                    cxis cxisVar2 = new cxis(contentResolver, uri);
                    try {
                        map.put(uri, cxisVar2);
                    } catch (SecurityException unused) {
                    }
                    cxisVar = cxisVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return cxisVar;
    }

    public static void c(Uri uri) {
        synchronized (cxis.class) {
            cxis cxisVar = d.get(uri);
            if (cxisVar != null) {
                cxisVar.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void d() {
        synchronized (cxis.class) {
            for (cxis cxisVar : d.values()) {
                cxisVar.a.unregisterContentObserver(cxisVar.e);
            }
            d.clear();
        }
    }

    public final void b() {
        synchronized (this.f) {
            this.g = null;
            cxju.d();
        }
        synchronized (this) {
            for (cxit cxitVar : this.h) {
                cxitVar.a();
            }
        }
    }

    @Override // defpackage.cxiw
    public final /* bridge */ /* synthetic */ Object e(String str) {
        Map<String, String> map;
        Map<String, String> map2 = this.g;
        if (map2 == null) {
            synchronized (this.f) {
                map2 = this.g;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) cxiu.a(new cxiv(this) { // from class: cxiq
                            private final cxis a;

                            {
                                this.a = this;
                            }

                            @Override // defpackage.cxiv
                            public final Object a() {
                                Map hashMap;
                                cxis cxisVar = this.a;
                                Cursor query = cxisVar.a.query(cxisVar.b, cxis.c, null, null, null);
                                if (query == null) {
                                    return Collections.emptyMap();
                                }
                                try {
                                    int count = query.getCount();
                                    if (count == 0) {
                                        return Collections.emptyMap();
                                    }
                                    if (count <= 256) {
                                        hashMap = new aif(count);
                                    } else {
                                        hashMap = new HashMap(count, 1.0f);
                                    }
                                    while (query.moveToNext()) {
                                        hashMap.put(query.getString(0), query.getString(1));
                                    }
                                    query.close();
                                    return hashMap;
                                } finally {
                                    query.close();
                                }
                            }
                        });
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                    this.g = map;
                    map2 = map;
                }
            }
        }
        if (map2 == null) {
            map2 = Collections.emptyMap();
        }
        return map2.get(str);
    }
}
