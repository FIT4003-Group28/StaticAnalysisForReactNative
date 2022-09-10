package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.ar.core.ImageMetadata;
import java.util.Iterator;
import java.util.Random;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: ahpv  reason: default package */
/* loaded from: classes2.dex */
public final class ahpv implements ahog {
    private static final dcqe b = dcqe.c("ahpv");
    @dzsi
    public final ahoi a;
    private final cqat c;
    private final bqyp d;
    private final btrm e;
    private final boolean f;
    private final ckcw g;
    private final Random h;
    private final float i;
    private final dzis j;
    private int k;
    private amuh l;
    private int m;
    @dzsi
    private final ahpt n;
    private awcd retainedOfflineRouting;

    public ahpv(cqat cqatVar, bqyp bqypVar, @dzsi ahoi ahoiVar, boolean z, float f, btrm btrmVar, dehq dehqVar, ckcw ckcwVar, @dzsi ahpt ahptVar) {
        dzis dzisVar = new dzis();
        this.j = dzisVar;
        this.l = amuh.b;
        this.c = cqatVar;
        this.h = new Random(cqatVar.b());
        this.d = bqypVar;
        this.f = z;
        this.i = f;
        this.e = btrmVar;
        this.a = ahoiVar;
        this.g = ckcwVar;
        this.n = ahptVar;
        awmo awmoVar = new awmo();
        awmoVar.b(1);
        awmoVar.c(1);
        awmoVar.c = dehqVar;
        awmoVar.a();
        dzisVar.a = 1;
    }

    private final void e() {
        bvrj.LOCATION_DISPATCHER.c();
        ahoi ahoiVar = this.a;
        if (ahoiVar == null || !ahoiVar.d()) {
            return;
        }
        awcd k = this.d.k();
        if (k != this.retainedOfflineRouting) {
            ahoi ahoiVar2 = this.a;
            long e = k.e();
            if (ahoiVar2.d()) {
                ahoiVar2.nativeUpdateOfflineDiskCachePtr(ahoiVar2.c, e);
            }
            this.retainedOfflineRouting = k;
        }
        int b2 = this.d.b();
        this.j.a(b2, 1);
        if (this.k == b2) {
            return;
        }
        this.k = b2;
        ahoi ahoiVar3 = this.a;
        if (!ahoiVar3.d()) {
            return;
        }
        ahoiVar3.nativeUpdateSnaptilePrefetchingVersion(ahoiVar3.c, b2);
    }

    @Override // defpackage.ahog
    @dzsi
    public final GmmLocation a(long j) {
        bvrj.LOCATION_DISPATCHER.c();
        int i = 1;
        dbsk.l(true);
        dbsk.s(this.a);
        e();
        ahoi ahoiVar = this.a;
        int i2 = this.m;
        dbsk.l(ahoiVar.d());
        long j2 = ahoiVar.c;
        boolean z = ahoiVar.a;
        byte[] nativeGetSnaptileLocationAsProto = ahoiVar.nativeGetSnaptileLocationAsProto(j2, j, i2, false);
        dzjs dzjsVar = null;
        try {
            dlym dlymVar = (dlym) dsqw.cr(dlym.P, nativeGetSnaptileLocationAsProto, dsqa.c());
            GmmLocation a = ahof.a(this.c, dlymVar, this.l, j);
            if (a != null && !a.e()) {
                amvs A = a.A();
                Iterator<amub> it = this.l.iterator();
                while (it.hasNext()) {
                    amub next = it.next();
                    if (a.y(next.W)) {
                        A.y(next.W, dcyn.a);
                    }
                }
                a = A.d();
            }
            for (dlys dlysVar : dlymVar.y) {
                dbsk.l(true);
                int h = this.j.h(dlysVar.d);
                if (h == 1) {
                    this.d.e(dlysVar.d).I(new alyh(dlysVar.c, dlysVar.a, dlysVar.b));
                } else if (h != 2) {
                    int i3 = dlysVar.d;
                } else {
                    if (dzjsVar == null) {
                        dzjsVar = new dzjs();
                    }
                    avnl avnlVar = (avnl) dzjsVar.i(dlysVar.d);
                    if (avnlVar == null) {
                        avnlVar = avnm.d.bZ();
                        int i4 = dlysVar.d;
                        if (avnlVar.c) {
                            avnlVar.bF();
                            avnlVar.c = false;
                        }
                        avnm avnmVar = (avnm) avnlVar.b;
                        avnmVar.a |= 1;
                        avnmVar.b = i4;
                        dzjsVar.a(dlysVar.d, avnlVar);
                    }
                    drst bZ = drsu.e.bZ();
                    int i5 = dlysVar.a;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    drsu drsuVar = (drsu) bZ.b;
                    int i6 = 2 | drsuVar.a;
                    drsuVar.a = i6;
                    drsuVar.c = i5;
                    int i7 = dlysVar.b;
                    int i8 = i6 | 4;
                    drsuVar.a = i8;
                    drsuVar.d = i7;
                    int i9 = dlysVar.c;
                    drsuVar.a = i8 | 1;
                    drsuVar.b = i9;
                    if (avnlVar.c) {
                        avnlVar.bF();
                        avnlVar.c = false;
                    }
                    avnm avnmVar2 = (avnm) avnlVar.b;
                    drsu bK = bZ.bK();
                    avnm avnmVar3 = avnm.d;
                    bK.getClass();
                    dsrj<drsu> dsrjVar = avnmVar2.c;
                    if (!dsrjVar.a()) {
                        avnmVar2.c = dsqw.cl(dsrjVar);
                    }
                    avnmVar2.c.add(bK);
                }
            }
            if (dzjsVar != null) {
                dzrn a2 = dzjsVar.values().a();
                while (a2.hasNext()) {
                    this.d.f(((avnl) a2.next()).bK());
                }
            }
            if ((dlymVar.a & ImageMetadata.SHADING_MODE) != 0) {
                this.m = dlymVar.B;
                int size = dlymVar.C.size();
                dzru dzruVar = new dzru(size);
                for (int i10 = 0; i10 < size; i10++) {
                    dzruVar.add(new UUID(dlymVar.C.c(i10), dlymVar.D.c(i10)));
                }
                this.e.b(new ahta(dzruVar));
            }
            for (ddnf ddnfVar : dlymVar.K) {
                if (this.h.nextFloat() < this.i) {
                    this.e.b(new ahkc(ddnfVar));
                }
            }
            ahof.c(this.g, dlymVar.O);
            ahpt ahptVar = this.n;
            if (ahptVar != null && (dlymVar.a & 67108864) != 0) {
                double d = dlymVar.M;
                if (d != dcyn.a) {
                    double d2 = dlymVar.L;
                    bvrj.LOCATION_DISPATCHER.c();
                    int i11 = (int) (d2 * 10.0d);
                    int i12 = (int) (10.0d * d);
                    if (i12 != 0) {
                        i = i12;
                    } else if (d == dcyn.a) {
                        i = 0;
                    }
                    ahpr ahprVar = ahptVar.f;
                    if (ahprVar.a != i11 || ahprVar.b != i) {
                        ahpr ahprVar2 = new ahpr(i11, i);
                        ahptVar.f = ahprVar2;
                        ahptVar.i(16, ahprVar2);
                    }
                }
            }
            return a;
        } catch (dsrm e) {
            bvoo.h("Failed to parse LocationIntegratorResultProto %s", e);
            return null;
        }
    }

    @Override // defpackage.ahog
    public final void b(amuh amuhVar) {
        bvrj.LOCATION_DISPATCHER.c();
        ahoi ahoiVar = this.a;
        if (ahoiVar == null || !ahoiVar.d()) {
            return;
        }
        e();
        this.l = amuhVar;
        this.a.n(ahof.b(amuhVar, this.f).bS());
    }

    @Override // defpackage.ahog
    public final void c() {
        btrm btrmVar = this.e;
        dceq a = dcet.a();
        a.b(crmi.class, new ahpw(crmi.class, this, bvrj.LOCATION_DISPATCHER));
        btrmVar.g(this, a.a());
        ahoi ahoiVar = this.a;
        if (ahoiVar != null) {
            ahoiVar.a(true);
        }
    }

    @Override // defpackage.ahog
    public final void d() {
        bvrj.LOCATION_DISPATCHER.c();
        this.e.a(this);
        this.k = 0;
        this.l = amuh.b;
        this.e.b(new ahta(null));
        ahoi ahoiVar = this.a;
        if (ahoiVar == null) {
            return;
        }
        ahoiVar.a(false);
        this.a.c();
    }

    @Override // defpackage.ahqd
    public final void r(ahqe ahqeVar) {
        bvrj.LOCATION_DISPATCHER.c();
        ahoi ahoiVar = this.a;
        if (ahoiVar == null || !ahoiVar.d()) {
            return;
        }
        e();
        ahqeVar.c(this.a);
    }

    @Override // defpackage.ahqd
    public final long s() {
        bvrj.LOCATION_DISPATCHER.c();
        ahoi ahoiVar = this.a;
        if (ahoiVar == null || !ahoiVar.d()) {
            return 0L;
        }
        return this.a.e();
    }
}
