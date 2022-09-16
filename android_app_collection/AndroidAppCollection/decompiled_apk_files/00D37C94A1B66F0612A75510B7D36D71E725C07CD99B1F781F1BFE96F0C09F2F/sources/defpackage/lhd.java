package defpackage;

import com.google.android.apps.youtube.app.settings.SettingsActivity;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lhd  reason: default package */
/* loaded from: classes3.dex */
public final class lhd extends abq {
    final /* synthetic */ lhe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhd(lhe lheVar) {
        super(true);
        this.a = lheVar;
    }

    @Override // defpackage.abq
    public final void a() {
        lhe lheVar = this.a;
        axnm axnmVar = lheVar.i;
        SettingsActivity settingsActivity = lheVar.a;
        if (axnmVar == null || settingsActivity == null) {
            return;
        }
        if (((gbv) axnmVar.get()).C()) {
            settingsActivity.setTitle(settingsActivity.getString(R.string.settings));
        } else {
            settingsActivity.finish();
        }
    }
}
