package defpackage;
/* compiled from: PG */
/* renamed from: cyod  reason: default package */
/* loaded from: classes5.dex */
final class cyod extends dyga {
    final /* synthetic */ cyoe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyod(cyoe cyoeVar, dyew dyewVar) {
        super(dyewVar);
        this.a = cyoeVar;
    }

    @Override // defpackage.dyir, defpackage.dyew
    public final void b(dyjb dyjbVar, dyhw dyhwVar) {
        try {
            dcdc<Long> b = this.a.a.b();
            dcdc<Long> c = this.a.a.c();
            long j = -1;
            this.a.b.b = b.isEmpty() ? -1L : ((Long) dcft.s(b)).longValue();
            cylv cylvVar = this.a.b;
            if (!c.isEmpty()) {
                j = ((Long) dcft.s(c)).longValue();
            }
            cylvVar.c = j;
            cyoe cyoeVar = this.a;
            cyoeVar.b.d = cyoeVar.a.a();
        } finally {
            super.b(dyjbVar, dyhwVar);
        }
    }
}
