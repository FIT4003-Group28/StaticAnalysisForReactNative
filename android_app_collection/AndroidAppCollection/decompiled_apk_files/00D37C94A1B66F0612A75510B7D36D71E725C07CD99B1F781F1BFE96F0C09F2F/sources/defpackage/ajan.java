package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
/* compiled from: PG */
/* renamed from: ajan  reason: default package */
/* loaded from: classes.dex */
public final class ajan implements ajag {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final azqb g;
    private final azqb h;
    private final azqb i;
    private final azqb j;
    private final azqb k;
    private final azqb l;
    private final azqb m;
    private final azqb n;
    private final azqb o;
    private final azqb p;
    private final azqb q;
    private final azqb r;
    private final azqb s;
    private final azqb t;

    public ajan() {
    }

    @Override // defpackage.ajag
    public final /* bridge */ /* synthetic */ ajah a(PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar) {
        String a;
        ajao c = c();
        c.I();
        if (!aiix.y(c.f) || playbackStartDescriptor == null) {
            a = c.e.a();
        } else {
            a = playbackStartDescriptor.g(c.e);
        }
        if (playbackStartDescriptor != null && aijpVar != null && aiix.e(c.f).S) {
            c.J(playbackStartDescriptor, aijpVar, a);
        }
        c.i = c.g(a, playbackStartDescriptor, aijpVar, false);
        c.c.f(c.i.a);
        c.m = c.i;
        if (playbackStartDescriptor != null) {
            c.T(playbackStartDescriptor.x());
            c.u().p().e = playbackStartDescriptor.c();
            orw a2 = orw.a(playbackStartDescriptor.a.w);
            if (a2 == null) {
                a2 = orw.AUDIO_ROUTE_UNSPECIFIED;
            }
            aijf aijfVar = c.d;
            aijfVar.r = a2;
            aijfVar.a.g.c(new ahfw(a2));
            if (c.n.c(aika.VIDEO_REQUESTED) && c.au()) {
                c.aB(true);
            }
        }
        c.B(0);
        c.z(false, 0, c.m.a);
        c.aw(c.i.a, 4, 0);
        c.d.i();
        c.i.a.i().l();
        c.ai(aika.PLAYBACK_PENDING);
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0  */
    @Override // defpackage.ajag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ defpackage.ajah b(com.google.android.libraries.youtube.player.video.state.DirectorSavedState r21, defpackage.aijp r22) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajan.b(com.google.android.libraries.youtube.player.video.state.DirectorSavedState, aijp):ajah");
    }

    public final ajao c() {
        snc sncVar = (snc) this.a.get();
        sncVar.getClass();
        aeov aeovVar = (aeov) this.b.get();
        aeovVar.getClass();
        aflx aflxVar = (aflx) this.c.get();
        aflxVar.getClass();
        aflu afluVar = (aflu) this.d.get();
        afluVar.getClass();
        aikf aikfVar = (aikf) this.e.get();
        aikfVar.getClass();
        ajai ajaiVar = (ajai) this.f.get();
        ajaiVar.getClass();
        aijf aijfVar = (aijf) this.g.get();
        aijfVar.getClass();
        aikh aikhVar = (aikh) this.h.get();
        aikhVar.getClass();
        aant aantVar = (aant) this.i.get();
        aantVar.getClass();
        zey zeyVar = (zey) this.j.get();
        zeyVar.getClass();
        ajfm ajfmVar = (ajfm) this.k.get();
        ajfmVar.getClass();
        ajar ajarVar = (ajar) this.l.get();
        ajarVar.getClass();
        aadd aaddVar = (aadd) this.m.get();
        aaddVar.getClass();
        aacz aaczVar = (aacz) this.n.get();
        aaczVar.getClass();
        ajfe ajfeVar = (ajfe) this.o.get();
        ajfeVar.getClass();
        ajav ajavVar = (ajav) this.p.get();
        ajavVar.getClass();
        axnm axnmVar = ((axoz) this.q).get();
        axnmVar.getClass();
        aivp aivpVar = (aivp) this.r.get();
        aivpVar.getClass();
        aiix aiixVar = (aiix) this.s.get();
        aiixVar.getClass();
        afig afigVar = (afig) this.t.get();
        afigVar.getClass();
        return new ajao(sncVar, aeovVar, aflxVar, afluVar, aikfVar, ajaiVar, aijfVar, aikhVar, aantVar, zeyVar, ajfmVar, ajarVar, aaddVar, aaczVar, ajfeVar, ajavVar, axnmVar, aivpVar, aiixVar, afigVar);
    }

    public ajan(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12, azqb azqbVar13, azqb azqbVar14, azqb azqbVar15, azqb azqbVar16, azqb azqbVar17, azqb azqbVar18, azqb azqbVar19, azqb azqbVar20) {
        azqbVar.getClass();
        this.a = azqbVar;
        azqbVar2.getClass();
        this.b = azqbVar2;
        azqbVar3.getClass();
        this.c = azqbVar3;
        azqbVar4.getClass();
        this.d = azqbVar4;
        azqbVar5.getClass();
        this.e = azqbVar5;
        this.f = azqbVar6;
        this.g = azqbVar7;
        this.h = azqbVar8;
        azqbVar9.getClass();
        this.i = azqbVar9;
        azqbVar10.getClass();
        this.j = azqbVar10;
        azqbVar11.getClass();
        this.k = azqbVar11;
        azqbVar12.getClass();
        this.l = azqbVar12;
        azqbVar13.getClass();
        this.m = azqbVar13;
        azqbVar14.getClass();
        this.n = azqbVar14;
        azqbVar15.getClass();
        this.o = azqbVar15;
        azqbVar16.getClass();
        this.p = azqbVar16;
        this.q = azqbVar17;
        azqbVar18.getClass();
        this.r = azqbVar18;
        azqbVar19.getClass();
        this.s = azqbVar19;
        azqbVar20.getClass();
        this.t = azqbVar20;
    }
}
