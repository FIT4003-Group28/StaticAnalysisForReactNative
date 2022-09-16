package defpackage;
/* compiled from: PG */
/* renamed from: pra  reason: default package */
/* loaded from: classes4.dex */
public final class pra implements pqj {
    private final asu a;
    private axs b;
    private int c;
    private pqz d;

    public pra(asu asuVar) {
        this(asuVar, new azb());
    }

    public final prb a(pjc pjcVar) {
        ptx.a(pjcVar.b);
        pjb pjbVar = pjcVar.b;
        Object obj = pjbVar.h;
        String str = pjbVar.f;
        asu asuVar = this.a;
        pqz pqzVar = this.d;
        ptx.a(pjbVar);
        piz pizVar = pjcVar.b.c;
        return new prb(pjcVar, asuVar, pqzVar, pnp.j, this.b, this.c);
    }

    public pra(asu asuVar, azi aziVar) {
        pqz pqzVar = new pqz(aziVar);
        this.a = asuVar;
        this.d = pqzVar;
        this.b = new axl();
        this.c = 1048576;
    }
}
