package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;
/* compiled from: PG */
/* renamed from: aeim  reason: default package */
/* loaded from: classes.dex */
public final class aeim extends atp {
    public aeim(CronetEngine cronetEngine, Executor executor, ampt amptVar, int i, int i2, boolean z, boolean z2) {
        super(cronetEngine, executor, i, i2, z, amptVar, z2);
    }

    @Override // defpackage.atp
    protected final UrlRequest.Builder o(asy asyVar) {
        UrlRequest.Builder o = super.o(asyVar);
        Object obj = asyVar.k;
        if ((obj instanceof aejz) && ((aejz) obj).e) {
            ((ExperimentalUrlRequest.Builder) o).setIdempotency(1);
        }
        return o;
    }
}
