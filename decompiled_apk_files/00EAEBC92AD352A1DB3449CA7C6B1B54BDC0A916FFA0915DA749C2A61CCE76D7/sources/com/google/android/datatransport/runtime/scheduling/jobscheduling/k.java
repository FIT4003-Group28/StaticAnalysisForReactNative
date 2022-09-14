package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import c.e.a.a.i.x.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final c.e.a.a.i.w.j.c f6750a;

    private k(c.e.a.a.i.w.j.c cVar) {
        this.f6750a = cVar;
    }

    public static b.a a(c.e.a.a.i.w.j.c cVar) {
        return new k(cVar);
    }

    @Override // c.e.a.a.i.x.b.a
    public Object execute() {
        return Integer.valueOf(this.f6750a.x());
    }
}
