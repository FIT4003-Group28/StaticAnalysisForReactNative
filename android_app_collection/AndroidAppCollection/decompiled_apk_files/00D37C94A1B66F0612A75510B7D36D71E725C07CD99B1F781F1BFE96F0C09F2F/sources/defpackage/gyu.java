package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui.ShortsPlayerView;
/* compiled from: PG */
/* renamed from: gyu  reason: default package */
/* loaded from: classes3.dex */
public final class gyu implements pjx {
    final /* synthetic */ ShortsPlayerView a;

    public gyu(ShortsPlayerView shortsPlayerView) {
        this.a = shortsPlayerView;
    }

    @Override // defpackage.pjx, defpackage.pyk
    public final void F(asr asrVar) {
        int i = asrVar.a;
        int i2 = asrVar.b;
        float f = 1.0f;
        if (i2 != 0 && i != 0) {
            f = (i * asrVar.d) / i2;
        }
        ShortsPlayerView shortsPlayerView = this.a;
        if (shortsPlayerView.g == 0.0f) {
            shortsPlayerView.g = f;
            shortsPlayerView.requestLayout();
            return;
        }
        zep.b("Changing the video aspect ratio after it's initialized is not allowed");
    }

    @Override // defpackage.pjx
    public final /* synthetic */ void W() {
    }

    @Override // defpackage.pjx
    public final /* synthetic */ void X() {
    }

    @Override // defpackage.pjx
    public final /* synthetic */ void Y() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void aa() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void ab() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void ac() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void ad() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void ae(int i) {
    }

    @Override // defpackage.pjx
    public final /* synthetic */ void ag() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void ah() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void ai() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void aj() {
    }

    @Override // defpackage.pjx
    public final /* synthetic */ void ak() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void al() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void am() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void an() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void ao() {
    }

    @Override // defpackage.pjx
    public final /* synthetic */ void ap() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void aq() {
    }

    @Override // defpackage.pjx
    public final /* synthetic */ void ar() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void n(boolean z) {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void o(boolean z) {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void p(pjt pjtVar) {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void q(int i) {
    }

    @Override // defpackage.pjv
    public final void r(pjr pjrVar) {
        afus.c(2, 6, "[ShortsCreation][Android][Edit]Player error in edit fragment", pjrVar);
        gyo a = this.a.i.a(actj.SHORTS_CREATION_EDITOR_PLAYER_ERROR);
        a.h(true);
        a.a();
        zep.d("SPlayerView: Player error ", pjrVar);
        this.a.d.post(new Runnable() { // from class: gyt
            @Override // java.lang.Runnable
            public final void run() {
                gyu.this.a.b.setVisibility(0);
            }
        });
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void s(boolean z, int i) {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void t(pjy pjyVar, pjy pjyVar2, int i) {
    }

    @Override // defpackage.pjx
    public final /* synthetic */ void u() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void w() {
    }

    @Override // defpackage.pjx, defpackage.pli
    public final /* synthetic */ void x(boolean z) {
    }
}
