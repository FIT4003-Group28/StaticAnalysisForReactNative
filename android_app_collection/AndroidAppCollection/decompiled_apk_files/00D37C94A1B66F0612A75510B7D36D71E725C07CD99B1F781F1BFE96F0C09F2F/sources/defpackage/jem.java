package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: jem  reason: default package */
/* loaded from: classes3.dex */
public final class jem {
    public final ahcy a;
    public final azqb b;
    public final azqb c;
    public final Context d;
    public final Executor e;
    public final Executor f;

    public jem(ahcy ahcyVar, azqb azqbVar, azqb azqbVar2, Executor executor, Executor executor2, Context context) {
        this.a = ahcyVar;
        this.b = azqbVar;
        this.c = azqbVar2;
        this.d = context;
        this.e = executor;
        this.f = executor2;
    }

    public static /* synthetic */ void a(Throwable th) {
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("Failed to handle the error state.");
        sb.append(valueOf);
        zep.b(sb.toString());
    }

    public final boolean b(agqv agqvVar) {
        try {
            return ((Boolean) ((agss) this.b.get()).c(agqvVar).get(4L, TimeUnit.SECONDS)).booleanValue();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zep.d("Unable to retrieve if a failed download is retryable.", e);
            if (!(e instanceof InterruptedException)) {
                return false;
            }
            Thread.currentThread().interrupt();
            return false;
        }
    }
}
