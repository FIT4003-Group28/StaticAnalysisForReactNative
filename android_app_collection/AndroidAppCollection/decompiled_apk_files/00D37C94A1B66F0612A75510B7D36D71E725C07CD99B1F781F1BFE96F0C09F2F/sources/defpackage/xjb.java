package defpackage;

import android.net.Uri;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.ads.model.SurveyAd;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
/* compiled from: PG */
/* renamed from: xjb  reason: default package */
/* loaded from: classes4.dex */
public final class xjb extends xiu implements wjz {
    public final PlayerAd b;
    public final wzd c;
    public final xew d;
    public boolean e;
    public ahgn f;
    public final wka g;
    private final int h;
    private boolean i;
    private int j;
    private int k;
    private PriorityQueue l;
    private PriorityQueue m;
    private aafo n;
    private aypg o;

    public xjb(wzx wzxVar, xew xewVar, InstreamAdBreak instreamAdBreak, PlayerAd playerAd, String str, ahgn ahgnVar, aijh aijhVar, wka wkaVar, wzd wzdVar, int i, aafo aafoVar) {
        PriorityQueue priorityQueue;
        this.f = null;
        wzxVar.getClass();
        this.d = xewVar;
        playerAd.getClass();
        this.b = playerAd;
        this.g = wkaVar;
        this.k = -1;
        PriorityQueue priorityQueue2 = new PriorityQueue(playerAd.U().size() + 1, a);
        for (apae apaeVar : playerAd.U()) {
            if (apaeVar.d >= 0) {
                priorityQueue2.add(apaeVar);
            }
        }
        this.l = priorityQueue2;
        int i2 = this.k;
        if (this.b.s() == null) {
            priorityQueue = new PriorityQueue();
        } else {
            PriorityQueue priorityQueue3 = new PriorityQueue();
            for (apbf apbfVar : this.b.s().h) {
                xdl a = xdl.a(apbfVar, this.b.c() * 1000);
                if (a != null && a.a > i2) {
                    priorityQueue3.add(a);
                }
            }
            priorityQueue = priorityQueue3;
        }
        this.m = priorityQueue;
        this.f = ahgnVar;
        this.c = wzdVar;
        this.h = i;
        this.n = aafoVar;
        wzdVar.e(instreamAdBreak.f, str);
        wzdVar.d(instreamAdBreak);
        wzdVar.a = new InstreamAdImpl(playerAd);
        wzdVar.c = this.f;
        if (wkaVar != null) {
            wkaVar.b = this;
        }
        this.o = aijhVar.b.Z(new ayqb() { // from class: xja
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                xjb xjbVar = xjb.this;
                ahgn ahgnVar2 = (ahgn) obj;
                aijs d = xjbVar.f.d();
                aijs aijsVar = aijs.FULLSCREEN;
                aijs d2 = ahgnVar2.d();
                aijs aijsVar2 = aijs.FULLSCREEN;
                aijs d3 = xjbVar.f.d();
                aijs aijsVar3 = aijs.MINIMIZED;
                aijs d4 = ahgnVar2.d();
                aijs aijsVar4 = aijs.MINIMIZED;
                aijs d5 = xjbVar.f.d();
                aijs aijsVar5 = aijs.DEFAULT;
                aijs d6 = ahgnVar2.d();
                aijs aijsVar6 = aijs.DEFAULT;
                xjbVar.f = ahgnVar2;
                xjbVar.c.c = xjbVar.f;
                if (d5 != aijsVar5 && d6 == aijsVar6 && xjbVar.b.s() != null) {
                    xjbVar.E(xjbVar.b.s().q, new afzn[0]);
                }
                if (d3 != aijsVar3 && d4 == aijsVar4 && xjbVar.b.s() != null) {
                    xjbVar.E(xjbVar.b.s().r, new afzn[0]);
                }
                tjt tjtVar = null;
                if (d != aijsVar && d2 == aijsVar2) {
                    wka wkaVar2 = xjbVar.g;
                    if (wkaVar2 != null) {
                        tjtVar = wkaVar2.d();
                    }
                    if (xjbVar.b.s() != null) {
                        xjbVar.D(xjbVar.b.s().j, tjtVar, xjbVar.c);
                    }
                    xjbVar.F(xjbVar.b.P(), tjtVar);
                } else if (d != aijsVar || d2 == aijsVar2) {
                } else {
                    wka wkaVar3 = xjbVar.g;
                    if (wkaVar3 != null) {
                        tjtVar = wkaVar3.c();
                    }
                    if (xjbVar.b.s() != null) {
                        xjbVar.D(xjbVar.b.s().n, tjtVar, xjbVar.c);
                    }
                    xjbVar.F(xjbVar.b.M(), tjtVar);
                }
            }
        });
    }

    private final void G(int i) {
        int i2;
        int i3 = this.h;
        if (i3 <= 0 || i - this.k <= i3) {
            long j = i;
            this.c.e = j;
            if (!this.e && I()) {
                H();
                this.e = true;
            }
            while (true) {
                i2 = 0;
                if (this.l.size() > 0 && i >= ((apae) this.l.peek()).d) {
                    ((xfb) this.d).c((apae) this.l.poll(), afzn.f);
                }
            }
            while (this.m.size() > 0 && j >= ((xdl) this.m.peek()).a) {
                this.n.c(((xdl) this.m.poll()).b, null);
            }
            this.k = i;
            int c = this.b.c() * 1000;
            if (c > 0) {
                i2 = (i * 4) / c;
            }
            if (i2 < this.j) {
                return;
            }
            for (int i4 = i2; i4 >= this.j; i4--) {
                wka wkaVar = this.g;
                if (F(h(this.b, i4), wkaVar != null ? wkaVar.h(i4) : null)) {
                    break;
                }
            }
            this.j = i2 + 1;
        }
    }

    private final void H() {
        wka wkaVar = this.g;
        tjt e = wkaVar != null ? wkaVar.e() : null;
        this.d.f(this.b.Q());
        F(this.b.X(), e);
        if (this.b.s() != null) {
            D(this.b.s().b, e, this.c);
        }
    }

    private final boolean I() {
        return this.b.k.aK();
    }

    @Override // defpackage.xiu
    public final void A(int i, int i2, int i3, int i4) {
        wka wkaVar = this.g;
        if (wkaVar != null) {
            wkaVar.n(i, i2, i3, i4);
        }
    }

    @Override // defpackage.xiu
    public final void B(ahia ahiaVar) {
    }

    @Override // defpackage.xiu
    public final void C() {
        wka wkaVar = this.g;
        if (wkaVar != null) {
            wkaVar.k();
            this.g.j();
            this.g.b = null;
        }
        aypg aypgVar = this.o;
        if (aypgVar != null) {
            azof.f((AtomicReference) aypgVar);
            this.o = null;
        }
    }

    public final void D(List list, tjt tjtVar, wzd wzdVar) {
        E(list, wzdVar.c(tjtVar));
    }

    public final void E(List list, afzn... afznVarArr) {
        if (this.n == null || list.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (afznVarArr.length != 0) {
            hashMap.put("MacrosConverters.CustomConvertersKey", afznVarArr);
        }
        aafx.d(this.n, list, hashMap);
    }

    public final boolean F(List list, tjt tjtVar) {
        return this.d.e(list, this.c.c(tjtVar));
    }

    @Override // defpackage.wjz
    public final tld a() {
        int c = this.b.c() * 1000;
        int i = this.k;
        boolean z = true;
        boolean z2 = this.f.d() == aijs.FULLSCREEN;
        if (this.f.d() != aijs.BACKGROUND) {
            z = false;
        }
        return new tld(c, i, z2, z);
    }

    @Override // defpackage.wjz
    public final Set b(tla tlaVar) {
        return afzo.d(xeu.b(this.b, tlaVar), this.c.b);
    }

    @Override // defpackage.wjz
    public final void c(tjt tjtVar) {
        F(this.b.G(), tjtVar);
        if (this.b.s() != null) {
            D(this.b.s().m, tjtVar, this.c);
        }
    }

    @Override // defpackage.wjz
    public final void d(tjt tjtVar) {
        F(this.b.H(), tjtVar);
        if (this.b.s() != null) {
            D(this.b.s().l, tjtVar, this.c);
        }
    }

    @Override // defpackage.wjz
    public final void e(tjt tjtVar) {
        F(this.b.I(), tjtVar);
        if (this.b.s() != null) {
            D(this.b.s().k, tjtVar, this.c);
        }
    }

    @Override // defpackage.xiu
    public final wzd f() {
        return this.c;
    }

    @Override // defpackage.xiu
    public final String g() {
        return this.b.l;
    }

    @Override // defpackage.xiu
    public final void i() {
        if (this.i || !this.e) {
            return;
        }
        wka wkaVar = this.g;
        tjt a = wkaVar != null ? wkaVar.a() : null;
        if (this.b.s() != null) {
            D(this.b.s().o, a, this.c);
        }
        this.d.e(this.b.F(), this.c.c(a), this.c);
    }

    @Override // defpackage.xiu
    public final void j(wzq wzqVar) {
        tjt tjtVar;
        if (this.i) {
            return;
        }
        this.i = true;
        if (wzqVar == wzq.VIDEO_ENDED || wzqVar == wzq.SURVEY_ENDED) {
            wzd wzdVar = this.c;
            wzdVar.d = false;
            wzdVar.e = TimeUnit.SECONDS.toMillis(this.b.c());
            wka wkaVar = this.g;
            tjt tjtVar2 = null;
            if (wkaVar != null) {
                tjx tjxVar = wkaVar.a;
                Map k = tjxVar.a.k(false);
                tky tkyVar = tjxVar.a;
                tjtVar = tky.q(null, k);
            } else {
                tjtVar = null;
            }
            wza c = this.c.c(tjtVar);
            while (this.l.size() > 0) {
                this.d.c((apae) this.l.poll(), c);
            }
            while (this.m.size() > 0) {
                this.n.c(((xdl) this.m.poll()).b, null);
            }
            wka wkaVar2 = this.g;
            if (wkaVar2 != null) {
                tjtVar2 = wkaVar2.b();
            }
            F(this.b.L(), tjtVar2);
            this.j = 5;
        }
        if (wzqVar != wzq.AD_VIDEO_TIMEOUT) {
            return;
        }
        this.d.e(this.b.N(), new wyy(new wyx(wyw.VIDEO_PLAYBACK_ERROR_LOAD_TIMEOUT, "ad.loadtimeout.fatal")));
        if (this.b.s() == null) {
            return;
        }
        E(this.b.s().c, new afzn[0]);
    }

    @Override // defpackage.xiu
    public final void k(int i, int i2) {
        wka wkaVar = this.g;
        tjt i3 = wkaVar != null ? wkaVar.i() : null;
        wzj wzjVar = new wzj(i, i2);
        wza c = this.c.c(i3);
        this.d.e(this.b.W(), wzjVar, c);
        if (this.b.s() != null) {
            E(this.b.s().f, wzjVar, c);
        }
    }

    @Override // defpackage.xiu
    public final void m(VisibilityChangeEventData visibilityChangeEventData) {
        wka wkaVar = this.g;
        if (wkaVar != null) {
            wkaVar.l(visibilityChangeEventData);
        }
    }

    @Override // defpackage.xiu
    public final void n() {
        this.d.f(this.b.J());
        if (this.b.s() != null) {
            E(this.b.s().i, new afzn[0]);
        }
    }

    @Override // defpackage.xiu
    public final void o(afkn afknVar) {
        wyy wyyVar = new wyy(wyx.d(afknVar));
        if (this.j != 5) {
            this.d.e(this.b.K(), wyyVar);
            this.d.e(this.b.N(), wyyVar);
            if (this.b.s() != null) {
                E(this.b.s().c, wyyVar);
            }
            this.j = 5;
        }
    }

    @Override // defpackage.xiu
    public final void p() {
    }

    @Override // defpackage.xiu
    public final void q() {
        this.d.f(this.b.R());
        if (this.b.s() != null) {
            E(this.b.s().p, new afzn[0]);
        }
    }

    @Override // defpackage.xiu
    public final void r() {
        this.c.d = false;
        wka wkaVar = this.g;
        tjt f = wkaVar != null ? wkaVar.f() : null;
        F(this.b.T(), f);
        if (this.b.s() != null) {
            D(this.b.s().d, f, this.c);
        }
    }

    @Override // defpackage.xiu
    public final void s() {
        wka wkaVar = this.g;
        if (wkaVar != null) {
            wkaVar.m();
        }
    }

    @Override // defpackage.xiu
    public final void t() {
        this.c.d = true;
        if (!this.e && !I()) {
            H();
            this.e = true;
        }
        if (this.j == 0) {
            this.j = 1;
            return;
        }
        wka wkaVar = this.g;
        tjt g = wkaVar != null ? wkaVar.g() : null;
        F(this.b.V(), g);
        if (this.b.s() == null) {
            return;
        }
        D(this.b.s().e, g, this.c);
    }

    @Override // defpackage.xiu
    public final void u() {
    }

    @Override // defpackage.xiu
    public final void v() {
        this.d.f(this.b.K());
        if (this.b.s() != null) {
            E(this.b.s().g, new afzn[0]);
        }
    }

    @Override // defpackage.xiu
    public final void w(wyu wyuVar) {
        G((int) wyuVar.a());
    }

    @Override // defpackage.xiu
    public final void x(xec xecVar) {
        String b;
        PlayerAd playerAd = this.b;
        if (!(playerAd instanceof SurveyAd) || xecVar == null) {
            return;
        }
        apap apapVar = xecVar.b;
        boolean z = apapVar == null || apapVar.b;
        xew xewVar = this.d;
        aalo aaloVar = (aalo) ((aall) playerAd).B().get(0);
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Uri uri : aaloVar.i()) {
            arrayList.add(new AbstractMap.SimpleEntry(uri, xecVar.a(String.valueOf(aaloVar.b()), aaloVar.f(), aaloVar.d(), aaloVar.e(), aaloVar.h(), uri)));
        }
        afzn[] afznVarArr = {afzn.f};
        if (arrayList.size() <= 0) {
            return;
        }
        for (Map.Entry entry : arrayList) {
            Uri uri2 = (Uri) entry.getKey();
            List<Map.Entry> list = (List) entry.getValue();
            if (uri2 != null && !Uri.EMPTY.equals(uri2)) {
                xfb xfbVar = (xfb) xewVar;
                Uri g = xfbVar.g(uri2, afznVarArr);
                afzo afzoVar = xfbVar.c;
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry2 : list) {
                    Matcher matcher = afzo.a.matcher((CharSequence) entry2.getValue());
                    StringBuffer stringBuffer = new StringBuffer();
                    while (matcher.find()) {
                        if (matcher.groupCount() == 1 && (b = afzoVar.b(uri2, matcher.group(1), afznVarArr)) != null) {
                            matcher.appendReplacement(stringBuffer, Uri.encode(b));
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    arrayList2.add(new AbstractMap.SimpleEntry((String) entry2.getKey(), stringBuffer.toString()));
                }
                xfbVar.b.execute(new xfa(xfbVar, g, arrayList2, z));
            }
        }
    }

    @Override // defpackage.xiu
    public final void y() {
        wka wkaVar = this.g;
        F(this.b.n.w, wkaVar != null ? wkaVar.a() : null);
        if (this.b.s() != null) {
            E(this.b.s().s, new afzn[0]);
        }
    }

    @Override // defpackage.xiu
    public final void z(ahhx ahhxVar) {
        if (!ahhxVar.j() || this.i) {
            return;
        }
        G((int) ahhxVar.e());
    }
}
