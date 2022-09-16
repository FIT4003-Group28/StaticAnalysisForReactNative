package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
@axkh(b = {20})
/* renamed from: axkn  reason: default package */
/* loaded from: classes2.dex */
public final class axkn extends axkc {
    int a;

    @Override // defpackage.axkc
    public final void a(ByteBuffer byteBuffer) {
        this.a = hy.H(byteBuffer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((axkn) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // defpackage.axkc
    public final String toString() {
        return "ProfileLevelIndicationDescriptor{profileLevelIndicationIndex=" + Integer.toHexString(this.a) + '}';
    }
}
