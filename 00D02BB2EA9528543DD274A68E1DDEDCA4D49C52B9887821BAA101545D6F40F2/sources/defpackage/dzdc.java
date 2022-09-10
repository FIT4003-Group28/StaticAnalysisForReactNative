package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dzdc  reason: default package */
/* loaded from: classes6.dex */
public final class dzdc<T> extends dzcw<T, T> {
    final TimeUnit b;
    final dyzz c;

    public dzdc(dyzv<T> dyzvVar, TimeUnit timeUnit, dyzz dyzzVar) {
        super(dyzvVar);
        this.b = timeUnit;
        this.c = dyzzVar;
    }

    @Override // defpackage.dyzu
    public final void g(dyzw<? super T> dyzwVar) {
        this.a.f(new dzdb(new dzfx(dyzwVar), this.b, this.c.a()));
    }
}
