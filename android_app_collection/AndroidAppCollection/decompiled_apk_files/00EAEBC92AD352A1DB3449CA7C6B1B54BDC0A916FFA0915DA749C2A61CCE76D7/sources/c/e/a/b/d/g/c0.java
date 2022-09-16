package c.e.a.b.d.g;

import c.e.a.b.d.g.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c0 extends h.a {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ String f4078g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ Object f4079h;
    private final /* synthetic */ h k;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ int f4077f = 5;
    private final /* synthetic */ Object i = null;
    private final /* synthetic */ Object j = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(h hVar, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.k = hVar;
        this.f4078g = str;
        this.f4079h = obj;
    }

    @Override // c.e.a.b.d.g.h.a
    final void a() {
        md mdVar;
        mdVar = this.k.f4180h;
        mdVar.logHealthData(this.f4077f, this.f4078g, c.e.a.b.c.b.a(this.f4079h), c.e.a.b.c.b.a(this.i), c.e.a.b.c.b.a(this.j));
    }
}
