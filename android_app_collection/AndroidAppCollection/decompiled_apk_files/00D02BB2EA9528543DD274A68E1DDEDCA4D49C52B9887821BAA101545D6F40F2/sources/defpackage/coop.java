package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
/* compiled from: PG */
/* renamed from: coop  reason: default package */
/* loaded from: classes5.dex */
public final class coop extends cope {
    private static final String a = "coop";
    private final cooo b;
    private final coon c;

    public coop(coon coonVar) {
        this.b = null;
        this.c = coonVar;
    }

    @Override // defpackage.copf
    public final void b(DataHolder dataHolder) {
        cnwc.c(false, "placeEstimator cannot be null");
        if (dataHolder == null) {
            if (Log.isLoggable(a, 6)) {
                new Throwable();
            }
            throw null;
        }
        Bundle bundle = dataHolder.f;
        new cooh(dataHolder, bundle == null ? 100 : bundle.getInt("com.google.android.gms.location.places.PlaceLikelihoodBuffer.SOURCE_EXTRA_KEY"));
        throw null;
    }

    @Override // defpackage.copf
    public final void e(Status status) {
        this.b.p(status);
    }

    @Override // defpackage.copf
    public final void f(DataHolder dataHolder) {
        this.c.p(new cood(dataHolder));
    }

    public coop(cooo coooVar) {
        this.b = coooVar;
        this.c = null;
    }

    @Override // defpackage.copf
    public final void c(DataHolder dataHolder) {
        if (dataHolder == null) {
            if (Log.isLoggable(a, 6)) {
                new Throwable();
            }
            throw null;
        }
        new conx(dataHolder);
        throw null;
    }

    @Override // defpackage.copf
    public final void d(DataHolder dataHolder) {
        if (dataHolder == null) {
            if (Log.isLoggable(a, 6)) {
                new Throwable();
            }
            throw null;
        }
        new copz(dataHolder);
        throw null;
    }
}
