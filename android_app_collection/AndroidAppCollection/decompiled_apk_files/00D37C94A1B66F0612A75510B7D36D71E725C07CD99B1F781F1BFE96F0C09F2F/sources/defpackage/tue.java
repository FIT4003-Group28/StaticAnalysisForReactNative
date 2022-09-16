package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: tue  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class tue implements anir {
    public final /* synthetic */ tuk a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ tue(tuk tukVar, boolean z) {
        this.a = tukVar;
        this.b = z;
    }

    public /* synthetic */ tue(tuk tukVar, boolean z, int i) {
        this.c = i;
        this.a = tukVar;
        this.b = z;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        if (this.c == 0) {
            final tuk tukVar = this.a;
            final boolean z = this.b;
            ArrayList arrayList = new ArrayList();
            for (final tqv tqvVar : (List) obj) {
                if (!tqvVar.f) {
                    arrayList.add(anii.i(tukVar.d.g(tqvVar), new anir() { // from class: ttb
                        @Override // defpackage.anir
                        public final ankt a(Object obj2) {
                            tuk tukVar2 = tuk.this;
                            boolean z2 = z;
                            tqv tqvVar2 = tqvVar;
                            tqm tqmVar = (tqm) obj2;
                            if (tqmVar != null) {
                                int a = uaw.a(tqmVar.q);
                                boolean z3 = true;
                                if (a == 0 || a == 1) {
                                    tqp tqpVar = tqmVar.l;
                                    if (tqpVar == null) {
                                        tqpVar = tqp.a;
                                    }
                                    int b = trz.b(tqpVar.d);
                                    if (b == 0 || b != 2) {
                                        tqp tqpVar2 = tqmVar.l;
                                        if (tqpVar2 == null) {
                                            tqpVar2 = tqp.a;
                                        }
                                        int b2 = trz.b(tqpVar2.d);
                                        if (b2 != 0 && b2 == 3) {
                                            long c = tukVar2.f.c();
                                            tql tqlVar = tqmVar.c;
                                            if (tqlVar == null) {
                                                tqlVar = tql.a;
                                            }
                                            long j = (c - tqlVar.d) / 1000;
                                            tqp tqpVar3 = tqmVar.l;
                                            if (tqpVar3 == null) {
                                                tqpVar3 = tqp.a;
                                            }
                                            if (j > tqpVar3.e) {
                                                aopa mo52toBuilder = tqmVar.mo52toBuilder();
                                                tqp tqpVar4 = tqmVar.l;
                                                if (tqpVar4 == null) {
                                                    tqpVar4 = tqp.a;
                                                }
                                                aopa mo52toBuilder2 = tqpVar4.mo52toBuilder();
                                                mo52toBuilder2.copyOnWrite();
                                                tqp tqpVar5 = (tqp) mo52toBuilder2.instance;
                                                tqpVar5.d = 1;
                                                tqpVar5.b = 2 | tqpVar5.b;
                                                mo52toBuilder.copyOnWrite();
                                                tqm tqmVar2 = (tqm) mo52toBuilder.instance;
                                                tqp tqpVar6 = (tqp) mo52toBuilder2.mo39build();
                                                tqpVar6.getClass();
                                                tqmVar2.l = tqpVar6;
                                                tqmVar2.b |= 1024;
                                                tqmVar = (tqm) mo52toBuilder.mo39build();
                                            }
                                        }
                                        z3 = false;
                                    }
                                    String str = tqmVar.d;
                                    int i = typ.a;
                                    if (z2 || z3) {
                                        tqp tqpVar7 = tqmVar.l;
                                        if (tqpVar7 == null) {
                                            tqpVar7 = tqp.a;
                                        }
                                        return tukVar2.d(tqvVar2, tqpVar7);
                                    }
                                    return anlz.q(null);
                                }
                            }
                            return anlz.q(null);
                        }
                    }, tukVar.h));
                }
            }
            return anlz.j(arrayList).a(gbb.j, tukVar.h);
        }
        tuk tukVar2 = this.a;
        tqm tqmVar = (tqm) obj;
        return anii.i(tukVar2.k(tqmVar, this.b), new ttf(tqmVar, 2), tukVar2.h);
    }
}
