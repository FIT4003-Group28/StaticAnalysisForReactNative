package defpackage;

import java.util.Iterator;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: awiw  reason: default package */
/* loaded from: classes3.dex */
public final class awiw implements avjn {
    static final bvjk b = bvjk.eC;
    public final awmf c;
    public final akfa d;
    public final dehq e;
    public final bvjj f;
    private final cqat g;
    private final dxio<avkd> h;
    private final Object i = new Object();

    public awiw(cqat cqatVar, awmf awmfVar, akfa akfaVar, dehq dehqVar, bvjj bvjjVar, dxio<avkd> dxioVar) {
        this.g = cqatVar;
        this.c = awmfVar;
        this.d = akfaVar;
        this.e = dehqVar;
        this.f = bvjjVar;
        this.h = dxioVar;
    }

    private final awhw d(@dzsi btlu btluVar, awhw awhwVar) {
        if (a.equals(btluVar)) {
            return (awhw) this.f.L(b, (dssr) awhw.b.cu(7), awhwVar);
        }
        return (awhw) this.f.N(b, btluVar, (dssr) awhw.b.cu(7), awhwVar);
    }

    @dzsi
    private final awiv e(@dzsi btlu btluVar) {
        awhw d = d(btluVar, null);
        if (d != null) {
            return new awiv(this, btluVar, d);
        }
        return null;
    }

    @Override // defpackage.avjn
    public final void a(String str, @dzsi btlu btluVar, long j, avjy avjyVar) {
        synchronized (this.i) {
            awiv awivVar = new awiv(this, btluVar, d(btluVar, awhw.b));
            awhu bZ = awhv.e.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            awhv awhvVar = (awhv) bZ.b;
            str.getClass();
            int i = awhvVar.a | 1;
            awhvVar.a = i;
            awhvVar.b = str;
            avjyVar.getClass();
            awhvVar.c = avjyVar;
            awhvVar.a = i | 2;
            long b2 = this.g.b() + j;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            awhv awhvVar2 = (awhv) bZ.b;
            awhvVar2.a |= 4;
            awhvVar2.d = b2;
            awhv bK = bZ.bK();
            awivVar.a.put(bK.b, bK);
            awivVar.a();
        }
    }

    @Override // defpackage.avjn
    public final void b(Pattern pattern, btlu btluVar) {
        synchronized (this.i) {
            awiv e = e(btluVar);
            if (e != null) {
                Iterator<String> it = e.a.keySet().iterator();
                while (it.hasNext()) {
                    if (pattern.matcher(it.next()).matches()) {
                        it.remove();
                    }
                }
                e.a();
            }
        }
    }

    public final void c(@dzsi btlu btluVar) {
        dcdc e;
        long b2 = this.g.b();
        synchronized (this.i) {
            e = dcdc.e();
            awiv e2 = e(btluVar);
            if (e2 != null) {
                dccx F = dcdc.F();
                Iterator<awhv> it = e2.a.values().iterator();
                while (it.hasNext()) {
                    awhv next = it.next();
                    if (b2 >= next.d) {
                        it.remove();
                        F.g(next);
                    }
                }
                e = F.f();
                e2.a();
            }
        }
        int size = e.size();
        for (int i = 0; i < size; i++) {
            awhv awhvVar = (awhv) e.get(i);
            String str = awhvVar.b;
            avkd a = this.h.a();
            avjy avjyVar = awhvVar.c;
            if (avjyVar == null) {
                avjyVar = avjy.l;
            }
            a.i(avjyVar);
        }
    }
}
