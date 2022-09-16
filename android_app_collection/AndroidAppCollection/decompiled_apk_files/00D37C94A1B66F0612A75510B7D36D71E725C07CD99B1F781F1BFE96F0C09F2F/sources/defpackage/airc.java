package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.audiofocus.PlaybackAudioManager$RestorableState;
import com.google.android.libraries.youtube.player.modality.PlaybackModalityState;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.sequencer.state.OmegaSequencerState;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;
import com.google.android.libraries.youtube.player.video.state.DirectorSavedState;
/* compiled from: PG */
/* renamed from: airc  reason: default package */
/* loaded from: classes.dex */
public final class airc implements aire {
    private final airr a;
    private final aisi b;

    public airc(airr airrVar, aisi aisiVar) {
        this.a = airrVar;
        this.b = aisiVar;
    }

    @Override // defpackage.aire, defpackage.aheu, defpackage.aizk
    public final void a(aiqk aiqkVar) {
        ajah ajahVar;
        aish b = this.b.b(aiqkVar);
        if (b != null) {
            PlaybackStartDescriptor playbackStartDescriptor = b.a;
            if (!playbackStartDescriptor.a.k || (ajahVar = this.a.q.a) == null || !ajahVar.ak(aika.ENDED) || !TextUtils.equals(playbackStartDescriptor.l(), ajahVar.x())) {
                this.a.n.a(b.a, b.b, b.c);
            } else {
                this.a.B();
            }
        }
    }

    @Override // defpackage.aire, defpackage.aheu
    public final boolean b() {
        return this.a.l.d != null;
    }

    @Override // defpackage.aheu
    public final int c(aiqk aiqkVar) {
        return this.b.g(aiqkVar);
    }

    @Override // defpackage.aire, defpackage.ajem
    public final void d(PlaybackStartDescriptor playbackStartDescriptor) {
        e(playbackStartDescriptor, aijp.a);
    }

    @Override // defpackage.aire
    public final void e(PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar) {
        acvg acvgVar;
        aisi aisiVar = this.b;
        final airr airrVar = this.a;
        airrVar.getClass();
        if (aisiVar.d(airrVar, new ampg() { // from class: airb
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                PlaybackStartDescriptor playbackStartDescriptor2 = (PlaybackStartDescriptor) obj;
                ajah ajahVar = airr.this.q.a;
                boolean z = false;
                if (ajahVar != null && ajahVar.al(aika.PLAYBACK_LOADED) && !ajahVar.ak(aika.ENDED) && TextUtils.equals(playbackStartDescriptor2.l(), ajahVar.x())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, playbackStartDescriptor, aijpVar)) {
            return;
        }
        if (this.b.f()) {
            this.b.c();
            airq airqVar = this.a.n;
            ylr.c();
            ajah ajahVar = airqVar.a.q.a;
            if (ajahVar != null) {
                ajahVar.M();
            }
            airqVar.a.p.b();
            airqVar.a.o.d();
            airqVar.a.p.e();
            airqVar.a.o.k();
            airqVar.a.q.a();
            airqVar.a.K();
        }
        this.b.h(playbackStartDescriptor);
        aiqb a = this.b.a();
        if (a != null) {
            a.b();
            a.e();
            airq airqVar2 = this.a.n;
            ylr.c();
            playbackStartDescriptor.getClass();
            airqVar2.a.b.d(new ahgt());
            if (aijpVar != null && (acvgVar = aijpVar.b) != null) {
                acvgVar.c("pl_i");
            }
            ahez ahezVar = airqVar2.a.e;
            if (ahezVar.c.j) {
                ahezVar.n = 3;
            }
            ahezVar.e();
            if (!ahezVar.h()) {
                ((ainw) ahezVar.k.get()).b(false);
            }
            airr airrVar2 = airqVar2.a;
            airrVar2.j.a(airrVar2.f);
            airqVar2.a.w(aijpVar);
            airqVar2.a.y();
            ailu ailuVar = airqVar2.a.o;
            ailuVar.o = playbackStartDescriptor;
            ailuVar.r = playbackStartDescriptor.a.q;
            ailuVar.m = ((aiky) ailuVar.a.get()).a(playbackStartDescriptor);
            airqVar2.a.o.e();
            if (playbackStartDescriptor.u()) {
                airqVar2.a.b.f(aiik.NAVIGATION);
            }
            airqVar2.a.t.b().e = playbackStartDescriptor.s();
            airqVar2.a.t.b().f = playbackStartDescriptor.r();
            airqVar2.a.s.e(playbackStartDescriptor, aijpVar);
            airqVar2.a.d.a();
            return;
        }
        afus.b(2, 10, "Initializing a PlaybackSequencer in loaderNavigator, but it does not exist");
    }

    @Override // defpackage.aire
    public final void f(PlaybackServiceState playbackServiceState) {
        g(playbackServiceState, aijp.a);
    }

    @Override // defpackage.aire
    public final void g(PlaybackServiceState playbackServiceState, aijp aijpVar) {
        acvg acvgVar;
        airq airqVar = this.a.n;
        ylr.c();
        airqVar.a.b.d(new ahgu());
        if (aijpVar != null && (acvgVar = aijpVar.b) != null) {
            acvgVar.c("pl_r");
        }
        airqVar.a.D();
        PlaybackAudioManager$RestorableState playbackAudioManager$RestorableState = playbackServiceState.e;
        if (playbackAudioManager$RestorableState != null) {
            airqVar.a.h.i = playbackAudioManager$RestorableState;
        }
        PlaybackModalityState playbackModalityState = playbackServiceState.b;
        if (playbackModalityState != null) {
            aijf aijfVar = airqVar.a.f;
            aijfVar.g = playbackModalityState.a;
            aijfVar.h = playbackModalityState.b;
            aijfVar.k = playbackModalityState.c;
            aijfVar.l = playbackModalityState.d;
            aijfVar.i = playbackModalityState.i;
            aijfVar.n = playbackModalityState.f;
            aijfVar.o = playbackModalityState.g;
            aijfVar.q = playbackModalityState.h;
            aijfVar.s = playbackModalityState.j;
            aijfVar.t = playbackModalityState.k;
        }
        this.b.c();
        this.b.i(playbackServiceState);
        aiqb a = this.b.a();
        if (a != null && playbackServiceState.d != null) {
            a.b();
            OmegaSequencerState omegaSequencerState = (OmegaSequencerState) playbackServiceState.d;
            DirectorSavedState directorSavedState = playbackServiceState.c;
            if (omegaSequencerState != null && ((directorSavedState == null && omegaSequencerState.e != null) || (directorSavedState != null && omegaSequencerState.a != null))) {
                a.e();
            }
            airq airqVar2 = this.a.n;
            OmegaSequencerState omegaSequencerState2 = (OmegaSequencerState) playbackServiceState.d;
            DirectorSavedState directorSavedState2 = playbackServiceState.c;
            ailu ailuVar = airqVar2.a.o;
            omegaSequencerState2.getClass();
            ailuVar.p = omegaSequencerState2.a;
            ailuVar.q = omegaSequencerState2.b;
            ailuVar.n = omegaSequencerState2.d;
            ailuVar.o = omegaSequencerState2.e;
            ailuVar.r = omegaSequencerState2.f;
            ailuVar.m = ((aiky) ailuVar.a.get()).a(omegaSequencerState2.e);
            airqVar2.a.o.e();
            ylr.c();
            airr airrVar = airqVar2.a;
            airrVar.j.a(airrVar.f);
            airqVar2.a.w(aijpVar);
            airqVar2.a.y();
            if (directorSavedState2 == null) {
                airr airrVar2 = airqVar2.a;
                airrVar2.s.e(airrVar2.o.o, aijpVar);
            } else {
                PlayerResponseModel a2 = airqVar2.a.o.a();
                if (a2 == null) {
                    return;
                }
                airqVar2.a.q.b(directorSavedState2, aijpVar);
                if (airqVar2.a.o.l.b(aijx.VIDEO_WATCH_LOADED)) {
                    airqVar2.a.r.c();
                    airqVar2.a.o.g(a2, null, aijpVar.b);
                } else {
                    airqVar2.a.s.e(directorSavedState2.d, aijpVar);
                }
            }
            airqVar2.a.d.a();
            airqVar2.a.A();
            return;
        }
        airq airqVar3 = this.a.n;
        airqVar3.a.b.d(new ahgq());
        airqVar3.a.A();
    }

    @Override // defpackage.aire
    public final void h(int i) {
        aiqb a = this.b.a();
        if (a != null) {
            aiql aiqlVar = ((aipv) a).b;
            if (!(aiqlVar instanceof aiqi)) {
                return;
            }
            ((aiqi) aiqlVar).v(i);
        }
    }

    @Override // defpackage.aire, defpackage.aizk
    public final boolean i(aiqk aiqkVar) {
        return this.b.e(aiqkVar);
    }

    @Override // defpackage.aire
    public final void j(PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar, PlayerResponseModel playerResponseModel) {
        airp airpVar = this.a.m;
        if (airpVar.b.O()) {
            aiis aiisVar = airpVar.b.l;
            String h = playbackStartDescriptor.h(aiisVar.a);
            aith aithVar = aiisVar.b;
            playbackStartDescriptor.getClass();
            synchronized (aithVar.a) {
                ajah ajahVar = aithVar.a.a;
                if (ajahVar == null) {
                    return;
                }
                if (!aijr.i(playerResponseModel.t())) {
                    return;
                }
                ajahVar.K(playerResponseModel, playbackStartDescriptor, aijpVar);
                aiisVar.d = h;
            }
        }
    }
}
