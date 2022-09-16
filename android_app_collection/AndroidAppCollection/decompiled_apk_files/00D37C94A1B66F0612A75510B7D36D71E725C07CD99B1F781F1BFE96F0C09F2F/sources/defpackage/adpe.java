package defpackage;

import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adpe  reason: default package */
/* loaded from: classes.dex */
public final class adpe implements adss {
    final /* synthetic */ adpl a;

    public adpe(adpl adplVar) {
        this.a = adplVar;
    }

    public static final String c(JSONObject jSONObject) {
        String str = adnl.a.b;
        if (jSONObject.has("videoId")) {
            return jSONObject.optString("videoId", str);
        }
        return jSONObject.optString("video_id", str);
    }

    private final void d(JSONObject jSONObject) {
        adnm adnmVar;
        if (this.a.M == null || !jSONObject.has("adState")) {
            return;
        }
        adpl adplVar = this.a;
        int i = jSONObject.getInt("adState");
        if (i == adnm.UNSTARTED.o) {
            adnmVar = adnm.AD_UNSTARTED;
        } else if (i == adnm.ENDED.o) {
            adnmVar = adnm.AD_ENDED;
        } else if (i == adnm.AD_SKIPPED.o) {
            adnmVar = adnm.AD_SKIPPED;
        } else if (i == adnm.PLAYING.o) {
            adnmVar = adnm.AD_PLAYING;
        } else if (i == adnm.PAUSED.o) {
            adnmVar = adnm.AD_PAUSED;
        } else if (i == adnm.BUFFERING.o) {
            adnmVar = adnm.AD_BUFFERING;
        } else {
            String str = adnm.n;
            StringBuilder sb = new StringBuilder(47);
            sb.append("YouTube MDx: invalid ad state code ");
            sb.append(i);
            sb.append(".");
            zep.c(str, sb.toString());
            adnmVar = adnm.AD_UNSTARTED;
        }
        adplVar.aA(adnmVar);
    }

    private final void e(JSONObject jSONObject) {
        if (this.a.M != null) {
            jSONObject.optInt("podPosition", 0);
            jSONObject.optInt("podLength", 0);
            jSONObject.optLong("podRemainingTime", 0L);
            this.a.i.d();
        }
    }

    private final void f(JSONObject jSONObject) {
        if (this.a.M == null || !jSONObject.has("currentTime")) {
            return;
        }
        this.a.U = TimeUnit.SECONDS.toMillis(jSONObject.getInt("currentTime"));
        adpl adplVar = this.a;
        adplVar.T = adplVar.i.d();
        this.a.ay = 0L;
    }

    private final void g(JSONObject jSONObject) {
        if (jSONObject.has("currentTime")) {
            this.a.U = jSONObject.getInt("currentTime") * 1000;
        } else if (jSONObject.has("current_time")) {
            this.a.U = jSONObject.getInt("current_time") * 1000;
        } else {
            this.a.U = 0L;
        }
        this.a.Z = jSONObject.has("liveIngestionTime");
        adpl adplVar = this.a;
        if (adplVar.Z) {
            adplVar.V = jSONObject.optInt("seekableEndTime", 0) * 1000;
        } else {
            adplVar.V = jSONObject.optInt("duration", 0) * 1000;
        }
        if (this.a.Z && jSONObject.has("seekableStartTime")) {
            this.a.W = jSONObject.getInt("seekableStartTime") * 1000;
        } else {
            this.a.W = -1L;
        }
        if (jSONObject.has("liveIngestionTime")) {
            this.a.X = jSONObject.getInt("liveIngestionTime") * 1000;
        } else {
            this.a.X = -1L;
        }
        adpl adplVar2 = this.a;
        adplVar2.T = adplVar2.i.d();
        this.a.ay = 0L;
    }

    private final void h(JSONObject jSONObject) {
        adnm adnmVar;
        adpl adplVar = this.a;
        int optInt = jSONObject.optInt("state", adnm.UNSTARTED.o);
        adnm[] values = adnm.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                adnmVar = adnm.UNSTARTED;
                break;
            }
            adnmVar = values[i];
            if (adnmVar.o == optInt) {
                break;
            }
            i++;
        }
        adplVar.aA(adnmVar);
    }

    private static final int i(JSONObject jSONObject) {
        return jSONObject.optInt("currentIndex", adnl.a.f);
    }

    private static final String j(JSONObject jSONObject) {
        return jSONObject.optString("listId", adnl.a.e);
    }

    final adnl a(JSONObject jSONObject) {
        if (this.a.F.i(c(jSONObject))) {
            adnk c = adnl.c();
            c.d(j(jSONObject));
            c.f(c(jSONObject));
            c.e(adnl.a(i(jSONObject)));
            adnl adnlVar = this.a.F;
            c.b = adnlVar.g;
            c.c = adnlVar.h;
            c.b(adnlVar.c);
            String.format("Parsing Playback results in MdxPlaybackDescriptor=%s", c.a());
            return c.a();
        }
        adnk c2 = adnl.c();
        c2.d(j(jSONObject));
        c2.f(c(jSONObject));
        c2.e(adnl.a(i(jSONObject)));
        String str = null;
        c2.b = jSONObject.has("params") ? jSONObject.getString("params") : null;
        if (jSONObject.has("playerParams")) {
            str = jSONObject.getString("playerParams");
        }
        c2.c = str;
        return c2.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0355, code lost:
        if (r2.equals("multiUserNotAllowed") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02de, code lost:
        if (r5.equals("UNSUPPORTED") != false) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x036d  */
    @Override // defpackage.adss
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.adtd r23) {
        /*
            Method dump skipped, instructions count: 1760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adpe.b(adtd):void");
    }
}
