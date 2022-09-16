package defpackage;

import android.widget.SeekBar;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hgy  reason: default package */
/* loaded from: classes3.dex */
public final class hgy implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ hhc a;

    public hgy(hhc hhcVar) {
        this.a = hhcVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.a.w.a(actj.SHORTS_CREATION_AUDIO_SCRUBBER_TIMELINE).f();
            this.a.t(i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        hfx hfxVar;
        this.a.j.removeCallbacksAndMessages(null);
        hhc hhcVar = this.a;
        if (!hhcVar.p || (hfxVar = hhcVar.o) == null) {
            return;
        }
        hfxVar.e();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        hhc hhcVar = this.a;
        hhcVar.j(hhcVar.t);
        this.a.b.execute(new Runnable() { // from class: hgx
            @Override // java.lang.Runnable
            public final void run() {
                hgy.this.a.v();
            }
        });
    }
}
