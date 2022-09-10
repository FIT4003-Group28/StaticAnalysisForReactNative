package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
/* compiled from: PG */
/* renamed from: biko  reason: default package */
/* loaded from: classes3.dex */
public class biko {
    public static final biki a = new biki();
    private final dxio<akfa> b;

    public biko(dxio<akfa> dxioVar) {
        this.b = dxioVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [dnjy] */
    /* JADX WARN: Type inference failed for: r2v12, types: [dnnz] */
    /* JADX WARN: Type inference failed for: r2v14, types: [doqp] */
    /* JADX WARN: Type inference failed for: r2v16, types: [dnfu] */
    /* JADX WARN: Type inference failed for: r2v18, types: [dobz] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v28, types: [dnjj] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8, types: [dnfm] */
    public final bikf a(ilo iloVar, Context context) {
        dnfm dnfmVar;
        if (btlu.i(this.b.a().j()).equals(btlt.GOOGLE)) {
            dnwf bX = iloVar.bX();
            Iterator<dnjj> it = bX.g.iterator();
            while (true) {
                if (it.hasNext()) {
                    dnfmVar = it.next();
                    Set<String> set = iloVar.e;
                    dnwd dnwdVar = dnfmVar.d;
                    if (dnwdVar == null) {
                        dnwdVar = dnwd.b;
                    }
                    if (!set.contains(dnwdVar.a)) {
                        break;
                    }
                } else {
                    Iterator<dobz> it2 = bX.f.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            dnfmVar = it2.next();
                            Set<String> set2 = iloVar.e;
                            dnwd dnwdVar2 = dnfmVar.d;
                            if (dnwdVar2 == null) {
                                dnwdVar2 = dnwd.b;
                            }
                            if (!set2.contains(dnwdVar2.a)) {
                                break;
                            }
                        } else {
                            Iterator<dnfu> it3 = bX.i.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    dnfmVar = it3.next();
                                    Set<String> set3 = iloVar.e;
                                    dnwd dnwdVar3 = dnfmVar.i;
                                    if (dnwdVar3 == null) {
                                        dnwdVar3 = dnwd.b;
                                    }
                                    if (!set3.contains(dnwdVar3.a)) {
                                        break;
                                    }
                                } else {
                                    Iterator<doqp> it4 = bX.j.iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            dnfmVar = it4.next();
                                            Set<String> set4 = iloVar.e;
                                            dnwd dnwdVar4 = dnfmVar.h;
                                            if (dnwdVar4 == null) {
                                                dnwdVar4 = dnwd.b;
                                            }
                                            if (!set4.contains(dnwdVar4.a)) {
                                                break;
                                            }
                                        } else {
                                            Iterator<dnnz> it5 = bX.e.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    dnfmVar = it5.next();
                                                    Set<String> set5 = iloVar.e;
                                                    dnwd dnwdVar5 = dnfmVar.f;
                                                    if (dnwdVar5 == null) {
                                                        dnwdVar5 = dnwd.b;
                                                    }
                                                    if (!set5.contains(dnwdVar5.a)) {
                                                        break;
                                                    }
                                                } else {
                                                    Iterator<dnjy> it6 = bX.h.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            dnfmVar = it6.next();
                                                            Set<String> set6 = iloVar.e;
                                                            dnwd dnwdVar6 = dnfmVar.i;
                                                            if (dnwdVar6 == null) {
                                                                dnwdVar6 = dnwd.b;
                                                            }
                                                            if (!set6.contains(dnwdVar6.a)) {
                                                                break;
                                                            }
                                                        } else {
                                                            Iterator<dnfm> it7 = bX.k.iterator();
                                                            while (true) {
                                                                if (!it7.hasNext()) {
                                                                    dnfmVar = 0;
                                                                    break;
                                                                }
                                                                dnfmVar = it7.next();
                                                                Set<String> set7 = iloVar.e;
                                                                dnwd dnwdVar7 = dnfmVar.g;
                                                                if (dnwdVar7 == null) {
                                                                    dnwdVar7 = dnwd.b;
                                                                }
                                                                if (!set7.contains(dnwdVar7.a)) {
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (dnfmVar != 0) {
                if (dnfmVar instanceof dnjj) {
                    return new bikj((dnjj) dnfmVar);
                }
                if (dnfmVar instanceof dobz) {
                    return new bikm((dobz) dnfmVar);
                }
                if (dnfmVar instanceof dnfu) {
                    return new bikh((dnfu) dnfmVar, context);
                }
                if (dnfmVar instanceof doqp) {
                    return new bikn((doqp) dnfmVar, context);
                }
                if (dnfmVar instanceof dnnz) {
                    return new bikl((dnnz) dnfmVar, context);
                }
                if (dnfmVar instanceof dnjy) {
                    return new bikk((dnjy) dnfmVar, context);
                }
                if (dnfmVar instanceof dnfm) {
                    return new bikg((dnfm) dnfmVar);
                }
            }
            return a;
        }
        return a;
    }
}
