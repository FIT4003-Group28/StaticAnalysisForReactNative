package com.google.android.datatransport.runtime.backends;

import android.content.Context;
/* loaded from: classes.dex */
final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6693a;

    /* renamed from: b  reason: collision with root package name */
    private final c.e.a.a.i.y.a f6694b;

    /* renamed from: c  reason: collision with root package name */
    private final c.e.a.a.i.y.a f6695c;

    /* renamed from: d  reason: collision with root package name */
    private final String f6696d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, c.e.a.a.i.y.a aVar, c.e.a.a.i.y.a aVar2, String str) {
        if (context != null) {
            this.f6693a = context;
            if (aVar == null) {
                throw new NullPointerException("Null wallClock");
            }
            this.f6694b = aVar;
            if (aVar2 == null) {
                throw new NullPointerException("Null monotonicClock");
            }
            this.f6695c = aVar2;
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f6696d = str;
            return;
        }
        throw new NullPointerException("Null applicationContext");
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public Context a() {
        return this.f6693a;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public String b() {
        return this.f6696d;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public c.e.a.a.i.y.a c() {
        return this.f6695c;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public c.e.a.a.i.y.a d() {
        return this.f6694b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f6693a.equals(hVar.a()) && this.f6694b.equals(hVar.d()) && this.f6695c.equals(hVar.c()) && this.f6696d.equals(hVar.b());
    }

    public int hashCode() {
        return ((((((this.f6693a.hashCode() ^ 1000003) * 1000003) ^ this.f6694b.hashCode()) * 1000003) ^ this.f6695c.hashCode()) * 1000003) ^ this.f6696d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f6693a + ", wallClock=" + this.f6694b + ", monotonicClock=" + this.f6695c + ", backendName=" + this.f6696d + "}";
    }
}
