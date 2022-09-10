package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: dsiv  reason: default package */
/* loaded from: classes6.dex */
final class dsiv implements dews<dsgf, dsgh> {
    private final cwsv b = cwsv.c(dsiy.a, cwsv.a("Autocomplete"));
    private final dcep<String> c = dcmr.a;

    @Override // defpackage.dews
    public final cwsv a() {
        return this.b;
    }

    @Override // defpackage.dews
    public final dewu b() {
        return dsiy.e;
    }

    @Override // defpackage.dews
    public final Set<String> c() {
        return this.c.isEmpty() ? dsiy.e.f : this.c;
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
