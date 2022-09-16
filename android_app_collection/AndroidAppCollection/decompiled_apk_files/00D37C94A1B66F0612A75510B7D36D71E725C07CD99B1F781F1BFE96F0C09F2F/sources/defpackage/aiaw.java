package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.subtitles.SubtitlesOverlayPresenter;
/* compiled from: PG */
/* renamed from: aiaw  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aiaw implements ayqb {
    public final /* synthetic */ SubtitlesOverlayPresenter a;
    private final /* synthetic */ int b;

    public /* synthetic */ aiaw(SubtitlesOverlayPresenter subtitlesOverlayPresenter, int i) {
        this.b = i;
        this.a = subtitlesOverlayPresenter;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                this.a.m((ahhx) obj);
                return;
            case 1:
                this.a.l((ahhw) obj);
                return;
            case 2:
                SubtitlesOverlayPresenter subtitlesOverlayPresenter = this.a;
                ahia ahiaVar = (ahia) obj;
                subtitlesOverlayPresenter.d = ahiaVar.b();
                if (ahiaVar.a() != 7) {
                    return;
                }
                subtitlesOverlayPresenter.q(subtitlesOverlayPresenter.c);
                return;
            case 3:
                ahgg ahggVar = (ahgg) obj;
                this.a.j();
                return;
            case 4:
                ahgg ahggVar2 = (ahgg) obj;
                this.a.j();
                return;
            case 5:
                this.a.i((ahgn) obj);
                return;
            case 6:
                SubtitlesOverlayPresenter subtitlesOverlayPresenter2 = this.a;
                ahhj ahhjVar = (ahhj) obj;
                subtitlesOverlayPresenter2.d = ahhjVar.d();
                if (ahhjVar.a() == null || ahhjVar.c() == null) {
                    return;
                }
                subtitlesOverlayPresenter2.b.put(ahhjVar.a().B(), ahhjVar.c());
                return;
            default:
                this.a.k((ahhp) obj);
                return;
        }
    }
}
