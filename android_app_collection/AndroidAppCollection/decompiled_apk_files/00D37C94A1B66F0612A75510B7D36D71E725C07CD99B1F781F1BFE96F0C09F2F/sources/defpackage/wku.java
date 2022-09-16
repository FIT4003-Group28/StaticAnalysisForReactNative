package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.RemoteVideoAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.List;
/* compiled from: PG */
/* renamed from: wku  reason: default package */
/* loaded from: classes4.dex */
public final class wku implements wzu {
    public final yni a;
    private final wlm b;
    private final wkt c;
    private final wvx e;
    private apzg f;
    private xdu g;
    private xci h;
    private xci i;
    private xcb j;
    private final wnb k;
    private final aacz l;
    private final wmt m;

    public wku(wlm wlmVar, wkt wktVar, wvx wvxVar, wnb wnbVar, aacz aaczVar, wmt wmtVar, yni yniVar) {
        this.b = wlmVar;
        this.c = wktVar;
        this.e = wvxVar;
        this.k = wnbVar;
        this.l = aaczVar;
        this.m = wmtVar;
        this.a = yniVar;
    }

    private final void f(wzq wzqVar) {
        int a = xci.a(wzqVar);
        if (xrz.o(this.l)) {
            this.c.e(this.j, this.g, this.i, a);
        }
        this.c.e(this.j, this.g, this.h, a);
        xdu xduVar = this.g;
        if (xduVar != null) {
            this.c.l(this.j, xduVar);
            this.c.p(this.j, this.g);
        }
    }

    public final void a(PlayerResponseModel playerResponseModel, RemoteVideoAd remoteVideoAd, wzq wzqVar) {
        this.a.d(new wxo(remoteVideoAd, wzqVar));
        new wxs(this.a, remoteVideoAd, xdb.PRE_ROLL, playerResponseModel, this, wzr.a).a();
        c(wzqVar);
    }

    public final void b(RemoteVideoAd remoteVideoAd, String str, PlayerResponseModel playerResponseModel, boolean z) {
        xci xciVar;
        this.f = remoteVideoAd.s;
        if (xrz.o(this.l)) {
            if (this.h != null && (xciVar = this.i) != null) {
                if (TextUtils.equals(remoteVideoAd.l, xciVar.a)) {
                    return;
                }
                f(wzq.VIDEO_ERROR);
            }
            xdu c = wwd.c(this.k.a(), str, playerResponseModel, xdb.PRE_ROLL, z);
            this.g = c;
            String a = this.e.c.a(apcb.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES, c.a);
            xci b = xci.b(a, apcb.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES, 4, xac.b(new xbp(amuk.r(xci.b(remoteVideoAd.l, apcb.LAYOUT_TYPE_MEDIA, 4, xac.b(new xbo(remoteVideoAd), new xai(this), new xar(a)))))));
            this.h = b;
            this.i = (xci) ((List) b.e(xbp.class)).get(0);
            xcb b2 = xcb.b(str, playerResponseModel, true);
            this.j = b2;
            this.c.o(b2, this.g);
            this.c.f(this.j, this.g, this.h);
            this.c.f(this.j, this.g, this.i);
            this.c.i(this.j, this.g);
            this.c.b(this.j, this.g, this.h);
            this.c.b(this.j, this.g, this.i);
            return;
        }
        xci xciVar2 = this.h;
        if (xciVar2 != null) {
            if (TextUtils.equals(remoteVideoAd.l, xciVar2.a)) {
                return;
            }
            f(wzq.VIDEO_ERROR);
        }
        this.g = wwd.c(this.k.a(), str, playerResponseModel, xdb.PRE_ROLL, z);
        this.h = xci.b(remoteVideoAd.l, apcb.LAYOUT_TYPE_MEDIA, 4, xac.b(new xbo(remoteVideoAd), new xai(this)));
        xcb b3 = xcb.b(str, playerResponseModel, true);
        this.j = b3;
        this.c.o(b3, this.g);
        this.c.f(this.j, this.g, this.h);
        this.c.i(this.j, this.g);
        this.c.b(this.j, this.g, this.h);
    }

    public final void c(wzq wzqVar) {
        apzg apzgVar;
        if (this.h == null) {
            return;
        }
        if (xrz.o(this.l) && (apzgVar = this.f) != null) {
            this.m.b(apzgVar, null);
        }
        f(wzqVar);
    }

    @Override // defpackage.wzu
    public final void d(int i, int i2) {
        this.b.d(i, i2);
    }

    @Override // defpackage.wzu
    public final void e() {
    }
}
