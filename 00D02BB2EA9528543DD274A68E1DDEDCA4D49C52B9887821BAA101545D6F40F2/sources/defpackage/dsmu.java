package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: dsmu  reason: default package */
/* loaded from: classes6.dex */
final class dsmu implements dews<dslv, dslz> {
    private final cwsv b = cwsv.c(dsmw.a, cwsv.a("GetSettingText"));
    private final dcep<String> c = dcep.B("https://www.googleapis.com/auth/webhistory");

    @Override // defpackage.dews
    public final cwsv a() {
        return this.b;
    }

    @Override // defpackage.dews
    public final dewu b() {
        return dsmw.j;
    }

    @Override // defpackage.dews
    public final Set<String> c() {
        return this.c.isEmpty() ? dsmw.j.k : this.c;
    }

    @Override // defpackage.dews
    public final boolean d() {
        return true;
    }

    @Override // defpackage.dews
    public final int e() {
        return 2;
    }

    public final String toString() {
        return this.b.a;
    }
}
