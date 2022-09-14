package c.d.h.a.a;

import android.content.res.Resources;
import c.d.d.d.l;
import c.d.j.d.p;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private Resources f2923a;

    /* renamed from: b  reason: collision with root package name */
    private c.d.h.b.a f2924b;

    /* renamed from: c  reason: collision with root package name */
    private c.d.j.j.a f2925c;

    /* renamed from: d  reason: collision with root package name */
    private Executor f2926d;

    /* renamed from: e  reason: collision with root package name */
    private p<c.d.b.a.d, c.d.j.k.b> f2927e;

    /* renamed from: f  reason: collision with root package name */
    private c.d.d.d.e<c.d.j.j.a> f2928f;

    /* renamed from: g  reason: collision with root package name */
    private l<Boolean> f2929g;

    public d a() {
        d a2 = a(this.f2923a, this.f2924b, this.f2925c, this.f2926d, this.f2927e, this.f2928f);
        l<Boolean> lVar = this.f2929g;
        if (lVar != null) {
            a2.b(lVar.mo139get().booleanValue());
        }
        return a2;
    }

    protected d a(Resources resources, c.d.h.b.a aVar, c.d.j.j.a aVar2, Executor executor, p<c.d.b.a.d, c.d.j.k.b> pVar, c.d.d.d.e<c.d.j.j.a> eVar) {
        return new d(resources, aVar, aVar2, executor, pVar, eVar);
    }

    public void a(Resources resources, c.d.h.b.a aVar, c.d.j.j.a aVar2, Executor executor, p<c.d.b.a.d, c.d.j.k.b> pVar, c.d.d.d.e<c.d.j.j.a> eVar, l<Boolean> lVar) {
        this.f2923a = resources;
        this.f2924b = aVar;
        this.f2925c = aVar2;
        this.f2926d = executor;
        this.f2927e = pVar;
        this.f2928f = eVar;
        this.f2929g = lVar;
    }
}
