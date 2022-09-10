package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: defk  reason: default package */
/* loaded from: classes6.dex */
final class defk implements Callable {
    final /* synthetic */ defs a;
    final /* synthetic */ defw b;

    public defk(defw defwVar, defs defsVar) {
        this.b = defwVar;
        this.a = defsVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.a(this.b.b.a);
    }

    public final String toString() {
        return this.a.toString();
    }
}
