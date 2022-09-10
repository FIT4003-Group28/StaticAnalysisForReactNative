package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: aref  reason: default package */
/* loaded from: classes2.dex */
public final class aref extends ges {
    public acyp a;
    public ariy b;
    public efg c;
    public cqkj d;

    @Override // defpackage.ges
    protected final void Nv() {
        ((areg) btsx.b(areg.class, this)).ci(this);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cqkf c = this.d.c(new argp(), viewGroup);
        c.e(this.b);
        return c.c();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxv.et;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        egjVar.x(egr.a);
        if (this.a.c()) {
            egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        }
        this.c.a(egjVar.a());
        this.b.b();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.b.c();
        super.u();
    }
}
