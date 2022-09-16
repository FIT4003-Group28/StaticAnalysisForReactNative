package defpackage;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreference;
/* compiled from: PG */
/* renamed from: avj  reason: default package */
/* loaded from: classes3.dex */
public final class avj implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ SwitchPreference a;

    public avj(SwitchPreference switchPreference) {
        this.a = switchPreference;
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
