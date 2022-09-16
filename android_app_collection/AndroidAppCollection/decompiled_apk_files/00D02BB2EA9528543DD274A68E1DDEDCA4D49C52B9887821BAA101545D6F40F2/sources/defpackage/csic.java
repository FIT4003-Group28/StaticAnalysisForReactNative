package defpackage;
/* compiled from: PG */
/* renamed from: csic  reason: default package */
/* loaded from: classes5.dex */
final class csic implements cshs<csgt> {
    final /* synthetic */ csid a;
    private int b = -1;

    public csic(csid csidVar) {
        this.a = csidVar;
    }

    @Override // defpackage.cshs
    /* renamed from: b */
    public final void a(csgt csgtVar) {
        dbsk.l(csgtVar.d());
        csha cshaVar = csgtVar.a;
        ddxx ddxxVar = ((cshb) cshaVar.b).c;
        if (ddxxVar == null) {
            ddxxVar = ddxx.j;
        }
        dbsk.l((ddxxVar.a & 2048) != 0);
        ddhj b = ddhj.b(((cshb) cshaVar.b).d);
        if (b == null) {
            b = ddhj.VISIBILITY_VISIBLE;
        }
        if (b != ddhj.VISIBILITY_VISIBLE) {
            return;
        }
        int size = this.a.e.size();
        this.a.e.add(csgtVar.b());
        this.a.f.put(size, this.b);
        int i = this.b;
        this.b = size;
        csgtVar.c.d(this);
        this.b = i;
    }
}
