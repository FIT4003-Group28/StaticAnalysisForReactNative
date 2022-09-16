package defpackage;
/* compiled from: PG */
/* renamed from: djgp  reason: default package */
/* loaded from: classes6.dex */
public final class djgp extends dsqp<djgw, djgp> implements dssk {
    public djgp() {
        super(djgw.d);
    }

    public final void a(djgm djgmVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        djgw djgwVar = (djgw) this.b;
        djgo bK = djgmVar.bK();
        djgw djgwVar2 = djgw.d;
        bK.getClass();
        dsrj<djgo> dsrjVar = djgwVar.b;
        if (!dsrjVar.a()) {
            djgwVar.b = dsqw.cl(dsrjVar);
        }
        djgwVar.b.add(bK);
    }

    public final void b(djgq djgqVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        djgw djgwVar = (djgw) this.b;
        djgs bK = djgqVar.bK();
        djgw djgwVar2 = djgw.d;
        bK.getClass();
        dsrj<djgs> dsrjVar = djgwVar.a;
        if (!dsrjVar.a()) {
            djgwVar.a = dsqw.cl(dsrjVar);
        }
        djgwVar.a.add(bK);
    }
}
