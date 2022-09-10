package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: bytx  reason: default package */
/* loaded from: classes4.dex */
public final class bytx {
    private final btvo a;
    private final bwqv b;
    private bzhv c;

    public bytx(bwqv bwqvVar, btvo btvoVar) {
        this.b = bwqvVar;
        this.a = btvoVar;
    }

    private final synchronized void e() {
        bvrj.UI_THREAD.d();
        if (this.c == null) {
            bzhv bzhvVar = (bzhv) this.b.j(bwrj.KNOWN_STATIONS, (dssr) bzhv.b.cu(7));
            if (bzhvVar == null) {
                bzhvVar = bzhv.b;
            }
            dbsk.s(bzhvVar);
            this.c = bzhvVar;
        }
    }

    private final synchronized void f(String str) {
        e();
        bzhs ca = bzhv.b.ca(this.c);
        bzhu h = h(str, this.c, ca);
        if (h != null) {
            ca.a(h);
        }
        this.c = ca.bK();
        this.b.s(bwrj.KNOWN_STATIONS, this.c);
    }

    private static synchronized void g(bzhv bzhvVar, bzhs bzhsVar) {
        synchronized (bytx.class) {
            dsrj<bzhu> dsrjVar = bzhvVar.a;
            if (bzhsVar.c) {
                bzhsVar.bF();
                bzhsVar.c = false;
            }
            ((bzhv) bzhsVar.b).a = bzhv.ck();
            List<bzhu> subList = dsrjVar.subList(1, dsrjVar.size());
            if (bzhsVar.c) {
                bzhsVar.bF();
                bzhsVar.c = false;
            }
            bzhv bzhvVar2 = (bzhv) bzhsVar.b;
            bzhvVar2.b();
            dsod.bv(subList, bzhvVar2.a);
        }
    }

    @dzsi
    private static synchronized bzhu h(String str, bzhv bzhvVar, bzhs bzhsVar) {
        bzhu bzhuVar;
        synchronized (bytx.class) {
            if (bzhsVar.c) {
                bzhsVar.bF();
                bzhsVar.c = false;
            }
            bzhv bzhvVar2 = bzhv.b;
            ((bzhv) bzhsVar.b).a = bzhv.ck();
            bzhuVar = null;
            for (bzhu bzhuVar2 : bzhvVar.a) {
                if (!str.equals(bzhuVar2.b)) {
                    bzhsVar.a(bzhuVar2);
                } else {
                    bzhuVar = bzhuVar2;
                }
            }
        }
        return bzhuVar;
    }

    public final synchronized boolean a(String str) {
        boolean z;
        e();
        Iterator<bzhu> it = this.c.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (it.next().b.equals(str)) {
                z = true;
                break;
            }
        }
        return z;
    }

    public final synchronized boolean b() {
        e();
        return this.c.a.isEmpty();
    }

    @dzsi
    public final synchronized dbsi<bzhu, Float> c(List<dbsi<String, Float>> list) {
        e();
        if (list.isEmpty()) {
            return null;
        }
        bzhv bzhvVar = this.c;
        if (bzhvVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (bzhu bzhuVar : bzhvVar.a) {
            hashMap.put(bzhuVar.b, bzhuVar);
        }
        for (dbsi<String, Float> dbsiVar : list) {
            String str = dbsiVar.a;
            if (hashMap.containsKey(str)) {
                f(str);
                return dbsi.a((bzhu) hashMap.get(str), dbsiVar.b);
            }
        }
        return null;
    }

    public final synchronized void d(String str, akqq akqqVar) {
        e();
        bzhs ca = bzhv.b.ca(this.c);
        if (a(str)) {
            h(str, this.c, ca);
        } else {
            int size = this.c.a.size();
            dkqz dkqzVar = this.a.getNotificationsParameters().m;
            if (dkqzVar == null) {
                dkqzVar = dkqz.ap;
            }
            if (size >= dkqzVar.y) {
                g(this.c, ca);
            }
        }
        bzht bZ = bzhu.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bzhu bzhuVar = (bzhu) bZ.b;
        str.getClass();
        bzhuVar.a |= 1;
        bzhuVar.b = str;
        dpum h = akqqVar.h();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bzhu bzhuVar2 = (bzhu) bZ.b;
        h.getClass();
        bzhuVar2.c = h;
        bzhuVar2.a |= 2;
        ca.a(bZ.bK());
        Collections.unmodifiableList(((bzhv) ca.b).a).size();
        this.c = ca.bK();
        this.b.s(bwrj.KNOWN_STATIONS, this.c);
    }
}
