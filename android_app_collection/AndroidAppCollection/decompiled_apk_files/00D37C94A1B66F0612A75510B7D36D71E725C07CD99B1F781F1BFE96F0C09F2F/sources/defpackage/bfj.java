package defpackage;

import android.widget.SeekBar;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfj  reason: default package */
/* loaded from: classes2.dex */
public final class bfj implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ bfl a;
    private final Runnable b = new bfi(this);

    public bfj(bfl bflVar) {
        this.a = bflVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            int i2 = bfl.X;
            ((bhc) seekBar.getTag()).e(i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        bfl bflVar = this.a;
        if (bflVar.w != null) {
            bflVar.u.removeCallbacks(this.b);
        }
        this.a.w = (bhc) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.u.postDelayed(this.b, 500L);
    }
}
