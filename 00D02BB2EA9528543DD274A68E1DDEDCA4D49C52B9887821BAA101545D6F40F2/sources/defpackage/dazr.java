package defpackage;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dazr  reason: default package */
/* loaded from: classes5.dex */
public final class dazr implements Callable {
    final /* synthetic */ dazn a;
    final /* synthetic */ Callable b;

    public dazr(dazn daznVar, Callable callable) {
        this.a = daznVar;
        this.b = callable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        dazn g = dbaa.g(this.a);
        try {
            return this.b.call();
        } finally {
            dbaa.g(g);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("propagating=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
