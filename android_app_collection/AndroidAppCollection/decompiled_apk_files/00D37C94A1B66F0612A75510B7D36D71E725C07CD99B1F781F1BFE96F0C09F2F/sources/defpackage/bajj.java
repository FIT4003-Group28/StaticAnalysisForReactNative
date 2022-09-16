package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: bajj  reason: default package */
/* loaded from: classes2.dex */
public final class bajj extends baiz {
    private static final long serialVersionUID = -861407383323710522L;
    private static final ConcurrentHashMap H = new ConcurrentHashMap();
    public static final bajj G = aj(baht.a);

    private bajj(bahl bahlVar, int i) {
        super(bahlVar, i);
    }

    public static bajj aj(baht bahtVar) {
        return ak(bahtVar, 4);
    }

    public static bajj ak(baht bahtVar, int i) {
        bajj bajjVar;
        if (bahtVar == null) {
            bahtVar = baht.k();
        }
        ConcurrentHashMap concurrentHashMap = H;
        bajj[] bajjVarArr = (bajj[]) concurrentHashMap.get(bahtVar);
        if (bajjVarArr == null) {
            bajjVarArr = new bajj[7];
            bajj[] bajjVarArr2 = (bajj[]) concurrentHashMap.putIfAbsent(bahtVar, bajjVarArr);
            if (bajjVarArr2 != null) {
                bajjVarArr = bajjVarArr2;
            }
        }
        int i2 = i - 1;
        try {
            bajj bajjVar2 = bajjVarArr[i2];
            if (bajjVar2 == null) {
                synchronized (bajjVarArr) {
                    bajjVar2 = bajjVarArr[i2];
                    if (bajjVar2 == null) {
                        if (bahtVar == baht.a) {
                            bajjVar = new bajj(null, i);
                        } else {
                            bajjVar = new bajj(bajp.O(ak(baht.a, i), bahtVar), i);
                        }
                        bajjVarArr[i2] = bajjVar;
                        bajjVar2 = bajjVar;
                    }
                }
            }
            return bajjVar2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            StringBuilder sb = new StringBuilder(43);
            sb.append("Invalid min days in first week: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private Object readResolve() {
        bahl bahlVar = this.a;
        int i = ((baiw) this).F;
        if (i == 0) {
            i = 4;
        }
        if (bahlVar == null) {
            return ak(baht.a, i);
        }
        return ak(bahlVar.z(), i);
    }

    @Override // defpackage.baiw, defpackage.bais
    protected final void N(bair bairVar) {
        if (this.a == null) {
            bairVar.a = baiw.n;
            bairVar.b = baiw.o;
            bairVar.c = baiw.p;
            bairVar.d = baiw.q;
            bairVar.e = baiw.r;
            bairVar.f = baiw.s;
            bairVar.g = baiw.t;
            bairVar.m = baiw.u;
            bairVar.n = baiw.v;
            bairVar.o = baiw.w;
            bairVar.p = baiw.x;
            bairVar.q = baiw.y;
            bairVar.r = baiw.z;
            bairVar.s = baiw.A;
            bairVar.u = baiw.B;
            bairVar.t = baiw.C;
            bairVar.v = baiw.D;
            bairVar.w = baiw.E;
            bairVar.E = new bajd(this);
            bairVar.F = new baji(bairVar.E, this);
            bahn bahnVar = bairVar.F;
            bairVar.H = new bajv(new baka(bahnVar, bahnVar == null ? null : bahnVar.o(), 99), bahp.e);
            bajv bajvVar = (bajv) bairVar.H;
            bairVar.G = new baka(new bake(bajvVar, bajvVar.g), bahp.f);
            bairVar.I = new bajf(this);
            bairVar.x = new baje(this, bairVar.f);
            bairVar.y = new baix(this, bairVar.f);
            bairVar.z = new baiy(this, bairVar.f);
            bairVar.D = new bajh(this);
            bairVar.B = new bajc(this);
            bairVar.A = new bajb(this, bairVar.g);
            bairVar.C = new baka(new bake(bairVar.B, bahp.k), bahp.k);
            bairVar.j = bairVar.E.p();
            bairVar.k = bairVar.H.p();
            bairVar.i = bairVar.D.p();
            bairVar.h = bairVar.B.p();
        }
    }

    @Override // defpackage.bahl
    public final bahl a() {
        return G;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (ai(r7) != false) goto L4;
     */
    @Override // defpackage.baiw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long aa(int r7) {
        /*
            r6 = this;
            int r0 = r7 / 100
            if (r7 >= 0) goto L11
            int r1 = r7 + 3
            int r1 = r1 >> 2
            int r1 = r1 - r0
            int r0 = r0 + 3
            int r0 = r0 >> 2
            int r1 = r1 + r0
        Le:
            int r1 = r1 + (-1)
            goto L1e
        L11:
            int r1 = r7 >> 2
            int r1 = r1 - r0
            int r0 = r0 >> 2
            int r1 = r1 + r0
            boolean r0 = r6.ai(r7)
            if (r0 == 0) goto L1e
            goto Le
        L1e:
            long r2 = (long) r7
            r4 = 365(0x16d, double:1.803E-321)
            long r2 = r2 * r4
            r7 = -719527(0xfffffffffff50559, float:NaN)
            int r1 = r1 + r7
            long r0 = (long) r1
            long r2 = r2 + r0
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 * r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bajj.aa(int):long");
    }

    @Override // defpackage.baiw
    public final boolean ai(int i) {
        return (i & 3) == 0 && (i % 100 != 0 || i % 400 == 0);
    }

    @Override // defpackage.bahl
    public final bahl b(baht bahtVar) {
        if (bahtVar == null) {
            bahtVar = baht.k();
        }
        return bahtVar == z() ? this : aj(bahtVar);
    }
}
