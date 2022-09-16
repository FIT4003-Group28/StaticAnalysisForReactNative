package defpackage;

import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aifk  reason: default package */
/* loaded from: classes2.dex */
public final class aifk implements aifa {
    private static final LinearInterpolator h = new LinearInterpolator();
    private static final eia i = new eia(0.25d);
    public final akti a;
    public final List<aify> b;
    public final Object c;
    public final aifp d;
    @dzsi
    public final Runnable e;
    @dzsi
    public aifo f;
    public boolean g;
    private final aigd j = new aifc(this);
    private final akvo<aktd> k;
    private final akth l;
    private final aigf m;
    private final cqat n;
    @dzsi
    private final aifj o;
    private final akty p;
    private aifq q;

    public aifk(aigf aigfVar, cqat cqatVar, akty aktyVar, dmpn dmpnVar, aifq aifqVar, List<aify> list, @dzsi aifj aifjVar, @dzsi Runnable runnable) {
        aifd aifdVar = new aifd(this);
        this.k = aifdVar;
        this.l = new aife(this);
        this.c = new Object();
        this.m = aigfVar;
        this.n = cqatVar;
        this.p = aktyVar;
        akti c = aktyVar.c(dmpnVar, dmti.WORLD_ENCODING_LAT_LNG_E7);
        this.a = c;
        this.b = list;
        this.d = aifqVar.i();
        this.q = aifqVar;
        this.g = false;
        this.o = aifjVar;
        this.e = runnable;
        aktyVar.f(c);
        c.Pt(aifdVar);
        c.a(g());
        for (aify aifyVar : list) {
            aifyVar.a();
        }
        aigfVar.a(this.j);
    }

    @Override // defpackage.aifa
    public final aifq a() {
        return this.d.i();
    }

    @Override // defpackage.aifa
    public final aifq b() {
        return this.q;
    }

    @Override // defpackage.aifa
    public final void c() {
        synchronized (this.c) {
            hashCode();
            this.g = true;
            this.f = null;
            this.a.d();
            this.p.g(this.a);
            this.p.e(this.a);
            aifj aifjVar = this.o;
            if (aifjVar != null) {
                for (akuh akuhVar : aifjVar.a()) {
                    aifjVar.b().d(akuhVar);
                }
            }
            for (aify aifyVar : this.b) {
                aifyVar.c();
            }
            this.m.c(this.j);
        }
    }

    @Override // defpackage.aifa
    public final void d(aifq aifqVar, int i2) {
        e(aifqVar, 1, 1500);
    }

    @Override // defpackage.aifa
    public final void e(aifq aifqVar, int i2, int i3) {
        f(aifqVar, 1, i3, false);
    }

    @Override // defpackage.aifa
    public final void f(aifq aifqVar, int i2, int i3, boolean z) {
        dbsk.m(a().d().equals(aifqVar.d()), "Cannot change rotation mode of renderable.");
        if (this.q.equals(aifqVar) || this.g) {
            return;
        }
        this.q = aifqVar;
        synchronized (this.c) {
            aifo aifoVar = this.f;
            if (i2 != 2) {
                synchronized (this.c) {
                    aifo aifoVar2 = this.f;
                    if (aifoVar2 != null && !z) {
                        aifoVar2.e(h(aifoVar2.a(), aifqVar, i3, i2));
                    }
                    aifo h2 = h(a(), aifqVar, i3, i2);
                    this.f = h2;
                    h2.b();
                }
            } else {
                synchronized (this.c) {
                    aifp i4 = aifqVar.i();
                    i4.b(0.5f);
                    aifq i5 = i4.i();
                    aifp i6 = aifqVar.i();
                    i6.b(1.0f);
                    aifq i7 = i6.i();
                    aifo h3 = h(this.d.i(), i5, i3, 1);
                    aifo aifoVar3 = this.f;
                    if (aifoVar3 == null) {
                        this.f = h3;
                    } else {
                        aifoVar3.e(h3);
                    }
                    for (int i8 = 0; i8 < 10; i8++) {
                        aifo h4 = h(i5, i7, i3, 1);
                        h3.e(h4);
                        h3 = h(i7, i5, i3, 1);
                        h4.e(h3);
                    }
                    h3.e(h(i5, aifqVar, i3, 1));
                }
            }
            if (aifoVar == null) {
                hashCode();
                this.a.c(this.l);
            }
        }
    }

    public final akwf g() {
        for (aify aifyVar : this.b) {
            aifyVar.b(this.d.i());
        }
        akwa bZ = akwf.h.bZ();
        dhjy bZ2 = dhjz.e.bZ();
        double k = this.d.h().k();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhjz dhjzVar = (dhjz) bZ2.b;
        dhjzVar.a |= 2;
        dhjzVar.c = k;
        double o = this.d.h().o();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhjz dhjzVar2 = (dhjz) bZ2.b;
        dhjzVar2.a |= 1;
        dhjzVar2.b = o;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        akwf akwfVar = (akwf) bZ.b;
        dhjz bK = bZ2.bK();
        bK.getClass();
        akwfVar.b = bK;
        akwfVar.a |= 1;
        Float f = ((aiep) this.d).a;
        if (f != null) {
            float floatValue = f.floatValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            akwf akwfVar2 = (akwf) bZ.b;
            akwfVar2.a |= 2;
            akwfVar2.c = floatValue;
            Float f2 = ((aiep) this.d).b;
            if (f2 != null) {
                float floatValue2 = f2.floatValue();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                akwf akwfVar3 = (akwf) bZ.b;
                akwfVar3.a |= 4;
                akwfVar3.d = floatValue2;
                akwb bZ3 = akwe.d.bZ();
                Float f3 = ((aiep) this.d).d;
                if (f3 != null) {
                    float floatValue3 = f3.floatValue();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    akwe akweVar = (akwe) bZ3.b;
                    akweVar.a |= 1;
                    akweVar.b = floatValue3;
                    akwd akwdVar = ((aiep) this.d).c;
                    if (akwdVar == null) {
                        throw new IllegalStateException("Property \"rotationMode\" has not been set");
                    }
                    akwe akweVar2 = (akwe) bZ3.b;
                    akweVar2.c = akwdVar.d;
                    akweVar2.a |= 2;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    akwf akwfVar4 = (akwf) bZ.b;
                    akwe bK2 = bZ3.bK();
                    bK2.getClass();
                    akwfVar4.e = bK2;
                    akwfVar4.a |= 8;
                    return bZ.bK();
                }
                throw new IllegalStateException("Property \"rotation\" has not been set");
            }
            throw new IllegalStateException("Property \"opacity\" has not been set");
        }
        throw new IllegalStateException("Property \"scale\" has not been set");
    }

    final aifo h(aifq aifqVar, aifq aifqVar2, int i2, int i3) {
        TimeInterpolator timeInterpolator;
        aifn[] aifnVarArr = new aifn[4];
        float f = i2;
        long j = (int) f;
        if (i3 == 3) {
            timeInterpolator = h;
        } else if (i3 != 4) {
            timeInterpolator = irf.a;
        } else {
            timeInterpolator = i;
        }
        aifnVarArr[0] = new aiff(j, timeInterpolator);
        aifnVarArr[1] = new aifg((int) (0.2f * f), irf.a);
        long j2 = (int) (f * 0.6666667f);
        aifnVarArr[2] = new aifh(j2, irf.a);
        aifnVarArr[3] = new aifi(j2, i3 == 3 ? h : irf.a);
        ArrayList b = dchl.b(aifnVarArr);
        for (aify aifyVar : this.b) {
            b.addAll(aifyVar.e(i2));
        }
        return new aifo(this.n, aifqVar, aifqVar2, dcdc.r(b));
    }
}
