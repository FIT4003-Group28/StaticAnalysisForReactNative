package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aggx  reason: default package */
/* loaded from: classes.dex */
public final class aggx implements yjo {
    private final azqb a;
    private final azqb b;

    public aggx(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    @Override // defpackage.yjo
    public final int a(Bundle bundle) {
        int i;
        agvx agvxVar;
        aopi mo39build;
        agqz agqzVar;
        agpo agpoVar = (agpo) this.a.get();
        atqv atqvVar = agpoVar.d.a().g;
        if (atqvVar == null) {
            atqvVar = atqv.a;
        }
        atsc atscVar = atqvVar.c;
        if (atscVar == null) {
            atscVar = atsc.a;
        }
        if (!atscVar.b) {
            return 0;
        }
        agvx a = ((agrf) agpoVar.g.get()).a();
        if ("NO_OP_STORE_TAG".equals(a.q())) {
            return 0;
        }
        boolean z = !a.m().j().isEmpty() || !a.i().j().isEmpty();
        String p = zhn.p("offline_client_state_should_log_%s", a.q());
        if (!z) {
            if (!agpoVar.c.getBoolean(p, false)) {
                return 0;
            }
            agpoVar.c.edit().putBoolean(p, false).apply();
        } else {
            agpoVar.c.edit().putBoolean(p, true).apply();
        }
        Collection<agqv> j = a.m().j();
        Collection j2 = a.i().j();
        HashMap hashMap = new HashMap();
        long j3 = 0;
        long j4 = 0;
        for (agqv agqvVar : j) {
            hashMap.put(agqvVar.m(), agqvVar);
            long j5 = agqvVar.f;
            if (j5 > j3) {
                j3 = j5;
            }
            long j6 = agqvVar.g;
            if (j6 > j4) {
                j4 = j6;
            }
        }
        aopa createBuilder = atqg.a.createBuilder();
        ArrayList arrayList = new ArrayList();
        Iterator it = j.iterator();
        while (it.hasNext()) {
            agqv agqvVar2 = (agqv) it.next();
            aopa createBuilder2 = atqi.a.createBuilder();
            String m = agqvVar2.m();
            createBuilder2.copyOnWrite();
            atqi atqiVar = (atqi) createBuilder2.instance;
            m.getClass();
            Iterator it2 = it;
            atqiVar.b |= 1;
            atqiVar.c = m;
            agqp agqpVar = agqp.DELETED;
            switch (agqvVar2.i().ordinal()) {
                case 0:
                    i = 7;
                    break;
                case 1:
                    i = 2;
                    break;
                case 2:
                    i = 18;
                    break;
                case 3:
                case 4:
                case 11:
                    i = 3;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    i = 10;
                    break;
                case 10:
                    i = 4;
                    break;
                case 12:
                    i = 17;
                    break;
                case 13:
                    i = 11;
                    break;
                case 14:
                    i = 13;
                    break;
                case 15:
                    i = 5;
                    break;
                case 16:
                    i = 8;
                    break;
                case 17:
                case 18:
                    i = 9;
                    break;
                case 19:
                    i = 15;
                    break;
                case 20:
                case 21:
                    i = 14;
                    break;
                case 22:
                    i = 6;
                    break;
                default:
                    i = 1;
                    break;
            }
            createBuilder2.copyOnWrite();
            atqi atqiVar2 = (atqi) createBuilder2.instance;
            int i2 = i - 1;
            atqiVar2.d = i2;
            atqiVar2.b |= 2;
            int at = akel.at(i2);
            if (at != 0 && at == 10) {
                boolean E = agqvVar2.E();
                if (agqvVar2.D() && (agqzVar = agqvVar2.o) != null) {
                    int a2 = agpr.a(agqzVar.c);
                    int i3 = E ? 1 : 0;
                    char c = E ? 1 : 0;
                    E = i3 | a2;
                }
                createBuilder2.copyOnWrite();
                atqi atqiVar3 = (atqi) createBuilder2.instance;
                atqiVar3.b |= 4;
                int i4 = E ? 1 : 0;
                int i5 = E ? 1 : 0;
                atqiVar3.e = i4;
            }
            long d = agqvVar2.d();
            createBuilder2.copyOnWrite();
            atqi atqiVar4 = (atqi) createBuilder2.instance;
            atqiVar4.b |= 8;
            atqiVar4.f = d;
            long e = agqvVar2.e();
            createBuilder2.copyOnWrite();
            atqi atqiVar5 = (atqi) createBuilder2.instance;
            atqiVar5.b |= 16;
            atqiVar5.g = e;
            attl attlVar = agqvVar2.b;
            createBuilder2.copyOnWrite();
            atqi atqiVar6 = (atqi) createBuilder2.instance;
            atqiVar6.h = attlVar.k;
            atqiVar6.b |= 32;
            int b = agqvVar2.m.b();
            createBuilder2.copyOnWrite();
            atqi atqiVar7 = (atqi) createBuilder2.instance;
            atqiVar7.i = b - 1;
            atqiVar7.b |= 64;
            long j7 = agqvVar2.f;
            createBuilder2.copyOnWrite();
            atqi atqiVar8 = (atqi) createBuilder2.instance;
            atqiVar8.b |= 128;
            atqiVar8.j = j7;
            agqu agquVar = agqvVar2.j;
            if (agquVar != null) {
                long j8 = agquVar.d;
                createBuilder2.copyOnWrite();
                atqi atqiVar9 = (atqi) createBuilder2.instance;
                agvxVar = a;
                atqiVar9.b |= 256;
                atqiVar9.k = j8;
                long seconds = TimeUnit.MILLISECONDS.toSeconds(agquVar.b() - agquVar.e.c());
                createBuilder2.copyOnWrite();
                atqi atqiVar10 = (atqi) createBuilder2.instance;
                atqiVar10.b |= 512;
                atqiVar10.l = seconds;
            } else {
                agvxVar = a;
            }
            long j9 = agqvVar2.g;
            createBuilder2.copyOnWrite();
            atqi atqiVar11 = (atqi) createBuilder2.instance;
            atqiVar11.b |= 32768;
            atqiVar11.n = j9;
            boolean z2 = !agqvVar2.e && !agqvVar2.s();
            createBuilder2.copyOnWrite();
            atqi atqiVar12 = (atqi) createBuilder2.instance;
            atqiVar12.b |= 2048;
            atqiVar12.m = z2;
            boolean a3 = agqvVar2.a();
            createBuilder2.copyOnWrite();
            atqi atqiVar13 = (atqi) createBuilder2.instance;
            atqiVar13.b |= 65536;
            atqiVar13.o = a3;
            agqm agqmVar = agqvVar2.n;
            boolean z3 = agqmVar != null && agqmVar.g;
            createBuilder2.copyOnWrite();
            atqi atqiVar14 = (atqi) createBuilder2.instance;
            atqiVar14.b |= 131072;
            atqiVar14.p = !z3;
            agqm agqmVar2 = agqvVar2.n;
            String str = agqmVar2 == null ? null : agqmVar2.f;
            aopa createBuilder3 = auzn.a.createBuilder();
            createBuilder3.copyOnWrite();
            auzn auznVar = (auzn) createBuilder3.instance;
            auznVar.d = 0;
            auznVar.b |= 2;
            if (TextUtils.isEmpty(str)) {
                mo39build = createBuilder3.mo39build();
            } else {
                List h = amqf.b(';').h(str);
                if (h.size() != 2) {
                    mo39build = createBuilder3.mo39build();
                } else if (((String) h.get(0)).length() < 2) {
                    mo39build = createBuilder3.mo39build();
                } else {
                    String substring = ((String) h.get(0)).substring(((String) h.get(0)).length() - 2);
                    if (((String) h.get(1)).length() <= 0) {
                        mo39build = createBuilder3.mo39build();
                    } else {
                        String substring2 = ((String) h.get(1)).substring(((String) h.get(1)).length() - 1);
                        try {
                            int parseInt = Integer.parseInt(substring, 16);
                            createBuilder3.copyOnWrite();
                            auzn auznVar2 = (auzn) createBuilder3.instance;
                            auznVar2.b |= 1;
                            auznVar2.c = parseInt;
                            int parseInt2 = Integer.parseInt(substring2);
                            if (parseInt2 == 1) {
                                createBuilder3.copyOnWrite();
                                auzn auznVar3 = (auzn) createBuilder3.instance;
                                auznVar3.d = 1;
                                auznVar3.b |= 2;
                            } else if (parseInt2 == 2) {
                                createBuilder3.copyOnWrite();
                                auzn auznVar4 = (auzn) createBuilder3.instance;
                                auznVar4.d = 2;
                                auznVar4.b = 2 | auznVar4.b;
                            } else if (parseInt2 != 3) {
                                createBuilder3.copyOnWrite();
                                auzn auznVar5 = (auzn) createBuilder3.instance;
                                auznVar5.d = 0;
                                auznVar5.b |= 2;
                            } else {
                                createBuilder3.copyOnWrite();
                                auzn auznVar6 = (auzn) createBuilder3.instance;
                                auznVar6.d = 3;
                                auznVar6.b |= 2;
                            }
                            mo39build = createBuilder3.mo39build();
                        } catch (NumberFormatException unused) {
                            mo39build = createBuilder3.mo39build();
                        }
                    }
                }
            }
            auzn auznVar7 = (auzn) mo39build;
            createBuilder2.copyOnWrite();
            atqi atqiVar15 = (atqi) createBuilder2.instance;
            auznVar7.getClass();
            atqiVar15.q = auznVar7;
            atqiVar15.b |= 262144;
            arrayList.add((atqi) createBuilder2.mo39build());
            it = it2;
            a = agvxVar;
        }
        agvx agvxVar2 = a;
        createBuilder.copyOnWrite();
        atqg atqgVar = (atqg) createBuilder.instance;
        aopu aopuVar = atqgVar.c;
        if (!aopuVar.c()) {
            atqgVar.c = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll((Iterable) arrayList, (List) atqgVar.c);
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = j2.iterator();
        while (it3.hasNext()) {
            agqh agqhVar = (agqh) it3.next();
            aopa createBuilder4 = atqh.a.createBuilder();
            String str2 = agqhVar.a.a;
            createBuilder4.copyOnWrite();
            atqh atqhVar = (atqh) createBuilder4.instance;
            atqhVar.b |= 1;
            atqhVar.c = str2;
            List list = agqhVar.b;
            createBuilder4.copyOnWrite();
            atqh atqhVar2 = (atqh) createBuilder4.instance;
            aopu aopuVar2 = atqhVar2.d;
            if (!aopuVar2.c()) {
                atqhVar2.d = aopi.mutableCopy(aopuVar2);
            }
            aonk.addAll((Iterable) list, (List) atqhVar2.d);
            int size = agqhVar.b.size();
            createBuilder4.copyOnWrite();
            atqh atqhVar3 = (atqh) createBuilder4.instance;
            atqhVar3.b |= 2;
            atqhVar3.e = size;
            Iterator it4 = agqhVar.b.iterator();
            Iterator it5 = it3;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (it4.hasNext()) {
                Iterator it6 = it4;
                agqv agqvVar3 = (agqv) hashMap.get((String) it4.next());
                if (agqvVar3 != null) {
                    agqp agqpVar2 = agqp.DELETED;
                    switch (agqvVar3.i().ordinal()) {
                        case 1:
                            i7++;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            i10++;
                            break;
                        case 13:
                        case 14:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            i8++;
                            break;
                        case 15:
                        case 16:
                            i9++;
                            break;
                    }
                    it4 = it6;
                }
                i6++;
                it4 = it6;
            }
            createBuilder4.copyOnWrite();
            atqh atqhVar4 = (atqh) createBuilder4.instance;
            atqhVar4.b |= 4;
            atqhVar4.f = i7;
            createBuilder4.copyOnWrite();
            atqh atqhVar5 = (atqh) createBuilder4.instance;
            atqhVar5.b |= 8;
            atqhVar5.g = i8;
            createBuilder4.copyOnWrite();
            atqh atqhVar6 = (atqh) createBuilder4.instance;
            atqhVar6.b |= 16;
            atqhVar6.h = i10;
            createBuilder4.copyOnWrite();
            atqh atqhVar7 = (atqh) createBuilder4.instance;
            atqhVar7.b |= 32;
            atqhVar7.i = i9;
            createBuilder4.copyOnWrite();
            atqh atqhVar8 = (atqh) createBuilder4.instance;
            atqhVar8.b |= 64;
            atqhVar8.j = i6;
            attl attlVar2 = agqhVar.c;
            createBuilder4.copyOnWrite();
            atqh atqhVar9 = (atqh) createBuilder4.instance;
            atqhVar9.k = attlVar2.k;
            atqhVar9.b |= 128;
            int i11 = agqhVar.g;
            createBuilder4.copyOnWrite();
            atqh atqhVar10 = (atqh) createBuilder4.instance;
            atqhVar10.m = i11 - 1;
            atqhVar10.b |= 1024;
            long j10 = agqhVar.f;
            createBuilder4.copyOnWrite();
            atqh atqhVar11 = (atqh) createBuilder4.instance;
            atqhVar11.b |= 512;
            atqhVar11.l = j10;
            arrayList2.add((atqh) createBuilder4.mo39build());
            it3 = it5;
            hashMap = hashMap;
        }
        createBuilder.copyOnWrite();
        atqg atqgVar2 = (atqg) createBuilder.instance;
        aopu aopuVar3 = atqgVar2.d;
        if (!aopuVar3.c()) {
            atqgVar2.d = aopi.mutableCopy(aopuVar3);
        }
        aonk.addAll((Iterable) arrayList2, (List) atqgVar2.d);
        long b2 = agpoVar.e.b();
        createBuilder.copyOnWrite();
        atqg atqgVar3 = (atqg) createBuilder.instance;
        atqgVar3.b |= 1;
        atqgVar3.e = b2;
        createBuilder.copyOnWrite();
        atqg atqgVar4 = (atqg) createBuilder.instance;
        atqgVar4.b |= 4;
        atqgVar4.f = j4;
        createBuilder.copyOnWrite();
        atqg atqgVar5 = (atqg) createBuilder.instance;
        atqgVar5.b |= 8;
        atqgVar5.g = j3;
        long j11 = agpoVar.c.getLong(zhn.q("%s_offline_download_success", agvxVar2.q()), 0L);
        createBuilder.copyOnWrite();
        atqg atqgVar6 = (atqg) createBuilder.instance;
        atqgVar6.b |= 16;
        atqgVar6.h = j11;
        boolean b3 = agpoVar.a.b();
        createBuilder.copyOnWrite();
        atqg atqgVar7 = (atqg) createBuilder.instance;
        atqgVar7.b |= 32;
        atqgVar7.i = b3;
        aqlv f = agpoVar.b.f();
        createBuilder.copyOnWrite();
        atqg atqgVar8 = (atqg) createBuilder.instance;
        atqgVar8.j = f.B;
        atqgVar8.b |= 64;
        if (agpoVar.a.a() != -1.0f) {
            float a4 = agpoVar.a.a();
            createBuilder.copyOnWrite();
            atqg atqgVar9 = (atqg) createBuilder.instance;
            atqgVar9.b |= 128;
            atqgVar9.k = (int) (a4 * 100.0f);
        }
        createBuilder.copyOnWrite();
        atqg atqgVar10 = (atqg) createBuilder.instance;
        atqgVar10.b |= 256;
        atqgVar10.l = false;
        ((agpt) agpoVar.f.get()).a((atqg) createBuilder.mo39build());
        ((agpp) this.b.get()).a();
        return 0;
    }
}
