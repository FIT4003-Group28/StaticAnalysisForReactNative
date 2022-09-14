package c.d.j.n;

import android.content.ContentResolver;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class y implements w0<c.d.j.k.d> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f3612a;

    /* renamed from: b  reason: collision with root package name */
    private final c.d.d.g.h f3613b;

    /* renamed from: c  reason: collision with root package name */
    private final ContentResolver f3614c;

    /* loaded from: classes.dex */
    class a extends q0<c.d.j.k.d> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c.d.j.o.c f3615g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar, m0 m0Var, String str, String str2, c.d.j.o.c cVar) {
            super(kVar, m0Var, str, str2);
            this.f3615g = cVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.d.d.b.e
        public void a(c.d.j.k.d dVar) {
            c.d.j.k.d.c(dVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.d.d.b.e
        /* renamed from: b */
        public c.d.j.k.d mo147b() {
            ExifInterface a2 = y.this.a(this.f3615g.p());
            if (a2 == null || !a2.hasThumbnail()) {
                return null;
            }
            return y.this.a(y.this.f3613b.mo190a(a2.getThumbnail()), a2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.d.j.n.q0
        /* renamed from: b */
        public Map<String, String> c(c.d.j.k.d dVar) {
            return c.d.d.d.f.a("createdThumbnail", Boolean.toString(dVar != null));
        }
    }

    /* loaded from: classes.dex */
    class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q0 f3617a;

        b(y yVar, q0 q0Var) {
            this.f3617a = q0Var;
        }

        @Override // c.d.j.n.l0
        public void a() {
            this.f3617a.a();
        }
    }

    public y(Executor executor, c.d.d.g.h hVar, ContentResolver contentResolver) {
        this.f3612a = executor;
        this.f3613b = hVar;
        this.f3614c = contentResolver;
    }

    private int a(ExifInterface exifInterface) {
        return com.facebook.imageutils.c.a(Integer.parseInt(exifInterface.getAttribute("Orientation")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c.d.j.k.d a(c.d.d.g.g gVar, ExifInterface exifInterface) {
        Pair<Integer, Integer> a2 = com.facebook.imageutils.a.a(new c.d.d.g.i(gVar));
        int a3 = a(exifInterface);
        int i = -1;
        int intValue = a2 != null ? ((Integer) a2.first).intValue() : -1;
        if (a2 != null) {
            i = ((Integer) a2.second).intValue();
        }
        c.d.d.h.a a4 = c.d.d.h.a.a(gVar);
        try {
            c.d.j.k.d dVar = new c.d.j.k.d(a4);
            c.d.d.h.a.b(a4);
            dVar.a(c.d.i.b.f3144a);
            dVar.f(a3);
            dVar.h(intValue);
            dVar.e(i);
            return dVar;
        } catch (Throwable th) {
            c.d.d.h.a.b(a4);
            throw th;
        }
    }

    ExifInterface a(Uri uri) {
        String a2 = c.d.d.k.f.a(this.f3614c, uri);
        try {
            if (!a(a2)) {
                return null;
            }
            return new ExifInterface(a2);
        } catch (IOException unused) {
            return null;
        } catch (StackOverflowError unused2) {
            c.d.d.e.a.a(y.class, "StackOverflowError in ExifInterface constructor");
            return null;
        }
    }

    @Override // c.d.j.n.j0
    public void a(k<c.d.j.k.d> kVar, k0 k0Var) {
        a aVar = new a(kVar, k0Var.e(), "LocalExifThumbnailProducer", k0Var.a(), k0Var.f());
        k0Var.a(new b(this, aVar));
        this.f3612a.execute(aVar);
    }

    @Override // c.d.j.n.w0
    public boolean a(c.d.j.e.e eVar) {
        return x0.a(512, 512, eVar);
    }

    boolean a(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.canRead();
    }
}
