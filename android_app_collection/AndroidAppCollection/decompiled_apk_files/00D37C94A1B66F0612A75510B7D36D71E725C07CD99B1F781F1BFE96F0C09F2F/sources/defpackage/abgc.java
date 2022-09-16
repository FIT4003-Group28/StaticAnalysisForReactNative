package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: abgc  reason: default package */
/* loaded from: classes.dex */
public final class abgc {
    public abgc() {
    }

    public abgc(avmu avmuVar) {
        avmuVar.getClass();
    }

    public static Uri a(audg audgVar) {
        if (audgVar.s.isEmpty()) {
            return null;
        }
        return Uri.parse(audgVar.s);
    }

    public static List b(audg audgVar) {
        ArrayList arrayList = new ArrayList();
        for (audl audlVar : audgVar.v) {
            int i = audlVar.b;
            if ((i & 1) != 0) {
                atof atofVar = audlVar.c;
                if (atofVar == null) {
                    atofVar = atof.a;
                }
                arrayList.add(ajna.g(atofVar));
            } else if ((i & 4) != 0) {
                augq augqVar = audlVar.e;
                if (augqVar == null) {
                    augqVar = augq.a;
                }
                arrayList.add(ajna.g(augqVar));
            } else if ((i & 2) != 0) {
                atoh atohVar = audlVar.d;
                if (atohVar == null) {
                    atohVar = atoh.a;
                }
                arrayList.add(ajna.g(atohVar));
            } else if ((i & 8) != 0) {
                aumx aumxVar = audlVar.f;
                if (aumxVar == null) {
                    aumxVar = aumx.a;
                }
                arrayList.add(ajna.g(aumxVar));
            }
        }
        return arrayList;
    }

    public static aoob c(aten atenVar) {
        int i = atenVar.b;
        if ((i & 1) != 0) {
            ateo ateoVar = atenVar.c;
            if (ateoVar == null) {
                ateoVar = ateo.a;
            }
            return ateoVar.f;
        } else if ((i & 2) != 0) {
            ater aterVar = atenVar.d;
            if (aterVar == null) {
                aterVar = ater.a;
            }
            return aterVar.g;
        } else if ((i & 16) != 0) {
            atej atejVar = atenVar.g;
            if (atejVar == null) {
                atejVar = atej.a;
            }
            return atejVar.f;
        } else if ((i & 32) != 0) {
            atek atekVar = atenVar.h;
            if (atekVar == null) {
                atekVar = atek.a;
            }
            return atekVar.f;
        } else if ((i & 8) != 0) {
            atex atexVar = atenVar.f;
            if (atexVar == null) {
                atexVar = atex.a;
            }
            return atexVar.j;
        } else if ((i & 1024) == 0) {
            return aoob.b;
        } else {
            avqs avqsVar = atenVar.m;
            if (avqsVar == null) {
                avqsVar = avqs.a;
            }
            return avqsVar.g;
        }
    }

    public static apzg d(aten atenVar) {
        int i = atenVar.b;
        if ((i & 1) != 0) {
            ateo ateoVar = atenVar.c;
            if (ateoVar == null) {
                ateoVar = ateo.a;
            }
            if ((ateoVar.b & 4) == 0) {
                return null;
            }
            ateo ateoVar2 = atenVar.c;
            if (ateoVar2 == null) {
                ateoVar2 = ateo.a;
            }
            apzg apzgVar = ateoVar2.e;
            return apzgVar == null ? apzg.a : apzgVar;
        } else if ((i & 16) == 0) {
            if ((i & 1024) == 0) {
                return null;
            }
            avqs avqsVar = atenVar.m;
            if (avqsVar == null) {
                avqsVar = avqs.a;
            }
            apzg apzgVar2 = avqsVar.f;
            return apzgVar2 == null ? apzg.a : apzgVar2;
        } else {
            atej atejVar = atenVar.g;
            if (atejVar == null) {
                atejVar = atej.a;
            }
            if ((atejVar.b & 4) == 0) {
                return null;
            }
            atej atejVar2 = atenVar.g;
            if (atejVar2 == null) {
                atejVar2 = atej.a;
            }
            apzg apzgVar3 = atejVar2.e;
            return apzgVar3 == null ? apzg.a : apzgVar3;
        }
    }

    public static apzg e(aten atenVar) {
        int i = atenVar.b;
        if ((i & 2) != 0) {
            ater aterVar = atenVar.d;
            if (aterVar == null) {
                aterVar = ater.a;
            }
            if ((aterVar.b & 8) == 0) {
                return null;
            }
            ater aterVar2 = atenVar.d;
            if (aterVar2 == null) {
                aterVar2 = ater.a;
            }
            apzg apzgVar = aterVar2.e;
            return apzgVar == null ? apzg.a : apzgVar;
        } else if ((i & 32) != 0) {
            atek atekVar = atenVar.h;
            if (atekVar == null) {
                atekVar = atek.a;
            }
            if ((atekVar.b & 4) == 0) {
                return null;
            }
            atek atekVar2 = atenVar.h;
            if (atekVar2 == null) {
                atekVar2 = atek.a;
            }
            apzg apzgVar2 = atekVar2.e;
            return apzgVar2 == null ? apzg.a : apzgVar2;
        } else {
            if ((i & 8) != 0) {
                atex atexVar = atenVar.f;
                if (atexVar == null) {
                    atexVar = atex.a;
                }
                if (atexVar.i) {
                    atex atexVar2 = atenVar.f;
                    if (atexVar2 == null) {
                        atexVar2 = atex.a;
                    }
                    if ((atexVar2.b & 128) == 0) {
                        return null;
                    }
                    atex atexVar3 = atenVar.f;
                    if (atexVar3 == null) {
                        atexVar3 = atex.a;
                    }
                    apzg apzgVar3 = atexVar3.h;
                    return apzgVar3 == null ? apzg.a : apzgVar3;
                }
                atex atexVar4 = atenVar.f;
                if (atexVar4 == null) {
                    atexVar4 = atex.a;
                }
                if ((atexVar4.b & 8) != 0) {
                    atex atexVar5 = atenVar.f;
                    if (atexVar5 == null) {
                        atexVar5 = atex.a;
                    }
                    apzg apzgVar4 = atexVar5.e;
                    return apzgVar4 == null ? apzg.a : apzgVar4;
                }
            }
            return null;
        }
    }

    public static arhs f(aten atenVar) {
        int i = atenVar.b;
        if ((i & 1) != 0) {
            ateo ateoVar = atenVar.c;
            if (ateoVar == null) {
                ateoVar = ateo.a;
            }
            arhs arhsVar = ateoVar.d;
            return arhsVar == null ? arhs.a : arhsVar;
        } else if ((i & 2) != 0) {
            ater aterVar = atenVar.d;
            if (aterVar == null) {
                aterVar = ater.a;
            }
            arhs arhsVar2 = aterVar.d;
            return arhsVar2 == null ? arhs.a : arhsVar2;
        } else if ((i & 16) != 0) {
            atej atejVar = atenVar.g;
            if (atejVar == null) {
                atejVar = atej.a;
            }
            arhs arhsVar3 = atejVar.d;
            return arhsVar3 == null ? arhs.a : arhsVar3;
        } else if ((i & 32) != 0) {
            atek atekVar = atenVar.h;
            if (atekVar == null) {
                atekVar = atek.a;
            }
            arhs arhsVar4 = atekVar.d;
            return arhsVar4 == null ? arhs.a : arhsVar4;
        } else if ((i & 8) == 0) {
            avqs avqsVar = atenVar.m;
            if (avqsVar == null) {
                avqsVar = avqs.a;
            }
            if (avqsVar.c != 2) {
                return null;
            }
            avqs avqsVar2 = atenVar.m;
            if (avqsVar2 == null) {
                avqsVar2 = avqs.a;
            }
            if (avqsVar2.c == 2) {
                return (arhs) avqsVar2.d;
            }
            return arhs.a;
        } else {
            atex atexVar = atenVar.f;
            if (atexVar == null) {
                atexVar = atex.a;
            }
            if (atexVar.i) {
                atex atexVar2 = atenVar.f;
                if (atexVar2 == null) {
                    atexVar2 = atex.a;
                }
                arhs arhsVar5 = atexVar2.g;
                return arhsVar5 == null ? arhs.a : arhsVar5;
            }
            atex atexVar3 = atenVar.f;
            if (atexVar3 == null) {
                atexVar3 = atex.a;
            }
            arhs arhsVar6 = atexVar3.d;
            return arhsVar6 == null ? arhs.a : arhsVar6;
        }
    }

    public static arhs g(aten atenVar) {
        if ((atenVar.b & 1) != 0) {
            ateo ateoVar = atenVar.c;
            if (ateoVar == null) {
                ateoVar = ateo.a;
            }
            arhs arhsVar = ateoVar.j;
            return arhsVar == null ? arhs.a : arhsVar;
        }
        return null;
    }

    public static CharSequence h(aten atenVar) {
        int i = atenVar.b;
        arag aragVar = null;
        if ((i & 1) != 0) {
            ateo ateoVar = atenVar.c;
            if (ateoVar == null) {
                ateoVar = ateo.a;
            }
            if ((ateoVar.b & 1) != 0) {
                ateo ateoVar2 = atenVar.c;
                if (ateoVar2 == null) {
                    ateoVar2 = ateo.a;
                }
                aragVar = ateoVar2.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            }
            return ajgl.b(aragVar);
        } else if ((i & 2) != 0) {
            ater aterVar = atenVar.d;
            if (aterVar == null) {
                aterVar = ater.a;
            }
            if ((aterVar.b & 1) != 0) {
                ater aterVar2 = atenVar.d;
                if (aterVar2 == null) {
                    aterVar2 = ater.a;
                }
                aragVar = aterVar2.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            }
            return ajgl.b(aragVar);
        } else if ((i & 16) != 0) {
            atej atejVar = atenVar.g;
            if (atejVar == null) {
                atejVar = atej.a;
            }
            if ((atejVar.b & 1) != 0) {
                atej atejVar2 = atenVar.g;
                if (atejVar2 == null) {
                    atejVar2 = atej.a;
                }
                aragVar = atejVar2.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            }
            return ajgl.b(aragVar);
        } else if ((i & 32) != 0) {
            atek atekVar = atenVar.h;
            if (atekVar == null) {
                atekVar = atek.a;
            }
            if ((atekVar.b & 1) != 0) {
                atek atekVar2 = atenVar.h;
                if (atekVar2 == null) {
                    atekVar2 = atek.a;
                }
                aragVar = atekVar2.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            }
            return ajgl.b(aragVar);
        } else if ((i & 8) == 0) {
            if ((i & 1024) != 0) {
                avqs avqsVar = atenVar.m;
                if (avqsVar == null) {
                    avqsVar = avqs.a;
                }
                if ((avqsVar.b & 8) != 0) {
                    avqs avqsVar2 = atenVar.m;
                    if (avqsVar2 == null) {
                        avqsVar2 = avqs.a;
                    }
                    aragVar = avqsVar2.e;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                }
                return ajgl.b(aragVar);
            } else if ((i & 512) == 0) {
                return null;
            } else {
                atet atetVar = atenVar.l;
                if (atetVar == null) {
                    atetVar = atet.a;
                }
                if ((atetVar.b & 1) != 0) {
                    atet atetVar2 = atenVar.l;
                    if (atetVar2 == null) {
                        atetVar2 = atet.a;
                    }
                    aragVar = atetVar2.c;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                }
                return ajgl.b(aragVar);
            }
        } else {
            atex atexVar = atenVar.f;
            if (atexVar == null) {
                atexVar = atex.a;
            }
            if (!atexVar.i) {
                atex atexVar2 = atenVar.f;
                if (atexVar2 == null) {
                    atexVar2 = atex.a;
                }
                if ((atexVar2.b & 1) != 0) {
                    atex atexVar3 = atenVar.f;
                    if (atexVar3 == null) {
                        atexVar3 = atex.a;
                    }
                    aragVar = atexVar3.c;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                }
                return ajgl.b(aragVar);
            }
            atex atexVar4 = atenVar.f;
            if (atexVar4 == null) {
                atexVar4 = atex.a;
            }
            if ((atexVar4.b & 16) != 0) {
                atex atexVar5 = atenVar.f;
                if (atexVar5 == null) {
                    atexVar5 = atex.a;
                }
                aragVar = atexVar5.f;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            }
            return ajgl.b(aragVar);
        }
    }

    public static int i(aten atenVar) {
        int i = atenVar.b;
        if ((i & 1) != 0) {
            ateo ateoVar = atenVar.c;
            if (ateoVar == null) {
                ateoVar = ateo.a;
            }
            int M = almu.M(ateoVar.i);
            if (M != 0) {
                return M;
            }
            return 1;
        } else if ((i & 2) == 0) {
            return 1;
        } else {
            ater aterVar = atenVar.d;
            if (aterVar == null) {
                aterVar = ater.a;
            }
            int M2 = almu.M(aterVar.i);
            if (M2 != 0) {
                return M2;
            }
            return 1;
        }
    }

    public static void j(aopa aopaVar, apzg apzgVar) {
        aten atenVar = (aten) aopaVar.instance;
        int i = atenVar.b;
        if ((i & 2) != 0) {
            ater aterVar = atenVar.d;
            if (aterVar == null) {
                aterVar = ater.a;
            }
            aopa mo52toBuilder = aterVar.mo52toBuilder();
            mo52toBuilder.copyOnWrite();
            ater aterVar2 = (ater) mo52toBuilder.instance;
            apzgVar.getClass();
            aterVar2.e = apzgVar;
            aterVar2.b |= 8;
            aopaVar.copyOnWrite();
            aten atenVar2 = (aten) aopaVar.instance;
            ater aterVar3 = (ater) mo52toBuilder.mo39build();
            aterVar3.getClass();
            atenVar2.d = aterVar3;
            atenVar2.b |= 2;
        } else if ((i & 32) != 0) {
            atek atekVar = atenVar.h;
            if (atekVar == null) {
                atekVar = atek.a;
            }
            aopa mo52toBuilder2 = atekVar.mo52toBuilder();
            mo52toBuilder2.copyOnWrite();
            atek atekVar2 = (atek) mo52toBuilder2.instance;
            apzgVar.getClass();
            atekVar2.e = apzgVar;
            atekVar2.b |= 4;
            aopaVar.copyOnWrite();
            aten atenVar3 = (aten) aopaVar.instance;
            atek atekVar3 = (atek) mo52toBuilder2.mo39build();
            atekVar3.getClass();
            atenVar3.h = atekVar3;
            atenVar3.b |= 32;
        } else if ((i & 8) == 0) {
        } else {
            aopa createBuilder = atex.a.createBuilder();
            atex atexVar = ((aten) aopaVar.instance).f;
            if (atexVar == null) {
                atexVar = atex.a;
            }
            if (!atexVar.i) {
                createBuilder.copyOnWrite();
                atex atexVar2 = (atex) createBuilder.instance;
                apzgVar.getClass();
                atexVar2.e = apzgVar;
                atexVar2.b |= 8;
            } else {
                createBuilder.copyOnWrite();
                atex atexVar3 = (atex) createBuilder.instance;
                apzgVar.getClass();
                atexVar3.h = apzgVar;
                atexVar3.b |= 128;
            }
            aopaVar.copyOnWrite();
            aten atenVar4 = (aten) aopaVar.instance;
            atex atexVar4 = (atex) createBuilder.mo39build();
            atexVar4.getClass();
            atenVar4.f = atexVar4;
            atenVar4.b |= 8;
        }
    }

    public static final boolean k(List list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        amzt listIterator = ((amuk) list).listIterator();
        while (listIterator.hasNext()) {
            auft auftVar = (auft) listIterator.next();
            if (!auftVar.c.isEmpty() && (auftVar.b & 2) != 0) {
                arif arifVar = auftVar.d;
                if (arifVar == null) {
                    arifVar = arif.a;
                }
                if (l(arifVar.c)) {
                    if (l(arifVar.e)) {
                        if (l(arifVar.d)) {
                            if (!l(arifVar.f)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    private static boolean l(double d) {
        return d >= 0.0d && d <= 1.0d;
    }
}
