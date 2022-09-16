package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: dtcy  reason: default package */
/* loaded from: classes6.dex */
final class dtcy implements dews<dtcr, dtct> {
    private final cwsv b = cwsv.c(dtcz.a, cwsv.a("Lookup"));
    private final dcep<String> c = dcep.B("https://www.googleapis.com/auth/mdh");

    @Override // defpackage.dews
    public final cwsv a() {
        return this.b;
    }

    @Override // defpackage.dews
    public final dewu b() {
        return dtcz.c;
    }

    @Override // defpackage.dews
    public final Set<String> c() {
        return this.c.isEmpty() ? dtcz.c.d : this.c;
    }

    @Override // defpackage.dews
    public final boolean d() {
        return true;
    }

    @Override // defpackage.dews
    public final int e() {
        return 3;
    }

    public final String toString() {
        return this.b.a;
    }
}
