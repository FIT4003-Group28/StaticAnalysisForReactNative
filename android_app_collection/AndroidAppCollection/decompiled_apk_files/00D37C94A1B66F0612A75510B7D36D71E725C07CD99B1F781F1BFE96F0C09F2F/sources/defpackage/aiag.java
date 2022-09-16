package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: aiag  reason: default package */
/* loaded from: classes.dex */
public final class aiag implements airt, ynl {
    final /* synthetic */ aiah a;

    public aiag(aiah aiahVar) {
        this.a = aiahVar;
    }

    public final void a(aesr aesrVar) {
        if (!agpr.q(aesrVar.b())) {
            return;
        }
        this.a.i = aesrVar.f();
        this.a.j = aesrVar.e();
        aiah aiahVar = this.a;
        if (!aiahVar.p) {
            return;
        }
        aiahVar.a.b(aiahVar.i);
        aiah aiahVar2 = this.a;
        aiahVar2.a.a(aiahVar2.j);
    }

    public final void b(ahhw ahhwVar) {
        aika aikaVar = aika.NEW;
        int ordinal = ahhwVar.c().ordinal();
        if (ordinal == 4 || ordinal == 7) {
            aanv aanvVar = null;
            if (ahhwVar.a() != null) {
                this.a.e = ahhwVar.a().B();
                this.a.f = ahhwVar.k();
            } else if (ahhwVar.b() != null) {
                this.a.e = ahhwVar.b().B();
                this.a.f = ahhwVar.e();
            } else {
                this.a.e = null;
            }
            PlayerResponseModel a = ahhwVar.c().h() ? ahhwVar.a() : ahhwVar.b();
            aiah aiahVar = this.a;
            float f = 0.0f;
            if (a.c() != null) {
                apim apimVar = a.c().c.f;
                if (apimVar == null) {
                    apimVar = apim.a;
                }
                f = Math.min(0.0f, apimVar.b);
            }
            aiahVar.s = f;
            VideoStreamingData videoStreamingData = a == null ? null : a.c;
            aiah aiahVar2 = this.a;
            if (videoStreamingData != null) {
                aanvVar = videoStreamingData.i();
            }
            aiahVar2.k = aanvVar;
            aiah aiahVar3 = this.a;
            aiahVar3.g = ((Integer) aiahVar3.b.get()).intValue();
            aiah aiahVar4 = this.a;
            aiahVar4.h = ((Integer) aiahVar4.c.get()).intValue();
            aiah aiahVar5 = this.a;
            if (!aiahVar5.p) {
                return;
            }
            aiahVar5.i();
        }
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().a.h(aiwv.n(airwVar.aB(), 32768L)).h(aiwv.l(1)).aa(new aiaf(this), ahqs.r), airwVar.G().k.Z(new aiaf(this, 1))};
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                a((aesr) obj);
                return null;
            } else if (i == 1) {
                b((ahhw) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{aesr.class, ahhw.class};
    }
}
