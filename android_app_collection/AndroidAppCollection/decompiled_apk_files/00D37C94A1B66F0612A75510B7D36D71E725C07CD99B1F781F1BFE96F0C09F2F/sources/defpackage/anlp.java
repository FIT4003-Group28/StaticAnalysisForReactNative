package defpackage;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anlp  reason: default package */
/* loaded from: classes.dex */
public final class anlp extends anks {
    final /* synthetic */ anlq a;
    private final Callable b;

    public anlp(anlq anlqVar, Callable callable) {
        this.a = anlqVar;
        callable.getClass();
        this.b = callable;
    }

    @Override // defpackage.anks
    public final Object a() {
        return this.b.call();
    }

    @Override // defpackage.anks
    public final String b() {
        return this.b.toString();
    }

    @Override // defpackage.anks
    public final void d(Throwable th) {
        this.a.e(th);
    }

    @Override // defpackage.anks
    public final void e(Object obj) {
        this.a.o(obj);
    }

    @Override // defpackage.anks
    public final boolean g() {
        return this.a.isDone();
    }
}
