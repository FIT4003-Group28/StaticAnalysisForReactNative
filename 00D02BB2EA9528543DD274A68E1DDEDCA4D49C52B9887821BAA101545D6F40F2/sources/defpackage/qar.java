package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qar  reason: default package */
/* loaded from: classes7.dex */
public final class qar extends qcx {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final dqvj e;
    public final amvh f;
    public final dcdc<amvh> g;
    public final String h;
    public final dspd i;
    public final String j;
    public final dcep<dpjs> k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final qbs o;
    public final boolean p;
    public final bvrt<dwao> q;
    public final dbsg<bvrt<dnqh>> r;
    public final bvrt<duqc> s;
    public final int t;

    public qar(boolean z, boolean z2, boolean z3, int i, boolean z4, @dzsi dqvj dqvjVar, @dzsi amvh amvhVar, dcdc<amvh> dcdcVar, @dzsi String str, @dzsi dspd dspdVar, @dzsi String str2, dcep<dpjs> dcepVar, boolean z5, boolean z6, boolean z7, qbs qbsVar, boolean z8, @dzsi bvrt<dwao> bvrtVar, dbsg<bvrt<dnqh>> dbsgVar, @dzsi bvrt<duqc> bvrtVar2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.t = i;
        this.d = z4;
        this.e = dqvjVar;
        this.f = amvhVar;
        this.g = dcdcVar;
        this.h = str;
        this.i = dspdVar;
        this.j = str2;
        this.k = dcepVar;
        this.l = z5;
        this.m = z6;
        this.n = z7;
        this.o = qbsVar;
        this.p = z8;
        this.q = bvrtVar;
        this.r = dbsgVar;
        this.s = bvrtVar2;
    }

    @Override // defpackage.qcz
    public final boolean b() {
        return this.a;
    }

    @Override // defpackage.qcz
    public final boolean c() {
        return this.b;
    }

    @Override // defpackage.qcz
    public final boolean d() {
        return this.c;
    }

    @Override // defpackage.qcz
    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        dqvj dqvjVar;
        amvh amvhVar;
        String str;
        dspd dspdVar;
        String str2;
        bvrt<dwao> bvrtVar;
        bvrt<duqc> bvrtVar2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qcx) {
            qcx qcxVar = (qcx) obj;
            if (this.a == qcxVar.b() && this.b == qcxVar.c() && this.c == qcxVar.d()) {
                int i = this.t;
                int t = qcxVar.t();
                if (i == 0) {
                    throw null;
                }
                if (i == t && this.d == qcxVar.e() && ((dqvjVar = this.e) != null ? dqvjVar.equals(qcxVar.f()) : qcxVar.f() == null) && ((amvhVar = this.f) != null ? amvhVar.equals(qcxVar.g()) : qcxVar.g() == null) && dchl.m(this.g, qcxVar.h()) && ((str = this.h) != null ? str.equals(qcxVar.i()) : qcxVar.i() == null) && ((dspdVar = this.i) != null ? dspdVar.equals(qcxVar.j()) : qcxVar.j() == null) && ((str2 = this.j) != null ? str2.equals(qcxVar.k()) : qcxVar.k() == null) && this.k.equals(qcxVar.o()) && this.l == qcxVar.l() && this.m == qcxVar.p() && this.n == qcxVar.q() && this.o.equals(qcxVar.m()) && this.p == qcxVar.r() && ((bvrtVar = this.q) != null ? bvrtVar.equals(qcxVar.s()) : qcxVar.s() == null) && this.r.equals(qcxVar.u()) && ((bvrtVar2 = this.s) != null ? bvrtVar2.equals(qcxVar.v()) : qcxVar.v() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.qcx
    @dzsi
    public final dqvj f() {
        return this.e;
    }

    @Override // defpackage.qcx
    @dzsi
    public final amvh g() {
        return this.f;
    }

    @Override // defpackage.qcx
    public final dcdc<amvh> h() {
        return this.g;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        int i3 = true != this.c ? 1237 : 1231;
        int i4 = this.t;
        qcu.b(i4);
        int i5 = (((((i2 ^ i3) * 1000003) ^ i4) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003;
        dqvj dqvjVar = this.e;
        int i6 = 0;
        int hashCode = (i5 ^ (dqvjVar == null ? 0 : dqvjVar.hashCode())) * 1000003;
        amvh amvhVar = this.f;
        int hashCode2 = (((hashCode ^ (amvhVar == null ? 0 : amvhVar.hashCode())) * 1000003) ^ this.g.hashCode()) * 1000003;
        String str = this.h;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        dspd dspdVar = this.i;
        int hashCode4 = (hashCode3 ^ (dspdVar == null ? 0 : dspdVar.hashCode())) * 1000003;
        String str2 = this.j;
        int hashCode5 = (((((((((((hashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.k.hashCode()) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ (true != this.m ? 1237 : 1231)) * 1000003) ^ (true != this.n ? 1237 : 1231)) * 1000003) ^ this.o.hashCode()) * 1000003;
        if (true == this.p) {
            i = 1231;
        }
        int i7 = (hashCode5 ^ i) * 1000003;
        bvrt<dwao> bvrtVar = this.q;
        int hashCode6 = (((i7 ^ (bvrtVar == null ? 0 : bvrtVar.hashCode())) * 1000003) ^ this.r.hashCode()) * 1000003;
        bvrt<duqc> bvrtVar2 = this.s;
        if (bvrtVar2 != null) {
            i6 = bvrtVar2.hashCode();
        }
        return hashCode6 ^ i6;
    }

    @Override // defpackage.qcx
    @dzsi
    @Deprecated
    public final String i() {
        return this.h;
    }

    @Override // defpackage.qcx
    @dzsi
    public final dspd j() {
        return this.i;
    }

    @Override // defpackage.qcx
    @dzsi
    public final String k() {
        return this.j;
    }

    @Override // defpackage.qcx, defpackage.qcz
    public final boolean l() {
        return this.l;
    }

    @Override // defpackage.qcx, defpackage.qcz
    public final qbs m() {
        return this.o;
    }

    @Override // defpackage.qcx
    public final dcep<dpjs> o() {
        return this.k;
    }

    @Override // defpackage.qcx
    public final boolean p() {
        return this.m;
    }

    @Override // defpackage.qcx
    public final boolean q() {
        return this.n;
    }

    @Override // defpackage.qcx
    public final boolean r() {
        return this.p;
    }

    @Override // defpackage.qcx
    @dzsi
    public final bvrt<dwao> s() {
        return this.q;
    }

    @Override // defpackage.qcz
    public final int t() {
        return this.t;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        String a = qcu.a(this.t);
        boolean z4 = this.d;
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.f);
        String valueOf3 = String.valueOf(this.g);
        String str = this.h;
        String valueOf4 = String.valueOf(this.i);
        String str2 = this.j;
        String valueOf5 = String.valueOf(this.k);
        boolean z5 = this.l;
        boolean z6 = this.m;
        boolean z7 = this.n;
        String valueOf6 = String.valueOf(this.o);
        boolean z8 = this.p;
        String valueOf7 = String.valueOf(this.q);
        String valueOf8 = String.valueOf(this.r);
        String valueOf9 = String.valueOf(this.s);
        int length = a.length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(str).length();
        int length6 = String.valueOf(valueOf4).length();
        int length7 = String.valueOf(str2).length();
        int length8 = String.valueOf(valueOf5).length();
        int length9 = String.valueOf(valueOf6).length();
        int length10 = String.valueOf(valueOf7).length();
        StringBuilder sb = new StringBuilder(length + 488 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + String.valueOf(valueOf8).length() + String.valueOf(valueOf9).length());
        sb.append("Standard{showShareTripDialog=");
        sb.append(z);
        sb.append(", maySearch=");
        sb.append(z2);
        sb.append(", isMultimodalLeg=");
        sb.append(z3);
        sb.append(", promoType=");
        sb.append(a);
        sb.append(", skipRouteSelection=");
        sb.append(z4);
        sb.append(", travelMode=");
        sb.append(valueOf);
        sb.append(", startPoint=");
        sb.append(valueOf2);
        sb.append(", destinations=");
        sb.append(valueOf3);
        sb.append(", preferredTransitPattern=");
        sb.append(str);
        sb.append(", preferredTransitPatternToken=");
        sb.append(valueOf4);
        sb.append(", savedTripId=");
        sb.append(str2);
        sb.append(", entityTypesThatHaveTriggeredAliasSettingFlow=");
        sb.append(valueOf5);
        sb.append(", replaceTopmostDirectionsFragment=");
        sb.append(z5);
        sb.append(", popDirectionsOnNavExit=");
        sb.append(z6);
        sb.append(", show2wPromo=");
        sb.append(z7);
        sb.append(", resultViewMode=");
        sb.append(valueOf6);
        sb.append(", shouldShowMoreRoutesLink=");
        sb.append(z8);
        sb.append(", serializableOptions=");
        sb.append(valueOf7);
        sb.append(", serializableLoggingParams=");
        sb.append(valueOf8);
        sb.append(", serializableClientDetails=");
        sb.append(valueOf9);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.qcx
    public final dbsg<bvrt<dnqh>> u() {
        return this.r;
    }

    @Override // defpackage.qcx
    @dzsi
    public final bvrt<duqc> v() {
        return this.s;
    }

    @Override // defpackage.qcx
    public final qcw w() {
        return new qaq(this);
    }
}
