package c.d.h.a.a.i.i;

import c.d.h.a.a.i.g;
import c.d.h.a.a.i.h;
/* loaded from: classes.dex */
public class b implements c.d.h.a.a.i.b {

    /* renamed from: a  reason: collision with root package name */
    private final h f2953a;

    /* renamed from: b  reason: collision with root package name */
    private final g f2954b;

    public b(h hVar, g gVar) {
        this.f2953a = hVar;
        this.f2954b = gVar;
    }

    @Override // c.d.h.a.a.i.b
    public void a(String str, int i, boolean z, String str2) {
        this.f2953a.b(i);
        this.f2953a.c(str2);
        this.f2954b.b(this.f2953a, 1);
    }
}
