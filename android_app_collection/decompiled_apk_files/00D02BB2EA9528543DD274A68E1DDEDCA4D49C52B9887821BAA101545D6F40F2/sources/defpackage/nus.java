package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
/* compiled from: PG */
/* renamed from: nus  reason: default package */
/* loaded from: classes7.dex */
public abstract class nus extends hxf implements oxf {
    public nvg b;
    public oya c;
    public cqkj d;
    public nvh e;
    private final jmz f = new jmz();

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        View aR = aR();
        if (aR != null) {
            this.f.a(aR);
        }
        super.Qe();
    }

    @dzsi
    protected final View aR() {
        return cqkx.d(this.P, oah.a);
    }

    @Override // defpackage.oxf
    public final void aS() {
    }

    @Override // defpackage.hxf
    protected View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        throw null;
    }

    @Override // defpackage.ges, defpackage.fd
    public void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.c = new oya();
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public void s() {
        super.s();
        this.b.f();
        this.c.i(this);
        this.f.b(aR());
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void u() {
        this.b.g();
        this.c.i(null);
        super.u();
    }
}
