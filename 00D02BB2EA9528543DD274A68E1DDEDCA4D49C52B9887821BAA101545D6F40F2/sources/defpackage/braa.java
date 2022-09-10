package defpackage;
/* compiled from: PG */
/* renamed from: braa  reason: default package */
/* loaded from: classes4.dex */
final class braa implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ cjqm b;
    final /* synthetic */ brab c;

    public braa(brab brabVar, String str, cjqm cjqmVar) {
        this.c = brabVar;
        this.a = str;
        this.b = cjqmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fd K = this.c.K();
        if (!(K instanceof bxma) || !((bxma) K).bw(this.a, this.b)) {
            brab brabVar = this.c;
            dwim bZ = dwir.R.bZ();
            String str = this.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwir dwirVar = (dwir) bZ.b;
            str.getClass();
            dwirVar.a |= 1;
            dwirVar.c = str;
            cjsb cjsbVar = new cjsb();
            cjsbVar.i(dtyi.cW);
            cjsbVar.f(this.b.a().f());
            dnqh a = cjsbVar.a();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwir dwirVar2 = (dwir) bZ.b;
            a.getClass();
            dwirVar2.s = a;
            dwirVar2.a |= 33554432;
            iqy iqyVar = new iqy();
            iqyVar.d();
            brabVar.m(bZ, iqyVar);
        }
    }
}
