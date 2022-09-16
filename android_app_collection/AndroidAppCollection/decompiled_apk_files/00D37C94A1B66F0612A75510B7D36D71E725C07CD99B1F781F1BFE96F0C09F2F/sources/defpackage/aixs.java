package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aixs  reason: default package */
/* loaded from: classes.dex */
public final class aixs {
    public final List a;
    public final long b;
    public final aeui c;
    public final aeui d;

    public aixs(aixr aixrVar) {
        this.c = aixrVar.c;
        this.a = aixrVar.a;
        this.d = aixrVar.d;
        Long l = aixrVar.b;
        this.b = l != null ? l.longValue() : 0L;
    }

    public final long a() {
        aeui aeuiVar = this.c;
        Long c = aeuiVar != null ? aeuiVar.c("Sequence-Number") : null;
        if (c != null) {
            return c.longValue();
        }
        return 0L;
    }
}
