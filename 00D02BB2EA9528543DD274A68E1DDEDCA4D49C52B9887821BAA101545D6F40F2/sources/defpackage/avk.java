package defpackage;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreferenceCompat;
/* compiled from: PG */
/* renamed from: avk  reason: default package */
/* loaded from: classes3.dex */
public final class avk implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ SwitchPreferenceCompat a;

    public avk(SwitchPreferenceCompat switchPreferenceCompat) {
        this.a = switchPreferenceCompat;
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
