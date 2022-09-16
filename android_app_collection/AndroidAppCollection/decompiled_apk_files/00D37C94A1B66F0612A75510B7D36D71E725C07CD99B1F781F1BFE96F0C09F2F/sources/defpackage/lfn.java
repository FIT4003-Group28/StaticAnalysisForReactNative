package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.settings.SettingsActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lfn  reason: default package */
/* loaded from: classes3.dex */
public final class lfn implements abv {
    final /* synthetic */ lfo a;

    public lfn(lfo lfoVar) {
        this.a = lfoVar;
    }

    @Override // defpackage.abv
    public final void a(Context context) {
        lfo lfoVar = this.a;
        if (!lfoVar.a) {
            lfoVar.a = true;
            lfoVar.lI();
            SettingsActivity settingsActivity = (SettingsActivity) lfoVar;
        }
    }
}
