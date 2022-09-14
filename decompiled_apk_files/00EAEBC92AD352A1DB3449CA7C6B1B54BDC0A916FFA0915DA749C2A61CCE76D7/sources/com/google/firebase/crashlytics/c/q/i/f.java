package com.google.firebase.crashlytics.c.q.i;
/* loaded from: classes.dex */
public class f implements e {

    /* renamed from: a  reason: collision with root package name */
    public final b f9140a;

    /* renamed from: b  reason: collision with root package name */
    public final d f9141b;

    /* renamed from: c  reason: collision with root package name */
    public final c f9142c;

    /* renamed from: d  reason: collision with root package name */
    public final long f9143d;

    public f(long j, b bVar, d dVar, c cVar, int i, int i2) {
        this.f9143d = j;
        this.f9140a = bVar;
        this.f9141b = dVar;
        this.f9142c = cVar;
    }

    @Override // com.google.firebase.crashlytics.c.q.i.e
    public d a() {
        return this.f9141b;
    }

    public boolean a(long j) {
        return this.f9143d < j;
    }

    @Override // com.google.firebase.crashlytics.c.q.i.e
    public c b() {
        return this.f9142c;
    }

    public b c() {
        return this.f9140a;
    }

    public long d() {
        return this.f9143d;
    }
}
