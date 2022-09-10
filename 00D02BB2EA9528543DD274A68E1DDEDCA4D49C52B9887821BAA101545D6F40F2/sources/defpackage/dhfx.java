package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: dhfx  reason: default package */
/* loaded from: classes6.dex */
final class dhfx implements dews {
    private final cwsv b = cwsv.c(dhgb.a, cwsv.a("ListContactPeople"));
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
