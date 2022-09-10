package defpackage;

import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: aoia  reason: default package */
/* loaded from: classes2.dex */
public class aoia implements aohy {
    private final ache a;
    private final bzqa b;
    private final dehn<cora> c;
    private final boolean d;
    private final anhg e;
    private final aohw f;
    private final aohf g;

    public aoia(ache acheVar, bzqa bzqaVar, aohw aohwVar, bvjj bvjjVar, anhg anhgVar, dehn dehnVar, aohf aohfVar) {
        this.a = acheVar;
        this.b = bzqaVar;
        this.f = aohwVar;
        this.c = dehnVar;
        this.g = aohfVar;
        this.e = anhgVar;
        this.d = bvjjVar.m(bvjk.dK, false);
    }

    @Override // defpackage.aohy
    public Boolean a() {
        return Boolean.valueOf(!this.c.isDone());
    }

    @Override // defpackage.aohy
    public Boolean b() {
        boolean z = false;
        if (!this.c.isDone()) {
            return false;
        }
        try {
            dbsg j = dbsg.j((cora) deha.r(this.c));
            if (j.a() && !((cora) j.b()).e() && ((cora) j.b()).j()) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (ExecutionException unused) {
            return false;
        }
    }

    @Override // defpackage.aohy
    public cqkl c() {
        this.f.a();
        aohz aohzVar = new aohz();
        bzqa bzqaVar = this.b;
        int i = bzqb.LOCATION_HISTORY.d;
        if (bzqaVar.c("timeline")) {
            this.g.a();
        } else {
            aohzVar.a = this.g;
        }
        this.b.a(new int[]{bzqb.LOCATION_HISTORY.d, bzqb.LOCATION_REPORTING.d}, aohzVar, "timeline");
        return cqkl.a;
    }

    @Override // defpackage.aohy
    public cqkl d() {
        this.a.q("android_timeline");
        return cqkl.a;
    }

    @Override // defpackage.aohy
    public cqkl e() {
        this.f.a();
        this.g.a();
        return cqkl.a;
    }

    @Override // defpackage.aohy
    public cqkl f() {
        this.e.m();
        return cqkl.a;
    }

    @Override // defpackage.aohy
    public Boolean g() {
        return Boolean.valueOf(!this.d);
    }
}
