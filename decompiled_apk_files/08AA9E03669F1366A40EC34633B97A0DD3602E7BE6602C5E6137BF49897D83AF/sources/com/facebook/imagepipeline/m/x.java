package com.facebook.imagepipeline.m;

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
/* compiled from: LocalContentUriThumbnailFetchProducer.java */
/* loaded from: classes.dex */
public class x extends z implements aw<com.facebook.imagepipeline.i.d> {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f2913a = x.class;

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f2914b = {"_id", "_data"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f2915c = {"_data"};

    /* renamed from: d  reason: collision with root package name */
    private static final Rect f2916d = new Rect(0, 0, 512, 384);
    private static final Rect e = new Rect(0, 0, 96, 96);
    private final ContentResolver f;

    @Override // com.facebook.imagepipeline.m.z
    protected String a() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    public x(Executor executor, com.facebook.common.g.h hVar, ContentResolver contentResolver) {
        super(executor, hVar);
        this.f = contentResolver;
    }

    @Override // com.facebook.imagepipeline.m.aw
    public boolean a(com.facebook.imagepipeline.e.d dVar) {
        return ax.a(f2916d.width(), f2916d.height(), dVar);
    }

    @Override // com.facebook.imagepipeline.m.z
    protected com.facebook.imagepipeline.i.d a(com.facebook.imagepipeline.n.b bVar) {
        com.facebook.imagepipeline.i.d a2;
        Uri b2 = bVar.b();
        if (!com.facebook.common.l.f.e(b2) || (a2 = a(b2, bVar.g())) == null) {
            return null;
        }
        return a2;
    }

    private com.facebook.imagepipeline.i.d a(Uri uri, com.facebook.imagepipeline.e.d dVar) {
        com.facebook.imagepipeline.i.d a2;
        Cursor query = this.f.query(uri, f2914b, null, null, null);
        if (query == null) {
            return null;
        }
        try {
            if (query.getCount() == 0) {
                return null;
            }
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex("_data"));
            if (dVar == null || (a2 = a(dVar, query.getInt(query.getColumnIndex("_id")))) == null) {
                return null;
            }
            a2.c(b(string));
            return a2;
        } finally {
            query.close();
        }
    }

    private com.facebook.imagepipeline.i.d a(com.facebook.imagepipeline.e.d dVar, int i) {
        Cursor cursor;
        int b2 = b(dVar);
        if (b2 == 0) {
            return null;
        }
        try {
            cursor = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.f, i, b2, f2915c);
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
                        com.facebook.imagepipeline.i.d b3 = b(new FileInputStream(string), a(string));
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

    private static int b(com.facebook.imagepipeline.e.d dVar) {
        if (ax.a(e.width(), e.height(), dVar)) {
            return 3;
        }
        return ax.a(f2916d.width(), f2916d.height(), dVar) ? 1 : 0;
    }

    private static int a(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    private static int b(String str) {
        if (str != null) {
            try {
                return com.facebook.i.b.a(new ExifInterface(str).getAttributeInt("Orientation", 1));
            } catch (IOException e2) {
                com.facebook.common.e.a.b(f2913a, e2, "Unable to retrieve thumbnail rotation for %s", str);
            }
        }
        return 0;
    }
}
