package defpackage;
/* compiled from: PG */
/* renamed from: bdvu  reason: default package */
/* loaded from: classes3.dex */
public final class bdvu {
    final /* synthetic */ bgej a;
    final /* synthetic */ begr b;
    final /* synthetic */ ilo c;

    public bdvu(bgej bgejVar, begr begrVar, ilo iloVar) {
        this.a = bgejVar;
        this.b = begrVar;
        this.c = iloVar;
    }

    public final void a(@dzsi dvzl dvzlVar, @dzsi bttq bttqVar, boolean z, boolean z2) {
        if (dvzlVar != null && bttqVar == null) {
            bttqVar = this.a.c(dvzlVar);
            if (bttqVar == null) {
                ilo iloVar = this.a.b;
                dbsk.s(iloVar);
                ily g = iloVar.g();
                g.e = !z;
                g.J = z2;
                this.b.a(this.a, g.d());
            }
        } else if (dvzlVar == null) {
            bttqVar = bttq.REQUEST_TIMEOUT;
        }
        if (bttqVar == null || z) {
            return;
        }
        ily g2 = this.c.g();
        g2.e = true;
        this.b.b(this.a, g2.d(), bttqVar);
    }
}
