package defpackage;
/* compiled from: PG */
/* renamed from: btza  reason: default package */
/* loaded from: classes4.dex */
public final class btza extends btzv {
    public final int a;
    private final Long b;
    private final Long c;
    private final Long d;
    private final Long e;
    private final Long f;
    private final Long g;
    private final Long h;
    private final Long i;
    private final Long j;

    public btza(@dzsi Long l, @dzsi Long l2, @dzsi Long l3, @dzsi Long l4, @dzsi Long l5, @dzsi Long l6, @dzsi Long l7, @dzsi Long l8, @dzsi Long l9, int i) {
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = l4;
        this.f = l5;
        this.g = l6;
        this.h = l7;
        this.i = l8;
        this.j = l9;
        if (i != 0) {
            this.a = i;
            return;
        }
        throw new NullPointerException("Null rpcState");
    }

    @Override // defpackage.btzv
    @dzsi
    public final Long a() {
        return this.b;
    }

    @Override // defpackage.btzv
    @dzsi
    public final Long b() {
        return this.c;
    }

    @Override // defpackage.btzv
    @dzsi
    public final Long c() {
        return null;
    }

    @Override // defpackage.btzv
    @dzsi
    public final Long d() {
        return null;
    }

    @Override // defpackage.btzv
    @dzsi
    public final Long e() {
        return null;
    }

    public final boolean equals(Object obj) {
        Long l;
        Long l2;
        Long l3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof btzv) {
            btzv btzvVar = (btzv) obj;
            Long l4 = this.b;
            if (l4 != null ? l4.equals(btzvVar.a()) : btzvVar.a() == null) {
                Long l5 = this.c;
                if (l5 != null ? l5.equals(btzvVar.b()) : btzvVar.b() == null) {
                    if (btzvVar.c() == null && btzvVar.d() == null && btzvVar.e() == null && btzvVar.f() == null && btzvVar.g() == null && btzvVar.h() == null && btzvVar.i() == null && btzvVar.j() == null && btzvVar.k() == null && btzvVar.l() == null && btzvVar.m() == null && btzvVar.n() == null && btzvVar.o() == null && btzvVar.p() == null && ((l = this.d) != null ? l.equals(btzvVar.q()) : btzvVar.q() == null) && ((l2 = this.e) != null ? l2.equals(btzvVar.r()) : btzvVar.r() == null) && this.f.equals(btzvVar.s()) && this.g.equals(btzvVar.t()) && this.h.equals(btzvVar.u()) && this.i.equals(btzvVar.v()) && ((l3 = this.j) != null ? l3.equals(btzvVar.w()) : btzvVar.w() == null) && this.a == btzvVar.x()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.btzv
    @dzsi
    public final Long f() {
        return null;
    }

    @Override // defpackage.btzv
    @dzsi
    public final Long g() {
        return null;
    }

    @Override // defpackage.btzv
    @dzsi
    public final Long h() {
        return null;
    }

    public final int hashCode() {
        Long l = this.b;
        int i = 0;
        int hashCode = ((l == null ? 0 : l.hashCode()) ^ 1000003) * 1000003;
        Long l2 = this.c;
        int hashCode2 = (hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1393333803;
        Long l3 = this.d;
        int hashCode3 = (hashCode2 ^ (l3 == null ? 0 : l3.hashCode())) * 1000003;
        Long l4 = this.e;
        int hashCode4 = (((((((((hashCode3 ^ (l4 == null ? 0 : l4.hashCode())) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003;
        Long l5 = this.j;
        if (l5 != null) {
            i = l5.hashCode();
        }
        return ((hashCode4 ^ i) * 1000003) ^ this.a;
    }

    @Override // defpackage.btzv
    @dzsi
    public final Long i() {
        return null;
    }

    @Override // defpackage.btzv
    @dzsi
    public final Long j() {
        return null;
    }

    @Override // defpackage.btzv
    @dzsi
    public final Long k() {
        return null;
    }

    @Override // defpackage.btzv
    @dzsi
    public final Long l() {
        return null;
    }

    @Override // defpackage.btzv
    @dzsi
    public final Long m() {
        return null;
    }

    @Override // defpackage.btzv
    @dzsi
    public final Long n() {
        return null;
    }

    @Override // defpackage.btzv
    @dzsi
    public final Long o() {
        return null;
    }

    @Override // defpackage.btzv
    @dzsi
    public final Long p() {
        return null;
    }

    @Override // defpackage.btzv
    @dzsi
    public final Long q() {
        return this.d;
    }

    @Override // defpackage.btzv
    @dzsi
    public final Long r() {
        return this.e;
    }

    @Override // defpackage.btzv
    @dzsi
    public final Long s() {
        return this.f;
    }

    @Override // defpackage.btzv
    @dzsi
    public final Long t() {
        return this.g;
    }

    @Override // defpackage.btzv
    @dzsi
    public final Long u() {
        return this.h;
    }

    @Override // defpackage.btzv
    @dzsi
    public final Long v() {
        return this.i;
    }

    @Override // defpackage.btzv
    @dzsi
    public final Long w() {
        return this.j;
    }

    @Override // defpackage.btzv
    public final int x() {
        return this.a;
    }
}
