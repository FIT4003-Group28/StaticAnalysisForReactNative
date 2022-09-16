package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: blyi  reason: default package */
/* loaded from: classes3.dex */
public final class blyi {
    final /* synthetic */ blyj a;

    public blyi(blyj blyjVar) {
        this.a = blyjVar;
    }

    public final void a(beud beudVar) {
        blyj blyjVar = this.a;
        if (!blyjVar.ar() || !beudVar.a.equals(blyjVar.f.c().ai())) {
            return;
        }
        blyjVar.g.f();
        blyjVar.aq();
        cqkx.p(blyjVar);
        if (!blyjVar.ab().booleanValue()) {
            return;
        }
        blyjVar.j = 4;
    }

    public final void b(bqje bqjeVar) {
        blyj blyjVar = this.a;
        ilo c = blyjVar.f.c();
        ilo c2 = bqjeVar.a.c();
        if (!blyjVar.ar() || c == null || c2 == null || !c.ai().equals(c2.ai())) {
            return;
        }
        int i = bqjeVar.c;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            blyjVar.a = false;
            blyjVar.g.c(true);
        } else if (i2 == 1) {
            blyjVar.g.c(false);
        }
        blyjVar.aq();
        if (blyjVar.ab().booleanValue()) {
            blyjVar.j = 3;
        }
        blyjVar.aj();
        cqkx.p(blyjVar);
    }

    public final void c() {
        blyj blyjVar = this.a;
        if (!blyjVar.ar() || blyjVar.h.a().getUgcParameters().E() || blyjVar.ae().booleanValue()) {
            return;
        }
        blyjVar.g.b();
        blyjVar.aq();
        if (blyjVar.ab().booleanValue()) {
            blyjVar.j = 5;
        }
        blyjVar.aj();
        cqkx.p(blyjVar);
    }
}
