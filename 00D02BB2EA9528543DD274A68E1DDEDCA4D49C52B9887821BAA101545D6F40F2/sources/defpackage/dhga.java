package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: dhga  reason: default package */
/* loaded from: classes6.dex */
final class dhga implements dews<dhek, dhep> {
    private final cwsv b = cwsv.c(dhgb.a, cwsv.a("ListPeopleByKnownId"));
    private final dcep<String> c = dcmr.a;

    @Override // defpackage.dews
    public final cwsv a() {
        return this.b;
    }

    @Override // defpackage.dews
    public final dewu b() {
        return dhgb.g;
    }

    @Override // defpackage.dews
    public final Set<String> c() {
        return this.c.isEmpty() ? dhgb.g.h : this.c;
    }

    @Override // defpackage.dews
    public final boolean d() {
        return false;
    }

    @Override // defpackage.dews
    public final int e() {
        return 2;
    }

    public final String toString() {
        return this.b.a;
    }
}
