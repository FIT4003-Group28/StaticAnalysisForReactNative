package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bhia  reason: default package */
/* loaded from: classes3.dex */
public final class bhia extends hxf {
    public cqkj b;
    public efg c;
    public bhhy d;
    private bhil e;
    private cqkf<bhil> f;

    @Override // defpackage.ges
    protected final void Nv() {
        ((bhib) btsx.b(bhib.class, this)).cL(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.f.e(null);
        super.Qe();
    }

    @Override // defpackage.hxf
    protected final jib g() {
        jhz a = jhz.a();
        a.x = false;
        a.f(new View.OnClickListener(this) { // from class: bhhz
            private final bhia a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bhia bhiaVar = this.a;
                if (bhiaVar.aD) {
                    bhiaVar.J().onBackPressed();
                }
            }
        });
        return a.b();
    }

    @Override // defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        cqkf<bhil> e = this.b.e(new bhik());
        this.f = e;
        e.e(this.e);
        return this.f.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Serializable serializable = ((Bundle) dbsc.a(bundle, this.o)).getSerializable("recommendedActionFlowProperties");
        dbsk.s(serializable);
        gga ggaVar = this.aE;
        dbsk.s(ggaVar);
        this.e = new bhim(ggaVar, (bhhx) serializable, this.d);
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        egjVar.e(this);
        this.c.a(egjVar.a());
    }
}
