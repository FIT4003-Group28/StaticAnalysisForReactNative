package defpackage;
/* compiled from: PG */
/* renamed from: bovf  reason: default package */
/* loaded from: classes3.dex */
public final class bovf {
    public final bhat a;
    public final bvjj b;
    @dzsi
    public djgl c;
    @dzsi
    public Runnable d;
    public final ff e;
    public final boxa f;
    public final chhs g;
    public final btvo h;
    public final bhhf i;
    public final cjqq j;

    public bovf(ff ffVar, boxa boxaVar, chht chhtVar, btvo btvoVar, bhhf bhhfVar, cjqq cjqqVar, bhat bhatVar, bvjj bvjjVar) {
        this.e = ffVar;
        this.f = boxaVar;
        this.g = chhtVar.a(dhpj.UNKNOWN_CONTRIBUTION_SOURCE);
        this.h = btvoVar;
        this.i = bhhfVar;
        this.j = cjqqVar;
        this.a = bhatVar;
        this.b = bvjjVar;
    }

    public final void a(djgl djglVar) {
        this.c = djglVar;
        Runnable runnable = this.d;
        if (runnable != null) {
            runnable.run();
            this.d = null;
        }
    }
}
