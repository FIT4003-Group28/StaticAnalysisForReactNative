package defpackage;
/* compiled from: PG */
/* renamed from: alvu  reason: default package */
/* loaded from: classes.dex */
final class alvu extends alvh {
    private volatile transient int p;
    private volatile transient boolean q;

    public alvu(dfpo dfpoVar, akqi akqiVar, dxdm dxdmVar, dniu dniuVar, dniu dniuVar2, dnbh dnbhVar, dcdc<Integer> dcdcVar, dmxh dmxhVar, String str, String str2, String str3, boolean z, String str4, drkg drkgVar) {
        super(dfpoVar, akqiVar, dxdmVar, dniuVar, dniuVar2, dnbhVar, dcdcVar, dmxhVar, str, str2, str3, z, str4, drkgVar);
    }

    @Override // defpackage.alvh
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alvu) || hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof alyl)) {
                return false;
            }
            alyl alylVar = (alyl) obj;
            dfpo dfpoVar = this.a;
            if (dfpoVar == null) {
                if (alylVar.a() != null) {
                    return false;
                }
            } else if (!dfpoVar.equals(alylVar.a())) {
                return false;
            }
            akqi akqiVar = this.b;
            if (akqiVar == null) {
                if (alylVar.b() != null) {
                    return false;
                }
            } else if (!akqiVar.equals(alylVar.b())) {
                return false;
            }
            dxdm dxdmVar = this.c;
            if (dxdmVar == null) {
                if (alylVar.c() != null) {
                    return false;
                }
            } else if (!dxdmVar.equals(alylVar.c())) {
                return false;
            }
            dniu dniuVar = this.d;
            if (dniuVar == null) {
                if (alylVar.d() != null) {
                    return false;
                }
            } else if (!dniuVar.equals(alylVar.d())) {
                return false;
            }
            dniu dniuVar2 = this.e;
            if (dniuVar2 == null) {
                if (alylVar.e() != null) {
                    return false;
                }
            } else if (!dniuVar2.equals(alylVar.e())) {
                return false;
            }
            dnbh dnbhVar = this.f;
            if (dnbhVar == null) {
                if (alylVar.f() != null) {
                    return false;
                }
            } else if (!dnbhVar.equals(alylVar.f())) {
                return false;
            }
            if (!dchl.m(this.g, alylVar.g())) {
                return false;
            }
            dmxh dmxhVar = this.h;
            if (dmxhVar == null) {
                if (alylVar.h() != null) {
                    return false;
                }
            } else if (!dmxhVar.equals(alylVar.h())) {
                return false;
            }
            String str = this.i;
            if (str == null) {
                if (alylVar.i() != null) {
                    return false;
                }
            } else if (!str.equals(alylVar.i())) {
                return false;
            }
            String str2 = this.j;
            if (str2 == null) {
                if (alylVar.j() != null) {
                    return false;
                }
            } else if (!str2.equals(alylVar.j())) {
                return false;
            }
            if (!this.k.equals(alylVar.k()) || this.l != alylVar.l()) {
                return false;
            }
            String str3 = this.m;
            if (str3 == null) {
                if (alylVar.m() != null) {
                    return false;
                }
            } else if (!str3.equals(alylVar.m())) {
                return false;
            }
            drkg drkgVar = this.n;
            if (drkgVar == null) {
                if (alylVar.n() != null) {
                    return false;
                }
            } else if (!drkgVar.equals(alylVar.n())) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.alvh, defpackage.alyl
    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (!this.q) {
            synchronized (this) {
                if (!this.q) {
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
                    this.p = hashCode5 ^ i6;
                    this.q = true;
                }
            }
        }
        return this.p;
    }
}
