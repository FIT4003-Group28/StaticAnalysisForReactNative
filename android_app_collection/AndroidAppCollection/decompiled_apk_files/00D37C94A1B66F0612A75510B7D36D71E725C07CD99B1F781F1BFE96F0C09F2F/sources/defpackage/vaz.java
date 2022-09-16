package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: vaz  reason: default package */
/* loaded from: classes4.dex */
public final class vaz implements vbc {
    public final ContentResolver b;
    public final Uri c;
    private final ContentObserver e;
    private final Object f;
    private volatile Map g;
    private final List h;
    private static final Map d = new afw();
    public static final String[] a = {"key", "value"};

    private vaz(ContentResolver contentResolver, Uri uri) {
        vay vayVar = new vay(this);
        this.e = vayVar;
        this.f = new Object();
        this.h = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.b = contentResolver;
        this.c = uri;
        contentResolver.registerContentObserver(uri, false, vayVar);
    }

    public static vaz a(ContentResolver contentResolver, Uri uri) {
        vaz vazVar;
        synchronized (vaz.class) {
            Map map = d;
            vazVar = (vaz) map.get(uri);
            if (vazVar == null) {
                try {
                    vaz vazVar2 = new vaz(contentResolver, uri);
                    try {
                        map.put(uri, vazVar2);
                    } catch (SecurityException unused) {
                    }
                    vazVar = vazVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return vazVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void d() {
        synchronized (vaz.class) {
            for (vaz vazVar : d.values()) {
                vazVar.b.unregisterContentObserver(vazVar.e);
            }
            d.clear();
        }
    }

    public static void f(Uri uri) {
        synchronized (vaz.class) {
            vaz vazVar = (vaz) d.get(uri);
            if (vazVar != null) {
                vazVar.e();
            }
        }
    }

    @Override // defpackage.vbc
    public final /* bridge */ /* synthetic */ Object b(String str) {
        return (String) c().get(str);
    }

    public final Map c() {
        Map map;
        Map map2 = this.g;
        if (map2 == null) {
            synchronized (this.f) {
                map2 = this.g;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) vqw.h(new vbb() { // from class: vax
                            @Override // defpackage.vbb
                            public final Object a() {
                                Map hashMap;
                                vaz vazVar = vaz.this;
                                Cursor query = vazVar.b.query(vazVar.c, vaz.a, null, null, null);
                                if (query == null) {
                                    return Collections.emptyMap();
                                }
                                try {
                                    int count = query.getCount();
                                    if (count == 0) {
                                        return Collections.emptyMap();
                                    }
                                    if (count <= 256) {
                                        hashMap = new afw(count);
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
                        Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = null;
                    }
                    this.g = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }

    public final void e() {
        synchronized (this.f) {
            this.g = null;
            vbt.f();
        }
        synchronized (this) {
            for (vba vbaVar : this.h) {
                vbaVar.a();
            }
        }
    }
}
