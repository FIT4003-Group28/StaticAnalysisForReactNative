package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aatm  reason: default package */
/* loaded from: classes.dex */
public final class aatm implements aatn {
    public final aprp a;
    private List b;

    public aatm(aprp aprpVar) {
        aprpVar.getClass();
        this.a = aprpVar;
    }

    @Override // defpackage.aatn
    public final CharSequence a() {
        arag aragVar;
        aprp aprpVar = this.a;
        if ((aprpVar.b & 32) != 0) {
            aragVar = aprpVar.f;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        return ajgl.b(aragVar);
    }

    @Override // defpackage.aatn
    public final CharSequence b() {
        arag aragVar;
        aprp aprpVar = this.a;
        if ((aprpVar.b & 2) != 0) {
            aragVar = aprpVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        return ajgl.b(aragVar);
    }

    @Override // defpackage.aatn
    public final String c() {
        return this.a.g;
    }

    @Override // defpackage.aatn
    public final String d() {
        return this.a.d;
    }

    @Override // defpackage.aatn
    public final List e(aafo aafoVar) {
        if (this.b == null) {
            this.b = new ArrayList();
            for (arag aragVar : this.a.o) {
                this.b.add(aafv.a(aragVar, aafoVar, false));
            }
        }
        return this.b;
    }

    @Override // defpackage.aatn
    public final boolean f() {
        return this.a.h;
    }

    @Override // defpackage.aatn
    public final boolean g() {
        return this.a.e;
    }

    @Override // defpackage.aatn
    public final CharSequence h(int i) {
        int i2 = i - 1;
        arag aragVar = null;
        if (i2 == 0) {
            aprp aprpVar = this.a;
            if ((aprpVar.b & 32768) != 0 && (aragVar = aprpVar.p) == null) {
                aragVar = arag.a;
            }
            return ajgl.b(aragVar);
        } else if (i2 != 1) {
            aprp aprpVar2 = this.a;
            if ((aprpVar2.b & 131072) != 0 && (aragVar = aprpVar2.r) == null) {
                aragVar = arag.a;
            }
            return ajgl.b(aragVar);
        } else {
            aprp aprpVar3 = this.a;
            if ((aprpVar3.b & 65536) != 0 && (aragVar = aprpVar3.q) == null) {
                aragVar = arag.a;
            }
            return ajgl.b(aragVar);
        }
    }

    public final aqrd i() {
        aqre aqreVar = this.a.n;
        if (aqreVar == null) {
            aqreVar = aqre.a;
        }
        aqrd aqrdVar = aqreVar.c;
        return aqrdVar == null ? aqrd.a : aqrdVar;
    }

    public final CharSequence j() {
        arag aragVar;
        aprp aprpVar = this.a;
        if ((aprpVar.b & 1024) != 0) {
            aragVar = aprpVar.j;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        return ajgl.b(aragVar);
    }

    public final boolean k() {
        return this.a.k != 0;
    }

    public final boolean l() {
        aprr aprrVar = this.a.i;
        if (aprrVar == null) {
            aprrVar = aprr.a;
        }
        int H = almu.H(aprrVar.b);
        return H != 0 && H == 3;
    }
}
