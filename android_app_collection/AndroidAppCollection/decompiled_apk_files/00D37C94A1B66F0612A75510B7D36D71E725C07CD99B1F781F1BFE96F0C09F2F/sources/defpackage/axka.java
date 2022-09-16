package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: axka  reason: default package */
/* loaded from: classes2.dex */
public final class axka extends axjz {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axka axkaVar = (axka) obj;
        ByteBuffer byteBuffer = this.b;
        return byteBuffer == null ? axkaVar.b == null : byteBuffer.equals(axkaVar.b);
    }

    public final int hashCode() {
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }

    public final axki k() {
        return (axki) this.a;
    }
}
