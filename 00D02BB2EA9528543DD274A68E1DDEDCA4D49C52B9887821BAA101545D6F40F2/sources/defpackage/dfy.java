package defpackage;
/* compiled from: PG */
/* renamed from: dfy  reason: default package */
/* loaded from: classes6.dex */
public abstract class dfy {
    public static final dfy e;
    public static final dcdn<dfmf, dfx> f;

    static {
        dft dftVar = new dft();
        dftVar.e(dfx.DEFAULT);
        dftVar.d(false);
        dftVar.c(true);
        dftVar.b(true);
        e = dftVar.a();
        f = dcdn.m(dfmf.STAIRCASE, dfx.STAIRS, dfmf.ELEVATOR, dfx.ELEVATOR, dfmf.ESCALATOR, dfx.ESCALATOR);
    }

    public static dfw f() {
        return e.e();
    }

    public abstract dfx a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract dfw e();
}
