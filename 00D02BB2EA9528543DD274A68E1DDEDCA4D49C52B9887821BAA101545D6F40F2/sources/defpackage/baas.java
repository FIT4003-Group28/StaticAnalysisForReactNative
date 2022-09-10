package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: baas  reason: default package */
/* loaded from: classes3.dex */
public final class baas extends hxf {
    public acyp b;
    public bafm c;
    public gga d;
    public efg e;
    public cqkj f;
    private cqkf<baem> g;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        this.g.e(null);
    }

    @Override // defpackage.hxf
    protected final jib g() {
        jhz a = jhz.a();
        a.a = Ro(R.string.BUSINESS_FOLLOWINGS_LEAF_PAGE_TITLE);
        a.k = new jia(this) { // from class: baar
            private final baas a;

            {
                this.a = this;
            }

            @Override // defpackage.jia
            public final void a(View view) {
                baas baasVar = this.a;
                if (baasVar.aD) {
                    baasVar.d.g().e();
                }
            }
        };
        return a.b();
    }

    @Override // defpackage.hxf
    public final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        cqkf<baem> e = this.f.e(new babc());
        this.g = e;
        dbsk.s(e);
        return e.c();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxy.ad;
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        bafm bafmVar = this.c;
        bafm.a(bafmVar.a.a(), 1);
        Executor a = bafmVar.b.a();
        bafm.a(a, 2);
        beya a2 = bafmVar.c.a();
        bafm.a(a2, 3);
        bbaa a3 = bafmVar.d.a();
        bafm.a(a3, 4);
        gga a4 = bafmVar.e.a();
        bafm.a(a4, 5);
        bafk a5 = bafmVar.f.a();
        bafm.a(a5, 6);
        bafm.a(this, 7);
        bafl baflVar = new bafl(a, a2, a3, a4, a5, this);
        baflVar.d();
        this.g.e(baflVar);
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.ag(null);
        egf a6 = egf.a();
        a6.s = true;
        egjVar.A(a6);
        if (this.b.c()) {
            egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        }
        this.e.a(egjVar.a());
    }
}
