package defpackage;

import io.grpc.Status;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ayem  reason: default package */
/* loaded from: classes2.dex */
final class ayem implements Runnable {
    final /* synthetic */ ayen a;
    private final long b;

    public ayem(ayen ayenVar, long j) {
        this.a = ayenVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ayhk ayhkVar = new ayhk();
        this.a.e.b(ayhkVar);
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
        sb.append(ayhkVar);
        this.a.e.c(Status.f.a(sb.toString()));
    }
}
