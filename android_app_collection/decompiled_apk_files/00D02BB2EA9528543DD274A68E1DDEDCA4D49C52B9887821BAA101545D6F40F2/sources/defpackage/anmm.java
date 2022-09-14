package defpackage;
/* compiled from: PG */
/* renamed from: anmm  reason: default package */
/* loaded from: classes2.dex */
final class anmm implements btzi<duzc, duzk> {
    final /* synthetic */ aogb a;
    final /* synthetic */ dbsg b;
    final /* synthetic */ anmn c;

    public anmm(anmn anmnVar, aogb aogbVar, dbsg dbsgVar) {
        this.c = anmnVar;
        this.a = aogbVar;
        this.b = dbsgVar;
    }

    private final void c() {
        anmn anmnVar = new anmn(this.c.b);
        this.c.b.b.d(this.a, this.b, anmnVar);
        anmnVar.a();
    }

    @Override // defpackage.btzi
    public final void QY(btzr<duzc> btzrVar, btzy btzyVar) {
        dcdc<btzi<duzc, duzk>> a = this.c.b.b.a(this.a, this.b);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            a.get(i).QY(btzrVar, btzyVar);
        }
        for (anmo anmoVar : this.c.b.c) {
            anmoVar.b(this.a);
        }
        c();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<duzc> btzrVar, duzk duzkVar) {
        duzk duzkVar2 = duzkVar;
        dcdc<btzi<duzc, duzk>> a = this.c.b.b.a(this.a, this.b);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            a.get(i).QZ(btzrVar, duzkVar2);
        }
        for (anmo anmoVar : this.c.b.c) {
            aogb aogbVar = this.a;
            int a2 = duzj.a(duzkVar2.b);
            if (a2 == 0) {
                a2 = 5;
            }
            anmoVar.g(aogbVar, a2);
        }
        c();
    }
}
