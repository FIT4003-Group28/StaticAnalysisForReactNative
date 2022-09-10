package defpackage;

import com.google.android.apps.gmm.location.rawlocationevents.HardBrakeEvent;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.Random;
/* compiled from: PG */
/* renamed from: ahlu  reason: default package */
/* loaded from: classes2.dex */
public final class ahlu {
    public duue a;
    public float b;
    public long c;
    public float d;
    public long e;
    public dcba<ahlv> f;
    public long g;
    public dcba<ahlv> h;
    public long i;
    @dzsi
    public ahlv j;
    public final ahlt k;
    public final ahlt l;
    public dcba<ahlv> m;
    public long n;
    public dcba<ahlv> o;
    public long p;
    public dcba<ahlv> q;
    public long r;
    public final ahlt s;
    private final Random t;

    public ahlu() {
        duue duueVar = duue.g;
        this.a = duueVar;
        this.b = 0.0f;
        this.c = 0L;
        this.g = 0L;
        this.p = 0L;
        this.n = 0L;
        this.r = 0L;
        this.i = 0L;
        this.f = b(duueVar);
        this.o = b(this.a);
        this.m = h(this.a);
        this.q = b(this.a);
        this.h = b(this.a);
        this.k = ahlt.d();
        this.s = ahlt.d();
        this.l = ahlt.d();
        this.t = new Random();
    }

    public static dcba<ahlv> b(duue duueVar) {
        return dcba.a((duueVar.d / Math.round(1000.0f / duueVar.c)) + 1);
    }

    public static dcba<ahlv> h(duue duueVar) {
        return dcba.a((duueVar.d / 500) + 1);
    }

    @dzsi
    private final Long i() {
        long j;
        float f = this.b;
        duue duueVar = this.a;
        float f2 = duueVar.e;
        if (f > f2 && this.d > duueVar.f) {
            j = Math.min(this.c, this.e);
        } else if (f > f2) {
            j = this.c;
        } else if (this.d <= duueVar.f) {
            return null;
        } else {
            j = this.e;
        }
        return Long.valueOf(j);
    }

    public final HardBrakeEvent a() {
        ddtb bZ = ddtk.f.bZ();
        Long i = i();
        if (i != null) {
            long longValue = i.longValue();
            Iterator<ahlv> it = this.f.iterator();
            while (it.hasNext()) {
                ahlv next = it.next();
                ddte bZ2 = ddtf.d.bZ();
                int d = (int) deba.d(next.a() - longValue, RoundingMode.HALF_UP);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddtf ddtfVar = (ddtf) bZ2.b;
                ddtfVar.a |= 1;
                ddtfVar.b = d;
                ddti bZ3 = ddtj.e.bZ();
                float f = next.b()[0];
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                ddtj ddtjVar = (ddtj) bZ3.b;
                ddtjVar.a |= 1;
                ddtjVar.b = f;
                float f2 = next.b()[1];
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                ddtj ddtjVar2 = (ddtj) bZ3.b;
                ddtjVar2.a |= 2;
                ddtjVar2.c = f2;
                float f3 = next.b()[2];
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                ddtj ddtjVar3 = (ddtj) bZ3.b;
                ddtjVar3.a |= 4;
                ddtjVar3.d = f3;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddtf ddtfVar2 = (ddtf) bZ2.b;
                ddtj bK = bZ3.bK();
                bK.getClass();
                ddtfVar2.c = bK;
                ddtfVar2.a = 2 | ddtfVar2.a;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddtk ddtkVar = (ddtk) bZ.b;
                ddtf bK2 = bZ2.bK();
                bK2.getClass();
                dsrj<ddtf> dsrjVar = ddtkVar.a;
                if (!dsrjVar.a()) {
                    ddtkVar.a = dsqw.cl(dsrjVar);
                }
                ddtkVar.a.add(bK2);
            }
            Iterator<ahlv> it2 = this.q.iterator();
            while (it2.hasNext()) {
                ahlv next2 = it2.next();
                ddtc bZ4 = ddtd.d.bZ();
                int d2 = (int) deba.d(next2.a() - longValue, RoundingMode.HALF_UP);
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                ddtd ddtdVar = (ddtd) bZ4.b;
                ddtdVar.a |= 1;
                ddtdVar.b = d2;
                ddti bZ5 = ddtj.e.bZ();
                float f4 = next2.b()[0];
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                ddtj ddtjVar4 = (ddtj) bZ5.b;
                ddtjVar4.a |= 1;
                ddtjVar4.b = f4;
                float f5 = next2.b()[1];
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                ddtj ddtjVar5 = (ddtj) bZ5.b;
                ddtjVar5.a |= 2;
                ddtjVar5.c = f5;
                float f6 = next2.b()[2];
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                ddtj ddtjVar6 = (ddtj) bZ5.b;
                ddtjVar6.a |= 4;
                ddtjVar6.d = f6;
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                ddtd ddtdVar2 = (ddtd) bZ4.b;
                ddtj bK3 = bZ5.bK();
                bK3.getClass();
                ddtdVar2.c = bK3;
                ddtdVar2.a |= 2;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddtk ddtkVar2 = (ddtk) bZ.b;
                ddtd bK4 = bZ4.bK();
                bK4.getClass();
                dsrj<ddtd> dsrjVar2 = ddtkVar2.b;
                if (!dsrjVar2.a()) {
                    ddtkVar2.b = dsqw.cl(dsrjVar2);
                }
                ddtkVar2.b.add(bK4);
            }
            Iterator<ahlv> it3 = this.m.iterator();
            while (it3.hasNext()) {
                ahlv next3 = it3.next();
                ddtg bZ6 = ddth.d.bZ();
                int d3 = (int) deba.d(next3.a() - longValue, RoundingMode.HALF_UP);
                if (bZ6.c) {
                    bZ6.bF();
                    bZ6.c = false;
                }
                ddth ddthVar = (ddth) bZ6.b;
                ddthVar.a |= 1;
                ddthVar.b = d3;
                float f7 = next3.b()[0];
                if (bZ6.c) {
                    bZ6.bF();
                    bZ6.c = false;
                }
                ddth ddthVar2 = (ddth) bZ6.b;
                ddthVar2.a |= 2;
                ddthVar2.c = f7;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddtk ddtkVar3 = (ddtk) bZ.b;
                ddth bK5 = bZ6.bK();
                bK5.getClass();
                dsrj<ddth> dsrjVar3 = ddtkVar3.e;
                if (!dsrjVar3.a()) {
                    ddtkVar3.e = dsqw.cl(dsrjVar3);
                }
                ddtkVar3.e.add(bK5);
            }
            Iterator<ahlv> it4 = this.o.iterator();
            while (it4.hasNext()) {
                ahlv next4 = it4.next();
                ddtg bZ7 = ddth.d.bZ();
                int d4 = (int) deba.d(next4.a() - longValue, RoundingMode.HALF_UP);
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                ddth ddthVar3 = (ddth) bZ7.b;
                ddthVar3.a |= 1;
                ddthVar3.b = d4;
                float f8 = next4.b()[0];
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                ddth ddthVar4 = (ddth) bZ7.b;
                ddthVar4.a |= 2;
                ddthVar4.c = f8;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddtk ddtkVar4 = (ddtk) bZ.b;
                ddth bK6 = bZ7.bK();
                bK6.getClass();
                dsrj<ddth> dsrjVar4 = ddtkVar4.d;
                if (!dsrjVar4.a()) {
                    ddtkVar4.d = dsqw.cl(dsrjVar4);
                }
                ddtkVar4.d.add(bK6);
            }
            Iterator<ahlv> it5 = this.h.iterator();
            while (it5.hasNext()) {
                ahlv next5 = it5.next();
                ddte bZ8 = ddtf.d.bZ();
                int d5 = (int) deba.d(next5.a() - longValue, RoundingMode.HALF_UP);
                if (bZ8.c) {
                    bZ8.bF();
                    bZ8.c = false;
                }
                ddtf ddtfVar3 = (ddtf) bZ8.b;
                ddtfVar3.a |= 1;
                ddtfVar3.b = d5;
                ddti bZ9 = ddtj.e.bZ();
                float f9 = next5.b()[0];
                if (bZ9.c) {
                    bZ9.bF();
                    bZ9.c = false;
                }
                ddtj ddtjVar7 = (ddtj) bZ9.b;
                ddtjVar7.a |= 1;
                ddtjVar7.b = f9;
                float f10 = next5.b()[1];
                if (bZ9.c) {
                    bZ9.bF();
                    bZ9.c = false;
                }
                ddtj ddtjVar8 = (ddtj) bZ9.b;
                ddtjVar8.a |= 2;
                ddtjVar8.c = f10;
                float f11 = next5.b()[2];
                if (bZ9.c) {
                    bZ9.bF();
                    bZ9.c = false;
                }
                ddtj ddtjVar9 = (ddtj) bZ9.b;
                ddtjVar9.a |= 4;
                ddtjVar9.d = f11;
                if (bZ8.c) {
                    bZ8.bF();
                    bZ8.c = false;
                }
                ddtf ddtfVar4 = (ddtf) bZ8.b;
                ddtj bK7 = bZ9.bK();
                bK7.getClass();
                ddtfVar4.c = bK7;
                ddtfVar4.a |= 2;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddtk ddtkVar5 = (ddtk) bZ.b;
                ddtf bK8 = bZ8.bK();
                bK8.getClass();
                dsrj<ddtf> dsrjVar5 = ddtkVar5.c;
                if (!dsrjVar5.a()) {
                    ddtkVar5.c = dsqw.cl(dsrjVar5);
                }
                ddtkVar5.c.add(bK8);
            }
            return new HardBrakeEvent(longValue / 1000000, bZ.bK());
        }
        throw new IllegalStateException("Attempted to create a HardBrakeEvent when no peak has been detected.");
    }

    public final int c() {
        return Math.round(1000000.0f / this.a.c);
    }

    public final long d() {
        return Math.round(1.0E9f / this.a.c);
    }

    public final void e() {
        this.b = 0.0f;
        this.c = 0L;
        this.d = 0.0f;
        this.e = 0L;
        this.f.clear();
        this.q.clear();
        this.h.clear();
        this.j = null;
    }

    public final boolean f() {
        Long i = i();
        if (i != null) {
            long c = (decn.c(this.g, this.p, this.i, this.r) - i.longValue()) / 1000000;
            if (c + c >= this.a.d) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        return (!this.o.isEmpty() || !this.h.isEmpty()) ? this.t.nextFloat() < this.a.b : this.t.nextFloat() < this.a.a;
    }
}
