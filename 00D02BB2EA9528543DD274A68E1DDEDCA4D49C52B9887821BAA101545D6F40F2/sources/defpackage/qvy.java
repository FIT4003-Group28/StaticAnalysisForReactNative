package defpackage;
/* compiled from: PG */
/* renamed from: qvy  reason: default package */
/* loaded from: classes7.dex */
public final class qvy implements qvz {
    public final qut a;
    public final dcdc<qvx> b;
    private final ros c;

    public qvy(qut qutVar, ros rosVar, dcdc<qvx> dcdcVar) {
        this.a = qutVar;
        this.c = rosVar;
        this.b = dcdcVar;
    }

    public final void a(dndr dndrVar) {
        if (dndrVar == dndr.HOME) {
            this.c.s(dcdc.f(ror.HOME), true, false);
        } else if (dndrVar != dndr.WORK) {
        } else {
            this.c.s(dcdc.f(ror.WORK), true, false);
        }
    }
}
