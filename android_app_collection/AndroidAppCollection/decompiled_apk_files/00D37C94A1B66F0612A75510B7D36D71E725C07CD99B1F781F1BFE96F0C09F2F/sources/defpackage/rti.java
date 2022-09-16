package defpackage;

import android.util.Log;
import com.google.android.gms.phenotype.Configurations;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: rti  reason: default package */
/* loaded from: classes4.dex */
public final class rti {
    protected final String a;
    protected long b;
    protected final qst c;

    public rti(qst qstVar, String str) {
        this.c = qstVar;
        this.a = str;
        synchronized (qwc.a) {
        }
        this.b = 2000L;
    }

    private final boolean c(int i) {
        if (i <= 0) {
            String valueOf = String.valueOf(this.a);
            Log.w("PhenotypeFlagCommitter", valueOf.length() != 0 ? "No more attempts remaining, giving up for ".concat(valueOf) : new String("No more attempts remaining, giving up for "));
            return false;
        }
        Configurations b = b(this.a);
        if (b == null) {
            return false;
        }
        String str = b.a;
        if (str == null || str.isEmpty()) {
            return true;
        }
        try {
            rwd.e(this.c.A(b.a), this.b, TimeUnit.MILLISECONDS);
            vaz.f(vbi.a(this.a));
            return true;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String str2 = this.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 41);
            sb.append("Committing snapshot for ");
            sb.append(str2);
            sb.append(" failed, retrying");
            Log.w("PhenotypeFlagCommitter", sb.toString(), e);
            return c(i - 1);
        }
    }

    public final void a() {
        c(3);
    }

    protected final Configurations b(String str) {
        try {
            return (Configurations) rwd.e(this.c.C(str, ""), this.b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
            sb.append("Retrieving snapshot for ");
            sb.append(str);
            sb.append(" failed");
            Log.e("PhenotypeFlagCommitter", sb.toString(), e);
            return null;
        }
    }
}
