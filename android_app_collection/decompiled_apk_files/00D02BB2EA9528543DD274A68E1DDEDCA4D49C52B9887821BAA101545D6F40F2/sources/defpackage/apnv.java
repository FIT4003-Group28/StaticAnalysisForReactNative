package defpackage;

import android.widget.SeekBar;
/* compiled from: PG */
/* renamed from: apnv  reason: default package */
/* loaded from: classes2.dex */
final class apnv implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ apnx a;

    public apnv(apnx apnxVar) {
        this.a = apnxVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.a.c = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.c = false;
    }
}
