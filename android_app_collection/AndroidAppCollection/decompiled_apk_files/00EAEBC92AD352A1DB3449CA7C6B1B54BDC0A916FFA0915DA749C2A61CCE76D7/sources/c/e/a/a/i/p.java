package c.e.a.a.i;

import c.e.a.a.i.l;
/* loaded from: classes.dex */
final class p<T> implements c.e.a.a.f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final m f3720a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3721b;

    /* renamed from: c  reason: collision with root package name */
    private final c.e.a.a.b f3722c;

    /* renamed from: d  reason: collision with root package name */
    private final c.e.a.a.e<T, byte[]> f3723d;

    /* renamed from: e  reason: collision with root package name */
    private final q f3724e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(m mVar, String str, c.e.a.a.b bVar, c.e.a.a.e<T, byte[]> eVar, q qVar) {
        this.f3720a = mVar;
        this.f3721b = str;
        this.f3722c = bVar;
        this.f3723d = eVar;
        this.f3724e = qVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(Exception exc) {
    }

    @Override // c.e.a.a.f
    public void a(c.e.a.a.c<T> cVar) {
        a(cVar, o.a());
    }

    @Override // c.e.a.a.f
    public void a(c.e.a.a.c<T> cVar, c.e.a.a.h hVar) {
        q qVar = this.f3724e;
        l.a g2 = l.g();
        g2.a(this.f3720a);
        g2.a((c.e.a.a.c<?>) cVar);
        g2.a(this.f3721b);
        g2.a((c.e.a.a.e<?, byte[]>) this.f3723d);
        g2.a(this.f3722c);
        qVar.a(g2.a(), hVar);
    }
}
