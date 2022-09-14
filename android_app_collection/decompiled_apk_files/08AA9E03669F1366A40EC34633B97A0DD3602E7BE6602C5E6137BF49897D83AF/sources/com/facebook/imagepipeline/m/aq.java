package com.facebook.imagepipeline.m;

import java.util.Map;
/* compiled from: StatefulProducerRunnable.java */
/* loaded from: classes.dex */
public abstract class aq<T> extends com.facebook.common.b.e<T> {

    /* renamed from: b  reason: collision with root package name */
    private final j<T> f2801b;

    /* renamed from: c  reason: collision with root package name */
    private final am f2802c;

    /* renamed from: d  reason: collision with root package name */
    private final String f2803d;
    private final String e;

    protected Map<String, String> b(Exception exc) {
        return null;
    }

    @Override // com.facebook.common.b.e
    protected abstract void b(T t);

    protected Map<String, String> c(T t) {
        return null;
    }

    protected Map<String, String> e() {
        return null;
    }

    public aq(j<T> jVar, am amVar, String str, String str2) {
        this.f2801b = jVar;
        this.f2802c = amVar;
        this.f2803d = str;
        this.e = str2;
        this.f2802c.a(this.e, this.f2803d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.common.b.e
    public void a(T t) {
        this.f2802c.a(this.e, this.f2803d, this.f2802c.b(this.e) ? c(t) : null);
        this.f2801b.b(t, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.common.b.e
    public void a(Exception exc) {
        this.f2802c.a(this.e, this.f2803d, exc, this.f2802c.b(this.e) ? b(exc) : null);
        this.f2801b.b(exc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.common.b.e
    public void b() {
        this.f2802c.b(this.e, this.f2803d, this.f2802c.b(this.e) ? e() : null);
        this.f2801b.b();
    }
}
