package defpackage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dylq  reason: default package */
/* loaded from: classes6.dex */
final class dylq implements Runnable {
    final /* synthetic */ dylr a;
    private final long b;

    public dylq(dylr dylrVar, long j) {
        this.a = dylrVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dypf dypfVar = new dypf();
        this.a.e.l(dypfVar);
        long abs = Math.abs(this.b) / TimeUnit.SECONDS.toNanos(1L);
        long abs2 = Math.abs(this.b) % TimeUnit.SECONDS.toNanos(1L);
        StringBuilder sb = new StringBuilder();
        sb.append("deadline exceeded after ");
        if (this.b < 0) {
            sb.append('-');
        }
        sb.append(abs);
        sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        sb.append("s. ");
        sb.append(dypfVar);
        this.a.e.e(dyjb.f.h(sb.toString()));
    }
}
