package com.facebook.imagepipeline.m;

import android.content.ContentResolver;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Pair;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: LocalExifThumbnailProducer.java */
/* loaded from: classes.dex */
public class y implements aw<com.facebook.imagepipeline.i.d> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f2917a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.common.g.h f2918b;

    /* renamed from: c  reason: collision with root package name */
    private final ContentResolver f2919c;

    public y(Executor executor, com.facebook.common.g.h hVar, ContentResolver contentResolver) {
        this.f2917a = executor;
        this.f2918b = hVar;
        this.f2919c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.m.aw
    public boolean a(com.facebook.imagepipeline.e.d dVar) {
        return ax.a(512, 512, dVar);
    }

    @Override // com.facebook.imagepipeline.m.aj
    public void a(j<com.facebook.imagepipeline.i.d> jVar, ak akVar) {
        am c2 = akVar.c();
        String b2 = akVar.b();
        final com.facebook.imagepipeline.n.b a2 = akVar.a();
        final aq<com.facebook.imagepipeline.i.d> aqVar = new aq<com.facebook.imagepipeline.i.d>(jVar, c2, "LocalExifThumbnailProducer", b2) { // from class: com.facebook.imagepipeline.m.y.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.common.b.e
            /* renamed from: d */
            public com.facebook.imagepipeline.i.d c() {
                ExifInterface a3 = y.this.a(a2.b());
                if (a3 == null || !a3.hasThumbnail()) {
                    return null;
                }
                return y.this.a(y.this.f2918b.a(a3.getThumbnail()), a3);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.m.aq, com.facebook.common.b.e
            /* renamed from: a */
            public void b(com.facebook.imagepipeline.i.d dVar) {
                com.facebook.imagepipeline.i.d.d(dVar);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.m.aq
            /* renamed from: b */
            public Map<String, String> c(com.facebook.imagepipeline.i.d dVar) {
                return com.facebook.common.d.f.a("createdThumbnail", Boolean.toString(dVar != null));
            }
        };
        akVar.a(new e() { // from class: com.facebook.imagepipeline.m.y.2
            @Override // com.facebook.imagepipeline.m.e, com.facebook.imagepipeline.m.al
            public void a() {
                aqVar.a();
            }
        });
        this.f2917a.execute(aqVar);
    }

    ExifInterface a(Uri uri) {
        String a2 = com.facebook.common.l.f.a(this.f2919c, uri);
        if (a(a2)) {
            return new ExifInterface(a2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.facebook.imagepipeline.i.d a(com.facebook.common.g.g gVar, ExifInterface exifInterface) {
        Pair<Integer, Integer> a2 = com.facebook.i.a.a(new com.facebook.common.g.i(gVar));
        int a3 = a(exifInterface);
        int i = -1;
        int intValue = a2 != null ? ((Integer) a2.first).intValue() : -1;
        if (a2 != null) {
            i = ((Integer) a2.second).intValue();
        }
        com.facebook.common.h.a a4 = com.facebook.common.h.a.a(gVar);
        try {
            com.facebook.imagepipeline.i.d dVar = new com.facebook.imagepipeline.i.d(a4);
            com.facebook.common.h.a.c(a4);
            dVar.a(com.facebook.h.b.f2509a);
            dVar.c(a3);
            dVar.b(intValue);
            dVar.a(i);
            return dVar;
        } catch (Throwable th) {
            com.facebook.common.h.a.c(a4);
            throw th;
        }
    }

    private int a(ExifInterface exifInterface) {
        return com.facebook.i.b.a(Integer.parseInt(exifInterface.getAttribute("Orientation")));
    }

    boolean a(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.canRead();
    }
}
