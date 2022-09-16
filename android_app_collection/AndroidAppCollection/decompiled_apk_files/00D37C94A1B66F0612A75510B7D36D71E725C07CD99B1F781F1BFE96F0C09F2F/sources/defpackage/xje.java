package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: xje  reason: default package */
/* loaded from: classes4.dex */
public final class xje extends xiu implements wjz {
    public final PlayerAd b;
    public final wzd c;
    public final wka d;
    public ahgn e;
    public boolean f;
    private final xew g;
    private final aafo h;
    private final Set i;
    private final SparseArray j;
    private aypg k;
    private long l;
    private boolean m;
    private boolean n;
    private boolean o;

    public xje(xew xewVar, InstreamAdBreak instreamAdBreak, PlayerAd playerAd, String str, ahgn ahgnVar, aijh aijhVar, wka wkaVar, wzd wzdVar, aafo aafoVar) {
        this.e = null;
        this.g = xewVar;
        playerAd.getClass();
        this.b = playerAd;
        this.c = wzdVar;
        this.h = aafoVar;
        SparseArray sparseArray = new SparseArray();
        if (playerAd.U() != null && !playerAd.U().isEmpty()) {
            for (apae apaeVar : playerAd.U()) {
                List list = (List) sparseArray.get(apaeVar.d);
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(apaeVar);
                sparseArray.put(apaeVar.d, list);
            }
        }
        this.j = sparseArray;
        this.i = new HashSet();
        for (int i = 1; i < 4; i++) {
            this.i.add(Integer.valueOf(i));
        }
        this.e = ahgnVar;
        this.d = wkaVar;
        if (wkaVar != null) {
            wkaVar.b = this;
        }
        wzdVar.e(instreamAdBreak.f, str);
        wzdVar.d(instreamAdBreak);
        wzdVar.a = new InstreamAdImpl(playerAd);
        wzdVar.c = this.e;
        this.k = aijhVar.b.Z(new ayqb() { // from class: xjd
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                xje xjeVar = xje.this;
                ahgn ahgnVar2 = (ahgn) obj;
                aijs d = xjeVar.e.d();
                aijs aijsVar = aijs.FULLSCREEN;
                aijs d2 = ahgnVar2.d();
                aijs aijsVar2 = aijs.FULLSCREEN;
                xjeVar.e = ahgnVar2;
                xjeVar.c.c = xjeVar.e;
                if (!xjeVar.f) {
                    return;
                }
                tjt tjtVar = null;
                if (d != aijsVar && d2 == aijsVar2) {
                    wka wkaVar2 = xjeVar.d;
                    if (wkaVar2 != null) {
                        tjtVar = wkaVar2.d();
                    }
                    if (xjeVar.b.s() != null) {
                        xjeVar.D(xjeVar.b.s().j, tjtVar, xjeVar.c);
                    }
                    xjeVar.E(xjeVar.b.P(), tjtVar);
                } else if (d != aijsVar || d2 == aijsVar2) {
                } else {
                    wka wkaVar3 = xjeVar.d;
                    if (wkaVar3 != null) {
                        tjtVar = wkaVar3.c();
                    }
                    if (xjeVar.b.s() != null) {
                        xjeVar.D(xjeVar.b.s().n, tjtVar, xjeVar.c);
                    }
                    xjeVar.E(xjeVar.b.M(), tjtVar);
                }
            }
        });
    }

    private static amuk F(List list) {
        if (list == null || list.isEmpty()) {
            return amuk.q();
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            apae apaeVar = (apae) it.next();
            if (apaeVar != null && (apaeVar.b & 1) != 0) {
                try {
                    Uri i = zgt.i(apaeVar.c);
                    if (i != null && !Uri.EMPTY.equals(i)) {
                        linkedList.add(i);
                    }
                } catch (MalformedURLException unused) {
                }
            }
        }
        return amuk.o(linkedList);
    }

    private final void G(long j) {
        this.l = j;
        this.c.e = j;
        tjt tjtVar = null;
        if (!this.f) {
            if (j > 1000) {
                return;
            }
            this.n = true;
            wka wkaVar = this.d;
            tjt e = wkaVar != null ? wkaVar.e() : null;
            this.g.f(this.b.Q());
            E(this.b.X(), e);
            if (this.b.s() != null) {
                D(this.b.s().b, e, this.c);
            }
            this.f = true;
        }
        long c = this.b.c() * 1000;
        Iterator it = this.i.iterator();
        while (true) {
            if (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                long j2 = (intValue * c) / 4;
                if (j >= j2 - 1000 && j <= j2 + 1000) {
                    wka wkaVar2 = this.d;
                    if (wkaVar2 != null) {
                        tjtVar = wkaVar2.h(intValue);
                    }
                    E(h(this.b, intValue), tjtVar);
                    this.i.remove(Integer.valueOf(intValue));
                }
            } else if (!this.o && j >= c - 1000 && j <= c) {
                wka wkaVar3 = this.d;
                if (wkaVar3 != null) {
                    tjtVar = wkaVar3.b();
                }
                E(this.b.L(), tjtVar);
                this.o = true;
            }
        }
        HashSet<Integer> hashSet = new HashSet();
        for (int i = 0; i < this.j.size(); i++) {
            int keyAt = this.j.keyAt(i);
            long j3 = keyAt;
            if (j >= j3 - 1000 && j <= j3 + 1000) {
                this.g.f((List) this.j.get(keyAt));
                hashSet.add(Integer.valueOf(keyAt));
            }
        }
        for (Integer num : hashSet) {
            this.j.remove(num.intValue());
        }
    }

    private final void H(List list, afzn... afznVarArr) {
        if (this.h == null || list.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (afznVarArr.length != 0) {
            hashMap.put("MacrosConverters.CustomConvertersKey", afznVarArr);
        }
        aafx.d(this.h, list, hashMap);
    }

    private final void I() {
        wka wkaVar = this.d;
        if (wkaVar != null) {
            wkaVar.k();
            this.d.j();
            this.d.b = null;
        }
    }

    @Override // defpackage.xiu
    public final void A(int i, int i2, int i3, int i4) {
        wka wkaVar = this.d;
        if (wkaVar != null) {
            wkaVar.n(i, i2, i3, i4);
        }
    }

    @Override // defpackage.xiu
    public final void B(ahia ahiaVar) {
        if (!this.f) {
            return;
        }
        if (ahiaVar.a() != 9 && ahiaVar.a() != 10) {
            return;
        }
        I();
    }

    @Override // defpackage.xiu
    public final void C() {
        if (this.f) {
            I();
        }
        aypg aypgVar = this.k;
        if (aypgVar != null) {
            azof.f((AtomicReference) aypgVar);
            this.k = null;
        }
    }

    public final void D(List list, tjt tjtVar, wzd wzdVar) {
        H(list, wzdVar.c(tjtVar));
    }

    public final void E(List list, tjt tjtVar) {
        this.g.e(list, this.c.c(tjtVar));
    }

    @Override // defpackage.wjz
    public final tld a() {
        int c = this.b.c() * 1000;
        int i = (int) this.l;
        boolean z = true;
        boolean z2 = this.e.d() == aijs.FULLSCREEN;
        if (this.e.d() != aijs.BACKGROUND) {
            z = false;
        }
        return new tld(c, i, z2, z);
    }

    @Override // defpackage.wjz
    public final Set b(tla tlaVar) {
        List F;
        LinkedList linkedList = new LinkedList();
        PlayerAd playerAd = this.b;
        tla tlaVar2 = tla.START;
        switch (tlaVar.ordinal()) {
            case 0:
                F = F(playerAd.X());
                break;
            case 1:
                F = F(playerAd.O());
                break;
            case 2:
                F = F(playerAd.S());
                break;
            case 3:
                F = F(playerAd.Y());
                break;
            case 4:
                F = F(playerAd.L());
                break;
            case 5:
                F = F(playerAd.V());
                break;
            case 6:
                F = F(playerAd.T());
                break;
            case 7:
            case 10:
            case 11:
            default:
                F = Collections.emptyList();
                break;
            case 8:
                F = F(playerAd.F());
                break;
            case 9:
                F = F(playerAd.W());
                break;
            case 12:
                F = F(playerAd.I());
                break;
            case 13:
                F = F(playerAd.H());
                break;
            case 14:
                F = F(playerAd.G());
                break;
            case 15:
                F = F(playerAd.P());
                break;
            case 16:
                F = F(playerAd.M());
                break;
        }
        linkedList.addAll(F);
        return afzo.d(linkedList, this.c.b);
    }

    @Override // defpackage.wjz
    public final void c(tjt tjtVar) {
        if (!this.n) {
            return;
        }
        E(this.b.G(), tjtVar);
        if (this.b.s() == null) {
            return;
        }
        D(this.b.s().m, tjtVar, this.c);
    }

    @Override // defpackage.wjz
    public final void d(tjt tjtVar) {
        if (!this.n) {
            return;
        }
        E(this.b.H(), tjtVar);
        if (this.b.s() == null) {
            return;
        }
        D(this.b.s().l, tjtVar, this.c);
    }

    @Override // defpackage.wjz
    public final void e(tjt tjtVar) {
        if (!this.n) {
            return;
        }
        E(this.b.I(), tjtVar);
        if (this.b.s() == null) {
            return;
        }
        D(this.b.s().k, tjtVar, this.c);
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
    }

    @Override // defpackage.xiu
    public final void j(wzq wzqVar) {
    }

    @Override // defpackage.xiu
    public final void k(int i, int i2) {
    }

    @Override // defpackage.xiu
    public final void l(long j) {
        G(j);
    }

    @Override // defpackage.xiu
    public final void m(VisibilityChangeEventData visibilityChangeEventData) {
    }

    @Override // defpackage.xiu
    public final void n() {
        if (!this.f) {
            return;
        }
        this.g.f(this.b.J());
        if (this.b.s() == null) {
            return;
        }
        H(this.b.s().i, new afzn[0]);
    }

    @Override // defpackage.xiu
    public final void o(afkn afknVar) {
    }

    @Override // defpackage.xiu
    public final void p() {
    }

    @Override // defpackage.xiu
    public final void q() {
    }

    @Override // defpackage.xiu
    public final void r() {
        this.m = false;
        this.c.d = false;
        if (!this.f) {
            return;
        }
        wka wkaVar = this.d;
        tjt f = wkaVar != null ? wkaVar.f() : null;
        E(this.b.T(), f);
        if (this.b.s() == null) {
            return;
        }
        D(this.b.s().d, f, this.c);
    }

    @Override // defpackage.xiu
    public final void s() {
        wka wkaVar;
        if (!this.f || (wkaVar = this.d) == null) {
            return;
        }
        wkaVar.m();
    }

    @Override // defpackage.xiu
    public final void t() {
        if (this.m) {
            return;
        }
        this.m = true;
        this.c.d = true;
        if (!this.f) {
            return;
        }
        wka wkaVar = this.d;
        tjt g = wkaVar != null ? wkaVar.g() : null;
        E(this.b.V(), g);
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
    }

    @Override // defpackage.xiu
    public final void w(wyu wyuVar) {
    }

    @Override // defpackage.xiu
    public final void x(xec xecVar) {
    }

    @Override // defpackage.xiu
    public final void y() {
    }

    @Override // defpackage.xiu
    public final void z(ahhx ahhxVar) {
        if (ahhxVar.j()) {
            G(ahhxVar.e());
        }
    }
}
