package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.apps.maps.R;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: ayfo  reason: default package */
/* loaded from: classes3.dex */
public final class ayfo extends gen {
    public bwqv a;
    public aynf b;
    public cqkj c;
    public aypi d;
    private cqkf<ayml> e;
    private ayml g;

    @Override // defpackage.ges
    protected final void Nv() {
        ((ayfp) btsx.b(ayfp.class, this)).cx(this);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cqkf<ayml> c = this.c.c(new aygc(), viewGroup);
        this.e = c;
        c.e(this.g);
        return this.e.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        cqkf<ayml> cqkfVar = this.e;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.e = null;
        }
        this.g = null;
        super.am();
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        gdf gdfVar = new gdf((Context) J(), false);
        Window window = gdfVar.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.color.google_transparent);
        }
        return gdfVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        try {
            bwrs e = this.a.e(baad.class, this.o, "arg_local_list");
            aynf aynfVar = this.b;
            dbsk.s(e);
            aypi aypiVar = this.d;
            dbsk.s(aypiVar);
            gga a = aynfVar.a.a();
            aynf.a(a, 1);
            akfa a2 = aynfVar.b.a();
            aynf.a(a2, 2);
            akfc a3 = aynfVar.c.a();
            aynf.a(a3, 3);
            aynf.a(e, 4);
            aynf.a(aypiVar, 5);
            this.g = new ayne(a, a2, a3, e, aypiVar);
        } catch (IOException e2) {
            throw new RuntimeException("Cannot create JoinListDialogFragment without a LocalList", e2);
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxy.dY;
    }
}
