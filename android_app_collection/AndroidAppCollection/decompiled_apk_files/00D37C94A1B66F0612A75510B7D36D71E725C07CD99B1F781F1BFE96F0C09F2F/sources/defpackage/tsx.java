package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: tsx  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class tsx implements anir {
    public final /* synthetic */ tsy a;
    private final /* synthetic */ int b;

    public /* synthetic */ tsx(tsy tsyVar) {
        this.a = tsyVar;
    }

    public /* synthetic */ tsx(tsy tsyVar, int i) {
        this.b = i;
        this.a = tsyVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        int i = this.b;
        if (i == 0) {
            tsy tsyVar = this.a;
            if (!((Boolean) obj).booleanValue()) {
                tsyVar.e.g(1036);
                typ.c("%s: Failed to write back stale groups!", "ExpirationHandler");
            }
            return ankq.a;
        } else if (i == 1) {
            final tsy tsyVar2 = this.a;
            final Set set = (Set) obj;
            return anii.i(tsyVar2.d.c(), new anir() { // from class: tst
                @Override // defpackage.anir
                public final ankt a(Object obj2) {
                    final tsy tsyVar3 = tsy.this;
                    Set set2 = set;
                    final ArrayList arrayList = new ArrayList();
                    final ArrayList arrayList2 = new ArrayList();
                    final AtomicInteger atomicInteger = new AtomicInteger(0);
                    ArrayList arrayList3 = new ArrayList();
                    for (final tqy tqyVar : (List) obj2) {
                        if (!set2.contains(tqyVar)) {
                            arrayList3.add(anii.i(tsyVar3.d.e(tqyVar), new anir() { // from class: tss
                                @Override // defpackage.anir
                                public final ankt a(Object obj3) {
                                    final tsy tsyVar4 = tsy.this;
                                    List list = arrayList2;
                                    final tqy tqyVar2 = tqyVar;
                                    final AtomicInteger atomicInteger2 = atomicInteger;
                                    tqz tqzVar = (tqz) obj3;
                                    if (tqzVar != null && tqzVar.e) {
                                        list.add(tzc.o(tsyVar4.a, tqzVar.g));
                                    }
                                    twv twvVar = tsyVar4.c;
                                    return anii.h(anii.i(twvVar.c.e(tqyVar2), new twu(twvVar, tqyVar2, 3), twvVar.k), new ampg() { // from class: tsw
                                        @Override // defpackage.ampg
                                        public final Object apply(Object obj4) {
                                            tsy tsyVar5 = tsy.this;
                                            AtomicInteger atomicInteger3 = atomicInteger2;
                                            tqy tqyVar3 = tqyVar2;
                                            if (((Boolean) obj4).booleanValue()) {
                                                atomicInteger3.getAndIncrement();
                                                return null;
                                            }
                                            tsyVar5.e.g(1036);
                                            typ.d("%s: Unsubscribe from file %s failed!", "ExpirationHandler", tqyVar3);
                                            return null;
                                        }
                                    }, tsyVar4.j);
                                }
                            }, tsyVar3.j));
                        } else {
                            arrayList3.add(anii.h(tsyVar3.c.b(tqyVar), new tvu(arrayList, 1), tsyVar3.j));
                        }
                    }
                    return anlz.j(arrayList3).a(new Callable() { // from class: tsu
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            tsy tsyVar4 = tsy.this;
                            AtomicInteger atomicInteger2 = atomicInteger;
                            List<Uri> list = arrayList2;
                            List list2 = arrayList;
                            if (atomicInteger2.get() > 0) {
                                tsyVar4.e.i(4, atomicInteger2.get());
                            }
                            Uri m = tzc.m(tsyVar4.a, tsyVar4.h);
                            int i2 = 0;
                            for (Uri uri : list) {
                                try {
                                    tsyVar4.g.f(uri);
                                    i2++;
                                    tsyVar4.e.g(1086);
                                } catch (IOException e) {
                                    tsyVar4.e.g(1076);
                                    typ.f(e, "%s: Failed to release unaccounted file!", "ExpirationHandler");
                                }
                            }
                            int i3 = typ.a;
                            list2.add(tzc.n(tsyVar4.a, tsyVar4.h));
                            int a = tsyVar4.a(m, list2);
                            if (a > 0) {
                                tsyVar4.e.i(5, a);
                            }
                            if (i2 > 0) {
                                tsyVar4.e.i(8, i2);
                                return null;
                            }
                            return null;
                        }
                    }, tsyVar3.j);
                }
            }, tsyVar2.j);
        } else if (i == 2) {
            tsy tsyVar3 = this.a;
            Void r13 = (Void) obj;
            return anii.i(anii.i(tsyVar3.b.c(), new tsx(tsyVar3, 4), tsyVar3.j), new tsx(tsyVar3, 1), tsyVar3.j);
        } else if (i == 3) {
            tsy tsyVar4 = this.a;
            Void r132 = (Void) obj;
            return anii.i(anii.i(tsyVar4.b.c(), new tsx(tsyVar4, 5), tsyVar4.j), new tsx(tsyVar4, 2), tsyVar4.j);
        } else if (i == 4) {
            final tsy tsyVar5 = this.a;
            final HashSet hashSet = new HashSet();
            final ArrayList arrayList = new ArrayList();
            for (Pair pair : (List) obj) {
                arrayList.add((tqm) pair.second);
            }
            return anii.h(tsyVar5.b.e(), new ampg() { // from class: tsv
                @Override // defpackage.ampg
                public final Object apply(Object obj2) {
                    tsy tsyVar6 = tsy.this;
                    List<tqm> list = arrayList;
                    Set set2 = hashSet;
                    list.addAll((List) obj2);
                    for (tqm tqmVar : list) {
                        for (tqk tqkVar : tqmVar.n) {
                            Context context = tsyVar6.a;
                            int b = tqn.b(tqmVar.i);
                            if (b == 0) {
                                b = 1;
                            }
                            trv trvVar = tsyVar6.i;
                            aopa createBuilder = tqy.a.createBuilder();
                            String g = tzc.g(tqkVar);
                            tvg tvgVar = tvg.NEW_FILE_KEY;
                            int ordinal = twx.b(context, trvVar).ordinal();
                            if (ordinal == 0) {
                                String str = tqkVar.d;
                                createBuilder.copyOnWrite();
                                tqy tqyVar = (tqy) createBuilder.instance;
                                str.getClass();
                                tqyVar.b = 1 | tqyVar.b;
                                tqyVar.c = str;
                                int i2 = tqkVar.e;
                                createBuilder.copyOnWrite();
                                tqy tqyVar2 = (tqy) createBuilder.instance;
                                tqyVar2.b |= 2;
                                tqyVar2.d = i2;
                                createBuilder.copyOnWrite();
                                tqy tqyVar3 = (tqy) createBuilder.instance;
                                g.getClass();
                                tqyVar3.b |= 4;
                                tqyVar3.e = g;
                                createBuilder.copyOnWrite();
                                tqy tqyVar4 = (tqy) createBuilder.instance;
                                tqyVar4.f = b - 1;
                                tqyVar4.b |= 8;
                            } else if (ordinal == 1) {
                                String str2 = tqkVar.d;
                                createBuilder.copyOnWrite();
                                tqy tqyVar5 = (tqy) createBuilder.instance;
                                str2.getClass();
                                tqyVar5.b = 1 | tqyVar5.b;
                                tqyVar5.c = str2;
                                int i3 = tqkVar.e;
                                createBuilder.copyOnWrite();
                                tqy tqyVar6 = (tqy) createBuilder.instance;
                                tqyVar6.b = 2 | tqyVar6.b;
                                tqyVar6.d = i3;
                                createBuilder.copyOnWrite();
                                tqy tqyVar7 = (tqy) createBuilder.instance;
                                g.getClass();
                                tqyVar7.b |= 4;
                                tqyVar7.e = g;
                                createBuilder.copyOnWrite();
                                tqy tqyVar8 = (tqy) createBuilder.instance;
                                tqyVar8.f = b - 1;
                                tqyVar8.b |= 8;
                                if ((tqkVar.b & 32) != 0) {
                                    awxs awxsVar = tqkVar.h;
                                    if (awxsVar == null) {
                                        awxsVar = awxs.a;
                                    }
                                    createBuilder.copyOnWrite();
                                    tqy tqyVar9 = (tqy) createBuilder.instance;
                                    awxsVar.getClass();
                                    tqyVar9.g = awxsVar;
                                    tqyVar9.b |= 16;
                                }
                            } else if (ordinal == 2) {
                                createBuilder.copyOnWrite();
                                tqy tqyVar10 = (tqy) createBuilder.instance;
                                g.getClass();
                                tqyVar10.b |= 4;
                                tqyVar10.e = g;
                                createBuilder.copyOnWrite();
                                tqy tqyVar11 = (tqy) createBuilder.instance;
                                tqyVar11.f = b - 1;
                                tqyVar11.b |= 8;
                            }
                            set2.add((tqy) createBuilder.mo39build());
                        }
                    }
                    return set2;
                }
            }, tsyVar5.j);
        } else if (i == 5) {
            final tsy tsyVar6 = this.a;
            ArrayList arrayList2 = new ArrayList();
            for (Pair pair2 : (List) obj) {
                tqv tqvVar = (tqv) pair2.first;
                tqm tqmVar = (tqm) pair2.second;
                Long valueOf = Long.valueOf(tzc.c(tqmVar));
                String str = tqmVar.d;
                int i2 = typ.a;
                if (tzc.j(valueOf.longValue(), tsyVar6.f)) {
                    tsyVar6.e.h(1051, tqmVar.d, tqmVar.f, tqmVar.r, tqmVar.s);
                    String str2 = tqmVar.d;
                    arrayList2.add(tqvVar);
                    if (tzc.k(tqmVar)) {
                        tzc.h(tsyVar6.a, tsyVar6.h, tqmVar, tsyVar6.g);
                    }
                }
            }
            return anii.h(tsyVar6.b.j(arrayList2), new ampg() { // from class: tsq
                @Override // defpackage.ampg
                public final Object apply(Object obj2) {
                    tsy tsyVar7 = tsy.this;
                    if (!((Boolean) obj2).booleanValue()) {
                        tsyVar7.e.g(1036);
                        typ.c("%s: Failed to remove expired groups!", "ExpirationHandler");
                        return null;
                    }
                    return null;
                }
            }, tsyVar6.j);
        } else {
            final tsy tsyVar7 = this.a;
            final ArrayList arrayList3 = new ArrayList();
            for (tqm tqmVar2 : (List) obj) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                tql tqlVar = tqmVar2.c;
                if (tqlVar == null) {
                    tqlVar = tql.a;
                }
                if (tzc.j(Math.min(timeUnit.toMillis(tqlVar.c), tzc.c(tqmVar2)), tsyVar7.f)) {
                    tsyVar7.e.h(1052, tqmVar2.d, tqmVar2.f, tqmVar2.r, tqmVar2.s);
                    if (tzc.k(tqmVar2)) {
                        tzc.h(tsyVar7.a, tsyVar7.h, tqmVar2, tsyVar7.g);
                    }
                } else {
                    arrayList3.add(tqmVar2);
                }
            }
            return anii.i(tsyVar7.b.k(), new anir() { // from class: tsr
                @Override // defpackage.anir
                public final ankt a(Object obj2) {
                    tsy tsyVar8 = tsy.this;
                    Void r3 = (Void) obj2;
                    return anii.i(tsyVar8.b.m(arrayList3), new tsx(tsyVar8), tsyVar8.j);
                }
            }, tsyVar7.j);
        }
    }
}
