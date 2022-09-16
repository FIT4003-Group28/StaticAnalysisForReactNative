package com.google.android.apps.gmm.settings.preference;

import android.content.Context;
import androidx.preference.DialogPreference;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TimePreference extends DialogPreference implements btkz {
    public static final dcqe g = dcqe.c("com.google.android.apps.gmm.settings.preference.TimePreference");
    public btld h;

    public TimePreference(Context context, bvjk bvjkVar, btld btldVar) {
        super(context);
        super.C(bvjkVar.toString());
        ((DialogPreference) this).d = this.j.getString(17039370);
        ((DialogPreference) this).e = this.j.getString(17039360);
        ((DialogPreference) this).f = R.layout.time_preference_layout;
        this.h = btldVar;
    }

    @Override // androidx.preference.Preference
    public final void M(avb avbVar) {
        super.M(avbVar);
        k(o(n()));
    }

    @Override // defpackage.btkz
    public final aug m() {
        btld n = n();
        btlf btlfVar = new btlf();
        btlfVar.ad = n;
        return btlfVar;
    }

    public final btld n() {
        return btld.d(X(this.h.e()));
    }

    public final String o(btld btldVar) {
        return bvtb.j(this.j, btldVar.a(), btldVar.b(), 0);
    }
}
