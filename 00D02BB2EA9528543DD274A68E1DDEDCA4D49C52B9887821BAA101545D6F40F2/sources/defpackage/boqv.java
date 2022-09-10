package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: boqv  reason: default package */
/* loaded from: classes3.dex */
public final class boqv extends ges {
    private static final dcqe ah = dcqe.c("boqv");
    public efg a;
    @dzsi
    public Integer ad;
    @dzsi
    public akqi ae;
    @dzsi
    public boqu af;
    final bosu ag = new boqt(this);
    private bosj ai;
    private bosj aj;
    @dzsi
    private bosn ak;
    private cqkf<bosv> al;
    private boolean am;
    public cqkj b;
    public boso c;
    public dxio<boxa> d;
    public bwqv e;
    public ckcw f;
    public aujx g;

    public static boqv g(bwqv bwqvVar, bosj bosjVar, @dzsi boqu boquVar, dwyd dwydVar, @dzsi Integer num, @dzsi akqi akqiVar, boolean z) {
        Bundle bundle = new Bundle();
        if (boquVar != null) {
            bwqvVar.c(bundle, "SUBMIT_EDITS_CALLBACK", boquVar);
        }
        bosi i = bosjVar.i();
        bokf d = bosjVar.d();
        bokf bokfVar = new bokf();
        bokfVar.a(d.b());
        bokfVar.b = d.b;
        i.b(bokfVar);
        bundle.putSerializable("INITIAL_MODEL", i.a());
        bundle.putSerializable("MODEL", bosjVar);
        bundle.putSerializable("ENTRY_POINT", dwydVar);
        bundle.putSerializable("SOURCE_NOTIFICATION_ID", num);
        bundle.putBoolean("SHOULD_VERIFY_HOURS", z);
        if (akqiVar != null) {
            bundle.putSerializable("FEATURE_ID", akqiVar);
        }
        boqv boqvVar = new boqv();
        boqvVar.B(bundle);
        return boqvVar;
    }

    @Override // defpackage.ges
    protected final void Nv() {
        ((boqw) btsx.b(boqw.class, this)).db(this);
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof bbuf) {
            bbuf bbufVar = (bbuf) obj;
            if (!bbufVar.b().startsWith("business_hours_photo")) {
                bvoo.h("Received PhotoPick result with an unsupported label: %s", bbufVar.b());
                return;
            }
            bosn bosnVar = this.ak;
            if (bosnVar == null) {
                return;
            }
            bosnVar.k(bbufVar.a());
            return;
        }
        Object[] objArr = new Object[1];
        if (obj == null) {
            obj = "null";
        }
        objArr[0] = obj;
        bvoo.h("Received fragment result of an unsupported type: %s", objArr);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<bosv> c = this.b.c(new borj(), null);
        this.al = c;
        return c.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        super.am();
        bosn bosnVar = this.ak;
        if (bosnVar != null) {
            bosnVar.j();
        }
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        bosn bosnVar = this.ak;
        if (bosnVar == null) {
            return false;
        }
        return bosnVar.n();
    }

    public final void i() {
        gga ggaVar = this.aE;
        if (ggaVar == null) {
            return;
        }
        gz b = ggaVar.g().b();
        b.u(this);
        b.f();
        ggaVar.g().e();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = this.o;
        this.aj = (bosj) bundle2.getSerializable("INITIAL_MODEL");
        this.ad = (Integer) bundle2.getSerializable("SOURCE_NOTIFICATION_ID");
        this.am = bundle2.getBoolean("SHOULD_VERIFY_HOURS");
        this.ae = (akqi) bundle2.getSerializable("FEATURE_ID");
        Serializable serializable = bundle2.getSerializable("ENTRY_POINT");
        dbsk.s(serializable);
        dwyd dwydVar = (dwyd) serializable;
        try {
            this.af = (boqu) this.e.d(boqu.class, bundle2, "SUBMIT_EDITS_CALLBACK");
            if (bundle != null) {
                bundle2 = bundle;
            }
            bosj bosjVar = (bosj) bundle2.getSerializable("MODEL");
            this.ai = bosjVar;
            boso bosoVar = this.c;
            bosj bosjVar2 = this.aj;
            bosu bosuVar = this.ag;
            boolean z = this.af != null;
            boolean z2 = this.am;
            boso.a(this, 1);
            boso.a(bosjVar2, 2);
            boso.a(bosjVar, 3);
            boso.a(bosuVar, 4);
            boso.a(dwydVar, 5);
            Activity activity = (Activity) ((dxjd) bosoVar.a).a;
            boso.a(activity, 8);
            jmx a = bosoVar.b.a();
            boso.a(a, 9);
            cjqy a2 = bosoVar.c.a();
            boso.a(a2, 10);
            dzsj<bbut> dzsjVar = bosoVar.d;
            dzsj<boxa> dzsjVar2 = bosoVar.e;
            bnyd a3 = bosoVar.f.a();
            boso.a(a3, 13);
            cqkj a4 = bosoVar.g.a();
            boso.a(a4, 14);
            btvo a5 = bosoVar.h.a();
            boso.a(a5, 15);
            cqhn a6 = bosoVar.i.a();
            boso.a(a6, 16);
            this.ak = new bosn(this, bosjVar2, bosjVar, bosuVar, dwydVar, z, z2, activity, a, a2, dzsjVar, dzsjVar2, a3, a4, a5, a6);
        } catch (IOException unused) {
            bvoo.h("Error reading submitEditsCallback from storage.", new Object[0]);
            i();
        }
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bosn bosnVar = this.ak;
        if (bosnVar != null) {
            bosnVar.o();
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.al.e(this.ak);
        efg efgVar = this.a;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.w(this.al.c());
        egjVar.e(this);
        egjVar.F(null);
        egjVar.j(false);
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putSerializable("MODEL", this.ai);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.al.e(null);
        super.u();
    }
}
