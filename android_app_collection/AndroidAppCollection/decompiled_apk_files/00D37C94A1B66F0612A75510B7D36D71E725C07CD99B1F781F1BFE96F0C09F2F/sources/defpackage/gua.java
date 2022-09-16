package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gua  reason: default package */
/* loaded from: classes3.dex */
public final class gua implements aafl {
    private final SfvAudioItemPlaybackController a;

    public gua(SfvAudioItemPlaybackController sfvAudioItemPlaybackController) {
        this.a = sfvAudioItemPlaybackController;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aqxo.p(apzgVar.qn(SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.sfvAudioItemPlaybackCommand));
        aqxo.p(1 == (((SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand) apzgVar.qm(SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.sfvAudioItemPlaybackCommand)).b & 1));
        final SfvAudioItemPlaybackController sfvAudioItemPlaybackController = this.a;
        SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand = (SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand) apzgVar.qm(SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.sfvAudioItemPlaybackCommand);
        final aoob aoobVar = apzgVar.c;
        if (!sfvAudioItemPlaybackController.l.h() || !sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.g.equals(sfvAudioItemPlaybackController.l.c())) {
            sfvAudioItemPlaybackController.o = sfvAudioItemPlaybackController.j.c(asny.LATENCY_ACTION_SHORTS_AUDIO_PICKER_PLAYBACK);
            sfvAudioItemPlaybackController.o.e();
            sfvAudioItemPlaybackController.b.x(sfvAudioItemPlaybackController.e.c, sfvAudioItemPlaybackController.f);
            aopc aopcVar = (aopc) apzg.a.createBuilder();
            aopg aopgVar = WatchEndpointOuterClass.watchEndpoint;
            aopa createBuilder = awel.a.createBuilder();
            String str = sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.c;
            createBuilder.copyOnWrite();
            awel awelVar = (awel) createBuilder.instance;
            str.getClass();
            awelVar.b = 1 | awelVar.b;
            awelVar.c = str;
            String str2 = sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.d;
            createBuilder.copyOnWrite();
            awel awelVar2 = (awel) createBuilder.instance;
            str2.getClass();
            awelVar2.b |= 512;
            awelVar2.k = str2;
            aopcVar.e(aopgVar, (awel) createBuilder.mo39build());
            apzg apzgVar2 = (apzg) aopcVar.mo39build();
            aijl d = PlaybackStartDescriptor.d();
            d.a = apzgVar2;
            d.d();
            final PlaybackStartDescriptor a = d.a();
            if ((sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.b & 4) != 0) {
                apzg apzgVar3 = sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.f;
                if (apzgVar3 == null) {
                    apzgVar3 = apzg.a;
                }
                if (apzgVar3.qn(ardq.b)) {
                    abda abdaVar = sfvAudioItemPlaybackController.g;
                    apzg apzgVar4 = sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.f;
                    if (apzgVar4 == null) {
                        apzgVar4 = apzg.a;
                    }
                    ylx.k(abdaVar.a(apzgVar4, sfvAudioItemPlaybackController.h), sfvAudioItemPlaybackController.i, new ylv() { // from class: gub
                        @Override // defpackage.zdt
                        /* renamed from: b */
                        public final void a(Throwable th) {
                            SfvAudioItemPlaybackController sfvAudioItemPlaybackController2 = SfvAudioItemPlaybackController.this;
                            aoob aoobVar2 = aoobVar;
                            PlaybackStartDescriptor playbackStartDescriptor = a;
                            afus.b(2, 24, "GetShortsSourceVideo returns error");
                            sfvAudioItemPlaybackController2.h(aoobVar2, null);
                            sfvAudioItemPlaybackController2.c.d(playbackStartDescriptor);
                        }
                    }, new ylw() { // from class: guc
                        @Override // defpackage.ylw, defpackage.zdt
                        public final void a(Object obj) {
                            SfvAudioItemPlaybackController sfvAudioItemPlaybackController2 = SfvAudioItemPlaybackController.this;
                            PlaybackStartDescriptor playbackStartDescriptor = a;
                            aoob aoobVar2 = aoobVar;
                            auup auupVar = ((arue) obj).d;
                            if (auupVar == null) {
                                auupVar = auup.a;
                            }
                            sfvAudioItemPlaybackController2.n = auupVar;
                            aijl e = playbackStartDescriptor.e();
                            auuo auuoVar = sfvAudioItemPlaybackController2.n.c;
                            if (auuoVar == null) {
                                auuoVar = auuo.a;
                            }
                            e.k = auuoVar.c;
                            PlaybackStartDescriptor a2 = e.a();
                            sfvAudioItemPlaybackController2.h(aoobVar2, sfvAudioItemPlaybackController2.n);
                            sfvAudioItemPlaybackController2.c.d(a2);
                        }
                    });
                    sfvAudioItemPlaybackController.m = sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand;
                    sfvAudioItemPlaybackController.k = ampq.j(sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.c);
                    sfvAudioItemPlaybackController.l = ampq.j(sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.g);
                    sfvAudioItemPlaybackController.g(sfvAudioItemPlaybackController.k, sfvAudioItemPlaybackController.l, ausr.SFV_AUDIO_ITEM_PLAYBACK_STATE_BUFFERING).S(fzb.h, fzc.s);
                }
            }
            sfvAudioItemPlaybackController.h(aoobVar, null);
            aire aireVar = sfvAudioItemPlaybackController.c;
            aijl d2 = PlaybackStartDescriptor.d();
            d2.a = apzgVar2;
            d2.d();
            aireVar.d(d2.a());
            sfvAudioItemPlaybackController.m = sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand;
            sfvAudioItemPlaybackController.k = ampq.j(sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.c);
            sfvAudioItemPlaybackController.l = ampq.j(sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.g);
            sfvAudioItemPlaybackController.g(sfvAudioItemPlaybackController.k, sfvAudioItemPlaybackController.l, ausr.SFV_AUDIO_ITEM_PLAYBACK_STATE_BUFFERING).S(fzb.h, fzc.s);
        } else if (sfvAudioItemPlaybackController.b.d()) {
            sfvAudioItemPlaybackController.i();
        } else {
            auup auupVar = sfvAudioItemPlaybackController.n;
            if (auupVar != null && (1 & auupVar.b) != 0) {
                airr airrVar = sfvAudioItemPlaybackController.b;
                auuo auuoVar = auupVar.c;
                if (auuoVar == null) {
                    auuoVar = auuo.a;
                }
                airrVar.V(auuoVar.c);
            } else {
                SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand2 = sfvAudioItemPlaybackController.m;
                if (sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand2 == null || sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand2.e.isEmpty()) {
                    sfvAudioItemPlaybackController.b.V(0L);
                } else {
                    sfvAudioItemPlaybackController.b.V(((ausq) sfvAudioItemPlaybackController.m.e.get(0)).b);
                }
            }
            sfvAudioItemPlaybackController.b.b();
        }
    }
}
