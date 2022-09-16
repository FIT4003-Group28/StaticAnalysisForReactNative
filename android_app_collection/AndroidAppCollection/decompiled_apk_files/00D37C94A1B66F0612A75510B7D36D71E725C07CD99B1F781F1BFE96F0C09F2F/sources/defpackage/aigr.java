package defpackage;

import android.util.Pair;
/* compiled from: PG */
/* renamed from: aigr  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aigr implements ayqb {
    public final /* synthetic */ aigt a;
    private final /* synthetic */ int b;

    public /* synthetic */ aigr(aigt aigtVar) {
        this.a = aigtVar;
    }

    public /* synthetic */ aigr(aigt aigtVar, int i) {
        this.b = i;
        this.a = aigtVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        aijy[] aijyVarArr;
        long j;
        aijy aijyVar;
        int i = this.b;
        if (i == 0) {
            ahgg ahggVar = (ahgg) obj;
            this.a.b();
        } else if (i == 1) {
            aigt aigtVar = this.a;
            Pair pair = (Pair) obj;
            String str = aigtVar.a;
            if (str == null || !str.equals(((ajff) pair.first).Z())) {
                aigtVar.a = ((ajff) pair.first).Z();
                aigtVar.c = (ajff) pair.first;
                aigtVar.b = ((ajff) pair.first).q();
                aigtVar.i.clear();
            }
            ahgb ahgbVar = (ahgb) pair.second;
            ahfz d = ahgbVar.d();
            ahga e = ahgbVar.e();
            if (!ahgbVar.g()) {
                return;
            }
            if (aigtVar.g) {
                aigtVar.g = false;
                if ((d == null || e == null) && (aijyVar = aigtVar.j) != null && !aijyVar.a.equals(aigtVar.a)) {
                    aijy aijyVar2 = aigtVar.j;
                    long j2 = aijyVar2.c;
                    String str2 = aijyVar2.a;
                    aigtVar.c(str2, aigtVar.a, j2, false, true);
                    aigtVar.c(aigtVar.a, str2, ahgbVar.c(), true, true);
                    aigtVar.j = null;
                }
            }
            if (d == null || e == null) {
                return;
            }
            aeui aeuiVar = e.a;
            if (aeuiVar != null && e.b == null) {
                j = e.c.c;
                e.b = e.b(aeuiVar, j);
            }
            for (aijy aijyVar3 : e.b) {
                if (!aigtVar.i.containsKey(aijyVar3.a)) {
                    if (!aigtVar.d(aijyVar3.a)) {
                        aigs aigsVar = new aigs(aigtVar, aijyVar3.a, aijyVar3.b, aijyVar3.c);
                        aigtVar.f.c(aigsVar);
                        aigtVar.i.put(aijyVar3.a, aigsVar);
                    }
                } else {
                    aigs aigsVar2 = (aigs) aigtVar.i.get(aijyVar3.a);
                    if (aigsVar2 != null) {
                        aigtVar.f.f(aigsVar2, aijyVar3.c);
                    }
                }
            }
            aeso a = d.a();
            if (a == null || a.b != 2) {
                return;
            }
            aigtVar.f.c(new aigs(aigtVar, aigtVar.a, e.a() + 1, e.a() + 1));
        } else {
            if (i != 2) {
                aigt aigtVar2 = this.a;
                ahic ahicVar = (ahic) obj;
                aiha aihaVar = aigtVar2.e;
                ajff a2 = ahicVar.a();
                a2.getClass();
                azqb azqbVar = aihaVar.a;
                aijh aijhVar = (aijh) aihaVar.b.get();
                aijhVar.getClass();
                aigtVar2.h = new aigz(a2, azqbVar, aijhVar);
                aigz aigzVar = aigtVar2.h;
                aigzVar.a.d(aigzVar.g.Z(new aigx(aigzVar, 11)));
                aigtVar2.d = ahicVar.a().i();
                aigtVar2.f = ahicVar.a().n();
                aigtVar2.b();
                return;
            }
            aigt aigtVar3 = this.a;
            ahgj ahgjVar = (ahgj) obj;
            ajfq ajfqVar = aigtVar3.b;
            if (ajfqVar == null) {
                return;
            }
            aigtVar3.g = true;
            ajfp n = ajfqVar.n(ahgjVar.b());
            aigtVar3.j = new aijy(n != null ? n.e : aigtVar3.a, ahgjVar.b(), ahgjVar.b());
        }
    }
}
