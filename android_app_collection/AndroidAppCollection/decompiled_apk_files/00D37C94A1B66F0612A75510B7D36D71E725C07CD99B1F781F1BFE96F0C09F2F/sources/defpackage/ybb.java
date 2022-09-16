package defpackage;

import android.widget.SeekBar;
/* compiled from: PG */
/* renamed from: ybb  reason: default package */
/* loaded from: classes4.dex */
final class ybb implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ ybc a;

    public ybb(ybc ybcVar) {
        this.a = ybcVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        ybc ybcVar = this.a;
        ybcVar.k = i;
        ybcVar.b();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
