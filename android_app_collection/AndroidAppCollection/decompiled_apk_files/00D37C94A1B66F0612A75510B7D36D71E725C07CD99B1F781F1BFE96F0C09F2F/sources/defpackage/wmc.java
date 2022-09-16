package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: wmc  reason: default package */
/* loaded from: classes4.dex */
public final class wmc implements wle, wlk {
    public final abeb a;
    public final abec b;
    public acti c;
    private final Executor d;
    private final Map e;

    public wmc(Executor executor, abeb abebVar, abec abecVar) {
        this.d = executor;
        abebVar.getClass();
        this.a = abebVar;
        abecVar.getClass();
        this.b = abecVar;
        this.e = new HashMap();
    }

    @Override // defpackage.wlk
    public final void f(aika aikaVar, PlayerResponseModel playerResponseModel, ajbf ajbfVar, String str, String str2) {
        if (aikaVar == aika.NEW) {
            this.e.clear();
        }
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.wle
    public final ankt i(MediaAd mediaAd) {
        if (!this.e.containsKey(mediaAd.l)) {
            this.e.put(mediaAd.l, anii.h(anlz.q(mediaAd), new ampg() { // from class: wmb
                @Override // defpackage.ampg
                public final Object apply(Object obj) {
                    wmc wmcVar = wmc.this;
                    MediaAd mediaAd2 = (MediaAd) obj;
                    if (TextUtils.isEmpty(mediaAd2.n())) {
                        return null;
                    }
                    String n = mediaAd2.n();
                    byte[] bArr = mediaAd2.g;
                    String x = mediaAd2.x();
                    String m = mediaAd2.m();
                    abed b = wmcVar.b.b();
                    b.s = true;
                    b.v(n);
                    if (bArr.length <= 0) {
                        zep.b("Ad Watch Next Request Missing Tracking Params. See b/22612847");
                    } else {
                        b.k(bArr);
                    }
                    if (true == TextUtils.isEmpty(x)) {
                        x = "";
                    }
                    b.u(x);
                    if (true == TextUtils.isEmpty(m)) {
                        m = "";
                    }
                    m.getClass();
                    b.c = m;
                    try {
                        WatchNextResponseModel d = wmcVar.a.d(b);
                        acti actiVar = wmcVar.c;
                        if (actiVar != null) {
                            actiVar.D(new acte(d.d()));
                            wmcVar.c.r(mediaAd2.l);
                        }
                        return d;
                    } catch (aart e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
                        sb.append("Error making WatchNextRequest: ");
                        sb.append(valueOf);
                        wwf.a(null, sb.toString());
                        return null;
                    }
                }
            }, this.d));
        }
        return (ankt) this.e.get(mediaAd.l);
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qD(afkn afknVar) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qE(String str) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qF(aijs aijsVar, aijs aijsVar2, int i, int i2, boolean z, boolean z2) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qG(String str, long j, long j2, long j3, boolean z) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qK(String str, int i) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qM(ahgc ahgcVar) {
    }
}
