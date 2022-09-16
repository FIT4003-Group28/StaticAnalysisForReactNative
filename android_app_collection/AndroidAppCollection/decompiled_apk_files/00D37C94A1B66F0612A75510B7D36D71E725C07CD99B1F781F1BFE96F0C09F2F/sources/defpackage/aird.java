package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;
/* compiled from: PG */
/* renamed from: aird  reason: default package */
/* loaded from: classes.dex */
public final class aird implements aisi {
    private aipv a;
    private final azqb b;

    public aird(azqb azqbVar) {
        this.b = azqbVar;
    }

    @Override // defpackage.aisi
    public final /* bridge */ /* synthetic */ aiqb a() {
        return this.a;
    }

    @Override // defpackage.aisi
    public final aish b(aiqk aiqkVar) {
        acvg acvgVar;
        ylr.c();
        aipv aipvVar = this.a;
        if (aipvVar == null) {
            return null;
        }
        aiim aiimVar = aiqkVar.e.g;
        boolean z = true;
        if (!aipvVar.a.f()) {
            aiim[] aiimVarArr = {aiim.NEXT, aiim.PREVIOUS, aiim.AUTOPLAY, aiim.AUTONAV};
            int i = 0;
            while (true) {
                if (i >= 4) {
                    break;
                } else if (aiimVar == aiimVarArr[i]) {
                    aipvVar.d.i.c(new ahha());
                    break;
                } else {
                    i++;
                }
            }
        }
        aijp aijpVar = aiqkVar.g;
        if (aijpVar != null && (acvgVar = aijpVar.b) != null) {
            acvgVar.e();
        }
        aipvVar.d(aiimVar);
        PlaybackStartDescriptor playbackStartDescriptor = aiqkVar.f;
        if (playbackStartDescriptor != null) {
            String k = playbackStartDescriptor.k();
            String c = aipvVar.e.c();
            if ((!TextUtils.isEmpty(k) || !TextUtils.isEmpty(c)) && !TextUtils.equals(k, c)) {
                aipvVar.d.d.c(new aiil(k));
            }
        }
        if (aipvVar.b.i() || aiqkVar.e == aiqj.AUTOPLAY) {
            z = false;
        }
        PlaybackStartDescriptor a = aipvVar.b.a(aiqkVar);
        if (!aipvVar.g(aiqkVar) || a == null) {
            String valueOf = String.valueOf(aiqkVar.e);
            String valueOf2 = String.valueOf(aipvVar.c.l);
            String.valueOf(valueOf).length();
            String.valueOf(valueOf2).length();
            a = null;
        } else {
            aipvVar.b.f(aiqkVar, a);
            a.o(aiqkVar.f);
        }
        if (a == null) {
            return null;
        }
        aijp aijpVar2 = aiqkVar.g;
        if (aijpVar2 == null) {
            aijpVar2 = aipvVar.b.b(aiqkVar);
        }
        return new aish(a, aijpVar2, z);
    }

    @Override // defpackage.aisi
    public final void c() {
        aipv aipvVar = this.a;
        if (aipvVar != null) {
            aipvVar.f();
            this.a = null;
        }
    }

    @Override // defpackage.aisi
    public final boolean d(airr airrVar, ampg ampgVar, PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar) {
        aiqk c;
        aijp aijpVar2;
        acvg acvgVar;
        if (this.a == null) {
            return false;
        }
        if (playbackStartDescriptor.v() && ((Boolean) ampgVar.apply(playbackStartDescriptor)).booleanValue() && this.a != null) {
            if (((aiqc) this.b.get()).f(playbackStartDescriptor, this.a)) {
                c();
                h(playbackStartDescriptor);
                aipv aipvVar = this.a;
                if (aipvVar != null) {
                    aipvVar.b();
                    aipvVar.e();
                } else {
                    afus.b(2, 10, "Initializing a PlaybackSequencer for playback continuation, but it does not exist");
                }
            }
            ajah ajahVar = airrVar.q.a;
            ailu ailuVar = airrVar.o;
            String w = ajahVar != null ? ajahVar.w() : null;
            aimk c2 = airrVar.s.c();
            ylr.c();
            playbackStartDescriptor.getClass();
            ailuVar.o = playbackStartDescriptor;
            ailuVar.l(aijx.NEW);
            ailuVar.s.d.c(new aiil(playbackStartDescriptor.k()));
            ailuVar.j(playbackStartDescriptor, 1, w, c2, aijp.a);
            return true;
        }
        aipv aipvVar2 = this.a;
        if (aipvVar2 == null || (c = aipvVar2.b.c(playbackStartDescriptor, aijpVar)) == null) {
            return false;
        }
        if (c.e.equals(aiqj.JUMP) && (aijpVar2 = c.g) != null && (acvgVar = aijpVar2.b) != null) {
            aopa createBuilder = asno.a.createBuilder();
            aopa createBuilder2 = asnq.a.createBuilder();
            createBuilder2.copyOnWrite();
            asnq asnqVar = (asnq) createBuilder2.instance;
            asnqVar.d = 6;
            asnqVar.b |= 8;
            createBuilder.copyOnWrite();
            asno asnoVar = (asno) createBuilder.instance;
            asnq asnqVar2 = (asnq) createBuilder2.mo39build();
            asnqVar2.getClass();
            asnoVar.v = asnqVar2;
            asnoVar.c |= 262144;
            acvgVar.a((asno) createBuilder.mo39build());
        }
        aish b = b(c);
        if (b == null) {
            return false;
        }
        airrVar.n.a(b.a, b.b, b.c);
        return true;
    }

    @Override // defpackage.aisi
    public final boolean e(aiqk aiqkVar) {
        aipv aipvVar = this.a;
        return aipvVar != null && aipvVar.g(aiqkVar);
    }

    @Override // defpackage.aisi
    public final boolean f() {
        return this.a != null;
    }

    @Override // defpackage.aisi
    public final int g(aiqk aiqkVar) {
        aipv aipvVar = this.a;
        if (aipvVar == null) {
            return 1;
        }
        return aipvVar.i(aiqkVar);
    }

    @Override // defpackage.aisi
    public final void h(PlaybackStartDescriptor playbackStartDescriptor) {
        c();
        this.a = (aipv) ((aiqc) this.b.get()).b(playbackStartDescriptor);
    }

    @Override // defpackage.aisi
    public final void i(PlaybackServiceState playbackServiceState) {
        this.a = (aipv) ((aiqc) this.b.get()).c(playbackServiceState.d);
    }
}
