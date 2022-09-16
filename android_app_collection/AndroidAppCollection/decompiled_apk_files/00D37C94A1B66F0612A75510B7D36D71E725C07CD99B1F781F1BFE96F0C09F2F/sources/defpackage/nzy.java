package defpackage;

import android.graphics.Rect;
import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: nzy  reason: default package */
/* loaded from: classes3.dex */
public final class nzy implements nxi, nxg, oai {
    public final nxh a;
    public nxd c;
    public int d;
    public int e;
    public nwz f;
    public final SparseArray b = new SparseArray();
    private final afy g = new afy();

    public nzy(nxh nxhVar) {
        this.a = nxhVar;
    }

    public static boolean q(float f) {
        return f > 0.0f;
    }

    private static nwz u(nxe nxeVar) {
        if (nxeVar instanceof nwz) {
            return (nwz) nxeVar;
        }
        return new nwz(nxeVar);
    }

    @Override // defpackage.oai
    public final Rect a() {
        return c().t();
    }

    public final int b() {
        return this.a.b;
    }

    public final nxe c() {
        nwz nwzVar = this.f;
        return nwzVar != null ? nwzVar : d(this.a.b);
    }

    public final nxe d(int i) {
        return (nxe) this.b.get(i);
    }

    public final void e(nxd nxdVar) {
        nxdVar.getClass();
        this.g.add(nxdVar);
    }

    @Override // defpackage.nxi
    public final boolean f() {
        return this.a.f();
    }

    @Override // defpackage.nxi
    public final boolean g() {
        throw null;
    }

    public final void h() {
        nxe c = c();
        int i = 0;
        while (true) {
            afy afyVar = this.g;
            if (i < afyVar.b) {
                ((nxd) afyVar.b(i)).ph(c);
                i++;
            } else {
                return;
            }
        }
    }

    public final void i(int i, nxe nxeVar) {
        nwz u = u(nxeVar);
        this.b.put(i, u);
        u.K(this.c);
    }

    public final void j(nxd nxdVar) {
        this.g.remove(nxdVar);
    }

    public final void k(nxe nxeVar) {
        nwz nwzVar = this.f;
        int i = nwz.b;
        if (nxeVar == null && nwzVar == null) {
            return;
        }
        if (nwzVar != null && nxeVar == nwz.b(nwzVar.a)) {
            return;
        }
        if (nxeVar != null) {
            nwz u = u(nxeVar);
            this.f = u;
            u.z(this.d, this.e);
            this.f.K(this.c);
        } else {
            this.f = null;
        }
        h();
    }

    public final boolean l() {
        return this.d > this.e;
    }

    public final boolean m() {
        return q(c().l());
    }

    @Override // defpackage.nxg
    public final void n(int i) {
        h();
    }

    public final boolean o() {
        return q(c().m());
    }

    public final boolean p() {
        return q(c().q());
    }

    public final boolean r() {
        return this.a.c();
    }

    public final boolean s() {
        return this.a.d();
    }

    public final boolean t() {
        return this.a.e();
    }
}
