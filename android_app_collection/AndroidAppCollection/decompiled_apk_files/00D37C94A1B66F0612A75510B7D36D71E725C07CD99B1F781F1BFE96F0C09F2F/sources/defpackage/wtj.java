package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import com.google.android.libraries.youtube.ads.model.LocalVideoAd;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.ads.model.RemoteVideoAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: wtj  reason: default package */
/* loaded from: classes4.dex */
public final class wtj implements wua, wub {
    public final wle a;
    public final azqb b;
    public final azqb c;
    public final amvn d;
    public String e = "";
    public final azqb f;
    public final aadd g;
    public final aacz h;
    private final azqb i;

    public wtj(azqb azqbVar, wle wleVar, azqb azqbVar2, azqb azqbVar3, amvn amvnVar, aadd aaddVar, aacz aaczVar, azqb azqbVar4) {
        this.i = azqbVar;
        this.a = wleVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = amvnVar;
        this.f = azqbVar4;
        this.g = aaddVar;
        this.h = aaczVar;
    }

    public final void a(List list, xdu xduVar, xci xciVar, MediaAd mediaAd, ankt anktVar) {
        wzr wzrVar;
        if (this.d.contains(apcd.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE) && xduVar.h(apcd.SLOT_TYPE_PLAYER_BYTES, xas.class, xat.class) && xciVar.g(apcb.LAYOUT_TYPE_MEDIA, xar.class)) {
            if (xciVar.k.d(xaf.class)) {
                wzrVar = (wzr) xciVar.e(xaf.class);
            } else {
                wzrVar = wzr.a;
            }
            wwd wwdVar = (wwd) this.c.get();
            String b = wwdVar.b.b(apcd.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE);
            list.add(xdu.j(b, apcd.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE, amuk.r(xcn.e(wwdVar.b.c(apcf.TRIGGER_TYPE_LAYOUT_ID_ENTERED), xciVar.a)), amuk.r(xdx.a(wwdVar.b.c(apcf.TRIGGER_TYPE_SLOT_ID_ENTERED), b)), amuk.s(xdg.a(wwdVar.b.c(apcf.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), (String) xduVar.d(xas.class)), xdy.a(wwdVar.b.c(apcf.TRIGGER_TYPE_SLOT_ID_EXITED), b)), xac.b(new xbj(xciVar.a), new xbf(new InstreamAdImpl(mediaAd)), new xat((PlayerResponseModel) xduVar.d(xat.class)), new xar((String) xciVar.e(xar.class)), new xaf(wzrVar), new xam(anii.h(anktVar, wdp.j, anjk.a)), new xak(anii.h(anktVar, wdp.k, anjk.a)), new xbt(anii.h(anktVar, wdp.l, anjk.a)), new xbr(anii.h(anktVar, wdp.m, anjk.a)))));
        }
    }

    public final void b(List list, xdu xduVar, xci xciVar, MediaAd mediaAd, ankt anktVar) {
        wzr wzrVar;
        if (this.d.contains(apcd.SLOT_TYPE_BELOW_PLAYER) && xduVar.h(apcd.SLOT_TYPE_PLAYER_BYTES, xas.class, xat.class) && xciVar.g(apcb.LAYOUT_TYPE_MEDIA, xar.class)) {
            if (xciVar.k.d(xaf.class)) {
                wzrVar = (wzr) xciVar.e(xaf.class);
            } else {
                wzrVar = wzr.a;
            }
            wwd wwdVar = (wwd) this.c.get();
            String str = (String) xduVar.d(xas.class);
            String b = wwdVar.b.b(apcd.SLOT_TYPE_BELOW_PLAYER);
            list.add(xdu.j(b, apcd.SLOT_TYPE_BELOW_PLAYER, amuk.r(new xcm(wwdVar.b.c(apcf.TRIGGER_TYPE_LAYOUT_ID_ENTERED_AND_SLOT_FULFILLED), apcf.TRIGGER_TYPE_LAYOUT_ID_ENTERED_AND_SLOT_FULFILLED, xciVar.a, b)), amuk.r(xcn.e(wwdVar.b.c(apcf.TRIGGER_TYPE_LAYOUT_ID_ENTERED), xciVar.a)), amuk.s(xdg.a(wwdVar.b.c(apcf.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), str), xdy.a(wwdVar.b.c(apcf.TRIGGER_TYPE_SLOT_ID_EXITED), b)), xac.b(new xbj(xciVar.a), new xbf(new InstreamAdImpl(mediaAd)), new xat((PlayerResponseModel) xduVar.d(xat.class)), new xar((String) xciVar.e(xar.class)), new xaf(wzrVar), new xas(str), new xap(anii.h(anktVar, wdp.n, anjk.a)))));
        }
    }

    public final void c(List list, xdu xduVar, xci xciVar, MediaAd mediaAd) {
        wzr wzrVar;
        if (this.d.contains(apcd.SLOT_TYPE_ADS_WATCH_NEXT_REQUEST) && xduVar.h(apcd.SLOT_TYPE_PLAYER_BYTES, xas.class, xat.class) && xciVar.g(apcb.LAYOUT_TYPE_MEDIA, xar.class)) {
            if (xciVar.k.d(xaf.class)) {
                wzrVar = (wzr) xciVar.e(xaf.class);
            } else {
                wzrVar = wzr.a;
            }
            wwd wwdVar = (wwd) this.c.get();
            String b = wwdVar.b.b(apcd.SLOT_TYPE_ADS_WATCH_NEXT_REQUEST);
            list.add(xdu.j(b, apcd.SLOT_TYPE_ADS_WATCH_NEXT_REQUEST, amuk.r(new xdz(wwdVar.b.c(apcf.TRIGGER_TYPE_SLOT_ID_FULFILLED_NON_EMPTY), apcf.TRIGGER_TYPE_SLOT_ID_FULFILLED_NON_EMPTY, b)), amuk.r(xcn.e(wwdVar.b.c(apcf.TRIGGER_TYPE_LAYOUT_ID_ENTERED), xciVar.a)), amuk.s(xdg.a(wwdVar.b.c(apcf.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), (String) xduVar.d(xas.class)), xdy.a(wwdVar.b.c(apcf.TRIGGER_TYPE_SLOT_ID_EXITED), b)), xac.b(new xbj(xciVar.a), new xbf(new InstreamAdImpl(mediaAd)), new xat((PlayerResponseModel) xduVar.d(xat.class)), new xar((String) xciVar.e(xar.class)), new xaf(wzrVar))));
        }
    }

    @Override // defpackage.wua
    public final void o(final xdu xduVar, final xci xciVar) {
        String str;
        PlayerResponseModel playerResponseModel;
        if (!xciVar.g(apcb.LAYOUT_TYPE_MEDIA, new Class[0]) || TextUtils.equals(xciVar.a, this.e)) {
            return;
        }
        if (xduVar.e(xas.class)) {
            str = (String) xduVar.d(xas.class);
        } else {
            str = xciVar.f(xas.class) ? (String) xciVar.e(xas.class) : "";
        }
        if (xduVar.e(xat.class)) {
            playerResponseModel = (PlayerResponseModel) xduVar.d(xat.class);
        } else {
            playerResponseModel = xciVar.f(xat.class) ? (PlayerResponseModel) xciVar.e(xat.class) : null;
        }
        ((wtm) this.i.get()).a(4, xcb.a(str, playerResponseModel), new wtl() { // from class: wti
            @Override // defpackage.wtl
            public final List a() {
                wtj wtjVar;
                xci xciVar2;
                xdu xduVar2;
                xci xciVar3;
                amuk t;
                wtj wtjVar2 = wtj.this;
                xdu xduVar3 = xduVar;
                xci xciVar4 = xciVar;
                ArrayList arrayList = new ArrayList();
                if (xduVar3.c != 4) {
                    wtjVar = wtjVar2;
                    xciVar2 = xciVar4;
                    if (xciVar2.g(apcb.LAYOUT_TYPE_MEDIA, xbh.class)) {
                        MediaAd mediaAd = (MediaAd) xciVar2.e(xbh.class);
                        ankt i = wtjVar.a.i(mediaAd);
                        if (wtjVar.d.contains(apcd.SLOT_TYPE_IN_PLAYER) && (mediaAd instanceof LocalVideoAd) && xduVar3.h(apcd.SLOT_TYPE_PLAYER_BYTES, xas.class, xat.class, xao.class) && xciVar2.g(apcb.LAYOUT_TYPE_MEDIA, xaf.class)) {
                            wwd wwdVar = (wwd) wtjVar.c.get();
                            String str2 = xciVar2.a;
                            wzu b = ((wtz) wtjVar.b.get()).b(xduVar3, xciVar2);
                            String b2 = wwdVar.b.b(apcd.SLOT_TYPE_IN_PLAYER);
                            arrayList.add(xdu.j(b2, apcd.SLOT_TYPE_IN_PLAYER, amuk.r(xcn.e(wwdVar.b.c(apcf.TRIGGER_TYPE_LAYOUT_ID_ENTERED), str2)), amuk.r(xdx.a(wwdVar.b.c(apcf.TRIGGER_TYPE_SLOT_ID_ENTERED), b2)), amuk.s(xdg.a(wwdVar.b.c(apcf.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), (String) xduVar3.d(xas.class)), xdy.a(wwdVar.b.c(apcf.TRIGGER_TYPE_SLOT_ID_EXITED), b2)), xac.b(new xbj(str2), new xat((PlayerResponseModel) xduVar3.d(xat.class)), new xao((xdb) xduVar3.d(xao.class)), new xai(b), new xaf((wzr) xciVar2.e(xaf.class)), new xby(i), new xbh(mediaAd))));
                        }
                        if (wtjVar.d.contains(apcd.SLOT_TYPE_IN_PLAYER) && xduVar3.h(apcd.SLOT_TYPE_PLAYER_BYTES, xas.class, xaw.class)) {
                            wwd wwdVar2 = (wwd) wtjVar.c.get();
                            String str3 = xciVar2.a;
                            String b3 = wwdVar2.b.b(apcd.SLOT_TYPE_IN_PLAYER);
                            arrayList.add(xdu.j(b3, apcd.SLOT_TYPE_IN_PLAYER, amuk.r(xcn.e(wwdVar2.b.c(apcf.TRIGGER_TYPE_LAYOUT_ID_ENTERED), str3)), amuk.r(xdx.a(wwdVar2.b.c(apcf.TRIGGER_TYPE_SLOT_ID_ENTERED), b3)), amuk.s(xdg.a(wwdVar2.b.c(apcf.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), (String) xduVar3.d(xas.class)), xdy.a(wwdVar2.b.c(apcf.TRIGGER_TYPE_SLOT_ID_EXITED), b3)), xac.b(new xaw((aeso) xduVar3.d(xaw.class)), new xbh(mediaAd), new xbj(str3), new xby(i))));
                        }
                        if (xrz.l(wtjVar.g)) {
                            wtjVar.c(arrayList, xduVar3, xciVar2, mediaAd);
                        } else {
                            wtjVar.b(arrayList, xduVar3, xciVar2, mediaAd, i);
                            wtjVar.a(arrayList, xduVar3, xciVar2, mediaAd, i);
                            if (wtjVar.d.contains(apcd.SLOT_TYPE_FULLSCREEN_ENGAGEMENT) && (mediaAd instanceof LocalVideoAd) && xduVar3.h(apcd.SLOT_TYPE_PLAYER_BYTES, xas.class)) {
                                wwd wwdVar3 = (wwd) wtjVar.c.get();
                                String str4 = xciVar2.a;
                                InstreamAdImpl instreamAdImpl = new InstreamAdImpl(mediaAd);
                                String b4 = wwdVar3.b.b(apcd.SLOT_TYPE_FULLSCREEN_ENGAGEMENT);
                                arrayList.add(xdu.j(b4, apcd.SLOT_TYPE_FULLSCREEN_ENGAGEMENT, amuk.r(xcn.e(wwdVar3.b.c(apcf.TRIGGER_TYPE_LAYOUT_ID_ENTERED), str4)), amuk.r(xdx.a(wwdVar3.b.c(apcf.TRIGGER_TYPE_SLOT_ID_ENTERED), b4)), amuk.s(xdg.a(wwdVar3.b.c(apcf.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), (String) xduVar3.d(xas.class)), xdy.a(wwdVar3.b.c(apcf.TRIGGER_TYPE_SLOT_ID_EXITED), b4)), xac.b(new xbj(str4), new xby(i), new xbf(instreamAdImpl))));
                            }
                            if (xduVar3.h(apcd.SLOT_TYPE_PLAYER_BYTES, xas.class, xat.class) && xciVar2.g(apcb.LAYOUT_TYPE_MEDIA, xar.class, xaf.class)) {
                                wta wtaVar = (wta) wtjVar.f.get();
                                anlz.A(i, new wsz(wtaVar, (String) xciVar2.e(xar.class), (String) xduVar3.d(xas.class), (PlayerResponseModel) xduVar3.d(xat.class), xciVar2.a, mediaAd), wtaVar.d);
                            }
                        }
                    }
                } else if (!xciVar4.g(apcb.LAYOUT_TYPE_MEDIA, xbo.class)) {
                    wtjVar = wtjVar2;
                    xciVar2 = xciVar4;
                } else {
                    RemoteVideoAd remoteVideoAd = (RemoteVideoAd) xciVar4.e(xbo.class);
                    ankt i2 = wtjVar2.a.i(remoteVideoAd);
                    if (!wtjVar2.d.contains(apcd.SLOT_TYPE_IN_PLAYER)) {
                        wtjVar = wtjVar2;
                        xduVar2 = xduVar3;
                        xciVar3 = xciVar4;
                    } else if (!xduVar3.h(apcd.SLOT_TYPE_PLAYER_BYTES, xas.class, xat.class, xao.class, xbg.class) || !xciVar4.g(apcb.LAYOUT_TYPE_MEDIA, xbo.class, xai.class)) {
                        xduVar2 = xduVar3;
                        xciVar3 = xciVar4;
                        wtjVar = wtjVar2;
                    } else {
                        if (xrz.n(wtjVar2.h).n) {
                            t = amuk.s(apcd.SLOT_TYPE_IN_PLAYER, apcd.SLOT_TYPE_LOCKSCREEN);
                        } else {
                            t = amuk.t(apcd.SLOT_TYPE_IN_PLAYER, apcd.SLOT_TYPE_LOCKSCREEN, apcd.SLOT_TYPE_FIXED_FOOTER);
                        }
                        wwd wwdVar4 = (wwd) wtjVar2.c.get();
                        String str5 = xciVar4.a;
                        String str6 = (String) xduVar3.d(xas.class);
                        wzr wzrVar = wzr.a;
                        boolean booleanValue = ((Boolean) xduVar3.d(xbg.class)).booleanValue();
                        xduVar2 = xduVar3;
                        ArrayList arrayList2 = new ArrayList(((amxx) t).c);
                        xciVar3 = xciVar4;
                        ArrayList arrayList3 = new ArrayList(Arrays.asList(new xbj(str5), new xat((PlayerResponseModel) xduVar3.d(xat.class)), new xao((xdb) xduVar3.d(xao.class)), new xai((wzu) xciVar4.e(xai.class)), new xaf(wzrVar), new xbg(booleanValue), new xby(i2)));
                        if (t.contains(apcd.SLOT_TYPE_FIXED_FOOTER) || booleanValue) {
                            arrayList3.add(new xbo(remoteVideoAd));
                        } else {
                            arrayList3.add(new xbh(remoteVideoAd));
                        }
                        amzt listIterator = t.listIterator();
                        while (listIterator.hasNext()) {
                            apcd apcdVar = (apcd) listIterator.next();
                            String b5 = wwdVar4.b.b(apcdVar);
                            arrayList2.add(xdu.j(b5, apcdVar, amuk.r(xcn.e(wwdVar4.b.c(apcf.TRIGGER_TYPE_LAYOUT_ID_ENTERED), str5)), amuk.r(xdx.a(wwdVar4.b.c(apcf.TRIGGER_TYPE_SLOT_ID_ENTERED), b5)), amuk.s(xdg.a(wwdVar4.b.c(apcf.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), str6), xdy.a(wwdVar4.b.c(apcf.TRIGGER_TYPE_SLOT_ID_EXITED), b5)), xac.a(arrayList3)));
                        }
                        arrayList.addAll(arrayList2);
                        wtjVar = wtjVar2;
                    }
                    if (xrz.l(wtjVar.g)) {
                        xciVar2 = xciVar3;
                        wtjVar.c(arrayList, xduVar2, xciVar2, remoteVideoAd);
                    } else {
                        xdu xduVar4 = xduVar2;
                        xciVar2 = xciVar3;
                        if (xrz.o(wtjVar.h)) {
                            wtj wtjVar3 = wtjVar;
                            wtjVar3.b(arrayList, xduVar4, xciVar2, remoteVideoAd, i2);
                            wtjVar3.a(arrayList, xduVar4, xciVar2, remoteVideoAd, i2);
                        }
                    }
                }
                wtjVar.e = xciVar2.a;
                return arrayList;
            }
        });
    }

    @Override // defpackage.wub
    public final void s(xdu xduVar, xci xciVar, int i) {
        if (!xciVar.g(apcb.LAYOUT_TYPE_MEDIA, new Class[0]) || !TextUtils.equals(xciVar.a, this.e)) {
            return;
        }
        this.e = "";
    }
}
