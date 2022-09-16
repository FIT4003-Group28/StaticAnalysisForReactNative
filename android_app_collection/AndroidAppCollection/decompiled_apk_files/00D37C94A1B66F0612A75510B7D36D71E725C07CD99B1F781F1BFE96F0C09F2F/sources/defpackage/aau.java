package defpackage;
/* compiled from: PG */
/* renamed from: aau  reason: default package */
/* loaded from: classes.dex */
public final class aau {
    public final agd a = new agd();
    public final agb b = new agb();

    public final xr a(yo yoVar, int i) {
        aat aatVar;
        xr xrVar;
        int c = this.a.c(yoVar);
        if (c >= 0 && (aatVar = (aat) this.a.i(c)) != null) {
            int i2 = aatVar.b;
            if ((i2 & i) != 0) {
                int i3 = (i ^ (-1)) & i2;
                aatVar.b = i3;
                if (i == 4) {
                    xrVar = aatVar.c;
                } else if (i == 8) {
                    xrVar = aatVar.d;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.a.g(c);
                    aat.c(aatVar);
                }
                return xrVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(yo yoVar) {
        aat aatVar = (aat) this.a.get(yoVar);
        if (aatVar == null) {
            aatVar = aat.a();
            this.a.put(yoVar, aatVar);
        }
        aatVar.b |= 1;
    }

    public final void c(long j, yo yoVar) {
        this.b.k(j, yoVar);
    }

    public final void d(yo yoVar, xr xrVar) {
        aat aatVar = (aat) this.a.get(yoVar);
        if (aatVar == null) {
            aatVar = aat.a();
            this.a.put(yoVar, aatVar);
        }
        aatVar.d = xrVar;
        aatVar.b |= 8;
    }

    public final void e(yo yoVar, xr xrVar) {
        aat aatVar = (aat) this.a.get(yoVar);
        if (aatVar == null) {
            aatVar = aat.a();
            this.a.put(yoVar, aatVar);
        }
        aatVar.c = xrVar;
        aatVar.b |= 4;
    }

    public final void f() {
        this.a.clear();
        this.b.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(yo yoVar) {
        aat aatVar = (aat) this.a.get(yoVar);
        if (aatVar == null) {
            return;
        }
        aatVar.b &= -2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(yo yoVar) {
        int c = this.b.c();
        while (true) {
            c--;
            if (c >= 0) {
                if (yoVar == this.b.h(c)) {
                    this.b.m(c);
                    break;
                }
            } else {
                break;
            }
        }
        aat aatVar = (aat) this.a.remove(yoVar);
        if (aatVar != null) {
            aat.c(aatVar);
        }
    }

    public final boolean i(yo yoVar) {
        aat aatVar = (aat) this.a.get(yoVar);
        return (aatVar == null || (aatVar.b & 1) == 0) ? false : true;
    }
}
