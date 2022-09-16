package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.ugc.disclosure.PublicDisclosureLayout$PublicDisclosureViewModelImpl;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bjle  reason: default package */
/* loaded from: classes3.dex */
public final class bjle extends ges {
    private static final dcqe e = dcqe.c("bjle");
    public bwqv a;
    public efg b;
    public cqkj c;
    public bjoe d;
    private bjod f;
    private cqkf<bjoa> g;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<bjoa> cqkfVar;
        super.Qe();
        if (this.f == null || (cqkfVar = this.g) == null) {
            return;
        }
        cqkfVar.e(null);
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkj cqkjVar = this.c;
        dbsk.s(cqkjVar);
        cqkf<bjoa> d = cqkjVar.d(new bjnz(), viewGroup, false);
        this.g = d;
        d.e(this.f);
        return this.g.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        ilo iloVar;
        super.l(bundle);
        try {
            bwqv bwqvVar = this.a;
            dbsk.s(bwqvVar);
            bwrs e2 = bwqvVar.e(ilo.class, this.o, "key_placemark_ref");
            dbsk.s(e2);
            iloVar = (ilo) e2.c();
            dbsk.s(iloVar);
        } catch (IOException unused) {
            bvoo.h("EditQuestionPageFragment cannot be created without a placemark", new Object[0]);
            iloVar = null;
        }
        ilo iloVar2 = iloVar;
        String str = (String) dbsg.j(this.o.getString("key_preset_text")).c("");
        bjoe bjoeVar = this.d;
        dbsk.s(iloVar2);
        bjoe.a(this, 1);
        bjoe.a(iloVar2, 2);
        bjoe.a(str, 3);
        PublicDisclosureLayout$PublicDisclosureViewModelImpl a = bjoeVar.a.a();
        bjoe.a(a, 4);
        gga a2 = bjoeVar.b.a();
        bjoe.a(a2, 5);
        bjod bjodVar = new bjod(this, iloVar2, str, a, a2);
        this.f = bjodVar;
        bjodVar.g(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        efg efgVar = this.b;
        dbsk.s(efgVar);
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.w(this.P);
        efgVar.a(egjVar.a());
    }
}
