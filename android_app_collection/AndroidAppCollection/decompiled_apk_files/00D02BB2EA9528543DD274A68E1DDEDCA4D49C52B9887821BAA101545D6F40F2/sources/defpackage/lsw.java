package defpackage;
/* compiled from: PG */
/* renamed from: lsw  reason: default package */
/* loaded from: classes7.dex */
public final class lsw implements lsv {
    private final String a;
    private final cqtd b;
    private final Runnable c;
    @dzsi
    private final String d;
    @dzsi
    private final noo e;
    @dzsi
    private final cjtd f;
    private boolean g;
    private boolean h;

    public lsw(cqhn cqhnVar, String str, cqtd cqtdVar, Runnable runnable, @dzsi String str2, @dzsi noo nooVar, @dzsi ddho ddhoVar) {
        dbsk.s(str);
        this.a = str;
        dbsk.s(cqtdVar);
        this.b = cqtdVar;
        dbsk.s(runnable);
        this.c = runnable;
        this.d = str2;
        this.e = nooVar;
        this.f = cjtd.a(ddhoVar);
    }

    @Override // defpackage.lsv
    public cqtd a() {
        return this.b;
    }

    @Override // defpackage.lsv
    public cqkl b() {
        boolean z = !c().booleanValue();
        boolean i = i();
        this.c.run();
        noo nooVar = this.e;
        if (nooVar != null && z && i) {
            nooVar.b();
        }
        return cqkl.a;
    }

    @Override // defpackage.lsv
    public Boolean c() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.lsv
    @dzsi
    public cjtd d() {
        return this.f;
    }

    public void e(boolean z) {
        if (this.g == z) {
            return;
        }
        this.g = z;
        cqkx.p(this);
    }

    public void f(boolean z) {
        this.h = z;
    }

    public String g() {
        return this.a;
    }

    @dzsi
    public String h() {
        return this.d;
    }

    public boolean i() {
        return this.h;
    }

    public lsw(cqhn cqhnVar, String str, cqtd cqtdVar, Runnable runnable, @dzsi String str2, @dzsi ddho ddhoVar) {
        this(cqhnVar, str, cqtdVar, runnable, str2, null, ddhoVar);
    }
}
