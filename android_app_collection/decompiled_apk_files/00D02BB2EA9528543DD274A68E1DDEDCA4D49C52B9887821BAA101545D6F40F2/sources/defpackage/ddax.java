package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ddax  reason: default package */
/* loaded from: classes5.dex */
final class ddax extends dbxi<Integer> {
    final /* synthetic */ dday a;
    private int b = 0;
    private final dbtp c;

    public ddax(dday ddayVar) {
        this.a = ddayVar;
        this.c = dbtp.c(ddayVar.a);
    }

    @Override // defpackage.dbxi
    protected final /* bridge */ /* synthetic */ Integer a() {
        ddbc ddbcVar = this.a.b;
        int i = this.b;
        this.c.d(TimeUnit.MILLISECONDS);
        int f = ddbcVar.f(i);
        if (f < 0) {
            return b();
        }
        this.b++;
        return Integer.valueOf(f);
    }
}
