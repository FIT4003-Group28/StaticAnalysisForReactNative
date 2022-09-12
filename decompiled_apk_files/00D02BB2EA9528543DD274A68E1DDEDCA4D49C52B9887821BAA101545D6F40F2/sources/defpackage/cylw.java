package defpackage;
/* compiled from: PG */
/* renamed from: cylw  reason: default package */
/* loaded from: classes5.dex */
public final class cylw extends Exception {
    public final int a;

    public cylw(int i, Throwable th) {
        super(th);
        this.a = i;
    }

    public cylw() {
        super("RPC Loader not found.");
        this.a = 5;
    }

    public final cyes a() {
        int i = this.a;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                return cyes.FAILED_TIMEOUT;
            case 1:
                return cyes.FAILED_INTERRUPTED;
            case 2:
                return cyes.FAILED_CANCELED;
            case 3:
                return cyes.FAILED_REMOTE;
            case 4:
                return cyes.FAILED_NOT_IMPLEMENTED;
            case 5:
                return cyes.FAILED_ACCOUNT_NOT_LOGGED_IN;
            case 6:
                return cyes.FAILED_HTTP_SERVER_ERROR;
            case 7:
                return cyes.FAILED_NETWORK;
            default:
                return cyes.FAILED_UNKNOWN;
        }
    }
}
