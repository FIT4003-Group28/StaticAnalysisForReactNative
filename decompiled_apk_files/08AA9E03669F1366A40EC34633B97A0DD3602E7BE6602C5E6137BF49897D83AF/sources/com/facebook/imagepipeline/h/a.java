package com.facebook.imagepipeline.h;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.i.g;
import java.io.InputStream;
import java.util.Map;
/* compiled from: DefaultImageDecoder.java */
/* loaded from: classes.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.a.a.d f2690a;

    /* renamed from: b  reason: collision with root package name */
    private final Bitmap.Config f2691b;

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.imagepipeline.k.e f2692c;

    /* renamed from: d  reason: collision with root package name */
    private final b f2693d;
    private final Map<com.facebook.h.c, b> e;

    public a(com.facebook.imagepipeline.a.a.d dVar, com.facebook.imagepipeline.k.e eVar, Bitmap.Config config) {
        this(dVar, eVar, config, null);
    }

    public a(com.facebook.imagepipeline.a.a.d dVar, com.facebook.imagepipeline.k.e eVar, Bitmap.Config config, Map<com.facebook.h.c, b> map) {
        this.f2693d = new b() { // from class: com.facebook.imagepipeline.h.a.1
            @Override // com.facebook.imagepipeline.h.b
            public com.facebook.imagepipeline.i.b a(com.facebook.imagepipeline.i.d dVar2, int i, g gVar, com.facebook.imagepipeline.e.a aVar) {
                com.facebook.h.c e = dVar2.e();
                if (e == com.facebook.h.b.f2509a) {
                    return a.this.b(dVar2, i, gVar, aVar);
                }
                if (e == com.facebook.h.b.f2511c) {
                    return a.this.a(dVar2, aVar);
                }
                if (e == com.facebook.h.b.i) {
                    return a.this.c(dVar2, aVar);
                }
                if (e == com.facebook.h.c.f2513a) {
                    throw new IllegalArgumentException("unknown image format");
                }
                return a.this.b(dVar2, aVar);
            }
        };
        this.f2690a = dVar;
        this.f2691b = config;
        this.f2692c = eVar;
        this.e = map;
    }

    @Override // com.facebook.imagepipeline.h.b
    public com.facebook.imagepipeline.i.b a(com.facebook.imagepipeline.i.d dVar, int i, g gVar, com.facebook.imagepipeline.e.a aVar) {
        b bVar;
        if (aVar.g != null) {
            return aVar.g.a(dVar, i, gVar, aVar);
        }
        com.facebook.h.c e = dVar.e();
        if (e == null || e == com.facebook.h.c.f2513a) {
            e = com.facebook.h.d.c(dVar.d());
            dVar.a(e);
        }
        if (this.e != null && (bVar = this.e.get(e)) != null) {
            return bVar.a(dVar, i, gVar, aVar);
        }
        return this.f2693d.a(dVar, i, gVar, aVar);
    }

    public com.facebook.imagepipeline.i.b a(com.facebook.imagepipeline.i.d dVar, com.facebook.imagepipeline.e.a aVar) {
        InputStream d2 = dVar.d();
        if (d2 == null) {
            return null;
        }
        try {
            if (!aVar.e && this.f2690a != null) {
                return this.f2690a.a(dVar, aVar, this.f2691b);
            }
            return b(dVar, aVar);
        } finally {
            com.facebook.common.d.b.a(d2);
        }
    }

    public com.facebook.imagepipeline.i.c b(com.facebook.imagepipeline.i.d dVar, com.facebook.imagepipeline.e.a aVar) {
        com.facebook.common.h.a<Bitmap> a2 = this.f2692c.a(dVar, aVar.f);
        try {
            return new com.facebook.imagepipeline.i.c(a2, com.facebook.imagepipeline.i.f.f2710a, dVar.f());
        } finally {
            a2.close();
        }
    }

    public com.facebook.imagepipeline.i.c b(com.facebook.imagepipeline.i.d dVar, int i, g gVar, com.facebook.imagepipeline.e.a aVar) {
        com.facebook.common.h.a<Bitmap> a2 = this.f2692c.a(dVar, aVar.f, i);
        try {
            return new com.facebook.imagepipeline.i.c(a2, gVar, dVar.f());
        } finally {
            a2.close();
        }
    }

    public com.facebook.imagepipeline.i.b c(com.facebook.imagepipeline.i.d dVar, com.facebook.imagepipeline.e.a aVar) {
        return this.f2690a.b(dVar, aVar, this.f2691b);
    }
}
