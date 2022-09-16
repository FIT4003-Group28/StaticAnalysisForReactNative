package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: afja  reason: default package */
/* loaded from: classes.dex */
public final class afja implements afje, afjf {
    public final Map a;
    private final int b;
    private final snc c;
    private final snc d;
    private final afst e;
    private final aadd f;
    private final Pair g;
    private final afjd h;
    private final zdp i;

    public afja(snc sncVar, snc sncVar2, Context context, afst afstVar, aadd aaddVar, afjd afjdVar) {
        sncVar.getClass();
        this.c = sncVar;
        sncVar2.getClass();
        this.d = sncVar2;
        afstVar.getClass();
        this.e = afstVar;
        this.f = aaddVar;
        this.g = zew.p(context);
        this.b = zfm.a(context);
        this.h = afjdVar;
        this.i = afjdVar.b;
        this.a = new ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.afiz d(com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel r17, java.lang.String r18, defpackage.awef r19, java.lang.String r20, java.lang.String r21, boolean r22, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r23) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afja.d(com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel, java.lang.String, awef, java.lang.String, java.lang.String, boolean, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel):afiz");
    }

    private final aujv e() {
        aadd aaddVar = this.f;
        if (aaddVar == null || aaddVar.a() == null) {
            return aujv.b;
        }
        atdy atdyVar = this.f.a().i;
        if (atdyVar == null) {
            atdyVar = atdy.a;
        }
        aujv aujvVar = atdyVar.f;
        return aujvVar == null ? aujv.b : aujvVar;
    }

    public final afiz a(String str, awef awefVar) {
        afiz d = d(null, str, awefVar, null, null, false, PlayerConfigModel.b);
        Map map = this.a;
        int i = pxi.a;
        map.put(str, d);
        return d;
    }

    public final afiz b(TrackingUrlModel trackingUrlModel, String str, awef awefVar, String str2, Integer num, String str3, VideoStreamingData videoStreamingData, boolean z, PlayerConfigModel playerConfigModel) {
        afiz d = d(trackingUrlModel, str, awefVar, str2, str3, z, playerConfigModel);
        if (d == null) {
            return null;
        }
        this.a.put(str, d);
        d.h(trackingUrlModel, str, str2, num, str3, videoStreamingData, playerConfigModel);
        return d;
    }

    @Override // defpackage.afje
    public final afiz c(String str) {
        return (afiz) this.a.get(str);
    }
}
