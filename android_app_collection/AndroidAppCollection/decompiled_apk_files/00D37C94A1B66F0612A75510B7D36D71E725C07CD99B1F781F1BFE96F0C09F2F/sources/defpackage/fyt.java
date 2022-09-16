package defpackage;
/* compiled from: PG */
/* renamed from: fyt  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fyt implements ayqb {
    public final /* synthetic */ fyx a;
    private final /* synthetic */ int b;

    public /* synthetic */ fyt(fyx fyxVar, int i) {
        this.b = i;
        this.a = fyxVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            fyx fyxVar = this.a;
            ((Integer) obj).intValue();
            int b = fyxVar.b();
            boolean r = fyxVar.b.r();
            boolean o = fyxVar.b.o();
            boolean z = fyxVar.d;
            boolean z2 = fyxVar.e;
            fyxVar.d = r;
            fyxVar.e = o;
            int i = 1;
            if (b == 1) {
                if (z == fyxVar.d) {
                    b = 1;
                }
                fyxVar.c(fyxVar.g(i));
                fyxVar.e(i);
                return;
            }
            if (b != 2 || z2 == fyxVar.e) {
                return;
            }
            i = b;
            fyxVar.c(fyxVar.g(i));
            fyxVar.e(i);
            return;
        }
        fyx fyxVar2 = this.a;
        fgu fguVar = (fgu) obj;
        if ((fguVar.b & 4) == 0 || fguVar.e == fyxVar2.c.get()) {
            return;
        }
        boolean g = fyxVar2.g(fyxVar2.c.getAndSet(fguVar.e));
        boolean g2 = fyxVar2.g(fguVar.e);
        if (g != g2) {
            fyxVar2.c(g2);
        }
        fyxVar2.e(fguVar.e);
    }
}
