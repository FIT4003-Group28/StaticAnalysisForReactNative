package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.udc.UdcCacheResponse;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bbda  reason: default package */
/* loaded from: classes3.dex */
public final class bbda extends ges implements bbpc {
    public efg a;
    private cqkf<bbnh> ad;
    private bwrs<ilo> ae;
    public bwqv b;
    public cqkj c;
    public bbpe d;
    public bzqc e;
    public cpv f;
    private bbpd g;

    @Override // defpackage.ges
    protected final void Nv() {
        ((bbdb) btsx.b(bbdb.class, this)).cE(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ges
    public final void Oo(View view) {
        g();
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<bbnh> e = this.c.e(new bbkw());
        this.ad = e;
        return e.c();
    }

    public final void g() {
        View a;
        cqkf<bbnh> cqkfVar = this.ad;
        if (cqkfVar == null || (a = cqhu.a(cqkfVar.c(), bbkw.a)) == null) {
            return;
        }
        this.f.f(a, a.getContentDescription());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null && (bundle = this.o) == null) {
            bundle = new Bundle();
        }
        dehn<UdcCacheResponse> a = bundle.getBoolean("fetch") ? this.e.a(dcdc.f(bzqb.WEB_AND_APP_ACTIVITY)) : null;
        try {
            bwrs<ilo> e = this.b.e(ilo.class, bundle, "pm");
            dbsk.s(e);
            this.ae = e;
            bbpe bbpeVar = this.d;
            Runnable runnable = new Runnable(this) { // from class: bbcz
                private final bbda a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    gn gnVar = this.a.A;
                    if (gnVar != null) {
                        gnVar.f();
                    }
                }
            };
            btvo a2 = bbpeVar.a.a();
            bbpe.a(a2, 1);
            dxio a3 = ((dxjh) bbpeVar.b).a();
            bbpe.a(a3, 2);
            dxio a4 = ((dxjh) bbpeVar.c).a();
            bbpe.a(a4, 3);
            dxio a5 = ((dxjh) bbpeVar.d).a();
            bbpe.a(a5, 4);
            dxio a6 = ((dxjh) bbpeVar.e).a();
            bbpe.a(a6, 5);
            cklf a7 = bbpeVar.f.a();
            bbpe.a(a7, 6);
            cqhn a8 = bbpeVar.g.a();
            bbpe.a(a8, 7);
            bbol a9 = bbpeVar.h.a();
            bbpe.a(a9, 8);
            bbpe.a(e, 9);
            bbpe.a(runnable, 10);
            bbpe.a(this, 12);
            this.g = new bbpd(a2, a3, a4, a5, a6, a7, a8, a9, e, runnable, a, this);
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxy.aW;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.ad.e(this.g);
        this.b.g(this.ae, this.g);
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        egjVar.e(this);
        this.a.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.b.c(bundle, "pm", this.ae);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.ad.e(null);
        bwqv.t(this.ae, this.g);
        super.u();
    }
}
