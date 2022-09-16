package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: wtu  reason: default package */
/* loaded from: classes4.dex */
public class wtu implements wlo, wlk {
    public final azqb a;
    public final azqb b;
    public final azqb c;
    public final azqb d;
    public final azqb e;
    public final azqb f;
    public aijs i;
    private final azqb j;
    private final azqb k;
    private final azqb l;
    private final azqb m;
    public volatile wtt g = null;
    public AbstractMap.SimpleEntry h = null;
    private aika n = aika.NEW;
    private String o = "";
    private boolean p = false;

    public wtu(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10) {
        this.a = azqbVar;
        this.j = azqbVar2;
        this.b = azqbVar3;
        this.c = azqbVar4;
        this.d = azqbVar5;
        this.k = azqbVar6;
        this.e = azqbVar7;
        this.l = azqbVar8;
        this.f = azqbVar9;
        this.m = azqbVar10;
    }

    public static aqzm j(InstreamAdBreak instreamAdBreak) {
        for (aoyc aoycVar : instreamAdBreak.c.b()) {
            if ((aoycVar.b & 2) != 0) {
                aqzm aqzmVar = aoycVar.d;
                return aqzmVar == null ? aqzm.a : aqzmVar;
            }
        }
        return null;
    }

    public static avww k(PlayerResponseModel playerResponseModel) {
        for (aoyb aoybVar : playerResponseModel.C()) {
            for (aoyc aoycVar : aoybVar.c) {
                if ((aoycVar.b & 64) != 0) {
                    avww avwwVar = aoycVar.g;
                    return avwwVar == null ? avww.a : avwwVar;
                }
            }
        }
        return null;
    }

    public void f(aika aikaVar, final PlayerResponseModel playerResponseModel, final ajbf ajbfVar, final String str, String str2) {
        this.n = aikaVar;
        aika aikaVar2 = aika.NEW;
        int ordinal = aikaVar.ordinal();
        apak apakVar = null;
        if (ordinal == 0) {
            this.o = null;
            this.p = false;
        } else if (ordinal != 2) {
            if (ordinal != 8 || TextUtils.isEmpty(this.o) || !TextUtils.equals(str, this.o)) {
                return;
            }
            if (!this.p) {
                ajbk d = ajbfVar.d();
                if (d != null) {
                    d.p((wth) this.l.get());
                    d.o((wth) this.l.get());
                }
                ((wtm) this.j.get()).a(7, xcb.a(str, playerResponseModel), new wtl() { // from class: wts
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
                    @Override // defpackage.wtl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.util.List a() {
                        /*
                            Method dump skipped, instructions count: 638
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.wts.a():java.util.List");
                    }
                });
            }
            this.p = true;
        } else if (TextUtils.isEmpty(str) || TextUtils.equals(this.o, str)) {
        } else {
            this.o = str;
            this.p = false;
            wzx wzxVar = (wzx) this.m.get();
            asaj asajVar = playerResponseModel.a;
            if ((asajVar.b & 2) != 0) {
                atzv atzvVar = asajVar.e;
                if (atzvVar == null) {
                    atzvVar = atzv.a;
                }
                apakVar = atzvVar.i;
                if (apakVar == null) {
                    apakVar = apak.a;
                }
            }
            wzxVar.a(apakVar);
            ((wtm) this.j.get()).a(2, xcb.a(str, playerResponseModel), new wtl() { // from class: wtr
                @Override // defpackage.wtl
                public final List a() {
                    List a;
                    String b;
                    wtu wtuVar = wtu.this;
                    PlayerResponseModel playerResponseModel2 = playerResponseModel;
                    ajbf ajbfVar2 = ajbfVar;
                    String str3 = str;
                    ArrayList arrayList = new ArrayList();
                    if (wtu.k(playerResponseModel2) != null) {
                        if (wtu.k(playerResponseModel2) != null) {
                            avww k = wtu.k(playerResponseModel2);
                            wwd wwdVar = (wwd) wtuVar.d.get();
                            String b2 = wwdVar.b.b(apcd.SLOT_TYPE_PLAYBACK_TRACKING);
                            arrayList.add(xdu.j(b2, apcd.SLOT_TYPE_PLAYBACK_TRACKING, amuk.r(xab.a(wwdVar.b.c(apcf.TRIGGER_TYPE_BEFORE_CONTENT_VIDEO_ID_STARTED), str3)), amuk.r(xdx.a(wwdVar.b.c(apcf.TRIGGER_TYPE_SLOT_ID_ENTERED), b2)), amuk.r(xdy.a(wwdVar.b.c(apcf.TRIGGER_TYPE_SLOT_ID_EXITED), b2)), xac.b(new xas(str3), new xat(playerResponseModel2), new xbv(k))));
                            if (wtuVar.i != aijs.INLINE_IN_FEED) {
                                asaj asajVar2 = playerResponseModel2.a;
                                if ((asajVar2.b & 16777216) != 0) {
                                    wwd wwdVar2 = (wwd) wtuVar.d.get();
                                    atzu atzuVar = asajVar2.A;
                                    if (atzuVar == null) {
                                        atzuVar = atzu.a;
                                    }
                                    String b3 = wwdVar2.b.b(apcd.SLOT_TYPE_BELOW_PLAYER);
                                    arrayList.add(xdu.j(b3, apcd.SLOT_TYPE_BELOW_PLAYER, amuk.r(xab.a(wwdVar2.b.c(apcf.TRIGGER_TYPE_BEFORE_CONTENT_VIDEO_ID_STARTED), str3)), amuk.r(xdx.a(wwdVar2.b.c(apcf.TRIGGER_TYPE_SLOT_ID_ENTERED), b3)), amuk.s(xdg.a(wwdVar2.b.c(apcf.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), str3), xdy.a(wwdVar2.b.c(apcf.TRIGGER_TYPE_SLOT_ID_EXITED), b3)), xac.b(new xat(playerResponseModel2), new xbk(atzuVar))));
                                }
                            }
                        }
                    } else {
                        wtt wttVar = wtuVar.g;
                        xci xciVar = null;
                        wtuVar.g = null;
                        if (wttVar != null && wttVar.b && !((aikh) wtuVar.e.get()).i()) {
                            wttVar = null;
                        }
                        if ((playerResponseModel2.E() || !playerResponseModel2.C().isEmpty()) && !playerResponseModel2.d.d("PREROLL_SHOWN")) {
                            wmw wmwVar = (wmw) wtuVar.f.get();
                            wmwVar.a.d(new wyv());
                            zgz zgzVar = wmwVar.b;
                            if (zgzVar != null && zgzVar.a() != null) {
                                aopa createBuilder = asno.a.createBuilder();
                                createBuilder.copyOnWrite();
                                asno asnoVar = (asno) createBuilder.instance;
                                asnoVar.b |= 16384;
                                asnoVar.l = true;
                                ((acvg) wmwVar.b.a()).a((asno) createBuilder.mo39build());
                                ((acvg) wmwVar.b.a()).c("ad_i");
                            }
                            if (playerResponseModel2.E()) {
                                wwd wwdVar3 = (wwd) wtuVar.d.get();
                                String b4 = wwdVar3.b.b(apcd.SLOT_TYPE_PLAYER_BYTES);
                                arrayList.add(xdu.j(b4, apcd.SLOT_TYPE_PLAYER_BYTES, amuk.r(xea.a(wwdVar3.b.c(apcf.TRIGGER_TYPE_SLOT_ID_SCHEDULED), b4)), amuk.r(xea.a(wwdVar3.b.c(apcf.TRIGGER_TYPE_SLOT_ID_SCHEDULED), b4)), amuk.t(xdh.a(wwdVar3.b.c(apcf.TRIGGER_TYPE_ON_SLOT_CANCELLATION_REQUESTED), b4), xdy.a(wwdVar3.b.c(apcf.TRIGGER_TYPE_SLOT_ID_EXITED), b4), xdg.e(wwdVar3.b.c(apcf.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), str3)), xac.a(wwd.d(str3, ajbfVar2, playerResponseModel2, xdb.PRE_ROLL))));
                            } else {
                                if (wttVar != null) {
                                    a = wttVar.c;
                                } else {
                                    a = ((wwa) wtuVar.b.get()).a(playerResponseModel2);
                                }
                                wtuVar.h = new AbstractMap.SimpleEntry(str3, a);
                                if (!a.isEmpty() && ((InstreamAdBreak) a.get(0)).b() == xdb.PRE_ROLL && wtu.j((InstreamAdBreak) a.get(0)) == null) {
                                    wwd wwdVar4 = (wwd) wtuVar.d.get();
                                    if (wttVar != null) {
                                        b = wttVar.d;
                                    } else {
                                        b = ((wvw) wtuVar.c.get()).b(apcd.SLOT_TYPE_PLAYER_BYTES);
                                    }
                                    String str4 = b;
                                    InstreamAdBreak instreamAdBreak = (InstreamAdBreak) a.get(0);
                                    if (wttVar != null) {
                                        xciVar = wttVar.e;
                                    }
                                    List d2 = wwd.d(str3, ajbfVar2, playerResponseModel2, instreamAdBreak.b());
                                    d2.add(new xbe(instreamAdBreak));
                                    if (xciVar != null) {
                                        d2.add(new xbm(xciVar));
                                    }
                                    arrayList.add(xdu.j(str4, apcd.SLOT_TYPE_PLAYER_BYTES, amuk.r(xea.a(wwdVar4.b.c(apcf.TRIGGER_TYPE_SLOT_ID_SCHEDULED), str4)), amuk.r(xea.a(wwdVar4.b.c(apcf.TRIGGER_TYPE_SLOT_ID_SCHEDULED), str4)), amuk.t(xdh.a(wwdVar4.b.c(apcf.TRIGGER_TYPE_ON_SLOT_CANCELLATION_REQUESTED), str4), xdy.a(wwdVar4.b.c(apcf.TRIGGER_TYPE_SLOT_ID_EXITED), str4), xdg.e(wwdVar4.b.c(apcf.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), str3)), xac.a(d2)));
                                }
                            }
                        }
                    }
                    return arrayList;
                }
            });
        }
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.wlo
    public void i(PlayerResponseModel playerResponseModel) {
        aoyb o;
        wtt wttVar = this.g;
        if (wttVar == null || !TextUtils.equals(playerResponseModel.B(), wttVar.a) || !wttVar.b) {
            this.g = null;
            if (playerResponseModel.E() || (o = playerResponseModel.o()) == null || o.c.size() == 0) {
                return;
            }
            for (aoyc aoycVar : o.c) {
                if ((aoycVar.b & 2) != 0) {
                    return;
                }
            }
            List a = ((wwa) this.b.get()).a(playerResponseModel);
            if (a.isEmpty() || ((InstreamAdBreak) a.get(0)).b() != xdb.PRE_ROLL) {
                this.g = new wtt(playerResponseModel.B(), this.n, a, null, null);
                return;
            }
            InstreamAdBreak instreamAdBreak = (InstreamAdBreak) a.get(0);
            List b = ((wwa) this.b.get()).b(instreamAdBreak, instreamAdBreak.c(), playerResponseModel);
            String b2 = ((wvw) this.c.get()).b(apcd.SLOT_TYPE_PLAYER_BYTES);
            xci i = ((wvx) this.k.get()).i(b2, (InstreamAdBreak) a.get(0), b);
            if (i == null || i.b != apcb.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES) {
                int size = b.size();
                String valueOf = String.valueOf(i);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 106);
                sb.append("Bootstrapped layout construction resulted in non PlayerBytesLayout. PlayerAds count: ");
                sb.append(size);
                sb.append(", layout: ");
                sb.append(valueOf);
                wwf.a(null, sb.toString());
                return;
            }
            this.g = new wtt(playerResponseModel.B(), this.n, a, b2, i);
        }
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qD(afkn afknVar) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qE(String str) {
    }

    @Override // defpackage.wlk
    public final void qF(aijs aijsVar, aijs aijsVar2, int i, int i2, boolean z, boolean z2) {
        this.i = aijsVar;
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
