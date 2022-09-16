package defpackage;

import com.google.android.apps.youtube.app.player.overlay.SubtitleButtonController;
/* compiled from: PG */
/* renamed from: kgv  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kgv implements ayqb {
    public final /* synthetic */ SubtitleButtonController a;
    private final /* synthetic */ int b;

    public /* synthetic */ kgv(SubtitleButtonController subtitleButtonController) {
        this.a = subtitleButtonController;
    }

    public /* synthetic */ kgv(SubtitleButtonController subtitleButtonController, int i) {
        this.b = i;
        this.a = subtitleButtonController;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            SubtitleButtonController subtitleButtonController = this.a;
            ahhp ahhpVar = (ahhp) obj;
            if (!subtitleButtonController.e) {
                return;
            }
            subtitleButtonController.v(ahhpVar.a());
        } else if (i == 1) {
            SubtitleButtonController subtitleButtonController2 = this.a;
            ahhm ahhmVar = (ahhm) obj;
            subtitleButtonController2.f = ahhmVar.c();
            if (ahhmVar.c() != aijx.VIDEO_PLAYBACK_LOADED) {
                return;
            }
            subtitleButtonController2.g.oi().D(new acte(subtitleButtonController2.h));
        } else {
            SubtitleButtonController subtitleButtonController3 = this.a;
            if (((ahhq) obj).a()) {
                subtitleButtonController3.e = true;
                return;
            }
            subtitleButtonController3.e = false;
            subtitleButtonController3.v(null);
        }
    }
}
