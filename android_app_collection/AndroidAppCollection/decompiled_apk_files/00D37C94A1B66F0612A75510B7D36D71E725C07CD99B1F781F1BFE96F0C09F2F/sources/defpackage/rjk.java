package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rjk  reason: default package */
/* loaded from: classes4.dex */
public final class rjk extends rjj {
    final /* synthetic */ rjl a;
    private final rpx h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rjk(rjl rjlVar, String str, int i, rpx rpxVar) {
        super(str, i);
        this.a = rjlVar;
        this.h = rpxVar;
    }

    @Override // defpackage.rjj
    public final int a() {
        return this.h.c;
    }

    @Override // defpackage.rjj
    public final boolean b() {
        return false;
    }

    @Override // defpackage.rjj
    public final boolean c() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(Long l, Long l2, rqo rqoVar, boolean z) {
        axst.b();
        boolean p = this.a.J().p(this.b, rkg.X);
        rpx rpxVar = this.h;
        boolean z2 = rpxVar.f;
        boolean z3 = rpxVar.g;
        boolean z4 = rpxVar.h;
        boolean z5 = z2 || z3 || z4;
        Boolean bool = null;
        Integer num = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (!z || z5) {
            rpv rpvVar = rpxVar.e;
            if (rpvVar == null) {
                rpvVar = rpv.a;
            }
            boolean z6 = rpvVar.e;
            int i = rqoVar.b;
            if ((i & 8) != 0) {
                if ((rpvVar.b & 2) != 0) {
                    long j = rqoVar.f;
                    rpw rpwVar = rpvVar.d;
                    if (rpwVar == null) {
                        rpwVar = rpw.a;
                    }
                    bool = j(h(j, rpwVar), z6);
                } else {
                    this.a.aG().f.b("No number filter for long property. property", this.a.L().e(rqoVar.d));
                }
            } else if ((i & 32) != 0) {
                if ((rpvVar.b & 2) != 0) {
                    double d = rqoVar.g;
                    rpw rpwVar2 = rpvVar.d;
                    if (rpwVar2 == null) {
                        rpwVar2 = rpw.a;
                    }
                    bool = j(g(d, rpwVar2), z6);
                } else {
                    this.a.aG().f.b("No number filter for double property. property", this.a.L().e(rqoVar.d));
                }
            } else if ((i & 4) != 0) {
                int i2 = rpvVar.b;
                if ((i2 & 1) != 0) {
                    String str = rqoVar.e;
                    rpz rpzVar = rpvVar.c;
                    if (rpzVar == null) {
                        rpzVar = rpz.a;
                    }
                    bool = j(f(str, rpzVar, this.a.aG()), z6);
                } else if ((i2 & 2) != 0) {
                    if (rpp.s(rqoVar.e)) {
                        String str2 = rqoVar.e;
                        rpw rpwVar3 = rpvVar.d;
                        if (rpwVar3 == null) {
                            rpwVar3 = rpw.a;
                        }
                        bool = j(i(str2, rpwVar3), z6);
                    } else {
                        this.a.aG().f.c("Invalid user property value for Numeric number filter. property, value", this.a.L().e(rqoVar.d), rqoVar.e);
                    }
                } else {
                    this.a.aG().f.b("No string or number filter defined. property", this.a.L().e(rqoVar.d));
                }
            } else {
                this.a.aG().f.b("User property has no value, property", this.a.L().e(rqoVar.d));
            }
            this.a.aG().k.b("Property filter result", bool == null ? "null" : bool);
            if (bool == null) {
                return false;
            }
            this.d = true;
            if (z4 && !bool.booleanValue()) {
                return true;
            }
            if (!z || this.h.f) {
                this.e = bool;
            }
            if (bool.booleanValue() && z5 && (rqoVar.b & 1) != 0) {
                long j2 = rqoVar.c;
                if (l != null) {
                    j2 = l.longValue();
                }
                if (p) {
                    rpx rpxVar2 = this.h;
                    if (rpxVar2.f && !rpxVar2.g && l2 != null) {
                        j2 = l2.longValue();
                    }
                }
                if (this.h.g) {
                    this.g = Long.valueOf(j2);
                } else {
                    this.f = Long.valueOf(j2);
                }
            }
            return true;
        }
        rkq rkqVar = this.a.aG().k;
        Integer valueOf = Integer.valueOf(this.c);
        rpx rpxVar3 = this.h;
        if ((rpxVar3.b & 1) != 0) {
            num = Integer.valueOf(rpxVar3.c);
        }
        rkqVar.c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", valueOf, num);
        return true;
    }
}
