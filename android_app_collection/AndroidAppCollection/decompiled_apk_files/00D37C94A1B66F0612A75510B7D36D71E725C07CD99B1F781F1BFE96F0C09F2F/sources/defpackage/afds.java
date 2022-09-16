package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afds  reason: default package */
/* loaded from: classes.dex */
public final class afds implements aemh {
    public afdo a;
    aent b;
    aent c;
    final /* synthetic */ afdv d;
    private final aanr e;
    private final afdo f;
    private final VideoStreamingData g;
    private final Object h;
    private final aetv i;
    private final boolean j;
    private final boolean k;
    private int l;

    public afds(afdv afdvVar, aanr aanrVar, afdo afdoVar, VideoStreamingData videoStreamingData, Object obj, aetv aetvVar) {
        this.d = afdvVar;
        this.e = aanrVar;
        this.f = afdoVar;
        this.g = videoStreamingData;
        this.h = obj;
        this.i = aetvVar;
        arhd a = afdvVar.O.a.a();
        boolean z = false;
        if (a != null) {
            atdy atdyVar = a.i;
            apmu apmuVar = (atdyVar == null ? atdy.a : atdyVar).j;
            if ((apmuVar == null ? apmu.a : apmuVar).b) {
                z = true;
            }
        }
        this.j = z;
        this.k = afdvVar.O.o().j;
    }

    public final void b() {
        aent aentVar;
        aent aentVar2;
        arhd a;
        ylr.c();
        if (this.h != this.d.B) {
            return;
        }
        int i = this.b.d;
        ylr.c();
        VideoStreamingData c = aanz.c(i);
        PlayerConfigModel playerConfigModel = this.e.f;
        afdv afdvVar = this.d;
        aflk c2 = afll.c(c, playerConfigModel, afdvVar.O, afdvVar.a);
        int t = this.e.f.t();
        if ((this.j || this.k) && (aentVar = this.b) != null && (aentVar2 = this.c) != null) {
            int i2 = (int) (aentVar.i + aentVar2.i);
            long h = this.d.d.h() / 8;
            afjz afjzVar = this.d.O;
            int t2 = this.e.f.t();
            if (i2 > 0 && h > 0 && (a = afjzVar.a.a()) != null) {
                atdy atdyVar = a.i;
                if (atdyVar == null) {
                    atdyVar = atdy.a;
                }
                apmu apmuVar = atdyVar.j;
                if (apmuVar == null) {
                    apmuVar = apmu.a;
                }
                int i3 = apmuVar.c;
                if (i3 > 0 && apmuVar.e >= 0) {
                    t = Math.max(apmuVar.d, Math.min(apmuVar.e, (int) Math.max(0.0f, (1.0f - (((float) h) / i2)) * i3)));
                    aetv aetvVar = this.i;
                    StringBuilder sb = new StringBuilder(44);
                    sb.append(t);
                    sb.append(";");
                    sb.append(h);
                    sb.append(";");
                    sb.append(i2);
                    aetvVar.i("bamb", new aest(sb.toString()));
                }
            }
            t = t2;
            aetv aetvVar2 = this.i;
            StringBuilder sb2 = new StringBuilder(44);
            sb2.append(t);
            sb2.append(";");
            sb2.append(h);
            sb2.append(";");
            sb2.append(i2);
            aetvVar2.i("bamb", new aest(sb2.toString()));
        }
        int i4 = t;
        afdv afdvVar2 = this.d;
        if (afdvVar2.N != c2.c || !afdvVar2.aa() || this.j) {
            afdv afdvVar3 = this.d;
            aekw L = afdvVar3.L("video/x-unknown", afdvVar3.c);
            afdv afdvVar4 = this.d;
            afdo afdoVar = new afdo(L, afdvVar4.L("audio/x-unknown", afdvVar4.c));
            this.a = afdoVar;
            this.d.ac(this.e, afdoVar, this.g, c2.c, i4, ((aeot) this.i).a);
            this.d.C.d = c2;
            this.a.a(this.b, 2);
            aent aentVar3 = this.c;
            if (aentVar3 == null) {
                return;
            }
            this.a.a(aentVar3, 1);
            return;
        }
        this.d.C.d = c2;
    }

    @Override // defpackage.aemh
    public final void a(aent aentVar, int i) {
        if (this.j || this.k) {
            this.f.a(aentVar, i);
            if (i - 1 != 0) {
                this.b = aentVar;
            } else {
                this.c = aentVar;
            }
            int i2 = this.l + 1;
            this.l = i2;
            if (i2 != 2) {
                return;
            }
            if (this.b == null || this.c == null) {
                aeny.g("PrewarmTrackRenderersListener missing video or audio data.");
                return;
            } else {
                this.d.j.post(new Runnable() { // from class: afdq
                    @Override // java.lang.Runnable
                    public final void run() {
                        afds.this.b();
                    }
                });
                return;
            }
        }
        this.f.a(aentVar, i);
        if (i - 1 != 0) {
            this.d.j.post(new afdr(this, aentVar, 1));
        } else {
            this.d.j.post(new afdr(this, aentVar));
        }
    }
}
