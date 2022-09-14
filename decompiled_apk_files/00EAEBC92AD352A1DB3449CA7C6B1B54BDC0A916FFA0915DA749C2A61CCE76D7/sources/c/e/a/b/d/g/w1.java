package c.e.a.b.d.g;

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
/* loaded from: classes.dex */
public final class w1 implements a2 {

    /* renamed from: g  reason: collision with root package name */
    private static final Map<Uri, w1> f4487g = new a.e.a();

    /* renamed from: h  reason: collision with root package name */
    private static final String[] f4488h = {"key", "value"};

    /* renamed from: a  reason: collision with root package name */
    private final ContentResolver f4489a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f4490b;

    /* renamed from: e  reason: collision with root package name */
    private volatile Map<String, String> f4493e;

    /* renamed from: c  reason: collision with root package name */
    private final ContentObserver f4491c = new y1(this, null);

    /* renamed from: d  reason: collision with root package name */
    private final Object f4492d = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final List<b2> f4494f = new ArrayList();

    private w1(ContentResolver contentResolver, Uri uri) {
        this.f4489a = contentResolver;
        this.f4490b = uri;
        contentResolver.registerContentObserver(uri, false, this.f4491c);
    }

    public static w1 a(ContentResolver contentResolver, Uri uri) {
        w1 w1Var;
        synchronized (w1.class) {
            w1Var = f4487g.get(uri);
            if (w1Var == null) {
                try {
                    w1 w1Var2 = new w1(contentResolver, uri);
                    try {
                        f4487g.put(uri, w1Var2);
                    } catch (SecurityException unused) {
                    }
                    w1Var = w1Var2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return w1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void d() {
        synchronized (w1.class) {
            for (w1 w1Var : f4487g.values()) {
                w1Var.f4489a.unregisterContentObserver(w1Var.f4491c);
            }
            f4487g.clear();
        }
    }

    private final Map<String, String> e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                return (Map) d2.a(new c2(this) { // from class: c.e.a.b.d.g.z1

                    /* renamed from: a  reason: collision with root package name */
                    private final w1 f4556a;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.f4556a = this;
                    }

                    @Override // c.e.a.b.d.g.c2
                    public final Object f() {
                        return this.f4556a.c();
                    }
                });
            } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return null;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    @Override // c.e.a.b.d.g.a2
    public final /* synthetic */ Object a(String str) {
        return a().get(str);
    }

    public final Map<String, String> a() {
        Map<String, String> map = this.f4493e;
        if (map == null) {
            synchronized (this.f4492d) {
                map = this.f4493e;
                if (map == null) {
                    map = e();
                    this.f4493e = map;
                }
            }
        }
        return map != null ? map : Collections.emptyMap();
    }

    public final void b() {
        synchronized (this.f4492d) {
            this.f4493e = null;
            k2.c();
        }
        synchronized (this) {
            for (b2 b2Var : this.f4494f) {
                b2Var.f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Map c() {
        Cursor query = this.f4489a.query(this.f4490b, f4488h, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map aVar = count <= 256 ? new a.e.a(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                aVar.put(query.getString(0), query.getString(1));
            }
            return aVar;
        } finally {
            query.close();
        }
    }
}
