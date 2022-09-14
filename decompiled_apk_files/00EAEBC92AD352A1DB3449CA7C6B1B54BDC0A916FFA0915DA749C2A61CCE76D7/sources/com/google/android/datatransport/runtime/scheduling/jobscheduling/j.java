package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import c.e.a.a.i.x.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final m f6745a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.android.datatransport.runtime.backends.g f6746b;

    /* renamed from: c  reason: collision with root package name */
    private final Iterable f6747c;

    /* renamed from: d  reason: collision with root package name */
    private final c.e.a.a.i.m f6748d;

    /* renamed from: e  reason: collision with root package name */
    private final int f6749e;

    private j(m mVar, com.google.android.datatransport.runtime.backends.g gVar, Iterable iterable, c.e.a.a.i.m mVar2, int i) {
        this.f6745a = mVar;
        this.f6746b = gVar;
        this.f6747c = iterable;
        this.f6748d = mVar2;
        this.f6749e = i;
    }

    public static b.a a(m mVar, com.google.android.datatransport.runtime.backends.g gVar, Iterable iterable, c.e.a.a.i.m mVar2, int i) {
        return new j(mVar, gVar, iterable, mVar2, i);
    }

    @Override // c.e.a.a.i.x.b.a
    public Object execute() {
        return m.a(this.f6745a, this.f6746b, this.f6747c, this.f6748d, this.f6749e);
    }
}
