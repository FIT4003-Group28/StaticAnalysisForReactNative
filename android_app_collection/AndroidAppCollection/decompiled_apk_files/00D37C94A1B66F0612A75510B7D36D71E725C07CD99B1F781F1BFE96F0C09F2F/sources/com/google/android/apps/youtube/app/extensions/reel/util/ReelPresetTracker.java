package com.google.android.apps.youtube.app.extensions.reel.util;

import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ReelPresetTracker extends PresetTracker {
    public boolean h;

    public ReelPresetTracker(apy apyVar, zse zseVar, vne vneVar) {
        super(apyVar, zseVar, vneVar);
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.util.PresetTracker
    protected final void g() {
        ylx.m(this.g.b(new fct(this.d, 6), anjk.a), gpe.e);
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.util.PresetTracker
    public final void h(hwp hwpVar, zno znoVar) {
        String str = hwpVar.k;
        List a = znoVar.a();
        if (k(str, a)) {
            this.f = str;
        } else if (!this.h || !k("AUTO", a)) {
            this.f = "NORMAL";
        } else {
            this.f = "AUTO";
        }
    }
}
