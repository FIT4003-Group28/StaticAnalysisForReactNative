package defpackage;

import defpackage.brpv;
import defpackage.dssj;
/* compiled from: PG */
/* renamed from: brpo  reason: default package */
/* loaded from: classes4.dex */
public final class brpo<T extends dssj, K extends brpv> {
    @dzsi
    public String b;
    private final cqat d;
    private final dxio<akfa> e;
    private final btmv f;
    public int a = 0;
    private dbsg<Long> c = dbpy.a;

    public brpo(dxio<akfa> dxioVar, btmv btmvVar, cqat cqatVar) {
        this.d = cqatVar;
        this.e = dxioVar;
        this.f = btmvVar;
    }

    public final brpq<T, K> a() {
        dbsk.m(this.a != 0, "Must specify a maximum number of responses for each type.");
        int i = this.a;
        String str = this.b;
        dbsk.s(str);
        return new brpq<>(i, str, this.e, this.f, this.d, this.c);
    }

    public final void b(long j) {
        this.c = dbsg.i(Long.valueOf(j));
    }
}
