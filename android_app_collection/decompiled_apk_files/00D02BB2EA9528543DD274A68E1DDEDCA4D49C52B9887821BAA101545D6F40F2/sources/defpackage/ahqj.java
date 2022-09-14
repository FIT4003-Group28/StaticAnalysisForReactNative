package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: ahqj  reason: default package */
/* loaded from: classes2.dex */
public final class ahqj extends ahqe {
    private final akra b;
    private final double c;
    private final double d;

    public ahqj(long j, akra akraVar, double d, double d2) {
        super(j);
        this.b = akraVar;
        this.c = d;
        this.d = d2;
    }

    @Override // defpackage.ahqe
    public final boolean a() {
        return true;
    }

    @Override // defpackage.ahqe
    public final akra b() {
        return this.b;
    }

    @Override // defpackage.ahqe
    public final void c(ahqb ahqbVar) {
        ahqbVar.f(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.ahqe
    public final void d(ddrh ddrhVar) {
        if (ddrhVar.c) {
            ddrhVar.bF();
            ddrhVar.c = false;
        }
        ddri ddriVar = (ddri) ddrhVar.b;
        ddri ddriVar2 = ddri.r;
        ddriVar.a |= 4096;
        ddriVar.l = false;
        int round = (int) Math.round(this.c);
        if (ddrhVar.c) {
            ddrhVar.bF();
            ddrhVar.c = false;
        }
        ddri ddriVar3 = (ddri) ddrhVar.b;
        ddriVar3.a |= 1;
        ddriVar3.b = round;
    }

    @Override // defpackage.ahqe
    public final String toString() {
        dbsb b = dbsc.b(this);
        b.a(super.toString());
        b.a(String.format(Locale.US, "[%s], %.1fm", this.b.T(), Double.valueOf(this.c)));
        return b.toString();
    }
}
