package defpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ahgd  reason: default package */
/* loaded from: classes2.dex */
public class ahgd extends ahhv {
    private final agxa<?> a;
    private final cqat b;
    private final cjta c;
    private final bvjj d;
    private final btvo e;
    private boolean f;

    public ahgd(btvo btvoVar, cqat cqatVar, bvjj bvjjVar, final ahfz ahfzVar, ahht ahhtVar, dlcv dlcvVar, int i, agyh agyhVar) {
        super(ahhtVar, dlcvVar, agyhVar);
        dlco dlcoVar;
        ahga a;
        this.f = false;
        this.e = btvoVar;
        this.b = cqatVar;
        this.d = bvjjVar;
        if (dlcvVar.b == 27) {
            dlcoVar = (dlco) dlcvVar.c;
        } else {
            dlcoVar = dlco.c;
        }
        ddzf bZ = ddzg.t.bZ();
        ddyt bZ2 = ddyu.i.bZ();
        boolean z = agyhVar.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddyu ddyuVar = (ddyu) bZ2.b;
        int i2 = ddyuVar.a | 4;
        ddyuVar.a = i2;
        ddyuVar.c = z;
        int i3 = i2 | 8;
        ddyuVar.a = i3;
        ddyuVar.d = i;
        dspd dspdVar = dlcvVar.d;
        dspdVar.getClass();
        ddyuVar.a = i3 | 512;
        ddyuVar.h = dspdVar;
        ddyu bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddzg ddzgVar = (ddzg) bZ.b;
        bK.getClass();
        ddzgVar.k = bK;
        ddzgVar.b |= 1;
        this.c = z(dlcoVar.a, i, bZ.bK(), agyhVar);
        if ((agyhVar.a & 4096) == 0) {
            a = ahfzVar.a(dcbg.b(dlcoVar.b).o(new dbsl(ahfzVar) { // from class: ahfw
                private final ahfz a;

                {
                    this.a = ahfzVar;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    return !this.a.a.a().b(((dlcn) obj).b);
                }
            }).s(ahfx.a).z());
        } else {
            agye agyeVar = agyhVar.j;
            a = ahfzVar.a((agyeVar == null ? agye.d : agyeVar).b);
            agye agyeVar2 = agyhVar.j;
            this.f = (agyeVar2 == null ? agye.d : agyeVar2).c;
        }
        agxa<?> a2 = agxa.a(new agpk(), a);
        this.a = a2;
        A(a2, this.f, this.m);
    }

    private static void A(agxa<?> agxaVar, boolean z, agxs agxsVar) {
        List<cqix<?>> a = ((agzw) agxaVar.b).a().a();
        agyb bZ = agye.d.bZ();
        List k = dchl.k(a, ahgc.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        agye agyeVar = (agye) bZ.b;
        dsrj<agyd> dsrjVar = agyeVar.b;
        if (!dsrjVar.a()) {
            agyeVar.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(k, agyeVar.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        agye agyeVar2 = (agye) bZ.b;
        agyeVar2.a |= 1;
        agyeVar2.c = z;
        if (agxsVar.c) {
            agxsVar.bF();
            agxsVar.c = false;
        }
        agyh agyhVar = (agyh) agxsVar.b;
        agye bK = bZ.bK();
        agyh agyhVar2 = agyh.k;
        bK.getClass();
        agyhVar.j = bK;
        agyhVar.a |= 4096;
    }

    @Override // defpackage.agxe
    public List<agxa<?>> a() {
        return dcdc.f(this.a);
    }

    @Override // defpackage.agxe
    public cjtd b(ddho ddhoVar) {
        cjta cjtaVar = this.c;
        cjtaVar.d = ddhoVar;
        return cjtaVar.a();
    }

    @Override // defpackage.agxe
    @dzsi
    public cqix<? extends agxd> c() {
        return null;
    }

    @Override // defpackage.agxe
    public List<agwu> g() {
        return dcdc.e();
    }

    @Override // defpackage.ahhv
    public final agyh n() {
        A(this.a, this.f, this.m);
        return super.n();
    }

    @Override // defpackage.ahhv
    public void p() {
        ahin ahinVar;
        if (!this.f && (ahinVar = this.n) != null && ahinVar.G() != null) {
            this.d.aa(bvjk.aM, this.n.G(), TimeUnit.MILLISECONDS.toSeconds(this.b.b()));
            this.f = true;
        }
        ((ahga) this.a.b).m();
    }

    public boolean s(@dzsi btlu btluVar) {
        if (!this.f) {
            if (btluVar != null) {
                long x = this.d.x(bvjk.aM, btluVar, -1L);
                long j = this.e.getLocalPreferencesParameters().e + x;
                if (x == -1 || TimeUnit.MILLISECONDS.toSeconds(this.b.b()) >= x + j) {
                    agye agyeVar = ((agyh) this.m.b).j;
                    if (agyeVar == null) {
                        agyeVar = agye.d;
                    }
                    return agyeVar.b.size() == 0;
                }
            }
            return true;
        }
        return false;
    }
}
