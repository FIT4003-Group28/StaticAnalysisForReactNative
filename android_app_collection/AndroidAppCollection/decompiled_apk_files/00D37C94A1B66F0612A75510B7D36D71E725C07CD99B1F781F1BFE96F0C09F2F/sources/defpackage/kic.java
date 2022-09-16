package defpackage;

import android.graphics.Rect;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
/* compiled from: PG */
/* renamed from: kic  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kic implements ayqb {
    public final /* synthetic */ YouTubeControlsOverlay a;
    private final /* synthetic */ int b;

    public /* synthetic */ kic(YouTubeControlsOverlay youTubeControlsOverlay, int i) {
        this.b = i;
        this.a = youTubeControlsOverlay;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                ffv ffvVar = (ffv) obj;
                this.a.S();
                return;
            case 1:
                YouTubeControlsOverlay youTubeControlsOverlay = this.a;
                Rect rect = (Rect) obj;
                youTubeControlsOverlay.k.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                aigl aiglVar = youTubeControlsOverlay.h;
                if (!aiglVar.b.equals(rect)) {
                    aiglVar.b.set(rect);
                    if (aiglVar.k()) {
                        ((aigi) aiglVar.d.get()).a(rect);
                    }
                }
                klt kltVar = youTubeControlsOverlay.j;
                if (kltVar.c.equals(rect)) {
                    return;
                }
                kltVar.c.set(rect);
                if (!kltVar.g) {
                    return;
                }
                kltVar.d();
                return;
            case 2:
                YouTubeControlsOverlay youTubeControlsOverlay2 = this.a;
                kbn kbnVar = (kbn) obj;
                if (kbnVar.a) {
                    youTubeControlsOverlay2.O(kbnVar.b);
                    if (kbnVar.c) {
                        youTubeControlsOverlay2.B();
                        return;
                    } else {
                        youTubeControlsOverlay2.E();
                        return;
                    }
                } else if (youTubeControlsOverlay2.t == 0 || !youTubeControlsOverlay2.W()) {
                    return;
                } else {
                    youTubeControlsOverlay2.R();
                    return;
                }
            case 3:
                YouTubeControlsOverlay youTubeControlsOverlay3 = this.a;
                if (((ahhj) obj).b() == aijw.PARTIAL_PLAYBACK_END_OF_DOWNLOADED_BYTES) {
                    youTubeControlsOverlay3.e.nB(youTubeControlsOverlay3.r);
                    return;
                } else {
                    youTubeControlsOverlay3.e.a(youTubeControlsOverlay3.r);
                    return;
                }
            case 4:
                this.a.C((ahhm) obj);
                return;
            case 5:
                ahic ahicVar = (ahic) obj;
                this.a.b.b();
                return;
            case 6:
                YouTubeControlsOverlay youTubeControlsOverlay4 = this.a;
                youTubeControlsOverlay4.A = (ahxu) obj;
                youTubeControlsOverlay4.T();
                return;
            case 7:
                YouTubeControlsOverlay youTubeControlsOverlay5 = this.a;
                if (((aikd) obj).i == 15) {
                    youTubeControlsOverlay5.e.nB(youTubeControlsOverlay5.r);
                    return;
                } else {
                    youTubeControlsOverlay5.e.a(youTubeControlsOverlay5.r);
                    return;
                }
            case 8:
                kfw kfwVar = this.a.f;
                kfwVar.i = ((Boolean) obj).booleanValue();
                kfwVar.u();
                return;
            case 9:
                YouTubeControlsOverlay youTubeControlsOverlay6 = this.a;
                if (!((Boolean) obj).booleanValue()) {
                    return;
                }
                youTubeControlsOverlay6.V(true);
                return;
            case 10:
                this.a.p.setText((CharSequence) obj);
                return;
            default:
                this.a.M.c((Rect) obj);
                return;
        }
    }
}
