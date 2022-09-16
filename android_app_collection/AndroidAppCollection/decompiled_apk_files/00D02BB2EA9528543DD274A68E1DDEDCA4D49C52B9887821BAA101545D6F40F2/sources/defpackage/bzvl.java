package defpackage;
/* compiled from: PG */
/* renamed from: bzvl  reason: default package */
/* loaded from: classes4.dex */
public final class bzvl implements auhr {
    private final btvo a;
    private final cqat b;
    private final dxio<akfa> c;
    private final dxio<ausy> d;
    private final bzvk e;
    private final caxn f;

    public bzvl(btvo btvoVar, cqat cqatVar, dxio<akfa> dxioVar, dxio<ausy> dxioVar2, bzvk bzvkVar, caxn caxnVar) {
        this.a = btvoVar;
        this.b = cqatVar;
        this.c = dxioVar;
        this.d = dxioVar2;
        this.e = bzvkVar;
        this.f = caxnVar;
    }

    @Override // defpackage.auhr
    public final void a(auof auofVar, pau pauVar, pas pasVar, dlfv dlfvVar) {
        dliv dlivVar;
        dlgn dlgnVar = dlfvVar.g;
        if (dlgnVar == null) {
            dlgnVar = dlgn.G;
        }
        String str = dlgnVar.B;
        dkvn dkvnVar = this.a.getNotificationsParameters().n;
        if (dkvnVar == null) {
            dkvnVar = dkvn.e;
        }
        if (!dkvnVar.c || dbsj.d(str) || dlgnVar.c != 24 || !this.f.a(caxa.REVIEW)) {
            return;
        }
        dlgn dlgnVar2 = dlfvVar.g;
        if (dlgnVar2 == null) {
            dlgnVar2 = dlgn.G;
        }
        if (dlgnVar2.c == 24) {
            dlivVar = (dliv) dlgnVar2.d;
        } else {
            dlivVar = dliv.h;
        }
        long b = this.b.b();
        String str2 = pauVar.b;
        String t = btlu.q(this.c.a().n(str2)).t();
        ausy a = this.d.a();
        bzum bzumVar = new bzum();
        bzumVar.h = false;
        bzumVar.b(false);
        bzumVar.i = false;
        bzumVar.d(dpyv.REVIEW_AT_A_PLACE.dm);
        bzumVar.e(false);
        bzumVar.a = Long.valueOf(b);
        String str3 = dlivVar.b;
        if (str3 != null) {
            bzumVar.b = str3;
            String str4 = dlivVar.c;
            if (str4 != null) {
                bzumVar.c = str4;
                bzumVar.d = dbsg.j(str2);
                bzumVar.e = dbsg.j(t);
                bzumVar.j = dbsg.i(pasVar.bS());
                bzumVar.k = dbsg.i(dlfvVar.bS());
                bzumVar.e(dlivVar.f);
                if (a.c(dlfvVar) == dpyv.SERVICE_RECOMMENDATION_POST_INTERACTION.dm) {
                    bzumVar.d(dpyv.SERVICE_RECOMMENDATION_POST_INTERACTION.dm);
                }
                String str5 = dlivVar.d;
                if (!dbsj.d(str5)) {
                    bzumVar.f = dbsg.i(str5);
                }
                if ((dlivVar.a & 8) != 0) {
                    dliu dliuVar = dlivVar.e;
                    if (dliuVar == null) {
                        dliuVar = dliu.d;
                    }
                    bzvs d = bzvt.d();
                    if ((dliuVar.a & 1) != 0) {
                        ((bzuq) d).a = dbsg.i(Integer.valueOf(dliuVar.b));
                    }
                    if ((dliuVar.a & 2) != 0) {
                        ((bzuq) d).b = dbsg.i(dliuVar.c);
                    }
                    bzumVar.g = dbsg.i(d.c());
                }
                this.e.b(auofVar, bzumVar.f());
                return;
            }
            throw new NullPointerException("Null placeName");
        }
        throw new NullPointerException("Null featureIdString");
    }
}
