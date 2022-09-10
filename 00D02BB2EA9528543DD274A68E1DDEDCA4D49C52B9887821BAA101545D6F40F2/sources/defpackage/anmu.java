package defpackage;
/* compiled from: PG */
/* renamed from: anmu  reason: default package */
/* loaded from: classes2.dex */
public final class anmu extends anlx {
    private static final dcqe f = dcqe.c("anmu");
    private final dvyw g;
    private final boolean h;
    private final dbsg<dvay> i;

    public anmu(dbsg<dvay> dbsgVar, dvyw dvywVar, long j, long j2, eaou eaouVar, eaou eaouVar2, long j3, boolean z, boolean z2) {
        super(j, j2, eaouVar, eaouVar2, z2, j3);
        this.i = dbsgVar;
        this.g = dvywVar;
        this.h = z;
    }

    @Override // defpackage.anlp
    public final boolean a() {
        return true;
    }

    @Override // defpackage.anlp
    public final boolean b() {
        return false;
    }

    @Override // defpackage.dmkh
    @dzsi
    public final String c() {
        dvyw dvywVar = this.g;
        if ((dvywVar.a & 4) != 0) {
            return dvywVar.g;
        }
        bvoo.h("Place without feature ID.", new Object[0]);
        return null;
    }

    @Override // defpackage.dmkh
    public final /* bridge */ /* synthetic */ anms d(dbsg<anmq> dbsgVar) {
        anmr b;
        dbsg dbsgVar2;
        anmq b2;
        if (this.i.a()) {
            anms a = anms.a(this.i.b(), this.a, this.b);
            dbsgVar2 = a.j;
            b = a.j();
            b.f = this.c;
        } else {
            b = anms.b(this.a, this.b, this.c);
            dbsgVar2 = dbpy.a;
        }
        b.b = this.d;
        b.c = this.e;
        b.f = this.c;
        b.c();
        if (!dbsgVar.a()) {
            b2 = anmq.j(this.g);
        } else {
            b2 = dbsgVar.b();
            if (dbsgVar2.a()) {
                anmq anmqVar = (anmq) dbsgVar2.b();
                if (b2.e() == anmqVar.e() && b2.c().equals(anmqVar.c())) {
                    b2 = anmqVar;
                }
            }
        }
        b.b(this.h ? b2.i() : b2.h());
        return b.a();
    }
}
