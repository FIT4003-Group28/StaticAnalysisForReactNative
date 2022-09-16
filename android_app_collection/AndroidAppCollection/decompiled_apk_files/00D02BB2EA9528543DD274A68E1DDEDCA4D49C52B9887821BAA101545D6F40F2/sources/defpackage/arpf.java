package defpackage;

import android.widget.SeekBar;
/* compiled from: PG */
/* renamed from: arpf  reason: default package */
/* loaded from: classes2.dex */
final class arpf implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ arpg a;

    public arpf(arpg arpgVar) {
        this.a = arpgVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        arpg arpgVar = this.a;
        arpgVar.b = i;
        cqkx.p(arpgVar);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        arni arniVar = this.a.a;
        arpg.c.getOrDefault(Integer.valueOf(this.a.b), Float.valueOf(0.0f));
        arniVar.h();
    }
}
