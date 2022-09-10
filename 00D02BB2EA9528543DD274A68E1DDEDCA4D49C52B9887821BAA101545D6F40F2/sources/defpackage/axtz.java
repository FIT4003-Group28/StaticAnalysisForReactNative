package defpackage;

import android.app.Dialog;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: axtz  reason: default package */
/* loaded from: classes3.dex */
public final class axtz extends gen {
    @dzsi
    public axub a;
    @dzsi
    private axtv ad;
    private final akey ae = new axty(this);
    public bwqv b;
    public cqkj c;
    public axvm d;
    public dxio<cjqy> e;
    @dzsi
    private axve g;

    public static axtz g(bwqv bwqvVar, dndp dndpVar, axuc axucVar) {
        axtz axtzVar = new axtz();
        axtzVar.B(axtv.a(bwqvVar, dndpVar, axucVar));
        return axtzVar;
    }

    @Override // defpackage.gen
    public final void aX() {
        axve axveVar = this.g;
        czhx.d(axveVar);
        this.e.a().i(axveVar.c());
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        axtv axtvVar = this.ad;
        czhx.d(axtvVar);
        axve axveVar = this.g;
        czhx.d(axveVar);
        return axtvVar.c(axveVar);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.ad = new axtv(J(), this.b, this.c);
        Bundle bundle2 = this.o;
        axtv axtvVar = this.ad;
        czhx.d(axtvVar);
        axuc b = axtvVar.b(bundle2);
        this.a = b != null ? b.a(axtvVar.a) : null;
        axvm axvmVar = this.d;
        czhx.d(this.ad);
        dndp d = axtv.d(bundle2);
        czhx.d(d);
        akey akeyVar = this.ae;
        ff ffVar = (ff) ((dxjd) axvmVar.a).a;
        axvm.a(ffVar, 1);
        akfc a = axvmVar.b.a();
        axvm.a(a, 2);
        cklf a2 = axvmVar.c.a();
        axvm.a(a2, 3);
        axvm.a(d, 4);
        axvm.a(akeyVar, 5);
        this.g = new axvl(ffVar, a, a2, d, akeyVar);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxj.ab;
    }
}
