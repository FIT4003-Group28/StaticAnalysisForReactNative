package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ckk  reason: default package */
/* loaded from: classes2.dex */
final class ckk {
    final ctn a;
    final Executor b;

    public ckk(ctn ctnVar, Executor executor) {
        this.a = ctnVar;
        this.b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ckk) {
            return this.a.equals(((ckk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
