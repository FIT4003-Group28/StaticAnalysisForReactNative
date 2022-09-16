package defpackage;

import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
/* compiled from: PG */
/* renamed from: ahuo  reason: default package */
/* loaded from: classes.dex */
public final class ahuo extends ajbg {
    final /* synthetic */ CreatorEndscreenOverlayPresenter a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahuo(CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, long j) {
        super(j, Long.MAX_VALUE, 1, 1, null);
        this.a = creatorEndscreenOverlayPresenter;
    }

    @Override // defpackage.ajbg
    public final void b(boolean z, boolean z2, boolean z3) {
        for (ahuz ahuzVar : this.a.h) {
            CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter = this.a;
            ajmy ajmyVar = creatorEndscreenOverlayPresenter.b;
            int width = creatorEndscreenOverlayPresenter.g.getWidth();
            this.a.g.getHeight();
            aqvc aqvcVar = ahuzVar.b;
            int i = (int) (width * aqvcVar.i);
            int i2 = (int) (i / aqvcVar.k);
            avhn avhnVar = aqvcVar.d;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajmyVar.n(avhnVar, i, i2);
        }
    }
}
