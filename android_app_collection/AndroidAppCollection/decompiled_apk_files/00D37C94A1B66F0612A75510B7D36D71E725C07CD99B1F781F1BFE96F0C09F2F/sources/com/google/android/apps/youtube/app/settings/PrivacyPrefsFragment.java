package com.google.android.apps.youtube.app.settings;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.settings.PrivacyPrefsFragment;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class PrivacyPrefsFragment extends lfm {
    private aypg ae;
    public aadd c;
    public akjl d;
    public SettingsDataAccess e;

    @Override // defpackage.dp
    public final void R(Bundle bundle) {
        super.R(bundle);
        this.ae = this.e.g(new Runnable() { // from class: lgo
            @Override // java.lang.Runnable
            public final void run() {
                aurh o;
                arag aragVar;
                PrivacyPrefsFragment privacyPrefsFragment = PrivacyPrefsFragment.this;
                if (!privacyPrefsFragment.ap()) {
                    return;
                }
                if (!eog.F(privacyPrefsFragment.c) || !hve.l(privacyPrefsFragment.e.i(), apwk.class)) {
                    o = privacyPrefsFragment.e.o(10029);
                } else {
                    o = privacyPrefsFragment.e.o(10003);
                }
                if (o == null) {
                    return;
                }
                dt mJ = privacyPrefsFragment.mJ();
                if ((o.b & 1) != 0) {
                    aragVar = o.c;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                mJ.setTitle(ajgl.b(aragVar));
                privacyPrefsFragment.d.d(privacyPrefsFragment, o.d);
            }
        });
    }

    @Override // defpackage.bjr
    public final void aG() {
    }

    @Override // defpackage.bjr, defpackage.dp
    public final void my() {
        super.my();
        azof.f((AtomicReference) this.ae);
    }

    @Override // defpackage.bjr
    public final RecyclerView n(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView n = super.n(layoutInflater, viewGroup, bundle);
        n.af(null);
        return n;
    }
}
