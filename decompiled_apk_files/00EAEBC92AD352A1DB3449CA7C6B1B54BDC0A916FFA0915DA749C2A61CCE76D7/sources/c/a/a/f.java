package c.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import c.a.a.x.t;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, n<c.a.a.e>> f2227a = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements i<c.a.a.e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f2228a;

        a(String str) {
            this.f2228a = str;
        }

        @Override // c.a.a.i
        public void a(c.a.a.e eVar) {
            if (this.f2228a != null) {
                c.a.a.v.g.a().a(this.f2228a, eVar);
            }
            f.f2227a.remove(this.f2228a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b implements i<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f2229a;

        b(String str) {
            this.f2229a = str;
        }

        @Override // c.a.a.i
        public void a(Throwable th) {
            f.f2227a.remove(this.f2229a);
        }
    }

    /* loaded from: classes.dex */
    static class c implements Callable<m<c.a.a.e>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f2230a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f2231b;

        c(Context context, String str) {
            this.f2230a = context;
            this.f2231b = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        /* renamed from: call */
        public m<c.a.a.e> mo88call() {
            return c.a.a.w.c.a(this.f2230a, this.f2231b);
        }
    }

    /* loaded from: classes.dex */
    static class d implements Callable<m<c.a.a.e>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f2232a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f2233b;

        d(Context context, String str) {
            this.f2232a = context;
            this.f2233b = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        /* renamed from: call */
        public m<c.a.a.e> mo89call() {
            return f.b(this.f2232a, this.f2233b);
        }
    }

    /* loaded from: classes.dex */
    static class e implements Callable<m<c.a.a.e>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f2234a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f2235b;

        e(Context context, int i) {
            this.f2234a = context;
            this.f2235b = i;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        /* renamed from: call */
        public m<c.a.a.e> mo90call() {
            return f.b(this.f2234a, this.f2235b);
        }
    }

    /* renamed from: c.a.a.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class CallableC0061f implements Callable<m<c.a.a.e>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.a.a.x.k0.c f2236a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f2237b;

        CallableC0061f(c.a.a.x.k0.c cVar, String str) {
            this.f2236a = cVar;
            this.f2237b = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        /* renamed from: call */
        public m<c.a.a.e> mo91call() {
            return f.b(this.f2236a, this.f2237b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class g implements Callable<m<c.a.a.e>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.a.a.e f2238a;

        g(c.a.a.e eVar) {
            this.f2238a = eVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        /* renamed from: call */
        public m<c.a.a.e> mo92call() {
            return new m<>(this.f2238a);
        }
    }

    private static h a(c.a.a.e eVar, String str) {
        for (h hVar : eVar.h().values()) {
            if (hVar.b().equals(str)) {
                return hVar;
            }
        }
        return null;
    }

    private static m<c.a.a.e> a(c.a.a.x.k0.c cVar, String str, boolean z) {
        try {
            try {
                c.a.a.e a2 = t.a(cVar);
                c.a.a.v.g.a().a(str, a2);
                m<c.a.a.e> mVar = new m<>(a2);
                if (z) {
                    c.a.a.y.h.a(cVar);
                }
                return mVar;
            } catch (Exception e2) {
                m<c.a.a.e> mVar2 = new m<>(e2);
                if (z) {
                    c.a.a.y.h.a(cVar);
                }
                return mVar2;
            }
        } catch (Throwable th) {
            if (z) {
                c.a.a.y.h.a(cVar);
            }
            throw th;
        }
    }

    public static m<c.a.a.e> a(InputStream inputStream, String str) {
        return a(inputStream, str, true);
    }

    private static m<c.a.a.e> a(InputStream inputStream, String str, boolean z) {
        try {
            return b(c.a.a.x.k0.c.a(h.l.a(h.l.a(inputStream))), str);
        } finally {
            if (z) {
                c.a.a.y.h.a(inputStream);
            }
        }
    }

    public static m<c.a.a.e> a(ZipInputStream zipInputStream, String str) {
        try {
            return b(zipInputStream, str);
        } finally {
            c.a.a.y.h.a(zipInputStream);
        }
    }

    public static n<c.a.a.e> a(Context context, int i) {
        return a(a(i), new e(context.getApplicationContext(), i));
    }

    public static n<c.a.a.e> a(Context context, String str) {
        return a(str, new d(context.getApplicationContext(), str));
    }

    public static n<c.a.a.e> a(c.a.a.x.k0.c cVar, String str) {
        return a(str, new CallableC0061f(cVar, str));
    }

    private static n<c.a.a.e> a(String str, Callable<m<c.a.a.e>> callable) {
        c.a.a.e a2 = str == null ? null : c.a.a.v.g.a().a(str);
        if (a2 != null) {
            return new n<>(new g(a2));
        }
        if (str != null && f2227a.containsKey(str)) {
            return f2227a.get(str);
        }
        n<c.a.a.e> nVar = new n<>(callable);
        nVar.b(new a(str));
        nVar.a(new b(str));
        f2227a.put(str, nVar);
        return nVar;
    }

    private static String a(int i) {
        return "rawRes_" + i;
    }

    public static m<c.a.a.e> b(Context context, int i) {
        try {
            return a(context.getResources().openRawResource(i), a(i));
        } catch (Resources.NotFoundException e2) {
            return new m<>(e2);
        }
    }

    public static m<c.a.a.e> b(Context context, String str) {
        try {
            String str2 = "asset_" + str;
            return str.endsWith(".zip") ? a(new ZipInputStream(context.getAssets().open(str)), str2) : a(context.getAssets().open(str), str2);
        } catch (IOException e2) {
            return new m<>(e2);
        }
    }

    public static m<c.a.a.e> b(c.a.a.x.k0.c cVar, String str) {
        return a(cVar, str, true);
    }

    private static m<c.a.a.e> b(ZipInputStream zipInputStream, String str) {
        String[] split;
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            c.a.a.e eVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (!name.contains("__MACOSX")) {
                    if (nextEntry.getName().contains(".json")) {
                        eVar = a(c.a.a.x.k0.c.a(h.l.a(h.l.a(zipInputStream))), (String) null, false).b();
                    } else if (name.contains(".png") || name.contains(".webp")) {
                        hashMap.put(name.split("/")[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                zipInputStream.closeEntry();
                nextEntry = zipInputStream.getNextEntry();
            }
            if (eVar == null) {
                return new m<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                h a2 = a(eVar, (String) entry.getKey());
                if (a2 != null) {
                    a2.a(c.a.a.y.h.a((Bitmap) entry.getValue(), a2.e(), a2.c()));
                }
            }
            for (Map.Entry<String, h> entry2 : eVar.h().entrySet()) {
                if (entry2.getValue().a() == null) {
                    return new m<>(new IllegalStateException("There is no image for " + entry2.getValue().b()));
                }
            }
            c.a.a.v.g.a().a(str, eVar);
            return new m<>(eVar);
        } catch (IOException e2) {
            return new m<>(e2);
        }
    }

    public static n<c.a.a.e> c(Context context, String str) {
        return a("url_" + str, new c(context, str));
    }
}
