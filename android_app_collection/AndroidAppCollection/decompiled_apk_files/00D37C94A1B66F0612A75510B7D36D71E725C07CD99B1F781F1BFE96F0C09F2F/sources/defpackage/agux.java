package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: agux  reason: default package */
/* loaded from: classes.dex */
public final class agux {
    private final agvi a;

    public agux(agvi agviVar) {
        this.a = agviVar;
    }

    public final agqo a(String str) {
        atsl atslVar;
        ylr.b();
        agvh a = this.a.a();
        a.a.add(str);
        a.i();
        try {
            Iterator it = this.a.b(a).c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    atslVar = null;
                    break;
                }
                atsm atsmVar = (atsm) it.next();
                atsl atslVar2 = atsmVar.c;
                if (atslVar2 == null) {
                    atslVar2 = atsl.a;
                }
                if (atslVar2.c.equals(str)) {
                    atslVar = atsmVar.c;
                    if (atslVar == null) {
                        atslVar = atsl.a;
                    }
                }
            }
            if (atslVar == null) {
                String valueOf = String.valueOf(str);
                throw new ExecutionException(new aart(valueOf.length() != 0 ? "No video data returned for videoId=".concat(valueOf) : new String("No video data returned for videoId=")));
            }
            return agqo.c(atslVar);
        } catch (aart e) {
            throw new ExecutionException(e);
        }
    }

    public final agqx b(String str, int i) {
        ArrayList<atsl> arrayList;
        int i2;
        ylr.b();
        agvh a = this.a.a();
        a.b.add(str);
        a.i();
        try {
            arys b = this.a.b(a);
            atrp d = ahdq.d(b, str);
            atrp d2 = ahdq.d(b, str);
            if (d2 != null) {
                arrayList = new ArrayList();
                for (atsm atsmVar : d2.f) {
                    atsl atslVar = atsmVar.c;
                    if (atslVar == null) {
                        atslVar = atsl.a;
                    }
                    arrayList.add(atslVar);
                }
            } else {
                arrayList = null;
            }
            if (d == null || arrayList == null) {
                return null;
            }
            if (d.f.size() != 0) {
                i2 = d.f.size();
                aopa mo52toBuilder = d.mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                ((atrp) mo52toBuilder.instance).f = atrp.emptyProtobufList();
                d = (atrp) mo52toBuilder.mo39build();
            } else {
                i2 = 0;
            }
            avhn avhnVar = d.d;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            aalc aalcVar = new aalc(avhnVar);
            atqf atqfVar = d.e;
            if (atqfVar == null) {
                atqfVar = atqf.a;
            }
            agqf c = agqf.c(d, false, i2, aalcVar, agqa.a(atqfVar));
            ArrayList arrayList2 = new ArrayList();
            for (atsl atslVar2 : arrayList) {
                arrayList2.add(agqo.c(atslVar2));
            }
            agqx agqxVar = new agqx(c, arrayList2);
            if (i < 0) {
                return null;
            }
            agqf agqfVar = agqxVar.a;
            List list = agqxVar.b;
            List subList = list.subList(0, Math.min(list.size(), i));
            return new agqx(new agqf(agqfVar, subList.size()), subList);
        } catch (aart e) {
            throw new ExecutionException(e);
        }
    }

    public final aryp c(long j, long j2, int i, float f, List list) {
        ylr.b();
        agvi agviVar = this.a;
        agvg agvgVar = new agvg(agviVar.e, agviVar.a.c(), agviVar.c);
        agvgVar.c = j;
        agvgVar.d = j2;
        agvgVar.s = i;
        agvgVar.t = f;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aguw aguwVar = (aguw) it.next();
            String str = aguwVar.a;
            long j3 = aguwVar.b;
            String[] strArr = aguwVar.c;
            long j4 = aguwVar.d;
            long j5 = aguwVar.e;
            ahdf.d(agvgVar.a);
            aopa createBuilder = arym.a.createBuilder();
            createBuilder.copyOnWrite();
            arym arymVar = (arym) createBuilder.instance;
            arymVar.b |= 1;
            arymVar.c = str;
            createBuilder.copyOnWrite();
            arym arymVar2 = (arym) createBuilder.instance;
            arymVar2.b |= 2;
            arymVar2.d = j3;
            List asList = Arrays.asList(strArr);
            createBuilder.copyOnWrite();
            arym arymVar3 = (arym) createBuilder.instance;
            aopu aopuVar = arymVar3.e;
            if (!aopuVar.c()) {
                arymVar3.e = aopi.mutableCopy(aopuVar);
            }
            aonk.addAll((Iterable) asList, (List) arymVar3.e);
            createBuilder.copyOnWrite();
            arym arymVar4 = (arym) createBuilder.instance;
            arymVar4.b |= 4;
            arymVar4.f = true;
            createBuilder.copyOnWrite();
            arym arymVar5 = (arym) createBuilder.instance;
            arymVar5.b |= 8;
            arymVar5.g = j4;
            createBuilder.copyOnWrite();
            arym arymVar6 = (arym) createBuilder.instance;
            arymVar6.b |= 16;
            arymVar6.h = 0L;
            agvgVar.b.add((arym) createBuilder.mo39build());
        }
        agvgVar.i();
        try {
            return (aryp) this.a.b.d(agvgVar);
        } catch (aart e) {
            throw new ExecutionException(e);
        }
    }
}
