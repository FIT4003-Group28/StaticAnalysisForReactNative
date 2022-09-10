package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aaad  reason: default package */
/* loaded from: classes2.dex */
public final class aaad implements begq {
    final /* synthetic */ aaae a;
    private final dbsg<ddho> b;

    public aaad(@dzsi aaae aaaeVar, ddho ddhoVar) {
        this.a = aaaeVar;
        this.b = dbsg.j(ddhoVar);
    }

    @Override // defpackage.begq
    public final void a(dwcy dwcyVar) {
        ilo d;
        bvrj.UI_THREAD.c();
        if ((dwcyVar.a & 1) == 0) {
            this.a.b.a();
            ily g = this.a.a.c().g();
            g.c = true;
            d = g.d();
        } else {
            ily ilyVar = new ily();
            dvyw dvywVar = dwcyVar.b;
            if (dvywVar == null) {
                dvywVar = dvyw.bv;
            }
            ilyVar.E(dvywVar);
            ilyVar.g = true;
            ilyVar.n = this.a.a.c().q;
            ilyVar.o = dwcyVar.d;
            ilyVar.v = this.a.a.c().bY().g;
            d = ilyVar.d();
        }
        aaae aaaeVar = this.a;
        if (aaaeVar.d.a(aaaeVar.a.c()) != this.a.d.a(d)) {
            begj begjVar = new begj();
            begjVar.b(d);
            if (this.b.a()) {
                begjVar.l = this.b.b();
            }
            this.a.c.n(begjVar, true, null);
            return;
        }
        this.a.a.d(d);
    }

    @Override // defpackage.begq
    public final void b() {
        this.a.b.a();
    }
}
