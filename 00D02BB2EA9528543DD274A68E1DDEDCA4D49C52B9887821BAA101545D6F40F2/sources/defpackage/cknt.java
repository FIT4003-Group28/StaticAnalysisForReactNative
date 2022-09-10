package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cknt  reason: default package */
/* loaded from: classes4.dex */
public final class cknt {
    public static final ckns a = new ckns();
    static final long b = TimeUnit.MINUTES.toMillis(2);
    public final bbuh c;
    public final akfa d;
    public final Executor e;
    public final Executor f;
    public final buti g;
    public final cqat h;

    public cknt(bbuh bbuhVar, akfa akfaVar, Executor executor, Executor executor2, buti butiVar, cqat cqatVar) {
        this.c = bbuhVar;
        this.d = akfaVar;
        this.e = executor;
        this.f = executor2;
        this.g = butiVar;
        this.h = cqatVar;
    }

    public static dbsg<Long> a(dhpf dhpfVar) {
        try {
            return dbsg.i(Long.valueOf(new eaol(dhpfVar.b, dhpfVar.c, dhpfVar.d, dhpfVar.e, dhpfVar.f).a));
        } catch (eapb unused) {
            return dbpy.a;
        }
    }
}
