package defpackage;
/* compiled from: PG */
/* renamed from: kpz  reason: default package */
/* loaded from: classes7.dex */
final class kpz implements afny {
    final /* synthetic */ kqf a;

    public kpz(kqf kqfVar) {
        this.a = kqfVar;
    }

    @Override // defpackage.afny
    public final Runnable a(dwir dwirVar, dwiv dwivVar) {
        return b(dwirVar);
    }

    @Override // defpackage.afny
    public final Runnable b(final dwir dwirVar) {
        return new Runnable(this, dwirVar) { // from class: kpy
            private final kpz a;
            private final dwir b;

            {
                this.a = this;
                this.b = dwirVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                kpz kpzVar = this.a;
                dwir dwirVar2 = this.b;
                kdj kdjVar = kpzVar.a.j;
                String str = dwirVar2.c;
                dpvf b = dpvf.b(dwirVar2.N);
                if (b == null) {
                    b = dpvf.UNKNOWN_CATEGORY;
                }
                kdjVar.f(str, "", str, b, kpzVar.a.i.aa(), false, drph.c, mnz.INTENT_SEARCH_NON_VOICE, dbpy.a, false);
            }
        };
    }
}
