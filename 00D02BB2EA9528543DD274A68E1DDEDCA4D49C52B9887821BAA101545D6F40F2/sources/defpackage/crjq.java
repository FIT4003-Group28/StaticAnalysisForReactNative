package defpackage;

import defpackage.crqy;
/* compiled from: PG */
/* renamed from: crjq  reason: default package */
/* loaded from: classes5.dex */
public abstract class crjq<T extends crqy> implements crfp {
    private final crlb a;
    public final btrm h;

    public crjq(crlb crlbVar, btrm btrmVar) {
        this.a = crlbVar;
        this.h = btrmVar;
    }

    protected abstract void a();

    protected abstract T b();

    @Override // defpackage.crfp
    public final void c() {
        if (b().g == 1) {
            a();
        }
        this.a.e(b());
    }

    public final void e() {
        b().g = 3;
        this.h.b(new crht(b()));
    }

    public final void f() {
        b().g = 2;
        this.h.b(new crht(b()));
    }
}
