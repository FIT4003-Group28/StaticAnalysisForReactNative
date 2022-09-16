package defpackage;

import android.os.CountDownTimer;
import android.widget.ProgressBar;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hly  reason: default package */
/* loaded from: classes3.dex */
final class hly extends CountDownTimer {
    final /* synthetic */ hmc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hly(hmc hmcVar, long j) {
        super(j, 10L);
        this.a = hmcVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.a.aJ();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        hmc hmcVar = this.a;
        double d = j;
        double d2 = hmcVar.a;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = 1.0d - (1.0d - (d / d2));
        int integer = hmcVar.rh().getInteger(R.integer.reel_camera_time_progress_bar_max);
        ProgressBar progressBar = this.a.aq;
        double d4 = 1.0d - (d3 * d3);
        double d5 = integer;
        Double.isNaN(d5);
        progressBar.setProgress((int) (d4 * d5));
    }
}
