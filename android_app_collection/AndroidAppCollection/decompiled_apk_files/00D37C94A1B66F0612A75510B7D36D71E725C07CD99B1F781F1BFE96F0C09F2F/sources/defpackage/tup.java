package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: tup  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class tup implements anir {
    public final /* synthetic */ tuu a;
    public final /* synthetic */ Comparator b;
    private final /* synthetic */ int c;

    public /* synthetic */ tup(tuu tuuVar, Comparator comparator) {
        this.a = tuuVar;
        this.b = comparator;
    }

    public /* synthetic */ tup(tuu tuuVar, Comparator comparator, int i) {
        this.c = i;
        this.a = tuuVar;
        this.b = comparator;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        if (this.c == 0) {
            tuu tuuVar = this.a;
            return anii.i(tuuVar.n(tuuVar.a.d()), new tun(tuuVar, (tzb) obj, this.b), tuuVar.b);
        }
        tuu tuuVar2 = this.a;
        return anii.i(tuuVar2.n(tuuVar2.a.c()), new tun(tuuVar2, (tzb) obj, this.b, 1), tuuVar2.b);
    }
}
