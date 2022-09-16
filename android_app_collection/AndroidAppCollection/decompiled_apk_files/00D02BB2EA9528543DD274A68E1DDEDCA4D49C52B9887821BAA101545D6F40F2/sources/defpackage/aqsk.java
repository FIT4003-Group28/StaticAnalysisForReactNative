package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: aqsk  reason: default package */
/* loaded from: classes2.dex */
public final class aqsk extends ges {
    public efg a;
    public cqkj b;
    public aqso c;
    @dzsi
    private cumb d;
    @dzsi
    private apzg e;
    @dzsi
    private cqkf<cqkp> f;
    private aqsn g;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        aqsn aqsnVar = this.g;
        if (aqsnVar != null) {
            aqsnVar.o();
            this.g = null;
        }
        cqkf<cqkp> cqkfVar = this.f;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<cqkp> e = this.b.e(new aqsl());
        this.f = e;
        View c = e.c();
        cumb cumbVar = c == null ? null : (cumb) cqhu.a(c, aqsl.a);
        this.d = cumbVar;
        aqso aqsoVar = this.c;
        apzg apzgVar = this.e;
        gga a = aqsoVar.a.a();
        aqso.a(a, 1);
        bvrb a2 = aqsoVar.b.a();
        aqso.a(a2, 2);
        apyv a3 = aqsoVar.c.a();
        aqso.a(a3, 3);
        dxio a4 = ((dxjh) aqsoVar.d).a();
        aqso.a(a4, 4);
        dxio a5 = ((dxjh) aqsoVar.e).a();
        aqso.a(a5, 5);
        aqso.a(this, 8);
        aqsn aqsnVar = new aqsn(a, a2, a3, a4, a5, apzgVar, cumbVar, this);
        this.g = aqsnVar;
        this.f.e(aqsnVar);
        return c;
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        gga ggaVar = this.aE;
        if (ggaVar != null) {
            ggaVar.g().f();
            return true;
        }
        return true;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = this.o;
        if (bundle2 == null) {
            return;
        }
        this.e = (apzg) bundle2.getSerializable("keyOpenPhotoLightboxParams");
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.w(this.P);
        egjVar.F(null);
        egjVar.j(false);
        this.a.a(egjVar.a());
        aqsn aqsnVar = this.g;
        if (aqsnVar != null) {
            aqsnVar.m();
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        super.u();
        aqsn aqsnVar = this.g;
        if (aqsnVar != null) {
            aqsnVar.n();
        }
    }
}
