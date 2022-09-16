package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.AdIntro;
import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import com.google.android.libraries.youtube.ads.model.LocalVideoAd;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.ads.model.MediaBreakAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.ads.model.ThrottledAd;
import com.google.android.libraries.youtube.innertube.model.ads.InstreamAd;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.SimpleAdBadgeRendererOuterClass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: wvx  reason: default package */
/* loaded from: classes4.dex */
public final class wvx {
    public final wvy a;
    public final wwc b;
    public final wvw c;
    public final wwe d;
    private final wnb e;

    public wvx(wnb wnbVar, wvy wvyVar, wwc wwcVar, wvw wvwVar, wwe wweVar) {
        this.e = wnbVar;
        this.a = wvyVar;
        this.b = wwcVar;
        this.c = wvwVar;
        this.d = wweVar;
    }

    private static final String j(aqvm aqvmVar) {
        aqvq aqvqVar = aqvmVar.b == 138681066 ? (aqvq) aqvmVar.c : null;
        if (aqvqVar == null) {
            return null;
        }
        String str = aqvqVar.d == 1 ? (String) aqvqVar.e : null;
        if (str != null) {
            return str;
        }
        wwf.a(null, "Ad engagement panel has no panel ID.");
        return null;
    }

    public final xci a(xdu xduVar, String str, apcb apcbVar, ampq ampqVar, String str2, InstreamAd instreamAd, List list) {
        if (list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String j = j((aqvm) it.next());
            if (TextUtils.isEmpty(j)) {
                wwf.a(null, "Missing panel ID for ads engagement panel.");
            }
            arrayList.add(j);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new xaj(list));
        arrayList2.add(new xbd(arrayList));
        amuf f = amuk.f();
        f.h(xdc.e(this.c.c(apcf.TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED), str2, apcd.SLOT_TYPE_PLAYER_BYTES, apcb.LAYOUT_TYPE_MEDIA));
        if (instreamAd instanceof InstreamAdImpl) {
            PlayerAd playerAd = ((InstreamAdImpl) instreamAd).b;
            if ((playerAd instanceof LocalVideoAd) && ((LocalVideoAd) playerAd).B()) {
                f.h(xed.e(this.c.c(apcf.TRIGGER_TYPE_SURVEY_SUBMITTED), str));
                return xci.i(str, apcbVar, f.g(), amuk.q(), amuk.q(), ampqVar, ampq.j(this.d.c(xduVar, str, apcbVar, 1, (aoyz) ampqVar.f())), amon.a, xac.a(arrayList2));
            }
        }
        return xci.i(str, apcbVar, f.g(), amuk.q(), amuk.q(), ampqVar, ampq.j(this.d.c(xduVar, str, apcbVar, 1, (aoyz) ampqVar.f())), amon.a, xac.a(arrayList2));
    }

    public final xci b(String str, InstreamAdBreak instreamAdBreak, ForecastingAd forecastingAd) {
        wvw wvwVar = this.c;
        apcb apcbVar = apcb.LAYOUT_TYPE_FORECASTING;
        String str2 = forecastingAd.l;
        String a = wvwVar.a(apcbVar, str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new xba(forecastingAd));
        if (instreamAdBreak != null) {
            arrayList.add(new xbe(instreamAdBreak));
        }
        return xci.h(a, apcb.LAYOUT_TYPE_FORECASTING, amuk.r(xdd.e(this.c.c(apcf.TRIGGER_TYPE_ON_LAYOUT_SELF_EXIT_REQUESTED), a)), amon.a, xac.a(arrayList));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.xci c(defpackage.xdu r16, java.lang.String r17, defpackage.apcb r18, defpackage.ampq r19, java.lang.String r20, com.google.android.libraries.youtube.innertube.model.ads.InstreamAd r21, java.util.List r22, defpackage.apzg r23, java.util.Map r24, java.lang.String r25, defpackage.wzr r26) {
        /*
            r15 = this;
            r0 = r15
            r1 = r21
            r2 = r23
            r3 = r24
            int r4 = r22.size()
            r5 = 0
            if (r4 != 0) goto Lf
            return r5
        Lf:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r6 = r22.iterator()
        L18:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L37
            java.lang.Object r7 = r6.next()
            aqvm r7 = (defpackage.aqvm) r7
            java.lang.String r7 = j(r7)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L33
            java.lang.String r8 = "Missing panel ID for ads engagement panel."
            defpackage.wwf.a(r5, r8)
        L33:
            r4.add(r7)
            goto L18
        L37:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            xaj r6 = new xaj
            r7 = r22
            r6.<init>(r7)
            r5.add(r6)
            xbd r6 = new xbd
            r6.<init>(r4)
            r5.add(r6)
            if (r2 == 0) goto L62
            if (r3 == 0) goto L62
            xbu r4 = new xbu
            r4.<init>(r2)
            r5.add(r4)
            xbs r2 = new xbs
            r2.<init>(r3)
            r5.add(r2)
        L62:
            amuf r2 = defpackage.amuk.f()
            wvw r3 = r0.c
            apcf r4 = defpackage.apcf.TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED
            java.lang.String r3 = r3.c(r4)
            apcd r4 = defpackage.apcd.SLOT_TYPE_PLAYER_BYTES
            apcb r6 = defpackage.apcb.LAYOUT_TYPE_MEDIA
            r7 = r20
            xdc r3 = defpackage.xdc.e(r3, r7, r4, r6)
            r2.h(r3)
            boolean r3 = r1 instanceof com.google.android.libraries.youtube.ads.model.InstreamAdImpl
            if (r3 == 0) goto La7
            com.google.android.libraries.youtube.ads.model.InstreamAdImpl r1 = (com.google.android.libraries.youtube.ads.model.InstreamAdImpl) r1
            com.google.android.libraries.youtube.ads.model.PlayerAd r1 = r1.b
            boolean r3 = r1 instanceof com.google.android.libraries.youtube.ads.model.LocalVideoAd
            if (r3 == 0) goto La7
            com.google.android.libraries.youtube.ads.model.LocalVideoAd r1 = (com.google.android.libraries.youtube.ads.model.LocalVideoAd) r1
            boolean r3 = r1.B()
            if (r3 != 0) goto L95
            boolean r1 = r1.A()
            if (r1 == 0) goto La7
        L95:
            wvw r1 = r0.c
            apcf r3 = defpackage.apcf.TRIGGER_TYPE_SURVEY_SUBMITTED
            java.lang.String r1 = r1.c(r3)
            r3 = r17
            xed r1 = defpackage.xed.e(r1, r3)
            r2.h(r1)
            goto La9
        La7:
            r3 = r17
        La9:
            r1 = r26
            int r1 = r1.c
            r4 = 1
            if (r1 <= r4) goto Lc2
            wvw r1 = r0.c
            apcf r4 = defpackage.apcf.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON
            java.lang.String r1 = r1.c(r4)
            r4 = 0
            r6 = r25
            xcl r1 = defpackage.xcl.e(r1, r6, r4)
            r2.h(r1)
        Lc2:
            wwe r1 = r0.d
            java.lang.Object r4 = r19.f()
            aoyz r4 = (defpackage.aoyz) r4
            r6 = 1
            r20 = r1
            r21 = r16
            r22 = r17
            r23 = r18
            r24 = r6
            r25 = r4
            asit r1 = r20.c(r21, r22, r23, r24, r25)
            amuk r8 = r2.g()
            amuk r9 = defpackage.amuk.q()
            amuk r10 = defpackage.amuk.q()
            ampq r12 = defpackage.ampq.j(r1)
            amon r13 = defpackage.amon.a
            xac r14 = defpackage.xac.a(r5)
            r6 = r17
            r7 = r18
            r11 = r19
            xci r1 = defpackage.xci.i(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wvx.c(xdu, java.lang.String, apcb, ampq, java.lang.String, com.google.android.libraries.youtube.innertube.model.ads.InstreamAd, java.util.List, apzg, java.util.Map, java.lang.String, wzr):xci");
    }

    public final xci d(xdu xduVar, apcd apcdVar, String str) {
        apcb apcbVar;
        apcd apcdVar2 = apcd.SLOT_TYPE_UNSPECIFIED;
        int ordinal = apcdVar.ordinal();
        if (ordinal != 5) {
            if (ordinal == 9) {
                apcbVar = apcb.LAYOUT_TYPE_AD_MEDIA_CONTROLS_BAR;
            } else if (ordinal == 10) {
                apcbVar = apcb.LAYOUT_TYPE_AD_MEDIA_CONTROLS_BAR_EXPANDABLE;
            } else {
                String valueOf = String.valueOf(apcdVar.name());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Illegal slot type for building mdx layout: ".concat(valueOf) : new String("Illegal slot type for building mdx layout: "));
            }
        } else if (!xduVar.e(xbg.class) || !((Boolean) xduVar.d(xbg.class)).booleanValue()) {
            apcbVar = apcb.LAYOUT_TYPE_MEDIA_LAYOUT_PLAYER_OVERLAY_LIGHTWEIGHT;
        } else {
            apcbVar = apcb.LAYOUT_TYPE_AD_INFO_OVERLAY;
        }
        String a = this.c.a(apcbVar, xduVar.a);
        return xci.h(a, apcbVar, amuk.r(xco.e(this.c.c(apcf.TRIGGER_TYPE_LAYOUT_ID_EXITED), str)), ampq.j(this.d.c(xduVar, a, apcbVar, 1, null)), xac.b(new xal[0]));
    }

    public final xci e(xdu xduVar, apax apaxVar) {
        aoyz aoyzVar;
        if ((apaxVar.b & 128) != 0) {
            aoyzVar = apaxVar.i;
            if (aoyzVar == null) {
                aoyzVar = aoyz.a;
            }
        } else {
            aoyzVar = null;
        }
        String a = this.c.a(apcb.LAYOUT_TYPE_ENDCAP, xduVar.a);
        return xci.d(a, apcb.LAYOUT_TYPE_ENDCAP, 3, amuk.q(), amuk.q(), amuk.q(), ampq.i(aoyzVar), ampq.j(this.d.c(xduVar, a, apcb.LAYOUT_TYPE_ENDCAP, 3, aoyzVar)), xac.b(new xal[0]));
    }

    public final amuk f(String str, String str2, String str3, InstreamAd instreamAd, wzr wzrVar) {
        amuf f = amuk.f();
        f.h(xdc.e(this.c.c(apcf.TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED), str3, apcd.SLOT_TYPE_PLAYER_BYTES, apcb.LAYOUT_TYPE_MEDIA));
        if (instreamAd instanceof InstreamAdImpl) {
            InstreamAdImpl instreamAdImpl = (InstreamAdImpl) instreamAd;
            PlayerAd playerAd = instreamAdImpl.b;
            if ((playerAd instanceof LocalVideoAd) && (((LocalVideoAd) playerAd).B() || ((LocalVideoAd) instreamAdImpl.b).A())) {
                f.h(xed.e(this.c.c(apcf.TRIGGER_TYPE_SURVEY_SUBMITTED), str));
            }
        }
        if (wzrVar.c > 1) {
            f.h(xcl.e(this.c.c(apcf.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON), str2, 0));
        }
        return f.g();
    }

    public final List g(InstreamAdBreak instreamAdBreak, List list, List list2, String str) {
        int i;
        String str2;
        ArrayList arrayList;
        List list3;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList2;
        int i5;
        wwc wwcVar;
        MediaAd mediaAd;
        PlayerAd playerAd;
        amup b;
        amup b2;
        auwd auwdVar;
        apaq apaqVar;
        List list4 = list2;
        String str3 = str;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        char c = 0;
        int i6 = 0;
        int i7 = 0;
        while (it.hasNext()) {
            PlayerAd playerAd2 = (PlayerAd) it.next();
            if (playerAd2 instanceof LocalVideoAd) {
                i7++;
                i6 += ((LocalVideoAd) playerAd2).c() * 1000;
            }
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < list.size()) {
            PlayerAd playerAd3 = (PlayerAd) list.get(i8);
            if (playerAd3 instanceof AdIntro) {
                apcb apcbVar = apcb.LAYOUT_TYPE_MEDIA;
                ampq i10 = ampq.i(playerAd3.qP());
                xal[] xalVarArr = new xal[4];
                xalVarArr[c] = new xbh((MediaAd) playerAd3);
                xalVarArr[1] = new xaf(wzr.a);
                xalVarArr[2] = new xbe(instreamAdBreak);
                xalVarArr[3] = new xar(str3);
                arrayList3.add(xci.c((String) list4.get(i8), apcbVar, 2, i10, xac.b(xalVarArr)));
                i2 = i8;
                i = i7;
                list3 = list4;
                ArrayList arrayList4 = arrayList3;
                str2 = str3;
                arrayList = arrayList4;
            } else if (playerAd3 instanceof MediaAd) {
                wzr wzrVar = wzr.a;
                if (playerAd3 instanceof LocalVideoAd) {
                    LocalVideoAd localVideoAd = (LocalVideoAd) playerAd3;
                    i6 -= localVideoAd.c() * 1000;
                    int i11 = i9 + 1;
                    boolean z = localVideoAd.b.r;
                    asib k = localVideoAd.k();
                    if (k == null || (k.b & 16) == 0) {
                        auwdVar = null;
                    } else {
                        aunb aunbVar = k.f;
                        if (aunbVar == null) {
                            aunbVar = aunb.a;
                        }
                        auwdVar = (auwd) ajjh.l(aunbVar, SimpleAdBadgeRendererOuterClass.simpleAdBadgeRenderer);
                    }
                    ampq i12 = ampq.i(auwdVar);
                    asib k2 = localVideoAd.k();
                    if (k2 == null || (k2.b & 64) == 0) {
                        apaqVar = null;
                    } else {
                        aunb aunbVar2 = k2.g;
                        if (aunbVar2 == null) {
                            aunbVar2 = aunb.a;
                        }
                        apaqVar = (apaq) ajjh.l(aunbVar2, apat.a);
                    }
                    i9 = i11;
                    wzrVar = wzr.a(i9, i7, i6, z, i12, ampq.i(apaqVar));
                }
                String str4 = (String) list4.get(i8);
                apcb apcbVar2 = apcb.LAYOUT_TYPE_MEDIA;
                wwc wwcVar2 = this.b;
                MediaAd mediaAd2 = (MediaAd) playerAd3;
                String str5 = (String) list4.get(i8);
                if (!xrz.m(wwcVar2.a)) {
                    arrayList2 = arrayList3;
                    i5 = i8;
                    b2 = amyc.b;
                    i3 = i6;
                    i4 = i9;
                    mediaAd = mediaAd2;
                    i = i7;
                    playerAd = playerAd3;
                } else {
                    amum h = amup.h();
                    if (!mediaAd2.Q().isEmpty() || !mediaAd2.X().isEmpty()) {
                        i3 = i6;
                        i4 = i9;
                        i = i7;
                        xcx xcxVar = new xcx(wwcVar2.b.c(apcf.TRIGGER_TYPE_MEDIA_PLAYBACK_STARTED), apcf.TRIGGER_TYPE_MEDIA_PLAYBACK_STARTED, mediaAd2.l);
                        amuf f = amuk.f();
                        f.j(mediaAd2.Q());
                        f.j(mediaAd2.X());
                        h.f(xcxVar, f.g());
                    } else {
                        i3 = i6;
                        i4 = i9;
                        i = i7;
                    }
                    if (!mediaAd2.N().isEmpty()) {
                        h.f(new xaa(wwcVar2.b.c(apcf.TRIGGER_TYPE_ON_MEDIA_PLAYBACK_ERROR), apcf.TRIGGER_TYPE_ON_MEDIA_PLAYBACK_ERROR, mediaAd2.l), mediaAd2.N());
                    }
                    if (!mediaAd2.T().isEmpty()) {
                        h.f(new xcw(wwcVar2.b.c(apcf.TRIGGER_TYPE_MEDIA_PAUSED), apcf.TRIGGER_TYPE_MEDIA_PAUSED, mediaAd2.l), mediaAd2.T());
                    }
                    if (!mediaAd2.V().isEmpty()) {
                        h.f(new xcy(wwcVar2.b.c(apcf.TRIGGER_TYPE_MEDIA_RESUMED), apcf.TRIGGER_TYPE_MEDIA_RESUMED, mediaAd2.l), mediaAd2.V());
                    }
                    if (!mediaAd2.W().isEmpty()) {
                        h.f(xdt.e(wwcVar2.b.c(apcf.TRIGGER_TYPE_SKIP_REQUESTED), str5), mediaAd2.W());
                    }
                    if (!mediaAd2.K().isEmpty()) {
                        h.f(new xbz(wwcVar2.b.c(apcf.TRIGGER_TYPE_CLOSE_REQUESTED), apcf.TRIGGER_TYPE_CLOSE_REQUESTED, mediaAd2.l), mediaAd2.K());
                    }
                    if (!mediaAd2.J().isEmpty()) {
                        h.f(new xen(wwcVar2.b.c(apcf.TRIGGER_TYPE_VISIT_ADVERTISER_LINK_CLICKED), apcf.TRIGGER_TYPE_VISIT_ADVERTISER_LINK_CLICKED, str5), mediaAd2.J());
                    }
                    if (!mediaAd2.P().isEmpty()) {
                        h.f(new xct(wwcVar2.b.c(apcf.TRIGGER_TYPE_MEDIA_FULLSCREEN_ENTERED), apcf.TRIGGER_TYPE_MEDIA_FULLSCREEN_ENTERED, mediaAd2.l), mediaAd2.P());
                    }
                    if (!mediaAd2.M().isEmpty()) {
                        h.f(new xcu(wwcVar2.b.c(apcf.TRIGGER_TYPE_MEDIA_FULLSCREEN_EXITED), apcf.TRIGGER_TYPE_MEDIA_FULLSCREEN_EXITED, mediaAd2.l), mediaAd2.M());
                    }
                    if (!mediaAd2.F().isEmpty()) {
                        h.f(new xcv(wwcVar2.b.c(apcf.TRIGGER_TYPE_MEDIA_NON_TERMINAL_ABANDONED), apcf.TRIGGER_TYPE_MEDIA_NON_TERMINAL_ABANDONED, mediaAd2.l), mediaAd2.F());
                        h.f(xcl.e(wwcVar2.b.c(apcf.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON), str5, 4), mediaAd2.F());
                    }
                    if (!mediaAd2.I().isEmpty()) {
                        h.f(wzp.a(wwcVar2.b.c(apcf.TRIGGER_TYPE_ACTIVE_VIEW_VIEWABLE_CRITERIA_SATISFIED), str5), mediaAd2.I());
                    }
                    if (!mediaAd2.H().isEmpty()) {
                        h.f(wzl.a(wwcVar2.b.c(apcf.TRIGGER_TYPE_ACTIVE_VIEW_MEASURABLE_CRITERIA_SATISFIED), str5), mediaAd2.H());
                    }
                    if (!mediaAd2.G().isEmpty()) {
                        h.f(wzk.a(wwcVar2.b.c(apcf.TRIGGER_TYPE_ACTIVE_VIEW_GROUPM_VIEWABLE_CRITERIA_SATISFIED), str5), mediaAd2.G());
                    }
                    if (!mediaAd2.O().isEmpty()) {
                        arrayList2 = arrayList3;
                        i5 = i8;
                        h.f(xcz.a(wwcVar2.b.c(apcf.TRIGGER_TYPE_MEDIA_TIME_RANGE), mediaAd2.l, new xeg(wwc.a(mediaAd2, 1), 9223372036854775806L), true, false, true, true), mediaAd2.O());
                    } else {
                        arrayList2 = arrayList3;
                        i5 = i8;
                    }
                    if (!mediaAd2.S().isEmpty()) {
                        h.f(xcz.a(wwcVar2.b.c(apcf.TRIGGER_TYPE_MEDIA_TIME_RANGE), mediaAd2.l, new xeg(wwc.a(mediaAd2, 2), 9223372036854775806L), true, false, true, true), mediaAd2.S());
                    }
                    if (!mediaAd2.Y().isEmpty()) {
                        wwcVar = wwcVar2;
                        h.f(xcz.a(wwcVar2.b.c(apcf.TRIGGER_TYPE_MEDIA_TIME_RANGE), mediaAd2.l, new xeg(wwc.a(mediaAd2, 3), 9223372036854775806L), true, false, true, true), mediaAd2.Y());
                    } else {
                        wwcVar = wwcVar2;
                    }
                    if (!mediaAd2.L().isEmpty()) {
                        h.f(xcl.e(wwcVar.b.c(apcf.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON), str5, 0), mediaAd2.L());
                    }
                    if (!mediaAd2.R().isEmpty() && mediaAd2.i() == null) {
                        h.f(xcl.e(wwcVar.b.c(apcf.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON), str5, 0), mediaAd2.R());
                    }
                    List U = mediaAd2.U();
                    long millis = TimeUnit.SECONDS.toMillis(mediaAd2.c());
                    String str6 = mediaAd2.l;
                    if (U.isEmpty()) {
                        b = amyc.b;
                        mediaAd = mediaAd2;
                        playerAd = playerAd3;
                    } else {
                        PriorityQueue priorityQueue = new PriorityQueue(U.size(), utr.d);
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it2 = U.iterator();
                        while (it2.hasNext()) {
                            apae apaeVar = (apae) it2.next();
                            Iterator it3 = it2;
                            if (apaeVar.d >= millis) {
                                arrayList5.add(apaeVar);
                            } else {
                                priorityQueue.add(apaeVar);
                            }
                            it2 = it3;
                        }
                        amum h2 = amup.h();
                        if (priorityQueue.isEmpty()) {
                            mediaAd = mediaAd2;
                            playerAd = playerAd3;
                        } else {
                            int i13 = ((apae) priorityQueue.peek()).d;
                            amuf amufVar = new amuf();
                            while (!priorityQueue.isEmpty()) {
                                if (((apae) priorityQueue.peek()).d == i13) {
                                    amufVar.h((apae) priorityQueue.poll());
                                } else {
                                    h2.f(xcz.a(wwcVar.b.c(apcf.TRIGGER_TYPE_MEDIA_TIME_RANGE), str6, new xeg(i13, 9223372036854775806L), true, true, true, false), amufVar.g());
                                    i13 = ((apae) priorityQueue.peek()).d;
                                    amufVar = new amuf();
                                    playerAd3 = playerAd3;
                                    mediaAd2 = mediaAd2;
                                }
                            }
                            mediaAd = mediaAd2;
                            playerAd = playerAd3;
                            h2.f(xcz.a(wwcVar.b.c(apcf.TRIGGER_TYPE_MEDIA_TIME_RANGE), str6, new xeg(i13, 9223372036854775806L), true, true, true, false), amufVar.g());
                        }
                        if (!arrayList5.isEmpty()) {
                            h2.f(xcl.e(wwcVar.b.c(apcf.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON), str5, 0), arrayList5);
                        }
                        b = h2.b();
                    }
                    h.h(b);
                    b2 = h.b();
                }
                str2 = str;
                arrayList = arrayList2;
                arrayList.add(new xci(str4, apcbVar2, 2, amuk.q(), amuk.q(), amuk.q(), b2, ampq.i(playerAd.qP()), amon.a, amon.a, xac.b(new xbh(mediaAd), new xaf(wzrVar), new xbe(instreamAdBreak), new xar(str2), new xaz(Long.valueOf(playerAd.m)))));
                list3 = list2;
                i6 = i3;
                i9 = i4;
                i2 = i5;
            } else {
                int i14 = i8;
                i = i7;
                ArrayList arrayList6 = arrayList3;
                str2 = str3;
                arrayList = arrayList6;
                if (playerAd3 instanceof MediaBreakAd) {
                    list3 = list2;
                    i2 = i14;
                    arrayList.add(xci.c((String) list3.get(i2), apcb.LAYOUT_TYPE_MEDIA_BREAK, 2, ampq.i(playerAd3.qP()), xac.b(new xbi((MediaBreakAd) playerAd3), new xaf(wzr.a), new xbe(instreamAdBreak), new xaz(Long.valueOf(playerAd3.m)))));
                } else {
                    String valueOf = String.valueOf(playerAd3);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                    sb.append("Unexpected playerAd type: ");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            int i15 = i2 + 1;
            i7 = i;
            c = 0;
            List list5 = list3;
            i8 = i15;
            list4 = list5;
            String str7 = str2;
            arrayList3 = arrayList;
            str3 = str7;
        }
        return arrayList3;
    }

    public final xci h(xdu xduVar, apng apngVar, amuk amukVar, amuk amukVar2, amuk amukVar3) {
        aozb aozbVar = apngVar.b;
        if (aozbVar == null) {
            aozbVar = aozb.a;
        }
        String str = aozbVar.b;
        aozb aozbVar2 = apngVar.b;
        if (aozbVar2 == null) {
            aozbVar2 = aozb.a;
        }
        apcb b = apcb.b(aozbVar2.c);
        if (b == null) {
            b = apcb.LAYOUT_TYPE_UNSPECIFIED;
        }
        apcb apcbVar = b;
        wwe wweVar = this.d;
        aozb aozbVar3 = apngVar.b;
        if (aozbVar3 == null) {
            aozbVar3 = aozb.a;
        }
        aoyz aoyzVar = aozbVar3.d;
        if (aoyzVar == null) {
            aoyzVar = aoyz.a;
        }
        asit c = wweVar.c(xduVar, str, apcbVar, 1, aoyzVar);
        aozb aozbVar4 = apngVar.b;
        if (aozbVar4 == null) {
            aozbVar4 = aozb.a;
        }
        aoyz aoyzVar2 = aozbVar4.d;
        if (aoyzVar2 == null) {
            aoyzVar2 = aoyz.a;
        }
        ampq j = ampq.j(aoyzVar2);
        ampq j2 = ampq.j(c);
        xal[] xalVarArr = new xal[1];
        aunb aunbVar = apngVar.c;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        xalVarArr[0] = new xay((aqtb) aunbVar.qm(ElementRendererOuterClass.elementRenderer));
        return xci.d(str, apcbVar, 1, amukVar, amukVar2, amukVar3, j, j2, xac.a(Arrays.asList(xalVarArr)));
    }

    public final xci i(String str, InstreamAdBreak instreamAdBreak, List list) {
        if (!list.isEmpty()) {
            if (list.get(0) instanceof ForecastingAd) {
                return b(str, instreamAdBreak, (ForecastingAd) list.get(0));
            }
            if (list.get(0) instanceof ThrottledAd) {
                return xci.b(this.e.a(), apcb.LAYOUT_TYPE_UNSPECIFIED, 1, xac.b(new xbq((ThrottledAd) list.get(0))));
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PlayerAd playerAd = (PlayerAd) it.next();
            if (playerAd instanceof MediaAd) {
                wvw wvwVar = this.c;
                apcb apcbVar = apcb.LAYOUT_TYPE_MEDIA;
                String str2 = playerAd.l;
                arrayList.add(wvwVar.a(apcbVar, str));
            } else if (playerAd instanceof MediaBreakAd) {
                wvw wvwVar2 = this.c;
                apcb apcbVar2 = apcb.LAYOUT_TYPE_MEDIA_BREAK;
                String str3 = playerAd.l;
                arrayList.add(wvwVar2.a(apcbVar2, str));
            } else {
                String valueOf = String.valueOf(playerAd);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                sb.append("Unexpected playerAd type: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            }
        }
        String a = this.c.a(apcb.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES, str);
        List<xci> g = g(instreamAdBreak, list, arrayList, a);
        if (g.isEmpty()) {
            return null;
        }
        amuf f = amuk.f();
        amuf f2 = amuk.f();
        amuf f3 = amuk.f();
        for (xci xciVar : g) {
            if (xciVar.f(xbh.class)) {
                MediaAd mediaAd = (MediaAd) xciVar.e(xbh.class);
                if (mediaAd.aa()) {
                    f2.h(xdt.e(this.c.c(apcf.TRIGGER_TYPE_SKIP_REQUESTED), xciVar.a));
                }
                boolean z = mediaAd instanceof LocalVideoAd;
                if (z) {
                    f3.h(xdt.e(this.c.c(apcf.TRIGGER_TYPE_SKIP_REQUESTED), xciVar.a));
                }
                if (z && ((LocalVideoAd) mediaAd).B()) {
                    f2.h(xed.e(this.c.c(apcf.TRIGGER_TYPE_SURVEY_SUBMITTED), a));
                }
                if (z && ((LocalVideoAd) mediaAd).b.q) {
                    f2.h(xcl.e(this.c.c(apcf.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON), xciVar.a, 1));
                }
            } else if (xciVar.f(xbi.class)) {
                f2.h(xdd.e(this.c.c(apcf.TRIGGER_TYPE_ON_LAYOUT_SELF_EXIT_REQUESTED), xciVar.a));
            }
        }
        f.h(xdd.e(this.c.c(apcf.TRIGGER_TYPE_ON_LAYOUT_SELF_EXIT_REQUESTED), a));
        return xci.d(a, apcb.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES, 1, f.g(), f2.g(), f3.g(), amon.a, amon.a, xac.b(new xbe(instreamAdBreak), new xbp(g)));
    }
}
