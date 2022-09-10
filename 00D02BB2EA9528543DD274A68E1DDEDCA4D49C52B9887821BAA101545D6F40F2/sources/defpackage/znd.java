package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: znd  reason: default package */
/* loaded from: classes7.dex */
public class znd implements zdo {
    public final gft a;
    public final amub b;
    public final cjqy c;
    public final Runnable d;
    public int e;
    final jng f = new znc(this);
    private final List<zcd> g;
    private final jib h;
    @dzsi
    private final zfg i;

    public znd(ff ffVar, bvsl bvslVar, vtn vtnVar, afwr afwrVar, cjqy cjqyVar, zrl zrlVar, bvly bvlyVar, bvlo bvloVar, btvo btvoVar, gce gceVar, zrt zrtVar, gft gftVar, amub amubVar, int i, @dzsi zfg zfgVar, Runnable runnable) {
        amub amubVar2 = amubVar;
        this.a = gftVar;
        this.b = amubVar2;
        this.d = runnable;
        if (amubVar.h() == 0) {
            String valueOf = String.valueOf(amubVar.a());
            throw new RuntimeException(valueOf.length() != 0 ? "Attempting to preview a route with 0 steps: ".concat(valueOf) : new String("Attempting to preview a route with 0 steps: "));
        }
        dbsk.z(i, amubVar.h());
        this.e = i;
        this.c = cjqyVar;
        this.g = dchl.f(amubVar.h());
        atee a = atdz.a(ffVar, bvlyVar, bvloVar, btvoVar.getDirectionsExperimentsParameters().l);
        Resources resources = ffVar.getResources();
        int e = atnp.b().e(ffVar);
        int e2 = atnp.a().e(ffVar);
        atec a2 = atec.a(resources, R.color.quantum_grey, R.color.qu_google_green_400, R.color.quantum_grey, e, e2);
        ated atedVar = new ated(a2, a2, atec.a(resources, R.color.quantum_grey900, R.color.quantum_grey, R.color.quantum_grey900, e, e2), atec.a(resources, R.color.quantum_white_100, R.color.quantum_grey, R.color.quantum_white_100, e, e2));
        int i2 = 0;
        while (i2 < amubVar.h()) {
            ated atedVar2 = atedVar;
            this.g.add(zrk.u(zrlVar, zrtVar, amubVar2.o(i2), amubVar, amubVar.f(), bvslVar, amubVar2.I, vtnVar, gceVar.h(), this.d, false, a, atedVar2));
            i2++;
            amubVar2 = amubVar;
            atedVar = atedVar2;
        }
        this.i = zfgVar;
        Resources resources2 = ffVar.getResources();
        jhz a3 = jhz.a();
        a3.a = resources2.getString(R.string.ROUTE_PREVIEW_TITLE);
        a3.f(new znb(gftVar, ffVar));
        a3.l = cqrt.l(R.string.ACCESSIBILITY_OVERFLOW_MENU).a(ffVar);
        a3.o = cjtd.a(dtxw.a);
        dqvj dqvjVar = amubVar.h;
        afwo l = afwrVar.l();
        dccx F = dcdc.F();
        zlm.a(F, dqvjVar, l, resources2);
        a3.d(F.f());
        a3.x = false;
        this.h = a3.b();
    }

    @Override // defpackage.zdo
    public List<zcd> a() {
        return this.g;
    }

    @Override // defpackage.zdo
    public jng b() {
        return this.f;
    }

    @Override // defpackage.zdo
    public Boolean c() {
        return Boolean.valueOf(this.e == 0);
    }

    @Override // defpackage.zdo
    public Boolean d() {
        return Boolean.valueOf(this.e == this.g.size() + (-1));
    }

    @Override // defpackage.zdo
    public cqkl e() {
        if (this.e < this.b.h() - 1) {
            this.e++;
        }
        this.d.run();
        return cqkl.a;
    }

    @Override // defpackage.zdo
    public cqkl f() {
        int i = this.e;
        if (i > 0) {
            this.e = i - 1;
        }
        this.d.run();
        return cqkl.a;
    }

    @Override // defpackage.zdo
    public jib g() {
        return this.h;
    }

    @Override // defpackage.zdo
    public zcd h() {
        return a().get(this.e);
    }

    @Override // defpackage.zdo
    @dzsi
    public zfg i() {
        return this.i;
    }

    public Integer j() {
        return Integer.valueOf(this.e);
    }
}
