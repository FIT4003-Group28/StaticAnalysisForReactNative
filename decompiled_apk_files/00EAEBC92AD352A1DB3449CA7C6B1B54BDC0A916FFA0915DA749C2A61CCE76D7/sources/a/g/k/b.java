package a.g.k;

import a.g.e.f.f;
import a.g.f.k;
import a.g.k.c;
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
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    static final a.e.e<String, Typeface> f233a = new a.e.e<>(16);

    /* renamed from: b  reason: collision with root package name */
    private static final a.g.k.c f234b = new a.g.k.c("fonts", 10, 10000);

    /* renamed from: c  reason: collision with root package name */
    static final Object f235c = new Object();

    /* renamed from: d  reason: collision with root package name */
    static final a.e.g<String, ArrayList<c.d<g>>> f236d = new a.e.g<>();

    /* renamed from: e  reason: collision with root package name */
    private static final Comparator<byte[]> f237e = new d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Callable<g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f238a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.g.k.a f239b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f240c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f241d;

        a(Context context, a.g.k.a aVar, int i, String str) {
            this.f238a = context;
            this.f239b = aVar;
            this.f240c = i;
            this.f241d = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        /* renamed from: call */
        public g mo7call() {
            g a2 = b.a(this.f238a, this.f239b, this.f240c);
            Typeface typeface = a2.f252a;
            if (typeface != null) {
                b.f233a.a(this.f241d, typeface);
            }
            return a2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.g.k.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0008b implements c.d<g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f.a f242a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Handler f243b;

        C0008b(f.a aVar, Handler handler) {
            this.f242a = aVar;
            this.f243b = handler;
        }

        @Override // a.g.k.c.d
        public void a(g gVar) {
            int i;
            f.a aVar;
            if (gVar == null) {
                aVar = this.f242a;
                i = 1;
            } else {
                i = gVar.f253b;
                if (i == 0) {
                    this.f242a.a(gVar.f252a, this.f243b);
                    return;
                }
                aVar = this.f242a;
            }
            aVar.a(i, this.f243b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements c.d<g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f244a;

        c(String str) {
            this.f244a = str;
        }

        @Override // a.g.k.c.d
        public void a(g gVar) {
            synchronized (b.f235c) {
                ArrayList<c.d<g>> arrayList = b.f236d.get(this.f244a);
                if (arrayList == null) {
                    return;
                }
                b.f236d.remove(this.f244a);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).a(gVar);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements Comparator<byte[]> {
        d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            if (bArr.length == bArr2.length) {
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    if (bArr[i3] != bArr2[i3]) {
                        i = bArr[i3];
                        i2 = bArr2[i3];
                    }
                }
                return 0;
            }
            i = bArr.length;
            i2 = bArr2.length;
            return i - i2;
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private final int f245a;

        /* renamed from: b  reason: collision with root package name */
        private final f[] f246b;

        public e(int i, f[] fVarArr) {
            this.f245a = i;
            this.f246b = fVarArr;
        }

        public f[] a() {
            return this.f246b;
        }

        public int b() {
            return this.f245a;
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f247a;

        /* renamed from: b  reason: collision with root package name */
        private final int f248b;

        /* renamed from: c  reason: collision with root package name */
        private final int f249c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f250d;

        /* renamed from: e  reason: collision with root package name */
        private final int f251e;

        public f(Uri uri, int i, int i2, boolean z, int i3) {
            androidx.core.util.g.a(uri);
            this.f247a = uri;
            this.f248b = i;
            this.f249c = i2;
            this.f250d = z;
            this.f251e = i3;
        }

        public int a() {
            return this.f251e;
        }

        public int b() {
            return this.f248b;
        }

        public Uri c() {
            return this.f247a;
        }

        public int d() {
            return this.f249c;
        }

        public boolean e() {
            return this.f250d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        final Typeface f252a;

        /* renamed from: b  reason: collision with root package name */
        final int f253b;

        g(Typeface typeface, int i) {
            this.f252a = typeface;
            this.f253b = i;
        }
    }

    public static e a(Context context, CancellationSignal cancellationSignal, a.g.k.a aVar) {
        ProviderInfo a2 = a(context.getPackageManager(), aVar, context.getResources());
        return a2 == null ? new e(1, null) : new e(0, a(context, aVar, a2.authority, cancellationSignal));
    }

    static g a(Context context, a.g.k.a aVar, int i) {
        try {
            e a2 = a(context, (CancellationSignal) null, aVar);
            int i2 = -3;
            if (a2.b() != 0) {
                if (a2.b() == 1) {
                    i2 = -2;
                }
                return new g(null, i2);
            }
            Typeface a3 = a.g.f.d.a(context, null, a2.a(), i);
            if (a3 != null) {
                i2 = 0;
            }
            return new g(a3, i2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(null, -1);
        }
    }

    public static ProviderInfo a(PackageManager packageManager, a.g.k.a aVar, Resources resources) {
        String d2 = aVar.d();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(d2, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + d2);
        } else if (!resolveContentProvider.packageName.equals(aVar.e())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + d2 + ", but package was not " + aVar.e());
        } else {
            List<byte[]> a2 = a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a2, f237e);
            List<List<byte[]>> a3 = a(aVar, resources);
            for (int i = 0; i < a3.size(); i++) {
                ArrayList arrayList = new ArrayList(a3.get(i));
                Collections.sort(arrayList, f237e);
                if (a(a2, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        }
    }

    public static Typeface a(Context context, a.g.k.a aVar, f.a aVar2, Handler handler, boolean z, int i, int i2) {
        String str = aVar.c() + "-" + i2;
        Typeface b2 = f233a.b(str);
        if (b2 != null) {
            if (aVar2 != null) {
                aVar2.a(b2);
            }
            return b2;
        } else if (z && i == -1) {
            g a2 = a(context, aVar, i2);
            if (aVar2 != null) {
                int i3 = a2.f253b;
                if (i3 == 0) {
                    aVar2.a(a2.f252a, handler);
                } else {
                    aVar2.a(i3, handler);
                }
            }
            return a2.f252a;
        } else {
            a aVar3 = new a(context, aVar, i2, str);
            if (z) {
                try {
                    return ((g) f234b.a(aVar3, i)).f252a;
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            C0008b c0008b = aVar2 == null ? null : new C0008b(aVar2, handler);
            synchronized (f235c) {
                ArrayList<c.d<g>> arrayList = f236d.get(str);
                if (arrayList != null) {
                    if (c0008b != null) {
                        arrayList.add(c0008b);
                    }
                    return null;
                }
                if (c0008b != null) {
                    ArrayList<c.d<g>> arrayList2 = new ArrayList<>();
                    arrayList2.add(c0008b);
                    f236d.put(str, arrayList2);
                }
                f234b.a(aVar3, new c(str));
                return null;
            }
        }
    }

    private static List<List<byte[]>> a(a.g.k.a aVar, Resources resources) {
        return aVar.a() != null ? aVar.a() : a.g.e.f.c.a(resources, aVar.b());
    }

    private static List<byte[]> a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static Map<Uri, ByteBuffer> a(Context context, f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (f fVar : fVarArr) {
            if (fVar.a() == 0) {
                Uri c2 = fVar.c();
                if (!hashMap.containsKey(c2)) {
                    hashMap.put(c2, k.a(context, cancellationSignal, c2));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
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

    static f[] a(Context context, a.g.k.a aVar, String str, CancellationSignal cancellationSignal) {
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            cursor = Build.VERSION.SDK_INT > 16 ? context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.f()}, null, cancellationSignal) : context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.f()}, null);
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
                    arrayList2.add(new f(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                }
                arrayList = arrayList2;
            }
            return (f[]) arrayList.toArray(new f[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
