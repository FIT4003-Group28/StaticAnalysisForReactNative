package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bwp  reason: default package */
/* loaded from: classes.dex */
final class bwp {
    final chx a;
    final Executor b;

    public bwp(chx chxVar, Executor executor) {
        this.a = chxVar;
        this.b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bwp) {
            return this.a.equals(((bwp) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
