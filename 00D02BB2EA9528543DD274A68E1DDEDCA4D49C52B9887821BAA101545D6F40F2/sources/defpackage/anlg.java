package defpackage;
/* compiled from: PG */
/* renamed from: anlg  reason: default package */
/* loaded from: classes2.dex */
public final class anlg extends anlx {
    private final dvay f;
    private final dqjl g;

    public anlg(dqjl dqjlVar, long j, long j2, eaou eaouVar, eaou eaouVar2, boolean z, long j3, dvay dvayVar) {
        super(j, j2, eaouVar, eaouVar2, z, j3);
        this.f = dvayVar;
        this.g = dqjlVar;
    }

    @Override // defpackage.anlp
    public final boolean a() {
        return false;
    }

    @Override // defpackage.anlp
    public final boolean b() {
        return false;
    }

    @Override // defpackage.dmkh
    @dzsi
    public final String c() {
        return null;
    }

    @Override // defpackage.dmkh
    public final /* bridge */ /* synthetic */ anms d(dbsg<anmq> dbsgVar) {
        anms a = anms.a(this.f, this.a, this.b);
        dqjl dqjlVar = this.g;
        anmr j = a.j();
        j.g = dbsg.i(dqjlVar);
        if (j.a.a() && j.a.b().b == 9) {
            dvay b = j.a.b();
            dsqp dsqpVar = (dsqp) b.cu(5);
            dsqpVar.bC(b);
            dval dvalVar = (dval) dsqpVar;
            dvay b2 = j.a.b();
            dvak dvakVar = b2.b == 9 ? (dvak) b2.c : dvak.e;
            dsqp dsqpVar2 = (dsqp) dvakVar.cu(5);
            dsqpVar2.bC(dvakVar);
            dvaj dvajVar = (dvaj) dsqpVar2;
            if (dvajVar.c) {
                dvajVar.bF();
                dvajVar.c = false;
            }
            dvak dvakVar2 = (dvak) dvajVar.b;
            dvak dvakVar3 = dvak.e;
            dvakVar2.a &= -5;
            dvakVar2.d = 0;
            dvak bK = dvajVar.bK();
            if (dvalVar.c) {
                dvalVar.bF();
                dvalVar.c = false;
            }
            dvay dvayVar = (dvay) dvalVar.b;
            bK.getClass();
            dvayVar.c = bK;
            dvayVar.b = 9;
            j.a = dbsg.i(dvalVar.bK());
        }
        return j.a();
    }
}
