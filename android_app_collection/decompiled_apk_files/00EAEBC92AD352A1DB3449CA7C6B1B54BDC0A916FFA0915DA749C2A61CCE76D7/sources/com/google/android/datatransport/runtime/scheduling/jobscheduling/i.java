package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import c.e.a.a.i.x.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final m f6743a;

    /* renamed from: b  reason: collision with root package name */
    private final c.e.a.a.i.m f6744b;

    private i(m mVar, c.e.a.a.i.m mVar2) {
        this.f6743a = mVar;
        this.f6744b = mVar2;
    }

    public static b.a a(m mVar, c.e.a.a.i.m mVar2) {
        return new i(mVar, mVar2);
    }

    @Override // c.e.a.a.i.x.b.a
    public Object execute() {
        Iterable a2;
        a2 = this.f6743a.f6756c.a(this.f6744b);
        return a2;
    }
}
