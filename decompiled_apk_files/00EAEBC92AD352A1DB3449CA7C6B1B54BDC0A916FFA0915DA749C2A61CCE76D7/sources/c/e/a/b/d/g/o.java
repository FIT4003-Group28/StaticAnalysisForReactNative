package c.e.a.b.d.g;

import c.e.a.b.d.g.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o extends h.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f4318f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ h f4319g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(h hVar, String str) {
        super(hVar);
        this.f4319g = hVar;
        this.f4318f = str;
    }

    @Override // c.e.a.b.d.g.h.a
    final void a() {
        md mdVar;
        mdVar = this.f4319g.f4180h;
        mdVar.setUserId(this.f4318f, this.f4181b);
    }
}
