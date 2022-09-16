package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects;

import com.google.android.apps.youtube.app.extensions.reel.util.PresetTracker;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ShortsPresetTracker extends PresetTracker {
    public ShortsPresetTracker(apy apyVar, zse zseVar, vne vneVar) {
        super(apyVar, zseVar, vneVar);
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.util.PresetTracker
    protected final void g() {
        ylx.m(this.g.b(new fct(this.d, 7), anjk.a), gpe.c);
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.util.PresetTracker
    public final void h(hwp hwpVar, zno znoVar) {
        String str = hwpVar.l;
        if (k(str, znoVar.a())) {
            this.f = str;
        } else {
            this.f = znoVar.b;
        }
    }
}
