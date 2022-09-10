package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bpfw  reason: default package */
/* loaded from: classes3.dex */
public final class bpfw extends bpdz<bpwl> {
    private static final dcqe ao = dcqe.c("bpfw");
    public bpgf al;
    public bpgg am;
    public boxa an;
    private bptw ap;

    public static bpfw aT(bptw bptwVar, bwrs<bvrt<bpuk>> bwrsVar, bwqv bwqvVar, dnqe dnqeVar) {
        bpfw bpfwVar = new bpfw();
        Bundle w = w(bwqvVar, bwrsVar, dnqeVar);
        bvrs.k(w, "NAME_MODEL_PROTO_KEY", bptwVar.h().bK());
        bpfwVar.B(w);
        return bpfwVar;
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof bpdv) {
            bpdv bpdvVar = (bpdv) obj;
            dpsn dpsnVar = this.ai.a.get(0).b;
            if (dpsnVar == null) {
                dpsnVar = dpsn.d;
            }
            dnqe a = bpun.a(bpun.a(this.aj, dnpv.REDIRECTED_TO_ADDRESS_FROM_FEATURE_ID, akqi.j(dpsnVar).o()), dnpv.DETECTED_ADDRESS, bpdvVar.a());
            int b = bpdvVar.b();
            int i = b - 1;
            if (b == 0) {
                throw null;
            }
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    this.al.k();
                    return;
                }
                dnqe a2 = bpun.a(a, dnpv.REDIRECTED_TO_ADDRESS, "Reject");
                if (!this.al.j()) {
                    return;
                }
                bpgf bpgfVar = this.al;
                bpgfVar.j = bpdvVar.a();
                bpgfVar.k = a2;
                bpgfVar.i.b();
                bpgfVar.h();
                return;
            }
            this.al.k();
            dnqe a3 = bpun.a(a, dnpv.REDIRECTED_TO_ADDRESS, "Accept");
            if (this.an.n()) {
                this.an.t(null, a3);
                return;
            }
            boxa boxaVar = this.an;
            digh dighVar = this.ai.a.get(0);
            drkx drkxVar = dighVar.j;
            if (drkxVar == null) {
                drkxVar = drkx.b;
            }
            int size = drkxVar.a.size();
            ArrayList arrayList = new ArrayList(size);
            boqs c = this.al.c();
            dbsk.s(c);
            String m = c.m();
            dbsk.s(m);
            arrayList.add(m);
            if (size > 0) {
                drkx drkxVar2 = dighVar.j;
                if (drkxVar2 == null) {
                    drkxVar2 = drkx.b;
                }
                arrayList.addAll(dchl.k(drkxVar2.a.subList(1, size), bpfs.a));
            }
            dhjy bZ = dhjz.e.bZ();
            dpum dpumVar = dighVar.e;
            if (dpumVar == null) {
                dpumVar = dpum.d;
            }
            double d = dpumVar.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhjz dhjzVar = (dhjz) bZ.b;
            dhjzVar.a = 1 | dhjzVar.a;
            dhjzVar.b = d;
            dpum dpumVar2 = dighVar.e;
            if (dpumVar2 == null) {
                dpumVar2 = dpum.d;
            }
            double d2 = dpumVar2.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhjz dhjzVar2 = (dhjz) bZ.b;
            dhjzVar2.a |= 2;
            dhjzVar2.c = d2;
            boxaVar.j(bwrs.a(bpuo.a(arrayList, bZ.bK())), a3);
            return;
        }
        Object[] objArr = new Object[1];
        objArr[0] = obj == null ? "null" : obj.getClass().getName();
        bvoo.h("Received fragment result of an unsupported type: %s", objArr);
    }

    @Override // defpackage.bpdz
    public final dbsg<akqi> aJ() {
        return this.ap.e().equals(bptv.WHOLE_ROUTE) ? this.ap.d() : dbpy.a;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        this.al.g();
        super.am();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        bpgf bpgfVar = this.al;
        boolean z = false;
        if (this.aD) {
            bnyc bnycVar = bpgfVar.h;
            if (bpgfVar.g.d() || bpgfVar.f.l().booleanValue()) {
                z = true;
            }
            bnycVar.b(z);
            return true;
        }
        return false;
    }

    @Override // defpackage.bpdz
    protected final /* bridge */ /* synthetic */ bpwl g(dbsg dbsgVar) {
        bpua bpuaVar = (bpua) bvrs.f((Bundle) dbsgVar.c(this.o), "NAME_MODEL_PROTO_KEY", (dssr) bpua.g.cu(7));
        dbsk.s(bpuaVar);
        this.ap = bptw.i(bpuaVar);
        dnqe dnqeVar = this.aj;
        bpfv bpfvVar = (this.ap.e().equals(bptv.WHOLE_ROUTE) || bowv.j(dnqeVar, dnpv.ROUTE_PICKER_DIALOG_RESULT).c(dnpw.d).c.equals("No")) ? bpfv.PRESELECTED_ROUTE : this.ap.d().a() ^ true ? bpfv.UNNAMED_SEGMENT : bpfv.NAMED_SEGMENT;
        bpgg bpggVar = this.am;
        bptw bptwVar = this.ap;
        bwrs<bvrt<bpuk>> bwrsVar = this.ah;
        bpfu bpfuVar = new bpfu(this);
        dnqe dnqeVar2 = this.aj;
        bpgg.a(bptwVar, 1);
        bpgg.a(bpfvVar, 2);
        bpgg.a(bwrsVar, 3);
        bpgg.a(this, 4);
        bpgg.a(bpfuVar, 5);
        bpgg.a(dnqeVar2, 6);
        gga a = bpggVar.a.a();
        bpgg.a(a, 7);
        bpgg.a(bpggVar.b.a(), 8);
        bptg a2 = bpggVar.c.a();
        bpgg.a(a2, 9);
        bpsw a3 = bpggVar.d.a();
        bpgg.a(a3, 10);
        bpto a4 = bpggVar.e.a();
        bpgg.a(a4, 11);
        bnyd a5 = bpggVar.f.a();
        bpgg.a(a5, 12);
        booa a6 = bpggVar.g.a();
        bpgg.a(a6, 13);
        bpgg.a(bpggVar.h.a(), 14);
        bpsd a7 = bpggVar.i.a();
        bpgg.a(a7, 15);
        Executor a8 = bpggVar.j.a();
        bpgg.a(a8, 16);
        bpgg.a(bpggVar.k.a(), 17);
        bwqv a9 = bpggVar.l.a();
        bpgg.a(a9, 18);
        eeu a10 = bpggVar.m.a();
        bpgg.a(a10, 19);
        bpgf bpgfVar = new bpgf(bptwVar, bpfvVar, bwrsVar, this, bpfuVar, dnqeVar2, a, a2, a3, a4, a5, a6, a7, a8, a9, a10);
        this.al = bpgfVar;
        return bpgfVar;
    }

    @Override // defpackage.bpdz
    protected final cqiw<bpwl> i() {
        return new bpqk();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.bc;
    }

    @Override // defpackage.bpdz, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bvrs.k(bundle, "NAME_MODEL_PROTO_KEY", this.ap.h().bK());
    }
}
