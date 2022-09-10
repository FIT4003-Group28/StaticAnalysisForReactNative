package defpackage;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: awbc  reason: default package */
/* loaded from: classes3.dex */
public final class awbc extends awnw {
    public cqkj a;
    public dzsj<awbo> b;
    private cqkf<awbm> c;

    @Override // defpackage.ges
    protected final void Nv() {
        dxix.a(this);
    }

    @Override // defpackage.awnw
    protected final View i() {
        cqkf<awbm> c = this.a.c(new awbk(), (ViewGroup) this.P);
        this.c = c;
        c.e(this.b.a());
        return this.c.c();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxx.bm;
    }

    @Override // defpackage.awnw, defpackage.ges, defpackage.fd
    public final void u() {
        this.c.e(null);
        super.u();
    }
}
