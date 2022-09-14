package defpackage;
/* compiled from: PG */
/* renamed from: zhd  reason: default package */
/* loaded from: classes7.dex */
public abstract class zhd implements zbl {
    private static final Runnable a = deic.a;

    public static zhc i() {
        zgi zgiVar = new zgi();
        Runnable runnable = a;
        zgiVar.c(runnable);
        zgiVar.d(runnable);
        return zgiVar;
    }

    @Override // defpackage.zbl
    public final cqkl a() {
        g().run();
        return cqkl.a;
    }

    @Override // defpackage.zbl
    public final cqkl b() {
        h().run();
        return cqkl.a;
    }

    @Override // defpackage.zbl
    @dzsi
    public abstract cqtd c();

    @Override // defpackage.zbl
    @dzsi
    public abstract cqsn d();

    @Override // defpackage.zbl
    @dzsi
    public abstract cqsn e();

    @Override // defpackage.zbl
    @dzsi
    public abstract cjtd f();

    public abstract Runnable g();

    public abstract Runnable h();

    @Override // defpackage.zbq
    public final Boolean r() {
        return Boolean.TRUE;
    }

    @Override // defpackage.zbq
    public abstract cjtd s();
}
