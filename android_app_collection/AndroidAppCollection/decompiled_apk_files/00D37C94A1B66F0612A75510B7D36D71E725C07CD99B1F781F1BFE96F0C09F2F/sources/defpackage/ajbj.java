package defpackage;

import android.util.Pair;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: ajbj  reason: default package */
/* loaded from: classes.dex */
public final class ajbj implements ajbk {
    public boolean a;
    private yna d;
    private long f;
    private final ajbp c = new ajbp();
    private final List i = new ArrayList();
    public final List b = new ArrayList();
    private final List j = new ArrayList();
    private final List k = new ArrayList();
    private long e = Long.MIN_VALUE;
    private boolean g = true;
    private boolean h = true;

    private final yna q(long j) {
        return new yna(this.c.a(j));
    }

    private final yna r(long j, long j2) {
        Iterator it;
        ajbp ajbpVar = this.c;
        if (j2 == Long.MAX_VALUE) {
            it = ajbpVar.a(j);
        } else {
            it = ajbpVar.b.subSet(ajbm.r(j), ajbm.r(j2 + 1)).iterator();
        }
        return new yna(it);
    }

    private final void s() {
        aqxo.y(!this.a);
        for (ajbg ajbgVar : this.i) {
            c(ajbgVar);
        }
        this.i.clear();
        for (ajbg ajbgVar2 : this.b) {
            i(ajbgVar2);
        }
        this.b.clear();
        for (Pair pair : this.j) {
            f((ajbg) pair.first, ((Long) pair.second).longValue());
        }
        this.j.clear();
    }

    private final void t() {
        for (wth wthVar : this.k) {
            ajbp<ajbg> ajbpVar = this.c;
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (ajbg ajbgVar : ajbpVar) {
                int i = ajbgVar.m;
                int i2 = i - 1;
                if (i != 0) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            z = true;
                        }
                    }
                    arrayList.add(new TimelineMarker(ajbgVar.q(), ajbgVar.p()));
                } else {
                    throw null;
                }
            }
            aicc aiccVar = new aicc(z ? aicb.LIVE_AD_MARKER : aicb.AD_MARKER, arrayList);
            if (!akzj.f(wthVar.b, aiccVar)) {
                wthVar.b = aiccVar;
                ((yni) wthVar.a.get()).d(aiccVar);
            }
        }
    }

    public final synchronized long a(long j) {
        aqxo.y(!this.a);
        if (this.g) {
            l();
        }
        if (j >= this.e && j > Long.MIN_VALUE && j < Long.MAX_VALUE) {
            if (this.g) {
                zep.l("CueRangeManger state error: isTrackingPaused = true");
            }
            this.a = true;
            if (this.h) {
                this.d = q(this.e + 1);
                this.h = false;
                t();
            }
            while (this.d.hasNext() && j >= ((ajbl) this.d.a()).a) {
                ajbl ajblVar = (ajbl) this.d.mo416next();
                ajbg ajbgVar = (ajbg) ajblVar.b;
                if (ajblVar.c == 1) {
                    ajbgVar.l(this.g, false, false);
                } else {
                    ajbgVar.o();
                }
            }
            this.e = j;
            this.a = false;
            s();
            if (!this.d.hasNext()) {
                return Long.MAX_VALUE;
            }
            return ((ajbl) this.d.a()).a - j;
        }
        String l = Long.toString(j);
        String l2 = Long.toString(this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(l).length() + 65 + String.valueOf(l2).length());
        sb.append("CueRangeManger state error: currentPosition=");
        sb.append(l);
        sb.append(" lastPositionTracked=");
        sb.append(l2);
        zep.l(sb.toString());
        return Long.MAX_VALUE;
    }

    public final synchronized long b(long j, boolean z) {
        yna r;
        aqxo.y(!this.a);
        if (j <= Long.MIN_VALUE || j >= Long.MAX_VALUE) {
            String valueOf = String.valueOf(Long.toString(j));
            zep.l(valueOf.length() != 0 ? "CueRangeManger state error: newPosition=".concat(valueOf) : new String("CueRangeManger state error: newPosition="));
        }
        t();
        long j2 = this.g ? this.f : this.e;
        this.a = true;
        if (j > j2) {
            r = r(j2, j);
        } else {
            r = r(j, j2);
        }
        this.d = r;
        while (this.d.hasNext()) {
            ajbl ajblVar = (ajbl) this.d.mo416next();
            ajbg ajbgVar = (ajbg) ajblVar.b;
            boolean s = ajbgVar.s(j2);
            boolean s2 = ajbgVar.s(j);
            long q = ajbgVar.q();
            long p = ajbgVar.p();
            if (s || !s2) {
                if (s && !s2 && q != p) {
                    ajbgVar.o();
                }
            } else if (q != p || ajblVar.c != 2) {
                ajbgVar.l(this.g, true, z);
            } else {
                ajbgVar.o();
            }
        }
        if (this.g) {
            this.f = j;
        } else {
            this.e = j;
        }
        this.d = q(1 + j);
        this.h = false;
        this.a = false;
        s();
        if (this.d.hasNext()) {
            return ((ajbl) this.d.a()).a - j;
        }
        return Long.MAX_VALUE;
    }

    @Override // defpackage.ajbk
    public final synchronized void c(ajbg ajbgVar) {
        if (ajbgVar == null) {
            return;
        }
        if (this.a) {
            this.i.add(ajbgVar);
            return;
        }
        this.c.b(ajbgVar);
        this.h = true;
        t();
    }

    @Override // defpackage.ajbk
    public final synchronized void d(List list) {
        if (this.a) {
            this.i.addAll(list);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.c.b((ajbg) it.next());
        }
        this.h = true;
        t();
    }

    public final void e(ajbg ajbgVar) {
        if (ajbgVar == null) {
            return;
        }
        if (ajbgVar.l && ajbgVar.s(this.e)) {
            ajbgVar.o();
        }
        this.h = true;
    }

    @Override // defpackage.ajbk
    public final synchronized void f(ajbg ajbgVar, long j) {
        if (ajbgVar != null) {
            if (this.c.c(ajbgVar)) {
                if (this.a) {
                    this.j.add(new Pair(ajbgVar, Long.valueOf(j)));
                } else if (this.e >= ajbgVar.p()) {
                } else {
                    ajbgVar.m(j);
                    this.h = true;
                    t();
                }
            }
        }
    }

    public final synchronized void g() {
        b(9223372036854775806L, false);
        this.g = false;
        k();
    }

    public final synchronized void h() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.f = this.e;
    }

    @Override // defpackage.ajbk
    public final synchronized void i(ajbg ajbgVar) {
        if (ajbgVar != null) {
            if (this.c.c(ajbgVar)) {
                if (this.a) {
                    this.b.add(ajbgVar);
                    return;
                }
                ajbp ajbpVar = this.c;
                ajbg[] ajbgVarArr = {ajbgVar};
                for (int i = 0; i <= 0; i++) {
                    ajbg ajbgVar2 = ajbgVarArr[i];
                    ajbpVar.a.remove(ajbgVar2);
                    ajbpVar.b.remove(ajbgVar2.n);
                    ajbpVar.b.remove(ajbgVar2.o);
                }
                e(ajbgVar);
                t();
            }
        }
    }

    @Override // defpackage.ajbk
    public final synchronized void j(final Class cls) {
        ajbp ajbpVar = this.c;
        ampg ampgVar = new ampg() { // from class: ajbi
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                ajbj ajbjVar = ajbj.this;
                ajbg ajbgVar = (ajbg) obj;
                if (cls.isInstance(ajbgVar)) {
                    if (ajbjVar.a) {
                        ajbjVar.b.add(ajbgVar);
                        return false;
                    }
                    return true;
                }
                return false;
            }
        };
        zdt zdtVar = new zdt() { // from class: ajbh
            @Override // defpackage.zdt
            public final void a(Object obj) {
                ajbj.this.e((ajbg) obj);
            }
        };
        Iterator it = ajbpVar.a.iterator();
        while (it.hasNext()) {
            ajbm ajbmVar = (ajbm) it.next();
            if (((Boolean) ampgVar.apply(ajbmVar)).booleanValue()) {
                it.remove();
                ajbpVar.b.remove(ajbmVar.n);
                ajbpVar.b.remove(ajbmVar.o);
                zdtVar.a(ajbmVar);
            }
        }
        t();
    }

    public final synchronized void k() {
        this.e = Long.MIN_VALUE;
        this.h = true;
        h();
        j(ajbg.class);
        this.d = q(this.e);
    }

    public final synchronized void l() {
        if (!this.g) {
            return;
        }
        this.g = false;
        long j = this.e;
        long j2 = this.f;
        if (j != j2) {
            b(j2, false);
        } else {
            t();
        }
    }

    public final synchronized void m() {
        this.g = false;
        b(-9223372036854775807L, false);
    }

    public final synchronized boolean n() {
        return this.g;
    }

    @Override // defpackage.ajbk
    public final synchronized void o(wth wthVar) {
        if (!this.k.contains(wthVar)) {
            this.k.add(wthVar);
        }
    }

    @Override // defpackage.ajbk
    public final synchronized void p(wth wthVar) {
        this.k.remove(wthVar);
    }
}
