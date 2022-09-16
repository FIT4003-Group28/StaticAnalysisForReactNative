package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: anmf  reason: default package */
/* loaded from: classes.dex */
public final class anmf {
    public final InputStream a;

    private anmf(InputStream inputStream) {
        this.a = inputStream;
    }

    public static anmf a(byte[] bArr) {
        return new anmf(new ByteArrayInputStream(bArr));
    }
}
