package defpackage;
/* compiled from: PG */
/* renamed from: alvh  reason: default package */
/* loaded from: classes.dex */
class alvh extends alyl {
    public final dfpo a;
    public final akqi b;
    public final dxdm c;
    public final dniu d;
    public final dniu e;
    public final dnbh f;
    public final dcdc<Integer> g;
    public final dmxh h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;
    public final String m;
    public final drkg n;

    public alvh(@dzsi dfpo dfpoVar, @dzsi akqi akqiVar, @dzsi dxdm dxdmVar, @dzsi dniu dniuVar, @dzsi dniu dniuVar2, @dzsi dnbh dnbhVar, dcdc<Integer> dcdcVar, @dzsi dmxh dmxhVar, @dzsi String str, @dzsi String str2, String str3, boolean z, @dzsi String str4, @dzsi drkg drkgVar) {
        this.a = dfpoVar;
        this.b = akqiVar;
        this.c = dxdmVar;
        this.d = dniuVar;
        this.e = dniuVar2;
        this.f = dnbhVar;
        if (dcdcVar != null) {
            this.g = dcdcVar;
            this.h = dmxhVar;
            this.i = str;
            this.j = str2;
            if (str3 != null) {
                this.k = str3;
                this.l = z;
                this.m = str4;
                this.n = drkgVar;
                return;
            }
            throw new NullPointerException("Null apiMapId");
        }
        throw new NullPointerException("Null spotlightExperiments");
    }

    @Override // defpackage.alyl
    @dzsi
    public final dfpo a() {
        return this.a;
    }

    @Override // defpackage.alyl
    @dzsi
    public final akqi b() {
        return this.b;
    }

    @Override // defpackage.alyl
    @dzsi
    public final dxdm c() {
        return this.c;
    }

    @Override // defpackage.alyl
    @dzsi
    public final dniu d() {
        return this.d;
    }

    @Override // defpackage.alyl
    @dzsi
    public final dniu e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        dmxh dmxhVar;
        String str;
        String str2;
        String str3;
        drkg drkgVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof alyl) {
            alyl alylVar = (alyl) obj;
            dfpo dfpoVar = this.a;
            if (dfpoVar != null ? dfpoVar.equals(alylVar.a()) : alylVar.a() == null) {
                akqi akqiVar = this.b;
                if (akqiVar != null ? akqiVar.equals(alylVar.b()) : alylVar.b() == null) {
                    dxdm dxdmVar = this.c;
                    if (dxdmVar != null ? dxdmVar.equals(alylVar.c()) : alylVar.c() == null) {
                        dniu dniuVar = this.d;
                        if (dniuVar != null ? dniuVar.equals(alylVar.d()) : alylVar.d() == null) {
                            dniu dniuVar2 = this.e;
                            if (dniuVar2 != null ? dniuVar2.equals(alylVar.e()) : alylVar.e() == null) {
                                dnbh dnbhVar = this.f;
                                if (dnbhVar != null ? dnbhVar.equals(alylVar.f()) : alylVar.f() == null) {
                                    if (dchl.m(this.g, alylVar.g()) && ((dmxhVar = this.h) != null ? dmxhVar.equals(alylVar.h()) : alylVar.h() == null) && ((str = this.i) != null ? str.equals(alylVar.i()) : alylVar.i() == null) && ((str2 = this.j) != null ? str2.equals(alylVar.j()) : alylVar.j() == null) && this.k.equals(alylVar.k()) && this.l == alylVar.l() && ((str3 = this.m) != null ? str3.equals(alylVar.m()) : alylVar.m() == null) && ((drkgVar = this.n) != null ? drkgVar.equals(alylVar.n()) : alylVar.n() == null)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.alyl
    @dzsi
    public final dnbh f() {
        return this.f;
    }

    @Override // defpackage.alyl
    public final dcdc<Integer> g() {
        return this.g;
    }

    @Override // defpackage.alyl
    @dzsi
    public final dmxh h() {
        return this.h;
    }

    @Override // defpackage.alyl
    @dzsi
    public final String i() {
        return this.i;
    }

    @Override // defpackage.alyl
    @dzsi
    public final String j() {
        return this.j;
    }

    @Override // defpackage.alyl
    public final String k() {
        return this.k;
    }

    @Override // defpackage.alyl
    public final boolean l() {
        return this.l;
    }

    @Override // defpackage.alyl
    @dzsi
    public final String m() {
        return this.m;
    }

    @Override // defpackage.alyl
    @dzsi
    public final drkg n() {
        return this.n;
    }

    @Override // defpackage.alyl
    public final alyk o() {
        return new alvg(this);
    }

    @Override // defpackage.alyl
    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        dfpo dfpoVar = this.a;
        int i6 = 0;
        if (dfpoVar == null) {
            i = 0;
        } else {
            i = dfpoVar.bC;
            if (i == 0) {
                i = dsst.a.b(dfpoVar).c(dfpoVar);
                dfpoVar.bC = i;
            }
        }
        int i7 = (i ^ 1000003) * 1000003;
        akqi akqiVar = this.b;
        int hashCode = (i7 ^ (akqiVar == null ? 0 : akqiVar.hashCode())) * 1000003;
        dxdm dxdmVar = this.c;
        if (dxdmVar == null) {
            i2 = 0;
        } else {
            i2 = dxdmVar.bC;
            if (i2 == 0) {
                i2 = dsst.a.b(dxdmVar).c(dxdmVar);
                dxdmVar.bC = i2;
            }
        }
        int i8 = (hashCode ^ i2) * 1000003;
        dniu dniuVar = this.d;
        if (dniuVar == null) {
            i3 = 0;
        } else {
            i3 = dniuVar.bC;
            if (i3 == 0) {
                i3 = dsst.a.b(dniuVar).c(dniuVar);
                dniuVar.bC = i3;
            }
        }
        int i9 = (i8 ^ i3) * 1000003;
        dniu dniuVar2 = this.e;
        if (dniuVar2 == null) {
            i4 = 0;
        } else {
            i4 = dniuVar2.bC;
            if (i4 == 0) {
                i4 = dsst.a.b(dniuVar2).c(dniuVar2);
                dniuVar2.bC = i4;
            }
        }
        int i10 = (i9 ^ i4) * 1000003;
        dnbh dnbhVar = this.f;
        int hashCode2 = (((i10 ^ (dnbhVar == null ? 0 : dnbhVar.hashCode())) * 1000003) ^ this.g.hashCode()) * 1000003;
        dmxh dmxhVar = this.h;
        if (dmxhVar == null) {
            i5 = 0;
        } else {
            i5 = dmxhVar.bC;
            if (i5 == 0) {
                i5 = dsst.a.b(dmxhVar).c(dmxhVar);
                dmxhVar.bC = i5;
            }
        }
        int i11 = (hashCode2 ^ i5) * 1000003;
        String str = this.i;
        int hashCode3 = (i11 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.j;
        int hashCode4 = (((((hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.k.hashCode()) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003;
        String str3 = this.m;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        drkg drkgVar = this.n;
        if (drkgVar != null && (i6 = drkgVar.bC) == 0) {
            i6 = dsst.a.b(drkgVar).c(drkgVar);
            drkgVar.bC = i6;
        }
        return hashCode5 ^ i6;
    }
}
