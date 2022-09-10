package com.google.geo.ar.arlo.api.jni;

import com.google.geo.ar.arlo.api.exception.ArloStatusException;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class AssetFetcherJni {
    private final dfeg a;

    public AssetFetcherJni(dfeg dfegVar) {
        this.a = dfegVar;
    }

    public byte[] fetch(byte[] bArr) {
        try {
            dsqa c = dsqa.c();
            return this.a.a((dffu) dsqw.cr(dffu.b, bArr, c)).get().bS();
        } catch (dsrm e) {
            throw new ArloStatusException(e.getMessage(), 3);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            throw new ArloStatusException(e2.getMessage(), 10);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause != null) {
                dbue.a(cause, ArloStatusException.class);
            }
            throw new ArloStatusException(e3, drtc.INTERNAL);
        }
    }
}
