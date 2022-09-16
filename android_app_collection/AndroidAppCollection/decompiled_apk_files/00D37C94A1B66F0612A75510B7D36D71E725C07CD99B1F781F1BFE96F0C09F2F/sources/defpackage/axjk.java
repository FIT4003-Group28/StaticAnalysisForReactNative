package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: axjk  reason: default package */
/* loaded from: classes2.dex */
public final class axjk implements axjl {
    private static final Logger e = Logger.getLogger(axjk.class.getName());
    final Set a = new HashSet();
    final Set b = new HashSet();
    final HashMap c = new HashMap();
    final HashMap d = new HashMap();
    private axjm f;

    public static long a(long j, long j2) {
        return j2 == 0 ? j : a(j2, j % j2);
    }

    protected static long b(axjh axjhVar) {
        List<axjd> e2 = axjhVar.e();
        if (e2.size() <= 0) {
            return axjhVar.a();
        }
        double d = 0.0d;
        for (axjd axjdVar : e2) {
            d += axjdVar.b;
        }
        double d2 = axjhVar.j().b;
        Double.isNaN(d2);
        return Math.round(d * d2);
    }

    public static final long d(axje axjeVar) {
        long j = ((axjh) axjeVar.d.iterator().next()).j().b;
        for (axjh axjhVar : axjeVar.d) {
            j = a(axjhVar.j().b, j);
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0, types: [cvs, axiz] */
    /* JADX WARN: Type inference failed for: r2v16, types: [axiz, cwj] */
    /* JADX WARN: Type inference failed for: r3v41, types: [cvs, axiz, axiw] */
    @Override // defpackage.axjl
    public final cvx c(axje axjeVar) {
        int i;
        cvs cvsVar;
        cvs cvsVar2;
        cwk cwkVar;
        Iterator it;
        HashMap hashMap;
        String str;
        cxb cxbVar;
        axiw axiwVar;
        cxd cxdVar;
        axiz axizVar;
        String str2;
        int i2;
        cwh cwhVar;
        int[] iArr;
        long j;
        cwv cwvVar;
        cwr cwrVar;
        String str3;
        HashMap hashMap2;
        Object obj;
        axje axjeVar2 = axjeVar;
        if (this.f == null) {
            this.f = new axjm(axjeVar2);
        }
        Logger logger = e;
        Level level = Level.FINE;
        String valueOf = String.valueOf(axjeVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("Creating movie ");
        sb.append(valueOf);
        String str4 = "com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder";
        logger.logp(level, str4, "build", sb.toString());
        Iterator it2 = axjeVar2.d.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            axjh axjhVar = (axjh) it2.next();
            List l = axjhVar.l();
            List list = (List) this.c.put(axjhVar, l);
            int size = l.size();
            long[] jArr = new long[size];
            while (i < size) {
                jArr[i] = ((axjg) l.get(i)).a();
                i++;
            }
            this.d.put(axjhVar, jArr);
        }
        axiz axizVar2 = new axiz();
        LinkedList linkedList = new LinkedList();
        linkedList.add("isom");
        linkedList.add("iso2");
        linkedList.add("avc1");
        axizVar2.w(new cwc("isom", 0L, linkedList));
        HashMap hashMap3 = new HashMap();
        for (axjh axjhVar2 : axjeVar2.d) {
            axjm axjmVar = this.f;
            double d = 0.0d;
            for (axjh axjhVar3 : axjmVar.b.d) {
                double a = axjhVar3.a() / axjhVar3.j().b;
                if (d < a) {
                    d = a;
                }
            }
            int i3 = axjmVar.a;
            int min = Math.min(((int) Math.ceil(d / 2.0d)) - 1, axjhVar2.l().size());
            if (min <= 0) {
                min = 1;
            }
            long[] jArr2 = new long[min];
            Arrays.fill(jArr2, -1L);
            jArr2[i] = 1;
            long[] m = axjhVar2.m();
            int i4 = 0;
            long j2 = 0;
            for (int length = m.length; i < length; length = length) {
                long j3 = m[i];
                int i5 = axjmVar.a;
                int i6 = ((int) ((j2 / axjhVar2.j().b) / 2)) + 1;
                if (i6 >= min) {
                    break;
                }
                int i7 = i4 + 1;
                jArr2[i6] = i7;
                j2 += j3;
                i++;
                i4 = i7;
                m = m;
            }
            long j4 = i4 + 1;
            for (int i8 = min - 1; i8 >= 0; i8--) {
                long j5 = jArr2[i8];
                if (j5 == -1) {
                    jArr2[i8] = j4;
                } else {
                    j4 = j5;
                }
            }
            int[] iArr2 = new int[min];
            int i9 = 0;
            while (i9 < min) {
                long j6 = jArr2[i9] - 1;
                int i10 = i9 + 1;
                iArr2[i9] = axds.p((min == i10 ? axjhVar2.l().size() : jArr2[i10] - 1) - j6);
                i9 = i10;
            }
            hashMap3.put(axjhVar2, iArr2);
            i = 0;
        }
        cwk cwkVar2 = new cwk();
        cwl cwlVar = new cwl();
        cwlVar.k(axjeVar2.c);
        cwlVar.m(axjeVar2.b);
        cwlVar.d = axjeVar2.a;
        long d2 = d(axjeVar);
        long j7 = 0;
        for (axjh axjhVar4 : axjeVar2.d) {
            long b = (b(axjhVar4) * d2) / axjhVar4.j().b;
            if (b > j7) {
                j7 = b;
            }
        }
        cwlVar.l(j7);
        cwlVar.c = d2;
        long j8 = 0;
        for (axjh axjhVar5 : axjeVar2.d) {
            if (j8 < axjhVar5.j().i) {
                j8 = axjhVar5.j().i;
            }
        }
        cwlVar.e = j8 + 1;
        cwkVar2.w(cwlVar);
        Iterator it3 = axjeVar2.d.iterator();
        while (it3.hasNext()) {
            axjh axjhVar6 = (axjh) it3.next();
            cxd cxdVar2 = new cxd();
            cxe cxeVar = new cxe();
            cxeVar.m(true);
            cxeVar.n(true);
            cxeVar.r = cxeVar.r() | 4;
            cxeVar.r = cxeVar.r() | 8;
            cxeVar.e = axjhVar6.j().e;
            axjhVar6.j();
            cxeVar.c = 0;
            cxeVar.k(axjhVar6.j().d);
            cxeVar.l((b(axjhVar6) * d(axjeVar)) / axjhVar6.j().b);
            cxeVar.g = axjhVar6.j().g;
            cxeVar.f = axjhVar6.j().f;
            cxeVar.b = axjhVar6.j().j;
            cxeVar.o(axjhVar6.j().c);
            cxeVar.a = axjhVar6.j().i;
            cxeVar.d = axjhVar6.j().h;
            cxdVar2.w(cxeVar);
            axjhVar6.e();
            if (axjhVar6.e().size() > 0) {
                cwb cwbVar = new cwb();
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                for (axjd axjdVar : axjhVar6.e()) {
                    double d3 = axjdVar.b;
                    Iterator it4 = it3;
                    cwk cwkVar3 = cwkVar2;
                    long j9 = ((axjh) axjeVar2.d.iterator().next()).j().b;
                    Iterator it5 = axjeVar2.d.iterator();
                    long j10 = j9;
                    while (it5.hasNext()) {
                        j10 = axje.a(((axjh) it5.next()).j().b, j10);
                        it5 = it5;
                        str4 = str4;
                        hashMap3 = hashMap3;
                    }
                    HashMap hashMap4 = hashMap3;
                    String str5 = str4;
                    double d4 = j10;
                    Double.isNaN(d4);
                    long round = Math.round(d3 * d4);
                    long j11 = (axjdVar.c * axjhVar6.j().b) / axjdVar.a;
                    if (round >= 4294967296L || j11 > 2147483647L) {
                        i11 = 1;
                    }
                    arrayList.add(new cwa(cwbVar, round, j11, axjdVar.d));
                    axjeVar2 = axjeVar;
                    it3 = it4;
                    cwkVar2 = cwkVar3;
                    str4 = str5;
                    hashMap3 = hashMap4;
                }
                cwkVar = cwkVar2;
                it = it3;
                hashMap = hashMap3;
                str = str4;
                cwbVar.a = arrayList;
                cwbVar.q = i11;
                cxbVar = null;
                axiwVar = new axiw((byte[]) null);
                axiwVar.w(cwbVar);
            } else {
                cwkVar = cwkVar2;
                it = it3;
                hashMap = hashMap3;
                str = str4;
                cxbVar = null;
                axiwVar = null;
            }
            cxdVar2.w(axiwVar);
            cwh cwhVar2 = new cwh();
            cxdVar2.w(cwhVar2);
            cwi cwiVar = new cwi();
            cwiVar.a = axjhVar6.j().d;
            cwiVar.b = axjhVar6.j().c;
            cwiVar.d = axjhVar6.a();
            cwiVar.c = axjhVar6.j().b;
            cwiVar.e = axjhVar6.j().a;
            cwhVar2.w(cwiVar);
            cwf cwfVar = new cwf();
            cwhVar2.w(cwfVar);
            cwfVar.a = axjhVar6.k();
            ?? cwjVar = new cwj();
            if (axjhVar6.k().equals("vide")) {
                cwjVar.w(new cxh());
            } else if (axjhVar6.k().equals("soun")) {
                cwjVar.w(new cwu());
            } else if (axjhVar6.k().equals("text")) {
                cwjVar.w(new cwm());
            } else if (axjhVar6.k().equals("subt")) {
                cwjVar.w(new cwz());
            } else if (axjhVar6.k().equals("hint")) {
                cwjVar.w(new cwg());
            } else if (axjhVar6.k().equals("sbtl")) {
                cwjVar.w(new cwm());
            }
            ?? axiwVar2 = new axiw();
            cvz cvzVar = new cvz();
            axiwVar2.w(cvzVar);
            cvy cvyVar = new cvy();
            cvyVar.r = 1;
            cvzVar.w(cvyVar);
            cwjVar.w(axiwVar2);
            cwr cwrVar2 = new cwr();
            cwrVar2.w(axjhVar6.i());
            ArrayList arrayList2 = new ArrayList();
            long[] m2 = axjhVar6.m();
            int length2 = m2.length;
            cxb cxbVar2 = cxbVar;
            int i12 = 0;
            Object obj2 = cwjVar;
            while (i12 < length2) {
                long j12 = m2[i12];
                Object obj3 = obj2;
                if (cxbVar2 == null || cxbVar2.b != j12) {
                    cxbVar2 = new cxb(1L, j12);
                    arrayList2.add(cxbVar2);
                } else {
                    cxbVar2.a++;
                }
                i12++;
                obj2 = obj3;
            }
            Object obj4 = obj2;
            cxc cxcVar = new cxc();
            cxcVar.b = arrayList2;
            cwrVar2.w(cxcVar);
            List d5 = axjhVar6.d();
            if (d5 != null && !d5.isEmpty()) {
                cvw cvwVar = new cvw();
                cvwVar.a = d5;
                cwrVar2.w(cvwVar);
            }
            long[] h = axjhVar6.h();
            if (h != null && h.length > 0) {
                cxa cxaVar = new cxa();
                cxaVar.a = h;
                cwrVar2.w(cxaVar);
            }
            if (axjhVar6.f() != null && !axjhVar6.f().isEmpty()) {
                cwo cwoVar = new cwo();
                cwoVar.a = axjhVar6.f();
                cwrVar2.w(cwoVar);
            }
            HashMap hashMap5 = hashMap;
            int[] iArr3 = (int[]) hashMap5.get(axjhVar6);
            cwt cwtVar = new cwt();
            cwtVar.a = new LinkedList();
            long j13 = -2147483648L;
            int i13 = 0;
            while (i13 < iArr3.length) {
                long j14 = iArr3[i13];
                if (j13 != j14) {
                    obj = obj4;
                    cwtVar.a.add(new cws(i13 + 1, j14, 1L));
                    j13 = iArr3[i13];
                } else {
                    obj = obj4;
                }
                i13++;
                obj4 = obj;
            }
            ?? r29 = obj4;
            cwrVar2.w(cwtVar);
            cwq cwqVar = new cwq();
            cwqVar.a = (long[]) this.d.get(axjhVar6);
            cwrVar2.w(cwqVar);
            int[] iArr4 = (int[]) hashMap5.get(axjhVar6);
            cwv cwvVar2 = new cwv();
            this.a.add(cwvVar2);
            long[] jArr3 = new long[iArr4.length];
            Logger logger2 = e;
            String str6 = "Calculating chunk offsets for track_";
            if (logger2.isLoggable(Level.FINE)) {
                Level level2 = Level.FINE;
                long j15 = axjhVar6.j().i;
                axizVar = axizVar2;
                cxdVar = cxdVar2;
                StringBuilder sb2 = new StringBuilder(56);
                sb2.append(str6);
                sb2.append(j15);
                String sb3 = sb2.toString();
                str2 = str;
                logger2.logp(level2, str2, "createStco", sb3);
            } else {
                cxdVar = cxdVar2;
                axizVar = axizVar2;
                str2 = str;
            }
            int i14 = 0;
            long j16 = 0;
            while (i14 < iArr4.length) {
                Logger logger3 = e;
                if (logger3.isLoggable(Level.FINER)) {
                    Level level3 = Level.FINER;
                    iArr = iArr4;
                    j = j16;
                    long j17 = axjhVar6.j().i;
                    cwhVar = cwhVar2;
                    StringBuilder sb4 = new StringBuilder(74);
                    sb4.append(str6);
                    sb4.append(j17);
                    sb4.append(" chunk ");
                    sb4.append(i14);
                    logger3.logp(level3, str2, "createStco", sb4.toString());
                } else {
                    cwhVar = cwhVar2;
                    iArr = iArr4;
                    j = j16;
                }
                Iterator it6 = axjeVar.d.iterator();
                j16 = j;
                while (it6.hasNext()) {
                    axjh axjhVar7 = (axjh) it6.next();
                    Logger logger4 = e;
                    Iterator it7 = it6;
                    if (logger4.isLoggable(Level.FINEST)) {
                        Level level4 = Level.FINEST;
                        cwvVar = cwvVar2;
                        cwrVar = cwrVar2;
                        long j18 = axjhVar7.j().i;
                        str3 = str6;
                        StringBuilder sb5 = new StringBuilder(44);
                        sb5.append("Adding offsets of track_");
                        sb5.append(j18);
                        logger4.logp(level4, str2, "createStco", sb5.toString());
                    } else {
                        cwvVar = cwvVar2;
                        cwrVar = cwrVar2;
                        str3 = str6;
                    }
                    int[] iArr5 = (int[]) hashMap5.get(axjhVar7);
                    int i15 = 0;
                    long j19 = 0;
                    while (i15 < i14) {
                        j19 += iArr5[i15];
                        i15++;
                        str2 = str2;
                    }
                    String str7 = str2;
                    if (axjhVar7 == axjhVar6) {
                        jArr3[i14] = j16;
                    }
                    int p = axds.p(j19);
                    while (true) {
                        hashMap2 = hashMap5;
                        if (p < iArr5[i14] + j19) {
                            j16 += ((long[]) this.d.get(axjhVar7))[p];
                            p++;
                            hashMap5 = hashMap2;
                        }
                    }
                    it6 = it7;
                    cwrVar2 = cwrVar;
                    cwvVar2 = cwvVar;
                    str6 = str3;
                    str2 = str7;
                    hashMap5 = hashMap2;
                }
                i14++;
                iArr4 = iArr;
                cwhVar2 = cwhVar;
            }
            cwh cwhVar3 = cwhVar2;
            cwv cwvVar3 = cwvVar2;
            cwr cwrVar3 = cwrVar2;
            HashMap hashMap6 = hashMap5;
            String str8 = str2;
            cwvVar3.a = jArr3;
            cwrVar3.w(cwvVar3);
            HashMap hashMap7 = new HashMap();
            for (Map.Entry entry : axjhVar6.g().entrySet()) {
                String a2 = ((axkr) entry.getKey()).a();
                List list2 = (List) hashMap7.get(a2);
                if (list2 == null) {
                    list2 = new ArrayList();
                    hashMap7.put(a2, list2);
                }
                list2.add((axkr) entry.getKey());
            }
            for (Map.Entry entry2 : hashMap7.entrySet()) {
                axkv axkvVar = new axkv();
                axkvVar.a = (List) entry2.getValue();
                axkx axkxVar = new axkx();
                axkxVar.a = (String) entry2.getKey();
                axkw axkwVar = null;
                for (int i16 = 0; i16 < axjhVar6.l().size(); i16++) {
                    int i17 = 0;
                    for (int i18 = 0; i18 < ((List) entry2.getValue()).size(); i18++) {
                        if (Arrays.binarySearch((long[]) axjhVar6.g().get((axkr) ((List) entry2.getValue()).get(i18)), i16) >= 0) {
                            i17 = i18 + 1;
                        }
                    }
                    if (axkwVar == null || axkwVar.b != i17) {
                        axkwVar = new axkw(1L, i17);
                        axkxVar.b.add(axkwVar);
                    } else {
                        axkwVar.a++;
                    }
                }
                cwrVar3.w(axkvVar);
                cwrVar3.w(axkxVar);
            }
            if (axjhVar6 instanceof axjv) {
                axjv axjvVar = (axjv) axjhVar6;
                hashMap3 = hashMap6;
                int[] iArr6 = (int[]) hashMap3.get(axjhVar6);
                axln axlnVar = new axln();
                axlnVar.d = "cenc";
                axlnVar.r = 1;
                List n = axjvVar.n();
                if (axjvVar.o()) {
                    int size2 = n.size();
                    short[] sArr = new short[size2];
                    for (int i19 = 0; i19 < size2; i19++) {
                        sArr[i19] = (short) ((axmh) n.get(i19)).a();
                    }
                    axlnVar.b = Arrays.copyOf(sArr, size2);
                } else {
                    axlnVar.a = (short) 8;
                    axlnVar.c = axjvVar.l().size();
                }
                axlm axlmVar = new axlm();
                axjx axjxVar = new axjx();
                if (axjvVar.o()) {
                    axjxVar.r = axjxVar.r() | 2;
                } else {
                    axjxVar.r = axjxVar.r() & 16777213;
                }
                axjxVar.d = n;
                int i20 = axjxVar.b() > 4294967296L ? 16 : 8;
                if (axjxVar.k()) {
                    int length3 = axjxVar.c.length;
                    i2 = 20;
                } else {
                    i2 = 0;
                }
                long j20 = i20 + i2 + 4;
                long[] jArr4 = new long[iArr6.length];
                long j21 = j20;
                int i21 = 0;
                int i22 = 0;
                while (i21 < iArr6.length) {
                    jArr4[i21] = j21;
                    int i23 = i22;
                    int i24 = 0;
                    while (i24 < iArr6[i21]) {
                        j21 += ((axmh) n.get(i23)).a();
                        i24++;
                        i23++;
                    }
                    i21++;
                    i22 = i23;
                }
                axlmVar.a = jArr4;
                cwrVar3.w(axlnVar);
                cwrVar3.w(axlmVar);
                cwrVar3.w(axjxVar);
                this.b.add(axlmVar);
            } else {
                hashMap3 = hashMap6;
            }
            if (axjhVar6.b() != null) {
                cwrVar3.w(axjhVar6.b());
            }
            r29.w(cwrVar3);
            cwhVar3.w(r29);
            cwkVar2 = cwkVar;
            cwkVar2.w(cxdVar);
            axjeVar2 = axjeVar;
            it3 = it;
            axizVar2 = axizVar;
            str4 = str8;
        }
        axiz axizVar3 = axizVar2;
        axizVar3.w(cwkVar2);
        long j22 = 0;
        for (cwq cwqVar2 : axli.c(cwkVar2, "trak/mdia/minf/stbl/stsz", false)) {
            long j23 = 0;
            for (long j24 : cwqVar2.a) {
                j23 += j24;
            }
            j22 += j23;
        }
        axjj axjjVar = new axjj(this, axjeVar, hashMap3, j22);
        axizVar3.w(axjjVar);
        long j25 = 16;
        cvx cvxVar = axjjVar;
        while (cvxVar instanceof cvs) {
            axjj axjjVar2 = cvxVar;
            Iterator it8 = axjjVar2.c().i().iterator();
            while (it8.hasNext() && cvxVar != (cvsVar2 = (cvs) it8.next())) {
                j25 += cvsVar2.b();
            }
            cvxVar = axjjVar2.c();
        }
        for (cwv cwvVar4 : this.a) {
            long[] jArr5 = cwvVar4.a;
            for (int i25 = 0; i25 < jArr5.length; i25++) {
                jArr5[i25] = jArr5[i25] + j25;
            }
        }
        for (axlm axlmVar2 : this.b) {
            long b2 = axlmVar2.b() + 44;
            cvx cvxVar2 = axlmVar2;
            while (true) {
                cvx c = cvxVar2.c();
                Iterator it9 = c.i().iterator();
                while (it9.hasNext() && (cvsVar = (cvs) it9.next()) != cvxVar2) {
                    b2 += cvsVar.b();
                }
                if (!(c instanceof cvs)) {
                    break;
                }
                cvxVar2 = c;
            }
            long[] jArr6 = axlmVar2.a;
            for (int i26 = 0; i26 < jArr6.length; i26++) {
                jArr6[i26] = jArr6[i26] + b2;
            }
            axlmVar2.a = jArr6;
        }
        return axizVar3;
    }
}
