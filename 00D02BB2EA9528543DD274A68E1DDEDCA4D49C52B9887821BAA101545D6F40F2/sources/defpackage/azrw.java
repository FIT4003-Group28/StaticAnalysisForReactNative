package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: azrw  reason: default package */
/* loaded from: classes3.dex */
public final class azrw implements bxlw {
    private final azrv a;
    private final azsg b;
    private final anee c;

    public azrw(azrv azrvVar, azsg azsgVar, anee aneeVar) {
        this.a = azrvVar;
        this.b = azsgVar;
        this.c = aneeVar;
    }

    @Override // defpackage.bxlw
    public final bxlw a(akqq akqqVar) {
        azru o = this.a.o();
        o.m(akqqVar);
        azrv a = o.a();
        azsg azsgVar = this.b;
        aneb y = this.c.y();
        y.h(akqqVar);
        return new azrw(a, azsgVar, y.a());
    }

    @Override // defpackage.bxlw
    public final bxlw b(String str) {
        azru o = this.a.o();
        o.f(str);
        return new azrw(o.a(), this.b, this.c);
    }

    @Override // defpackage.bxlw
    @dzsi
    public final ggg c() {
        return azsd.g(this.b, this.c);
    }

    @Override // defpackage.bxlw
    @dzsi
    public final ggg d(bxmb bxmbVar) {
        gga aY = bxmbVar.b.aY();
        if (aY == null) {
            return null;
        }
        return azsu.aR(this.a, aY, bxmbVar.e.a());
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azrw)) {
            return false;
        }
        azrw azrwVar = (azrw) obj;
        return dbsd.a(this.a, azrwVar.a) && dbsd.a(this.b, azrwVar.b) && dbsd.a(this.c, azrwVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }
}
