package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bpgf  reason: default package */
/* loaded from: classes3.dex */
public class bpgf implements bpwl {
    public final bptw a;
    public final bpsr b;
    public final gga c;
    public final bwrs<bvrt<bpuk>> d;
    public final bwqv e;
    public final bopt f;
    public final boxs g;
    public final bnyc h;
    public final bptn i;
    public String j = "";
    public dnqe k;
    private final bpfv m;
    private final gfw n;
    private final bpsw o;
    private final eeu p;
    private final Executor q;
    private final boqg r;
    private final bpsc s;
    private final bpuk t;
    private boolean u;
    private final bomp v;

    public bpgf(bptw bptwVar, bpfv bpfvVar, bwrs<bvrt<bpuk>> bwrsVar, gfw gfwVar, bpsr bpsrVar, dnqe dnqeVar, gga ggaVar, bptg bptgVar, bpsw bpswVar, bpto bptoVar, bnyd bnydVar, booa booaVar, bpsd bpsdVar, Executor executor, bwqv bwqvVar, eeu eeuVar) {
        bomp bompVar = new bomp(new bpgd(this));
        this.v = bompVar;
        this.k = dnqeVar;
        this.c = ggaVar;
        this.a = bptwVar;
        this.m = bpfvVar;
        this.d = bwrsVar;
        this.n = gfwVar;
        this.b = bpsrVar;
        this.o = bpswVar;
        this.q = executor;
        this.e = bwqvVar;
        this.p = eeuVar;
        this.r = booaVar;
        this.h = bnydVar.a(ggaVar.g(), dtya.V, dtya.bH);
        bokk a = bptwVar.a();
        int i = true != dbsj.d(a.d()) ? R.string.RAP_TYPE_CORRECT_ROAD_NAME_IN_LANGUAGE : R.string.RAP_TYPE_CORRECT_ROAD_NAME;
        bopt boptVar = new bopt(ggaVar, a, ggaVar.getString(R.string.ROAD_NAME), ggaVar.getString(i, new Object[]{a.d()}), ggaVar.getString(i, new Object[]{a.d()}), ggaVar.getString(R.string.ROAD_NAME), 8193, 0, dtya.ai, null, false, false, true, null, bpwl.l, false, null, false, 3);
        this.f = boptVar;
        if (a.f.isEmpty()) {
            boptVar.z();
        }
        this.g = new boxs(bptwVar.c(), ggaVar.getString(R.string.ADD_OPTIONAL_NOTE_HINT), bpfx.a, null);
        int i2 = true != bpfvVar.a() ? R.string.RAP_ROAD_LOADING_TEXT : R.string.SENDING;
        bptl d = bptm.d();
        d.d(i2);
        this.i = bptoVar.b(bptgVar, d.a());
        bvrt<bpuk> c = bwrsVar.c();
        dbsk.s(c);
        bpuk e = c.e((dssr) bpuk.c.cu(7), bpuk.c);
        this.t = e;
        digh dighVar = e.a.get(0);
        bpsd.a(dighVar, 1);
        btpc a2 = bpsdVar.a.a();
        bpsd.a(a2, 2);
        Executor a3 = bpsdVar.b.a();
        bpsd.a(a3, 3);
        buny a4 = bpsdVar.c.a();
        bpsd.a(a4, 4);
        this.s = new bpsc(dighVar, a2, a3, a4);
        cqkx.j(boptVar, bompVar);
    }

    @Override // defpackage.jbk
    public jib NC() {
        String string;
        jhz aS = bpdz.aS(this.c.getString(R.string.RAP_ROAD_ATTRIBUTE_SELECTION_NAME_TITLE));
        aS.o = cjtd.a(dtya.ba);
        aS.f(new View.OnClickListener(this) { // from class: bpfy
            private final bpgf a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b.b();
            }
        });
        if (this.m.a()) {
            string = this.c.getString(R.string.REPORT_MAP_ISSUE_SUBMIT);
        } else {
            string = this.c.getString(R.string.NEXT);
        }
        ddho ddhoVar = this.m.a() ? dtya.bd : dtya.bb;
        jhm a = jhm.a();
        a.a = string;
        a.f = cjtd.a(ddhoVar);
        a.b = string;
        a.h = 2;
        a.d(new View.OnClickListener(this) { // from class: bpfz
            private final bpgf a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b.a();
            }
        });
        boolean z = false;
        if (this.f.n().booleanValue() && this.f.w().booleanValue() && this.f.l().booleanValue()) {
            z = true;
        }
        a.n = z;
        aS.c(a.c());
        return aS.b();
    }

    @Override // defpackage.bpwl
    public String b() {
        return this.f.k();
    }

    @Override // defpackage.bpwl
    public boqs c() {
        return this.f;
    }

    @Override // defpackage.bpwl
    public bpvn d() {
        return this.g;
    }

    @Override // defpackage.bpwl
    public Boolean e() {
        return Boolean.valueOf(this.m.a());
    }

    @Override // defpackage.bpwl
    public boqg f() {
        return this.r;
    }

    public void g() {
        this.v.b();
    }

    public final void i(Boolean bool) {
        this.i.c();
        if (bool.booleanValue()) {
            this.u = true;
            String c = this.a.a().c();
            int i = true != this.m.a() ? R.string.ADDRESS_REDIRECT_DIALOG_CONTINUE : R.string.ADDRESS_REDIRECT_DIALOG_CANCEL;
            gfw gfwVar = this.n;
            Bundle bundle = new Bundle();
            bundle.putCharSequence("key_road_name_or_address", c);
            bundle.putInt("button_text_res_id", i);
            bpdw bpdwVar = new bpdw();
            bpdwVar.B(bundle);
            bpdwVar.Nz(gfwVar);
            bpdwVar.aJ(this.c);
        } else if (!this.m.a()) {
            if (!this.p.b()) {
                return;
            }
            k();
            jmw.d(this.c, new Runnable(this) { // from class: bpga
                private final bpgf a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bpgf bpgfVar = this.a;
                    gga ggaVar = bpgfVar.c;
                    bwrs<bvrt<bpuk>> bwrsVar = bpgfVar.d;
                    bwqv bwqvVar = bpgfVar.e;
                    bptw bptwVar = bpgfVar.a;
                    dnqe dnqeVar = bpgfVar.k;
                    bpgm bpgmVar = new bpgm();
                    Bundle w = bpgm.w(bwqvVar, bwrsVar, dnqeVar);
                    bvrs.k(w, "NAME_MODEL_PROTO_KEY", bptwVar.h().bK());
                    bpgmVar.B(w);
                    ggaVar.D(bpgmVar);
                }
            });
        } else {
            digh dighVar = this.t.a.get(0);
            bpsw bpswVar = this.o;
            bptw bptwVar = this.a;
            dcdc z = dcbg.b(this.t.a).s(bpgb.a).z();
            dpum dpumVar = dighVar.e;
            if (dpumVar == null) {
                dpumVar = dpum.d;
            }
            akqq f = akqq.f(dpumVar);
            dbrz f2 = dbrz.f(' ');
            drkx drkxVar = dighVar.j;
            if (drkxVar == null) {
                drkxVar = drkx.b;
            }
            this.i.a(bpswVar.d(bptwVar, z, f, f2.g(dchl.k(drkxVar.a, bpgc.a)), this.k), true);
        }
    }

    public boolean j() {
        return this.u;
    }

    public void k() {
        if (this.u) {
            this.i.c();
            this.u = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        dehn dehnVar;
        this.u = false;
        if (this.f.m().contentEquals(this.j)) {
            this.j = "";
            i(false);
            return;
        }
        bpsc bpscVar = this.s;
        String m = this.f.m();
        bvrj.UI_THREAD.c();
        if (!bpscVar.b.i()) {
            dehnVar = deha.a(false);
        } else {
            dqns bZ = dqnt.e.bZ();
            dqnq bZ2 = dqnr.d.bZ();
            dqnw bZ3 = dqnx.d.bZ();
            String str = bpscVar.a;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dqnx dqnxVar = (dqnx) bZ3.b;
            str.getClass();
            dqnxVar.a |= 1;
            dqnxVar.c = str;
            dqnx dqnxVar2 = (dqnx) bZ3.b;
            m.getClass();
            dqnxVar2.b();
            dqnxVar2.b.add(m);
            bZ3.a(bpscVar.d);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dqnr dqnrVar = (dqnr) bZ2.b;
            dqnx bK = bZ3.bK();
            bK.getClass();
            dqnrVar.b = bK;
            dqnrVar.a |= 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dqnt dqntVar = (dqnt) bZ.b;
            dqnr bK2 = bZ2.bK();
            bK2.getClass();
            dqntVar.c = bK2;
            dqntVar.a |= 2;
            if (bpscVar.e.a()) {
                dqnp b = bpscVar.e.b();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dqnt dqntVar2 = (dqnt) bZ.b;
                b.getClass();
                dqntVar2.b = b;
                dqntVar2.a |= 1;
            }
            deig d = deig.d();
            bpsa bpsaVar = new bpsa(d);
            dhki bZ4 = dhkj.c.bZ();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dhkj dhkjVar = (dhkj) bZ4.b;
            dqnt bK3 = bZ.bK();
            bK3.getClass();
            dhkjVar.b = bK3;
            dhkjVar.a |= 1;
            bpscVar.f.b(bZ4.bK(), bpsaVar, bpscVar.c);
            dehnVar = d;
        }
        this.i.b();
        deha.q(dehnVar, new bpge(this), this.q);
    }
}
