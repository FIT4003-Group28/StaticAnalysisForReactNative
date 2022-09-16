package defpackage;
/* compiled from: PG */
/* renamed from: ahpq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ahpq implements Runnable {
    public final /* synthetic */ ahpx a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahpq(ahpx ahpxVar, int i) {
        this.b = i;
        this.a = ahpxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            ahyo ahyoVar = this.a.g;
            if (ahyoVar == null) {
                return;
            }
            ahyoVar.e();
        } else if (i == 1) {
            ahpx ahpxVar = this.a;
            aiap aiapVar = ahpxVar.i;
            if (aiapVar == null || ahpxVar.g == null) {
                return;
            }
            aiapVar.a();
            ahpxVar.g.f();
        } else if (i == 2) {
            ahyo ahyoVar2 = this.a.g;
            if (ahyoVar2 == null) {
                return;
            }
            ahyoVar2.f();
        } else {
            ahpx ahpxVar2 = this.a;
            aiap aiapVar2 = ahpxVar2.i;
            if (aiapVar2 == null || ahpxVar2.g == null) {
                return;
            }
            aiapVar2.b();
            ahpxVar2.g.f();
        }
    }
}
