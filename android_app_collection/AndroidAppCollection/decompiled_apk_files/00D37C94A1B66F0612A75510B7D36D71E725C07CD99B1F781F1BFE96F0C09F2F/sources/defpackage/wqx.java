package defpackage;

import com.google.android.libraries.youtube.ads.model.AdVideoEnd;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.MediaBreakAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.ads.model.SurveyAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
@wwb(a = apcb.LAYOUT_TYPE_MEDIA_BREAK, b = apcd.SLOT_TYPE_PLAYER_BYTES, c = {xbi.class, xbe.class, xaf.class}, d = {xas.class, xat.class})
/* renamed from: wqx  reason: default package */
/* loaded from: classes4.dex */
public final class wqx implements wra {
    public final wqz a;
    public final xci b;
    public final String c;
    public final PlayerResponseModel d;
    public final MediaBreakAd e;
    public wkp f;
    public final wvk g;
    private final wkt h;
    private final CopyOnWriteArrayList i;
    private final wlh j;
    private final wld k;
    private final xdu l;
    private final InstreamAdBreak m;
    private final wxs n;
    private final xcb o;

    public wqx(wkt wktVar, wqz wqzVar, wvk wvkVar, CopyOnWriteArrayList copyOnWriteArrayList, wlh wlhVar, wld wldVar, wzu wzuVar, yni yniVar, xdu xduVar, xci xciVar) {
        this.h = wktVar;
        this.a = wqzVar;
        this.g = wvkVar;
        this.i = copyOnWriteArrayList;
        this.j = wlhVar;
        this.k = wldVar;
        this.l = xduVar;
        this.b = xciVar;
        MediaBreakAd mediaBreakAd = (MediaBreakAd) xciVar.e(xbi.class);
        this.e = mediaBreakAd;
        String str = (String) xduVar.d(xas.class);
        this.c = str;
        InstreamAdBreak instreamAdBreak = (InstreamAdBreak) xciVar.e(xbe.class);
        this.m = instreamAdBreak;
        PlayerResponseModel playerResponseModel = (PlayerResponseModel) xduVar.d(xat.class);
        this.d = playerResponseModel;
        this.n = mediaBreakAd instanceof AdVideoEnd ? null : new wxs(yniVar, mediaBreakAd, instreamAdBreak.b(), playerResponseModel, wzuVar, (wzr) xciVar.e(xaf.class));
        this.o = xcb.a(str, playerResponseModel);
    }

    @Override // defpackage.wqg
    public final xci a() {
        return this.b;
    }

    @Override // defpackage.wqg
    public final void b() {
    }

    @Override // defpackage.wqg
    public final void qH() {
    }

    @Override // defpackage.wqg
    public final void qI() {
        wlh wlhVar = this.j;
        String str = this.c;
        InstreamAdBreak instreamAdBreak = this.m;
        PlayerAd playerAd = this.e;
        if (playerAd instanceof AdVideoEnd) {
            playerAd = ((AdVideoEnd) playerAd).c;
        }
        wlhVar.d(str, instreamAdBreak, playerAd);
        wqw wqwVar = new wqw(this);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            wkp wkpVar = (wkp) it.next();
            if (wkpVar.e(wqwVar)) {
                this.h.b(this.o, this.l, this.b);
                this.f = wkpVar;
                return;
            }
        }
        wqwVar.d(wzq.VIDEO_ERROR);
    }

    @Override // defpackage.wqg
    public final void qJ(int i) {
        wxs wxsVar;
        if (i == 0) {
            MediaBreakAd mediaBreakAd = this.e;
            if ((mediaBreakAd instanceof SurveyAd) || (mediaBreakAd instanceof AdVideoEnd)) {
                this.j.l();
            }
        }
        if (i != 4 && i != 1) {
            this.k.a(this.e);
        }
        wkp wkpVar = this.f;
        if (wkpVar != null) {
            wkpVar.c();
            this.f = null;
        }
        this.j.a();
        if (!(this.e instanceof AdVideoEnd) && (wxsVar = this.n) != null) {
            wxsVar.a();
        }
        this.h.e(this.o, this.l, this.b, i);
    }
}
