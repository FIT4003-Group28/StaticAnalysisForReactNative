package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cdhp  reason: default package */
/* loaded from: classes4.dex */
public class cdhp extends gen {
    public anhp a;
    public cdip ad;
    public cdil ae;
    private akqq af;
    public cqkj b;
    public cdiq c;
    public dxio<ckcw> d;
    public akzh e;
    public Executor g;

    public static cdhp g(akqq akqqVar, dbsg<Integer> dbsgVar) {
        cdhp cdhpVar = new cdhp();
        Bundle bundle = new Bundle();
        bundle.putSerializable("ll", akqqVar);
        if (dbsgVar.a()) {
            bundle.putInt("title", dbsgVar.b().intValue());
        }
        cdhpVar.B(bundle);
        return cdhpVar;
    }

    private final void w(cdil cdilVar) {
        if (U()) {
            Ra(cdilVar);
        } else {
            this.ae = cdilVar;
        }
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(Object obj) {
        if (obj instanceof cdil) {
            cdil cdilVar = (cdil) obj;
            if (cdilVar.a().a().equals(akqi.a)) {
                ((ckcn) this.d.a().a(ckdz.ax)).a();
            }
            w(cdilVar);
        } else if (!(obj instanceof aeuf)) {
        } else {
            w(cdil.b(cdhl.e((aeuf) obj)));
        }
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void ak() {
        super.ak();
        if (this.ae != null) {
            this.g.execute(new Runnable(this) { // from class: cdhn
                private final cdhp a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cdhp cdhpVar = this.a;
                    cdhpVar.Ra(cdhpVar.ae);
                }
            });
        }
        cdip cdipVar = this.ad;
        dbsk.s(cdipVar);
        if (cdipVar.b == 2) {
            cdipVar.b = 4;
            cqkx.p(cdipVar);
        }
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        cqkf c = this.b.c(new cdij(), null);
        cdip cdipVar = this.ad;
        dbsk.s(cdipVar);
        c.e(cdipVar);
        gdf gdfVar = new gdf((Context) J(), false);
        gdfVar.setContentView(c.c());
        Window window = gdfVar.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.color.black_transparent);
        }
        return gdfVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        this.af = (akqq) dbsg.j((akqq) this.o.getSerializable("ll")).e(new dbty(this) { // from class: cdhm
            private final cdhp a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.e.g().S();
            }
        });
        cdiq cdiqVar = this.c;
        Integer valueOf = Integer.valueOf(this.o.getInt("title", R.string.IAMHERE_SELECT_PLACE));
        cdiq.a(this, 1);
        cdiq.a(valueOf, 2);
        cqhn a = cdiqVar.a.a();
        cdiq.a(a, 3);
        dxio a2 = ((dxjh) cdiqVar.b).a();
        cdiq.a(a2, 4);
        this.ad = new cdip(this, valueOf, a, a2);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyd.w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q() {
        anhp anhpVar = this.a;
        dwjc bZ = dwjd.i.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwjd dwjdVar = (dwjd) bZ.b;
        int i = dwjdVar.a | 2;
        dwjdVar.a = i;
        dwjdVar.b = 6;
        dwjdVar.a = i | 4;
        dwjdVar.c = 2;
        dwjd.c(dwjdVar);
        akqq akqqVar = this.af;
        dbsk.s(akqqVar);
        anhpVar.a(bZ.bK(), akqqVar, 3, new cdho(this));
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        q();
    }
}
