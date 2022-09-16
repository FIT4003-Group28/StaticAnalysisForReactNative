package defpackage;

import com.google.android.libraries.elements.interfaces.IntersectionCriteria;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
/* compiled from: PG */
/* renamed from: tfy  reason: default package */
/* loaded from: classes4.dex */
public final class tfy {
    private final teb a;

    public tfy(teb tebVar) {
        this.a = tebVar;
    }

    public static int a(aodq aodqVar, axmn axmnVar) {
        int aL;
        aodq aodqVar2;
        int aM;
        int[] iArr;
        int b;
        aodq aodqVar3 = aodqVar;
        axmn axmnVar2 = axmnVar;
        int i = 0;
        if (axmnVar2 == null || axmnVar.aU() == null) {
            return 0;
        }
        int b2 = aodqVar3.b(axmnVar.aU());
        float aG = axmnVar.aG();
        int n = axmnVar.n();
        int aO = axmnVar.aO();
        if (axmnVar.aI() == 0) {
            aL = 0;
        } else {
            int[] iArr2 = new int[axmnVar.aI()];
            for (int i2 = 0; i2 < axmnVar.aI(); i2++) {
                axmu aR = axmnVar2.aR(i2);
                iArr2[i2] = axmu.aG(aodqVar, aR.q(), aR.p(), e(aodqVar3, aR.aI()), e(aodqVar3, aR.aH()));
            }
            aL = axmn.aL(aodqVar3, iArr2);
        }
        if (axmnVar.aP() == 0) {
            aodqVar2 = aodqVar3;
            aM = 0;
        } else {
            int[] iArr3 = new int[axmnVar.aP()];
            int i3 = 0;
            while (i3 < axmnVar.aP()) {
                axnj aS = axmnVar2.aS(i3);
                long q = aS.q();
                long p = aS.p();
                int b3 = aS.aS() == null ? 0 : aodqVar3.b(aS.aS());
                float aH = aS.aH();
                long aP = aS.aP();
                int aM2 = aS.aM();
                int p2 = p(aodqVar3, aS.aU());
                float aI = aS.aI();
                long aQ = aS.aQ();
                int aN = aS.aN();
                boolean aT = aS.aT();
                int aL2 = aS.aL();
                int aJ = aS.aJ();
                if (aS.aR() == null) {
                    iArr = iArr3;
                    b = 0;
                } else {
                    iArr = iArr3;
                    b = aodqVar3.b(aS.aR());
                }
                int[] iArr4 = iArr;
                int i4 = i3;
                iArr4[i4] = axnj.aK(aodqVar, q, p, b3, aH, aP, aM2, p2, aI, aQ, aN, aT, aL2, aJ, b, aS.aO(), aS.aG());
                i3 = i4 + 1;
                aodqVar3 = aodqVar;
                axmnVar2 = axmnVar;
                iArr3 = iArr4;
            }
            aodqVar2 = aodqVar3;
            aM = axmn.aM(aodqVar2, iArr3);
        }
        if (axmnVar.aH() != 0) {
            int[] iArr5 = new int[axmnVar.aH()];
            for (int i5 = 0; i5 < axmnVar.aH(); i5++) {
                aodt aW = axmnVar.aW(i5);
                iArr5[i5] = aodt.o(aodqVar, aW.q(), aW.p(), d(aodqVar2, aW.ar()), aW.n());
            }
            i = axmn.aJ(aodqVar2, iArr5);
        }
        return axmn.aK(aodqVar, b2, aG, n, aO, aL, aM, i, axmnVar.aV(), axmnVar.aQ(), o(aodqVar, axmnVar));
    }

    public static axmn b(axmn axmnVar) {
        int aL;
        float f;
        int i;
        aodq aodqVar;
        int aM;
        int[] iArr;
        int b;
        int aJ;
        int[] iArr2 = null;
        if (axmnVar == null) {
            return null;
        }
        String aU = axmnVar.aU();
        if (aU == null) {
            return axmnVar;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        if (axmnVar.aH() != 0) {
            ArrayList arrayList2 = new ArrayList();
            PriorityQueue priorityQueue = new PriorityQueue(1, fay.q);
            for (int i2 = 0; i2 < axmnVar.aH(); i2++) {
                aodt aW = axmnVar.aW(i2);
                if (aW.p() == 0) {
                    priorityQueue.add(aW);
                } else {
                    arrayList2.add(aW);
                }
            }
            if (priorityQueue.isEmpty()) {
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    aodt aodtVar = (aodt) arrayList2.get(i3);
                    arrayList.add(new tgn(aodtVar, aodtVar.q(), aodtVar.p()));
                }
            } else {
                int size2 = priorityQueue.size();
                int[] iArr3 = new int[size2];
                int i4 = 0;
                while (!priorityQueue.isEmpty()) {
                    aodt aodtVar2 = (aodt) priorityQueue.poll();
                    if (aodtVar2 != null) {
                        iArr3[i4] = (int) aodtVar2.q();
                        arrayList.add(new tgn(aodtVar2, ((int) aodtVar2.q()) + i4, 1L));
                        i4++;
                    }
                }
                iArr2 = i4 < size2 ? Arrays.copyOf(iArr3, i4) : iArr3;
                int size3 = arrayList2.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    aodt aodtVar3 = (aodt) arrayList2.get(i5);
                    tgm e = tgo.e((int) aodtVar3.q(), (int) aodtVar3.p(), iArr2);
                    arrayList.add(new tgn(aodtVar3, e.a, e.b));
                }
            }
        }
        if (iArr2 == null || (r4 = iArr2.length) == 0) {
            return axmnVar;
        }
        aodq aodqVar2 = new aodq();
        StringBuilder sb = new StringBuilder(aU);
        int length = aU.length();
        while (true) {
            int length2 = length2 - 1;
            if (length2 < 0) {
                break;
            }
            int i6 = iArr2[length2];
            if (i6 >= 0 && i6 <= length) {
                sb.insert(i6, '^');
            }
        }
        int b2 = aodqVar2.b(sb.toString());
        float aG = axmnVar.aG();
        int n = axmnVar.n();
        int aO = axmnVar.aO();
        if (axmnVar.aI() == 0) {
            aL = 0;
        } else {
            int[] iArr4 = new int[axmnVar.aI()];
            int i7 = 0;
            while (i7 < axmnVar.aI()) {
                axmu aR = axmnVar.aR(i7);
                int e2 = e(aodqVar2, aR.aI());
                int e3 = e(aodqVar2, aR.aH());
                long q = aR.q();
                long p = aR.p();
                if (iArr2.length > 0) {
                    tgm e4 = tgo.e((int) aR.q(), (int) aR.p(), iArr2);
                    p = e4.b;
                    q = e4.a;
                }
                int i8 = i7;
                iArr4[i8] = axmu.aG(aodqVar2, q, p, e2, e3);
                i7 = i8 + 1;
            }
            aL = axmn.aL(aodqVar2, iArr4);
        }
        if (axmnVar.aP() == 0) {
            f = aG;
            i = aL;
            aodqVar = aodqVar2;
            aM = 0;
        } else {
            int[] iArr5 = new int[axmnVar.aP()];
            int i9 = 0;
            while (i9 < axmnVar.aP()) {
                axnj aS = axmnVar.aS(i9);
                long q2 = aS.q();
                long p2 = aS.p();
                if (iArr2.length > 0) {
                    tgm f2 = tgo.f((int) aS.q(), (int) aS.p(), iArr2, z);
                    long j = f2.b;
                    q2 = f2.a;
                    p2 = j;
                }
                int b3 = aS.aS() == null ? 0 : aodqVar2.b(aS.aS());
                float aH = aS.aH();
                long aP = aS.aP();
                int aM2 = aS.aM();
                int p3 = p(aodqVar2, aS.aU());
                float aI = aS.aI();
                long aQ = aS.aQ();
                int aN = aS.aN();
                boolean aT = aS.aT();
                int aL2 = aS.aL();
                int aJ2 = aS.aJ();
                if (aS.aR() == null) {
                    iArr = iArr2;
                    b = 0;
                } else {
                    iArr = iArr2;
                    b = aodqVar2.b(aS.aR());
                }
                int i10 = i9;
                float f3 = aG;
                int[] iArr6 = iArr5;
                iArr6[i10] = axnj.aK(aodqVar2, q2, p2, b3, aH, aP, aM2, p3, aI, aQ, aN, aT, aL2, aJ2, b, aS.aO(), aS.aG());
                i9 = i10 + 1;
                iArr5 = iArr6;
                aodqVar2 = aodqVar2;
                iArr2 = iArr;
                aL = aL;
                aG = f3;
                z = true;
            }
            f = aG;
            i = aL;
            aodqVar = aodqVar2;
            aM = axmn.aM(aodqVar, iArr5);
        }
        int size4 = arrayList.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            } else if (arrayList.get(size4) == null) {
                arrayList.remove(size4);
            }
        }
        if (arrayList.isEmpty()) {
            aJ = 0;
        } else {
            int[] iArr7 = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                tgn tgnVar = (tgn) arrayList.get(i11);
                int d = d(aodqVar, ((aodt) tgnVar.a).ar());
                tgm tgmVar = tgnVar.b;
                iArr7[i11] = aodt.o(aodqVar, tgmVar.a, tgmVar.b, d, ((aodt) tgnVar.a).n());
            }
            aJ = axmn.aJ(aodqVar, iArr7);
        }
        aodqVar.k(axmn.aK(aodqVar, b2, f, n, aO, i, aM, aJ, axmnVar.aV(), axmnVar.aQ(), o(aodqVar, axmnVar)));
        ByteBuffer f4 = aodqVar.f();
        axmn axmnVar2 = new axmn();
        f4.order(ByteOrder.LITTLE_ENDIAN);
        axmnVar2.f(f4.getInt(f4.position()) + f4.position(), f4);
        return axmnVar2;
    }

    public static boolean c(aodt aodtVar, aodt aodtVar2) {
        if (aodtVar == null && aodtVar2 == null) {
            return true;
        }
        if (aodtVar != null && aodtVar2 != null) {
            ByteBuffer byteBuffer = aodtVar.b;
            ByteBuffer byteBuffer2 = aodtVar2.b;
            if (byteBuffer == null && byteBuffer2 == null) {
                return true;
            }
            if (byteBuffer != null && byteBuffer2 != null) {
                if (!byteBuffer.hasArray() || !byteBuffer2.hasArray() || byteBuffer.arrayOffset() != byteBuffer2.arrayOffset() || byteBuffer.capacity() != byteBuffer2.capacity() || byteBuffer.position() != byteBuffer2.position() || byteBuffer.remaining() != byteBuffer2.remaining() || byteBuffer.array() != byteBuffer2.array()) {
                    return aodtVar.b.equals(aodtVar2.b);
                }
                return true;
            }
        }
        return false;
    }

    static int d(aodq aodqVar, aodt aodtVar) {
        int i;
        int i2 = 0;
        if (aodtVar == null) {
            return 0;
        }
        int e = e(aodqVar, aodtVar.av());
        int p = p(aodqVar, aodtVar.ax());
        if (aodtVar.K() > 0) {
            int K = aodtVar.K();
            int[] iArr = new int[K];
            for (int i3 = 0; i3 < aodtVar.K(); i3++) {
                iArr[i3] = d(aodqVar, aodtVar.at(i3));
            }
            aodqVar.q(4, K, 4);
            while (true) {
                K--;
                if (K < 0) {
                    break;
                }
                aodqVar.i(iArr[K]);
            }
            i = aodqVar.d();
        } else {
            i = 0;
        }
        if (aodtVar.M() != null) {
            i2 = aodqVar.b(aodtVar.M());
        }
        return aodt.L(aodqVar, e, p, i, i2);
    }

    static int e(aodq aodqVar, aodt aodtVar) {
        int i = 0;
        if (aodtVar == null) {
            return 0;
        }
        if (aodtVar.S() > 0) {
            byte[] bArr = new byte[aodtVar.S()];
            aodtVar.V().get(bArr);
            i = aodqVar.a(bArr);
        }
        return aodt.R(aodqVar, aodtVar.T(), i, aodtVar.U());
    }

    public static IntersectionCriteria f(aodt aodtVar) {
        int b = aodtVar.b(4);
        float f = b != 0 ? aodtVar.b.getFloat(b + aodtVar.a) : 0.0f;
        int b2 = aodtVar.b(6);
        return new IntersectionCriteria(f, b2 == 0 || aodtVar.b.getInt(b2 + aodtVar.a) == 0);
    }

    public static awny h(aodt aodtVar) {
        aopa createBuilder = awny.a.createBuilder();
        axnb axnbVar = new axnb();
        for (int i = 0; i < aodtVar.aa(); i++) {
            aodtVar.ac(axnbVar, i);
            aopa createBuilder2 = awoa.a.createBuilder();
            long aH = axnbVar.aH();
            createBuilder2.copyOnWrite();
            awoa awoaVar = (awoa) createBuilder2.instance;
            awoaVar.b |= 8;
            awoaVar.e = (int) aH;
            long aG = axnbVar.aG();
            createBuilder2.copyOnWrite();
            awoa awoaVar2 = (awoa) createBuilder2.instance;
            awoaVar2.b |= 16;
            awoaVar2.f = (int) aG;
            if (axnbVar.m() != null) {
                String m = axnbVar.m();
                createBuilder2.copyOnWrite();
                awoa awoaVar3 = (awoa) createBuilder2.instance;
                m.getClass();
                awoaVar3.c = 1;
                awoaVar3.d = m;
            }
            createBuilder.copyOnWrite();
            awny awnyVar = (awny) createBuilder.instance;
            awoa awoaVar4 = (awoa) createBuilder2.mo39build();
            awoaVar4.getClass();
            aopu aopuVar = awnyVar.c;
            if (!aopuVar.c()) {
                awnyVar.c = aopi.mutableCopy(aopuVar);
            }
            awnyVar.c.add(awoaVar4);
        }
        return (awny) createBuilder.mo39build();
    }

    public static aodt i(aodt aodtVar, int i) {
        if (aodtVar == null) {
            return null;
        }
        aodt aodtVar2 = new aodt();
        for (int i2 = 0; i2 < aodtVar.W(); i2++) {
            aodtVar.aA(aodtVar2, i2);
            if (aodtVar2.T() == i) {
                return aodtVar2;
            }
        }
        return null;
    }

    public static String j(aodt aodtVar) {
        return String.format("(format:%d id:%d datalength:%d)", Integer.valueOf(aodtVar.U()), Integer.valueOf(aodtVar.T()), Integer.valueOf(aodtVar.S()));
    }

    public static ByteBuffer k(aodt aodtVar, int i) {
        aodt i2 = i(aodtVar, i);
        if (i2 == null) {
            return null;
        }
        return i2.V();
    }

    public static boolean l(aodt aodtVar, aodt aodtVar2, int i, tfx tfxVar) {
        ByteBuffer k = k(aodtVar, i);
        if (k != null) {
            tfxVar.a(k, aodtVar2);
            return true;
        }
        return false;
    }

    public static boolean m(aodt aodtVar, axml axmlVar) {
        if (aodtVar == null) {
            return false;
        }
        return l(aodtVar, axmlVar, 168774763, tcf.c);
    }

    public static boolean n(aodt aodtVar, axne axneVar) {
        if (aodtVar == null) {
            return false;
        }
        return l(aodtVar, axneVar, 168772996, tcf.d);
    }

    private static int o(aodq aodqVar, axmn axmnVar) {
        if (axmnVar.aN() == 0) {
            return 0;
        }
        int[] iArr = new int[axmnVar.aN()];
        for (int i = 0; i < axmnVar.aN(); i++) {
            iArr[i] = e(aodqVar, axmnVar.aX(i).as());
        }
        int aN = axmnVar.aN();
        int[] iArr2 = new int[aN];
        for (int i2 = 0; i2 < axmnVar.aN(); i2++) {
            int i3 = iArr[i2];
            aodqVar.p(1);
            aodqVar.u(0, i3);
            iArr2[i2] = aodqVar.c();
        }
        aodqVar.q(4, aN, 4);
        while (true) {
            aN--;
            if (aN < 0) {
                return aodqVar.d();
            }
            aodqVar.i(iArr2[aN]);
        }
    }

    private static int p(aodq aodqVar, aodt aodtVar) {
        if (aodtVar == null) {
            return 0;
        }
        int W = aodtVar.W();
        int[] iArr = new int[W];
        for (int i = 0; i < aodtVar.W(); i++) {
            iArr[i] = e(aodqVar, aodtVar.az(i));
        }
        aodqVar.q(4, W, 4);
        while (true) {
            W--;
            if (W < 0) {
                int d = aodqVar.d();
                aodqVar.p(1);
                aodqVar.u(0, d);
                return aodqVar.c();
            }
            aodqVar.i(iArr[W]);
        }
    }

    public final tfw g(aodt aodtVar) {
        if (aodtVar == null) {
            return null;
        }
        return new tfw(aodtVar, this.a);
    }
}
