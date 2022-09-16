package defpackage;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: xgz  reason: default package */
/* loaded from: classes7.dex */
public final class xgz extends gen implements crzp<xfc> {
    public gdc a;
    public dxio<afha> ad;
    @dzsi
    private cqkf<xgs> ae;
    @dzsi
    private xhe af;
    private diyj ag;
    @dzsi
    private CharSequence ah;
    @dzsi
    private String ai;
    public cqkj b;
    public eiq c;
    public cjqy d;
    public Executor e;
    public xfc g;

    public static void g(Bundle bundle, diyj diyjVar, @dzsi CharSequence charSequence, @dzsi String str) {
        bundle.putCharSequence("dcn_bundle_key", charSequence);
        bundle.putString("tpaid_bundle_key", str);
        bvrs.k(bundle, "old_bundle_key", diyjVar);
    }

    @Override // defpackage.crzp
    public final void On(crzm<xfc> crzmVar) {
        xew xewVar = (xew) this.g;
        this.ah = xewVar.g;
        String str = xewVar.h;
        this.ai = str;
        xhe xheVar = this.af;
        if (xheVar != null) {
            xheVar.s(this.ah, str);
            cqkx.p(this.af);
        }
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        cqkf<xgs> cqkfVar = this.ae;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        Bundle bundle2 = (Bundle) dbsc.a(bundle, this.o);
        this.ag = (diyj) bvrs.g(bundle2, "old_bundle_key", (dssr) diyj.i.cu(7), diyj.i);
        this.ah = bundle2.getString("dcn_bundle_key");
        this.ai = bundle2.getString("tpaid_bundle_key");
        this.g.g().b(this, this.e);
        this.af = new xhe(J(), this.ad, new Runnable(this) { // from class: xgy
            private final xgz a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.aT();
            }
        }, this.ag, this.c, this.d, this.ah, this.ai);
        cqkf<xgs> e = this.b.e(new xga());
        this.ae = e;
        e.e(this.af);
        gcz a = this.a.a();
        a.i = cjtd.a(dtyc.dS);
        gde a2 = a.a();
        a2.requestWindowFeature(1);
        Window window = a2.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        a2.c(e.c());
        return a2;
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return dtyc.dS;
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        g(bundle, this.ag, this.ah, this.ai);
    }
}
