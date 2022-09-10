package defpackage;

import android.widget.SeekBar;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: appl  reason: default package */
/* loaded from: classes2.dex */
public final class appl implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ appo a;
    private int b;

    public appl(appo appoVar) {
        this.a = appoVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        appo appoVar = this.a;
        apnl apnlVar = appoVar.b;
        if (!z || apnlVar == null) {
            return;
        }
        double d = i;
        Double.isNaN(d);
        double d2 = appoVar.f;
        Double.isNaN(d2);
        apnlVar.c(Math.round((d / 1000.0d) * d2));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.a.c = true;
        this.b = seekBar.getProgress();
        apnl apnlVar = this.a.b;
        if (apnlVar == null) {
            return;
        }
        apnlVar.setPlayWhenReady(false);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.c = false;
        float progress = (seekBar.getProgress() - this.b) / seekBar.getMax();
        if (progress > 0.01f) {
            this.a.a.m(new cjte(deaf.SWIPE, dead.RIGHT), cjtd.a(dtxy.cO));
        } else if (progress < -0.01f) {
            this.a.a.m(new cjte(deaf.SWIPE, dead.LEFT), cjtd.a(dtxy.cO));
        }
        appo appoVar = this.a;
        apnl apnlVar = appoVar.b;
        if (apnlVar == null) {
            return;
        }
        apnlVar.setPlayWhenReady(appoVar.e);
    }
}
