package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adlf  reason: default package */
/* loaded from: classes.dex */
public final class adlf implements adny {
    final /* synthetic */ adlh a;

    public adlf(adlh adlhVar) {
        this.a = adlhVar;
    }

    @Override // defpackage.adny
    public final void j(adnt adntVar) {
        this.a.d.c();
        if (adntVar.n() != null) {
            aypf aypfVar = this.a.d;
            ayoi d = adntVar.n().d();
            final adlg adlgVar = this.a.f;
            adlgVar.getClass();
            aypfVar.d(d.as(new ayqb() { // from class: adle
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    airr f = adlg.this.a.f();
                    f.getClass();
                    SubtitleTrack subtitleTrack = (SubtitleTrack) ((ampq) obj).f();
                    if (!akzj.f(subtitleTrack, f.m())) {
                        f.H(subtitleTrack);
                    }
                }
            }));
        }
    }

    @Override // defpackage.adny
    public final void k(adnt adntVar) {
        this.a.d.c();
    }

    @Override // defpackage.adny
    public final void l(adnt adntVar) {
    }
}
