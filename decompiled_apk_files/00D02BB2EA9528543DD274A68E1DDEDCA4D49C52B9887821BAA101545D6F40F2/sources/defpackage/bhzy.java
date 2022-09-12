package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bhzy  reason: default package */
/* loaded from: classes3.dex */
public final class bhzy extends ges {
    @dzsi
    private static bwrs<ilo> g;
    public biad a;
    public bwqv b;
    public efg c;
    public cqkj d;
    @dzsi
    biac e;
    public busy f;

    public static bhzy g(bwqv bwqvVar, bwrs<ilo> bwrsVar) {
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "PLACEMARK_REF_KEY", bwrsVar);
        bhzy bhzyVar = new bhzy();
        bhzyVar.B(bundle);
        return bhzyVar;
    }

    @Override // defpackage.ges
    public final void Nv() {
        ((bhzz) btsx.b(bhzz.class, this)).cO(this);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        super.ag(layoutInflater, viewGroup, bundle);
        cqkj cqkjVar = this.d;
        dbsk.s(cqkjVar);
        cqkf c = cqkjVar.c(new bhzl(), viewGroup);
        biad biadVar = this.a;
        bwrs<ilo> bwrsVar = g;
        dbsk.s(bwrsVar);
        ff ffVar = (ff) ((dxjd) biadVar.a).a;
        biad.a(ffVar, 1);
        amfi a = biadVar.b.a();
        biad.a(a, 2);
        axwy a2 = biadVar.c.a();
        biad.a(a2, 3);
        biad.a(this, 4);
        biad.a(bwrsVar, 5);
        this.e = new biac(ffVar, a, a2, this, bwrsVar);
        bwrs<ilo> bwrsVar2 = g;
        dbsk.s(bwrsVar2);
        ilo c2 = bwrsVar2.c();
        dbsk.s(c2);
        dndr bj = c2.bj();
        duka bZ = dukb.c.bZ();
        dbsk.s(bj);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dukb dukbVar = (dukb) bZ.b;
        dukbVar.b = bj.h;
        dukbVar.a |= 1;
        this.f.a(bZ.bK(), new bhzx(this), bvrj.UI_THREAD);
        biac biacVar = this.e;
        dbsk.s(biacVar);
        c.e(biacVar);
        return c.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        try {
            bwqv bwqvVar = this.b;
            Bundle bundle2 = this.o;
            dbsk.s(bundle2);
            g = bwqvVar.e(ilo.class, bundle2, "PLACEMARK_REF_KEY");
        } catch (IOException e) {
            throw new RuntimeException("Cannot create AliasStickerSelectionFragment without a Placemark", e);
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxj.ah;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        efg efgVar = this.c;
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.ag(null);
        efgVar.a(egjVar.a());
    }
}
