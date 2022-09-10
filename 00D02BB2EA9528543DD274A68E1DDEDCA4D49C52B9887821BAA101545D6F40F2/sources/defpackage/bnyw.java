package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bnyw  reason: default package */
/* loaded from: classes3.dex */
public final class bnyw extends gen {
    public cqkj a;
    @dzsi
    private cqkf<jam> b;
    @dzsi
    private jam c;

    @Override // defpackage.ges
    public final void Nv() {
        ((bnyx) btsx.b(bnyx.class, this)).cZ(this);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<jam> c = this.a.c(new boje(), null);
        this.b = c;
        return c.c();
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        return new gdf((Context) J(), false);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        String string = J().getResources().getString(R.string.RMI_NOT_SUPPORTED);
        Bundle bundle2 = this.o;
        if (bundle2 != null && bundle2.getString("errorMessage") != null) {
            string = bundle2.getString("errorMessage");
        }
        this.c = new bnyv(string);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.as;
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void s() {
        jam jamVar;
        super.s();
        cqkf<jam> cqkfVar = this.b;
        if (cqkfVar == null || (jamVar = this.c) == null) {
            return;
        }
        cqkfVar.e(jamVar);
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void u() {
        cqkf<jam> cqkfVar = this.b;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        super.u();
    }
}
