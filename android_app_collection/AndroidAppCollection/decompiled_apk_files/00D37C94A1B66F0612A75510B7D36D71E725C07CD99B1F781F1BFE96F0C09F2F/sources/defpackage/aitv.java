package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlaybackTrackingModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.stats.PlaybackClientManager$State;
import com.google.android.libraries.youtube.player.stats.VideoStats2Client$VideoStats2ClientState;
import com.google.android.libraries.youtube.player.stats.VideoStats3Client$VideoStats3ClientState;
import com.google.android.libraries.youtube.player.stats.attestation.AttestationClient$AttestationClientState;
import java.util.List;
/* compiled from: PG */
/* renamed from: aitv  reason: default package */
/* loaded from: classes.dex */
public final class aitv implements ynl {
    public final aitp a;
    public aiuf b;
    public aiul c;
    public aius d;
    public boolean e;
    public boolean f;
    private aits g;
    private final aity h;
    private aitz i;
    private final aiug j;
    private final aium k;
    private final aadd l;
    private final aiut m;
    private String n;
    private PlaybackClientManager$State o;
    private boolean p;
    private boolean q;
    private boolean r;
    private ahhp s;

    public aitv(aitp aitpVar, aity aityVar, aiug aiugVar, aiut aiutVar, aium aiumVar, aadd aaddVar) {
        aitpVar.getClass();
        this.a = aitpVar;
        aityVar.getClass();
        this.h = aityVar;
        this.j = aiugVar;
        this.m = aiutVar;
        this.k = aiumVar;
        this.l = aaddVar;
        this.f = true;
    }

    private final void m() {
        ahhp ahhpVar;
        aiuf aiufVar = this.b;
        if (aiufVar == null || !this.f || (ahhpVar = this.s) == null) {
            return;
        }
        aiufVar.e(ahhpVar);
    }

    private final void o() {
        aiuf aiufVar = this.b;
        if (aiufVar != null) {
            aiufVar.r();
        }
        this.b = null;
        aiul aiulVar = this.c;
        if (aiulVar != null) {
            aiulVar.g();
        }
        this.c = null;
        this.d = null;
        this.g = null;
        this.i = null;
    }

    private static boolean p(PlayerResponseModel playerResponseModel) {
        return playerResponseModel.f().j != null;
    }

    private final boolean q(String str) {
        PlaybackClientManager$State playbackClientManager$State = this.o;
        boolean z = false;
        if (playbackClientManager$State != null && playbackClientManager$State.a.equals(str)) {
            z = true;
        }
        String.valueOf(str).length();
        return z;
    }

    public final PlaybackClientManager$State a() {
        VideoStats2Client$VideoStats2ClientState videoStats2Client$VideoStats2ClientState;
        aitv aitvVar;
        PlaybackClientManager$State playbackClientManager$State = this.o;
        String str = this.n;
        if (playbackClientManager$State != null) {
            return playbackClientManager$State;
        }
        if (str == null) {
            return null;
        }
        aiuf aiufVar = this.b;
        if (aiufVar != null) {
            aitvVar = this;
            videoStats2Client$VideoStats2ClientState = new VideoStats2Client$VideoStats2ClientState(aiufVar.a, aiufVar.b, aiufVar.c, aiufVar.d, aiufVar.e, aiufVar.r, aiufVar.D, aiufVar.f, aiufVar.g, aiufVar.h, aiufVar.i, aiufVar.j, aiufVar.t, aiufVar.s, aiufVar.k, aiufVar.l, aiufVar.u, aiufVar.v, aiufVar.w, aiufVar.y, aiufVar.H, aiufVar.x, aiufVar.z, aiufVar.A, aiufVar.B, aiufVar.C, aiufVar.o, aiufVar.p, aiufVar.q, aiufVar.G, aiufVar.E, aiufVar.F, aiufVar.K, aiufVar.L);
        } else {
            videoStats2Client$VideoStats2ClientState = null;
            aitvVar = this;
        }
        aiul aiulVar = aitvVar.c;
        VideoStats3Client$VideoStats3ClientState videoStats3Client$VideoStats3ClientState = aiulVar != null ? new VideoStats3Client$VideoStats3ClientState(aiulVar.m, aiulVar.l, aiulVar.p, aiulVar.o, aiulVar.r, aiulVar.j, aiulVar.n, aiulVar.s, aiulVar.t, aiulVar.q, aiulVar.u, aiulVar.v, aiulVar.y, aiulVar.c, aiulVar.z, aiulVar.e, aiulVar.E, aiulVar.D, aiulVar.b, aiulVar.f, aiulVar.A, aiulVar.B, aiulVar.C) : null;
        aius aiusVar = aitvVar.d;
        aits aitsVar = aitvVar.g;
        aitz aitzVar = aitvVar.i;
        return new PlaybackClientManager$State(str, aitsVar == null ? null : aitsVar.a(), aitzVar == null ? null : aitzVar.a(), videoStats2Client$VideoStats2ClientState, aiusVar == null ? null : new AttestationClient$AttestationClientState(aiusVar.b, aiusVar.c, aiusVar.d, aiusVar.e, aiusVar.i), videoStats3Client$VideoStats3ClientState);
    }

    public final void b(PlaybackClientManager$State playbackClientManager$State) {
        this.o = playbackClientManager$State;
        if (!this.p) {
            zep.b("ERROR initFromState called without reset being called. Clients in incorrect state");
        }
    }

    public final void c(aesr aesrVar) {
        if (!agpr.q(aesrVar.b())) {
            return;
        }
        aits aitsVar = this.g;
        if (aitsVar != null) {
            aitsVar.b();
        }
        aiuf aiufVar = this.b;
        if (aiufVar == null || !this.f) {
            return;
        }
        aiufVar.g(aesrVar);
    }

    public final void d(String str, PlayerResponseModel playerResponseModel, String str2, int i) {
        if (this.r) {
            return;
        }
        if (!this.p) {
            zep.b("ERROR onPlayAd called for new ad without reset being called. Clients in incorrect state");
        }
        this.r = true;
        this.p = false;
        if (q(playerResponseModel.B())) {
            if (!playerResponseModel.B().equals(this.n)) {
                n();
            }
        } else if (!TextUtils.isEmpty(playerResponseModel.B())) {
            PlaybackTrackingModel f = playerResponseModel.f();
            if (f.e == null || f.b == null) {
                zep.l("Missing QoE or Vss base url");
            } else {
                if (!playerResponseModel.c().aZ()) {
                    this.i = this.h.a(f.f, f.g, str2);
                }
                this.b = this.j.a(str, playerResponseModel, str2, i);
                m();
                if (aiix.o(this.l) && p(playerResponseModel)) {
                    this.c = this.k.a(str2, i, playerResponseModel);
                }
                if (playerResponseModel.v() != null && f.a != null) {
                    this.d = this.m.a(playerResponseModel.v(), f.a, str2, playerResponseModel.a());
                }
            }
        }
        this.o = null;
        this.n = playerResponseModel.B();
    }

    public final void e(String str, PlayerResponseModel playerResponseModel, int i) {
        if (this.q) {
            return;
        }
        if (!this.p) {
            zep.b("ERROR reset onPlayVideo called for new video with out reset being called. Clients in correct state");
        }
        zgh.m(str);
        boolean z = true;
        this.q = true;
        this.p = false;
        String B = playerResponseModel.B();
        if (!TextUtils.equals(B, this.n)) {
            if (q(B)) {
                n();
            } else if (!this.e) {
                PlaybackTrackingModel f = playerResponseModel.f();
                this.e = false;
                if (!playerResponseModel.B().isEmpty()) {
                    VideoStreamingData videoStreamingData = playerResponseModel.c;
                    if (videoStreamingData == null || !videoStreamingData.v) {
                        z = false;
                    }
                    aitp aitpVar = this.a;
                    arzt s = playerResponseModel.s();
                    byte[] J2 = playerResponseModel.J();
                    String B2 = playerResponseModel.B();
                    aitpVar.i.getClass();
                    zgh.m(B2);
                    this.g = (!aitpVar.j.d || s == null || !aitp.a(s) || !aitp.b(J2) || (z && !s.h) || i == 3 || aitpVar.g.r()) ? null : new aits(aitpVar.a, aitpVar.b, aitpVar.c, aitpVar.d, aitpVar.e, aitpVar.f, aitpVar.i, s, J2, B2, aitpVar.h);
                }
                if (!playerResponseModel.c().aZ()) {
                    this.i = this.h.a(f.f, f.g, str);
                }
                if (this.b == null) {
                    this.b = this.j.a(null, playerResponseModel, str, i);
                    m();
                }
                if (aiix.o(this.l) && this.c == null && p(playerResponseModel)) {
                    this.c = this.k.a(str, i, playerResponseModel);
                }
                if (playerResponseModel.v() != null) {
                    List list = f.f;
                    this.d = this.m.a(playerResponseModel.v(), f.a, str, playerResponseModel.a());
                }
            }
        }
        this.n = B;
        this.o = null;
    }

    public final void g() {
        aiuf aiufVar = this.b;
        if (aiufVar != null && this.f) {
            aiufVar.h();
        }
        aius aiusVar = this.d;
        if (aiusVar != null) {
            aiusVar.b();
        }
        aiul aiulVar = this.c;
        if (aiulVar != null) {
            aiulVar.b(true, aiulVar.d.d());
            aiulVar.z = true;
        }
        o();
    }

    public final void h(long j, String str, PlayerResponseModel playerResponseModel, int i) {
        if (this.b == null) {
            PlaybackTrackingModel f = playerResponseModel.f();
            if (f.e == null || f.b == null) {
                zep.l("Missing QoE or Vss base url");
            } else {
                this.b = this.j.a(null, playerResponseModel, str, i);
                m();
            }
        }
        if (!p(playerResponseModel)) {
            zep.l("Missing Vss3Config");
        } else if (aiix.o(this.l) && this.c == null) {
            this.c = this.k.a(str, i, playerResponseModel);
        }
        aiuf aiufVar = this.b;
        if (aiufVar != null && this.f) {
            aiufVar.m(j);
        }
        aiul aiulVar = this.c;
        if (aiulVar != null) {
            aiulVar.e(j);
        }
    }

    public final void i() {
        aiuf aiufVar = this.b;
        if (aiufVar != null && this.f) {
            aiufVar.o();
        }
        aius aiusVar = this.d;
        if (aiusVar != null) {
            aiusVar.b();
        }
        aiul aiulVar = this.c;
        if (aiulVar != null) {
            aiulVar.f();
        }
    }

    public final void j(long j) {
        aiuf aiufVar = this.b;
        if (aiufVar != null && this.f) {
            aiufVar.l(j);
        }
        aiul aiulVar = this.c;
        if (aiulVar != null) {
            aiulVar.d(j);
        }
    }

    public final void k(ahhx ahhxVar) {
        aits aitsVar = this.g;
        if (aitsVar != null) {
            aitsVar.c(ahhxVar);
        }
        aitz aitzVar = this.i;
        if (aitzVar != null) {
            aitzVar.c(ahhxVar);
        }
        aiuf aiufVar = this.b;
        if (aiufVar != null && this.f) {
            aiufVar.q(ahhxVar);
        }
        aius aiusVar = this.d;
        if (aiusVar != null && ahhxVar.j() && ahhxVar.e() >= aiusVar.c.b(5) * 1000) {
            aiusVar.b();
        }
        aiul aiulVar = this.c;
        if (aiulVar != null) {
            if (ahhxVar.f() > 0) {
                aiulVar.l = ahhxVar.f();
            }
            if (!ahhxVar.j()) {
                if (ahhxVar.j()) {
                    return;
                }
                String valueOf = String.valueOf(ahhxVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 70);
                sb.append("Video time event received with event.hasPlaybackStarted=false. event: ");
                sb.append(valueOf);
                zep.l(sb.toString());
                return;
            }
            long e = ahhxVar.e();
            long j = aiulVar.m;
            if (e < (-5000) + j || e > 5000 + j) {
                StringBuilder sb2 = new StringBuilder(109);
                sb2.append("Warning: unexpected playback progress ");
                sb2.append(e);
                sb2.append(" for current playback position ");
                sb2.append(j);
                zep.l(sb2.toString());
                aiulVar.d(e);
            } else if (e < j || !aiulVar.i) {
            } else {
                aiulVar.r += e - j;
                aiulVar.m = e;
                aiulVar.y = ahhxVar.b() - ahhxVar.e();
                long j2 = aiulVar.r;
                int a = aiulVar.a.a();
                if (a != aiulVar.s && !aiulVar.j()) {
                    aiulVar.s = a;
                    aiulVar.t = j2;
                }
                long j3 = j2 - aiulVar.t;
                if (aiulVar.j() && j3 > 2000) {
                    aiulVar.t = -1L;
                    aiulVar.s = a;
                    aiulVar.b(false, aiulVar.d.d());
                    aiulVar.h(aiulVar.d.d());
                }
                if (aiulVar.h != null || aiulVar.z) {
                    return;
                }
                aiulVar.e(aiulVar.m);
            }
        }
    }

    public final void l() {
        this.p = true;
        this.e = false;
        this.q = false;
        this.r = false;
        this.n = null;
        this.o = null;
        this.s = null;
        o();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void n() {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aitv.n():void");
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        switch (i) {
            case -1:
                return new Class[]{ypy.class, ahgh.class, ahgn.class, ahhp.class, ahhu.class, aiio.class};
            case 0:
                ypy ypyVar = (ypy) obj;
                aiuf aiufVar = this.b;
                if (aiufVar != null && this.f) {
                    aiufVar.b();
                }
                aiul aiulVar = this.c;
                if (aiulVar == null) {
                    return null;
                }
                aiulVar.b(false, aiulVar.d.d());
                aiulVar.h(aiulVar.d.d());
                return null;
            case 1:
                ahgh ahghVar = (ahgh) obj;
                aiuf aiufVar2 = this.b;
                if (aiufVar2 != null && this.f) {
                    aiufVar2.c(ahghVar);
                }
                aiul aiulVar2 = this.c;
                if (aiulVar2 == null || aiulVar2.n == ahghVar.a()) {
                    return null;
                }
                aiulVar2.b(false, aiulVar2.d.d());
                aiulVar2.n = ahghVar.a();
                aiulVar2.h(aiulVar2.d.d());
                return null;
            case 2:
                ahgn ahgnVar = (ahgn) obj;
                aiuf aiufVar3 = this.b;
                if (aiufVar3 != null && this.f) {
                    aiufVar3.d(ahgnVar);
                }
                aiul aiulVar3 = this.c;
                if (aiulVar3 == null) {
                    return null;
                }
                ahgn ahgnVar2 = aiulVar3.x;
                if (ahgnVar2 != null && ahgnVar2.d() == ahgnVar.d() && aiulVar3.x.e() == ahgnVar.e()) {
                    return null;
                }
                aiulVar3.b(false, aiulVar3.d.d());
                aiulVar3.x = ahgnVar;
                aiulVar3.h(aiulVar3.d.d());
                return null;
            case 3:
                ahhp ahhpVar = (ahhp) obj;
                if (ahhpVar != null) {
                    this.s = ahhpVar;
                }
                aiuf aiufVar4 = this.b;
                if (aiufVar4 != null && this.f) {
                    aiufVar4.e(ahhpVar);
                }
                aiul aiulVar4 = this.c;
                if (aiulVar4 == null || TextUtils.equals(aiulVar4.q, ahhpVar.b())) {
                    return null;
                }
                if (aiulVar4.k) {
                    aiulVar4.b(false, aiulVar4.d.d());
                    aiulVar4.h(aiulVar4.d.d());
                }
                aiulVar4.q = ahhpVar.b();
                return null;
            case 4:
                ahhu ahhuVar = (ahhu) obj;
                aiuf aiufVar5 = this.b;
                if (aiufVar5 != null && this.f) {
                    aiufVar5.f(ahhuVar);
                }
                aiul aiulVar5 = this.c;
                if (aiulVar5 == null || aiulVar5.w == ahhuVar.a()) {
                    return null;
                }
                aiulVar5.b(false, aiulVar5.d.d());
                aiulVar5.w = ahhuVar.a();
                aiulVar5.h(aiulVar5.d.d());
                return null;
            case 5:
                aiio aiioVar = (aiio) obj;
                this.e = true;
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
