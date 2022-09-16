package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: srk  reason: default package */
/* loaded from: classes4.dex */
public final class srk implements tdr {
    static final Map a;
    static final aodt b = new aodt();
    private final SparseArray c = new SparseArray();
    private final SparseArray d = new SparseArray();
    private final amvn e;
    private final teb f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(192475008, "AnimatedVectorType");
        hashMap.put(160982084, "CellType");
        hashMap.put(158796298, "CollectionType");
        hashMap.put(158796327, "ContainerType");
        hashMap.put(191923252, "EditableTextType");
        hashMap.put(158796345, "ImageType");
        hashMap.put(158796380, "TextType");
        hashMap.put(193805739, "ExpandableTextType");
        hashMap.put(197633010, "ScrollableContainerType");
        a = amup.j(hashMap);
    }

    public srk(Map map, Map map2, Set set, teb tebVar, ampq ampqVar, ampq ampqVar2, ampq ampqVar3, ampq ampqVar4, ampq ampqVar5) {
        this.g = ((Boolean) ampqVar.e(false)).booleanValue();
        for (tdw tdwVar : ((amup) map).values()) {
            this.c.put(tdwVar.a(), tdwVar);
        }
        amtf<tdv> b2 = amtf.b(((amup) map2).values(), set);
        HashSet hashSet = new HashSet();
        amvl i = amvn.i();
        for (tdv tdvVar : b2) {
            int a2 = tdvVar.b().a();
            Integer valueOf = Integer.valueOf(a2);
            if (!hashSet.add(valueOf)) {
                i.c(valueOf);
                StringBuilder sb = new StringBuilder(68);
                sb.append("Multiple type converters found and removed for extension ");
                sb.append(a2);
                tebVar.b(27, sb.toString());
            }
        }
        this.e = i.g();
        for (tdv tdvVar2 : b2) {
            int a3 = tdvVar2.b().a();
            if (!this.e.contains(Integer.valueOf(a3))) {
                this.d.put(a3, tdvVar2);
            }
        }
        this.h = ((Boolean) ampqVar2.e(false)).booleanValue();
        this.i = ((Boolean) ampqVar3.e(false)).booleanValue();
        this.j = ((Boolean) ampqVar4.e(false)).booleanValue();
        this.k = ((Boolean) ampqVar5.e(true)).booleanValue();
        this.f = tebVar;
        aodu.a = new tgq(tebVar);
        axmj.a.set(this.g);
    }

    private final List d(cyv cyvVar, tda tdaVar, aodt aodtVar, final tdi tdiVar, final List list, boolean z) {
        cyr c;
        int K = aodtVar.K();
        if (K == 0) {
            return amuk.q();
        }
        ArrayList arrayList = new ArrayList(Collections.nCopies(K, null));
        ArrayList arrayList2 = new ArrayList(K);
        for (int i = 0; i < K; i++) {
            arrayList2.add(Integer.valueOf(i));
        }
        if (!z) {
            Collections.shuffle(arrayList2);
        }
        for (int i2 = 0; i2 < K; i2++) {
            final aodt at = aodtVar.at(((Integer) arrayList2.get(i2)).intValue());
            if (z) {
                tgb a2 = tgd.a(cyvVar);
                a2.e(new tfm() { // from class: srj
                    @Override // defpackage.tfm
                    public final cyr a(cyv cyvVar2, tda tdaVar2) {
                        return srk.this.c(cyvVar2, tdaVar2, at, tdiVar, list);
                    }
                });
                a2.f(tdaVar);
                c = a2.a();
            } else {
                c = c(cyvVar, tdaVar, at, tdiVar, list);
            }
            arrayList.set(((Integer) arrayList2.get(i2)).intValue(), c);
        }
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (Object obj : arrayList) {
            if (obj != null) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }

    @Override // defpackage.tdr
    public final cyr a(cyv cyvVar, tda tdaVar, byte[] bArr, tdi tdiVar, aypf aypfVar) {
        tda a2;
        awqm k;
        if (tdaVar == null) {
            tdaVar = tda.a;
        }
        tcz e = tdaVar.e();
        e.e = aypfVar;
        if (!this.g) {
            a2 = e.a();
        } else {
            e.o = Integer.toString(System.identityHashCode(bArr));
            a2 = e.a();
        }
        tda tdaVar2 = a2;
        aodt aodtVar = new aodt();
        int a3 = axmj.a(bArr, aodtVar, this.h, this.j);
        if (a3 != 0) {
            teb tebVar = this.f;
            StringBuilder sb = new StringBuilder(52);
            sb.append("Failed to convert Element to Flatbuffers:");
            sb.append(a3);
            tebVar.c(28, sb.toString(), tdaVar2);
            return djf.a(cyvVar).a;
        }
        cyr b2 = b(cyvVar, tdaVar2, aodtVar, tdiVar, aypfVar);
        if (!this.g || (k = tbs.k(aodtVar, null, null, null)) == null) {
            return b2;
        }
        tbq tbqVar = new tbq(null);
        tbqVar.a(k);
        dfa a4 = dfb.a(cyvVar);
        a4.e(b2);
        a4.F(tbqVar);
        return a4.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:75|(1:(1:80)(4:81|82|83|(2:85|(3:87|88|(1:90)(5:91|(1:93)|94|95|96))(6:98|(1:100)|101|(1:109)(1:107)|108|(0)(0)))(4:110|(4:115|(1:117)|118|(0)(0))|88|(0)(0))))|128|82|83|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0343, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0344, code lost:
        r1 = r25.f;
        r2 = r12.T();
        r3 = new java.lang.StringBuilder(65);
        r3.append("ElementsException was thrown in flat while converting ");
        r3.append(r2);
        r1.a(28, r3.toString(), r10, r0);
        r0 = defpackage.djf.a(r26).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0368, code lost:
        r1 = defpackage.tga.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x036b, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x036c, code lost:
        r1 = r25.f;
        r2 = r12.T();
        r3 = new java.lang.StringBuilder(34);
        r3.append("Error while converting ");
        r3.append(r2);
        r1.a(26, r3.toString(), r10, r0);
        r0 = defpackage.djf.a(r26).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x038e, code lost:
        r1 = defpackage.tga.a;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0300 A[Catch: all -> 0x0341, ted -> 0x0343, aopx -> 0x036b, TRY_ENTER, TryCatch #2 {ted -> 0x0343, blocks: (B:81:0x0223, B:83:0x0229, B:111:0x0300, B:113:0x0327, B:114:0x0331, B:86:0x023a, B:88:0x0248, B:89:0x024a, B:91:0x0250, B:93:0x0256, B:95:0x0263, B:97:0x0277, B:98:0x029a, B:100:0x02a0, B:103:0x02b1, B:105:0x02cf, B:106:0x02d4), top: B:131:0x0223, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ea A[Catch: aopx -> 0x01ae, TryCatch #1 {aopx -> 0x01ae, blocks: (B:34:0x00a1, B:36:0x00be, B:38:0x00cc, B:40:0x00d2, B:44:0x00ec, B:46:0x00f5, B:47:0x0105, B:48:0x0114, B:50:0x011b, B:52:0x0121, B:53:0x012c, B:55:0x0188, B:56:0x019a, B:57:0x01a1, B:43:0x00ea), top: B:132:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5 A[Catch: aopx -> 0x01ae, LOOP:0: B:45:0x00f3->B:46:0x00f5, LOOP_END, TryCatch #1 {aopx -> 0x01ae, blocks: (B:34:0x00a1, B:36:0x00be, B:38:0x00cc, B:40:0x00d2, B:44:0x00ec, B:46:0x00f5, B:47:0x0105, B:48:0x0114, B:50:0x011b, B:52:0x0121, B:53:0x012c, B:55:0x0188, B:56:0x019a, B:57:0x01a1, B:43:0x00ea), top: B:132:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0121 A[Catch: aopx -> 0x01ae, LOOP:2: B:50:0x011b->B:52:0x0121, LOOP_END, TryCatch #1 {aopx -> 0x01ae, blocks: (B:34:0x00a1, B:36:0x00be, B:38:0x00cc, B:40:0x00d2, B:44:0x00ec, B:46:0x00f5, B:47:0x0105, B:48:0x0114, B:50:0x011b, B:52:0x0121, B:53:0x012c, B:55:0x0188, B:56:0x019a, B:57:0x01a1, B:43:0x00ea), top: B:132:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0188 A[Catch: aopx -> 0x01ae, TryCatch #1 {aopx -> 0x01ae, blocks: (B:34:0x00a1, B:36:0x00be, B:38:0x00cc, B:40:0x00d2, B:44:0x00ec, B:46:0x00f5, B:47:0x0105, B:48:0x0114, B:50:0x011b, B:52:0x0121, B:53:0x012c, B:55:0x0188, B:56:0x019a, B:57:0x01a1, B:43:0x00ea), top: B:132:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a1 A[Catch: aopx -> 0x01ae, TRY_LEAVE, TryCatch #1 {aopx -> 0x01ae, blocks: (B:34:0x00a1, B:36:0x00be, B:38:0x00cc, B:40:0x00d2, B:44:0x00ec, B:46:0x00f5, B:47:0x0105, B:48:0x0114, B:50:0x011b, B:52:0x0121, B:53:0x012c, B:55:0x0188, B:56:0x019a, B:57:0x01a1, B:43:0x00ea), top: B:132:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0229 A[Catch: all -> 0x0341, ted -> 0x0343, aopx -> 0x036b, TryCatch #2 {ted -> 0x0343, blocks: (B:81:0x0223, B:83:0x0229, B:111:0x0300, B:113:0x0327, B:114:0x0331, B:86:0x023a, B:88:0x0248, B:89:0x024a, B:91:0x0250, B:93:0x0256, B:95:0x0263, B:97:0x0277, B:98:0x029a, B:100:0x02a0, B:103:0x02b1, B:105:0x02cf, B:106:0x02d4), top: B:131:0x0223, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x029a A[Catch: all -> 0x0341, ted -> 0x0343, aopx -> 0x036b, TryCatch #2 {ted -> 0x0343, blocks: (B:81:0x0223, B:83:0x0229, B:111:0x0300, B:113:0x0327, B:114:0x0331, B:86:0x023a, B:88:0x0248, B:89:0x024a, B:91:0x0250, B:93:0x0256, B:95:0x0263, B:97:0x0277, B:98:0x029a, B:100:0x02a0, B:103:0x02b1, B:105:0x02cf, B:106:0x02d4), top: B:131:0x0223, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cyr c(defpackage.cyv r26, defpackage.tda r27, defpackage.aodt r28, defpackage.tdi r29, java.util.List r30) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.srk.c(cyv, tda, aodt, tdi, java.util.List):cyr");
    }

    @Override // defpackage.tdr
    public final cyr b(cyv cyvVar, tda tdaVar, aodt aodtVar, tdi tdiVar, aypf aypfVar) {
        int c;
        int i;
        if (!this.g || tdaVar.t != null) {
            tfd tfdVar = tfd.b;
            tfd tfdVar2 = tdaVar.e;
            if (tfdVar2 != null) {
                tfdVar = tfdVar2;
            }
            ArrayList arrayList = new ArrayList();
            cyr c2 = c(cyvVar, tdaVar, aodtVar, tdiVar, arrayList);
            srf srfVar = new srf();
            srf.d(srfVar, cyvVar, new srg());
            srfVar.a.c = c2 == null ? null : c2.j();
            srfVar.d.set(1);
            srfVar.a.d = this;
            srfVar.d.set(2);
            srfVar.a.e = tfdVar;
            srfVar.d.set(3);
            srfVar.a.a = aypfVar;
            srfVar.d.set(0);
            if (tdiVar != null) {
                srfVar.a.b = tdiVar;
            }
            if (aodtVar.M() != null && !aodtVar.M().equals("deprecated_option_force_clip_bounds")) {
                srfVar.x(aodtVar.M());
            }
            tee b2 = tdaVar.b();
            if (b2 != null && !arrayList.isEmpty()) {
                amuk o = amuk.o(arrayList);
                int size = o.size();
                for (int i2 = 0; i2 < size; i2++) {
                    awoc awocVar = (awoc) o.get(i2);
                    acuq acuqVar = (acuq) b2;
                    if (acuqVar.j(awocVar) && acuqVar.e(awocVar.d) == null) {
                        acum d = acuqVar.d(awocVar);
                        if (acuq.h(awocVar) && d != null) {
                            awoe awoeVar = awocVar.c;
                            if (awoeVar == null) {
                                awoeVar = awoe.a;
                            }
                            if ((awoeVar.c & 2) != 0 && (c = acuq.c(awocVar)) != -1) {
                                if (!acuqVar.i() || !acuq.g(awocVar)) {
                                    i = awocVar.d;
                                } else {
                                    asvv asvvVar = acuq.f(awocVar).e;
                                    if (asvvVar == null) {
                                        asvvVar = asvv.b;
                                    }
                                    apxf apxfVar = asvvVar.h;
                                    if (apxfVar == null) {
                                        apxfVar = apxf.a;
                                    }
                                    i = apxfVar.d;
                                }
                                acti actiVar = acuqVar.a;
                                awoe awoeVar2 = awocVar.c;
                                if (awoeVar2 == null) {
                                    awoeVar2 = awoe.a;
                                }
                                actiVar.l(awoeVar2.d, acuo.b(c), i);
                            }
                            acum e = acuqVar.e(awocVar.e);
                            if (e != null) {
                                acuqVar.a.E(d, e);
                            } else {
                                int i3 = acuqVar.c.get(awocVar.e, -1);
                                if (i3 != -1) {
                                    acuqVar.a.E(d, (acum) acuqVar.b.get(i3));
                                } else {
                                    acum acumVar = acuqVar.d;
                                    if (acumVar != null) {
                                        acuqVar.a.E(d, acumVar);
                                    } else {
                                        acuqVar.a.D(d);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (this.g) {
                srfVar.c.C().D().r(tbs.a(tdaVar));
            }
            return srfVar.a();
        }
        throw new IllegalStateException("Element tree missing id in debug mode.");
    }
}
