package defpackage;
/* compiled from: PG */
/* renamed from: tuo  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class tuo implements anir {
    public final /* synthetic */ tuu a;
    private final /* synthetic */ int b;

    public /* synthetic */ tuo(tuu tuuVar) {
        this.a = tuuVar;
    }

    public /* synthetic */ tuo(tuu tuuVar, int i) {
        this.b = i;
        this.a = tuuVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        int i = this.b;
        if (i == 0) {
            tuu tuuVar = this.a;
            return anii.i(tuuVar.n(tuuVar.a.e()), new tum(tuuVar, (tzb) obj, 3), tuuVar.b);
        } else if (i == 1) {
            tuu tuuVar2 = this.a;
            return anii.i(tuuVar2.n(tuuVar2.a.b()), new tum(tuuVar2, (tzb) obj, 2), tuuVar2.b);
        } else {
            tuu tuuVar3 = this.a;
            return anii.i(tuuVar3.n(tuuVar3.a.k()), new tum(tuuVar3, (tzb) obj, 6), tuuVar3.b);
        }
    }
}
