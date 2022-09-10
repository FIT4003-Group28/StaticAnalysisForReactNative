package defpackage;

import android.app.Dialog;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: axtx  reason: default package */
/* loaded from: classes3.dex */
public final class axtx extends gen {
    public bwqv a;
    @dzsi
    private awnl ad;
    public cqkj b;
    public axvk c;
    public dxio<cjqy> d;
    @dzsi
    private axve e;
    @dzsi
    private axtv g;

    public static axtx g(bwqv bwqvVar, dndp dndpVar, axuc axucVar) {
        axtx axtxVar = new axtx();
        axtxVar.B(axtv.a(bwqvVar, dndpVar, axucVar));
        return axtxVar;
    }

    @Override // defpackage.gen
    public final void aX() {
        axve axveVar = this.e;
        czhx.d(axveVar);
        this.d.a().i(axveVar.c());
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        axtv axtvVar = this.g;
        czhx.d(axtvVar);
        axve axveVar = this.e;
        czhx.d(axveVar);
        return axtvVar.c(axveVar);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.g = new axtv(J(), this.a, this.b);
        Bundle bundle2 = this.o;
        axtv axtvVar = this.g;
        czhx.d(axtvVar);
        axuc b = axtvVar.b(bundle2);
        czhx.d(b);
        this.ad = new axtw(b);
        axvk axvkVar = this.c;
        czhx.d(this.g);
        dndp d = axtv.d(bundle2);
        czhx.d(d);
        awnl awnlVar = this.ad;
        czhx.d(awnlVar);
        ff ffVar = (ff) ((dxjd) axvkVar.a).a;
        axvk.a(ffVar, 1);
        cklf a = axvkVar.b.a();
        axvk.a(a, 2);
        axvk.a(d, 3);
        axvk.a(awnlVar, 4);
        bzpr a2 = axvkVar.c.a();
        axvk.a(a2, 5);
        this.e = new axvj(ffVar, a, d, awnlVar, a2);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxj.Y;
    }
}
