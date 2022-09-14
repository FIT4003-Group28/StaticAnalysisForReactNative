package c.e.a.a.i.w;

import c.e.a.a.i.m;
/* loaded from: classes.dex */
final /* synthetic */ class a implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final c f3735b;

    /* renamed from: c  reason: collision with root package name */
    private final m f3736c;

    /* renamed from: d  reason: collision with root package name */
    private final c.e.a.a.h f3737d;

    /* renamed from: e  reason: collision with root package name */
    private final c.e.a.a.i.h f3738e;

    private a(c cVar, m mVar, c.e.a.a.h hVar, c.e.a.a.i.h hVar2) {
        this.f3735b = cVar;
        this.f3736c = mVar;
        this.f3737d = hVar;
        this.f3738e = hVar2;
    }

    public static Runnable a(c cVar, m mVar, c.e.a.a.h hVar, c.e.a.a.i.h hVar2) {
        return new a(cVar, mVar, hVar, hVar2);
    }

    @Override // java.lang.Runnable
    public void run() {
        c.a(this.f3735b, this.f3736c, this.f3737d, this.f3738e);
    }
}
