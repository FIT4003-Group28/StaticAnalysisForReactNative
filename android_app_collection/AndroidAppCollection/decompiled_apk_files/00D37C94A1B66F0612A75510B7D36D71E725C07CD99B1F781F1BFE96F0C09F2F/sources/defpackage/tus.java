package defpackage;
/* compiled from: PG */
/* renamed from: tus  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class tus implements anir {
    public final /* synthetic */ tuu a;
    public final /* synthetic */ tqv b;
    private final /* synthetic */ int c;

    public /* synthetic */ tus(tuu tuuVar, tqv tqvVar) {
        this.a = tuuVar;
        this.b = tqvVar;
    }

    public /* synthetic */ tus(tuu tuuVar, tqv tqvVar, int i) {
        this.c = i;
        this.a = tuuVar;
        this.b = tqvVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        int i = this.c;
        if (i == 0) {
            tuu tuuVar = this.a;
            return anii.i(tuuVar.n(tuuVar.a.i(this.b)), new tum(tuuVar, (tzb) obj, 9), tuuVar.b);
        } else if (i == 1) {
            tuu tuuVar2 = this.a;
            return anii.i(tuuVar2.n(tuuVar2.a.g(this.b)), new tum(tuuVar2, (tzb) obj, 8), tuuVar2.b);
        } else {
            tuu tuuVar3 = this.a;
            return anii.i(tuuVar3.n(tuuVar3.a.h(this.b)), new tum(tuuVar3, (tzb) obj, 4), tuuVar3.b);
        }
    }
}
