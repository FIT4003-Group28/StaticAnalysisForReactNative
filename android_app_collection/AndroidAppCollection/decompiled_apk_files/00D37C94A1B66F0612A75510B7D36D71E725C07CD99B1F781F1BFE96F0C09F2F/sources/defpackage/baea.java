package defpackage;
/* compiled from: PG */
/* renamed from: baea  reason: default package */
/* loaded from: classes2.dex */
public final class baea extends bagj {
    public baea(String str, int i, int i2) {
        super(str, i, i2);
    }

    @Override // defpackage.bagj, org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        int i = this.b;
        if (i == -358 || i == -352) {
            return true;
        }
        return super.immediatelyRetryable();
    }
}
