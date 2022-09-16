package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import c.e.a.a.i.x.b;
/* loaded from: classes.dex */
final /* synthetic */ class p implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final q f6769a;

    private p(q qVar) {
        this.f6769a = qVar;
    }

    public static b.a a(q qVar) {
        return new p(qVar);
    }

    @Override // c.e.a.a.i.x.b.a
    public Object execute() {
        return q.a(this.f6769a);
    }
}
