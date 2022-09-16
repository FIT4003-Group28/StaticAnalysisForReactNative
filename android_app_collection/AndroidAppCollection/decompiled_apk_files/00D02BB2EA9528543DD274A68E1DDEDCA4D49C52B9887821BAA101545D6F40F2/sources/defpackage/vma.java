package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: vma  reason: default package */
/* loaded from: classes7.dex */
public final class vma {
    static final long a = TimeUnit.DAYS.toMillis(21);
    static final long b = TimeUnit.HOURS.toMillis(23);
    public final bvjj c;
    public final vlz d;
    private final dxio<akfa> e;
    private final cqat f;

    public vma(bvjj bvjjVar, dxio<akfa> dxioVar, cqat cqatVar) {
        vlz vlzVar = new vlz(dczd.a, bvjjVar.z(bvjk.gf, ""));
        this.c = bvjjVar;
        this.e = dxioVar;
        this.f = cqatVar;
        this.d = vlzVar;
    }

    private final boolean e(vvj vvjVar) {
        return vvjVar.a() && this.f.b() - vvjVar.b() > a;
    }

    public final void a(amvh amvhVar) {
        vvh vvhVar;
        String a2 = this.d.a(amvhVar);
        vvl d = d();
        if (a2 == null) {
            return;
        }
        vvi vviVar = (vvi) Collections.unmodifiableMap(d.a).get(a2);
        if (vviVar != null && vviVar.d) {
            return;
        }
        if (vviVar == null) {
            vvhVar = vvi.f.bZ();
        } else {
            dsqp dsqpVar = (dsqp) vviVar.cu(5);
            dsqpVar.bC(vviVar);
            vvhVar = (vvh) dsqpVar;
        }
        if (e(vvhVar)) {
            if (vvhVar.c) {
                vvhVar.bF();
                vvhVar.c = false;
            }
            vvi vviVar2 = (vvi) vvhVar.b;
            vviVar2.a |= 2;
            vviVar2.c = 1L;
            long b2 = this.f.b();
            if (vvhVar.c) {
                vvhVar.bF();
                vvhVar.c = false;
            }
            vvi vviVar3 = (vvi) vvhVar.b;
            vviVar3.a |= 8;
            vviVar3.e = b2;
        } else if ((((vvi) vvhVar.b).a & 8) == 0 || this.f.b() - ((vvi) vvhVar.b).e > b) {
            long j = ((vvi) vvhVar.b).c + 1;
            if (vvhVar.c) {
                vvhVar.bF();
                vvhVar.c = false;
            }
            vvi vviVar4 = (vvi) vvhVar.b;
            vviVar4.a |= 2;
            vviVar4.c = j;
            long b3 = this.f.b();
            if (vvhVar.c) {
                vvhVar.bF();
                vvhVar.c = false;
            }
            vvi vviVar5 = (vvi) vvhVar.b;
            vviVar5.a |= 8;
            vviVar5.e = b3;
        }
        long b4 = this.f.b();
        if (vvhVar.c) {
            vvhVar.bF();
            vvhVar.c = false;
        }
        vvi vviVar6 = (vvi) vvhVar.b;
        vviVar6.a |= 1;
        vviVar6.b = b4;
        c(d, a2, vvhVar.bK());
    }

    public final void b(vvl vvlVar, vvi vviVar, String str) {
        dsqp dsqpVar = (dsqp) vviVar.cu(5);
        dsqpVar.bC(vviVar);
        vvh vvhVar = (vvh) dsqpVar;
        if (vvhVar.c) {
            vvhVar.bF();
            vvhVar.c = false;
        }
        vvi.c((vvi) vvhVar.b);
        if (vvhVar.c) {
            vvhVar.bF();
            vvhVar.c = false;
        }
        vvi vviVar2 = (vvi) vvhVar.b;
        vviVar2.a &= -3;
        vviVar2.c = 0L;
        c(vvlVar, str, vvhVar.bK());
    }

    public final void c(vvl vvlVar, String str, vvi vviVar) {
        vvl bK;
        dsqp dsqpVar = (dsqp) vvlVar.cu(5);
        dsqpVar.bC(vvlVar);
        vvg vvgVar = (vvg) dsqpVar;
        str.getClass();
        vviVar.getClass();
        if (vvgVar.c) {
            vvgVar.bF();
            vvgVar.c = false;
        }
        vvl vvlVar2 = vvl.b;
        ((vvl) vvgVar.b).b().put(str, vviVar);
        HashMap hashMap = new HashMap();
        for (String str2 : Collections.unmodifiableMap(Collections.unmodifiableMap(((vvl) vvgVar.b).a)).keySet()) {
            vvi vviVar2 = (vvi) Collections.unmodifiableMap(Collections.unmodifiableMap(((vvl) vvgVar.b).a)).get(str2);
            if (vviVar2 != null && (vviVar2.d || !e(vviVar2))) {
                hashMap.put(str2, vviVar2);
            }
        }
        if (hashMap.size() < 1000) {
            vvg bZ = vvl.b.bZ();
            bZ.a(hashMap);
            bK = bZ.bK();
        } else {
            long j = Long.MAX_VALUE;
            String str3 = null;
            for (String str4 : hashMap.keySet()) {
                if (((vvi) hashMap.get(str4)).b < j) {
                    j = ((vvi) hashMap.get(str4)).b;
                    str3 = str4;
                }
            }
            if (str3 != null) {
                hashMap.remove(str3);
            }
            vvg bZ2 = vvl.b.bZ();
            bZ2.a(hashMap);
            bK = bZ2.bK();
        }
        this.c.am(bvjk.gF, this.e.a().j(), bK);
    }

    public final vvl d() {
        return (vvl) this.c.N(bvjk.gF, this.e.a().j(), (dssr) vvl.b.cu(7), vvl.b);
    }
}
