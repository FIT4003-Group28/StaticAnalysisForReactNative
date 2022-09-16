package defpackage;

import android.os.Vibrator;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahur  reason: default package */
/* loaded from: classes.dex */
public final class ahur extends ajbg {
    final /* synthetic */ CreatorEndscreenOverlayPresenter a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahur(CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, long j) {
        super(j, Long.MAX_VALUE, 1, 1, null);
        this.a = creatorEndscreenOverlayPresenter;
    }

    @Override // defpackage.ajbg
    public final void a() {
        this.a.t.j(false);
        CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter = this.a;
        creatorEndscreenOverlayPresenter.i = false;
        creatorEndscreenOverlayPresenter.l(false);
        this.a.s();
    }

    @Override // defpackage.ajbg
    public final void b(boolean z, boolean z2, boolean z3) {
        CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter = this.a;
        if (!creatorEndscreenOverlayPresenter.p.e || z2 || z3) {
            if (!creatorEndscreenOverlayPresenter.c.d() && !z2) {
                return;
            }
            this.a.t.j(true);
            CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter2 = this.a;
            creatorEndscreenOverlayPresenter2.i = true;
            creatorEndscreenOverlayPresenter2.l(true);
            this.a.s();
            CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter3 = this.a;
            creatorEndscreenOverlayPresenter3.d.b((aswg[]) creatorEndscreenOverlayPresenter3.p.d.toArray(new aswg[0]));
            if (z2 || z3 || !zdg.e(this.a.a)) {
                return;
            }
            CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter4 = this.a;
            if (creatorEndscreenOverlayPresenter4.q == null) {
                creatorEndscreenOverlayPresenter4.q = (Vibrator) creatorEndscreenOverlayPresenter4.a.getSystemService("vibrator");
            }
            if (!this.a.q.hasVibrator()) {
                return;
            }
            CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter5 = this.a;
            creatorEndscreenOverlayPresenter5.q.vibrate(creatorEndscreenOverlayPresenter5.a.getResources().getInteger(R.integer.invideo_accessibility_vibration_duration_ms));
            return;
        }
        creatorEndscreenOverlayPresenter.f.post(new ahuq(this));
    }
}
