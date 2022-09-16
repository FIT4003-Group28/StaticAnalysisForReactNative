package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: agpn  reason: default package */
/* loaded from: classes.dex */
public final class agpn implements agxf {
    public static final long a = TimeUnit.MINUTES.toMillis(1);
    private final snc b;
    private final SharedPreferences c;
    private final agpt d;
    private final azqb e;
    private final Map f = new HashMap();
    private final Set g;

    public agpn(snc sncVar, SharedPreferences sharedPreferences, agpt agptVar, azqb azqbVar, Set set) {
        this.b = sncVar;
        this.c = sharedPreferences;
        this.d = agptVar;
        this.e = azqbVar;
        this.g = set;
    }

    private static final void m(aopa aopaVar, agqz agqzVar) {
        long i = agxg.i(agqzVar.g);
        long j = agxg.j(agqzVar.g);
        aopaVar.copyOnWrite();
        atsj atsjVar = (atsj) aopaVar.instance;
        atsj atsjVar2 = atsj.a;
        atsjVar.b |= 4096;
        atsjVar.o = i / 1024;
        aopaVar.copyOnWrite();
        atsj atsjVar3 = (atsj) aopaVar.instance;
        atsjVar3.b |= 2048;
        atsjVar3.n = j / 1024;
    }

    @Override // defpackage.agxf
    public final void a(agqz agqzVar) {
    }

    @Override // defpackage.agxf
    public final void b(agqz agqzVar) {
        if (!agpr.b(agqzVar.f)) {
            return;
        }
        aopa c = agpr.c(agqzVar);
        c.copyOnWrite();
        atsj atsjVar = (atsj) c.instance;
        atsj atsjVar2 = atsj.a;
        atsjVar.h = 12;
        atsjVar.b |= 16;
        boolean z = ahdr.a;
        c.copyOnWrite();
        atsj atsjVar3 = (atsj) c.instance;
        atsjVar3.c |= 64;
        atsjVar3.A = z;
        c.copyOnWrite();
        atsj atsjVar4 = (atsj) c.instance;
        atsjVar4.g = 8;
        atsjVar4.b = 8 | atsjVar4.b;
        this.d.c((atsj) c.mo39build());
    }

    @Override // defpackage.agxf
    public final void c() {
    }

    @Override // defpackage.agxf
    public final void d(agqz agqzVar) {
        if (!agpr.b(agqzVar.f)) {
            return;
        }
        aopa c = agpr.c(agqzVar);
        c.copyOnWrite();
        atsj atsjVar = (atsj) c.instance;
        atsj atsjVar2 = atsj.a;
        atsjVar.h = 5;
        atsjVar.b |= 16;
        c.copyOnWrite();
        atsj atsjVar3 = (atsj) c.instance;
        atsjVar3.b |= 8388608;
        atsjVar3.v = agpr.a(128);
        boolean z = ahdr.a;
        c.copyOnWrite();
        atsj atsjVar4 = (atsj) c.instance;
        atsjVar4.c |= 64;
        atsjVar4.A = z;
        c.copyOnWrite();
        atsj atsjVar5 = (atsj) c.instance;
        atsjVar5.g = 9;
        atsjVar5.b |= 8;
        amzs it = ((amyg) this.g).iterator();
        while (it.hasNext()) {
            ((agps) it.next()).c();
        }
        this.d.c((atsj) c.mo39build());
    }

    @Override // defpackage.agxf
    public final void e(agqz agqzVar) {
        if (!agpr.b(agqzVar.f)) {
            return;
        }
        String s = agxg.s(agqzVar.f);
        if (TextUtils.isEmpty(s)) {
            return;
        }
        if (this.f.containsKey(s) && this.b.c() - ((Long) this.f.get(s)).longValue() < a) {
            return;
        }
        aopa c = agpr.c(agqzVar);
        c.copyOnWrite();
        atsj atsjVar = (atsj) c.instance;
        atsj atsjVar2 = atsj.a;
        atsjVar.h = 9;
        atsjVar.b |= 16;
        this.d.c((atsj) c.mo39build());
        this.f.put(s, Long.valueOf(this.b.c()));
    }

    @Override // defpackage.agxf
    public final void f(agqz agqzVar) {
        if (agpr.b(agqzVar.f) && (agqzVar.c & 512) == 0) {
            aopa c = agpr.c(agqzVar);
            c.copyOnWrite();
            atsj atsjVar = (atsj) c.instance;
            atsj atsjVar2 = atsj.a;
            atsjVar.h = 5;
            atsjVar.b |= 16;
            int i = agqzVar.c;
            c.copyOnWrite();
            atsj atsjVar3 = (atsj) c.instance;
            atsjVar3.b |= 8388608;
            atsjVar3.v = agpr.a(i);
            boolean z = ahdr.a;
            c.copyOnWrite();
            atsj atsjVar4 = (atsj) c.instance;
            atsjVar4.c |= 64;
            atsjVar4.A = z;
            c.copyOnWrite();
            atsj atsjVar5 = (atsj) c.instance;
            atsjVar5.g = 9;
            atsjVar5.b |= 8;
            this.d.c((atsj) c.mo39build());
        }
    }

    @Override // defpackage.agxf
    public final void g() {
    }

    @Override // defpackage.agxf
    public final void h(agqz agqzVar) {
        if (!agpr.b(agqzVar.f)) {
            return;
        }
        aopa c = agpr.c(agqzVar);
        c.copyOnWrite();
        atsj atsjVar = (atsj) c.instance;
        atsj atsjVar2 = atsj.a;
        atsjVar.g = 2;
        atsjVar.b |= 8;
        c.copyOnWrite();
        atsj atsjVar3 = (atsj) c.instance;
        atsjVar3.b |= 8388608;
        atsjVar3.v = agpr.a(64);
        boolean z = ahdr.a;
        c.copyOnWrite();
        atsj atsjVar4 = (atsj) c.instance;
        atsjVar4.c = 64 | atsjVar4.c;
        atsjVar4.A = z;
        amzs it = ((amyg) this.g).iterator();
        while (it.hasNext()) {
            ((agps) it.next()).d();
        }
        this.d.c((atsj) c.mo39build());
    }

    @Override // defpackage.agxf
    public final void i(agqz agqzVar) {
    }

    @Override // defpackage.agxf
    public final void j(agqz agqzVar) {
        if (!agpr.b(agqzVar.f)) {
            return;
        }
        aopa c = agpr.c(agqzVar);
        c.copyOnWrite();
        atsj atsjVar = (atsj) c.instance;
        atsj atsjVar2 = atsj.a;
        atsjVar.g = 5;
        atsjVar.b |= 8;
        boolean z = ahdr.a;
        c.copyOnWrite();
        atsj atsjVar3 = (atsj) c.instance;
        atsjVar3.c |= 64;
        atsjVar3.A = z;
        this.d.c((atsj) c.mo39build());
    }

    @Override // defpackage.agxf
    public final void k(agqz agqzVar, atsg atsgVar, agqe agqeVar) {
        if (agqzVar.b == avkl.TRANSFER_STATE_COMPLETE) {
            this.c.edit().putLong(zhn.q("%s_offline_download_success", ((agrf) this.e.get()).d()), this.b.c()).apply();
        }
        if (!agpr.b(agqzVar.f)) {
            return;
        }
        aopa c = agpr.c(agqzVar);
        boolean z = ahdr.a;
        c.copyOnWrite();
        atsj atsjVar = (atsj) c.instance;
        atsj atsjVar2 = atsj.a;
        atsjVar.c |= 64;
        atsjVar.A = z;
        int ordinal = agqzVar.b.ordinal();
        if (ordinal == 3) {
            c.copyOnWrite();
            atsj atsjVar3 = (atsj) c.instance;
            atsjVar3.h = 2;
            atsjVar3.b |= 16;
            c.copyOnWrite();
            atsj atsjVar4 = (atsj) c.instance;
            atsjVar4.g = 4;
            atsjVar4.b |= 8;
            amzs it = ((amyg) this.g).iterator();
            while (it.hasNext()) {
                ((agps) it.next()).e();
            }
            this.d.c((atsj) c.mo39build());
        } else if (ordinal != 5) {
            if (ordinal != 6) {
                return;
            }
            c.copyOnWrite();
            atsj atsjVar5 = (atsj) c.instance;
            atsjVar5.h = 4;
            atsjVar5.b |= 16;
            c.copyOnWrite();
            atsj atsjVar6 = (atsj) c.instance;
            atsjVar6.g = 6;
            atsjVar6.b |= 8;
            m(c, agqzVar);
            amzs it2 = ((amyg) this.g).iterator();
            while (it2.hasNext()) {
                ((agps) it2.next()).a();
            }
            this.d.c((atsj) c.mo39build());
        } else {
            c.copyOnWrite();
            atsj atsjVar7 = (atsj) c.instance;
            atsjVar7.h = 6;
            atsjVar7.b |= 16;
            c.copyOnWrite();
            atsj atsjVar8 = (atsj) c.instance;
            atsjVar8.i = atsgVar.H;
            atsjVar8.b |= 32;
            c.copyOnWrite();
            atsj atsjVar9 = (atsj) c.instance;
            atsjVar9.g = 7;
            atsjVar9.b |= 8;
            m(c, agqzVar);
            amzs it3 = ((amyg) this.g).iterator();
            while (it3.hasNext()) {
                ((agps) it3.next()).b();
            }
            this.d.c((atsj) c.mo39build());
        }
    }

    @Override // defpackage.agxf
    public final void l(agqz agqzVar) {
    }
}
