package defpackage;

import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: bcv  reason: default package */
/* loaded from: classes3.dex */
final class bcv implements Runnable {
    private final bct a;
    private final String b;
    private final dehn<Boolean> c;

    public bcv(bct bctVar, String str, dehn<Boolean> dehnVar) {
        this.a = bctVar;
        this.b = str;
        this.c = dehnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            z = this.c.get().booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            z = true;
        }
        this.a.a(this.b, z);
    }
}
