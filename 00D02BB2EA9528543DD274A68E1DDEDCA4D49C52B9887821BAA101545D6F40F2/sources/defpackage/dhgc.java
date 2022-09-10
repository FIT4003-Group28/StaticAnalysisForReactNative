package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: dhgc  reason: default package */
/* loaded from: classes6.dex */
final class dhgc implements dews<dhef, dheh> {
    private final cwsv b = cwsv.c(dhgd.a, cwsv.a("ListAutocompletions"));
    private final dcep<String> c = dcep.B("https://www.googleapis.com/auth/peopleapi.readonly");

    @Override // defpackage.dews
    public final cwsv a() {
        return this.b;
    }

    @Override // defpackage.dews
    public final dewu b() {
        return dhgd.c;
    }

    @Override // defpackage.dews
    public final Set<String> c() {
        return this.c.isEmpty() ? dhgd.c.d : this.c;
    }

    @Override // defpackage.dews
    public final boolean d() {
        return false;
    }

    @Override // defpackage.dews
    public final int e() {
        return 3;
    }

    public final String toString() {
        return this.b.a;
    }
}
