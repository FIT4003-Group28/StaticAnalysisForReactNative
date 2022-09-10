package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: beix  reason: default package */
/* loaded from: classes3.dex */
public final class beix extends beiv<benw> {
    public Executor ah;
    public cqkj ai;
    public beqa aj;
    private final crzp<apsi<dbsg<dgac>>> ak;
    private bepz al;

    public beix() {
        super(true);
        this.ak = new beiw(this);
    }

    @Override // defpackage.beiv, defpackage.ges, defpackage.fd
    public final void Qe() {
        crzm<apsi<dbsg<dgac>>> a;
        super.Qe();
        bwrs<ilo> bwrsVar = this.ae;
        if (bwrsVar == null || (a = this.f.a(bwrsVar)) == null) {
            return;
        }
        a.c(this.ak);
    }

    @Override // defpackage.beiv
    protected final String aR() {
        return this.b.getString(R.string.MERCHANT_PANEL_CALLS_PAGE_TITLE);
    }

    @Override // defpackage.hxf
    public final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        crzm<apsi<dbsg<dgac>>> a;
        aS();
        bwrs<ilo> bwrsVar = this.ae;
        if (bwrsVar != null && (a = this.f.a(bwrsVar)) != null) {
            a.a(this.ak, this.ah);
        }
        this.af = this.ai.e(new belg());
        this.af.e(this.al);
        return this.af.c();
    }

    @Override // defpackage.beiv, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        bwrs<ilo> bwrsVar;
        super.l(bundle);
        try {
            this.ae = this.d.e(ilo.class, this.o, "MerchantCallsFragment.placemark");
            bwrs<bvrt<benb>> bwrsVar2 = this.ad;
            if (bwrsVar2 == null || (bwrsVar = this.ae) == null) {
                return;
            }
            beqa beqaVar = this.aj;
            ff ffVar = (ff) ((dxjd) beqaVar.a).a;
            beqa.a(ffVar, 1);
            cqhn a = beqaVar.b.a();
            beqa.a(a, 2);
            beqa.a(beqaVar.c.a(), 3);
            bgyb a2 = beqaVar.d.a();
            beqa.a(a2, 4);
            dxio a3 = ((dxjh) beqaVar.e).a();
            beqa.a(a3, 5);
            bepf a4 = beqaVar.f.a();
            beqa.a(a4, 6);
            bepo a5 = beqaVar.g.a();
            beqa.a(a5, 7);
            beqa.a(beqaVar.h.a(), 8);
            beid a6 = beqaVar.i.a();
            beqa.a(a6, 9);
            beie a7 = beqaVar.j.a();
            beqa.a(a7, 10);
            bepv a8 = beqaVar.k.a();
            beqa.a(a8, 11);
            Executor a9 = beqaVar.l.a();
            beqa.a(a9, 12);
            beqa.a(bwrsVar2, 13);
            beqa.a(bwrsVar, 14);
            bepz bepzVar = new bepz(ffVar, a, a2, a3, a4, a5, a6, a7, a8, a9, bwrsVar2, bwrsVar);
            this.al = bepzVar;
            bepzVar.n();
            this.ag = this.al;
            aT();
        } catch (IOException e) {
            bvoo.j(e);
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxv.aQ;
    }
}
