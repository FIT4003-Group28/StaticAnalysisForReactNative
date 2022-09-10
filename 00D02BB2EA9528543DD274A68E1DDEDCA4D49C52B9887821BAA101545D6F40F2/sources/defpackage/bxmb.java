package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bxmb  reason: default package */
/* loaded from: classes4.dex */
public final class bxmb {
    public final bxlx b;
    public bxlw c;
    public final bxly d;
    public final dxio<bwqv> e;
    public boolean a = false;
    public int f = 1;

    public bxmb(bxlx bxlxVar, dxio<bwqv> dxioVar) {
        this.b = bxlxVar;
        bxlw bxlwVar = (bxlw) bxlxVar.C().getSerializable("ParentFragment_factory");
        dbsk.s(bxlwVar);
        this.c = bxlwVar;
        bxly bxlyVar = (bxly) bxlxVar.C().getSerializable("ParentFragment_parameters");
        dbsk.s(bxlyVar);
        this.d = bxlyVar;
        this.e = dxioVar;
    }

    public final void a(bxlw bxlwVar) {
        this.c = bxlwVar;
        this.b.C().putSerializable("ParentFragment_factory", bxlwVar);
    }

    public final boolean b() {
        gn R = this.b.R();
        List<fd> q = R.q();
        int i = 2;
        if (this.f == 2) {
            i = 3;
        }
        fd H = R.H(bxlv.a(i));
        if (H == null) {
            return false;
        }
        int i2 = this.f;
        String a = bxlv.a(i2);
        if (i2 == 0) {
            throw null;
        }
        if (R.H(a) == null) {
            return false;
        }
        q.remove(H);
        gz b = R.b();
        for (fd fdVar : q) {
            b.u(fdVar);
        }
        b.A(H);
        b.s(H);
        b.f();
        this.f = i;
        return true;
    }

    public final void c(int i) {
        ggg c;
        dbsk.l(i != 1);
        if (i == this.f) {
            return;
        }
        gn R = this.b.R();
        int i2 = this.f;
        String a = bxlv.a(i2);
        if (i2 != 0) {
            fd H = R.H(a);
            String a2 = bxlv.a(i);
            if (i != 0) {
                fd H2 = R.H(a2);
                gz b = R.b();
                if (H2 != null) {
                    b.u(H2);
                }
                bxlw bxlwVar = this.c;
                int i3 = i - 1;
                if (i3 == 1) {
                    c = bxlwVar.c();
                } else if (i3 != 2) {
                    throw new RuntimeException("Invalid create mode.");
                } else {
                    c = bxlwVar.d(this);
                }
                if (c == null) {
                    return;
                }
                fd Ny = c.Ny();
                b.y(Ny, bxlv.a(i));
                b.s(Ny);
                if (H != null) {
                    b.t(H);
                }
                b.f();
                this.f = i;
                return;
            }
            throw null;
        }
        throw null;
    }
}
