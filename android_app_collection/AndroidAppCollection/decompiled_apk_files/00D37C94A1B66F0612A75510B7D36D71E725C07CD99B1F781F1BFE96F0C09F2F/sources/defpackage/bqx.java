package defpackage;

import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: bqx  reason: default package */
/* loaded from: classes2.dex */
final class bqx implements Runnable {
    private final bqv a;
    private final String b;
    private final ankt c;

    public bqx(bqv bqvVar, String str, ankt anktVar) {
        this.a = bqvVar;
        this.b = str;
        this.c = anktVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            z = ((Boolean) this.c.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            z = true;
        }
        this.a.a(this.b, z);
    }
}
