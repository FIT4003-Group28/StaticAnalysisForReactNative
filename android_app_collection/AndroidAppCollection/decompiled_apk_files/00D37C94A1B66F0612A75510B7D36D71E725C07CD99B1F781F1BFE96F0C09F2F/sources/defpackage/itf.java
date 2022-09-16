package defpackage;

import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.InlinePlaybackRendererOuterClass;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: itf  reason: default package */
/* loaded from: classes3.dex */
public final class itf implements aadj {
    private final AtomicBoolean a = new AtomicBoolean();
    private final axnm b;
    private final aacz c;

    public itf(aacz aaczVar, axnm axnmVar) {
        this.c = aaczVar;
        this.b = axnmVar;
    }

    private final amuk b(long j, String str, avhn avhnVar) {
        if ((j & 64) != 0) {
            apoc a = apod.a();
            a.copyOnWrite();
            ((apod) a.instance).h(str);
            a.copyOnWrite();
            ((apod) a.instance).g(true);
            if (avhnVar != null && !avhnVar.c.isEmpty()) {
                String str2 = ((avhm) avhnVar.c.get(0)).c;
                a.copyOnWrite();
                ((apod) a.instance).i(str2);
                int size = avhnVar.c.size();
                a.copyOnWrite();
                ((apod) a.instance).j(size);
            }
            arrf a2 = arrh.a();
            a2.copyOnWrite();
            ((arrh) a2.instance).ce((apod) a.mo39build());
            ((acrr) this.b.get()).c((arrh) a2.mo39build());
        }
        return avhnVar != null ? amuk.r(avhnVar) : amuk.q();
    }

    @Override // defpackage.aadj
    public final /* bridge */ /* synthetic */ List a(Object obj) {
        avfo avfoVar;
        avhn avhnVar;
        if (this.a.compareAndSet(false, true) && (obj instanceof arlt)) {
            arlt arltVar = (arlt) obj;
            if ((arltVar.b & 64) != 0) {
                aveq aveqVar = this.c.b().u;
                if (aveqVar == null) {
                    aveqVar = aveq.a;
                }
                long j = aveqVar.r;
                arlu arluVar = arltVar.f;
                if (arluVar == null) {
                    arluVar = arlu.a;
                }
                if (arluVar.b != 58173949) {
                    return amuk.q();
                }
                aopu aopuVar = ((armc) arluVar.c).c;
                if (aopuVar.size() <= 0) {
                    return amuk.q();
                }
                arlw arlwVar = (arlw) aopuVar.get(0);
                if (arlwVar.b == 58174010) {
                    avfoVar = (avfo) arlwVar.c;
                } else {
                    avfoVar = avfo.a;
                }
                apzg apzgVar = avfoVar.d;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                if (apzgVar.qn(BrowseEndpointOuterClass.browseEndpoint)) {
                    apzg apzgVar2 = avfoVar.d;
                    if (apzgVar2 == null) {
                        apzgVar2 = apzg.a;
                    }
                    if (((apnv) apzgVar2.qm(BrowseEndpointOuterClass.browseEndpoint)).c.equals("FEwhat_to_watch")) {
                        avfk avfkVar = avfoVar.k;
                        if (avfkVar == null) {
                            avfkVar = avfk.a;
                        }
                        if ((avfkVar.b & 1) == 0) {
                            return amuk.q();
                        }
                        avfk avfkVar2 = avfoVar.k;
                        if (avfkVar2 == null) {
                            avfkVar2 = avfk.a;
                        }
                        auqh auqhVar = avfkVar2.c;
                        if (auqhVar == null) {
                            auqhVar = auqh.a;
                        }
                        aopu aopuVar2 = auqhVar.d;
                        if (aopuVar2.size() <= 0 || (((auqk) aopuVar2.get(0)).b & 16) == 0) {
                            return amuk.q();
                        }
                        aslq aslqVar = ((auqk) aopuVar2.get(0)).j;
                        if (aslqVar == null) {
                            aslqVar = aslq.a;
                        }
                        aopu aopuVar3 = aslqVar.e;
                        if (aopuVar3.size() <= 0) {
                            return amuk.q();
                        }
                        aslt asltVar = (aslt) aopuVar3.get(0);
                        int i = asltVar.f;
                        if ((524288 & i) != 0) {
                            if ((1 & j) != 0) {
                                auhu auhuVar = asltVar.aj;
                                if (auhuVar == null) {
                                    auhuVar = auhu.a;
                                }
                                String simpleName = auhuVar.getClass().getSimpleName();
                                auhs auhsVar = auhuVar.c;
                                if (auhsVar == null) {
                                    auhsVar = auhs.a;
                                }
                                avhn avhnVar2 = auhsVar.d;
                                if (avhnVar2 == null) {
                                    avhnVar2 = avhn.a;
                                }
                                return b(j, simpleName, avhnVar2);
                            }
                            return amuk.q();
                        } else if ((Integer.MIN_VALUE & i) != 0) {
                            if ((2 & j) != 0) {
                                auim auimVar = asltVar.ap;
                                if (auimVar == null) {
                                    auimVar = auim.a;
                                }
                                String simpleName2 = auimVar.getClass().getSimpleName();
                                auil auilVar = auimVar.c;
                                if (auilVar == null) {
                                    auilVar = auil.a;
                                }
                                avhn avhnVar3 = auilVar.c;
                                if (avhnVar3 == null) {
                                    avhnVar3 = avhn.a;
                                }
                                return b(j, simpleName2, avhnVar3);
                            }
                            return amuk.q();
                        } else {
                            int i2 = asltVar.d;
                            if ((i2 & 512) != 0) {
                                if ((4 & j) != 0) {
                                    aujj aujjVar = asltVar.aa;
                                    if (aujjVar == null) {
                                        aujjVar = aujj.a;
                                    }
                                    String simpleName3 = aujjVar.getClass().getSimpleName();
                                    aunb aunbVar = aujjVar.c;
                                    if (aunbVar == null) {
                                        aunbVar = aunb.a;
                                    }
                                    avhn avhnVar4 = ((arjw) aunbVar.qm(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer)).c;
                                    if (avhnVar4 == null) {
                                        avhnVar4 = avhn.a;
                                    }
                                    return b(j, simpleName3, avhnVar4);
                                }
                                return amuk.q();
                            } else if ((134217728 & i) != 0) {
                                if ((8 & j) != 0) {
                                    auiw auiwVar = asltVar.al;
                                    if (auiwVar == null) {
                                        auiwVar = auiw.a;
                                    }
                                    String simpleName4 = auiwVar.getClass().getSimpleName();
                                    auik auikVar = auiwVar.c;
                                    if (auikVar == null) {
                                        auikVar = auik.a;
                                    }
                                    avhn avhnVar5 = auikVar.c;
                                    if (avhnVar5 == null) {
                                        avhnVar5 = avhn.a;
                                    }
                                    return b(j, simpleName4, avhnVar5);
                                }
                                return amuk.q();
                            } else if ((131072 & i) != 0) {
                                if ((16 & j) != 0) {
                                    auhq auhqVar = asltVar.ai;
                                    if (auhqVar == null) {
                                        auhqVar = auhq.a;
                                    }
                                    String simpleName5 = auhqVar.getClass().getSimpleName();
                                    auik auikVar2 = auhqVar.c;
                                    if (auikVar2 == null) {
                                        auikVar2 = auik.a;
                                    }
                                    avhn avhnVar6 = auikVar2.c;
                                    if (avhnVar6 == null) {
                                        avhnVar6 = avhn.a;
                                    }
                                    return b(j, simpleName5, avhnVar6);
                                }
                                return amuk.q();
                            } else if ((asltVar.h & 1048576) != 0) {
                                if ((32 & j) != 0) {
                                    aqtb aqtbVar = asltVar.av;
                                    if (aqtbVar == null) {
                                        aqtbVar = aqtb.a;
                                    }
                                    String simpleName6 = aqtbVar.getClass().getSimpleName();
                                    try {
                                        awow awowVar = ((awnn) aopi.parseFrom(awnn.a, ajhm.a(aqtbVar), aoos.b())).c;
                                        if (awowVar == null) {
                                            awowVar = awow.a;
                                        }
                                        awnc awncVar = ((awmx) awowVar.qm(awmx.b)).e;
                                        if (awncVar == null) {
                                            awncVar = awnc.a;
                                        }
                                        awqa awqaVar = ((awqb) awncVar.qm(awqb.b)).c;
                                        if (awqaVar == null) {
                                            awqaVar = awqa.a;
                                        }
                                        awpx awpxVar = awqaVar.b;
                                        if (awpxVar == null) {
                                            awpxVar = awpx.a;
                                        }
                                        awpz awpzVar = awpxVar.b;
                                        if (awpzVar == null) {
                                            awpzVar = awpz.a;
                                        }
                                        awny awnyVar = awpzVar.b;
                                        if (awnyVar == null) {
                                            awnyVar = awny.a;
                                        }
                                        avhnVar = aolu.u(awnyVar);
                                    } catch (aopx unused) {
                                        zep.b("Failed to parse ElementRenderer when crawling for first Home thumbnail");
                                        avhnVar = null;
                                    }
                                    return b(j, simpleName6, avhnVar);
                                }
                                return amuk.q();
                            } else if ((1073741824 & i) != 0) {
                                if ((128 & j) != 0) {
                                    auin auinVar = asltVar.ao;
                                    if (auinVar == null) {
                                        auinVar = auin.a;
                                    }
                                    String simpleName7 = auinVar.getClass().getSimpleName();
                                    auil auilVar2 = auinVar.c;
                                    if (auilVar2 == null) {
                                        auilVar2 = auil.a;
                                    }
                                    avhn avhnVar7 = auilVar2.c;
                                    if (avhnVar7 == null) {
                                        avhnVar7 = avhn.a;
                                    }
                                    return b(j, simpleName7, avhnVar7);
                                }
                                return amuk.q();
                            } else {
                                int i3 = asltVar.g;
                                if ((i3 & 2) != 0) {
                                    if ((256 & j) != 0) {
                                        auio auioVar = asltVar.aq;
                                        if (auioVar == null) {
                                            auioVar = auio.a;
                                        }
                                        String simpleName8 = auioVar.getClass().getSimpleName();
                                        auil auilVar3 = auioVar.c;
                                        if (auilVar3 == null) {
                                            auilVar3 = auil.a;
                                        }
                                        avhn avhnVar8 = auilVar3.c;
                                        if (avhnVar8 == null) {
                                            avhnVar8 = avhn.a;
                                        }
                                        return b(j, simpleName8, avhnVar8);
                                    }
                                    return amuk.q();
                                } else if ((i3 & 8) != 0) {
                                    if ((512 & j) != 0) {
                                        auip auipVar = asltVar.as;
                                        if (auipVar == null) {
                                            auipVar = auip.a;
                                        }
                                        String simpleName9 = auipVar.getClass().getSimpleName();
                                        auil auilVar4 = auipVar.c;
                                        if (auilVar4 == null) {
                                            auilVar4 = auil.a;
                                        }
                                        avhn avhnVar9 = auilVar4.c;
                                        if (avhnVar9 == null) {
                                            avhnVar9 = avhn.a;
                                        }
                                        return b(j, simpleName9, avhnVar9);
                                    }
                                    return amuk.q();
                                } else if ((i3 & 4) != 0) {
                                    if ((1024 & j) != 0) {
                                        auiq auiqVar = asltVar.ar;
                                        if (auiqVar == null) {
                                            auiqVar = auiq.a;
                                        }
                                        String simpleName10 = auiqVar.getClass().getSimpleName();
                                        auil auilVar5 = auiqVar.c;
                                        if (auilVar5 == null) {
                                            auilVar5 = auil.a;
                                        }
                                        avhn avhnVar10 = auilVar5.c;
                                        if (avhnVar10 == null) {
                                            avhnVar10 = avhn.a;
                                        }
                                        return b(j, simpleName10, avhnVar10);
                                    }
                                    return amuk.q();
                                } else if ((67108864 & i) != 0) {
                                    if ((2048 & j) != 0) {
                                        auiv auivVar = asltVar.ak;
                                        if (auivVar == null) {
                                            auivVar = auiv.a;
                                        }
                                        String simpleName11 = auivVar.getClass().getSimpleName();
                                        auik auikVar3 = auivVar.c;
                                        if (auikVar3 == null) {
                                            auikVar3 = auik.a;
                                        }
                                        avhn avhnVar11 = auikVar3.c;
                                        if (avhnVar11 == null) {
                                            avhnVar11 = avhn.a;
                                        }
                                        return b(j, simpleName11, avhnVar11);
                                    }
                                    return amuk.q();
                                } else if ((268435456 & i) != 0) {
                                    if ((4096 & j) != 0) {
                                        auix auixVar = asltVar.am;
                                        if (auixVar == null) {
                                            auixVar = auix.a;
                                        }
                                        String simpleName12 = auixVar.getClass().getSimpleName();
                                        auik auikVar4 = auixVar.c;
                                        if (auikVar4 == null) {
                                            auikVar4 = auik.a;
                                        }
                                        avhn avhnVar12 = auikVar4.c;
                                        if (avhnVar12 == null) {
                                            avhnVar12 = avhn.a;
                                        }
                                        return b(j, simpleName12, avhnVar12);
                                    }
                                    return amuk.q();
                                } else if ((i & 536870912) != 0) {
                                    if ((8192 & j) != 0) {
                                        auiz auizVar = asltVar.an;
                                        if (auizVar == null) {
                                            auizVar = auiz.a;
                                        }
                                        String simpleName13 = auizVar.getClass().getSimpleName();
                                        auiy auiyVar = auizVar.c;
                                        if (auiyVar == null) {
                                            auiyVar = auiy.a;
                                        }
                                        avhn avhnVar13 = auiyVar.c;
                                        if (avhnVar13 == null) {
                                            avhnVar13 = avhn.a;
                                        }
                                        return b(j, simpleName13, avhnVar13);
                                    }
                                    return amuk.q();
                                } else if ((i2 & 256) != 0) {
                                    if ((16384 & j) != 0) {
                                        aujm aujmVar = asltVar.Z;
                                        if (aujmVar == null) {
                                            aujmVar = aujm.a;
                                        }
                                        String simpleName14 = aujmVar.getClass().getSimpleName();
                                        avhn avhnVar14 = aujmVar.c;
                                        if (avhnVar14 == null) {
                                            avhnVar14 = avhn.a;
                                        }
                                        return b(j, simpleName14, avhnVar14);
                                    }
                                    return amuk.q();
                                } else if ((j & 64) != 0) {
                                    return amuk.q();
                                } else {
                                    String simpleName15 = aakx.b(asltVar).getClass().getSimpleName();
                                    apoc a = apod.a();
                                    a.copyOnWrite();
                                    ((apod) a.instance).j(0);
                                    a.copyOnWrite();
                                    ((apod) a.instance).h(simpleName15);
                                    a.copyOnWrite();
                                    ((apod) a.instance).g(false);
                                    arrf a2 = arrh.a();
                                    a2.copyOnWrite();
                                    ((arrh) a2.instance).ce((apod) a.mo39build());
                                    ((acrr) this.b.get()).c((arrh) a2.mo39build());
                                    return amuk.q();
                                }
                            }
                        }
                    }
                }
                return amuk.q();
            }
        }
        return amuk.q();
    }
}
