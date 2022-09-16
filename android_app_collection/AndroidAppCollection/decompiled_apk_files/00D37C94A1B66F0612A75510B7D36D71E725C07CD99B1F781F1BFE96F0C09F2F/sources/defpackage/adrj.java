package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.libraries.youtube.mdx.remote.internal.MdxSessionFactory;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: adrj  reason: default package */
/* loaded from: classes.dex */
public final class adrj implements adoa, adrk, adfh, adnu {
    public static final String a = zep.a("MDX.MdxSessionManagerImpl");
    private final aczl A;
    private final adao B;
    public final Set b;
    public final Set c;
    public volatile adqy d;
    public final axnm e;
    public acvg f;
    public final axnm g;
    public final axnm h;
    public final acwu i;
    private final axnm k;
    private final yni l;
    private final snc m;
    private final axnm n;
    private long o;
    private long p;
    private final axnm q;
    private final adqt r;
    private final axnm s;
    private final axnm t;
    private final axnm u;
    private final adcw v;
    private final adwc w;
    private final axnm x;
    private final aczd y;
    private final acsf z;
    private int j = 2;
    private final adri C = new adri(this);

    public adrj(axnm axnmVar, yni yniVar, snc sncVar, axnm axnmVar2, axnm axnmVar3, axnm axnmVar4, axnm axnmVar5, axnm axnmVar6, axnm axnmVar7, axnm axnmVar8, axnm axnmVar9, adcw adcwVar, adwc adwcVar, axnm axnmVar10, Set set, aczd aczdVar, acsf acsfVar, acwu acwuVar, aczl aczlVar, adao adaoVar) {
        axnmVar.getClass();
        this.k = axnmVar;
        yniVar.getClass();
        this.l = yniVar;
        this.b = new CopyOnWriteArraySet(set);
        this.d = null;
        sncVar.getClass();
        this.m = sncVar;
        this.n = axnmVar2;
        axnmVar3.getClass();
        this.e = axnmVar3;
        axnmVar4.getClass();
        this.q = axnmVar4;
        this.r = new adqt(this);
        this.g = axnmVar5;
        this.s = axnmVar6;
        this.h = axnmVar7;
        this.c = Collections.newSetFromMap(new ConcurrentHashMap());
        this.t = axnmVar8;
        this.u = axnmVar9;
        this.v = adcwVar;
        this.w = adwcVar;
        this.x = axnmVar10;
        this.y = aczdVar;
        this.z = acsfVar;
        this.i = acwuVar;
        this.A = aczlVar;
        this.B = adaoVar;
    }

    @Override // defpackage.adfh
    public final void b(adff adffVar, ampq ampqVar) {
        atcv atcvVar;
        adqy adqyVar = this.d;
        if (adqyVar != null) {
            if (adffVar.a) {
                atcvVar = atcv.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER;
            } else if (!this.w.f()) {
                atcvVar = atcv.MDX_SESSION_DISCONNECT_REASON_NOT_ONLINE;
            } else if (!this.w.g(adqyVar.am.i)) {
                atcvVar = atcv.MDX_SESSION_DISCONNECT_REASON_NETWORK_CHANGED;
            } else {
                atcvVar = atcv.MDX_SESSION_DISCONNECT_REASON_ROUTE_UNSELECTED;
            }
            adqyVar.aq(atcvVar, ((Integer) ((ampv) ampqVar).a).intValue(), adffVar.b);
        }
    }

    @Override // defpackage.adnu
    public final void c(int i) {
        String str;
        adqy adqyVar = this.d;
        if (adqyVar == null) {
            zep.c(a, "Reporting flow event with null session instance, ignore");
            return;
        }
        String str2 = a;
        Object[] objArr = new Object[2];
        switch (i) {
            case 2:
                str = "MDX_CONNECTION_EVENT_TYPE_CONNECTION_INITIATED";
                break;
            case 3:
                str = "MDX_CONNECTION_EVENT_TYPE_DIAL_CONNECTION_STARTED";
                break;
            case 4:
                str = "MDX_CONNECTION_EVENT_TYPE_WAKE_ON_LAN_STARTED";
                break;
            case 5:
                str = "MDX_CONNECTION_EVENT_TYPE_DIAL_RECEIVER_APP_LAUNCHED";
                break;
            case 6:
                str = "MDX_CONNECTION_EVENT_TYPE_CAST_CONNECTION_STARTED";
                break;
            case 7:
                str = "MDX_CONNECTION_EVENT_TYPE_CAST_CONNECTED";
                break;
            case 8:
                str = "MDX_CONNECTION_EVENT_TYPE_CAST_APP_LAUNCHED";
                break;
            case 9:
                str = "MDX_CONNECTION_EVENT_TYPE_HAS_SCREEN_ID";
                break;
            case 10:
                str = "MDX_CONNECTION_EVENT_TYPE_MANUAL_PAIRING_CONNECTION_STARTED";
                break;
            case 11:
                str = "MDX_CONNECTION_EVENT_TYPE_HAS_LOUNGE_TOKEN";
                break;
            case 12:
                str = "MDX_CONNECTION_EVENT_TYPE_CONNECTION_SUCCESSFUL";
                break;
            case 13:
                str = "MDX_CONNECTION_EVENT_TYPE_CONNECTION_UNSUCCESSFUL";
                break;
            case 14:
                str = "MDX_CONNECTION_EVENT_TYPE_USER_DISCONNECTED";
                break;
            case 15:
                str = "MDX_CONNECTION_EVENT_TYPE_RECOVERED_CONNECTION_INITIATED";
                break;
            case 16:
                str = "MDX_CONNECTION_EVENT_TYPE_WAKE_ON_LAN_AWOKEN";
                break;
            default:
                str = "MDX_CONNECTION_EVENT_TYPE_DIAL_SMOOTH_PAIRING_RECEIVER_IS_ONLINE";
                break;
        }
        objArr[0] = str;
        objArr[1] = adqyVar.am.g;
        zep.h(str2, String.format("Logging flow event type: %s, for session: %s", objArr));
        acsd acsdVar = new acsd(i - 1, 9);
        aopa createBuilder = atcm.a.createBuilder();
        boolean ai = adqyVar.ai();
        createBuilder.copyOnWrite();
        atcm atcmVar = (atcm) createBuilder.instance;
        atcmVar.b = 1 | atcmVar.b;
        atcmVar.c = ai;
        boolean aG = adqyVar.aG();
        createBuilder.copyOnWrite();
        atcm atcmVar2 = (atcm) createBuilder.instance;
        atcmVar2.b |= 4;
        atcmVar2.e = aG;
        if (i == 13) {
            atcv r = adqyVar.r();
            createBuilder.copyOnWrite();
            atcm atcmVar3 = (atcm) createBuilder.instance;
            atcmVar3.d = r.C;
            atcmVar3.b |= 2;
        }
        acsf acsfVar = this.z;
        aopa createBuilder2 = aqyu.a.createBuilder();
        createBuilder2.copyOnWrite();
        aqyu aqyuVar = (aqyu) createBuilder2.instance;
        atcm atcmVar4 = (atcm) createBuilder.mo39build();
        atcmVar4.getClass();
        aqyuVar.g = atcmVar4;
        aqyuVar.b |= 16;
        acsdVar.a = (aqyu) createBuilder2.mo39build();
        acsfVar.c(acsdVar, aqzj.FLOW_TYPE_MDX_CONNECTION, adqyVar.am.g);
    }

    @Override // defpackage.adoa
    public final int d() {
        return this.j;
    }

    @Override // defpackage.adoa
    public final adnt e() {
        return this.d;
    }

    @Override // defpackage.adoa
    public final adoi f() {
        return ((adro) this.g.get()).a();
    }

    @Override // defpackage.adoa
    public final void g(adny adnyVar) {
        Set set = this.b;
        adnyVar.getClass();
        set.add(adnyVar);
    }

    @Override // defpackage.adoa
    public final void h(adnz adnzVar) {
        this.c.add(adnzVar);
    }

    @Override // defpackage.adoa
    public final void i(adny adnyVar) {
        Set set = this.b;
        adnyVar.getClass();
        set.remove(adnyVar);
    }

    @Override // defpackage.adoa
    public final void j(adnz adnzVar) {
        this.c.remove(adnzVar);
    }

    @Override // defpackage.adoa
    public final void k() {
        if (this.y.b()) {
            try {
                ((acyz) this.x.get()).b();
            } catch (RuntimeException e) {
                zep.f(a, "Catching the lack of module exception. Please see the detail, b/33246615", e);
            }
        }
        ((adiu) this.u.get()).b();
        ((adro) this.g.get()).j(this.C);
        ((adro) this.g.get()).i();
        g((adny) this.s.get());
        final adre adreVar = (adre) this.s.get();
        if (adreVar.d) {
            return;
        }
        adreVar.d = true;
        ylx.i(((adra) adreVar.e.get()).a(), new ylw() { // from class: adrb
            /* JADX WARN: Type inference failed for: r11v1, types: [int, boolean] */
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                adre adreVar2 = adre.this;
                ampq ampqVar = (ampq) obj;
                if (!ampqVar.h()) {
                    return;
                }
                adnw adnwVar = (adnw) ampqVar.c();
                if (adnwVar.f.h()) {
                    String.valueOf(String.valueOf(adnwVar.f.c())).length();
                } else {
                    adnv b = adnwVar.b();
                    b.c(atcv.MDX_SESSION_DISCONNECT_REASON_APP_TERMINATED);
                    adnwVar = b.a();
                    adqu adquVar = (adqu) adreVar2.f.get();
                    int i = adnwVar.i;
                    atcv atcvVar = atcv.MDX_SESSION_DISCONNECT_REASON_APP_TERMINATED;
                    int i2 = adnwVar.h;
                    boolean z = i2 > 0;
                    String str = adnwVar.g;
                    ?? h = adnwVar.a.h();
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[6];
                    int i3 = i - 1;
                    if (i != 0) {
                        objArr[0] = Integer.valueOf(i3);
                        objArr[1] = Integer.valueOf(atcvVar.C);
                        objArr[2] = Integer.valueOf(h == true ? 1 : 0);
                        objArr[3] = Boolean.valueOf(z);
                        objArr[4] = str;
                        objArr[5] = Integer.valueOf(i2);
                        zep.m(adqu.a, String.format(locale, "mdx session disconnected: sessionType=%d disconnectReason=%d prevState=%d reconnect=%s sessionNonce=%s sessionIndex=%d", objArr));
                        aopa createBuilder = atbz.a.createBuilder();
                        createBuilder.copyOnWrite();
                        atbz atbzVar = (atbz) createBuilder.instance;
                        atbzVar.b |= 128;
                        atbzVar.h = false;
                        createBuilder.copyOnWrite();
                        atbz atbzVar2 = (atbz) createBuilder.instance;
                        atbzVar2.c = i3;
                        atbzVar2.b = 1 | atbzVar2.b;
                        createBuilder.copyOnWrite();
                        atbz atbzVar3 = (atbz) createBuilder.instance;
                        atbzVar3.i = atcvVar.C;
                        atbzVar3.b |= 256;
                        createBuilder.copyOnWrite();
                        atbz atbzVar4 = (atbz) createBuilder.instance;
                        str.getClass();
                        atbzVar4.b |= 8192;
                        atbzVar4.m = str;
                        createBuilder.copyOnWrite();
                        atbz atbzVar5 = (atbz) createBuilder.instance;
                        atbzVar5.b |= 16384;
                        atbzVar5.n = i2;
                        createBuilder.copyOnWrite();
                        atbz atbzVar6 = (atbz) createBuilder.instance;
                        atbzVar6.b |= 32;
                        atbzVar6.f = z;
                        createBuilder.copyOnWrite();
                        atbz atbzVar7 = (atbz) createBuilder.instance;
                        atbzVar7.d = adqu.b(h) - 1;
                        atbzVar7.b = 4 | atbzVar7.b;
                        if (adnwVar.a.h()) {
                            admy admyVar = (admy) adnwVar.a.c();
                            long j = admyVar.a;
                            long j2 = adnwVar.b;
                            createBuilder.copyOnWrite();
                            atbz atbzVar8 = (atbz) createBuilder.instance;
                            atbzVar8.b |= 8;
                            atbzVar8.e = j - j2;
                            long j3 = admyVar.a;
                            long j4 = admyVar.b;
                            createBuilder.copyOnWrite();
                            atbz atbzVar9 = (atbz) createBuilder.instance;
                            atbzVar9.b |= 2048;
                            atbzVar9.k = j3 - j4;
                        }
                        arrf a2 = arrh.a();
                        a2.copyOnWrite();
                        ((arrh) a2.instance).db((atbz) createBuilder.mo39build());
                        adquVar.b.c((arrh) a2.mo39build());
                        ((adra) adreVar2.e.get()).d(adnwVar);
                    } else {
                        throw null;
                    }
                }
                ((adro) adreVar2.g.get()).c(adnwVar);
            }
        });
    }

    @Override // defpackage.adoa
    public final void l() {
        ((acyz) this.x.get()).c();
    }

    @Override // defpackage.adoa
    public final boolean m() {
        return ((adro) this.g.get()).a().a == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Type inference failed for: r15v9, types: [ampq] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(defpackage.adhz r12, defpackage.acvg r13, defpackage.acvg r14, defpackage.ampq r15) {
        /*
            r11 = this;
            amon r0 = defpackage.amon.a
            boolean r1 = r15.h()
            r2 = 2
            if (r1 == 0) goto L41
            java.lang.Object r1 = r15.c()
            adnw r1 = (defpackage.adnw) r1
            int r1 = r1.i
            if (r1 == 0) goto L3f
            if (r1 != r2) goto L41
            java.lang.Object r1 = r15.c()
            adnw r1 = (defpackage.adnw) r1
            java.lang.String r1 = r1.d
            java.lang.String r3 = defpackage.adew.f(r12)
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L41
            java.lang.Object r0 = r15.c()
            adnw r0 = (defpackage.adnw) r0
            int r0 = r0.h
            int r0 = r0 + 1
            java.lang.Object r15 = r15.c()
            adnw r15 = (defpackage.adnw) r15
            java.lang.String r15 = r15.g
            ampq r15 = defpackage.ampq.j(r15)
            r10 = r15
            goto L52
        L3f:
            r12 = 0
            throw r12
        L41:
            java.lang.String r15 = defpackage.adrj.a
            java.lang.String r1 = "Cannot retrieve a matching session info for the resumed SDK session. Proceeding with launching with a new session nonce."
            defpackage.zep.m(r15, r1)
            aczl r15 = r11.A
            atcu r1 = defpackage.atcu.MDX_SESSION_CAST_EVENT_TYPE_RECONNECT_NOT_RECOVERY
            r15.a(r1)
            r15 = 0
            r10 = r0
            r0 = 0
        L52:
            axnm r15 = r11.k
            java.lang.Object r15 = r15.get()
            r3 = r15
            com.google.android.libraries.youtube.mdx.remote.internal.MdxSessionFactory r3 = (com.google.android.libraries.youtube.mdx.remote.internal.MdxSessionFactory) r3
            r4 = r12
            r5 = r11
            r6 = r11
            r7 = r14
            r8 = r13
            r9 = r0
            adqy r12 = r3.g(r4, r5, r6, r7, r8, r9, r10)
            r11.d = r12
            if (r0 <= 0) goto L6b
            r2 = 15
        L6b:
            r11.c(r2)
            adnl r13 = defpackage.adnl.a
            r12.rs(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adrj.n(adhz, acvg, acvg, ampq):void");
    }

    public final void o() {
        aizv aizvVar;
        boolean z = m() || this.j == 1;
        aizn aiznVar = (aizn) this.q.get();
        adqt adqtVar = z ? this.r : null;
        if (adqtVar != null && (aizvVar = aiznVar.e) != null && aizvVar != adqtVar) {
            afus.b(1, 10, "overriding an existing dismiss plugin");
        }
        aiznVar.e = adqtVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [ampq] */
    @Override // defpackage.adfh
    public final void p(adig adigVar, adnl adnlVar) {
        acvg acviVar;
        amon amonVar;
        String str = a;
        int i = 0;
        zep.h(str, String.format("connectAndPlay to screen %s", adigVar.b()));
        ((adiu) this.u.get()).a();
        this.B.d(adigVar);
        adqy adqyVar = this.d;
        if (adqyVar == null || adqyVar.ab() || !adqyVar.k().equals(adigVar)) {
            acvg b = ((acvh) this.e.get()).b(asny.LATENCY_ACTION_MDX_LAUNCH);
            this.f = b;
            if (this.i.z) {
                acviVar = ((acvh) this.e.get()).b(asny.LATENCY_ACTION_MDX_CAST);
            } else {
                acviVar = new acvi();
            }
            acvg acvgVar = acviVar;
            amon amonVar2 = amon.a;
            ampq b2 = ((adro) this.g.get()).b(adigVar);
            if (b2.h()) {
                i = ((adnw) b2.c()).h + 1;
                amonVar = ampq.j(((adnw) b2.c()).g);
            } else {
                amonVar = amonVar2;
            }
            adqy g = ((MdxSessionFactory) this.k.get()).g(adigVar, this, this, b, acvgVar, i, amonVar);
            this.d = g;
            c(i > 0 ? 15 : 2);
            g.rs(adnlVar);
        } else if (adnlVar.g()) {
            zep.h(str, "Already connected, just playing video.");
            adqyVar.L(adnlVar);
        } else {
            zep.h(str, "Ignore connectAndPlay on a CONNECTED remote control: non playable descriptor.");
        }
    }

    @Override // defpackage.adrk
    public final void a(adnt adntVar) {
        final adnt adntVar2;
        adrj adrjVar;
        atbs atbsVar;
        long j;
        if (adntVar != this.d) {
            return;
        }
        int i = this.j;
        int a2 = adntVar.a();
        if (this.j == a2) {
            return;
        }
        this.j = a2;
        if (a2 == 0) {
            adntVar2 = adntVar;
            adrjVar = this;
            String str = a;
            adqy adqyVar = (adqy) adntVar2;
            String valueOf = String.valueOf(adqyVar.k());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("MDX session connecting to ");
            sb.append(valueOf);
            zep.h(str, sb.toString());
            adrjVar.o = adrjVar.m.d();
            adrjVar.v.a = adntVar2;
            adqu adquVar = (adqu) adrjVar.n.get();
            int i2 = adqyVar.am.i;
            boolean ai = adqyVar.ai();
            adnw adnwVar = adqyVar.am;
            String str2 = adnwVar.g;
            int i3 = adnwVar.h;
            atcw atcwVar = adqyVar.ao;
            String str3 = adqu.a;
            Locale locale = Locale.US;
            Object[] objArr = new Object[6];
            int i4 = i2 - 1;
            if (i2 != 0) {
                objArr[0] = Integer.valueOf(i4);
                objArr[1] = Integer.valueOf(i);
                objArr[2] = Boolean.valueOf(ai);
                objArr[3] = str2;
                objArr[4] = Integer.valueOf(i3);
                objArr[5] = atcwVar;
                zep.h(str3, String.format(locale, "mdx session started: sessionType=%d prevState=%d reconnect=%s sessionNonce=%s sessionIndex=%d sessionSource=%s", objArr));
                aopa createBuilder = atce.a.createBuilder();
                boolean aG = adqyVar.aG();
                createBuilder.copyOnWrite();
                atce atceVar = (atce) createBuilder.instance;
                atceVar.b |= 16;
                atceVar.g = aG;
                createBuilder.copyOnWrite();
                atce atceVar2 = (atce) createBuilder.instance;
                atceVar2.c = i4;
                atceVar2.b |= 1;
                createBuilder.copyOnWrite();
                atce atceVar3 = (atce) createBuilder.instance;
                atceVar3.d = adqu.b(i) - 1;
                atceVar3.b |= 2;
                createBuilder.copyOnWrite();
                atce atceVar4 = (atce) createBuilder.instance;
                atceVar4.b |= 4;
                atceVar4.e = ai;
                createBuilder.copyOnWrite();
                atce atceVar5 = (atce) createBuilder.instance;
                str2.getClass();
                atceVar5.b |= 256;
                atceVar5.j = str2;
                createBuilder.copyOnWrite();
                atce atceVar6 = (atce) createBuilder.instance;
                atceVar6.b |= 512;
                atceVar6.k = i3;
                createBuilder.copyOnWrite();
                atce atceVar7 = (atce) createBuilder.instance;
                atceVar7.h = atcwVar.k;
                atceVar7.b |= 64;
                if (adqyVar.am.i == 3) {
                    aopa c = adqu.c(adqyVar);
                    createBuilder.copyOnWrite();
                    atce atceVar8 = (atce) createBuilder.instance;
                    atbf atbfVar = (atbf) c.mo39build();
                    atbfVar.getClass();
                    atceVar8.f = atbfVar;
                    atceVar8.b |= 8;
                }
                atbs a3 = adqu.a(adqyVar.k());
                if (a3 != null) {
                    createBuilder.copyOnWrite();
                    atce atceVar9 = (atce) createBuilder.instance;
                    atceVar9.i = a3;
                    atceVar9.b |= 128;
                }
                adig k = adqyVar.k();
                if (!(k instanceof adid)) {
                    atbsVar = null;
                } else {
                    aopa createBuilder2 = atbs.a.createBuilder();
                    Map m = ((adid) k).m();
                    if (m != null) {
                        String str4 = (String) m.get("brand");
                        if (!TextUtils.isEmpty(str4)) {
                            createBuilder2.copyOnWrite();
                            atbs atbsVar2 = (atbs) createBuilder2.instance;
                            str4.getClass();
                            atbsVar2.b |= 4;
                            atbsVar2.e = str4;
                        }
                        String str5 = (String) m.get("model");
                        if (!TextUtils.isEmpty(str5)) {
                            createBuilder2.copyOnWrite();
                            atbs atbsVar3 = (atbs) createBuilder2.instance;
                            str5.getClass();
                            atbsVar3.b |= 2;
                            atbsVar3.d = str5;
                        }
                    }
                    atbsVar = (atbs) createBuilder2.mo39build();
                }
                if (atbsVar != null) {
                    createBuilder.copyOnWrite();
                    atce atceVar10 = (atce) createBuilder.instance;
                    atceVar10.l = atbsVar;
                    atceVar10.b |= 1024;
                }
                arrf a4 = arrh.a();
                a4.copyOnWrite();
                ((arrh) a4.instance).dd((atce) createBuilder.mo39build());
                adquVar.b.c((arrh) a4.mo39build());
                ((adod) adrjVar.t.get()).l(adntVar2);
                new Handler(Looper.getMainLooper()).post(new adrh(adrjVar, adntVar2, 2));
            } else {
                throw null;
            }
        } else if (a2 == 1) {
            adntVar2 = adntVar;
            adrjVar = this;
            String str6 = a;
            adqy adqyVar2 = (adqy) adntVar2;
            String valueOf2 = String.valueOf(adqyVar2.k());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 25);
            sb2.append("MDX session connected to ");
            sb2.append(valueOf2);
            zep.h(str6, sb2.toString());
            long d = adrjVar.m.d();
            adrjVar.p = d;
            long j2 = d - adrjVar.o;
            adqu adquVar2 = (adqu) adrjVar.n.get();
            int i5 = adqyVar2.am.i;
            boolean ai2 = adqyVar2.ai();
            adnw adnwVar2 = adqyVar2.am;
            String str7 = adnwVar2.g;
            int i6 = adnwVar2.h;
            atcw atcwVar2 = adqyVar2.ao;
            String str8 = adqu.a;
            Locale locale2 = Locale.US;
            Object[] objArr2 = new Object[7];
            int i7 = i5 - 1;
            if (i5 != 0) {
                objArr2[0] = Integer.valueOf(i7);
                objArr2[1] = Integer.valueOf(i);
                objArr2[2] = Long.valueOf(j2);
                objArr2[3] = Boolean.valueOf(ai2);
                objArr2[4] = str7;
                objArr2[5] = Integer.valueOf(i6);
                objArr2[6] = atcwVar2;
                zep.h(str8, String.format(locale2, "mdx session connected: sessionType=%d prevState=%d msSinceStart=%d reconnect=%s sessionNonce=%s sessionIndex=%d sessionSource=%s", objArr2));
                aopa createBuilder3 = atby.a.createBuilder();
                boolean aG2 = adqyVar2.aG();
                createBuilder3.copyOnWrite();
                atby atbyVar = (atby) createBuilder3.instance;
                atbyVar.b |= 32;
                atbyVar.h = aG2;
                createBuilder3.copyOnWrite();
                atby atbyVar2 = (atby) createBuilder3.instance;
                atbyVar2.c = i7;
                atbyVar2.b |= 1;
                createBuilder3.copyOnWrite();
                atby atbyVar3 = (atby) createBuilder3.instance;
                atbyVar3.d = adqu.b(i) - 1;
                atbyVar3.b |= 2;
                createBuilder3.copyOnWrite();
                atby atbyVar4 = (atby) createBuilder3.instance;
                atbyVar4.b |= 4;
                atbyVar4.e = j2;
                createBuilder3.copyOnWrite();
                atby atbyVar5 = (atby) createBuilder3.instance;
                atbyVar5.b |= 8;
                atbyVar5.f = ai2;
                createBuilder3.copyOnWrite();
                atby atbyVar6 = (atby) createBuilder3.instance;
                str7.getClass();
                atbyVar6.b |= 512;
                atbyVar6.k = str7;
                createBuilder3.copyOnWrite();
                atby atbyVar7 = (atby) createBuilder3.instance;
                atbyVar7.b |= 1024;
                atbyVar7.l = i6;
                createBuilder3.copyOnWrite();
                atby atbyVar8 = (atby) createBuilder3.instance;
                atbyVar8.i = atcwVar2.k;
                atbyVar8.b |= 128;
                if (adqyVar2.am.i == 3) {
                    aopa c2 = adqu.c(adqyVar2);
                    createBuilder3.copyOnWrite();
                    atby atbyVar9 = (atby) createBuilder3.instance;
                    atbf atbfVar2 = (atbf) c2.mo39build();
                    atbfVar2.getClass();
                    atbyVar9.g = atbfVar2;
                    atbyVar9.b |= 16;
                }
                atbs a5 = adqu.a(adqyVar2.k());
                if (a5 != null) {
                    createBuilder3.copyOnWrite();
                    atby atbyVar10 = (atby) createBuilder3.instance;
                    atbyVar10.j = a5;
                    atbyVar10.b |= 256;
                }
                String rp = adqyVar2.rp();
                String rq = adqyVar2.rq();
                if (rp != null && rq != null) {
                    aopa createBuilder4 = atbs.a.createBuilder();
                    createBuilder4.copyOnWrite();
                    atbs atbsVar4 = (atbs) createBuilder4.instance;
                    atbsVar4.b |= 4;
                    atbsVar4.e = rp;
                    createBuilder4.copyOnWrite();
                    atbs atbsVar5 = (atbs) createBuilder4.instance;
                    atbsVar5.b |= 2;
                    atbsVar5.d = rq;
                    atbs atbsVar6 = (atbs) createBuilder4.mo39build();
                    createBuilder3.copyOnWrite();
                    atby atbyVar11 = (atby) createBuilder3.instance;
                    atbsVar6.getClass();
                    atbyVar11.m = atbsVar6;
                    atbyVar11.b |= 2048;
                }
                arrf a6 = arrh.a();
                a6.copyOnWrite();
                ((arrh) a6.instance).da((atby) createBuilder3.mo39build());
                adquVar2.b.c((arrh) a6.mo39build());
                adod adodVar = (adod) adrjVar.t.get();
                acvg acvgVar = adrjVar.f;
                if (acvgVar != null) {
                    acvgVar.c("mdx_ls");
                }
                o();
                new Handler(Looper.getMainLooper()).post(new adrh(adrjVar, adntVar2, 1));
                adrjVar.c(12);
            } else {
                throw null;
            }
        } else {
            String str9 = a;
            adqy adqyVar3 = (adqy) adntVar;
            String valueOf3 = String.valueOf(adqyVar3.k());
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 30);
            sb3.append("MDX session disconnected from ");
            sb3.append(valueOf3);
            zep.h(str9, sb3.toString());
            long d2 = this.m.d() - this.o;
            if (i == 1) {
                j = this.m.d() - this.p;
                i = 1;
            } else {
                j = 0;
            }
            adqu adquVar3 = (adqu) this.n.get();
            int i8 = adqyVar3.am.i;
            atcv r = adqyVar3.r();
            Integer aL = adqyVar3.aL();
            boolean ai3 = adqyVar3.ai();
            adnw adnwVar3 = adqyVar3.am;
            String str10 = adnwVar3.g;
            int i9 = adnwVar3.h;
            Locale locale3 = Locale.US;
            Object[] objArr3 = new Object[9];
            int i10 = i8 - 1;
            if (i8 != 0) {
                objArr3[0] = Integer.valueOf(i10);
                objArr3[1] = Integer.valueOf(r.C);
                objArr3[2] = Integer.valueOf(i);
                objArr3[3] = Long.valueOf(d2);
                objArr3[4] = Long.valueOf(j);
                objArr3[5] = aL;
                objArr3[6] = Boolean.valueOf(ai3);
                objArr3[7] = str10;
                objArr3[8] = Integer.valueOf(i9);
                String format = String.format(locale3, "mdx session disconnected: sessionType=%d disconnectReason=%d prevState=%d msSinceStarted=%d msSinceConnected=%d errorCode=%d reconnect=%s sessionNonce=%s sessionIndex=%d", objArr3);
                if (adqyVar3.rt()) {
                    zep.m(adqu.a, format);
                } else {
                    zep.h(adqu.a, format);
                }
                aopa createBuilder5 = atbz.a.createBuilder();
                boolean aG3 = adqyVar3.aG();
                createBuilder5.copyOnWrite();
                atbz atbzVar = (atbz) createBuilder5.instance;
                atbzVar.b |= 128;
                atbzVar.h = aG3;
                createBuilder5.copyOnWrite();
                atbz atbzVar2 = (atbz) createBuilder5.instance;
                atbzVar2.c = i10;
                atbzVar2.b |= 1;
                createBuilder5.copyOnWrite();
                atbz atbzVar3 = (atbz) createBuilder5.instance;
                atbzVar3.i = r.C;
                atbzVar3.b |= 256;
                createBuilder5.copyOnWrite();
                atbz atbzVar4 = (atbz) createBuilder5.instance;
                str10.getClass();
                atbzVar4.b |= 8192;
                atbzVar4.m = str10;
                createBuilder5.copyOnWrite();
                atbz atbzVar5 = (atbz) createBuilder5.instance;
                atbzVar5.b |= 16384;
                atbzVar5.n = i9;
                if (aL != null) {
                    if (adqyVar3.rt()) {
                        String str11 = adqu.a;
                        String valueOf4 = String.valueOf(aL);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 23);
                        sb4.append("status error code set: ");
                        sb4.append(valueOf4);
                        zep.m(str11, sb4.toString());
                    } else {
                        String str12 = adqu.a;
                        String valueOf5 = String.valueOf(aL);
                        StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 23);
                        sb5.append("status error code set: ");
                        sb5.append(valueOf5);
                        zep.h(str12, sb5.toString());
                    }
                    int intValue = aL.intValue();
                    createBuilder5.copyOnWrite();
                    atbz atbzVar6 = (atbz) createBuilder5.instance;
                    atbzVar6.b |= 512;
                    atbzVar6.j = intValue;
                }
                createBuilder5.copyOnWrite();
                atbz atbzVar7 = (atbz) createBuilder5.instance;
                atbzVar7.d = adqu.b(i) - 1;
                atbzVar7.b |= 4;
                createBuilder5.copyOnWrite();
                atbz atbzVar8 = (atbz) createBuilder5.instance;
                atbzVar8.b |= 8;
                atbzVar8.e = d2;
                createBuilder5.copyOnWrite();
                atbz atbzVar9 = (atbz) createBuilder5.instance;
                atbzVar9.b |= 2048;
                atbzVar9.k = j;
                createBuilder5.copyOnWrite();
                atbz atbzVar10 = (atbz) createBuilder5.instance;
                atbzVar10.b |= 32;
                atbzVar10.f = ai3;
                if (adqyVar3.am.i == 3) {
                    aopa c3 = adqu.c(adqyVar3);
                    createBuilder5.copyOnWrite();
                    atbz atbzVar11 = (atbz) createBuilder5.instance;
                    atbf atbfVar3 = (atbf) c3.mo39build();
                    atbfVar3.getClass();
                    atbzVar11.g = atbfVar3;
                    atbzVar11.b |= 64;
                }
                atbs a7 = adqu.a(adqyVar3.k());
                if (a7 != null) {
                    createBuilder5.copyOnWrite();
                    atbz atbzVar12 = (atbz) createBuilder5.instance;
                    atbzVar12.l = a7;
                    atbzVar12.b |= 4096;
                }
                arrf a8 = arrh.a();
                a8.copyOnWrite();
                ((arrh) a8.instance).db((atbz) createBuilder5.mo39build());
                adquVar3.b.c((arrh) a8.mo39build());
                if (i != 0) {
                    adrjVar = this;
                } else if (atcv.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER.equals(adqyVar3.r())) {
                    adrjVar = this;
                    adrjVar.c(14);
                } else {
                    adrjVar = this;
                    adrjVar.c(13);
                }
                adrjVar.v.a = null;
                adntVar2 = adntVar;
                ((adod) adrjVar.t.get()).k(adntVar2);
                adrjVar.d = null;
                adrjVar.f = null;
                o();
                new Handler(Looper.getMainLooper()).post(new adrh(adrjVar, adntVar2));
            } else {
                throw null;
            }
        }
        adrjVar.l.d(new adob(adrjVar.d, adntVar.p()));
        final adao adaoVar = adrjVar.B;
        if (adntVar.o() == null || adntVar.o().g == null || adntVar.k() == null) {
            return;
        }
        ylx.j(adaoVar.j.b(new ampg() { // from class: adam
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                adao adaoVar2 = adao.this;
                adnt adntVar3 = adntVar2;
                awts awtsVar = (awts) obj;
                adig k2 = adntVar3.k();
                String g = k2.g();
                awtp awtpVar = awtp.a;
                aoqp aoqpVar = awtsVar.c;
                if (aoqpVar.containsKey(g)) {
                    awtpVar = (awtp) aoqpVar.get(g);
                }
                aopa mo52toBuilder = awtpVar.mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                awtp awtpVar2 = (awtp) mo52toBuilder.instance;
                awtpVar2.b |= 1;
                awtpVar2.c = g;
                String str13 = adntVar3.o().g;
                awtt awttVar = awtt.a;
                str13.getClass();
                Map unmodifiableMap = Collections.unmodifiableMap(((awtp) mo52toBuilder.instance).e);
                if (unmodifiableMap.containsKey(str13)) {
                    awttVar = (awtt) unmodifiableMap.get(str13);
                }
                aopa mo52toBuilder2 = awttVar.mo52toBuilder();
                long c4 = adaoVar2.b.c();
                mo52toBuilder2.copyOnWrite();
                awtt awttVar2 = (awtt) mo52toBuilder2.instance;
                int i11 = awttVar2.b | 4;
                awttVar2.b = i11;
                awttVar2.e = c4;
                if (k2 instanceof adhz) {
                    mo52toBuilder2.copyOnWrite();
                    awtt awttVar3 = (awtt) mo52toBuilder2.instance;
                    awttVar3.c = 1;
                    awttVar3.b |= 1;
                } else if (k2 instanceof adid) {
                    adid adidVar = (adid) k2;
                    if ((i11 & 1) == 0) {
                        if (adidVar.n()) {
                            mo52toBuilder2.copyOnWrite();
                            awtt awttVar4 = (awtt) mo52toBuilder2.instance;
                            awttVar4.c = 3;
                            awttVar4.b |= 1;
                        } else {
                            mo52toBuilder2.copyOnWrite();
                            awtt awttVar5 = (awtt) mo52toBuilder2.instance;
                            awttVar5.c = 2;
                            awttVar5.b |= 1;
                        }
                    }
                }
                int f = awwc.f(((awtt) mo52toBuilder2.instance).d);
                if (f == 0 || f != 3) {
                    int a9 = adntVar3.a();
                    if (a9 == 0) {
                        mo52toBuilder2.copyOnWrite();
                        awtt awttVar6 = (awtt) mo52toBuilder2.instance;
                        awttVar6.d = 1;
                        awttVar6.b |= 2;
                    } else if (a9 == 1) {
                        mo52toBuilder2.copyOnWrite();
                        awtt awttVar7 = (awtt) mo52toBuilder2.instance;
                        awttVar7.d = 2;
                        awttVar7.b |= 2;
                    }
                }
                awtt awttVar8 = (awtt) mo52toBuilder2.mo39build();
                str13.getClass();
                awttVar8.getClass();
                mo52toBuilder.copyOnWrite();
                ((awtp) mo52toBuilder.instance).a().put(str13, awttVar8);
                aopa mo52toBuilder3 = awtsVar.mo52toBuilder();
                mo52toBuilder3.bc(g, (awtp) mo52toBuilder.mo39build());
                return (awts) mo52toBuilder3.mo39build();
            }
        }, anjk.a), anjk.a, acsn.l);
    }
}
