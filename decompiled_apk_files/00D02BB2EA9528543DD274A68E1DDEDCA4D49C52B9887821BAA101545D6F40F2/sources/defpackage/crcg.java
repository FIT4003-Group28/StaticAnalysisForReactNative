package defpackage;
/* compiled from: PG */
/* renamed from: crcg  reason: default package */
/* loaded from: classes5.dex */
public final class crcg extends crbc {
    public final crbc[] a;

    public crcg(crbc[] crbcVarArr) {
        this.a = crbcVarArr;
    }

    @Override // defpackage.crbc
    public final boolean a() {
        for (crbc crbcVar : this.a) {
            if (!crbcVar.a()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.crbc
    public final void b(crbb crbbVar) {
        new crcf(this, crbbVar).c();
    }

    @Override // defpackage.crbc
    public final void c() {
        for (crbc crbcVar : this.a) {
            crbcVar.c();
        }
    }

    @Override // defpackage.crbc
    public final long d() {
        crbc[] crbcVarArr;
        if (f() == 4) {
            return -1L;
        }
        long j = 0;
        for (crbc crbcVar : this.a) {
            if (crbcVar.d() != -1) {
                j += crbcVar.d();
            }
        }
        return j;
    }

    @Override // defpackage.crbc
    public final void e(cres cresVar) {
        for (crbc crbcVar : this.a) {
            crbcVar.e(cresVar);
        }
    }

    @Override // defpackage.crbc
    public final int f() {
        crbc[] crbcVarArr;
        for (crbc crbcVar : this.a) {
            if (crbcVar.f() != 4) {
                return crbcVar.f();
            }
        }
        return 4;
    }
}
