package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import com.google.android.libraries.youtube.ads.model.LocalVideoAd;
import com.google.android.libraries.youtube.ads.model.VideoTrackingAd;
import java.util.Map;
/* compiled from: PG */
/* renamed from: wna  reason: default package */
/* loaded from: classes4.dex */
public final class wna implements wli, wua, wub {
    public final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private wzd e;
    private afzn f;

    public wna(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        this.b = azqbVar;
        this.c = azqbVar2;
        this.d = azqbVar3;
        this.a = azqbVar4;
    }

    private final void h(String str) {
        if (this.e == null) {
            throw new wlb(str.length() != 0 ? "No assigned adStatsMacrosConverter when trying to run ".concat(str) : new String("No assigned adStatsMacrosConverter when trying to run "));
        }
    }

    private static boolean i(xdu xduVar, xci xciVar) {
        return xduVar.c() == apcd.SLOT_TYPE_PLAYER_BYTES && xciVar.g(apcb.LAYOUT_TYPE_MEDIA, xbh.class) && (xciVar.e(xbh.class) instanceof LocalVideoAd);
    }

    @Override // defpackage.wli
    public final Uri a(Uri uri, afzn... afznVarArr) {
        try {
            return ((afzo) this.b.get()).a(uri, afznVarArr);
        } catch (zhy e) {
            throw new wlb(e.toString());
        }
    }

    @Override // defpackage.wli
    public final Uri b(Uri uri, Map map) {
        try {
            return ((afzo) this.b.get()).a(uri, new wmy(map));
        } catch (zhy e) {
            throw new wlb(e.toString());
        }
    }

    @Override // defpackage.wli
    public final void c() {
        this.e = ((wzb) this.c.get()).a();
        ((afzo) this.b.get()).e(this.e);
    }

    @Override // defpackage.wli
    public final void d(String str, String str2) {
        h("applyNewPlaybackImpl");
        this.e.e(str, str2);
    }

    @Override // defpackage.wli
    public final void e(long j) {
        h("applyPlaybackPositionImpl");
        this.e.e = j;
    }

    @Override // defpackage.wli
    public final void f(aijs aijsVar, aijs aijsVar2, int i, int i2, boolean z, boolean z2) {
        h("applyPlayerGeometryEventImpl");
        this.e.c = new ahgn(aijsVar, aijsVar2, i, i2, z, z2);
    }

    @Override // defpackage.wli
    public final void g(VideoTrackingAd videoTrackingAd) {
        h("applyVideoTrackingAdImpl");
        this.e.a = new InstreamAdImpl(videoTrackingAd);
    }

    @Override // defpackage.wua
    public final void o(xdu xduVar, xci xciVar) {
        if (xrz.m((aadd) this.d.get()) && i(xduVar, xciVar)) {
            if (this.f != null) {
                wwf.b(xduVar, xciVar, "Ping migration non-null AdsConverterForExternalPings on media layout entered");
                return;
            }
            this.f = new wmz(this, xduVar, xciVar);
            ((afzo) this.b.get()).e(this.f);
        }
    }

    @Override // defpackage.wub
    public final void s(xdu xduVar, xci xciVar, int i) {
        if (this.f != null && i(xduVar, xciVar)) {
            ((afzo) this.b.get()).g(this.f);
            this.f = null;
        }
    }
}
