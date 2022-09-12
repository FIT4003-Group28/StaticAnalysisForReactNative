package defpackage;

import java.math.RoundingMode;
/* compiled from: PG */
/* renamed from: deim  reason: default package */
/* loaded from: classes6.dex */
abstract class deim<L> extends dein<L> {
    final int a;

    public deim() {
        dbsk.b(true, "Stripes must be positive");
        this.a = (1 << deay.b(4, RoundingMode.CEILING)) - 1;
    }

    @Override // defpackage.dein
    public final L c(Object obj) {
        int hashCode = obj.hashCode();
        int i = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        return a(((i >>> 4) ^ ((i >>> 7) ^ i)) & this.a);
    }
}
