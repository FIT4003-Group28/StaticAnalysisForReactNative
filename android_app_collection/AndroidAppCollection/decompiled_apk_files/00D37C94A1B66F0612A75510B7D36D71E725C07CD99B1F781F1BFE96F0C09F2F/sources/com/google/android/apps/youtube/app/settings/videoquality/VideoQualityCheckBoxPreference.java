package com.google.android.apps.youtube.app.settings.videoquality;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.preference.TwoStatePreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreCheckBoxPreference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class VideoQualityCheckBoxPreference extends ProtoDataStoreCheckBoxPreference {
    private bke c;

    public VideoQualityCheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreCheckBoxPreference
    protected final void ad() {
        boolean z = ((TwoStatePreference) this).a;
        bke bkeVar = this.c;
        if (bkeVar != null) {
            View E = bkeVar.E(16908289);
            if (!(E instanceof Checkable)) {
                return;
            }
            Checkable checkable = (Checkable) E;
            if (checkable.isChecked() == z) {
                return;
            }
            checkable.setChecked(z);
        }
    }

    @Override // androidx.preference.CheckBoxPreference, androidx.preference.Preference
    public final void qB(bke bkeVar) {
        super.qB(bkeVar);
        this.c = bkeVar;
    }
}
