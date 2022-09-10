package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ayzh  reason: default package */
/* loaded from: classes3.dex */
public final class ayzh extends ges {
    public bwqv a;
    public efg b;
    public cqkj c;
    public azbt d;
    @dzsi
    public azbs e;
    @dzsi
    private cqkf<azbb> f;
    private bwrs<dcdc<ilo>> g;

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<azbb> c = this.c.c(new azaa(), null);
        this.f = c;
        dbsk.s(c);
        c.e(this.e);
        cqkf<azbb> cqkfVar = this.f;
        dbsk.s(cqkfVar);
        return cqkfVar.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        try {
            bwrs<dcdc<ilo>> e = this.a.e(dcdc.class, bundle, "new_list_placemark");
            dbsk.s(e);
            this.g = e;
            azbt azbtVar = this.d;
            dcdc<ilo> c = e.c();
            dbsk.s(c);
            ayzf ayzfVar = new ayzf(this);
            gga a = azbtVar.a.a();
            azbt.a(a, 1);
            azbt.a(azbtVar.b.a(), 2);
            axwi a2 = azbtVar.c.a();
            azbt.a(a2, 3);
            aydu a3 = azbtVar.d.a();
            azbt.a(a3, 4);
            ayay a4 = azbtVar.e.a();
            azbt.a(a4, 5);
            Executor a5 = azbtVar.f.a();
            azbt.a(a5, 6);
            Executor a6 = azbtVar.g.a();
            azbt.a(a6, 7);
            cjqy a7 = azbtVar.h.a();
            azbt.a(a7, 8);
            azbt.a(c, 9);
            azbt.a(ayzfVar, 10);
            this.e = new azbs(a, a2, a3, a4, a5, a6, a7, c, ayzfVar);
        } catch (IOException e2) {
            Throwable cause = e2.getCause();
            dbsk.s(cause);
            dbue.b(cause);
            Throwable cause2 = e2.getCause();
            dbsk.s(cause2);
            throw new RuntimeException(cause2);
        }
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return dtyb.y;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.ag(null);
        cqkf<azbb> cqkfVar = this.f;
        dbsk.s(cqkfVar);
        egjVar.w(cqkfVar.c());
        egjVar.av(null);
        egjVar.ak(jkc.q, jkc.q);
        egjVar.ai(jjn.FULLY_EXPANDED);
        egf a = egf.a();
        a.n();
        egjVar.A(a);
        egjVar.J(new egq(this) { // from class: ayzg
            private final ayzh a;

            {
                this.a = this;
            }

            @Override // defpackage.egq
            public final void Qs(egu eguVar) {
                azbs azbsVar;
                ayzh ayzhVar = this.a;
                if (!ayzhVar.aD || (azbsVar = ayzhVar.e) == null) {
                    return;
                }
                azbsVar.b().j();
            }
        });
        egjVar.e(this);
        this.b.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.a.c(bundle, "new_list_placemark", this.g);
    }
}
