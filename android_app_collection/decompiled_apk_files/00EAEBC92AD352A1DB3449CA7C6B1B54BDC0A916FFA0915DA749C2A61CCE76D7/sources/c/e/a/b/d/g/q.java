package c.e.a.b.d.g;

import c.e.a.b.d.g.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q extends h.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ boolean f4365f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ h f4366g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(h hVar, boolean z) {
        super(hVar);
        this.f4366g = hVar;
        this.f4365f = z;
    }

    @Override // c.e.a.b.d.g.h.a
    final void a() {
        md mdVar;
        mdVar = this.f4366g.f4180h;
        mdVar.setMeasurementEnabled(this.f4365f, this.f4181b);
    }
}
