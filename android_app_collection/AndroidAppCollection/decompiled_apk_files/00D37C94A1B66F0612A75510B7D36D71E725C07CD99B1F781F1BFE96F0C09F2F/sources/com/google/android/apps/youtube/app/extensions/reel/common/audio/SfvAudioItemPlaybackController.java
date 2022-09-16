package com.google.android.apps.youtube.app.extensions.reel.common.audio;

import android.content.Context;
import com.google.android.libraries.youtube.player.ui.PlayerView;
import com.google.protos.youtube.api.innertube.SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SfvAudioItemPlaybackController implements f {
    public static final long a = TimeUnit.SECONDS.toMillis(15);
    public final airr b;
    public final aire c;
    public final ayor d;
    public final PlayerView e;
    public final abda g;
    public final Executor h;
    public final Executor i;
    public final acvh j;
    public SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand m;
    public auup n;
    public acvg o;
    private final airw p;
    private final azqb q;
    private final acth u;
    private final aypf r = new aypf();
    private final gug s = new gug(this);
    private final Set t = new HashSet();
    public ampq k = amon.a;
    public ampq l = amon.a;
    public final aijc f = new aijc(new gud(), aijd.a, aijd.a, aijd.a);

    public SfvAudioItemPlaybackController(Context context, airw airwVar, azqb azqbVar, ayor ayorVar, abda abdaVar, Executor executor, Executor executor2, acvh acvhVar, acth acthVar) {
        this.p = airwVar;
        this.b = airwVar.E();
        this.c = airwVar.D();
        this.q = azqbVar;
        this.d = ayorVar;
        this.g = abdaVar;
        this.h = executor;
        this.i = executor2;
        this.j = acvhVar;
        this.u = acthVar;
        this.e = new PlayerView(context);
    }

    public final aynr g(ampq ampqVar, ampq ampqVar2, ausr ausrVar) {
        String f = aakj.f(186, "sfv_currently_playing_audio_item_key");
        aagh c = ((aagi) this.q.get()).c();
        if (ampqVar2.h()) {
            f.getClass();
            aqxo.z(!f.isEmpty(), "key cannot be empty");
            aopa createBuilder = ausp.a.createBuilder();
            createBuilder.copyOnWrite();
            ausp auspVar = (ausp) createBuilder.instance;
            auspVar.b |= 1;
            auspVar.c = f;
            ausm ausmVar = new ausm(createBuilder);
            aopa aopaVar = ausmVar.a;
            aopaVar.copyOnWrite();
            ausp auspVar2 = (ausp) aopaVar.instance;
            auspVar2.b |= 2;
            auspVar2.d = (String) ampqVar.c();
            aopa aopaVar2 = ausmVar.a;
            aopaVar2.copyOnWrite();
            ausp auspVar3 = (ausp) aopaVar2.instance;
            auspVar3.e = ausrVar.f;
            auspVar3.b |= 4;
            aopa aopaVar3 = ausmVar.a;
            aopaVar3.copyOnWrite();
            ausp auspVar4 = (ausp) aopaVar3.instance;
            auspVar4.b |= 8;
            auspVar4.f = (String) ampqVar2.c();
            aahb c2 = ((aagu) c).c();
            c2.j(ausmVar);
            return c2.b();
        }
        aahb c3 = ((aagu) c).c();
        c3.g(f);
        return c3.b();
    }

    public final void h(aoob aoobVar, auup auupVar) {
        asjj asjjVar;
        acvg acvgVar = this.o;
        if (acvgVar != null) {
            acvgVar.c("aft");
        }
        acti oi = this.u.oi();
        acte acteVar = new acte(aoobVar);
        if (auupVar == null) {
            asjjVar = null;
        } else {
            aopa createBuilder = asjj.a.createBuilder();
            aopa createBuilder2 = asjz.a.createBuilder();
            aopa createBuilder3 = asjv.a.createBuilder();
            aopa createBuilder4 = asjx.a.createBuilder();
            auuo auuoVar = auupVar.c;
            if (auuoVar == null) {
                auuoVar = auuo.a;
            }
            long j = auuoVar.c;
            createBuilder4.copyOnWrite();
            asjx asjxVar = (asjx) createBuilder4.instance;
            asjxVar.b |= 1;
            asjxVar.c = j;
            asjx asjxVar2 = (asjx) createBuilder4.mo39build();
            createBuilder3.copyOnWrite();
            asjv asjvVar = (asjv) createBuilder3.instance;
            asjxVar2.getClass();
            asjvVar.c = asjxVar2;
            asjvVar.b |= 1;
            asjv asjvVar2 = (asjv) createBuilder3.mo39build();
            createBuilder2.copyOnWrite();
            asjz asjzVar = (asjz) createBuilder2.instance;
            asjvVar2.getClass();
            asjzVar.f = asjvVar2;
            asjzVar.b |= 16;
            asjz asjzVar2 = (asjz) createBuilder2.mo39build();
            createBuilder.copyOnWrite();
            asjj asjjVar2 = (asjj) createBuilder.instance;
            asjzVar2.getClass();
            asjjVar2.B = asjzVar2;
            asjjVar2.c |= 262144;
            asjjVar = (asjj) createBuilder.mo39build();
        }
        oi.H(3, acteVar, asjjVar);
    }

    public final void i() {
        this.b.a();
    }

    public final void j() {
        if (this.b.d()) {
            this.b.K();
        }
    }

    @Override // defpackage.f, defpackage.g
    public final void kG(apy apyVar) {
        if (this.t.isEmpty()) {
            this.r.g(this.s.g(this.p));
        }
        this.t.add(apyVar);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        if (this.t.isEmpty()) {
            this.b.s();
        }
        this.k = amon.a;
        this.l = amon.a;
        this.m = null;
    }

    @Override // defpackage.g
    public final void nv(apy apyVar) {
        i();
        this.t.remove(apyVar);
        if (this.t.isEmpty()) {
            this.r.c();
        }
        g(amon.a, amon.a, ausr.SFV_AUDIO_ITEM_PLAYBACK_STATE_UNKNOWN).S(fzb.g, fzc.s);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
