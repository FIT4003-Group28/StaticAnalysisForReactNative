package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: wte  reason: default package */
/* loaded from: classes4.dex */
public final class wte implements wua {
    public final azqb a;
    private final azqb b;
    private final amvn c;
    private final aadd d;

    public wte(azqb azqbVar, azqb azqbVar2, amvn amvnVar, aadd aaddVar) {
        this.b = azqbVar;
        this.a = azqbVar2;
        this.c = amvnVar;
        this.d = aaddVar;
    }

    @Override // defpackage.wua
    public final void o(xdu xduVar, final xci xciVar) {
        final aunb aunbVar;
        if (xrz.e(this.d) && this.c.contains(apcd.SLOT_TYPE_IN_PLAYER) && xduVar.h(apcd.SLOT_TYPE_PLAYBACK_TRACKING, xas.class, xat.class) && xciVar.g(apcb.LAYOUT_TYPE_DISCOVERY_PLAYBACK_TRACKER, new Class[0])) {
            final String str = (String) xduVar.d(xas.class);
            PlayerResponseModel playerResponseModel = (PlayerResponseModel) xduVar.d(xat.class);
            asaj asajVar = playerResponseModel.a;
            if ((2 & asajVar.c) != 0) {
                aunbVar = asajVar.G;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
            } else {
                aunbVar = null;
            }
            if (aunbVar == null) {
                return;
            }
            ((wtm) this.b.get()).a(19, xcb.a(str, playerResponseModel), new wtl() { // from class: wtd
                @Override // defpackage.wtl
                public final List a() {
                    wte wteVar = wte.this;
                    xci xciVar2 = xciVar;
                    String str2 = str;
                    aunb aunbVar2 = aunbVar;
                    String str3 = xciVar2.a;
                    wwd wwdVar = (wwd) wteVar.a.get();
                    String b = wwdVar.b.b(apcd.SLOT_TYPE_IN_PLAYER);
                    return Arrays.asList(xdu.j(b, apcd.SLOT_TYPE_IN_PLAYER, amuk.r(xcn.e(wwdVar.b.c(apcf.TRIGGER_TYPE_LAYOUT_ID_ENTERED), str3)), amuk.r(xdx.a(wwdVar.b.c(apcf.TRIGGER_TYPE_SLOT_ID_ENTERED), b)), amuk.s(xdg.a(wwdVar.b.c(apcf.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), str2), xdy.a(wwdVar.b.c(apcf.TRIGGER_TYPE_SLOT_ID_EXITED), b)), xac.b(new xav(aunbVar2), new xax(str3))));
                }
            });
        }
    }
}
