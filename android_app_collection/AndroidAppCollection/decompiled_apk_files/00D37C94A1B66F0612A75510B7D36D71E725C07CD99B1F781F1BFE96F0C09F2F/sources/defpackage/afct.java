package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
/* compiled from: PG */
/* renamed from: afct  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class afct implements amqo {
    public final /* synthetic */ afdv a;
    private final /* synthetic */ int b;

    public /* synthetic */ afct(afdv afdvVar) {
        this.a = afdvVar;
    }

    public /* synthetic */ afct(afdv afdvVar, int i) {
        this.b = i;
        this.a = afdvVar;
    }

    @Override // defpackage.amqo
    public final Object get() {
        VideoStreamingData videoStreamingData;
        owf owfVar;
        int a;
        ovy h;
        int i = this.b;
        if (i != 0) {
            boolean z = true;
            if (i == 1) {
                return Integer.valueOf(this.a.x.q());
            }
            if (i == 2) {
                return Integer.valueOf(this.a.x.B());
            }
            if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        return Long.valueOf(this.a.g());
                    }
                    afdv afdvVar = this.a;
                    return Integer.valueOf(afdvVar.x.j() + afdvVar.F.j);
                }
                aegu aeguVar = this.a.G;
                if (aeguVar == null || !aeguVar.f.e()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            afdv afdvVar2 = this.a;
            aqwu aqwuVar = afdvVar2.x.c.e;
            if (aqwuVar == null) {
                aqwuVar = aqwu.b;
            }
            long j = Long.MAX_VALUE;
            if (aqwuVar.as && (videoStreamingData = afdvVar2.t) != null) {
                aanm aanmVar = videoStreamingData.k;
                if (videoStreamingData.B()) {
                    if (aanmVar == null) {
                        j = afdvVar2.E() * 1000;
                    } else {
                        Object obj = aanmVar.l;
                        if (obj != null && (a = (owfVar = (owf) obj).a()) != 0) {
                            owi b = owfVar.b(a - 1);
                            if (!b.b.isEmpty()) {
                                owc owcVar = (owc) b.b.get(0);
                                if (!owcVar.b.isEmpty() && (h = ((owm) owcVar.b.get(0)).h()) != null) {
                                    int b2 = h.b(0L);
                                    j = h.e(b2) + h.d(b2, 0L);
                                }
                            }
                        }
                    }
                }
            }
            return Long.valueOf(j);
        }
        return Integer.valueOf(this.a.x.v());
    }
}
