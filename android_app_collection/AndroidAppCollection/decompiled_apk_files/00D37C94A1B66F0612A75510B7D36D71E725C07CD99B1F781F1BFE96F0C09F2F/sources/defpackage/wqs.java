package defpackage;

import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
@wwb(a = apcb.LAYOUT_TYPE_MEDIA, b = apcd.SLOT_TYPE_PLAYER_BYTES, c = {xbh.class, xbe.class}, d = {xas.class, xat.class})
/* renamed from: wqs  reason: default package */
/* loaded from: classes4.dex */
public final class wqs implements wra, wlp {
    private final wlh a;
    private final xdu b;
    private final xci c;
    private final wkt d;
    private final xcb e;

    public wqs(wlh wlhVar, wnj wnjVar, xdu xduVar, xci xciVar, wkt wktVar) {
        this.a = wlhVar;
        this.b = xduVar;
        this.c = xciVar;
        this.d = wktVar;
        this.e = xcb.a((String) xduVar.d(xas.class), (PlayerResponseModel) xduVar.d(xat.class));
        wnjVar.a(this);
    }

    @Override // defpackage.wqg
    public final xci a() {
        return this.c;
    }

    @Override // defpackage.wqg
    public final void b() {
    }

    @Override // defpackage.wlp
    public final /* synthetic */ void i(String str) {
    }

    @Override // defpackage.wlp
    public final void j(long j) {
        this.a.k(j, ((MediaAd) this.c.e(xbh.class)).l);
    }

    @Override // defpackage.wqg
    public final void qH() {
    }

    @Override // defpackage.wqg
    public final void qI() {
        this.a.b((String) this.b.d(xas.class), (InstreamAdBreak) this.c.e(xbe.class), (MediaAd) this.c.e(xbh.class));
        this.d.b(this.e, this.b, this.c);
    }

    @Override // defpackage.wqg
    public final void qJ(int i) {
        this.d.e(this.e, this.b, this.c, i);
    }
}
