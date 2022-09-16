package defpackage;

import android.app.Dialog;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: axua  reason: default package */
/* loaded from: classes3.dex */
public final class axua extends gen {
    public bwqv a;
    public cqkj b;
    public axvo c;
    public dxio<cjqy> d;
    @dzsi
    private axve e;
    @dzsi
    private axtv g;

    public static axua g(bwqv bwqvVar, dndp dndpVar, axuc axucVar) {
        axua axuaVar = new axua();
        axuaVar.B(axtv.a(bwqvVar, dndpVar, axucVar));
        return axuaVar;
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
        axvo axvoVar = this.c;
        czhx.d(this.g);
        dndp d = axtv.d(bundle2);
        czhx.d(d);
        axtv axtvVar = this.g;
        czhx.d(axtvVar);
        axuc b = axtvVar.b(bundle2);
        czhx.d(b);
        ff ffVar = (ff) ((dxjd) axvoVar.a).a;
        axvo.a(ffVar, 1);
        cklf a = axvoVar.b.a();
        axvo.a(a, 2);
        dzsj<axwy> dzsjVar = axvoVar.c;
        axvo.a(d, 4);
        axvo.a(b, 5);
        this.e = new axvn(ffVar, a, dzsjVar, d, b);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxj.ae;
    }
}
