package c.e.a.b.d.g;

import c.e.a.b.d.g.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f0 extends h.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ boolean f4143f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ h f4144g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h hVar, boolean z) {
        super(hVar);
        this.f4144g = hVar;
        this.f4143f = z;
    }

    @Override // c.e.a.b.d.g.h.a
    final void a() {
        md mdVar;
        mdVar = this.f4144g.f4180h;
        mdVar.setDataCollectionEnabled(this.f4143f);
    }
}
