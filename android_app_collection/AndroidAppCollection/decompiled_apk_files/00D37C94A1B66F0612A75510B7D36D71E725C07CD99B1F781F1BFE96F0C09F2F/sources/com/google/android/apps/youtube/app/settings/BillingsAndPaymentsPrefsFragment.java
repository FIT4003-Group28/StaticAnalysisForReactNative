package com.google.android.apps.youtube.app.settings;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.settings.BillingsAndPaymentsPrefsFragment;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class BillingsAndPaymentsPrefsFragment extends lfi {
    public akjl c;
    public SettingsDataAccess d;
    aypg e;

    @Override // defpackage.bjr, defpackage.dp
    public final void Z(View view, Bundle bundle) {
        super.Z(view, bundle);
        this.e = this.d.g(new Runnable() { // from class: ley
            @Override // java.lang.Runnable
            public final void run() {
                aurh o;
                arag aragVar;
                BillingsAndPaymentsPrefsFragment billingsAndPaymentsPrefsFragment = BillingsAndPaymentsPrefsFragment.this;
                if (billingsAndPaymentsPrefsFragment.ap() && (o = billingsAndPaymentsPrefsFragment.d.o(10048)) != null) {
                    dt mJ = billingsAndPaymentsPrefsFragment.mJ();
                    if ((o.b & 1) != 0) {
                        aragVar = o.c;
                        if (aragVar == null) {
                            aragVar = arag.a;
                        }
                    } else {
                        aragVar = null;
                    }
                    mJ.setTitle(ajgl.b(aragVar));
                    billingsAndPaymentsPrefsFragment.c.d(billingsAndPaymentsPrefsFragment, o.d);
                }
            }
        });
    }

    @Override // defpackage.bjr
    public final void aG() {
    }

    @Override // defpackage.bjr, defpackage.dp
    public final void my() {
        super.my();
        azof.f((AtomicReference) this.e);
    }

    @Override // defpackage.bjr
    public final RecyclerView n(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView n = super.n(layoutInflater, viewGroup, bundle);
        n.af(null);
        return n;
    }
}
