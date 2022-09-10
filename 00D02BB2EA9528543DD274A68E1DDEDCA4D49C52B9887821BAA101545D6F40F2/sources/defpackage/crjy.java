package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: crjy  reason: default package */
/* loaded from: classes5.dex */
public final class crjy implements crgy {
    public final dxio<ahjq> a;
    public final crlr b;
    public final dccf<crkv, crjv> c = dccf.a();
    private final btrm d;
    private final jzv e;
    private final crle f;
    private final crlp g;
    private final crnz h;

    public crjy(btrm btrmVar, dxio<ahjq> dxioVar, jzv jzvVar, crlr crlrVar, crle crleVar, crlp crlpVar, crnz crnzVar) {
        this.d = btrmVar;
        this.a = dxioVar;
        this.e = jzvVar;
        this.b = crlrVar;
        this.f = crleVar;
        this.g = crlpVar;
        this.h = crnzVar;
    }

    @Override // defpackage.crgy
    public final void a(crgz crgzVar) {
        btrm btrmVar = this.d;
        dceq a = dcet.a();
        a.b(crjr.class, new crjz(0, crjr.class, this, bvrj.NAVIGATION_INTERNAL));
        a.b(crkf.class, new crjz(1, crkf.class, this, bvrj.NAVIGATION_INTERNAL));
        btrmVar.g(this, a.a());
    }

    @Override // defpackage.crgy
    public final void b(boolean z) {
        this.d.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(crjv crjvVar, crjr crjrVar, GmmLocation gmmLocation) {
        bvrj.NAVIGATION_INTERNAL.c();
        this.d.b(new crmp());
        this.c.put(this.f.a(gmmLocation, crjrVar.a, crjrVar.b, crjrVar.c, this.g.c(), ((mwo) this.e).a, this.h.f(true)), crjvVar);
    }
}
