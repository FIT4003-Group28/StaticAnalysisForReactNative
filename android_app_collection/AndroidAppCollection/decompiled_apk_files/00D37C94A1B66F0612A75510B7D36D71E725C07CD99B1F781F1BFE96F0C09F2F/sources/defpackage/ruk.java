package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ruk  reason: default package */
/* loaded from: classes4.dex */
final class ruk implements rvf {
    public final rui a;
    public final rvj b;
    private final Executor c;

    public ruk(Executor executor, rui ruiVar, rvj rvjVar) {
        this.c = executor;
        this.a = ruiVar;
        this.b = rvjVar;
    }

    @Override // defpackage.rvf
    public final void a(rve rveVar) {
        this.c.execute(new ruj(this, rveVar));
    }
}
