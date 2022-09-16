package defpackage;

import android.os.Handler;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
/* compiled from: PG */
/* renamed from: aewc  reason: default package */
/* loaded from: classes.dex */
public final class aewc extends affy {
    public final aevy a;
    public final amqo b;
    private final Handler f;

    public aewc(adzz adzzVar, afjz afjzVar, Handler handler, aevy aevyVar, amqo amqoVar) {
        super(adzzVar, afjzVar);
        this.a = aevyVar;
        this.f = handler;
        this.b = amqoVar;
    }

    public final void a(aeub aeubVar, VideoStreamingData videoStreamingData, boolean z, boolean z2, long j) {
        super.c(aeubVar, videoStreamingData);
        if (this.e.Z(aqwv.EXO_PLAYER_HOT_CONFIG_FEATURES_PLAYER_DEBUG_LOGGING)) {
            aeubVar.i("pdl", "onPreparing");
        }
        affx affxVar = this.a.c;
        if (affxVar.b) {
            aeubVar.e("hwh10p", true != affxVar.c ? "gpu" : "hw");
        }
        if (this.e.N()) {
            String str = true != z ? "f" : "sfo";
            String str2 = true != z2 ? ";pg" : ";po";
            aeubVar.e("esfo", str2.length() != 0 ? str.concat(str2) : new String(str));
        }
        afjz afjzVar = this.e;
        if (afjzVar.k == null) {
            afjzVar.az();
        }
        aeubVar.e("soc", afjzVar.k);
        if (videoStreamingData.C() || videoStreamingData.w) {
            aeubVar.e("cat", "manifestless");
        }
        if (j > 0) {
            aeubVar.i("st", Long.toString(j));
        }
    }

    public final void b(final Throwable th) {
        this.f.post(new Runnable() { // from class: aewb
            @Override // java.lang.Runnable
            public final void run() {
                aewc aewcVar = aewc.this;
                aewcVar.d.d(new afkn("player.exception", ((Long) aewcVar.b.get()).longValue(), th));
            }
        });
    }
}
