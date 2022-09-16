package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: ccgu  reason: default package */
/* loaded from: classes4.dex */
public final class ccgu extends gen {
    public cqkj a;
    public dxio<ccif> b;
    @dzsi
    private dinw c;
    private ccic d;

    public static ccgu g(@dzsi dinw dinwVar) {
        ccgu ccguVar = new ccgu();
        Bundle bundle = new Bundle();
        bundle.putByteArray("arg_key_opt_in_flow_proto", dinwVar == null ? null : dinwVar.bS());
        ccguVar.B(bundle);
        return ccguVar;
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cqkf c = this.a.c(new ccin(), viewGroup);
        c.e(this.d);
        return c.c();
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        return new gdf((Context) J(), false);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.c = (dinw) bvrs.b(this.o.getByteArray("arg_key_opt_in_flow_proto"), (dssr) dinw.b.cu(7));
        this.d = new ccgv(this.b, this, this.c);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxu.aj;
    }
}
