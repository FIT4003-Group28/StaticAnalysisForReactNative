package com.facebook.imagepipeline.d;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
/* compiled from: BitmapMemoryCacheKey.java */
/* loaded from: classes.dex */
public class c implements com.facebook.b.a.d {

    /* renamed from: a  reason: collision with root package name */
    private final String f2561a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.e.d f2562b;

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.imagepipeline.e.e f2563c;

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.imagepipeline.e.a f2564d;
    private final com.facebook.b.a.d e;
    private final String f;
    private final int g;
    private final Object h;
    private final long i;

    public c(String str, com.facebook.imagepipeline.e.d dVar, com.facebook.imagepipeline.e.e eVar, com.facebook.imagepipeline.e.a aVar, com.facebook.b.a.d dVar2, String str2, Object obj) {
        this.f2561a = (String) com.facebook.common.d.i.a(str);
        this.f2562b = dVar;
        this.f2563c = eVar;
        this.f2564d = aVar;
        this.e = dVar2;
        this.f = str2;
        this.g = com.facebook.common.l.b.a(Integer.valueOf(str.hashCode()), Integer.valueOf(dVar != null ? dVar.hashCode() : 0), Integer.valueOf(eVar.hashCode()), this.f2564d, this.e, str2);
        this.h = obj;
        this.i = RealtimeSinceBootClock.get().a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.g == cVar.g && this.f2561a.equals(cVar.f2561a) && com.facebook.common.d.h.a(this.f2562b, cVar.f2562b) && com.facebook.common.d.h.a(this.f2563c, cVar.f2563c) && com.facebook.common.d.h.a(this.f2564d, cVar.f2564d) && com.facebook.common.d.h.a(this.e, cVar.e) && com.facebook.common.d.h.a(this.f, cVar.f);
    }

    public int hashCode() {
        return this.g;
    }

    @Override // com.facebook.b.a.d
    public boolean a(Uri uri) {
        return a().contains(uri.toString());
    }

    @Override // com.facebook.b.a.d
    public String a() {
        return this.f2561a;
    }

    public String toString() {
        return String.format(null, "%s_%s_%s_%s_%s_%s_%d", this.f2561a, this.f2562b, this.f2563c, this.f2564d, this.e, this.f, Integer.valueOf(this.g));
    }
}
