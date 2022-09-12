package defpackage;
/* compiled from: PG */
/* renamed from: azwn  reason: default package */
/* loaded from: classes3.dex */
public final class azwn extends azwh<azwo> {
    public final dpzm a;

    public azwn(awtn awtnVar) {
        super(azwm.h, azwm.i);
        dpzj bZ = dpzm.j.bZ();
        long k = awtnVar.k();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpzm dpzmVar = (dpzm) bZ.b;
        dpzmVar.a |= 2;
        dpzmVar.c = k;
        long a = awtnVar.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpzm dpzmVar2 = (dpzm) bZ.b;
        dpzmVar2.a |= 4;
        dpzmVar2.d = a;
        long b = awtnVar.b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpzm dpzmVar3 = (dpzm) bZ.b;
        dpzmVar3.a |= 16;
        dpzmVar3.f = b;
        long d = awtnVar.d();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpzm dpzmVar4 = (dpzm) bZ.b;
        dpzmVar4.a |= 8;
        dpzmVar4.e = d;
        dpum h = awtnVar.c().h();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpzm dpzmVar5 = (dpzm) bZ.b;
        h.getClass();
        dpzmVar5.b = h;
        dpzmVar5.a |= 1;
        int j = awtnVar.j();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpzm dpzmVar6 = (dpzm) bZ.b;
        int i = j - 1;
        if (j != 0) {
            dpzmVar6.i = i;
            dpzmVar6.a |= 128;
            String e = awtnVar.e();
            if (!dbsj.d(e)) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dpzm dpzmVar7 = (dpzm) bZ.b;
                e.getClass();
                dpzmVar7.a |= 32;
                dpzmVar7.g = e;
            }
            String f = awtnVar.f();
            if (!dbsj.d(f)) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dpzm dpzmVar8 = (dpzm) bZ.b;
                f.getClass();
                dpzmVar8.a |= 64;
                dpzmVar8.h = f;
            }
            dpzm bK = bZ.bK();
            c(bK);
            this.a = bK;
            return;
        }
        throw null;
    }

    private final void c(dpzm dpzmVar) {
        String l = (dpzmVar.a & 2) != 0 ? Long.toString(dpzmVar.c) : "Auto-generate a ClientId, please!";
        this.d = l;
        this.g = l;
    }

    @Override // defpackage.azwh
    /* renamed from: a */
    public final azwo b() {
        return new azwo(this);
    }

    public azwn(azwo azwoVar) {
        super(azwoVar);
        this.a = azwoVar.g();
    }

    public azwn(dpzm dpzmVar) {
        super(azwm.h, azwm.i);
        c(dpzmVar);
        this.a = dpzmVar;
    }
}
