package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bsvj  reason: default package */
/* loaded from: classes4.dex */
public final class bsvj implements bsvn {
    public final bvjj a;
    public final akfa b;
    public final btrm c;
    public final anhk d;
    public final auhi e;
    public final btvo f;
    public final cqat g;
    final btzi<dwvn, dwvp> h = new bsvh(this);
    private final Executor i;
    private final busi j;
    private final bvbg k;

    public bsvj(Executor executor, busi busiVar, bvbg bvbgVar, bvjj bvjjVar, btrm btrmVar, anhk anhkVar, auhi auhiVar, btvo btvoVar, cqat cqatVar, akfa akfaVar) {
        this.i = executor;
        this.j = busiVar;
        this.k = bvbgVar;
        this.a = bvjjVar;
        this.c = btrmVar;
        this.d = anhkVar;
        this.e = auhiVar;
        this.f = btvoVar;
        this.g = cqatVar;
        this.b = akfaVar;
    }

    @Override // defpackage.bsvn
    public final void a() {
        dwvm bZ = dwvn.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwvn dwvnVar = (dwvn) bZ.b;
        dwvnVar.a |= 1;
        dwvnVar.b = true;
        dwvn dwvnVar2 = (dwvn) bZ.b;
        dwvnVar2.a |= 8;
        dwvnVar2.e = true;
        dnwb a = this.d.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwvn dwvnVar3 = (dwvn) bZ.b;
        a.getClass();
        dwvnVar3.d = a;
        dwvnVar3.a |= 4;
        dorp bZ2 = dorq.d.bZ();
        String str = this.d.a().c;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dorq dorqVar = (dorq) bZ2.b;
        str.getClass();
        dorqVar.a = 1 | dorqVar.a;
        dorqVar.b = str;
        dspd dspdVar = this.d.a().e;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dorq dorqVar2 = (dorq) bZ2.b;
        dspdVar.getClass();
        dorqVar2.a |= 2;
        dorqVar2.c = dspdVar;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwvn dwvnVar4 = (dwvn) bZ.b;
        dorq bK = bZ2.bK();
        bK.getClass();
        dwvnVar4.c = bK;
        dwvnVar4.a |= 2;
        this.j.b(bZ.bK(), this.h, this.i);
    }

    @Override // defpackage.bsvn
    public final void b() {
        d(dbpy.a);
    }

    @Override // defpackage.bsvn
    public final dehn<Void> c() {
        return d(dbpy.a);
    }

    public final dehn<Void> d(dbsg<btav> dbsgVar) {
        dqfc dqfcVar;
        dorl bZ = dorm.n.bZ();
        aufs t = this.e.t(dpyv.RIDDLER.dm);
        boolean z = t == aufs.DISABLED;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dorm dormVar = (dorm) bZ.b;
        dormVar.a |= 1;
        dormVar.b = z;
        boolean z2 = t == aufs.INBOX_ONLY;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dorm dormVar2 = (dorm) bZ.b;
        dormVar2.a |= 2;
        dormVar2.c = z2;
        aufs t2 = this.e.t(dpyv.PLACE_QA.dm);
        boolean z3 = t2 == aufs.DISABLED;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dorm dormVar3 = (dorm) bZ.b;
        dormVar3.a |= ImageMetadata.LENS_APERTURE;
        dormVar3.l = z3;
        boolean z4 = t2 == aufs.INBOX_ONLY;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dorm dormVar4 = (dorm) bZ.b;
        dormVar4.a |= ImageMetadata.SHADING_MODE;
        dormVar4.m = z4;
        aufs t3 = this.e.t(dpyv.SHARED_LOCATION_RECEIVED.dm);
        boolean z5 = t3 == aufs.DISABLED;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dorm dormVar5 = (dorm) bZ.b;
        dormVar5.a |= 32;
        dormVar5.d = z5;
        boolean z6 = t3 == aufs.INBOX_ONLY;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dorm dormVar6 = (dorm) bZ.b;
        dormVar6.a |= 64;
        dormVar6.e = z6;
        aufs t4 = this.e.t(dpyv.PHOTO_TAKEN.dm);
        boolean z7 = t4 == aufs.DISABLED;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dorm dormVar7 = (dorm) bZ.b;
        dormVar7.a |= 512;
        dormVar7.f = z7;
        boolean z8 = t4 == aufs.INBOX_ONLY;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dorm dormVar8 = (dorm) bZ.b;
        dormVar8.a |= 1024;
        dormVar8.g = z8;
        aufs t5 = this.e.t(dpyv.TIMELINE_VISIT_CONFIRMATION.dm);
        boolean z9 = t5 == aufs.DISABLED;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dorm dormVar9 = (dorm) bZ.b;
        dormVar9.a |= 2048;
        dormVar9.h = z9;
        boolean z10 = t5 == aufs.INBOX_ONLY;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dorm dormVar10 = (dorm) bZ.b;
        dormVar10.a |= 4096;
        dormVar10.i = z10;
        aufs t6 = this.e.t(dpyv.TODO_PHOTO.dm);
        boolean z11 = t6 == aufs.DISABLED;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dorm dormVar11 = (dorm) bZ.b;
        dormVar11.a |= 131072;
        dormVar11.j = z11;
        boolean z12 = t6 == aufs.INBOX_ONLY;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dorm dormVar12 = (dorm) bZ.b;
        dormVar12.a |= 262144;
        dormVar12.k = z12;
        dorn bZ2 = doro.f.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        doro doroVar = (doro) bZ2.b;
        dorm bK = bZ.bK();
        bK.getClass();
        doroVar.b = bK;
        doroVar.a |= 8;
        boolean o = this.a.o(bvjk.gK, this.b.j(), false);
        dnjm bZ3 = dnjn.c.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dnjn dnjnVar = (dnjn) bZ3.b;
        dnjnVar.a |= 1;
        dnjnVar.b = o;
        dnjn bK2 = bZ3.bK();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        doro doroVar2 = (doro) bZ2.b;
        bK2.getClass();
        doroVar2.d = bK2;
        doroVar2.a |= 8192;
        donr bZ4 = dons.g.bZ();
        boolean m = this.a.m(bvjk.dK, false);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dons donsVar = (dons) bZ4.b;
        donsVar.a |= 1;
        donsVar.b = m;
        boolean m2 = this.a.m(bvjk.dN, false);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dons donsVar2 = (dons) bZ4.b;
        donsVar2.a |= 2;
        donsVar2.c = m2;
        boolean m3 = this.a.m(bvjk.dL, false);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dons donsVar3 = (dons) bZ4.b;
        donsVar3.a |= 8;
        donsVar3.d = m3;
        boolean m4 = this.a.m(bvjk.dO, false);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dons donsVar4 = (dons) bZ4.b;
        donsVar4.a |= 16;
        donsVar4.e = m4;
        long w = this.a.w(bvjk.dQ, 0L);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dons donsVar5 = (dons) bZ4.b;
        donsVar5.a |= 32;
        donsVar5.f = w;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        doro doroVar3 = (doro) bZ2.b;
        dons bK3 = bZ4.bK();
        bK3.getClass();
        doroVar3.c = bK3;
        doroVar3.a |= 32;
        dqfa bZ5 = dqfd.e.bZ();
        if (this.a.j(bvjk.hL, this.b.j())) {
            if (this.a.o(bvjk.hL, this.b.j(), true)) {
                dqfcVar = dqfc.PUBLIC;
            } else {
                dqfcVar = dqfc.PRIVATE;
            }
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dqfd dqfdVar = (dqfd) bZ5.b;
            dqfdVar.b = dqfcVar.d;
            dqfdVar.a |= 1;
        }
        if (this.f.getPeopleFollowParameters().a) {
            int t7 = this.a.t(bvjk.hM, this.b.j(), -1);
            if (t7 != -1) {
                int a = dfqg.a(t7);
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                dqfd dqfdVar2 = (dqfd) bZ5.b;
                int i = a - 1;
                if (a == 0) {
                    throw null;
                }
                dqfdVar2.c = i;
                dqfdVar2.a |= 2;
            }
            int t8 = this.a.t(bvjk.gY, this.b.j(), -1);
            if (t8 != -1) {
                int a2 = dfqa.a(t8);
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                dqfd dqfdVar3 = (dqfd) bZ5.b;
                int i2 = a2 - 1;
                if (a2 == 0) {
                    throw null;
                }
                dqfdVar3.d = i2;
                dqfdVar3.a |= 4;
            }
        }
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        doro doroVar4 = (doro) bZ2.b;
        dqfd bK4 = bZ5.bK();
        bK4.getClass();
        doroVar4.e = bK4;
        doroVar4.a |= 16384;
        dwvq bZ6 = dwvr.e.bZ();
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dwvr dwvrVar = (dwvr) bZ6.b;
        doro bK5 = bZ2.bK();
        bK5.getClass();
        dwvrVar.b = bK5;
        dwvrVar.a |= 1;
        dnwb a3 = this.d.a();
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dwvr dwvrVar2 = (dwvr) bZ6.b;
        a3.getClass();
        dwvrVar2.d = a3;
        dwvrVar2.a |= 4;
        dorp bZ7 = dorq.d.bZ();
        String str = this.d.a().c;
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        dorq dorqVar = (dorq) bZ7.b;
        str.getClass();
        dorqVar.a = 1 | dorqVar.a;
        dorqVar.b = str;
        dspd dspdVar = this.d.a().e;
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        dorq dorqVar2 = (dorq) bZ7.b;
        dspdVar.getClass();
        dorqVar2.a |= 2;
        dorqVar2.c = dspdVar;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dwvr dwvrVar3 = (dwvr) bZ6.b;
        dorq bK6 = bZ7.bK();
        bK6.getClass();
        dwvrVar3.c = bK6;
        dwvrVar3.a |= 2;
        deig d = deig.d();
        this.k.b(bZ6.bK(), new bsvi(this, dbsgVar, d), this.i);
        return d;
    }
}
