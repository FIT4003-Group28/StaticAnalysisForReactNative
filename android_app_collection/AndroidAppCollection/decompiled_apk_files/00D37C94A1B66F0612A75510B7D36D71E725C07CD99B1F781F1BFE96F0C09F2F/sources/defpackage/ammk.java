package defpackage;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ammk  reason: default package */
/* loaded from: classes.dex */
public final class ammk implements Callable {
    final /* synthetic */ amlv a;
    final /* synthetic */ Callable b;

    public ammk(amlv amlvVar, Callable callable) {
        this.a = amlvVar;
        this.b = callable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        amlv e = amna.e(this.a);
        try {
            return this.b.call();
        } finally {
            amna.e(e);
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
