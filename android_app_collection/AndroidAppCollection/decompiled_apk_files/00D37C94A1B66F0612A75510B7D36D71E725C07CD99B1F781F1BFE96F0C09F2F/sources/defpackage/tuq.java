package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: tuq  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class tuq implements anir {
    public final /* synthetic */ tuu a;
    public final /* synthetic */ List b;
    private final /* synthetic */ int c;

    public /* synthetic */ tuq(tuu tuuVar, List list) {
        this.a = tuuVar;
        this.b = list;
    }

    public /* synthetic */ tuq(tuu tuuVar, List list, int i) {
        this.c = i;
        this.a = tuuVar;
        this.b = list;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        if (this.c == 0) {
            tuu tuuVar = this.a;
            return anii.i(tuuVar.n(tuuVar.a.m(this.b)), new tum(tuuVar, (tzb) obj, 7), tuuVar.b);
        }
        tuu tuuVar2 = this.a;
        return anii.i(tuuVar2.n(tuuVar2.a.j(this.b)), new tum(tuuVar2, (tzb) obj, 5), tuuVar2.b);
    }
}
