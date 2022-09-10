package defpackage;

import java.io.IOException;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bslz  reason: default package */
/* loaded from: classes4.dex */
public final class bslz {
    private static final dcqe a = dcqe.c("bslz");
    private static final dcep<Integer> b = dcep.F(1, 2, 3, 5, 42);
    private static final bslv c = new bslv();

    public static dfos a(Map<Integer, Set<dspd>> map) {
        djjp djjpVar;
        djjt djjtVar;
        djmf djmfVar;
        djny djnyVar;
        djmr djmrVar;
        dfor bZ = dfos.g.bZ();
        for (Map.Entry<Integer, Set<dspd>> entry : map.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                int intValue = entry.getKey().intValue();
                dcep<Integer> dcepVar = b;
                Integer valueOf = Integer.valueOf(intValue);
                if (!dcepVar.contains(valueOf)) {
                    bvoo.h("Attempted translation of an unsupported refinement in SRM: %d.", valueOf);
                } else {
                    for (dspd dspdVar : entry.getValue()) {
                        try {
                            dsqa b2 = dsqa.b();
                            djmv djmvVar = djmv.c;
                            try {
                                dspj s = dspdVar.s();
                                dsqw dsqwVar = (dsqw) djmvVar.cu(4);
                                try {
                                    dstc b3 = dsst.a.b(dsqwVar);
                                    b3.f(dsqwVar, dspk.n(s), b2);
                                    b3.j(dsqwVar);
                                    try {
                                        s.b(0);
                                        dsqw.cv(dsqwVar);
                                        djmv djmvVar2 = (djmv) dsqwVar;
                                        if (intValue == 1) {
                                            bslv bslvVar = c;
                                            if (djmvVar2.a != 1) {
                                                djmrVar = djmr.c;
                                            } else {
                                                djmrVar = (djmr) djmvVar2.b;
                                            }
                                            dfpk a2 = bslvVar.a(djmrVar);
                                            if (bZ.c) {
                                                bZ.bF();
                                                bZ.c = false;
                                            }
                                            dfos dfosVar = (dfos) bZ.b;
                                            a2.getClass();
                                            dfosVar.b = a2;
                                            dfosVar.a = 2 | dfosVar.a;
                                        } else if (intValue == 2) {
                                            if (djmvVar2.a != 2) {
                                                djnyVar = djny.c;
                                            } else {
                                                djnyVar = (djny) djmvVar2.b;
                                            }
                                            dfpu b4 = bsly.b(djnyVar);
                                            if (bZ.c) {
                                                bZ.bF();
                                                bZ.c = false;
                                            }
                                            dfos dfosVar2 = (dfos) bZ.b;
                                            b4.getClass();
                                            dfosVar2.c = b4;
                                            dfosVar2.a |= 4;
                                        } else if (intValue == 3) {
                                            if (djmvVar2.a != 3) {
                                                djmfVar = djmf.c;
                                            } else {
                                                djmfVar = (djmf) djmvVar2.b;
                                            }
                                            dfpe b5 = bslt.b(djmfVar);
                                            if (bZ.c) {
                                                bZ.bF();
                                                bZ.c = false;
                                            }
                                            dfos dfosVar3 = (dfos) bZ.b;
                                            b5.getClass();
                                            dfosVar3.d = b5;
                                            dfosVar3.a |= 8;
                                        } else if (intValue == 5) {
                                            if (djmvVar2.a != 5) {
                                                djjtVar = djjt.c;
                                            } else {
                                                djjtVar = (djjt) djmvVar2.b;
                                            }
                                            dfow b6 = bsln.b(djjtVar);
                                            if (bZ.c) {
                                                bZ.bF();
                                                bZ.c = false;
                                            }
                                            dfos dfosVar4 = (dfos) bZ.b;
                                            b6.getClass();
                                            dfosVar4.e = b6;
                                            dfosVar4.a |= 16;
                                        } else if (intValue == 42) {
                                            if (djmvVar2.a != 27) {
                                                djjpVar = djjp.c;
                                            } else {
                                                djjpVar = (djjp) djmvVar2.b;
                                            }
                                            dfou b7 = bslm.b(djjpVar);
                                            if (bZ.c) {
                                                bZ.bF();
                                                bZ.c = false;
                                            }
                                            dfos dfosVar5 = (dfos) bZ.b;
                                            b7.getClass();
                                            dfosVar5.f = b7;
                                            dfosVar5.a |= 32;
                                        }
                                    } catch (dsrm e) {
                                        throw e;
                                    }
                                } catch (IOException e2) {
                                    if (!(e2.getCause() instanceof dsrm)) {
                                        throw new dsrm(e2.getMessage());
                                    }
                                    throw ((dsrm) e2.getCause());
                                } catch (RuntimeException e3) {
                                    if (e3.getCause() instanceof dsrm) {
                                        throw ((dsrm) e3.getCause());
                                    }
                                    throw e3;
                                }
                            } catch (dsrm e4) {
                                throw e4;
                            }
                        } catch (dsrm unused) {
                            bvoo.h("Error parsing GMM refinement bytestring.", new Object[0]);
                        }
                    }
                }
            }
        }
        return bZ.bK();
    }
}
