package defpackage;
/* compiled from: PG */
/* renamed from: dnsm  reason: default package */
/* loaded from: classes6.dex */
public final class dnsm extends dsqp<dnta, dnsm> implements dssk {
    public dnsm() {
        super(dnta.f);
    }

    public final void a(dnsu dnsuVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dnta dntaVar = (dnta) this.b;
        dnsx bK = dnsuVar.bK();
        dnta dntaVar2 = dnta.f;
        bK.getClass();
        dsrj<dnsx> dsrjVar = dntaVar.c;
        if (!dsrjVar.a()) {
            dntaVar.c = dsqw.cl(dsrjVar);
        }
        dntaVar.c.add(bK);
    }

    public final void b(dnsy dnsyVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dnta dntaVar = (dnta) this.b;
        dnsz bK = dnsyVar.bK();
        dnta dntaVar2 = dnta.f;
        bK.getClass();
        dsrj<dnsz> dsrjVar = dntaVar.b;
        if (!dsrjVar.a()) {
            dntaVar.b = dsqw.cl(dsrjVar);
        }
        dntaVar.b.add(bK);
    }
}
