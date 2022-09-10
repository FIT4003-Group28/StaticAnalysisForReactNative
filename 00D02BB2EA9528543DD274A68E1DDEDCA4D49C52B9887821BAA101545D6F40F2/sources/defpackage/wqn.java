package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: wqn  reason: default package */
/* loaded from: classes7.dex */
final class wqn {
    public final dcep<qdi> a;
    public final dcdc<wpv> b;

    public wqn(Set<qdi> set, Iterable<wpv> iterable) {
        this.a = dcep.K(set);
        this.b = dcdc.q(iterable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(Set<qdi> set) {
        return this.a.containsAll(set);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterable<wpv> b(final Set<qdi> set) {
        return dcft.i(this.b, new dbsl(set) { // from class: wqk
            private final Set a;

            {
                this.a = set;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return this.a.contains(qdi.a(((wpv) obj).e().c()));
            }
        });
    }
}
