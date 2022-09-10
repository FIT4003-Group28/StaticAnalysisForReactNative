package defpackage;
/* compiled from: PG */
/* renamed from: cfkm  reason: default package */
/* loaded from: classes4.dex */
public class cfkm implements cfhj {
    private final gga a;
    private final dlnd b;
    @dzsi
    private final Runnable c;

    public cfkm(gga ggaVar, dlnd dlndVar, @dzsi Runnable runnable) {
        this.a = ggaVar;
        this.b = dlndVar;
        this.c = runnable;
    }

    @Override // defpackage.cfhj
    public String a() {
        return this.b.a;
    }

    @Override // defpackage.cfhj
    public String b() {
        return this.b.b;
    }

    @Override // defpackage.cfhj
    public cqkl c() {
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
        return cqkl.a;
    }

    @Override // defpackage.cfhj
    public cqkl d() {
        this.a.g().e();
        return cqkl.a;
    }

    @Override // defpackage.cfhj
    public Boolean e() {
        return Boolean.valueOf(this.c != null);
    }
}
