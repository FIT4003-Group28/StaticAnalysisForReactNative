package defpackage;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: cchc  reason: default package */
/* loaded from: classes4.dex */
public final class cchc extends ges implements btzi<duvz, duwb> {
    public gga a;
    public jnq ad;
    @dzsi
    public ddho ae;
    @dzsi
    public String af;
    public bupr ag;
    private cchx ah;
    @dzsi
    private dinw ai;
    private cqkf<ccii> aj;
    private final ccia ak = new ccgw(this);
    private final ccia al = new ccgx(this);
    private final jco am = new ccgy(this);
    private duwb an;
    public akfa b;
    public cqkj c;
    public ccif d;
    public cafi e;
    public efg f;
    public cpv g;

    private final void aJ() {
        this.aj.e(this.ah);
        this.aj.c().invalidate();
    }

    public static cchc g(@dzsi ddho ddhoVar, @dzsi dinw dinwVar, @dzsi String str) {
        cchc cchcVar = new cchc();
        Bundle bundle = new Bundle();
        if (ddhoVar != null) {
            bundle.putInt("arg_key_entry_point_ve_type", ddhoVar.b());
        }
        bundle.putByteArray("arg_key_opt_in_proto", dinwVar == null ? null : dinwVar.bS());
        bundle.putString("arg_key_intent_url", str);
        cchcVar.B(bundle);
        return cchcVar;
    }

    private final void q(boolean z) {
        boolean c = this.b.c();
        ArrayList arrayList = new ArrayList();
        dinx bZ = dioc.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dioc diocVar = (dioc) bZ.b;
        diocVar.b = 1;
        diocVar.a = 1 | diocVar.a;
        arrayList.add(new ccgt(bZ.bK(), false, null, c, z, this.a));
        this.ah = new cchx(this.a, arrayList, this.am);
    }

    private final void w(int i) {
        boolean c = this.b.c();
        ArrayList arrayList = new ArrayList();
        Iterator<dioc> it = this.ai.a.iterator();
        while (it.hasNext()) {
            arrayList.add(new ccgt(it.next(), it.hasNext(), it.hasNext() ? this.ak : this.al, c, false, this.a));
        }
        cchx cchxVar = new cchx(this.a, arrayList, this.am);
        this.ah = cchxVar;
        cchxVar.e(i);
        jnq jnqVar = this.ad;
        if (jnqVar != null) {
            this.g.f(jnqVar, this.ah.f());
        }
    }

    @Override // defpackage.btzi
    public final void QY(btzr<duvz> btzrVar, btzy btzyVar) {
        if (!this.aD) {
            return;
        }
        ppw.b(J(), new ccha(this), new cchb(this));
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<duvz> btzrVar, duwb duwbVar) {
        duwb duwbVar2 = duwbVar;
        if (!this.aD) {
            return;
        }
        this.an = duwbVar2;
        if (duwbVar2.b) {
            dinw dinwVar = duwbVar2.e;
            if (dinwVar == null) {
                dinwVar = dinw.b;
            }
            this.ai = dinwVar;
            w(0);
            aJ();
            return;
        }
        q(false);
        aJ();
        AlertDialog create = new AlertDialog.Builder(J()).setMessage(duwbVar2.c).setPositiveButton(R.string.OK_BUTTON, new ccgz(this)).create();
        create.setCanceledOnTouchOutside(false);
        create.show();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        this.aj.e(null);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cqkf<ccii> d = this.c.d(new cckm(), viewGroup, false);
        this.aj = d;
        d.e(this.ah);
        jnq jnqVar = (jnq) cqkx.e(this.aj.c(), cckm.a, jnq.class);
        this.ad = jnqVar;
        jnqVar.setCurrentItem(this.ah.c().intValue());
        return this.aj.c();
    }

    public final void i() {
        bupr buprVar = this.ag;
        duvy bZ = duvz.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        duvz duvzVar = (duvz) bZ.b;
        duvzVar.a |= 4;
        duvzVar.b = true;
        buprVar.a(bZ.bK(), this, bvrj.UI_THREAD);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = this.o;
        if (bundle2.containsKey("arg_key_entry_point_ve_type")) {
            this.ae = cjth.d(bundle2.getInt("arg_key_entry_point_ve_type"));
        }
        this.af = bundle2.getString("arg_key_intent_url");
        if (bundle != null) {
            this.ai = (dinw) bvrs.b(bundle.getByteArray("arg_key_opt_in_proto"), (dssr) dinw.b.cu(7));
        } else {
            this.ai = (dinw) bvrs.b(bundle2.getByteArray("arg_key_opt_in_proto"), (dssr) dinw.b.cu(7));
        }
        int i = bundle == null ? 0 : bundle.getInt("arg_key_current_page");
        dinw dinwVar = this.ai;
        if (dinwVar == null) {
            q(true);
        } else if (dinwVar.a.size() == 0) {
            this.d.c(this.ae, this.af);
        } else {
            w(i);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        efg efgVar = this.f;
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.ad(false);
        egjVar.f(false);
        egjVar.ag(null);
        efgVar.a(egjVar.a());
        if (this.ai == null && this.an == null) {
            q(true);
            aJ();
            i();
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putInt("arg_key_current_page", this.ah.c().intValue());
        dinw dinwVar = this.ai;
        bundle.putByteArray("arg_key_opt_in_proto", dinwVar == null ? null : dinwVar.bS());
    }
}
