package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f6770a;

    /* renamed from: b  reason: collision with root package name */
    private final c.e.a.a.i.w.j.c f6771b;

    /* renamed from: c  reason: collision with root package name */
    private final s f6772c;

    /* renamed from: d  reason: collision with root package name */
    private final c.e.a.a.i.x.b f6773d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(Executor executor, c.e.a.a.i.w.j.c cVar, s sVar, c.e.a.a.i.x.b bVar) {
        this.f6770a = executor;
        this.f6771b = cVar;
        this.f6772c = sVar;
        this.f6773d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object a(q qVar) {
        for (c.e.a.a.i.m mVar : qVar.f6771b.y()) {
            qVar.f6772c.a(mVar, 1);
        }
        return null;
    }

    public void a() {
        this.f6770a.execute(o.a(this));
    }
}
