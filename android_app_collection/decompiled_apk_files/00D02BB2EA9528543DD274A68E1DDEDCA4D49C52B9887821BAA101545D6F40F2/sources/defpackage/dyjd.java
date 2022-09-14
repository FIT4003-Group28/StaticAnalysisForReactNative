package defpackage;
/* compiled from: PG */
/* renamed from: dyjd  reason: default package */
/* loaded from: classes6.dex */
public final class dyjd extends RuntimeException {
    private static final long serialVersionUID = 1950934672280720624L;
    public final dyjb a;
    public final dyhw b;
    private final boolean c;

    public dyjd(dyjb dyjbVar) {
        this(dyjbVar, null);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        if (this.c) {
            return super.fillInStackTrace();
        }
        return this;
    }

    public dyjd(dyjb dyjbVar, @dzsi dyhw dyhwVar) {
        super(dyjb.e(dyjbVar), dyjbVar.r);
        this.a = dyjbVar;
        this.b = dyhwVar;
        this.c = true;
        fillInStackTrace();
    }
}
