package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import c.e.a.a.i.x.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final m f6751a;

    /* renamed from: b  reason: collision with root package name */
    private final c.e.a.a.i.m f6752b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6753c;

    private l(m mVar, c.e.a.a.i.m mVar2, int i) {
        this.f6751a = mVar;
        this.f6752b = mVar2;
        this.f6753c = i;
    }

    public static b.a a(m mVar, c.e.a.a.i.m mVar2, int i) {
        return new l(mVar, mVar2, i);
    }

    @Override // c.e.a.a.i.x.b.a
    public Object execute() {
        return this.f6751a.f6757d.a(this.f6752b, this.f6753c + 1);
    }
}
