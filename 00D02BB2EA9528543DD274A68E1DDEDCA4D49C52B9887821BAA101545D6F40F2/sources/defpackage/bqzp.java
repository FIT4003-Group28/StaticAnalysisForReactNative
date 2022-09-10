package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bqzp  reason: default package */
/* loaded from: classes4.dex */
public final class bqzp extends gen {
    public cqkj a;
    public bssh b;
    private cqkf<bssv> c;

    @Override // defpackage.ges, defpackage.fd
    public final void al() {
        aT();
        super.al();
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        gdf gdfVar = new gdf((Context) J(), false);
        gdfVar.setContentView(this.c.c());
        return gdfVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.c = this.a.c(new brjq(), null);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxu.es;
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        cqkf<bssv> cqkfVar = this.c;
        bssh bsshVar = this.b;
        bssh.a(this, 1);
        dxio a = ((dxjh) bsshVar.a).a();
        bssh.a(a, 2);
        cqkfVar.e(new bssg(this, a));
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void u() {
        this.c.e(null);
        super.u();
    }
}
