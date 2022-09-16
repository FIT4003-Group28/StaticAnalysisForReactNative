package defpackage;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreference;
/* compiled from: PG */
/* renamed from: bki  reason: default package */
/* loaded from: classes2.dex */
public final class bki implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ SwitchPreference a;

    public bki(SwitchPreference switchPreference) {
        this.a = switchPreference;
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
