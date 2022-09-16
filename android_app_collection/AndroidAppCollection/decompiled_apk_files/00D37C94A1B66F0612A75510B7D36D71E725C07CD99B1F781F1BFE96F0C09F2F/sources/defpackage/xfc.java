package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: xfc  reason: default package */
/* loaded from: classes4.dex */
public final class xfc {
    private final xey a;
    private final afvn b;
    private final Executor c;
    private final afzo d;

    public xfc(xey xeyVar, afvn afvnVar, Executor executor, afzo afzoVar) {
        this.a = xeyVar;
        this.b = afvnVar;
        this.c = executor;
        this.d = afzoVar;
    }

    public final xew a() {
        return new xfb(this.b, this.c, this.d, this.a, null);
    }

    public final xew b(aalj aaljVar) {
        return new xfb(this.b, this.c, this.d, this.a, aaljVar);
    }

    public final xew c(aalj aaljVar) {
        return new xfb(this.b, this.c, this.d, this.a, aaljVar);
    }
}
