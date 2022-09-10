package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import com.google.android.apps.gmm.directions.appwidget.CreateDirectionsShortcutActivity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: qel  reason: default package */
/* loaded from: classes7.dex */
public final class qel implements TextWatcher {
    final /* synthetic */ Button a;
    final /* synthetic */ CreateDirectionsShortcutActivity b;

    public qel(CreateDirectionsShortcutActivity createDirectionsShortcutActivity, Button button) {
        this.b = createDirectionsShortcutActivity;
        this.a = button;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z = false;
        if (this.b.k.getText().length() != 0 && this.b.l.getText().length() != 0) {
            z = true;
        }
        this.a.setEnabled(z);
        this.a.setTextColor(this.b.getResources().getColor(true != z ? R.color.qu_daynight_black_alpha_06 : R.color.qu_daynight_google_blue_500));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
