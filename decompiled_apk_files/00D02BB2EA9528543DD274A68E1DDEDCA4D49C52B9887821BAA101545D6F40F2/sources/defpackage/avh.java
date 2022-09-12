package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;
/* compiled from: PG */
/* renamed from: avh  reason: default package */
/* loaded from: classes2.dex */
public final class avh implements View.OnKeyListener {
    final /* synthetic */ SeekBarPreference a;

    public avh(SeekBarPreference seekBarPreference) {
        this.a = seekBarPreference;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        SeekBar seekBar;
        if (keyEvent.getAction() != 0) {
            return false;
        }
        SeekBarPreference seekBarPreference = this.a;
        if ((seekBarPreference.e || (i != 21 && i != 22)) && i != 23 && i != 66 && (seekBar = seekBarPreference.d) != null) {
            return seekBar.onKeyDown(i, keyEvent);
        }
        return false;
    }
}
