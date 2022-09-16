package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
/* compiled from: PG */
/* renamed from: btde  reason: default package */
/* loaded from: classes4.dex */
public final class btde extends hxf {
    public efg b;
    public cqkj c;
    @dzsi
    private cqkf<btdn> d;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        cqkf<btdn> cqkfVar = this.d;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        this.d = null;
    }

    @Override // defpackage.hxf
    protected final jib g() {
        return jib.g(J(), dbsj.e("Ripples Playground")).e().b();
    }

    @Override // defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, Bundle bundle) {
        return this.d.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        cqkf<btdn> c = this.c.c(new btdm(), null);
        this.d = c;
        btda btdaVar = (btda) btdr.c();
        String str = btdaVar.a == null ? " rippleViewModels" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        c.e(new btdb(btdaVar.a));
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        efg efgVar = this.b;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.w(this.P);
        efgVar.a(egjVar.a());
    }
}
