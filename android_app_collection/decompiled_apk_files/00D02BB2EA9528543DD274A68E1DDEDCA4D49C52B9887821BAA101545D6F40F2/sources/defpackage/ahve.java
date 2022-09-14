package defpackage;

import com.google.android.apps.gmm.locationsharing.api.Profile;
/* compiled from: PG */
/* renamed from: ahve  reason: default package */
/* loaded from: classes2.dex */
final class ahve extends ahuy {
    private volatile transient dqzv k;
    private volatile transient boolean l;
    private volatile transient ajje m;
    private volatile transient String n;

    public ahve(Profile profile, doep doepVar, dbsg<ahvj> dbsgVar, long j, long j2, long j3, dcdc<dqzv> dcdcVar, boolean z, boolean z2, boolean z3, long j4, boolean z4, dbsg<String> dbsgVar2) {
        super(profile, doepVar, dbsgVar, j, j2, j3, dcdcVar, z, z2, z3, j4, z4, dbsgVar2);
    }

    @Override // defpackage.ahwn
    @dzsi
    public final dqzv o() {
        if (!this.l) {
            synchronized (this) {
                if (!this.l) {
                    this.k = ahwn.J(this.f);
                    this.l = true;
                }
            }
        }
        return this.k;
    }

    @Override // defpackage.ahwn, defpackage.ahwl
    public final ajje p() {
        if (this.m == null) {
            synchronized (this) {
                if (this.m == null) {
                    ajjd bZ = ajje.o.bZ();
                    long j = this.c;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ajje ajjeVar = (ajje) bZ.b;
                    ajjeVar.a |= 4;
                    ajjeVar.e = j;
                    long j2 = this.d;
                    ajje ajjeVar2 = (ajje) bZ.b;
                    ajjeVar2.a |= 8;
                    ajjeVar2.f = j2;
                    dcdc<dqzv> dcdcVar = this.f;
                    ajje ajjeVar3 = (ajje) bZ.b;
                    dsrj<dqzv> dsrjVar = ajjeVar3.c;
                    if (!dsrjVar.a()) {
                        ajjeVar3.c = dsqw.cl(dsrjVar);
                    }
                    dsod.bv(dcdcVar, ajjeVar3.c);
                    boolean z = this.g;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ajje ajjeVar4 = (ajje) bZ.b;
                    ajjeVar4.a |= 2;
                    ajjeVar4.d = z;
                    long j3 = this.h;
                    ajje ajjeVar5 = (ajje) bZ.b;
                    ajjeVar5.a |= 16;
                    ajjeVar5.g = j3;
                    Profile profile = this.a;
                    ajjb bZ2 = ajjc.f.bZ();
                    if (profile.b().a()) {
                        String b = profile.b().b();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        ajjc ajjcVar = (ajjc) bZ2.b;
                        b.getClass();
                        ajjcVar.a |= 1;
                        ajjcVar.b = b;
                    }
                    if (profile.c().a()) {
                        String b2 = profile.c().b();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        ajjc ajjcVar2 = (ajjc) bZ2.b;
                        b2.getClass();
                        ajjcVar2.a |= 2;
                        ajjcVar2.c = b2;
                    }
                    if (profile.d().a()) {
                        String b3 = profile.d().b();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        ajjc ajjcVar3 = (ajjc) bZ2.b;
                        b3.getClass();
                        ajjcVar3.a |= 4;
                        ajjcVar3.d = b3;
                    }
                    if (profile.e().a()) {
                        String b4 = profile.e().b();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        ajjc ajjcVar4 = (ajjc) bZ2.b;
                        b4.getClass();
                        ajjcVar4.a |= 8;
                        ajjcVar4.e = b4;
                    }
                    ajjc bK = bZ2.bK();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ajje ajjeVar6 = (ajje) bZ.b;
                    bK.getClass();
                    ajjeVar6.h = bK;
                    ajjeVar6.a |= 32;
                    if (this.i) {
                        doep doepVar = this.b;
                        dsqp dsqpVar = (dsqp) doepVar.cu(5);
                        dsqpVar.bC(doepVar);
                        doeo doeoVar = (doeo) dsqpVar;
                        if (doeoVar.c) {
                            doeoVar.bF();
                            doeoVar.c = false;
                        }
                        doep doepVar2 = (doep) doeoVar.b;
                        doepVar2.a |= 32;
                        doepVar2.e = false;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        ajje ajjeVar7 = (ajje) bZ.b;
                        doep bK2 = doeoVar.bK();
                        bK2.getClass();
                        ajjeVar7.b = bK2;
                        ajjeVar7.a |= 1;
                        long j4 = this.e;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        ajje ajjeVar8 = (ajje) bZ.b;
                        ajjeVar8.a |= 512;
                        ajjeVar8.j = j4;
                    }
                    if (this.j.a()) {
                        String b5 = this.j.b();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        ajje ajjeVar9 = (ajje) bZ.b;
                        b5.getClass();
                        ajjeVar9.a |= 256;
                        ajjeVar9.i = b5;
                    }
                    this.m = bZ.bK();
                    if (this.m == null) {
                        throw new NullPointerException("toProto() cannot return null");
                    }
                }
            }
        }
        return this.m;
    }

    @Override // defpackage.ahwn
    public final String toString() {
        if (this.n == null) {
            synchronized (this) {
                if (this.n == null) {
                    this.n = super.toString();
                    if (this.n == null) {
                        throw new NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.n;
    }
}
