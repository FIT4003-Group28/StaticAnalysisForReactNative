package defpackage;

import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: dasw  reason: default package */
/* loaded from: classes5.dex */
public final class dasw extends darr {
    public String a;
    private final Object b;
    private final dasy c;

    public dasw(dasy dasyVar, Object obj) {
        super("application/json; charset=UTF-8");
        dbsk.s(dasyVar);
        this.c = dasyVar;
        this.b = obj;
    }

    @Override // defpackage.dauw
    public final void e(OutputStream outputStream) {
        dasy dasyVar = this.c;
        c();
        dasz e = dasyVar.e(outputStream);
        if (this.a != null) {
            e.d();
            e.f(this.a);
        }
        e.p(this.b);
        if (this.a != null) {
            e.e();
        }
        e.a();
    }
}
