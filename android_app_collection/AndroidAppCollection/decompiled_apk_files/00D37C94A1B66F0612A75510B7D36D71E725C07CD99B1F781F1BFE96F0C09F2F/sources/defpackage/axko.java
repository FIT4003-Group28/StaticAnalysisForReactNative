package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
@axkh(b = {6})
/* renamed from: axko  reason: default package */
/* loaded from: classes2.dex */
public final class axko extends axkc {
    int a;

    @Override // defpackage.axkc
    public final void a(ByteBuffer byteBuffer) {
        this.a = hy.H(byteBuffer);
    }

    public final void b() {
        this.a = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((axko) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // defpackage.axkc
    public final String toString() {
        return "SLConfigDescriptor{predefined=" + this.a + '}';
    }
}
