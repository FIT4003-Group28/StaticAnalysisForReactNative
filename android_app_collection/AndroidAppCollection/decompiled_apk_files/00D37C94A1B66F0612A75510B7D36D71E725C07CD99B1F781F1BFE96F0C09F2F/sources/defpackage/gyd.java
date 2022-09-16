package defpackage;

import android.os.CountDownTimer;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.CountdownNumeralView;
/* compiled from: PG */
/* renamed from: gyd  reason: default package */
/* loaded from: classes3.dex */
final class gyd extends CountDownTimer {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ gyg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyd(gyg gygVar, long j, long j2, int i, int i2) {
        super(j, j2);
        this.c = gygVar;
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        gyg gygVar = this.c;
        gygVar.n = null;
        gygVar.h.a();
        this.c.f.setVisibility(4);
        gxa gxaVar = this.c.r;
        int i = this.a;
        int i2 = this.b;
        gxaVar.a.aB.setVisibility(0);
        gxk gxkVar = gxaVar.a;
        gxkVar.aH = i2;
        gxkVar.aQ(i, true);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        CountdownNumeralView countdownNumeralView = this.c.h;
        int i = -1;
        if (countdownNumeralView.b) {
            int i2 = countdownNumeralView.a;
            if (i2 <= 0) {
                countdownNumeralView.a();
            } else {
                StringBuilder sb = new StringBuilder(11);
                sb.append(i2);
                countdownNumeralView.setText(sb.toString());
                i = countdownNumeralView.a;
                countdownNumeralView.a = i - 1;
            }
        }
        gyg gygVar = this.c;
        if (i <= 0) {
            return;
        }
        gygVar.m.play(i > 1 ? gygVar.k : gygVar.l, 1.0f, 1.0f, 0, 0, 1.0f);
    }
}
