package defpackage;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: ahwo  reason: default package */
/* loaded from: classes.dex */
public final class ahwo implements ahwy, aibq {
    private final Vibrator a;
    private final VibrationEffect b;
    private final VibrationEffect c;
    private boolean d;

    public ahwo(Vibrator vibrator) {
        VibrationEffect vibrationEffect;
        this.a = vibrator;
        if (Build.VERSION.SDK_INT >= 26) {
            this.b = VibrationEffect.createOneShot(10L, 96);
            vibrationEffect = VibrationEffect.createOneShot(25L, PrivateKeyType.INVALID);
        } else {
            vibrationEffect = null;
            this.b = null;
        }
        this.c = vibrationEffect;
    }

    private final void d(VibrationEffect vibrationEffect, long j) {
        if (!this.a.hasVibrator() || Build.VERSION.SDK_INT == 26) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT <= 26) {
                this.a.vibrate(j);
            } else if (vibrationEffect == null) {
            } else {
                this.a.vibrate(vibrationEffect);
            }
        } catch (Exception e) {
            zep.d("Failed to execute markers haptics vibrate.", e);
        }
    }

    @Override // defpackage.aibq
    public final void a() {
        d(this.c, 25L);
    }

    @Override // defpackage.ahwy
    public final void c(aicb aicbVar, boolean z) {
        if (aicbVar != aicb.TIMESTAMP_MARKER) {
            return;
        }
        this.d = z;
    }

    @Override // defpackage.ahwy
    public final void nD(TimelineMarker timelineMarker, TimelineMarker timelineMarker2, aicb aicbVar, int i) {
        if ((aicbVar == aicb.CHAPTER || aicbVar == aicb.TIMESTAMP_MARKER) && i == 2 && timelineMarker2 != null) {
            if (aicbVar == aicb.TIMESTAMP_MARKER && !this.d) {
                return;
            }
            d(this.b, 10L);
        }
    }

    @Override // defpackage.ahwy
    public final /* synthetic */ void nw(aicb aicbVar) {
    }
}
