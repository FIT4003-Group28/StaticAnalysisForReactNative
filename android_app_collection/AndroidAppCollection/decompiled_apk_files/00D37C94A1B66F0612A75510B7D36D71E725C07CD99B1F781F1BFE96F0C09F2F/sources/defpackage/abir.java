package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: abir  reason: default package */
/* loaded from: classes.dex */
public final class abir {
    public static final abiq a(abha abhaVar, acti actiVar, acth acthVar, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12, azqb azqbVar13, azqb azqbVar14, azqb azqbVar15) {
        ((Context) azqbVar.get()).getClass();
        aaza aazaVar = (aaza) azqbVar2.get();
        aazaVar.getClass();
        aayw aaywVar = (aayw) azqbVar3.get();
        aaywVar.getClass();
        agca agcaVar = (agca) azqbVar4.get();
        agcaVar.getClass();
        yni yniVar = (yni) azqbVar5.get();
        yniVar.getClass();
        airr airrVar = (airr) azqbVar6.get();
        airrVar.getClass();
        yzj yzjVar = (yzj) azqbVar7.get();
        yzjVar.getClass();
        Handler handler = (Handler) azqbVar8.get();
        handler.getClass();
        ajvj ajvjVar = (ajvj) azqbVar9.get();
        ajvjVar.getClass();
        abkl abklVar = (abkl) azqbVar10.get();
        abklVar.getClass();
        abic abicVar = (abic) azqbVar11.get();
        abicVar.getClass();
        abiy abiyVar = (abiy) azqbVar12.get();
        abiyVar.getClass();
        ((ajin) azqbVar13.get()).getClass();
        aagi aagiVar = (aagi) azqbVar14.get();
        aagiVar.getClass();
        abka abkaVar = (abka) azqbVar15.get();
        abkaVar.getClass();
        abhaVar.getClass();
        acthVar.getClass();
        return new abiq(aazaVar, aaywVar, agcaVar, yniVar, airrVar, yzjVar, handler, ajvjVar, abklVar, abicVar, abiyVar, aagiVar, abkaVar, abhaVar, actiVar, acthVar);
    }

    public static List b(String str) {
        aopa createBuilder = aoxq.a.createBuilder();
        createBuilder.copyOnWrite();
        aoxq aoxqVar = (aoxq) createBuilder.instance;
        aoxqVar.b |= 1;
        aoxqVar.c = str;
        aoxq aoxqVar2 = (aoxq) createBuilder.mo39build();
        aopa createBuilder2 = aoxp.a.createBuilder();
        createBuilder2.copyOnWrite();
        aoxp aoxpVar = (aoxp) createBuilder2.instance;
        aoxqVar2.getClass();
        aoxpVar.c = aoxqVar2;
        aoxpVar.b |= 1;
        return Arrays.asList((aoxp) createBuilder2.mo39build());
    }

    public static abcp c(apwh apwhVar) {
        abco abcoVar = new abco();
        abcoVar.a = Boolean.valueOf(apwhVar.i);
        abcoVar.b = Boolean.valueOf(apwhVar.j);
        abcoVar.c = Boolean.valueOf(apwhVar.f);
        abcoVar.d = Boolean.valueOf(apwhVar.h);
        abcoVar.e = Boolean.valueOf(apwhVar.g);
        abcoVar.f = amuk.o(new aops(apwhVar.k, apwh.a));
        Boolean bool = abcoVar.a;
        if (bool == null || abcoVar.b == null || abcoVar.c == null || abcoVar.d == null || abcoVar.e == null || abcoVar.f == null) {
            StringBuilder sb = new StringBuilder();
            if (abcoVar.a == null) {
                sb.append(" isCrossDeviceOfflineEnabled");
            }
            if (abcoVar.b == null) {
                sb.append(" isFullHdFormatOptionAvailable");
            }
            if (abcoVar.c == null) {
                sb.append(" isRecommendationsEnabled");
            }
            if (abcoVar.d == null) {
                sb.append(" isDownloadQualityEnabled");
            }
            if (abcoVar.e == null) {
                sb.append(" shouldDisplaySmartDownloads");
            }
            if (abcoVar.f == null) {
                sb.append(" downloadQualityFormats");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new abcp(bool.booleanValue(), abcoVar.b.booleanValue(), abcoVar.c.booleanValue(), abcoVar.d.booleanValue(), abcoVar.e.booleanValue(), abcoVar.f);
    }

    public static List d(ascu ascuVar, List list) {
        aonk aonkVar;
        aurh aurhVar;
        aqtb aqtbVar;
        aurd aurdVar;
        apwr apwrVar;
        apwq apwqVar;
        apws apwsVar;
        apwh apwhVar;
        apwi apwiVar;
        apwm apwmVar;
        apwo apwoVar;
        apwj apwjVar;
        apwk apwkVar;
        apwp apwpVar;
        aoob aoobVar;
        aurh aurhVar2;
        ArrayList arrayList = new ArrayList();
        if (ascuVar == null) {
            return arrayList;
        }
        int i = ascuVar.b;
        if (i == 88478200) {
            apwh apwhVar2 = (apwh) ascuVar.c;
            if (apwhVar2.e) {
                arrayList.add(c(apwhVar2));
            }
            if (apwhVar2.d) {
                arrayList.add(new abci());
            }
        } else {
            if (i == 61520386) {
                aonkVar = (aurj) ascuVar.c;
            } else if (i == 66930374) {
                aonkVar = (aurh) ascuVar.c;
            } else if (i == 153515154) {
                aonkVar = (aqtb) ascuVar.c;
            } else if (i == 85446662) {
                aonkVar = (auqx) ascuVar.c;
            } else if (i == 155905127) {
                aonkVar = (arct) ascuVar.c;
            } else if (i == 93763033) {
                aonkVar = (aurd) ascuVar.c;
            } else if (i == 94214034) {
                aonkVar = (apwr) ascuVar.c;
            } else if (i == 173548507) {
                aonkVar = (apwq) ascuVar.c;
            } else if (i == 144484052) {
                aonkVar = (apws) ascuVar.c;
            } else if (i == 88478200) {
                aonkVar = (apwh) ascuVar.c;
            } else if (i == 124189785) {
                aonkVar = (apwi) ascuVar.c;
            } else if (i == 203803278) {
                aonkVar = (apwm) ascuVar.c;
            } else if (i == 230577543) {
                aonkVar = (apwo) ascuVar.c;
            } else if (i == 324886099) {
                aonkVar = (apwj) ascuVar.c;
            } else if (i == 359641852) {
                aonkVar = (apwk) ascuVar.c;
            } else if (i == 369870935) {
                aonkVar = (apwp) ascuVar.c;
                i = 369870935;
            } else {
                aonkVar = null;
            }
            if (aonkVar != null) {
                if (i == 66930374) {
                    aurhVar = (aurh) ascuVar.c;
                } else {
                    aurhVar = aurh.a;
                }
                if ((aurhVar.b & 64) != 0) {
                    if (ascuVar.b == 66930374) {
                        aurhVar2 = (aurh) ascuVar.c;
                    } else {
                        aurhVar2 = aurh.a;
                    }
                    aoobVar = aurhVar2.f;
                } else {
                    if (ascuVar.b == 153515154) {
                        aqtbVar = (aqtb) ascuVar.c;
                    } else {
                        aqtbVar = aqtb.a;
                    }
                    if ((aqtbVar.b & 8) == 0) {
                        if (ascuVar.b == 93763033) {
                            aurdVar = (aurd) ascuVar.c;
                        } else {
                            aurdVar = aurd.a;
                        }
                        if ((aurdVar.b & 8) == 0) {
                            if (ascuVar.b == 94214034) {
                                apwrVar = (apwr) ascuVar.c;
                            } else {
                                apwrVar = apwr.a;
                            }
                            if ((apwrVar.b & 16) == 0) {
                                if (ascuVar.b == 173548507) {
                                    apwqVar = (apwq) ascuVar.c;
                                } else {
                                    apwqVar = apwq.a;
                                }
                                if ((apwqVar.b & 16) == 0) {
                                    if (ascuVar.b == 144484052) {
                                        apwsVar = (apws) ascuVar.c;
                                    } else {
                                        apwsVar = apws.a;
                                    }
                                    if ((apwsVar.b & 8) == 0) {
                                        if (ascuVar.b == 88478200) {
                                            apwhVar = (apwh) ascuVar.c;
                                        } else {
                                            apwhVar = apwh.b;
                                        }
                                        if ((apwhVar.c & 512) == 0) {
                                            if (ascuVar.b == 124189785) {
                                                apwiVar = (apwi) ascuVar.c;
                                            } else {
                                                apwiVar = apwi.a;
                                            }
                                            if ((apwiVar.b & 8) == 0) {
                                                if (ascuVar.b == 203803278) {
                                                    apwmVar = (apwm) ascuVar.c;
                                                } else {
                                                    apwmVar = apwm.a;
                                                }
                                                if ((apwmVar.b & 4) == 0) {
                                                    if (ascuVar.b == 230577543) {
                                                        apwoVar = (apwo) ascuVar.c;
                                                    } else {
                                                        apwoVar = apwo.a;
                                                    }
                                                    if ((apwoVar.b & 8) == 0) {
                                                        if (ascuVar.b == 324886099) {
                                                            apwjVar = (apwj) ascuVar.c;
                                                        } else {
                                                            apwjVar = apwj.a;
                                                        }
                                                        if ((apwjVar.b & 8) == 0) {
                                                            if (ascuVar.b == 359641852) {
                                                                apwkVar = (apwk) ascuVar.c;
                                                            } else {
                                                                apwkVar = apwk.a;
                                                            }
                                                            if ((apwkVar.b & 16) == 0) {
                                                                if (ascuVar.b == 369870935) {
                                                                    apwpVar = (apwp) ascuVar.c;
                                                                } else {
                                                                    apwpVar = apwp.a;
                                                                }
                                                                if ((apwpVar.b & 16) == 0) {
                                                                    aoobVar = aoob.b;
                                                                } else {
                                                                    aoobVar = (ascuVar.b == 369870935 ? (apwp) ascuVar.c : apwp.a).e;
                                                                }
                                                            } else {
                                                                aoobVar = (ascuVar.b == 359641852 ? (apwk) ascuVar.c : apwk.a).e;
                                                            }
                                                        } else {
                                                            aoobVar = (ascuVar.b == 324886099 ? (apwj) ascuVar.c : apwj.a).e;
                                                        }
                                                    } else {
                                                        aoobVar = (ascuVar.b == 230577543 ? (apwo) ascuVar.c : apwo.a).c;
                                                    }
                                                } else {
                                                    aoobVar = (ascuVar.b == 203803278 ? (apwm) ascuVar.c : apwm.a).c;
                                                }
                                            } else {
                                                aoobVar = (ascuVar.b == 124189785 ? (apwi) ascuVar.c : apwi.a).c;
                                            }
                                        } else {
                                            aoobVar = (ascuVar.b == 88478200 ? (apwh) ascuVar.c : apwh.b).l;
                                        }
                                    } else {
                                        aoobVar = (ascuVar.b == 144484052 ? (apws) ascuVar.c : apws.a).e;
                                    }
                                } else {
                                    aoobVar = (ascuVar.b == 173548507 ? (apwq) ascuVar.c : apwq.a).e;
                                }
                            } else {
                                aoobVar = (ascuVar.b == 94214034 ? (apwr) ascuVar.c : apwr.a).f;
                            }
                        } else {
                            aoobVar = (ascuVar.b == 93763033 ? (aurd) ascuVar.c : aurd.a).e;
                        }
                    } else {
                        aoobVar = (ascuVar.b == 153515154 ? (aqtb) ascuVar.c : aqtb.a).e;
                    }
                }
                if (list != null && !aoobVar.H()) {
                    list.add(aoobVar.I());
                }
                arrayList.add(aonkVar);
            }
        }
        return arrayList;
    }
}
