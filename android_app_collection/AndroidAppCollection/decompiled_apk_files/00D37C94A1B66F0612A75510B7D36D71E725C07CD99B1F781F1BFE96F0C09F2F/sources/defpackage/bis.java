package defpackage;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;
/* compiled from: PG */
/* renamed from: bis  reason: default package */
/* loaded from: classes2.dex */
public final class bis implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ CheckBoxPreference a;

    public bis(CheckBoxPreference checkBoxPreference) {
        this.a = checkBoxPreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!this.a.Q(Boolean.valueOf(z))) {
            compoundButton.setChecked(!z);
        } else {
            this.a.k(z);
        }
    }
}
