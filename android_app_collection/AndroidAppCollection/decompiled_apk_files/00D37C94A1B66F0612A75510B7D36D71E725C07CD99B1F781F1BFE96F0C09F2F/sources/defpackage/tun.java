package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: tun  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class tun implements anir {
    public final /* synthetic */ tuu a;
    public final /* synthetic */ tzb b;
    public final /* synthetic */ Comparator c;
    private final /* synthetic */ int d;

    public /* synthetic */ tun(tuu tuuVar, tzb tzbVar, Comparator comparator) {
        this.a = tuuVar;
        this.b = tzbVar;
        this.c = comparator;
    }

    public /* synthetic */ tun(tuu tuuVar, tzb tzbVar, Comparator comparator, int i) {
        this.d = i;
        this.a = tuuVar;
        this.b = tzbVar;
        this.c = comparator;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        if (this.d == 0) {
            return this.a.p(this.b, (tzb) obj, this.c, 1092);
        }
        return this.a.p(this.b, (tzb) obj, this.c, 1093);
    }
}
