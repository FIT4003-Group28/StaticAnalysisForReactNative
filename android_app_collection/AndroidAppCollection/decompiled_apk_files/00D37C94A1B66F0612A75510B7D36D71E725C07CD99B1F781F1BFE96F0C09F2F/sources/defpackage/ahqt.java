package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: ahqt  reason: default package */
/* loaded from: classes.dex */
public final class ahqt implements ahqv, ahsm, airt, ynl {
    public final ahqw a;
    public final ahqw b;
    public final azqb c;
    private boolean d;
    private ahhw e;

    public ahqt(azqb azqbVar, ahqw ahqwVar, ahqw ahqwVar2) {
        azqbVar.getClass();
        this.c = azqbVar;
        this.a = ahqwVar;
        ahqwVar2.getClass();
        this.b = ahqwVar2;
        this.d = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ahhw ahhwVar) {
        PlayerResponseModel b;
        boolean j;
        VideoStreamingData videoStreamingData;
        this.e = ahhwVar;
        VideoStreamingData videoStreamingData2 = null;
        boolean z = false;
        if (ahhwVar.c() == aika.VIDEO_PLAYING || ahhwVar.c() == aika.INTERSTITIAL_PLAYING) {
            b = ahhwVar.b();
            j = ((ahso) this.c.get()).j();
            this.d = b.c().ak();
        } else {
            b = null;
            j = false;
        }
        this.b.a(this.d && j);
        boolean g = ahhwVar.c().g();
        if (!j || g) {
            this.a.a(false);
            return;
        }
        if (b != null && (videoStreamingData = b.c) != null) {
            videoStreamingData2 = videoStreamingData;
        }
        boolean z2 = videoStreamingData2 != null && videoStreamingData2.H();
        boolean z3 = videoStreamingData2 != null && videoStreamingData2.w();
        ahqw ahqwVar = this.a;
        if (this.d && (z2 || z3)) {
            z = true;
        }
        ahqwVar.a(z);
    }

    @Override // defpackage.ahqv
    public final void c() {
        ((ahso) this.c.get()).e();
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().a.h(aiwv.n(airwVar.aB(), 128L)).h(aiwv.l(1)).aa(new ayqb() { // from class: ahqr
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                ahqt.this.a((ahhw) obj);
            }
        }, ahqs.a)};
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                a((ahhw) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhw.class};
    }

    @Override // defpackage.ahsm
    public final void b(boolean z) {
        if (!z) {
            this.b.a(false);
            this.a.a(false);
            return;
        }
        ahhw ahhwVar = this.e;
        if (ahhwVar == null) {
            return;
        }
        a(ahhwVar);
    }
}
