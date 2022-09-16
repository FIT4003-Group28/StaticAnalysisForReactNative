package defpackage;

import android.widget.SeekBar;
/* compiled from: PG */
/* renamed from: acey  reason: default package */
/* loaded from: classes.dex */
public final class acey implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ acfh a;

    public acey(acfh acfhVar) {
        this.a = acfhVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (zdg.e(this.a.f)) {
            this.a.m(i / seekBar.getMax());
        }
        this.a.j();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.m(seekBar.getProgress() / seekBar.getMax());
    }
}
