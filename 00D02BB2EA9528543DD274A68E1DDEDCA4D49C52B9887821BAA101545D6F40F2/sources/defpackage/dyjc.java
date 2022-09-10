package defpackage;
/* compiled from: PG */
/* renamed from: dyjc  reason: default package */
/* loaded from: classes6.dex */
public final class dyjc extends Exception {
    private static final long serialVersionUID = -660954903976144640L;
    public final dyjb a;
    private final boolean b;

    public dyjc(dyjb dyjbVar) {
        super(dyjb.e(dyjbVar), dyjbVar.r);
        this.a = dyjbVar;
        this.b = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        if (this.b) {
            return super.fillInStackTrace();
        }
        return this;
    }
}
