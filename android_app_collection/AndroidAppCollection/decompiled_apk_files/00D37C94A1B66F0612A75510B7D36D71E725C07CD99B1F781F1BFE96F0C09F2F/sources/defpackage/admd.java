package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
/* compiled from: PG */
/* renamed from: admd  reason: default package */
/* loaded from: classes.dex */
public final class admd {
    private static final String a = zep.a("MDX.promotion");

    public static Set a(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            atdd atddVar = (atdd) it.next();
            try {
                adlr adlrVar = new adlr();
                int P = almu.P(atddVar.c);
                if (P == 0) {
                    P = 1;
                }
                adlrVar.a = d(P);
                hashSet.add(new adls(adlrVar.a, atddVar.d, atddVar.e, atddVar.f, atddVar.g));
            } catch (IllegalArgumentException e) {
                zep.f(a, "Failed to convert promotion (MdxNotification proto)", e);
            }
        }
        return hashSet;
    }

    public static Set b(Set set) {
        adij adijVar;
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            atde atdeVar = (atde) it.next();
            try {
                admk admkVar = new admk();
                int P = almu.P(atdeVar.c);
                if (P == 0) {
                    P = 1;
                }
                admkVar.a = d(P);
                atdk atdkVar = atdeVar.d;
                if (atdkVar == null) {
                    atdkVar = atdk.a;
                }
                if (atdkVar.c.size() != 0) {
                    for (atdh atdhVar : atdkVar.c) {
                        int Q = almu.Q(atdhVar.c);
                        if (Q == 0) {
                            Q = 1;
                        }
                        int c = c(Q);
                        atdg atdgVar = atdhVar.d;
                        if (atdgVar == null) {
                            atdgVar = atdg.a;
                        }
                        int i = atdgVar.c;
                        atdg atdgVar2 = atdhVar.d;
                        if (atdgVar2 == null) {
                            atdgVar2 = atdg.a;
                        }
                        admkVar.b.put(c, new admm(i, atdgVar2.d));
                    }
                }
                if (atdkVar.d.size() != 0) {
                    for (atdh atdhVar2 : atdkVar.d) {
                        int Q2 = almu.Q(atdhVar2.c);
                        if (Q2 == 0) {
                            Q2 = 1;
                        }
                        int c2 = c(Q2);
                        atdg atdgVar3 = atdhVar2.d;
                        if (atdgVar3 == null) {
                            atdgVar3 = atdg.a;
                        }
                        int i2 = atdgVar3.c;
                        atdg atdgVar4 = atdhVar2.d;
                        if (atdgVar4 == null) {
                            atdgVar4 = atdg.a;
                        }
                        admkVar.c.put(c2, new admm(i2, atdgVar4.d));
                    }
                }
                int R = almu.R(atdkVar.e);
                if (R == 0) {
                    R = 1;
                }
                int i3 = R - 1;
                if (i3 == 1) {
                    adijVar = adij.BROWSE;
                } else if (i3 != 2) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Page type: %s is not recognized", Integer.toString(i3)));
                    break;
                } else {
                    adijVar = adij.WATCH;
                }
                admkVar.d = adijVar;
                if (adijVar == adij.WATCH) {
                    admkVar.f = true;
                }
                if ((atdkVar.b & 2) != 0) {
                    atdg atdgVar5 = atdkVar.f;
                    if (atdgVar5 == null) {
                        atdgVar5 = atdg.a;
                    }
                    int i4 = atdgVar5.c;
                    atdg atdgVar6 = atdkVar.f;
                    if (atdgVar6 == null) {
                        atdgVar6 = atdg.a;
                    }
                    admkVar.e = new admm(i4, atdgVar6.d);
                }
                if ((atdkVar.b & 32) != 0) {
                    atdg atdgVar7 = atdkVar.g;
                    if (atdgVar7 == null) {
                        atdgVar7 = atdg.a;
                    }
                    int i5 = atdgVar7.c;
                    atdg atdgVar8 = atdkVar.g;
                    if (atdgVar8 == null) {
                        atdgVar8 = atdg.a;
                    }
                    admkVar.g = new admm(i5, atdgVar8.d);
                }
                if (atdkVar.l.size() != 0) {
                    ArrayList arrayList = new ArrayList(atdkVar.l.size());
                    for (atdf atdfVar : atdkVar.l) {
                        int P2 = almu.P(atdfVar.c);
                        if (P2 == 0) {
                            P2 = 1;
                        }
                        admj d = d(P2);
                        atdg atdgVar9 = atdfVar.d;
                        if (atdgVar9 == null) {
                            atdgVar9 = atdg.a;
                        }
                        long j = atdgVar9.c;
                        atdg atdgVar10 = atdfVar.d;
                        if (atdgVar10 == null) {
                            atdgVar10 = atdg.a;
                        }
                        arrayList.add(new adml(d, new admm(j, atdgVar10.d), atdfVar.e));
                    }
                    admkVar.l.clear();
                    admkVar.l.addAll(arrayList);
                }
                if (atdkVar.h.size() != 0) {
                    ArrayList<Pair> arrayList2 = new ArrayList(atdkVar.h.size());
                    for (atdj atdjVar : atdkVar.h) {
                        arrayList2.add(new Pair(Long.valueOf(atdjVar.b), Long.valueOf(atdjVar.c)));
                    }
                    admkVar.h.clear();
                    for (Pair pair : arrayList2) {
                        admkVar.h.add(new admm(((Long) pair.first).longValue(), ((Long) pair.second).longValue()));
                    }
                }
                if (atdkVar.i.size() != 0) {
                    ArrayList arrayList3 = new ArrayList(atdkVar.i.size());
                    for (atdi atdiVar : atdkVar.i) {
                        ArrayList arrayList4 = new ArrayList();
                        if (atdiVar.d.size() != 0) {
                            for (atdg atdgVar11 : atdiVar.d) {
                                arrayList4.add(new admm(atdgVar11.c, atdgVar11.d));
                            }
                        }
                        arrayList3.add(new admn((atcl[]) new aops(atdiVar.c, atdi.a).toArray(new atcl[0]), arrayList4));
                    }
                    admkVar.i.clear();
                    admkVar.i.addAll(arrayList3);
                }
                if (atdkVar.j.size() != 0) {
                    aopu aopuVar = atdkVar.j;
                    admkVar.j.clear();
                    admkVar.j.addAll(aopuVar);
                }
                if (atdkVar.k.size() != 0) {
                    aopu aopuVar2 = atdkVar.k;
                    admkVar.k.clear();
                    admkVar.k.addAll(aopuVar2);
                }
                hashSet.add(new admo(admkVar.a, admkVar.b, admkVar.c, admkVar.d, admkVar.e, admkVar.f, admkVar.g, admkVar.h, admkVar.i, admkVar.j, admkVar.k, admkVar.l));
            } catch (IllegalArgumentException e) {
                zep.f(a, "Failed to convert promotion trigger (MdxNotificationTrigger proto)", e);
            }
        }
        return hashSet;
    }

    private static int c(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 == 2) {
                return 1;
            }
            if (i2 != 3) {
                throw new IllegalArgumentException(String.format(Locale.US, "Time period: %s is not recognized", Integer.toString(i2)));
            }
            return 2;
        }
        return 0;
    }

    private static admj d(int i) {
        int i2 = i - 1;
        switch (i2) {
            case 1:
                return admj.CAST_TOOLTIP;
            case 2:
                return admj.CAST_TOOLTIP_REPRESSED;
            case 3:
                return admj.CAST_SNACKBAR;
            case 4:
                return admj.CAST_SNACKBAR_REPRESSED;
            case 5:
                return admj.CAST_CLING;
            case 6:
                return admj.CAST_CLING_REPRESSED;
            default:
                throw new IllegalArgumentException(String.format(Locale.US, "Promotion type: %s is not recognized", Integer.toString(i2)));
        }
    }
}
