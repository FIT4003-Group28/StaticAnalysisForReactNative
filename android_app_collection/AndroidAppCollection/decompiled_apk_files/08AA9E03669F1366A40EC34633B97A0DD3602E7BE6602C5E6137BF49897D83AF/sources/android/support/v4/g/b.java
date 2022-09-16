package android.support.v4.g;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.support.v4.a.a.b;
import android.support.v4.b.h;
import android.support.v4.g.c;
import android.support.v4.i.g;
import android.support.v4.i.k;
import android.support.v4.i.l;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
/* compiled from: FontsContractCompat.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final g<String, Typeface> f391a = new g<>(16);

    /* renamed from: b  reason: collision with root package name */
    private static final android.support.v4.g.c f392b = new android.support.v4.g.c("fonts", 10, b.a.a.a.a.b.a.DEFAULT_TIMEOUT);

    /* renamed from: c  reason: collision with root package name */
    private static final Object f393c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final l<String, ArrayList<c.a<c>>> f394d = new l<>();
    private static final Comparator<byte[]> e = new Comparator<byte[]>() { // from class: android.support.v4.g.b.4
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            if (bArr.length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] != bArr2[i]) {
                    return bArr[i] - bArr2[i];
                }
            }
            return 0;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static c b(Context context, android.support.v4.g.a aVar, int i) {
        try {
            a a2 = a(context, (CancellationSignal) null, aVar);
            int i2 = -3;
            if (a2.a() == 0) {
                Typeface a3 = android.support.v4.b.c.a(context, null, a2.b(), i);
                if (a3 != null) {
                    i2 = 0;
                }
                return new c(a3, i2);
            }
            if (a2.a() == 1) {
                i2 = -2;
            }
            return new c(null, i2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new c(null, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FontsContractCompat.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        final Typeface f408a;

        /* renamed from: b  reason: collision with root package name */
        final int f409b;

        c(Typeface typeface, int i) {
            this.f408a = typeface;
            this.f409b = i;
        }
    }

    public static Typeface a(final Context context, final android.support.v4.g.a aVar, final b.a aVar2, final Handler handler, boolean z, int i, final int i2) {
        final String str = aVar.f() + "-" + i2;
        Typeface typeface = f391a.get(str);
        if (typeface != null) {
            if (aVar2 != null) {
                aVar2.a(typeface);
            }
            return typeface;
        } else if (z && i == -1) {
            c b2 = b(context, aVar, i2);
            if (aVar2 != null) {
                if (b2.f409b == 0) {
                    aVar2.a(b2.f408a, handler);
                } else {
                    aVar2.a(b2.f409b, handler);
                }
            }
            return b2.f408a;
        } else {
            Callable<c> callable = new Callable<c>() { // from class: android.support.v4.g.b.1
                @Override // java.util.concurrent.Callable
                /* renamed from: a */
                public c call() {
                    c b3 = b.b(context, aVar, i2);
                    if (b3.f408a != null) {
                        b.f391a.put(str, b3.f408a);
                    }
                    return b3;
                }
            };
            if (z) {
                try {
                    return ((c) f392b.a(callable, i)).f408a;
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            c.a<c> aVar3 = aVar2 == null ? null : new c.a<c>() { // from class: android.support.v4.g.b.2
                @Override // android.support.v4.g.c.a
                public void a(c cVar) {
                    if (cVar == null) {
                        b.a.this.a(1, handler);
                    } else if (cVar.f409b == 0) {
                        b.a.this.a(cVar.f408a, handler);
                    } else {
                        b.a.this.a(cVar.f409b, handler);
                    }
                }
            };
            synchronized (f393c) {
                if (f394d.containsKey(str)) {
                    if (aVar3 != null) {
                        f394d.get(str).add(aVar3);
                    }
                    return null;
                }
                if (aVar3 != null) {
                    ArrayList<c.a<c>> arrayList = new ArrayList<>();
                    arrayList.add(aVar3);
                    f394d.put(str, arrayList);
                }
                f392b.a(callable, new c.a<c>() { // from class: android.support.v4.g.b.3
                    @Override // android.support.v4.g.c.a
                    public void a(c cVar) {
                        synchronized (b.f393c) {
                            ArrayList arrayList2 = (ArrayList) b.f394d.get(str);
                            if (arrayList2 == null) {
                                return;
                            }
                            b.f394d.remove(str);
                            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                                ((c.a) arrayList2.get(i3)).a(cVar);
                            }
                        }
                    }
                });
                return null;
            }
        }
    }

    /* compiled from: FontsContractCompat.java */
    /* renamed from: android.support.v4.g.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0008b {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f404a;

        /* renamed from: b  reason: collision with root package name */
        private final int f405b;

        /* renamed from: c  reason: collision with root package name */
        private final int f406c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f407d;
        private final int e;

        public C0008b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f404a = (Uri) k.a(uri);
            this.f405b = i;
            this.f406c = i2;
            this.f407d = z;
            this.e = i3;
        }

        public Uri a() {
            return this.f404a;
        }

        public int b() {
            return this.f405b;
        }

        public int c() {
            return this.f406c;
        }

        public boolean d() {
            return this.f407d;
        }

        public int e() {
            return this.e;
        }
    }

    /* compiled from: FontsContractCompat.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f402a;

        /* renamed from: b  reason: collision with root package name */
        private final C0008b[] f403b;

        public a(int i, C0008b[] c0008bArr) {
            this.f402a = i;
            this.f403b = c0008bArr;
        }

        public int a() {
            return this.f402a;
        }

        public C0008b[] b() {
            return this.f403b;
        }
    }

    public static Map<Uri, ByteBuffer> a(Context context, C0008b[] c0008bArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C0008b c0008b : c0008bArr) {
            if (c0008b.e() == 0) {
                Uri a2 = c0008b.a();
                if (!hashMap.containsKey(a2)) {
                    hashMap.put(a2, h.a(context, cancellationSignal, a2));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public static a a(Context context, CancellationSignal cancellationSignal, android.support.v4.g.a aVar) {
        ProviderInfo a2 = a(context.getPackageManager(), aVar, context.getResources());
        if (a2 == null) {
            return new a(1, null);
        }
        return new a(0, a(context, aVar, a2.authority, cancellationSignal));
    }

    public static ProviderInfo a(PackageManager packageManager, android.support.v4.g.a aVar, Resources resources) {
        String a2 = aVar.a();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(a2, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + a2);
        } else if (!resolveContentProvider.packageName.equals(aVar.b())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + a2 + ", but package was not " + aVar.b());
        } else {
            List<byte[]> a3 = a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a3, e);
            List<List<byte[]>> a4 = a(aVar, resources);
            for (int i = 0; i < a4.size(); i++) {
                ArrayList arrayList = new ArrayList(a4.get(i));
                Collections.sort(arrayList, e);
                if (a(a3, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        }
    }

    private static List<List<byte[]>> a(android.support.v4.g.a aVar, Resources resources) {
        if (aVar.d() != null) {
            return aVar.d();
        }
        return android.support.v4.a.a.a.a(resources, aVar.e());
    }

    private static boolean a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static List<byte[]> a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    static C0008b[] a(Context context, android.support.v4.g.a aVar, String str, CancellationSignal cancellationSignal) {
        Cursor query;
        Uri withAppendedId;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            if (Build.VERSION.SDK_INT > 16) {
                query = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.c()}, null, cancellationSignal);
            } else {
                query = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.c()}, null);
            }
            cursor = query;
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i2 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    arrayList2.add(new C0008b(withAppendedId, i2, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                }
                arrayList = arrayList2;
            }
            return (C0008b[]) arrayList.toArray(new C0008b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
