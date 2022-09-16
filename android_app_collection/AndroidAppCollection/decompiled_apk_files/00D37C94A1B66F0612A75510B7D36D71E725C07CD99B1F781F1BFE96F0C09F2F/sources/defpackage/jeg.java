package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: jeg  reason: default package */
/* loaded from: classes3.dex */
final class jeg implements yiw {
    final /* synthetic */ jeh a;

    public jeg(jeh jehVar) {
        this.a = jehVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Void r1 = (Void) obj;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Void r3 = (Void) obj;
        final Collection collection = (Collection) obj2;
        Future future = this.a.c;
        if (future == null || future.isCancelled()) {
            this.a.c = null;
            return;
        }
        final jeh jehVar = this.a;
        jehVar.a.execute(new Runnable() { // from class: jef
            @Override // java.lang.Runnable
            public final void run() {
                apzg apzgVar;
                aucf aucfVar;
                aqdv aqdvVar;
                aqdv aqdvVar2;
                jeh jehVar2 = jeh.this;
                Collection<agqh> collection2 = collection;
                if (!jehVar2.b.isEmpty()) {
                    amuk o = amuk.o(jehVar2.b);
                    int size = o.size();
                    int i = 0;
                    while (i < size) {
                        lmx lmxVar = ((lmw) o.get(i)).a;
                        HashSet hashSet = new HashSet();
                        HashMap hashMap = new HashMap();
                        HashSet hashSet2 = new HashSet();
                        HashSet f = amyv.f(lmxVar.g.g);
                        ArrayList<aqdv> arrayList = new ArrayList();
                        for (apxb apxbVar : lmxVar.g.e) {
                            if (apxbVar.b == 48602820) {
                                aqdvVar = (aqdv) apxbVar.c;
                            } else {
                                aqdvVar = aqdv.a;
                            }
                            aqds aqdsVar = aqdvVar.k;
                            if (aqdsVar == null) {
                                aqdsVar = aqds.a;
                            }
                            if (aqdsVar.b == 135739232) {
                                if (apxbVar.b == 48602820) {
                                    aqdvVar2 = (aqdv) apxbVar.c;
                                } else {
                                    aqdvVar2 = aqdv.a;
                                }
                                arrayList.add(aqdvVar2);
                            }
                        }
                        for (aqdv aqdvVar3 : arrayList) {
                            aqds aqdsVar2 = aqdvVar3.k;
                            if (aqdsVar2 == null) {
                                aqdsVar2 = aqds.a;
                            }
                            if (aqdsVar2.b == 135739232) {
                                aucfVar = (aucf) aqdsVar2.c;
                            } else {
                                aucfVar = aucf.a;
                            }
                            hashSet.add(aucfVar.c);
                        }
                        for (agqh agqhVar : collection2) {
                            String str = agqhVar.a.a;
                            agqhVar.getClass();
                            amuk amukVar = o;
                            aqdv aqdvVar4 = (aqdv) ((jml) lmxVar.b.get()).g(agqh.class, aqdv.class, agqhVar, null);
                            if (hashSet.contains(str)) {
                                hashMap.put(str, aqdvVar4);
                            } else if (!f.contains(str)) {
                                hashSet2.add(aqdvVar4);
                            }
                            o = amukVar;
                        }
                        amuk amukVar2 = o;
                        if (((fcl) lmxVar.c.get()).h()) {
                            ajqm r = lmxVar.d.r();
                            for (int i2 = 0; i2 < r.a(); i2++) {
                                Object c = r.c(i2);
                                if (c instanceof aqdv) {
                                    aqdv aqdvVar5 = (aqdv) c;
                                    if (aqdvVar5.c == 4) {
                                        apzgVar = (apzg) aqdvVar5.d;
                                    } else {
                                        apzgVar = apzg.a;
                                    }
                                    if (far.b(apzgVar)) {
                                        break;
                                    }
                                }
                                if (r.c(i2) instanceof apwx) {
                                    break;
                                }
                            }
                            Context context = lmxVar.a;
                            aopa createBuilder = aqdv.a.createBuilder();
                            arag g = ajgl.g(context.getString(R.string.offline_videos_title));
                            createBuilder.copyOnWrite();
                            aqdv aqdvVar6 = (aqdv) createBuilder.instance;
                            g.getClass();
                            aqdvVar6.g = g;
                            aqdvVar6.b |= 1;
                            apzg apzgVar2 = far.a;
                            createBuilder.copyOnWrite();
                            aqdv aqdvVar7 = (aqdv) createBuilder.instance;
                            apzgVar2.getClass();
                            aqdvVar7.d = apzgVar2;
                            aqdvVar7.c = 4;
                            aopa createBuilder2 = aqds.a.createBuilder();
                            aopa createBuilder3 = aucf.a.createBuilder();
                            createBuilder3.copyOnWrite();
                            aucf aucfVar2 = (aucf) createBuilder3.instance;
                            aucfVar2.b |= 1;
                            aucfVar2.c = "PPSV";
                            createBuilder2.copyOnWrite();
                            aqds aqdsVar3 = (aqds) createBuilder2.instance;
                            aucf aucfVar3 = (aucf) createBuilder3.mo39build();
                            aucfVar3.getClass();
                            aqdsVar3.c = aucfVar3;
                            aqdsVar3.b = 135739232;
                            createBuilder.copyOnWrite();
                            aqdv aqdvVar8 = (aqdv) createBuilder.instance;
                            aqds aqdsVar4 = (aqds) createBuilder2.mo39build();
                            aqdsVar4.getClass();
                            aqdvVar8.k = aqdsVar4;
                            aqdvVar8.b |= 32768;
                            aopa createBuilder4 = aqdt.a.createBuilder();
                            aopa createBuilder5 = aqdy.a.createBuilder();
                            long seconds = TimeUnit.MILLISECONDS.toSeconds(Long.MAX_VALUE);
                            createBuilder5.copyOnWrite();
                            aqdy aqdyVar = (aqdy) createBuilder5.instance;
                            aqdyVar.b |= 1;
                            aqdyVar.c = seconds;
                            createBuilder4.copyOnWrite();
                            aqdt aqdtVar = (aqdt) createBuilder4.instance;
                            aqdy aqdyVar2 = (aqdy) createBuilder5.mo39build();
                            aqdyVar2.getClass();
                            aqdtVar.c = aqdyVar2;
                            aqdtVar.b = 135744618;
                            createBuilder.copyOnWrite();
                            aqdv aqdvVar9 = (aqdv) createBuilder.instance;
                            aqdt aqdtVar2 = (aqdt) createBuilder4.mo39build();
                            aqdtVar2.getClass();
                            aqdvVar9.l = aqdtVar2;
                            aqdvVar9.b |= 65536;
                            aopa createBuilder6 = aqdx.a.createBuilder();
                            aopa createBuilder7 = arhu.a.createBuilder();
                            aopc aopcVar = (aopc) arhs.a.createBuilder();
                            arhr arhrVar = arhr.OFFLINE_DOWNLOAD;
                            aopcVar.copyOnWrite();
                            arhs arhsVar = (arhs) aopcVar.instance;
                            arhsVar.c = arhrVar.pS;
                            arhsVar.b |= 1;
                            createBuilder7.copyOnWrite();
                            arhu arhuVar = (arhu) createBuilder7.instance;
                            arhs arhsVar2 = (arhs) aopcVar.mo39build();
                            arhsVar2.getClass();
                            arhuVar.c = arhsVar2;
                            arhuVar.b |= 1;
                            createBuilder6.copyOnWrite();
                            aqdx aqdxVar = (aqdx) createBuilder6.instance;
                            arhu arhuVar2 = (arhu) createBuilder7.mo39build();
                            arhuVar2.getClass();
                            aqdxVar.f = arhuVar2;
                            aqdxVar.b |= 128;
                            createBuilder.copyOnWrite();
                            aqdv aqdvVar10 = (aqdv) createBuilder.instance;
                            aqdx aqdxVar2 = (aqdx) createBuilder6.mo39build();
                            aqdxVar2.getClass();
                            aqdvVar10.i = aqdxVar2;
                            aqdvVar10.b |= 32;
                            hashSet2.add((aqdv) createBuilder.mo39build());
                        }
                        ArrayList arrayList2 = new ArrayList(hashSet2);
                        Collections.sort(arrayList2, lmxVar.h);
                        ArrayList arrayList3 = new ArrayList(arrayList.size() + arrayList2.size());
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            if (i3 >= arrayList.size() && i4 >= arrayList2.size()) {
                                break;
                            }
                            aqdv aqdvVar11 = (aqdv) lmx.d(arrayList, i3);
                            aqdv aqdvVar12 = (aqdv) lmx.d(arrayList2, i4);
                            if (aqdvVar11 == null) {
                                arrayList3.add(aqdvVar12);
                            } else {
                                if (aqdvVar12 == null) {
                                    arrayList3.add(lmx.c(aqdvVar11, hashMap));
                                } else if (lmxVar.h.a(aqdvVar11, aqdvVar12) <= 0) {
                                    arrayList3.add(lmx.c(aqdvVar11, hashMap));
                                } else {
                                    arrayList3.add(aqdvVar12);
                                }
                                i3++;
                            }
                            i4++;
                        }
                        int i5 = lmxVar.f ? lmxVar.g.f + 1 : lmxVar.g.f;
                        int i6 = 0;
                        while (true) {
                            if (i5 < lmxVar.e.size() || i6 < arrayList3.size()) {
                                Object obj3 = i5 < lmxVar.e.size() ? lmxVar.e.get(i5) : null;
                                aqdv aqdvVar13 = (aqdv) lmx.d(arrayList3, i6);
                                if (obj3 != null) {
                                    if (obj3 instanceof aqdv) {
                                        aqds aqdsVar5 = ((aqdv) obj3).k;
                                        if (aqdsVar5 == null) {
                                            aqdsVar5 = aqds.a;
                                        }
                                        if (aqdsVar5.b == 135739232) {
                                        }
                                    }
                                    i5++;
                                }
                                if (obj3 == null) {
                                    lmxVar.e.add(aqdvVar13);
                                } else if (aqdvVar13 == null) {
                                    lmxVar.e.remove(i5);
                                } else if (!obj3.equals(aqdvVar13)) {
                                    lmxVar.e.n(i5, aqdvVar13);
                                }
                                i5++;
                                i6++;
                            }
                        }
                        lmxVar.l();
                        i++;
                        o = amukVar2;
                    }
                }
            }
        });
    }
}
