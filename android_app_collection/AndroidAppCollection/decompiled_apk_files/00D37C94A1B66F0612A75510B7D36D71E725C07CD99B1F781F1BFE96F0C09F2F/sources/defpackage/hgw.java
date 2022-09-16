package defpackage;

import android.widget.SeekBar;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hgw  reason: default package */
/* loaded from: classes3.dex */
public final class hgw implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ hhc a;
    private int b;

    public hgw(hhc hhcVar) {
        this.a = hhcVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.a.t(i);
            this.b++;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        hfx hfxVar;
        this.a.j.removeCallbacksAndMessages(null);
        hhc hhcVar = this.a;
        hhcVar.A.d = null;
        if (!hhcVar.p || (hfxVar = hhcVar.o) == null) {
            return;
        }
        hfxVar.e();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        hhc hhcVar = this.a;
        ampq a = hhcVar.A.a(hhcVar.t);
        if (a.h()) {
            gyo a2 = this.a.w.a(actj.SHORTS_CREATION_AUDIO_SCRUBBER_DSP_ANNOTATION);
            a2.a = hhc.w(((Long) a.c()).longValue());
            a2.b();
            this.a.s(((Long) a.c()).longValue());
            this.a.t(((Long) a.c()).longValue());
            this.a.j(((Long) a.c()).longValue());
            this.a.A.d = (Long) a.c();
            if (this.a.A.b().h()) {
                this.a.r.setImageResource(R.drawable.shorts_music_waveform_selected_dsp_area);
            }
            gyo a3 = this.a.w.a(actj.SHORTS_CREATION_AUDIO_SCRUBBER_TIMELINE);
            a3.a = hhc.w(((Long) a.c()).longValue());
            a3.c();
        } else {
            hhc hhcVar2 = this.a;
            hhcVar2.j(hhcVar2.t);
            hhc hhcVar3 = this.a;
            long j = hhcVar3.t;
            if (this.b > 1) {
                gyo a4 = hhcVar3.w.a(actj.SHORTS_CREATION_AUDIO_SCRUBBER_TIMELINE);
                a4.a = hhc.w(j);
                a4.f();
            } else {
                gyo a5 = hhcVar3.w.a(actj.SHORTS_CREATION_AUDIO_SCRUBBER_TIMELINE);
                a5.a = hhc.w(j);
                a5.b();
            }
            this.b = 0;
            this.a.r.setImageResource(R.drawable.shorts_music_waveform_area);
        }
        this.a.b.execute(new Runnable() { // from class: hgv
            @Override // java.lang.Runnable
            public final void run() {
                hgw.this.a.v();
            }
        });
    }
}
