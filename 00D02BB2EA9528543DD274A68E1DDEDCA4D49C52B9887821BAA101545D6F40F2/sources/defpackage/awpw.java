package defpackage;
/* compiled from: PG */
/* renamed from: awpw  reason: default package */
/* loaded from: classes3.dex */
public final class awpw implements alwb {
    public final btrm a;
    private final btvo b;
    private final cqat c;
    private final dxio<alwc> d;
    private final akto e;
    private final awpy f;
    private boolean g = false;
    @dzsi
    private awtn h = null;
    @dzsi
    private akti i = null;

    public awpw(btvo btvoVar, cqat cqatVar, dxio<alwc> dxioVar, btrm btrmVar, akto aktoVar, awpy awpyVar) {
        this.b = btvoVar;
        this.c = cqatVar;
        this.d = dxioVar;
        this.a = btrmVar;
        this.f = awpyVar;
        this.e = aktoVar;
    }

    private final void g(@dzsi awtn awtnVar) {
        if (!this.g) {
            return;
        }
        akti aktiVar = this.i;
        if (aktiVar != null) {
            aktiVar.j();
            this.i = null;
        }
        this.h = awtnVar;
        if (!this.b.getEnableFeatureParameters().V || awtnVar == null) {
            return;
        }
        akti a = this.e.a(this.f.a(awtnVar, this.c.b()), dmti.WORLD_ENCODING_LAT_LNG_E7);
        this.i = a;
        a.Pt(new awpv(this, awtnVar));
    }

    public final synchronized void a() {
        if (this.g) {
            return;
        }
        this.g = true;
        btrm btrmVar = this.a;
        dceq a = dcet.a();
        a.b(btvr.class, new awpx(btvr.class, this));
        btrmVar.g(this, a.a());
        this.d.a().d(this);
    }

    public final synchronized void b() {
        if (!this.g) {
            return;
        }
        this.g = false;
        this.a.a(this);
        this.d.a().e(this);
        this.h = null;
        akti aktiVar = this.i;
        if (aktiVar == null) {
            return;
        }
        aktiVar.j();
        this.i = null;
    }

    public final synchronized void c(@dzsi awtn awtnVar) {
        awtn awtnVar2 = this.h;
        if (awtnVar2 == null || !awtnVar2.equals(awtnVar)) {
            g(awtnVar);
        }
    }

    public final synchronized void d() {
        awtn awtnVar = this.h;
        if (awtnVar != null && awtnVar.o()) {
            g(this.h);
        }
    }

    @Override // defpackage.alwb
    public final synchronized void e(alwa alwaVar) {
        g(this.h);
    }

    public final synchronized void f(btvr btvrVar) {
        boolean z = btvrVar.a.getEnableFeatureParameters().V;
        g(this.h);
    }
}
