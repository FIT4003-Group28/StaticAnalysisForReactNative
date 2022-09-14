package c.a.a.t.b;

import c.a.a.t.c.a;
import c.a.a.v.k.q;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class t implements c, a.InterfaceC0064a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f2383a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a.InterfaceC0064a> f2384b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final q.a f2385c;

    /* renamed from: d  reason: collision with root package name */
    private final c.a.a.t.c.a<?, Float> f2386d;

    /* renamed from: e  reason: collision with root package name */
    private final c.a.a.t.c.a<?, Float> f2387e;

    /* renamed from: f  reason: collision with root package name */
    private final c.a.a.t.c.a<?, Float> f2388f;

    public t(c.a.a.v.l.a aVar, c.a.a.v.k.q qVar) {
        qVar.b();
        this.f2383a = qVar.f();
        this.f2385c = qVar.e();
        this.f2386d = qVar.d().mo104a();
        this.f2387e = qVar.a().mo104a();
        this.f2388f = qVar.c().mo104a();
        aVar.a(this.f2386d);
        aVar.a(this.f2387e);
        aVar.a(this.f2388f);
        this.f2386d.a(this);
        this.f2387e.a(this);
        this.f2388f.a(this);
    }

    @Override // c.a.a.t.c.a.InterfaceC0064a
    public void a() {
        for (int i = 0; i < this.f2384b.size(); i++) {
            this.f2384b.get(i).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(a.InterfaceC0064a interfaceC0064a) {
        this.f2384b.add(interfaceC0064a);
    }

    @Override // c.a.a.t.b.c
    public void a(List<c> list, List<c> list2) {
    }

    public c.a.a.t.c.a<?, Float> c() {
        return this.f2387e;
    }

    public c.a.a.t.c.a<?, Float> d() {
        return this.f2388f;
    }

    public c.a.a.t.c.a<?, Float> e() {
        return this.f2386d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q.a f() {
        return this.f2385c;
    }

    public boolean g() {
        return this.f2383a;
    }
}
