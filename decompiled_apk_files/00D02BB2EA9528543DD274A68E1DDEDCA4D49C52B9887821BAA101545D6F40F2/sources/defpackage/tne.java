package defpackage;
/* compiled from: PG */
/* renamed from: tne  reason: default package */
/* loaded from: classes7.dex */
public final class tne {
    public final vxo a;
    public final ymn b;

    public tne(vxo vxoVar, ymn ymnVar) {
        this.a = vxoVar;
        this.b = ymnVar;
    }

    public final tog a(btlu btluVar) {
        yiv b = this.b.b(btluVar);
        tof h = tog.h();
        h.f(tnj.a(this.a.b(btluVar)));
        h.g(tnj.b(b));
        yiu yiuVar = b.c;
        if (yiuVar == null) {
            yiuVar = yiu.c;
        }
        if ((yiuVar.a & 1) != 0) {
            yiu yiuVar2 = b.c;
            if (yiuVar2 == null) {
                yiuVar2 = yiu.c;
            }
            dqvb b2 = dqvb.b(yiuVar2.b);
            if (b2 == null) {
                b2 = dqvb.TRANSIT_BEST;
            }
            if (b2 == dqvb.TRANSIT_PREFER_ACCESSIBLE) {
                h.i(tob.WHEELCHAIR_ACCESSIBLE, true);
                return h.d();
            }
        }
        h.i(tob.WHEELCHAIR_ACCESSIBLE, false);
        return h.d();
    }
}
