package c.d.j.n;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class c0 implements j0<c.d.d.h.a<c.d.j.k.b>> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f3397a;

    /* renamed from: b  reason: collision with root package name */
    private final ContentResolver f3398b;

    /* loaded from: classes.dex */
    class a extends q0<c.d.d.h.a<c.d.j.k.b>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ m0 f3399g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f3400h;
        final /* synthetic */ c.d.j.o.c i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar, m0 m0Var, String str, String str2, m0 m0Var2, String str3, c.d.j.o.c cVar) {
            super(kVar, m0Var, str, str2);
            this.f3399g = m0Var2;
            this.f3400h = str3;
            this.i = cVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.d.d.b.e
        public void a(c.d.d.h.a<c.d.j.k.b> aVar) {
            c.d.d.h.a.b(aVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.d.j.n.q0, c.d.d.b.e
        public void a(Exception exc) {
            super.a(exc);
            this.f3399g.a(this.f3400h, "VideoThumbnailProducer", false);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.d.d.b.e
        /* renamed from: b */
        public c.d.d.h.a<c.d.j.k.b> mo147b() {
            String str;
            try {
                str = c0.this.c(this.i);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            Bitmap createVideoThumbnail = str != null ? ThumbnailUtils.createVideoThumbnail(str, c0.b(this.i)) : c0.b(c0.this.f3398b, this.i.p());
            if (createVideoThumbnail == null) {
                return null;
            }
            return c.d.d.h.a.a(new c.d.j.k.c(createVideoThumbnail, c.d.j.c.h.a(), c.d.j.k.f.f3386d, 0));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.d.j.n.q0
        /* renamed from: b */
        public Map<String, String> c(c.d.d.h.a<c.d.j.k.b> aVar) {
            return c.d.d.d.f.a("createdThumbnail", String.valueOf(aVar != null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.d.j.n.q0, c.d.d.b.e
        /* renamed from: c  reason: avoid collision after fix types in other method */
        public void b(c.d.d.h.a<c.d.j.k.b> aVar) {
            super.b((a) aVar);
            this.f3399g.a(this.f3400h, "VideoThumbnailProducer", aVar != null);
        }
    }

    /* loaded from: classes.dex */
    class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q0 f3401a;

        b(c0 c0Var, q0 q0Var) {
            this.f3401a = q0Var;
        }

        @Override // c.d.j.n.l0
        public void a() {
            this.f3401a.a();
        }
    }

    public c0(Executor executor, ContentResolver contentResolver) {
        this.f3397a = executor;
        this.f3398b = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(c.d.j.o.c cVar) {
        return (cVar.h() > 96 || cVar.g() > 96) ? 1 : 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap b(ContentResolver contentResolver, Uri uri) {
        if (Build.VERSION.SDK_INT >= 10) {
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(openFileDescriptor.getFileDescriptor());
                return mediaMetadataRetriever.getFrameAtTime(-1L);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(c.d.j.o.c cVar) {
        Uri uri;
        String str;
        String[] strArr;
        Uri p = cVar.p();
        if (c.d.d.k.f.g(p)) {
            return cVar.o().getPath();
        }
        if (c.d.d.k.f.f(p)) {
            if (Build.VERSION.SDK_INT < 19 || !"com.android.providers.media.documents".equals(p.getAuthority())) {
                uri = p;
                str = null;
                strArr = null;
            } else {
                String documentId = DocumentsContract.getDocumentId(p);
                str = "_id=?";
                uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                strArr = new String[]{documentId.split(":")[1]};
            }
            Cursor query = this.f3398b.query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        return query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    if (query != null) {
                        query.close();
                    }
                }
            }
            if (query != null) {
                query.close();
            }
        }
        return null;
    }

    @Override // c.d.j.n.j0
    public void a(k<c.d.d.h.a<c.d.j.k.b>> kVar, k0 k0Var) {
        m0 e2 = k0Var.e();
        String a2 = k0Var.a();
        a aVar = new a(kVar, e2, "VideoThumbnailProducer", a2, e2, a2, k0Var.f());
        k0Var.a(new b(this, aVar));
        this.f3397a.execute(aVar);
    }
}
