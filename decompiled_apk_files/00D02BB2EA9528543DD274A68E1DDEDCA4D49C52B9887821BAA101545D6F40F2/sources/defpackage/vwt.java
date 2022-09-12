package defpackage;
/* compiled from: PG */
/* renamed from: vwt  reason: default package */
/* loaded from: classes7.dex */
public abstract class vwt {
    public static vwt d(doyp doypVar) {
        dgaw dgawVar;
        dgaw dgawVar2 = null;
        if ((doypVar.a & 1) != 0) {
            dgawVar = doypVar.b;
            if (dgawVar == null) {
                dgawVar = dgaw.g;
            }
        } else {
            dgawVar = null;
        }
        if ((doypVar.a & 64) != 0 && (dgawVar2 = doypVar.e) == null) {
            dgawVar2 = dgaw.g;
        }
        dpbw b = dpbw.b(doypVar.c);
        if (b == null) {
            b = dpbw.UNKNOWN;
        }
        return new vwp(dgawVar, dgawVar2, b);
    }

    @dzsi
    public abstract dgaw a();

    @dzsi
    public abstract dgaw b();

    public abstract dpbw c();
}
