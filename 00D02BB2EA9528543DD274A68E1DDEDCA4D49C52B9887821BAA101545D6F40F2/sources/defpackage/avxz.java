package defpackage;

import android.text.Spannable;
import android.text.format.DateUtils;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avxz  reason: default package */
/* loaded from: classes3.dex */
public class avxz implements avxp, avwp {
    private static final Comparator<avwx> A = new avxv();
    public static final /* synthetic */ int f = 0;
    public final Executor a;
    public final awfh b;
    @dzsi
    public avwq c;
    @dzsi
    public avzc d;
    private final ges g;
    private final cqat h;
    private final Executor i;
    private final bvjj j;
    private final avyr k;
    private final avij l;
    private final cklf m;
    private final dxio<avik> n;
    private final avzp o;
    private final avuk p;
    private final avzo q;
    private final crzm<avzg> r;
    private final crzm<avkr> s;
    @dzsi
    private avxy y;
    @dzsi
    private crzp<avzg> z;
    private boolean v = false;
    private boolean w = false;
    public boolean e = false;
    private boolean x = false;
    private List<avwx> t = dcdc.e();
    private List<avwx> u = dcdc.e();

    public avxz(fd fdVar, bvjj bvjjVar, cqat cqatVar, avij avijVar, Executor executor, Executor executor2, avyr avyrVar, cklf cklfVar, dxio<avik> dxioVar, avzp avzpVar, avuk avukVar, awfh awfhVar, dxio<akfa> dxioVar2, avzo avzoVar, crzm<avzg> crzmVar) {
        this.g = (ges) fdVar;
        this.j = bvjjVar;
        this.h = cqatVar;
        this.l = avijVar;
        this.i = executor;
        this.a = executor2;
        this.m = cklfVar;
        this.n = dxioVar;
        this.o = avzpVar;
        this.p = avukVar;
        this.b = awfhVar;
        this.q = avzoVar;
        this.r = crzmVar;
        this.s = avijVar.C();
        this.k = avyrVar;
    }

    private final synchronized void B(@dzsi dlug dlugVar) {
        if (dlugVar != null) {
            this.c = new avvx(this.g, this, dlugVar, this.n);
        } else {
            this.c = null;
        }
    }

    public synchronized void A() {
        crzp<avzg> crzpVar = this.z;
        if (crzpVar != null) {
            this.r.c(crzpVar);
            this.z = null;
        }
        avxy avxyVar = this.y;
        if (avxyVar != null) {
            this.s.c(avxyVar);
            this.y = null;
        }
        this.k.h();
    }

    @Override // defpackage.avwp
    public synchronized void a() {
        this.v = true;
    }

    @Override // defpackage.avwp
    public synchronized void b() {
        this.v = false;
        if (this.w) {
            this.a.execute(new Runnable(this) { // from class: avxu
                private final avxz a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cqkx.p(this.a);
                }
            });
            this.w = false;
        }
    }

    @Override // defpackage.avxp
    public synchronized List<avwq> c() {
        dccx F;
        F = dcdc.F();
        F.i(this.t);
        avwq avwqVar = this.c;
        if (avwqVar != null) {
            F.g(avwqVar);
        }
        return F.f();
    }

    @Override // defpackage.avxp
    public synchronized List<avwq> d() {
        return dcdc.q(this.u);
    }

    @Override // defpackage.avxp
    public avyl e() {
        return this.k;
    }

    @Override // defpackage.avxp
    public cqkp f() {
        return new avxw();
    }

    @Override // defpackage.avxp
    public synchronized Boolean g() {
        return Boolean.valueOf(!this.e);
    }

    @Override // defpackage.avxp
    public String h() {
        if (!this.g.aD) {
            return "";
        }
        long s = this.l.s();
        String valueOf = String.valueOf(s > 0 ? DateUtils.getRelativeTimeSpanString(s, this.h.b(), 60000L).toString() : "Never");
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("[debug] Last automatic update check: ");
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // defpackage.avxp
    public synchronized Boolean i() {
        boolean z;
        avzc avzcVar = this.d;
        z = false;
        if (avzcVar != null && avzcVar.e()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.avxp
    public cqkl j() {
        if (!this.g.aD) {
            return cqkl.a;
        }
        this.n.a().f();
        return cqkl.a;
    }

    @Override // defpackage.avxp
    public cqkl k() {
        this.j.S(bvjk.eB, true);
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.avxp
    public cqkl l() {
        this.m.a("android_offline_maps");
        this.j.S(bvjk.eB, true);
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.avxp
    public synchronized Boolean m() {
        boolean z;
        z = false;
        if (this.e && !this.t.isEmpty() && !this.j.m(bvjk.eB, false)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.avxp
    public Boolean n() {
        return Boolean.valueOf(this.l.q());
    }

    @Override // defpackage.avxp
    public synchronized void o() {
        this.x = true;
    }

    @Override // defpackage.avxp
    public CharSequence p() {
        ges gesVar = this.g;
        return gesVar.aD ? gesVar.Rp(R.string.OFFLINE_MAPS_SETTINGS_RECOMMENDED_MAPS_TITLE) : "";
    }

    @Override // defpackage.avxp
    public CharSequence q() {
        ges gesVar = this.g;
        return gesVar.aD ? gesVar.Rp(R.string.OFFLINE_MAPS_SETTINGS_DOWNLOADED_MAPS_TITLE) : "";
    }

    @Override // defpackage.avxp
    public CharSequence r(List<avwq> list) {
        if (!this.g.aD) {
            return "";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        bvsx bvsxVar = new bvsx(this.g.Rn());
        for (avwq avwqVar : list) {
            Spannable k = avwqVar.k(bvsxVar, this.m);
            if (k != null) {
                linkedHashMap.put(k.toString(), k);
            }
        }
        String Rp = this.g.Rp(R.string.HOME);
        String Rp2 = this.g.Rp(R.string.WORK);
        if (linkedHashMap.containsKey(Rp) && linkedHashMap.containsKey(Rp2)) {
            linkedHashMap.remove(Rp);
            linkedHashMap.remove(Rp2);
            Spannable c = bvsxVar.c(R.string.HOME_AND_WORK).c();
            linkedHashMap.put(c.toString(), c);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.values());
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            if (size == 1) {
                bvsu c2 = bvsxVar.c(R.string.OFFLINE_FROM_YOUR_ONE);
                c2.a(arrayList.get(0));
                return c2.c();
            } else if (size == 2) {
                bvsu c3 = bvsxVar.c(R.string.OFFLINE_FROM_YOUR_TWO);
                c3.a(arrayList.get(0), arrayList.get(1));
                return c3.c();
            } else if (size == 3) {
                bvsu c4 = bvsxVar.c(R.string.OFFLINE_FROM_YOUR_THREE);
                c4.a(arrayList.get(0), arrayList.get(1), arrayList.get(2));
                return c4.c();
            } else {
                bvsu c5 = bvsxVar.c(R.string.OFFLINE_FROM_YOUR_FOUR);
                c5.a(arrayList.get(0), arrayList.get(1), arrayList.get(2), arrayList.get(3));
                return c5.c();
            }
        }
        return new String();
    }

    @Override // defpackage.avxp
    public CharSequence s() {
        ges gesVar = this.g;
        return !gesVar.aD ? "" : gesVar.Rp(R.string.OFFLINE_AUTOUPDATE_RECENTLY_USED_TUTORIAL_BODY);
    }

    public synchronized void t() {
        if (this.x) {
            this.j.S(bvjk.eB, true);
        }
    }

    public final synchronized void u(final dltm dltmVar) {
        if (!this.g.aD) {
            return;
        }
        avwx avwxVar = (avwx) dcft.m(this.t, new dbsl(dltmVar) { // from class: avxq
            private final dltm a;

            {
                this.a = dltmVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                dltm dltmVar2 = this.a;
                int i = avxz.f;
                return ((avwx) obj).o().equals(dltmVar2.b);
            }
        }).f();
        if (avwxVar != null) {
            avwxVar.q(dltmVar);
            return;
        }
        avwx avwxVar2 = (avwx) dcft.m(this.u, new dbsl(dltmVar) { // from class: avxr
            private final dltm a;

            {
                this.a = dltmVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                dltm dltmVar2 = this.a;
                int i = avxz.f;
                return ((avwx) obj).o().equals(dltmVar2.b);
            }
        }).f();
        if (avwxVar2 == null) {
            return;
        }
        avwxVar2.q(dltmVar);
    }

    public final synchronized void v(Collection<dltm> collection, @dzsi dlug dlugVar) {
        if (!this.g.aD) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (dltm dltmVar : collection) {
            dltl b = dltl.b(dltmVar.k);
            if (b == null) {
                b = dltl.USER_DEFINED;
            }
            if (b != dltl.DYNAMIC_PADDING || this.b.j()) {
                avwx avwxVar = new avwx(this.g, this, dltmVar, this.n, this.o, this.p, this.q);
                if (!dltmVar.r) {
                    arrayList2.add(avwxVar);
                } else {
                    arrayList.add(avwxVar);
                }
            }
        }
        Comparator<avwx> comparator = A;
        Collections.sort(arrayList, comparator);
        Collections.sort(arrayList2, comparator);
        this.t = arrayList;
        this.u = arrayList2;
        B(dlugVar);
    }

    public final synchronized void w(dspd dspdVar) {
        Iterator<avwx> it = this.t.iterator();
        while (it.hasNext()) {
            if (it.next().o().equals(dspdVar)) {
                it.remove();
                return;
            }
        }
        Iterator<avwx> it2 = this.u.iterator();
        while (it2.hasNext()) {
            if (it2.next().o().equals(dspdVar)) {
                it2.remove();
                return;
            }
        }
    }

    public void x() {
        if (!this.g.aD) {
            return;
        }
        synchronized (this) {
            avxy avxyVar = this.y;
            if (avxyVar != null) {
                avxyVar.On(this.s);
            }
        }
        this.k.j();
    }

    public final synchronized void y() {
        if (this.v) {
            this.w = true;
        } else {
            this.a.execute(new Runnable(this) { // from class: avxs
                private final avxz a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cqkx.p(this.a);
                }
            });
        }
    }

    public synchronized void z() {
        crzp<avzg> crzpVar = new crzp(this) { // from class: avxt
            private final avxz a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                avxz avxzVar = this.a;
                avzg avzgVar = (avzg) crzmVar.l();
                if (avzgVar != null) {
                    synchronized (avxzVar) {
                        avxzVar.d = avzgVar.a();
                    }
                    avxzVar.y();
                    avxzVar.x();
                }
            }
        };
        this.z = crzpVar;
        this.r.d(crzpVar, this.a);
        avxy avxyVar = new avxy(this);
        this.y = avxyVar;
        this.s.d(avxyVar, this.i);
        this.k.g();
    }
}
