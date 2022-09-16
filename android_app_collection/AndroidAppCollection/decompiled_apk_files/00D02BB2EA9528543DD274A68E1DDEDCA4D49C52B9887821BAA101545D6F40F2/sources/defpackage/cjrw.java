package defpackage;
/* compiled from: PG */
/* renamed from: cjrw  reason: default package */
/* loaded from: classes.dex */
final class cjrw extends cjtc {
    private final ddhj a;
    private final int b;
    private final bvrt<dddg> c;
    private final bvrt<ddzg> d;
    private final bvrt<ddgy> e;
    private final bvrt<ddet> f;

    public cjrw(ddhj ddhjVar, int i, @dzsi bvrt<dddg> bvrtVar, @dzsi bvrt<ddzg> bvrtVar2, @dzsi bvrt<ddgy> bvrtVar3, @dzsi bvrt<ddet> bvrtVar4) {
        this.a = ddhjVar;
        this.b = i;
        this.c = bvrtVar;
        this.d = bvrtVar2;
        this.e = bvrtVar3;
        this.f = bvrtVar4;
    }

    @Override // defpackage.cjtc
    public final ddhj a() {
        return this.a;
    }

    @Override // defpackage.cjtc
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cjtc
    @dzsi
    public final bvrt<dddg> c() {
        return this.c;
    }

    @Override // defpackage.cjtc
    @dzsi
    public final bvrt<ddzg> d() {
        return this.d;
    }

    @Override // defpackage.cjtc
    @dzsi
    public final bvrt<ddgy> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        bvrt<dddg> bvrtVar;
        bvrt<ddzg> bvrtVar2;
        bvrt<ddgy> bvrtVar3;
        bvrt<ddet> bvrtVar4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjtc) {
            cjtc cjtcVar = (cjtc) obj;
            if (this.a.equals(cjtcVar.a()) && this.b == cjtcVar.b() && ((bvrtVar = this.c) != null ? bvrtVar.equals(cjtcVar.c()) : cjtcVar.c() == null) && ((bvrtVar2 = this.d) != null ? bvrtVar2.equals(cjtcVar.d()) : cjtcVar.d() == null) && ((bvrtVar3 = this.e) != null ? bvrtVar3.equals(cjtcVar.e()) : cjtcVar.e() == null) && ((bvrtVar4 = this.f) != null ? bvrtVar4.equals(cjtcVar.f()) : cjtcVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cjtc
    @dzsi
    public final bvrt<ddet> f() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
        bvrt<dddg> bvrtVar = this.c;
        int i = 0;
        int hashCode2 = (hashCode ^ (bvrtVar == null ? 0 : bvrtVar.hashCode())) * 1000003;
        bvrt<ddzg> bvrtVar2 = this.d;
        int hashCode3 = (hashCode2 ^ (bvrtVar2 == null ? 0 : bvrtVar2.hashCode())) * 1000003;
        bvrt<ddgy> bvrtVar3 = this.e;
        int hashCode4 = (hashCode3 ^ (bvrtVar3 == null ? 0 : bvrtVar3.hashCode())) * 1000003;
        bvrt<ddet> bvrtVar4 = this.f;
        if (bvrtVar4 != null) {
            i = bvrtVar4.hashCode();
        }
        return hashCode4 ^ i;
    }
}
