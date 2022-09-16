package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;
import com.google.protos.youtube.api.innertube.SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: gug  reason: default package */
/* loaded from: classes3.dex */
public final class gug implements airt {
    final /* synthetic */ SfvAudioItemPlaybackController a;

    public gug(SfvAudioItemPlaybackController sfvAudioItemPlaybackController) {
        this.a = sfvAudioItemPlaybackController;
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        aynx m = airwVar.G().i.I().m(50L, TimeUnit.MILLISECONDS, this.a.d);
        ayqe ayqeVar = new ayqe() { // from class: guf
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                gug gugVar = gug.this;
                switch (((ahia) obj).a()) {
                    case 2:
                        SfvAudioItemPlaybackController sfvAudioItemPlaybackController = gugVar.a;
                        return sfvAudioItemPlaybackController.g(sfvAudioItemPlaybackController.k, sfvAudioItemPlaybackController.l, ausr.SFV_AUDIO_ITEM_PLAYBACK_STATE_PLAYING);
                    case 3:
                    case 6:
                        SfvAudioItemPlaybackController sfvAudioItemPlaybackController2 = gugVar.a;
                        return sfvAudioItemPlaybackController2.g(sfvAudioItemPlaybackController2.k, sfvAudioItemPlaybackController2.l, ausr.SFV_AUDIO_ITEM_PLAYBACK_STATE_PAUSED);
                    case 4:
                    case 7:
                    case 8:
                        SfvAudioItemPlaybackController sfvAudioItemPlaybackController3 = gugVar.a;
                        return sfvAudioItemPlaybackController3.g(sfvAudioItemPlaybackController3.k, sfvAudioItemPlaybackController3.l, ausr.SFV_AUDIO_ITEM_PLAYBACK_STATE_STOPPED);
                    case 5:
                        SfvAudioItemPlaybackController sfvAudioItemPlaybackController4 = gugVar.a;
                        return sfvAudioItemPlaybackController4.g(sfvAudioItemPlaybackController4.k, sfvAudioItemPlaybackController4.l, ausr.SFV_AUDIO_ITEM_PLAYBACK_STATE_BUFFERING);
                    default:
                        return aynr.f();
                }
            }
        };
        ayrd.c(Integer.MAX_VALUE, "maxConcurrency");
        aywh aywhVar = new aywh(m, ayqeVar);
        azqc.g();
        return new aypg[]{aywhVar.S(fzb.i, fzc.t), airwVar.ao().I().G(aypa.a()).aa(new ayqb() { // from class: gue
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                gui guiVar;
                long j;
                long j2;
                long j3;
                long j4;
                gug gugVar = gug.this;
                if (((ahhm) obj).c() != aijx.VIDEO_PLAYBACK_LOADED || gugVar.a.b.n() == null || gugVar.a.b.n().d() == null) {
                    return;
                }
                ajbk d = gugVar.a.b.n().d();
                SfvAudioItemPlaybackController sfvAudioItemPlaybackController = gugVar.a;
                auup auupVar = sfvAudioItemPlaybackController.n;
                if (auupVar != null && (auupVar.b & 1) != 0) {
                    auuo auuoVar = auupVar.c;
                    if (auuoVar == null) {
                        auuoVar = auuo.a;
                    }
                    aooo aoooVar = auuoVar.d;
                    if (aoooVar == null) {
                        aoooVar = aooo.a;
                    }
                    if (aost.a(aoooVar) > 0) {
                        j3 = auuoVar.c;
                        aooo aoooVar2 = auuoVar.d;
                        if (aoooVar2 == null) {
                            aoooVar2 = aooo.a;
                        }
                        j4 = aost.a(aoooVar2);
                    } else {
                        j3 = auuoVar.c;
                        j4 = SfvAudioItemPlaybackController.a;
                    }
                    guiVar = new gui(sfvAudioItemPlaybackController, auuoVar.c, j3 + j4);
                } else {
                    SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand = sfvAudioItemPlaybackController.m;
                    if (sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand == null || sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.e.isEmpty()) {
                        guiVar = new gui(sfvAudioItemPlaybackController, 0L, SfvAudioItemPlaybackController.a);
                    } else {
                        ausq ausqVar = (ausq) sfvAudioItemPlaybackController.m.e.get(0);
                        aooo aoooVar3 = ausqVar.c;
                        if (aoooVar3 == null) {
                            aoooVar3 = aooo.a;
                        }
                        if (aost.a(aoooVar3) > 0) {
                            j = ausqVar.b;
                            aooo aoooVar4 = ausqVar.c;
                            if (aoooVar4 == null) {
                                aoooVar4 = aooo.a;
                            }
                            j2 = aost.a(aoooVar4);
                        } else {
                            j = ausqVar.b;
                            j2 = SfvAudioItemPlaybackController.a;
                        }
                        guiVar = new gui(sfvAudioItemPlaybackController, ausqVar.b, j + j2);
                    }
                }
                d.c(guiVar);
            }
        }, fzc.t)};
    }
}
