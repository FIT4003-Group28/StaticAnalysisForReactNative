package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: bszx  reason: default package */
/* loaded from: classes4.dex */
public final class bszx extends bszv {
    public cqkj ad;
    public efg ae;
    private cqkf af;
    private bszz ag;

    @Override // defpackage.bszv, defpackage.aup, defpackage.fd
    public final void Qe() {
        super.Qe();
        this.af.e(null);
    }

    @Override // defpackage.bszv
    protected final String aQ() {
        return null;
    }

    @Override // defpackage.bszv, defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf d = this.ad.d(new bszy(), viewGroup, false);
        this.af = d;
        d.e(this.ag);
        return null;
    }

    @Override // defpackage.bszv, defpackage.aup, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.ag = new bszz();
    }

    @Override // defpackage.aup
    public final void p(Bundle bundle) {
    }

    @Override // defpackage.bszv, defpackage.aup, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.w(this.af.c());
        egjVar.ag(null);
        this.ae.a(egjVar.a());
    }
}
