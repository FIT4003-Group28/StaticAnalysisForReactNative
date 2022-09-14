package c.e.a.b.d.g;

import c.e.a.b.d.g.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h0 extends h.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f4187f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ String f4188g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ Object f4189h;
    private final /* synthetic */ boolean i;
    private final /* synthetic */ h j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(h hVar, String str, String str2, Object obj, boolean z) {
        super(hVar);
        this.j = hVar;
        this.f4187f = str;
        this.f4188g = str2;
        this.f4189h = obj;
        this.i = z;
    }

    @Override // c.e.a.b.d.g.h.a
    final void a() {
        md mdVar;
        mdVar = this.j.f4180h;
        mdVar.setUserProperty(this.f4187f, this.f4188g, c.e.a.b.c.b.a(this.f4189h), this.i, this.f4181b);
    }
}
