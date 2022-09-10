package defpackage;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;
/* compiled from: PG */
/* renamed from: atk  reason: default package */
/* loaded from: classes2.dex */
public final class atk implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ CheckBoxPreference a;

    public atk(CheckBoxPreference checkBoxPreference) {
        this.a = checkBoxPreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!this.a.I(Boolean.valueOf(z))) {
            compoundButton.setChecked(!z);
        } else {
            this.a.m(z);
        }
    }
}
