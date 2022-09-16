package c.e.a.b.d.g;

import c.e.a.b.d.g.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r extends h.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ long f4379f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ h f4380g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(h hVar, long j) {
        super(hVar);
        this.f4380g = hVar;
        this.f4379f = j;
    }

    @Override // c.e.a.b.d.g.h.a
    final void a() {
        md mdVar;
        mdVar = this.f4380g.f4180h;
        mdVar.setSessionTimeoutDuration(this.f4379f);
    }
}
