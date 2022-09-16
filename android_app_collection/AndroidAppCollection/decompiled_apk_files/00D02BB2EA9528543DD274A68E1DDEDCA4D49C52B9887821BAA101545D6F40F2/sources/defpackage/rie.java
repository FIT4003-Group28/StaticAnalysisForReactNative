package defpackage;
/* compiled from: PG */
/* renamed from: rie  reason: default package */
/* loaded from: classes7.dex */
public final class rie {
    public final dnks a;
    public dcdc<rid> b;

    public rie(dnks dnksVar) {
        this.b = dcbg.b(dnksVar.a).s(ria.a).z();
        dnkp ca = dnks.b.ca(dnksVar);
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        ((dnks) ca.b).a = dnks.ck();
        this.a = ca.bK();
    }

    public final rid a() {
        rid ridVar = new rid(dnkr.c);
        dccx F = dcdc.F();
        F.i(this.b);
        F.g(ridVar);
        this.b = F.f();
        return ridVar;
    }
}
