package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: edu  reason: default package */
/* loaded from: classes3.dex */
public final class edu implements wuc {
    public final azqb a;
    private final azqb b;

    public edu(azqb azqbVar, azqb azqbVar2) {
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    @Override // defpackage.wuc
    public final void a(final xdu xduVar, final xci xciVar) {
        if (xduVar.c() == apcd.SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM && xciVar.b == apcb.LAYOUT_TYPE_MEDIA) {
            ((wtm) this.b.get()).a(14, xcb.a, new wtl() { // from class: edt
                @Override // defpackage.wtl
                public final List a() {
                    aoyb aoybVar;
                    aqtb aqtbVar;
                    edu eduVar = edu.this;
                    xdu xduVar2 = xduVar;
                    xci xciVar2 = xciVar;
                    if (!xduVar2.e(xbn.class) || !xciVar2.f(xbl.class)) {
                        return Arrays.asList(new xdu[0]);
                    }
                    for (asac asacVar : ((asaj) xciVar2.e(xbl.class)).m) {
                        if (asacVar.b == 84813246) {
                            aoybVar = (aoyb) asacVar.c;
                        } else {
                            aoybVar = aoyb.a;
                        }
                        for (aoyc aoycVar : aoybVar.c) {
                            avwt avwtVar = aoycVar.h;
                            if (avwtVar == null) {
                                avwtVar = avwt.a;
                            }
                            avws avwsVar = avwtVar.b;
                            if (avwsVar == null) {
                                avwsVar = avws.a;
                            }
                            if (avwsVar.b == 153515154) {
                                avwt avwtVar2 = aoycVar.h;
                                if (avwtVar2 == null) {
                                    avwtVar2 = avwt.a;
                                }
                                xdu[] xduVarArr = new xdu[1];
                                wwd wwdVar = (wwd) eduVar.a.get();
                                xdo xdoVar = (xdo) xduVar2.d(xbn.class);
                                avws avwsVar2 = avwtVar2.b;
                                if (avwsVar2 == null) {
                                    avwsVar2 = avws.a;
                                }
                                if (avwsVar2.b == 153515154) {
                                    aqtbVar = (aqtb) avwsVar2.c;
                                } else {
                                    aqtbVar = aqtb.a;
                                }
                                aoyz aoyzVar = avwtVar2.d;
                                if (aoyzVar == null) {
                                    aoyzVar = aoyz.a;
                                }
                                int i = avwtVar2.c;
                                String b = wwdVar.b.b(apcd.SLOT_TYPE_SEQUENCE_ITEM_IN_PLAYER);
                                xduVarArr[0] = new xdu(b, ampr.a(apcd.SLOT_TYPE_SEQUENCE_ITEM_IN_PLAYER, Integer.valueOf(i)), 1, amuk.r(new xdr(wwdVar.b.c(apcf.TRIGGER_TYPE_SEQUENCE_ITEM_IN_PLAYER_SPACE_AVAILABLE), apcf.TRIGGER_TYPE_SEQUENCE_ITEM_IN_PLAYER_SPACE_AVAILABLE, xdoVar)), amuk.r(xea.a(wwdVar.b.c(apcf.TRIGGER_TYPE_SLOT_ID_SCHEDULED), b)), amuk.r(new xdp(wwdVar.b.c(apcf.TRIGGER_TYPE_REEL_ITEM_SEQUENCE_ABANDONED), apcf.TRIGGER_TYPE_REEL_ITEM_SEQUENCE_ABANDONED)), xac.b(new xbn(xdoVar), new xay(aqtbVar), new xah(aoyzVar)));
                                return Arrays.asList(xduVarArr);
                            }
                        }
                    }
                    wwf.a(null, "No ElementRenderer found in reels PlayerResponse");
                    return Arrays.asList(new xdu[0]);
                }
            });
        }
    }
}
