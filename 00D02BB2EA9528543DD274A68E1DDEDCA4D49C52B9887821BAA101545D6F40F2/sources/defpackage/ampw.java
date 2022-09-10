package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ampw  reason: default package */
/* loaded from: classes.dex */
public final class ampw {
    public static final dcqe a = dcqe.c("ampw");
    public final amqk b = new amqk();
    public final Map<ampt, Byte> c = dcjz.d();
    public final Map<ampu, Byte> d = dcjz.d();
    public final Map<ampu, Byte> e = dcjz.d();
    public final Map<ampv, Byte> f = dcjz.d();
    public final List<amqj> g = dchl.a();
    public final List<bnrp> h = dchl.a();
    public final List<bnrp> i = dchl.a();
    public final List<amql> j = dchl.a();
    private final Map<ampv, Integer> k = dcjz.d();

    public static <KeyT> byte b(Map<KeyT, Byte> map, KeyT keyt) {
        if (!map.containsKey(keyt)) {
            return (byte) 0;
        }
        return map.get(keyt).byteValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h(amql amqlVar, alxo alxoVar, boolean z) {
        boolean z2 = false;
        int i = -1;
        if (z) {
            if (alxoVar.j || !alxoVar.g()) {
                z2 = true;
            }
            if (!z2) {
                i = alxoVar.j();
            }
            amqlVar.a = i;
            amqlVar.b = z2;
            amqlVar.c = null;
            return true;
        }
        boolean z3 = alxoVar.i;
        int i2 = alxoVar.E;
        if (!z3 && i2 != amqlVar.d) {
            amqlVar.d = i2;
            return false;
        }
        float[] fArr = alxoVar.D;
        amqlVar.a = -1;
        amqlVar.b = z3;
        amqlVar.c = fArr;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Incorrect return type in method signature: <KeyT:Ljava/lang/Object;>(TKeyT;Ljava/util/Map<TKeyT;Ljava/lang/Byte;>;I)Ljava/lang/Object; */
    public static int i(Object obj, Map map, int i) {
        if (map.containsKey(obj)) {
            return 2;
        }
        if (map.size() >= i) {
            return 3;
        }
        map.put(obj, Byte.valueOf((byte) map.size()));
        return 1;
    }

    public final void a(@dzsi alxs alxsVar, @dzsi alwn alwnVar) {
        amqk amqkVar = this.b;
        amqkVar.b = alxsVar;
        amqkVar.c = alwnVar;
    }

    public final boolean c() {
        Iterator<ampv> it = this.k.keySet().iterator();
        boolean z = true;
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            ampv next = it.next();
            int i = this.b.a(next.b, next.c).E;
            if (i == this.k.get(next).intValue()) {
                z2 = true;
            }
            z &= z2;
            this.k.put(next, Integer.valueOf(i));
        }
        return true == z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(int r14) {
        /*
            r13 = this;
            java.util.Map<ampt, java.lang.Byte> r0 = r13.c
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = 1
            r2 = 1
        Lc:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto La9
            java.lang.Object r3 = r0.next()
            ampt r3 = (defpackage.ampt) r3
            java.util.Map<ampt, java.lang.Byte> r4 = r13.c
            java.lang.Object r4 = r4.get(r3)
            java.lang.Byte r4 = (java.lang.Byte) r4
            byte r4 = r4.byteValue()
            alwy r5 = r3.b
            boolean r6 = r5.a()
            if (r6 == 0) goto L2e
            r6 = r14
            goto L30
        L2e:
            int r6 = r3.c
        L30:
            amqk r7 = r13.b
            alxo r5 = r7.a(r5, r6)
            java.util.List<amqj> r6 = r13.g
            java.lang.Object r6 = r6.get(r4)
            amqj r6 = (defpackage.amqj) r6
            java.lang.Integer r6 = r6.f
            if (r6 != 0) goto L52
            java.util.List<amqj> r6 = r13.g
            java.lang.Object r6 = r6.get(r4)
            amqj r6 = (defpackage.amqj) r6
            int r7 = r5.E
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.f = r7
        L52:
            altv r3 = r3.a
            r6 = 0
            if (r3 == 0) goto L67
            int r3 = r3.b
            if (r3 <= 0) goto L60
            r3 = 1862270976(0x6f000000, float:3.9614081E28)
            r10 = 1862270976(0x6f000000, float:3.9614081E28)
            goto L68
        L60:
            if (r3 >= 0) goto L67
            r3 = -872415232(0xffffffffcc000000, float:-3.3554432E7)
            r10 = -872415232(0xffffffffcc000000, float:-3.3554432E7)
            goto L68
        L67:
            r10 = 0
        L68:
            java.util.List<amqj> r3 = r13.g
            java.lang.Object r3 = r3.get(r4)
            amqj r3 = (defpackage.amqj) r3
            boolean r4 = defpackage.ampa.g(r5)
            r4 = r4 ^ r1
            boolean r11 = r5.e
            if (r11 == 0) goto L7b
            r8 = 0
            goto L7e
        L7b:
            int r7 = r5.k
            r8 = r7
        L7e:
            if (r4 == 0) goto L82
            r9 = 0
            goto L89
        L82:
            alxl[] r7 = r5.n
            r7 = r7[r6]
            int r7 = r7.a
            r9 = r7
        L89:
            r7 = r3
            r12 = r4
            r7.a(r8, r9, r10, r11, r12)
            int r7 = r5.E
            if (r4 == 0) goto L99
            boolean r4 = r5.e
            if (r4 != 0) goto L97
            goto L99
        L97:
            r6 = 1
            goto La6
        L99:
            java.lang.Integer r3 = r3.f
            if (r3 != 0) goto L9f
            r3 = 0
            goto La3
        L9f:
            int r3 = r3.intValue()
        La3:
            if (r7 != r3) goto La6
            goto L97
        La6:
            r2 = r2 & r6
            goto Lc
        La9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ampw.d(int):boolean");
    }

    public final boolean e(List<bnrp> list, Map<ampu, Byte> map, int i) {
        for (ampu ampuVar : map.keySet()) {
            byte byteValue = map.get(ampuVar).byteValue();
            alwy alwyVar = ampuVar.b;
            alxo a2 = this.b.a(alwyVar, alwyVar.a() ? i : ampuVar.c);
            if (!list.get(byteValue).d.a()) {
                list.get(byteValue).b(a2.E);
            }
            bnrp bnrpVar = list.get(byteValue);
            boolean z = ampuVar.a;
            int i2 = a2.l;
            int i3 = a2.m;
            boolean z2 = a2.h || !a2.e();
            int i4 = a2.E;
            if (!z2 && i4 != bnrpVar.d.c(0).intValue()) {
                bnrpVar.b(i4);
                return false;
            } else if (!z) {
                if (true == z2) {
                    i2 = 0;
                }
                if (z2) {
                    i3 = 0;
                } else if (!a2.f()) {
                    i3 = i2;
                }
                bnrpVar.a(i3, i2, z2);
            } else {
                if (z2) {
                    i2 = 0;
                } else if (a2.f()) {
                    i2 = i3;
                }
                bnrpVar.a(i2, 0, z2);
            }
        }
        return true;
    }

    public final boolean f(int i) {
        return e(this.h, this.d, i);
    }

    public final boolean g(int i) {
        return e(this.i, this.e, i);
    }

    public final int j(ampt amptVar) {
        int i = i(amptVar, this.c, 64);
        if (i == 1) {
            this.g.add(new amqj());
        } else if (i == 3) {
            bvoo.h("Number of area styles exceeds the maximum of 64", new Object[0]);
        }
        return i;
    }
}
