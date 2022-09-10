package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cmto  reason: default package */
/* loaded from: classes5.dex */
public final class cmto extends apk<Void> implements cnss {
    private final Semaphore i;
    private final Set<GoogleApiClient> j;

    public cmto(Context context, Set<GoogleApiClient> set) {
        super(context);
        this.i = new Semaphore(0);
        this.j = set;
    }

    @Override // defpackage.apk
    public final /* bridge */ /* synthetic */ Void c() {
        int i = 0;
        for (GoogleApiClient googleApiClient : this.j) {
            if (googleApiClient.maybeSignIn(this)) {
                i++;
            }
        }
        try {
            this.i.tryAcquire(i, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // defpackage.apl
    protected final void i() {
        this.i.drainPermits();
        a();
    }

    @Override // defpackage.cnss
    public final void r() {
        this.i.release();
    }
}
