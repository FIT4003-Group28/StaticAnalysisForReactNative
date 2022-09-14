package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: brcv  reason: default package */
/* loaded from: classes4.dex */
public final class brcv extends gen {
    public dehq a;
    @dzsi
    private brge ae;
    public cqkj b;
    public brdi c;
    public brda d;
    public cqhn e;
    private final brgd g = new brct(this);
    private final brgk ad = new brcu(this);

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        brge brgeVar = this.ae;
        if (brgeVar != null) {
            brgeVar.a();
        }
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf c = this.b.c(new brei(), viewGroup);
        c.e(this.ae);
        return c.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        this.ae = null;
        super.am();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        brge brgeVar = new brge(J(), this.g, this.ad, this.c, this.d, this.a, this.e);
        this.ae = brgeVar;
        brgeVar.a();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxo.aq;
    }
}
