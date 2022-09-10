package defpackage;
/* compiled from: PG */
/* renamed from: sdr  reason: default package */
/* loaded from: classes7.dex */
final class sdr implements degu<sdv> {
    final /* synthetic */ sds a;

    public sdr(sds sdsVar) {
        this.a = sdsVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        rzr y = this.a.y();
        final sds sdsVar = this.a;
        y.a(new Runnable(sdsVar) { // from class: sdq
            private final sds a;

            {
                this.a = sdsVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.C();
            }
        });
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi sdv sdvVar) {
        sdv sdvVar2 = sdvVar;
        sds sdsVar = this.a;
        dbsk.s(sdvVar2);
        if (!sdsVar.o) {
            sdsVar.o = true;
            dbsk.m(sdsVar.h.a().isEmpty(), "Route leg list must be empty");
            sed sedVar = sdsVar.h;
            sedVar.f();
            try {
                if (sdvVar2.a().equals(sdu.PARK_AND_RIDE)) {
                    int c = sdvVar2.c();
                    if (c == 0) {
                        throw null;
                    }
                    if (c == 1) {
                        sedVar.d(sdsVar.k(false, false));
                    }
                }
                dcdc<dbsg<dopk>> b = sdvVar2.b();
                int size = b.size() / 2;
                int i = 0;
                boolean z = false;
                while (i < size) {
                    sgl u = sdsVar.u(z, i == size + (-1));
                    int i2 = i + i;
                    u.K(b.get(i2).f());
                    u.L(b.get(i2 + 1).f());
                    sedVar.d(u);
                    i++;
                    z = true;
                }
                if (sdvVar2.a().equals(sdu.PARK_AND_RIDE)) {
                    int c2 = sdvVar2.c();
                    if (c2 == 0) {
                        throw null;
                    }
                    if (c2 == 2) {
                        sedVar.d(sdsVar.k(false, false));
                    }
                }
                sedVar.g();
                sdsVar.z();
                sdsVar.L();
            } catch (Throwable th) {
                sedVar.g();
                throw th;
            }
        }
        sds sdsVar2 = this.a;
        sdsVar2.q = false;
        sdsVar2.A(sdsVar2.p);
    }
}
