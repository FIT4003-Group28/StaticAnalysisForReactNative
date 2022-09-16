package defpackage;

import org.chromium.net.QuicException;
/* compiled from: PG */
/* renamed from: bagk  reason: default package */
/* loaded from: classes2.dex */
public final class bagk extends QuicException {
    private final int a;
    private final bagj b;

    public bagk(String str, int i, int i2, int i3) {
        super(str, null);
        this.b = new bagj(str, i, i2);
        this.a = i3;
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return this.b.b;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.b.a;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b.getMessage() + ", QuicDetailedErrorCode=" + this.a;
    }

    @Override // org.chromium.net.QuicException
    public final int getQuicDetailedErrorCode() {
        return this.a;
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        return this.b.immediatelyRetryable();
    }
}
