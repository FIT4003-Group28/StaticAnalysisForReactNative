package defpackage;
/* compiled from: PG */
/* renamed from: ahxk  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ahxk implements ayqb {
    public final /* synthetic */ ahxm a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahxk(ahxm ahxmVar, int i) {
        this.b = i;
        this.a = ahxmVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            ahxm ahxmVar = this.a;
            if (!((Boolean) obj).booleanValue()) {
                return;
            }
            ahxmVar.b.a((apzg) ahxmVar.c.c());
            return;
        }
        ahxm ahxmVar2 = this.a;
        ahxmVar2.a.d();
        int i = 0;
        aopu<avio> aopuVar = ((avim) ((avih) obj).getTimedListData().b.get(0)).b;
        if (aopuVar.isEmpty()) {
            return;
        }
        long j = 0;
        for (avio avioVar : aopuVar) {
            long j2 = avioVar.b;
            if (j2 <= j) {
                j2 = 1 + j;
            }
            ahxmVar2.a.e(amxt.e(Long.valueOf(j), Long.valueOf(j2)), new ahxl(i));
            i++;
            j = j2;
        }
        ahxmVar2.a.e(amxt.e(Long.valueOf(j), Long.MAX_VALUE), new ahxl(i));
    }
}
