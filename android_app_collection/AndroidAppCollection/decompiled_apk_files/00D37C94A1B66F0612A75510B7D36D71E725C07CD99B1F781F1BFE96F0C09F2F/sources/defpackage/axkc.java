package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
@axkh(b = {0})
/* renamed from: axkc  reason: default package */
/* loaded from: classes2.dex */
public abstract class axkc {
    int T;
    int U;
    int V;

    public abstract void a(ByteBuffer byteBuffer);

    public final int c() {
        return this.U + 1 + this.V;
    }

    public String toString() {
        return "BaseDescriptor{tag=" + this.T + ", sizeOfInstance=" + this.U + '}';
    }
}
