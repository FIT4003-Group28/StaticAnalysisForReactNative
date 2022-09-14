package c.d.j.n;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class x extends z implements w0<c.d.j.k.d> {

    /* renamed from: d  reason: collision with root package name */
    private static final Class<?> f3606d = x.class;

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f3607e = {"_id", "_data"};

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f3608f = {"_data"};

    /* renamed from: g  reason: collision with root package name */
    private static final Rect f3609g = new Rect(0, 0, 512, 384);

    /* renamed from: h  reason: collision with root package name */
    private static final Rect f3610h = new Rect(0, 0, 96, 96);

    /* renamed from: c  reason: collision with root package name */
    private final ContentResolver f3611c;

    public x(Executor executor, c.d.d.g.h hVar, ContentResolver contentResolver) {
        super(executor, hVar);
        this.f3611c = contentResolver;
    }

    private static int a(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    private c.d.j.k.d a(Uri uri, c.d.j.e.e eVar) {
        c.d.j.k.d a2;
        Cursor query = this.f3611c.query(uri, f3607e, null, null, null);
        if (query == null) {
            return null;
        }
        try {
            if (query.getCount() == 0) {
                return null;
            }
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex("_data"));
            if (eVar == null || (a2 = a(eVar, query.getInt(query.getColumnIndex("_id")))) == null) {
                return null;
            }
            a2.f(b(string));
            return a2;
        } finally {
            query.close();
        }
    }

    private c.d.j.k.d a(c.d.j.e.e eVar, int i) {
        Cursor cursor;
        int b2 = b(eVar);
        if (b2 == 0) {
            return null;
        }
        try {
            cursor = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.f3611c, i, b2, f3608f);
            if (cursor == null) {
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
            try {
                cursor.moveToFirst();
                if (cursor.getCount() > 0) {
                    String string = cursor.getString(cursor.getColumnIndex("_data"));
                    if (new File(string).exists()) {
                        c.d.j.k.d b3 = b(new FileInputStream(string), a(string));
                        if (cursor != null) {
                            cursor.close();
                        }
                        return b3;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } catch (Throwable th) {
                th = th;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    private static int b(c.d.j.e.e eVar) {
        if (x0.a(f3610h.width(), f3610h.height(), eVar)) {
            return 3;
        }
        return x0.a(f3609g.width(), f3609g.height(), eVar) ? 1 : 0;
    }

    private static int b(String str) {
        if (str != null) {
            try {
                return com.facebook.imageutils.c.a(new ExifInterface(str).getAttributeInt("Orientation", 1));
            } catch (IOException e2) {
                c.d.d.e.a.a(f3606d, e2, "Unable to retrieve thumbnail rotation for %s", str);
            }
        }
        return 0;
    }

    @Override // c.d.j.n.z
    protected c.d.j.k.d a(c.d.j.o.c cVar) {
        c.d.j.k.d a2;
        Uri p = cVar.p();
        if (!c.d.d.k.f.d(p) || (a2 = a(p, cVar.l())) == null) {
            return null;
        }
        return a2;
    }

    @Override // c.d.j.n.z
    protected String a() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    @Override // c.d.j.n.w0
    public boolean a(c.d.j.e.e eVar) {
        return x0.a(f3609g.width(), f3609g.height(), eVar);
    }
}
