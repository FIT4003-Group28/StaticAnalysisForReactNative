package defpackage;
/* compiled from: PG */
/* renamed from: cgye  reason: default package */
/* loaded from: classes4.dex */
public final class cgye extends bmcn {
    public cgye(dodk dodkVar, bmcp bmcpVar) {
        super(dodkVar, bmcpVar);
    }

    public static cgvt e(dglu dgluVar) {
        if (dgluVar == null) {
            return cgvt.BLANK;
        }
        if (dgluVar.b != 3) {
            return cgvt.NOT_SURE;
        }
        return ((dgkw) dgluVar.c).b ? cgvt.ON : cgvt.OFF;
    }
}
