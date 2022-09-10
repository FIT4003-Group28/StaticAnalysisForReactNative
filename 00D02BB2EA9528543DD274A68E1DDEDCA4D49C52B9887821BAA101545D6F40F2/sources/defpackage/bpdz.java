package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import defpackage.bpvk;
import java.io.IOException;
import java.util.EnumSet;
/* compiled from: PG */
/* renamed from: bpdz  reason: default package */
/* loaded from: classes3.dex */
public abstract class bpdz<T extends bpvk> extends ges implements bpvb, egq {
    public static final dcqe a = dcqe.c("bpdz");
    public bpto ad;
    public bpsw ae;
    public T af;
    public View ag;
    protected bwrs<bvrt<bpuk>> ah;
    protected bpuk ai;
    protected dnqe aj;
    protected bptn ak;
    private cqkf<T> al;
    private cqiw<T> am;
    public cqkj b;
    public efg c;
    public bwqv d;
    public bpvc e;
    public bpsq f;
    public bptg g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static jhz aS(String str) {
        jhz a2 = jhz.a();
        a2.a = str;
        a2.j = cqrt.l(R.string.BACK_BUTTON);
        a2.x = true;
        a2.C = 2;
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Bundle w(bwqv bwqvVar, bwrs<bvrt<bpuk>> bwrsVar, dnqe dnqeVar) {
        Bundle bundle = new Bundle();
        bpvi.a(bundle, bwqvVar, bwrsVar);
        bvrs.k(bundle, "CLIENT_STATE_PROTO_KEY", dnqeVar);
        return bundle;
    }

    @Override // defpackage.ges, defpackage.fd
    public void Qe() {
        this.e.b();
        super.Qe();
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        if (this.aD) {
            aR();
        }
    }

    public abstract dbsg<akqi> aJ();

    @Override // defpackage.bpvb
    public void aR() {
        this.e.a(bpuz.f(this.ai, aJ()));
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.al = this.b.d(this.am, viewGroup, false);
        this.ag = q();
        return null;
    }

    protected abstract T g(dbsg<Bundle> dbsgVar);

    protected abstract cqiw<T> i();

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        bwrs<bvrt<bpuk>> a2;
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        try {
            a2 = this.d.e(bvrt.class, bundle, "ROAD_RAP_FEATURES_235085797_KEY");
            dbsk.s(a2);
        } catch (IOException | NullPointerException e) {
            bvoo.f(new RuntimeException(e));
            a2 = bwrs.a(null);
        }
        this.ah = a2;
        bvrt<bpuk> c = a2.c();
        dbsk.s(c);
        this.ai = c.e((dssr) bpuk.c.cu(7), bpuk.c);
        this.aj = (dnqe) bvrs.g(bundle, "CLIENT_STATE_PROTO_KEY", (dssr) dnqe.i.cu(7), dnqe.i);
        this.ak = this.ad.a(this.g);
        this.f.d(bundle);
        T g = g(dbsg.j(bundle));
        dbsk.s(g);
        this.af = g;
        cqiw<T> i = i();
        dbsk.s(i);
        this.am = i;
    }

    protected final View q() {
        dbsk.s(this.al);
        return this.al.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        bpsq bpsqVar = this.f;
        bpso c = bpsp.c();
        c.b(false);
        bpsqVar.a(c.a());
        this.al.e(this.af);
        efg efgVar = this.c;
        egj egjVar = new egj(this);
        egjVar.e(new ecs(this) { // from class: bpdy
            private final bpdz a;

            {
                this.a = this;
            }

            @Override // defpackage.ecs
            public final void Qf() {
                bpdz bpdzVar = this.a;
                View a2 = cqhu.a(bpdzVar.ag, bpqx.d);
                if (a2 == null) {
                    bvoo.h("Could not find a toolbar view for accessibility announcement: %s", bpdzVar.af.getClass().getName());
                } else if (bpdzVar.aE == null) {
                } else {
                    a2.announceForAccessibility(bpdzVar.af.NC().u);
                }
            }
        });
        egjVar.w(q());
        egjVar.x(egr.a);
        egjVar.ag(null);
        egjVar.J(this);
        egf a2 = egf.a();
        afwm[] afwmVarArr = (afwm[]) EnumSet.complementOf(EnumSet.of(afwm.SATELLITE)).toArray(new afwm[0]);
        afwn[] afwnVarArr = new afwn[afwmVarArr.length];
        for (int i = 0; i < afwmVarArr.length; i++) {
            afwnVarArr[i] = afwn.e(afwmVarArr[i], false);
        }
        a2.l = afwnVarArr;
        egjVar.A(a2);
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public void t(Bundle bundle) {
        super.t(bundle);
        this.f.c(bundle);
        bpvi.a(bundle, this.d, bwrs.a(bvrt.b(this.ai)));
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.f.b();
        this.al.e(null);
        super.u();
    }
}
