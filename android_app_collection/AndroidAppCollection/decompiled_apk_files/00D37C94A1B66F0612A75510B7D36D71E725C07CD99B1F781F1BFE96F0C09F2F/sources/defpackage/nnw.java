package defpackage;
/* compiled from: PG */
/* renamed from: nnw  reason: default package */
/* loaded from: classes3.dex */
public final class nnw {
    private final nsd a;

    public nnw(nml nmlVar) {
        this.a = nmlVar.h().a;
    }

    public final zar a(nmc nmcVar) {
        aqvq l = nmcVar.l();
        if (l == null || (l.c & 64) == 0) {
            return this.a.b(nmcVar);
        }
        aqvn aqvnVar = l.i;
        if (aqvnVar == null) {
            aqvnVar = aqvn.a;
        }
        int x = amnt.x(aqvnVar.c);
        if (x == 0) {
            x = 1;
        }
        if (x - 1 != 2) {
            return this.a.b(nmcVar);
        }
        return new nsc(this.a, true, nmcVar);
    }
}
