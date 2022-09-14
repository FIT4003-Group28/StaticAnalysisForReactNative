package defpackage;

import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: lnh  reason: default package */
/* loaded from: classes7.dex */
public final class lnh implements btph {
    public final akfa a;
    public final dxio<cjnx> b;
    public final dxio<ahwc> c;
    @dzsi
    public int d;
    private final btvo e;
    private final btpc f;
    private final ckco g;

    public lnh(akfa akfaVar, btvo btvoVar, btpc btpcVar, ckcw ckcwVar, dxio<cjnx> dxioVar, dxio<ahwc> dxioVar2) {
        this.a = akfaVar;
        this.e = btvoVar;
        this.f = btpcVar;
        this.b = dxioVar;
        this.c = dxioVar2;
        this.g = (ckco) ckcwVar.a(ckee.z);
    }

    private final void b(int i) {
        if (i != this.d) {
            this.g.a(i - 1);
            this.d = i;
        }
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    public final boolean a() {
        if (this.e.getCarParameters().d) {
            if (!this.f.i()) {
                b(8);
                return false;
            }
            btlu j = this.a.j();
            if (btlu.p(j)) {
                b(3);
                return false;
            } else if (btlu.n(j)) {
                b(9);
                return false;
            } else if (j == null || j.u()) {
                if (j == null || this.c.a().a(j) == 2) {
                    if (!this.b.a().m()) {
                        b(6);
                        return false;
                    }
                    b(1);
                    return true;
                }
                b(5);
                return false;
            } else {
                b(4);
                return false;
            }
        }
        b(2);
        return false;
    }
}
