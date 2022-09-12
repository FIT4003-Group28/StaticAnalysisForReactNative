package defpackage;
/* compiled from: PG */
/* renamed from: apit  reason: default package */
/* loaded from: classes2.dex */
final class apit implements Runnable {
    final /* synthetic */ angs a;
    final /* synthetic */ apiu b;

    public apit(apiu apiuVar, angs angsVar) {
        this.b = apiuVar;
        this.a = angsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dvat dvatVar;
        angs angsVar = this.a;
        dbsg<dvay> dbsgVar = dbpy.a;
        dbsg<dvyw> dbsgVar2 = dbpy.a;
        if (angsVar.e()) {
            dcdc<dvay> b = ((aoge) angsVar.f()).b();
            if (!b.isEmpty()) {
                dbsgVar = dbsg.i((dvay) dcft.s(b));
            }
        }
        boolean z = false;
        if (dbsgVar.a()) {
            dvay b2 = dbsgVar.b();
            if (b2.b == 7 && b2.r) {
                dvas dvasVar = ((dvat) b2.c).b.get(0);
                dvyw dvywVar = dvasVar.b;
                if (dvywVar == null) {
                    dvywVar = dvyw.bv;
                }
                dsqp dsqpVar = (dsqp) dvywVar.cu(5);
                dsqpVar.bC(dvywVar);
                dvya dvyaVar = (dvya) dsqpVar;
                String str = dvasVar.c;
                if (dvyaVar.c) {
                    dvyaVar.bF();
                    dvyaVar.c = false;
                }
                dvyw dvywVar2 = (dvyw) dvyaVar.b;
                str.getClass();
                dvywVar2.a |= 16;
                dvywVar2.i = str;
                dbsgVar2 = dbsg.i(dvyaVar.bK());
                if (b2.b == 7) {
                    dvatVar = (dvat) b2.c;
                } else {
                    dvatVar = dvat.g;
                }
                duzt duztVar = dvatVar.c;
                if (duztVar == null) {
                    duztVar = duzt.c;
                }
                if ((duztVar.a & 1) != 0) {
                    z = true;
                }
            }
        }
        apiv e = apiw.e();
        aphz aphzVar = (aphz) e;
        aphzVar.a = dbsgVar;
        aphzVar.b = dbsgVar2;
        e.b(z);
        e.c(true);
        e.a();
        cqkx.p(this.b.a);
    }
}
